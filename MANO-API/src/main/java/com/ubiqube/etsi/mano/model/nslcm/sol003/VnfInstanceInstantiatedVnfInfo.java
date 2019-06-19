/*
 * SOL003 - VNF Lifecycle Management interface
 * SOL003 - VNF Lifecycle Management interface definition  IMPORTANT: Please note that this file might be not aligned to the current version of the ETSI Group Specification it refers to. In case of discrepancies the published ETSI Group Specification takes precedence.  In clause 4.3.2 of ETSI GS NFV-SOL 003 v2.4.1, an attribute-based filtering mechanism is defined. This mechanism is currently not included in the corresponding OpenAPI design for this GS version. Changes to the attribute-based filtering mechanism are being considered in v2.5.1 of this GS for inclusion in the corresponding future ETSI NFV OpenAPI design. Please report bugs to https://forge.etsi.org/bugzilla/buglist.cgi?component=Nfv-Openapis&list_id=61&product=NFV&resolution=
 *
 * OpenAPI spec version: 1.1.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.ubiqube.etsi.mano.model.nslcm.sol003;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Information specific to an instantiated VNF instance. This attribute shall be
 * present if the instantiateState attribute value is INSTANTIATED.
 */
@ApiModel(description = "Information specific to an instantiated VNF instance. This attribute shall be present if the instantiateState attribute value is INSTANTIATED. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-06-13T10:04:39.223+02:00")
public class VnfInstanceInstantiatedVnfInfo {
	@JsonProperty("flavourId")
	private String flavourId = null;

	@JsonProperty("vnfState")
	private VnfOperationalStateType vnfState = null;

	@JsonProperty("scaleStatus")
	private List<ScaleInfo> scaleStatus = null;

	@JsonProperty("extCpInfo")
	private List<VnfInstanceInstantiatedVnfInfoExtCpInfo> extCpInfo = null;

	@JsonProperty("extVirtualLinkInfo")
	private List<ExtVirtualLinkInfo> extVirtualLinkInfo = null;

	@JsonProperty("extManagedVirtualLinkInfo")
	private List<ExtManagedVirtualLinkInfo> extManagedVirtualLinkInfo = null;

	@JsonProperty("monitoringParameters")
	private List<MonitoringParameter> monitoringParameters = null;

	@JsonProperty("localizationLanguage")
	private String localizationLanguage = null;

	@JsonProperty("vnfcResourceInfo")
	private List<VnfcResourceInfo> vnfcResourceInfo = null;

	@JsonProperty("virtualLinkResourceInfo")
	private List<VnfVirtualLinkResourceInfo> virtualLinkResourceInfo = null;

	@JsonProperty("virtualStorageResourceInfo")
	private List<VirtualStorageResourceInfo> virtualStorageResourceInfo = null;

	public VnfInstanceInstantiatedVnfInfo flavourId(String flavourId) {
		this.flavourId = flavourId;
		return this;
	}

	/**
	 * Identifier of the VNF deployment flavour applied to this VNF instance.
	 * 
	 * @return flavourId
	 **/
	@JsonProperty("flavourId")
	@ApiModelProperty(required = true, value = "Identifier of the VNF deployment flavour applied to this VNF instance. ")
	@NotNull
	public String getFlavourId() {
		return flavourId;
	}

	public void setFlavourId(String flavourId) {
		this.flavourId = flavourId;
	}

	public VnfInstanceInstantiatedVnfInfo vnfState(VnfOperationalStateType vnfState) {
		this.vnfState = vnfState;
		return this;
	}

	/**
	 * The state of the VNF instance.
	 * 
	 * @return vnfState
	 **/
	@JsonProperty("vnfState")
	@ApiModelProperty(required = true, value = "The state of the VNF instance. ")
	@NotNull
	public VnfOperationalStateType getVnfState() {
		return vnfState;
	}

	public void setVnfState(VnfOperationalStateType vnfState) {
		this.vnfState = vnfState;
	}

	public VnfInstanceInstantiatedVnfInfo scaleStatus(List<ScaleInfo> scaleStatus) {
		this.scaleStatus = scaleStatus;
		return this;
	}

	public VnfInstanceInstantiatedVnfInfo addScaleStatusItem(ScaleInfo scaleStatusItem) {
		if (this.scaleStatus == null) {
			this.scaleStatus = new ArrayList<ScaleInfo>();
		}
		this.scaleStatus.add(scaleStatusItem);
		return this;
	}

	/**
	 * Scale status of the VNF, one entry per aspect. Represents for every scaling
	 * aspect how \&quot;big\&quot; the VNF has been scaled w.r.t. that aspect.
	 * 
	 * @return scaleStatus
	 **/
	@JsonProperty("scaleStatus")
	@ApiModelProperty(value = "Scale status of the VNF, one entry per aspect. Represents for every scaling aspect how \"big\" the VNF has been scaled w.r.t. that aspect. ")
	public List<ScaleInfo> getScaleStatus() {
		return scaleStatus;
	}

	public void setScaleStatus(List<ScaleInfo> scaleStatus) {
		this.scaleStatus = scaleStatus;
	}

	public VnfInstanceInstantiatedVnfInfo extCpInfo(List<VnfInstanceInstantiatedVnfInfoExtCpInfo> extCpInfo) {
		this.extCpInfo = extCpInfo;
		return this;
	}

	public VnfInstanceInstantiatedVnfInfo addExtCpInfoItem(VnfInstanceInstantiatedVnfInfoExtCpInfo extCpInfoItem) {
		if (this.extCpInfo == null) {
			this.extCpInfo = new ArrayList<VnfInstanceInstantiatedVnfInfoExtCpInfo>();
		}
		this.extCpInfo.add(extCpInfoItem);
		return this;
	}

	/**
	 * Information about the external CPs exposed by the VNF instance.
	 * 
	 * @return extCpInfo
	 **/
	@JsonProperty("extCpInfo")
	@ApiModelProperty(value = "Information about the external CPs exposed by the VNF instance. ")
	@Size(min = 1)
	public List<VnfInstanceInstantiatedVnfInfoExtCpInfo> getExtCpInfo() {
		return extCpInfo;
	}

	public void setExtCpInfo(List<VnfInstanceInstantiatedVnfInfoExtCpInfo> extCpInfo) {
		this.extCpInfo = extCpInfo;
	}

	public VnfInstanceInstantiatedVnfInfo extVirtualLinkInfo(List<ExtVirtualLinkInfo> extVirtualLinkInfo) {
		this.extVirtualLinkInfo = extVirtualLinkInfo;
		return this;
	}

	public VnfInstanceInstantiatedVnfInfo addExtVirtualLinkInfoItem(ExtVirtualLinkInfo extVirtualLinkInfoItem) {
		if (this.extVirtualLinkInfo == null) {
			this.extVirtualLinkInfo = new ArrayList<ExtVirtualLinkInfo>();
		}
		this.extVirtualLinkInfo.add(extVirtualLinkInfoItem);
		return this;
	}

	/**
	 * Information about the external VLs the VNF instance is connected to.
	 * 
	 * @return extVirtualLinkInfo
	 **/
	@JsonProperty("extVirtualLinkInfo")
	@ApiModelProperty(value = "Information about the external VLs the VNF instance is connected to. ")
	public List<ExtVirtualLinkInfo> getExtVirtualLinkInfo() {
		return extVirtualLinkInfo;
	}

	public void setExtVirtualLinkInfo(List<ExtVirtualLinkInfo> extVirtualLinkInfo) {
		this.extVirtualLinkInfo = extVirtualLinkInfo;
	}

	public VnfInstanceInstantiatedVnfInfo extManagedVirtualLinkInfo(List<ExtManagedVirtualLinkInfo> extManagedVirtualLinkInfo) {
		this.extManagedVirtualLinkInfo = extManagedVirtualLinkInfo;
		return this;
	}

	public VnfInstanceInstantiatedVnfInfo addExtManagedVirtualLinkInfoItem(ExtManagedVirtualLinkInfo extManagedVirtualLinkInfoItem) {
		if (this.extManagedVirtualLinkInfo == null) {
			this.extManagedVirtualLinkInfo = new ArrayList<ExtManagedVirtualLinkInfo>();
		}
		this.extManagedVirtualLinkInfo.add(extManagedVirtualLinkInfoItem);
		return this;
	}

	/**
	 * External virtual links the VNF instance is connected to.
	 * 
	 * @return extManagedVirtualLinkInfo
	 **/
	@JsonProperty("extManagedVirtualLinkInfo")
	@ApiModelProperty(value = "External virtual links the VNF instance is connected to. ")
	public List<ExtManagedVirtualLinkInfo> getExtManagedVirtualLinkInfo() {
		return extManagedVirtualLinkInfo;
	}

	public void setExtManagedVirtualLinkInfo(List<ExtManagedVirtualLinkInfo> extManagedVirtualLinkInfo) {
		this.extManagedVirtualLinkInfo = extManagedVirtualLinkInfo;
	}

	public VnfInstanceInstantiatedVnfInfo monitoringParameters(List<MonitoringParameter> monitoringParameters) {
		this.monitoringParameters = monitoringParameters;
		return this;
	}

	public VnfInstanceInstantiatedVnfInfo addMonitoringParametersItem(MonitoringParameter monitoringParametersItem) {
		if (this.monitoringParameters == null) {
			this.monitoringParameters = new ArrayList<MonitoringParameter>();
		}
		this.monitoringParameters.add(monitoringParametersItem);
		return this;
	}

	/**
	 * Active monitoring parameters.
	 * 
	 * @return monitoringParameters
	 **/
	@JsonProperty("monitoringParameters")
	@ApiModelProperty(value = "Active monitoring parameters. ")
	public List<MonitoringParameter> getMonitoringParameters() {
		return monitoringParameters;
	}

	public void setMonitoringParameters(List<MonitoringParameter> monitoringParameters) {
		this.monitoringParameters = monitoringParameters;
	}

	public VnfInstanceInstantiatedVnfInfo localizationLanguage(String localizationLanguage) {
		this.localizationLanguage = localizationLanguage;
		return this;
	}

	/**
	 * Information about localization language of the VNF (includes e.g. strings in
	 * the VNFD). The localization languages supported by a VNF can be declared in
	 * the VNFD, and localization language selection can take place at instantiation
	 * time. The value shall comply with the format defined in IETF RFC 5646.
	 * 
	 * @return localizationLanguage
	 **/
	@JsonProperty("localizationLanguage")
	@ApiModelProperty(value = "Information about localization language of the VNF (includes e.g. strings in the VNFD). The localization languages supported by a VNF can be declared in the VNFD, and localization language selection can take place at instantiation time. The value shall comply with the format defined in IETF RFC 5646. ")
	public String getLocalizationLanguage() {
		return localizationLanguage;
	}

	public void setLocalizationLanguage(String localizationLanguage) {
		this.localizationLanguage = localizationLanguage;
	}

	public VnfInstanceInstantiatedVnfInfo vnfcResourceInfo(List<VnfcResourceInfo> vnfcResourceInfo) {
		this.vnfcResourceInfo = vnfcResourceInfo;
		return this;
	}

	public VnfInstanceInstantiatedVnfInfo addVnfcResourceInfoItem(VnfcResourceInfo vnfcResourceInfoItem) {
		if (this.vnfcResourceInfo == null) {
			this.vnfcResourceInfo = new ArrayList<VnfcResourceInfo>();
		}
		this.vnfcResourceInfo.add(vnfcResourceInfoItem);
		return this;
	}

	/**
	 * Information about the virtualised compute and storage resources used by the
	 * VNFCs of the VNF instance.
	 * 
	 * @return vnfcResourceInfo
	 **/
	@JsonProperty("vnfcResourceInfo")
	@ApiModelProperty(value = "Information about the virtualised compute and storage resources used by the VNFCs of the VNF instance. ")
	public List<VnfcResourceInfo> getVnfcResourceInfo() {
		return vnfcResourceInfo;
	}

	public void setVnfcResourceInfo(List<VnfcResourceInfo> vnfcResourceInfo) {
		this.vnfcResourceInfo = vnfcResourceInfo;
	}

	public VnfInstanceInstantiatedVnfInfo virtualLinkResourceInfo(List<VnfVirtualLinkResourceInfo> virtualLinkResourceInfo) {
		this.virtualLinkResourceInfo = virtualLinkResourceInfo;
		return this;
	}

	public VnfInstanceInstantiatedVnfInfo addVirtualLinkResourceInfoItem(VnfVirtualLinkResourceInfo virtualLinkResourceInfoItem) {
		if (this.virtualLinkResourceInfo == null) {
			this.virtualLinkResourceInfo = new ArrayList<VnfVirtualLinkResourceInfo>();
		}
		this.virtualLinkResourceInfo.add(virtualLinkResourceInfoItem);
		return this;
	}

	/**
	 * Information about the virtualised network resources used by the VLs of the
	 * VNF instance.
	 * 
	 * @return virtualLinkResourceInfo
	 **/
	@JsonProperty("virtualLinkResourceInfo")
	@ApiModelProperty(value = "Information about the virtualised network resources used by the VLs of the VNF instance. ")
	public List<VnfVirtualLinkResourceInfo> getVirtualLinkResourceInfo() {
		return virtualLinkResourceInfo;
	}

	public void setVirtualLinkResourceInfo(List<VnfVirtualLinkResourceInfo> virtualLinkResourceInfo) {
		this.virtualLinkResourceInfo = virtualLinkResourceInfo;
	}

	public VnfInstanceInstantiatedVnfInfo virtualStorageResourceInfo(List<VirtualStorageResourceInfo> virtualStorageResourceInfo) {
		this.virtualStorageResourceInfo = virtualStorageResourceInfo;
		return this;
	}

	public VnfInstanceInstantiatedVnfInfo addVirtualStorageResourceInfoItem(VirtualStorageResourceInfo virtualStorageResourceInfoItem) {
		if (this.virtualStorageResourceInfo == null) {
			this.virtualStorageResourceInfo = new ArrayList<VirtualStorageResourceInfo>();
		}
		this.virtualStorageResourceInfo.add(virtualStorageResourceInfoItem);
		return this;
	}

	/**
	 * Information on the virtualised storage resource(s) used as storage for the
	 * VNF instance.
	 * 
	 * @return virtualStorageResourceInfo
	 **/
	@JsonProperty("virtualStorageResourceInfo")
	@ApiModelProperty(value = "Information on the virtualised storage resource(s) used as storage for the VNF instance. ")
	public List<VirtualStorageResourceInfo> getVirtualStorageResourceInfo() {
		return virtualStorageResourceInfo;
	}

	public void setVirtualStorageResourceInfo(List<VirtualStorageResourceInfo> virtualStorageResourceInfo) {
		this.virtualStorageResourceInfo = virtualStorageResourceInfo;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("class VnfInstanceInstantiatedVnfInfo {\n");

		sb.append("    flavourId: ").append(toIndentedString(flavourId)).append("\n");
		sb.append("    vnfState: ").append(toIndentedString(vnfState)).append("\n");
		sb.append("    scaleStatus: ").append(toIndentedString(scaleStatus)).append("\n");
		sb.append("    extCpInfo: ").append(toIndentedString(extCpInfo)).append("\n");
		sb.append("    extVirtualLinkInfo: ").append(toIndentedString(extVirtualLinkInfo)).append("\n");
		sb.append("    extManagedVirtualLinkInfo: ").append(toIndentedString(extManagedVirtualLinkInfo)).append("\n");
		sb.append("    monitoringParameters: ").append(toIndentedString(monitoringParameters)).append("\n");
		sb.append("    localizationLanguage: ").append(toIndentedString(localizationLanguage)).append("\n");
		sb.append("    vnfcResourceInfo: ").append(toIndentedString(vnfcResourceInfo)).append("\n");
		sb.append("    virtualLinkResourceInfo: ").append(toIndentedString(virtualLinkResourceInfo)).append("\n");
		sb.append("    virtualStorageResourceInfo: ").append(toIndentedString(virtualStorageResourceInfo)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}