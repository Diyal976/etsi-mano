package com.ubiqube.etsi.mano.repository;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.ubiqube.etsi.mano.dao.mano.NsdInstance;
import com.ubiqube.etsi.mano.dao.mano.NsdPackage;
import com.ubiqube.etsi.mano.dao.mano.VnfLcmOpOccs;
import com.ubiqube.etsi.mano.dao.mano.VnfPackage;
import com.ubiqube.etsi.mano.exception.GenericException;
import com.ubiqube.etsi.mano.model.nsd.sol005.NsdInfo;
import com.ubiqube.etsi.mano.model.nsd.sol005.PnfdInfo;
import com.ubiqube.etsi.mano.model.nslcm.VnfInstance;
import com.ubiqube.etsi.mano.model.nslcm.sol003.VnfLcmOpOcc;
import com.ubiqube.etsi.mano.model.nslcm.sol005.NsInstance;
import com.ubiqube.etsi.mano.model.nslcm.sol005.NsLcmOpOcc;
import com.ubiqube.etsi.mano.model.vnf.SubscriptionObject;

/**
 * Maybe we should rename this class ;)
 *
 * @author Olivier Vignaud <ovi@ubiqube.com>
 *
 */
public class ClassPathConverter {
	private final Map<Class<?>, String> path = new HashMap<>();

	public ClassPathConverter() {
		path.put(NsdInfo.class, "nsd-package");
		path.put(NsdPackage.class, "nsd-package");
		path.put(NsLcmOpOcc.class, "nsd-lcm-op-occs");
		path.put(NsInstance.class, "nsd-instances");
		path.put(NsdInstance.class, "nsd-instances");

		path.put(VnfPackage.class, "vnf-packages");
		path.put(VnfLcmOpOcc.class, "vnf-lcm-op-occs");
		path.put(VnfLcmOpOccs.class, "vnf-lcm-op-occs");
		path.put(VnfInstance.class, "vnf-instances");
		path.put(com.ubiqube.etsi.mano.dao.mano.VnfInstance.class, "vnf-instances");
		path.put(SubscriptionObject.class, "subscriptions");

		path.put(PnfdInfo.class, "pnfd");

	}

	public Set<Class<?>> getList() {
		return Collections.unmodifiableSet(path.keySet());
	}

	/**
	 *
	 * @param clazz
	 * @return Should be a Path ?
	 */
	public String convert(final Class<?> clazz) {
		final String ret = path.get(clazz);
		if (null == ret) {
			throw new GenericException("Class " + clazz + " doesn't have a path.");
		}
		return ret;
	}
}
