package com.ubiqube.etsi.mano.config;

import java.util.Set;

import org.springframework.stereotype.Component;

import com.ubiqube.etsi.mano.dao.mano.GrantInformation;
import com.ubiqube.etsi.mano.dao.mano.NsdInstance;
import com.ubiqube.etsi.mano.dao.mano.NsdPackage;
import com.ubiqube.etsi.mano.dao.mano.SoftwareImage;
import com.ubiqube.etsi.mano.dao.mano.Subscription;
import com.ubiqube.etsi.mano.dao.mano.VnfCompute;
import com.ubiqube.etsi.mano.dao.mano.VnfInstance;
import com.ubiqube.etsi.mano.dao.mano.VnfLcmOpOccs;
import com.ubiqube.etsi.mano.dao.mano.VnfPackage;
import com.ubiqube.etsi.mano.dao.mano.VnfStorage;
import com.ubiqube.etsi.mano.mapper.OffsetDateTimeToDateConverter;
import com.ubiqube.etsi.mano.mapper.OrikaFilterMapper;
import com.ubiqube.etsi.mano.mapper.UuidConverter;
import com.ubiqube.etsi.mano.model.lcmgrant.sol003.ResourceDefinition;
import com.ubiqube.etsi.mano.model.nsd.sol005.NsdInfo;
import com.ubiqube.etsi.mano.model.nslcm.sol003.VnfLcmOpOcc;
import com.ubiqube.etsi.mano.model.nslcm.sol005.NsInstance;
import com.ubiqube.etsi.mano.model.vnf.SubscriptionObject;
import com.ubiqube.etsi.mano.model.vnf.sol005.Checksum;
import com.ubiqube.etsi.mano.model.vnf.sol005.VnfPackageSoftwareImageInfo;
import com.ubiqube.etsi.mano.model.vnf.sol005.VnfPackageSoftwareImageInfo.ContainerFormatEnum;
import com.ubiqube.etsi.mano.model.vnf.sol005.VnfPackageSoftwareImageInfo.DiskFormatEnum;
import com.ubiqube.etsi.mano.model.vnf.sol005.VnfPkgInfo;

import ma.glasnost.orika.CustomMapper;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.converter.ConverterFactory;
import net.rakugakibox.spring.boot.orika.OrikaMapperFactoryConfigurer;

@Component
public class OrikaConfiguration implements OrikaMapperFactoryConfigurer {

	@SuppressWarnings("null")
	@Override
	public void configure(final MapperFactory orikaMapperFactory) {
		orikaMapperFactory.classMap(NsdInfo.class, NsdPackage.class)
				.field("vnfPkgIds{}", "vnfPkgIds{id}")
				.field("pnfdInfoIds{}", "pnfdInfoIds{id}")
				.field("nestedNsdInfoIds{}", "nestedNsdInfoIds{id}")
				.field("userDefinedData{key}", "userDefinedData{name}")
				.field("userDefinedData{value}", "userDefinedData{value}")
				.byDefault()
				.register();
		orikaMapperFactory.classMap(com.ubiqube.etsi.mano.model.nslcm.VnfInstance.class, VnfInstance.class)
				.field("vnfPkgId", "vnfPkg.id")
				.field("vnfConfigurableProperties{key}", "vnfConfigurableProperties{key}")
				.field("vnfConfigurableProperties{value}", "vnfConfigurableProperties{value}")

				.field("metadata{key}", "metadata{key}")
				.field("metadata{value}", "metadata{value}")

				.field("extensions{key}", "extensions{key}")
				.field("extensions{value}", "extensions{value}")
				.byDefault()
				.register();

		orikaMapperFactory.classMap(VnfPackage.class, VnfPkgInfo.class)
				.byDefault()
				.customize(new CustomMapper<VnfPackage, VnfPkgInfo>() {
					@Override
					public void mapAtoB(final VnfPackage a, final VnfPkgInfo b, final MappingContext context) {
						// Remap Images
						final Set<VnfCompute> vnfc = a.getVnfCompute();
						if (null != vnfc) {
							vnfc.forEach(x -> {
								final SoftwareImage img = x.getSoftwareImage();
								if (null != img) {
									b.addSoftwareImagesItem(mapSoftwareImage(img));
								}
							});
						}
						final Set<VnfStorage> storage = a.getVnfStorage();
						if (null != storage) {
							storage.forEach(x -> {
								final SoftwareImage img = x.getSoftwareImage();
								if (null != img) {
									b.addSoftwareImagesItem(mapSoftwareImage(img));
								}
							});
						}

					}

					private VnfPackageSoftwareImageInfo mapSoftwareImage(final SoftwareImage img) {
						final VnfPackageSoftwareImageInfo ret = new VnfPackageSoftwareImageInfo();
						ret.setChecksum(mapChecksum(img.getChecksum()));
						if (null != img.getContainerFormat()) {
							ret.setContainerFormat(ContainerFormatEnum.fromValue(img.getContainerFormat()));
						}
						// ret.setCreatedAt(img.get);
						if (null != img.getDiskFormat()) {
							ret.setDiskFormat(DiskFormatEnum.valueOf(img.getDiskFormat()));
						}
						if (null != img.getId()) {
							ret.setId(img.getId().toString());
						}
						ret.setImagePath(img.getImagePath());
						ret.setMinDisk(img.getMinDisk());
						ret.setMinRam(img.getMinRam());
						ret.setName(img.getName());
						ret.setProvider(img.getProvider());
						ret.setSize(img.getSize());
						// ret.setUserMetadata(img.get);
						ret.setVersion(img.getVersion());
						return ret;
					}

					private Checksum mapChecksum(final com.ubiqube.etsi.mano.dao.mano.common.Checksum checksum) {
						final Checksum ret = new Checksum();
						ret.setAlgorithm(checksum.getAlgorithm());
						ret.setHash(checksum.getHash());
						return ret;
					}
				})
				.register();

		orikaMapperFactory.classMap(VnfLcmOpOcc.class, VnfLcmOpOccs.class)
				.field("vnfInstanceId", "vnfInstance.id")
				.byDefault()
				.register();
		orikaMapperFactory.classMap(NsInstance.class, NsdInstance.class)
				.field("nestedNsInstanceId{}", "nestedNsInstance{id}")
				.byDefault()
				.register();
		orikaMapperFactory.classMap(SubscriptionObject.class, Subscription.class)
				.field("pkgmSubscription.callbackUri", "subscriptionQuery.callbackUri")
				.fieldMap("pkgmSubscription.filter", "subscriptionFilter").converter("filterConverter").add()
				.field("pkgmSubscription.id", "id")
				.field("subscriptionAuthentication.paramsBasic", "authentificationInformations.authParamBasic")
				.field("subscriptionAuthentication.paramsOauth2ClientCredentials", "authentificationInformations.authParamOath2")
				.field("subscriptionAuthentication.authType[0]", "authentificationInformations.authType")
				.byDefault()
				.register();
		orikaMapperFactory.classMap(ResourceDefinition.class, GrantInformation.class)
				.field("id", "resourceDefinitionId")
				.field("resource.vimConnectionId", "vimConnectionId")
				.field("resource.resourceProviderId", "resourceProviderId")
				.byDefault()
				.register();
		final ConverterFactory converterFactory = orikaMapperFactory.getConverterFactory();
		converterFactory.registerConverter(new UuidConverter());
		converterFactory.registerConverter(new OffsetDateTimeToDateConverter());
		converterFactory.registerConverter("filterConverter", new OrikaFilterMapper());
	}

}
