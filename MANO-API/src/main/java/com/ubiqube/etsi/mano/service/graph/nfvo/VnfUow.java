package com.ubiqube.etsi.mano.service.graph.nfvo;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ubiqube.etsi.mano.dao.mano.InstantiationStatusType;
import com.ubiqube.etsi.mano.dao.mano.NsInstantiatedVnf;
import com.ubiqube.etsi.mano.dao.mano.VimConnectionInformation;
import com.ubiqube.etsi.mano.dao.mano.VnfLcmOpOccs;
import com.ubiqube.etsi.mano.exception.GenericException;
import com.ubiqube.etsi.mano.model.VnfInstantiate;
import com.ubiqube.etsi.mano.service.VnfmInterface;
import com.ubiqube.etsi.mano.service.vim.Vim;

public class VnfUow extends AbstractNsUnitOfWork {

	private static final Logger LOG = LoggerFactory.getLogger(VnfUow.class);

	/** Serial. */
	private static final long serialVersionUID = 1L;

	private final NsInstantiatedVnf resourceHandleEntity;

	private final transient VnfInstantiate request;

	public VnfUow(final NsInstantiatedVnf _resourceHandleEntity, final VnfInstantiate _request, final String _name) {
		super(_resourceHandleEntity, _name);
		resourceHandleEntity = _resourceHandleEntity;
		request = _request;
	}

	@Override
	public String exec(final VimConnectionInformation vimConnectionInformation, final VnfmInterface vnfm, final Vim vim, final Map<String, String> context) {
		final VnfLcmOpOccs res = vnfm.vnfInstatiate(resourceHandleEntity.getVnfInstance(), request, null);
		final VnfLcmOpOccs result = waitLcmCompletion(res, vnfm);
		if (InstantiationStatusType.COMPLETED != result.getOperationState()) {
			throw new GenericException("VNF LCM Failed: " + result.getError().getDetail());
		}
		return res.getId().toString();
	}

	@Override
	public NsUowType getType() {
		return NsUowType.VNF;
	}

	@Override
	public String rollback(final VimConnectionInformation vimConnectionInformation, final VnfmInterface vnfm, final Vim vim, final String resourceId, final Map<String, String> context) {
		final VnfLcmOpOccs lcm = vnfm.vnfTerminate(resourceHandleEntity.getVnfInstance());
		final VnfLcmOpOccs result = waitLcmCompletion(lcm, vnfm);
		if (InstantiationStatusType.COMPLETED != result.getOperationState()) {
			throw new GenericException("VNF LCM Failed: " + result.getError().getDetail());
		}
		return result.getId().toString();
	}

	@Override
	protected String getPrefix() {
		return "vnf";
	}

	/**
	 * XXX We should add a Max wait.
	 *
	 * @param vnfLcmOpOccs
	 * @param vnfm
	 * @return
	 */
	private static VnfLcmOpOccs waitLcmCompletion(final VnfLcmOpOccs vnfLcmOpOccs, final VnfmInterface vnfm) {
		VnfLcmOpOccs tmp = vnfLcmOpOccs;
		InstantiationStatusType state = tmp.getOperationState();
		while ((state == InstantiationStatusType.PROCESSING) || (InstantiationStatusType.STARTING == state)) {
			tmp = vnfm.getVnfLcmOpOccs(vnfLcmOpOccs.getId());
			state = tmp.getOperationState();
			sleepSeconds(1);
		}
		LOG.info("VNF Lcm complete with state: {}", state);
		return tmp;
	}

	private static void sleepSeconds(final long seconds) {
		try {
			Thread.sleep(seconds * 1000L);
		} catch (final InterruptedException e) {
			LOG.warn("Interrupted exception.", e);
			Thread.currentThread().interrupt();
		}
	}
}
