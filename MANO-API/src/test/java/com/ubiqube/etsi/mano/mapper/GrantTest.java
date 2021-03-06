package com.ubiqube.etsi.mano.mapper;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ubiqube.etsi.mano.common.v261.model.lcmgrant.Grant;
import com.ubiqube.etsi.mano.common.v261.model.nslcm.ExtManagedVirtualLinkData;
import com.ubiqube.etsi.mano.config.OrikaConfiguration;
import com.ubiqube.etsi.mano.dao.mano.ExtManagedVirtualLinkDataEntity;
import com.ubiqube.etsi.mano.dao.mano.GrantInformationExt;
import com.ubiqube.etsi.mano.dao.mano.GrantResponse;
import com.ubiqube.etsi.mano.dao.mano.GrantVimAssetsEntity;
import com.ubiqube.etsi.mano.dao.mano.GrantsRequest;
import com.ubiqube.etsi.mano.nfvo.v261.OrikaConfigurationNfvo261;
import com.ubiqube.etsi.mano.nfvo.v261.model.lcmgrant.GrantRequest;
import com.ubiqube.etsi.mano.vnfm.v261.OrikaMapperVnfm261;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class GrantTest {
	private final DefaultMapperFactory mapperFactory;
	private final ObjectMapper jsonMapper;
	private final PodamFactoryImpl podam;

	public GrantTest() {
		final OrikaConfiguration orikaConfiguration = new OrikaConfiguration();
		final OrikaMapperVnfm261 orikaVnfm = new OrikaMapperVnfm261();
		final OrikaConfigurationNfvo261 orikaNfvo = new OrikaConfigurationNfvo261();
		mapperFactory = new DefaultMapperFactory.Builder().build();
		orikaConfiguration.configure(mapperFactory);
		orikaVnfm.configure(mapperFactory);
		orikaNfvo.configure(mapperFactory);
		jsonMapper = new ObjectMapper();

		podam = new PodamFactoryImpl();
		podam.getStrategy().addOrReplaceTypeManufacturer(String.class, new UUIDManufacturer());
	}

	@Test
	void testName() throws Exception {
		final MapperFacade mapper = mapperFactory.getMapperFacade();
		final byte[] bytes = Files.readAllBytes(Paths.get("src/test/resources/grant-request.json"));
		// final GrantRequest grantRequest = jsonMapper.readValue(bytes,
		// GrantRequest.class);
		final GrantRequest grantRequest = podam.manufacturePojo(GrantRequest.class);
		final GrantResponse grants = mapper.map(grantRequest, GrantResponse.class);
		System.out.println("" + grants);
		assertEquals(grantRequest.getAdditionalParams().size(), grants.getAdditionalParams().size());
		assertEquals(grantRequest.getAddResources().size(), grants.getAddResources().size());
		// assertEquals(grantRequest.isAutomaticInvocation(),
		// grants.isAutomaticInvocation());
		assertEquals(grantRequest.getFlavourId(), grants.getFlavourId());
		assertEquals(grantRequest.getOperation().toString(), grants.getOperation().toString());
		assertEquals(grantRequest.getRemoveResources().size(), grants.getRemoveResources().size());
		assertEquals(grantRequest.getTempResources().size(), grants.getTempResources().size());
		assertEquals(grantRequest.getUpdateResources().size(), grants.getUpdateResources().size());
		assertEquals(grantRequest.getVnfdId(), grants.getVnfdId());
		assertEquals(grantRequest.getVnfInstanceId(), grants.getVnfInstanceId());
		assertEquals(grantRequest.getVnfLcmOpOccId(), grants.getVnfLcmOpOccId());
	}

	@Test
	void testRequestJson() throws Exception {
		final MapperFacade mapper = mapperFactory.getMapperFacade();
		final GrantRequest gr = podam.manufacturePojo(GrantRequest.class);
		final GrantResponse resp = mapper.map(gr, GrantResponse.class);
		assertEquals(5, resp.getAddResources().size());
		final GrantInformationExt res = resp.getAddResources().iterator().next();
		assertNull(res.getId());
		assertNotNull(res.getVduId());
		assertEquals(5, resp.getVimConnections().size());
		assertNotNull(resp.getVimConnections().iterator().next().getVimId());
	}

	@Test
	void testGrantResponseToGrantResponse() throws Exception {
		final MapperFacade mapper = mapperFactory.getMapperFacade();
		final GrantResponse gr = new GrantResponse();
		gr.setVimAssets(podam.manufacturePojo(GrantVimAssetsEntity.class));
		final Set<GrantInformationExt> addResources = new HashSet<>();

		final ExtManagedVirtualLinkDataEntity extVl = new ExtManagedVirtualLinkDataEntity();
		extVl.setId(UUID.randomUUID());
		extVl.setResourceId("resId");
		extVl.setResourceProviderId("provId");
		extVl.setVimConnectionId("vimId");
		extVl.setVnfVirtualLinkDescId("name");
		gr.addExtManagedVl(extVl);
		final Grant resp = mapper.map(gr, Grant.class);
		System.out.println("" + resp);
		final List<ExtManagedVirtualLinkData> respExtVls = resp.getExtManagedVirtualLinks();
		assertNotNull(respExtVls);
		assertEquals(1, respExtVls.size());
		final ExtManagedVirtualLinkData respExtVl = respExtVls.get(0);
		assertEquals("resId", respExtVl.getResourceId());
		assertEquals("provId", respExtVl.getResourceProviderId());
		assertEquals("vimId", respExtVl.getVimId());
		assertEquals("name", respExtVl.getVmfVirtualLinkDescId());
	}

	@Test
	void testGratRequest() throws Exception {
		final MapperFacade mapper = mapperFactory.getMapperFacade();
		final GrantRequest reqJson = podam.manufacturePojo(GrantRequest.class);
		final GrantsRequest req = mapper.map(reqJson, GrantsRequest.class);
		assertNotNull(req.getVimConstraints());
	}
}
