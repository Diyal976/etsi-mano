package com.ubiqube.etsi.mano.repository;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.ubiqube.etsi.mano.model.vnf.sol005.SubscriptionObject;

/**
 * A single way to handle subscrption storage.
 *
 * @author ovi@ubiqube.com
 *
 */
@Repository
public class SubscriptionRepository extends AbstractGenericRepository<SubscriptionObject> {
	private static final String NVFO_DATAFILE_BASE_PATH = "Datafiles/NFVO";
	private static final String REPOSITORY_SUBSCRIPTION_BASE_PATH = NVFO_DATAFILE_BASE_PATH + "/subscriptions";

	@Override
	String getUriForId(String _id) {
		return REPOSITORY_SUBSCRIPTION_BASE_PATH + "/" + _id + ".json";
	}

	@Override
	String setId(SubscriptionObject _entity) {
		final String id = _entity.getSubscriptionsPkgmSubscription().getId();
		if (null == id) {
			_entity.getSubscriptionsPkgmSubscription().setId(UUID.randomUUID().toString());
		}

		return _entity.getSubscriptionsPkgmSubscription().getId();
	}

	@Override
	Class getClazz() {
		return SubscriptionObject.class;
	}

}