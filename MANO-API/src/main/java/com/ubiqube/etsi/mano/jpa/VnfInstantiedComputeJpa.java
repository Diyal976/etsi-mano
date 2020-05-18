package com.ubiqube.etsi.mano.jpa;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.ubiqube.etsi.mano.dao.mano.VnfInstance;
import com.ubiqube.etsi.mano.dao.mano.VnfInstantiedCompute;

public interface VnfInstantiedComputeJpa extends CrudRepository<VnfInstantiedCompute, UUID> {

	int countByVnfInstanceAndVduId(VnfInstance vnfInstance, UUID vduId);

	List<VnfInstantiedCompute> findByVnfInstanceAndVduId(VnfInstance vnfInstance, UUID id);

}
