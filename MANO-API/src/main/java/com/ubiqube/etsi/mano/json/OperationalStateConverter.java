package com.ubiqube.etsi.mano.json;

import org.apache.commons.beanutils.Converter;

import com.ubiqube.etsi.mano.exception.GenericException;
import com.ubiqube.etsi.mano.model.nsd.sol005.NsdUsageStateType;
import com.ubiqube.etsi.mano.model.vnf.PackageOnboardingStateType;
import com.ubiqube.etsi.mano.model.vnf.PackageOperationalStateType;
import com.ubiqube.etsi.mano.model.vnf.PackageUsageStateType;

public class OperationalStateConverter implements Converter {

	@Override
	public Object convert(final Class type, final Object value) {
		if (type.equals(PackageOperationalStateType.class)) {
			return PackageOperationalStateType.fromValue((String) value);
		} else if (type.equals(NsdUsageStateType.class)) {
			return NsdUsageStateType.fromValue((String) value);
		} else if (type.equals(PackageOnboardingStateType.class)) {
			return PackageOnboardingStateType.fromValue((String) value);
		} else if (type.equals(PackageUsageStateType.class)) {
			return PackageUsageStateType.fromValue((String) value);
		}
		throw new GenericException("You must define a " + type.getName() + " in " + OperationalStateConverter.class);
	}

}
