package com.ubiqube.etsi.mano.mapper;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import com.ubiqube.etsi.mano.config.OrikaConfiguration;
import com.ubiqube.etsi.mano.dao.mano.AdditionalArtifact;
import com.ubiqube.etsi.mano.dao.mano.NsdPackage;
import com.ubiqube.etsi.mano.dao.mano.NsdPackageVnfPackage;
import com.ubiqube.etsi.mano.dao.mano.VnfPackage;
import com.ubiqube.etsi.mano.dao.mano.common.Checksum;
import com.ubiqube.etsi.mano.nfvo.v261.NsdFactories;
import com.ubiqube.etsi.mano.nfvo.v261.OrikaConfigurationNfvo261;
import com.ubiqube.etsi.mano.nfvo.v261.VnfPackageFactory;
import com.ubiqube.etsi.mano.nfvo.v261.model.nsd.sol005.NsdInfo;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class OrikaTest {

	private final DefaultMapperFactory mapperFactory;

	public OrikaTest() {
		final OrikaConfiguration orikaConfiguration = new OrikaConfiguration();
		final OrikaConfigurationNfvo261 orikaNfvo = new OrikaConfigurationNfvo261();
		mapperFactory = new DefaultMapperFactory.Builder().build();
		orikaConfiguration.configure(mapperFactory);
		orikaNfvo.configure(mapperFactory);
	}

	@Test
	void testMapVnfArtifactChecksum() throws Exception {
		final MapperFacade mapper = mapperFactory.getMapperFacade();

		final VnfPackage vnf = VnfPackageFactory.createVnfPkgInfo(new HashMap<String, String>());
		final AdditionalArtifact additionalArtifactsItem = new AdditionalArtifact();
		final Checksum checksum = new Checksum();
		checksum.setAlgorithm("SHA-512");
		checksum.setHash("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		additionalArtifactsItem.setArtifactPath("/path");
		additionalArtifactsItem.setChecksum(checksum);

		final Set<AdditionalArtifact> additionalArtifacts = new HashSet<>();
		additionalArtifacts.add(additionalArtifactsItem);
		vnf.setAdditionalArtifacts(additionalArtifacts);
		final VnfPackage cnv = mapper.map(vnf, VnfPackage.class);
		System.out.println("" + cnv);
		assertNotNull(cnv.getVnfCompute());
	}

	@Test
	void testListIdObjectId() {
		final NsdInfo nsd = NsdFactories.createNsdInfo();
		nsd.addVnfPkgIdsItem("d5bbe3c1-23a2-4e72-8e00-66cc6ba2061f");
		nsd.addVnfPkgIdsItem("17372129-0590-4532-ace3-7c35eaf0c7c4");
		final NsdPackage nsdDao = mapperFactory.getMapperFacade().map(nsd, NsdPackage.class);
		final Set<NsdPackageVnfPackage> vnfPkgIds = nsdDao.getVnfPkgIds();
		assertEquals(2, vnfPkgIds.size());
	}
}
