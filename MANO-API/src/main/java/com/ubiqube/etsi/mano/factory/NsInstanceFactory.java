package com.ubiqube.etsi.mano.factory;

import javax.annotation.Nonnull;

import com.ubiqube.etsi.mano.dao.mano.InstantiationState;
import com.ubiqube.etsi.mano.dao.mano.VnfInstance;
import com.ubiqube.etsi.mano.dao.mano.VnfPackage;

public class NsInstanceFactory {

	private NsInstanceFactory() {
		// Nothing.
	}

	@Nonnull
	public static VnfInstance createNsInstancesNsInstanceVnfInstance(final VnfInstance _vnfInstance, final VnfPackage _vnfPkgInfo) {
		final VnfInstance nsInstancesNsInstanceVnfInstance = new VnfInstance();
		nsInstancesNsInstanceVnfInstance.setId(_vnfInstance.getId());
		nsInstancesNsInstanceVnfInstance.setInstantiationState(InstantiationState.NOT_INSTANTIATED);
		nsInstancesNsInstanceVnfInstance.setVnfdId(_vnfPkgInfo.getVnfdId());
		nsInstancesNsInstanceVnfInstance.setVnfdVersion(_vnfPkgInfo.getVnfdVersion());
		final VnfPackage vnfPackage = new VnfPackage();
		vnfPackage.setId(_vnfPkgInfo.getId());
		nsInstancesNsInstanceVnfInstance.setVnfPkg(vnfPackage);
		return nsInstancesNsInstanceVnfInstance;
	}
}
