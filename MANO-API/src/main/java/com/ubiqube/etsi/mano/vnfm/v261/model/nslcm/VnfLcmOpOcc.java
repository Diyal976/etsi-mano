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

package com.ubiqube.etsi.mano.vnfm.v261.model.nslcm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ubiqube.etsi.mano.common.v261.model.nslcm.CancelModeType;
import com.ubiqube.etsi.mano.common.v261.model.nslcm.ExtVirtualLinkInfo;
import com.ubiqube.etsi.mano.common.v261.model.nslcm.LcmOperationStateType;
import com.ubiqube.etsi.mano.common.v261.model.nslcm.LcmOperationType;
import com.ubiqube.etsi.mano.model.ProblemDetails;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This type represents a VNF lifecycle management operation occurrence.
 */
@ApiModel(description = "This type represents a VNF lifecycle management operation occurrence. ")

public class VnfLcmOpOcc {
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("operationState")
	private LcmOperationStateType operationState = null;

	@JsonProperty("stateEnteredTime")
	private Date stateEnteredTime = null;

	@JsonProperty("startTime")
	private Date startTime = null;

	@JsonProperty("vnfInstanceId")
	private String vnfInstanceId = null;

	@JsonProperty("grantId")
	private String grantId = null;

	@JsonProperty("operation")
	private LcmOperationType operation = null;

	@JsonProperty("isAutomaticInvocation")
	private Boolean isAutomaticInvocation = null;

	// XXX Clarify, This is probably the Query.
	@JsonProperty("operationParams")
	private Map<String, String> operationParams = null;

	@JsonProperty("isCancelPending")
	private Boolean isCancelPending = null;

	@JsonProperty("cancelMode")
	private CancelModeType cancelMode = null;

	@JsonProperty("error")
	private ProblemDetails error = null;

	@JsonProperty("resourceChanges")
	private VnfLcmOpOccResourceChanges resourceChanges = null;

	@JsonProperty("changedInfo")
	private VnfInfoModifications changedInfo = null;

	@JsonProperty("changedExtConnectivity")
	private List<ExtVirtualLinkInfo> changedExtConnectivity = null;

	@JsonProperty("_links")
	private VnfLcmOpOccLinks links = null;

	public VnfLcmOpOcc id(final String id) {
		this.id = id;
		return this;
	}

	/**
	 * Identifier of this VNF lifecycle management operation occurrence.
	 *
	 * @return id
	 **/
	@JsonProperty("id")
	@ApiModelProperty(required = true, value = "Identifier of this VNF lifecycle management operation occurrence. ")
	@NotNull
	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public VnfLcmOpOcc operationState(final LcmOperationStateType operationState) {
		this.operationState = operationState;
		return this;
	}

	/**
	 * The state of the LCM operation.
	 *
	 * @return operationState
	 **/
	@JsonProperty("operationState")
	@ApiModelProperty(required = true, value = "The state of the LCM operation. ")
	@NotNull
	public LcmOperationStateType getOperationState() {
		return operationState;
	}

	public void setOperationState(final LcmOperationStateType operationState) {
		this.operationState = operationState;
	}

	public VnfLcmOpOcc stateEnteredTime(final Date stateEnteredTime) {
		this.stateEnteredTime = stateEnteredTime;
		return this;
	}

	/**
	 * Date-time when the current state was entered.
	 *
	 * @return stateEnteredTime
	 **/
	@JsonProperty("stateEnteredTime")
	@ApiModelProperty(required = true, value = "Date-time when the current state was entered. ")
	@NotNull
	public Date getStateEnteredTime() {
		return stateEnteredTime;
	}

	public void setStateEnteredTime(final Date stateEnteredTime) {
		this.stateEnteredTime = stateEnteredTime;
	}

	public VnfLcmOpOcc startTime(final Date startTime) {
		this.startTime = startTime;
		return this;
	}

	/**
	 * Date-time of the start of the operation.
	 *
	 * @return startTime
	 **/
	@JsonProperty("startTime")
	@ApiModelProperty(required = true, value = "Date-time of the start of the operation. ")
	@NotNull
	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(final Date startTime) {
		this.startTime = startTime;
	}

	public VnfLcmOpOcc vnfInstanceId(final String vnfInstanceId) {
		this.vnfInstanceId = vnfInstanceId;
		return this;
	}

	/**
	 * Identifier of the VNF instance to which the operation applies
	 *
	 * @return vnfInstanceId
	 **/
	@JsonProperty("vnfInstanceId")
	@ApiModelProperty(required = true, value = "Identifier of the VNF instance to which the operation applies ")
	@NotNull
	public String getVnfInstanceId() {
		return vnfInstanceId;
	}

	public void setVnfInstanceId(final String vnfInstanceId) {
		this.vnfInstanceId = vnfInstanceId;
	}

	public VnfLcmOpOcc grantId(final String grantId) {
		this.grantId = grantId;
		return this;
	}

	/**
	 * Identifier of the grant related to this VNF LCM operation occurrence, if such
	 * grant exists.
	 *
	 * @return grantId
	 **/
	@JsonProperty("grantId")
	@ApiModelProperty(value = "Identifier of the grant related to this VNF LCM operation occurrence, if such grant exists. ")
	public String getGrantId() {
		return grantId;
	}

	public void setGrantId(final String grantId) {
		this.grantId = grantId;
	}

	public VnfLcmOpOcc operation(final LcmOperationType operation) {
		this.operation = operation;
		return this;
	}

	/**
	 * Type of the actual LCM operation represented by this VNF LCM operation
	 * occurrence.
	 *
	 * @return operation
	 **/
	@JsonProperty("operation")
	@ApiModelProperty(required = true, value = "Type of the actual LCM operation represented by this VNF LCM operation occurrence. ")
	@NotNull
	public LcmOperationType getOperation() {
		return operation;
	}

	public void setOperation(final LcmOperationType operation) {
		this.operation = operation;
	}

	public VnfLcmOpOcc isAutomaticInvocation(final Boolean isAutomaticInvocation) {
		this.isAutomaticInvocation = isAutomaticInvocation;
		return this;
	}

	/**
	 * Set to true if this VNF LCM operation occurrence has been triggered by an
	 * automated procedure inside the VNFM (i.e. ScaleVnf / ScaleVnfToLevel
	 * triggered by auto-scale, or HealVnf triggered by auto-heal). Set to false
	 * otherwise.
	 *
	 * @return isAutomaticInvocation
	 **/
	@JsonProperty("isAutomaticInvocation")
	@ApiModelProperty(required = true, value = "Set to true if this VNF LCM operation occurrence has been triggered by an automated procedure inside the VNFM (i.e. ScaleVnf / ScaleVnfToLevel triggered by auto-scale, or HealVnf triggered by auto-heal). Set to false otherwise. ")
	@NotNull
	public Boolean isIsAutomaticInvocation() {
		return isAutomaticInvocation;
	}

	public void setIsAutomaticInvocation(final Boolean isAutomaticInvocation) {
		this.isAutomaticInvocation = isAutomaticInvocation;
	}

	public VnfLcmOpOcc operationParams(final Map<String, String> operationParams) {
		this.operationParams = operationParams;
		return this;
	}

	/**
	 * Input parameters of the LCM operation. This attribute shall be formatted
	 * according to the request data type of the related LCM operation. The
	 * following mapping between operationType and the data type of this attribute
	 * shall apply: * INSTANTIATE: InstantiateVnfRequest * SCALE: ScaleVnfRequest *
	 * SCALE_TO_LEVEL: ScaleVnfToLevelRequest * CHANGE_FLAVOUR:
	 * ChangeVnfFlavourRequest * OPERATE: OperateVnfRequest * HEAL: HealVnfRequest *
	 * CHANGE_EXT_CONN: ChangeExtVnfConnectivityRequest * TERMINATE:
	 * TerminateVnfRequest * MODIFY_INFO: VnfInfoModificationRequest
	 *
	 * @return operationParams
	 **/
	@JsonProperty("operationParams")
	@ApiModelProperty(required = true, value = "Input parameters of the LCM operation. This attribute shall be formatted according to the request data type of the related LCM operation. The following mapping between operationType and the data type of this attribute shall apply: * INSTANTIATE: InstantiateVnfRequest * SCALE: ScaleVnfRequest * SCALE_TO_LEVEL: ScaleVnfToLevelRequest * CHANGE_FLAVOUR: ChangeVnfFlavourRequest * OPERATE: OperateVnfRequest * HEAL: HealVnfRequest * CHANGE_EXT_CONN: ChangeExtVnfConnectivityRequest * TERMINATE: TerminateVnfRequest * MODIFY_INFO: VnfInfoModificationRequest ")
	@NotNull
	public Map<String, String> getOperationParams() {
		return operationParams;
	}

	public void setOperationParams(final Map<String, String> operationParams) {
		this.operationParams = operationParams;
	}

	public VnfLcmOpOcc isCancelPending(final Boolean isCancelPending) {
		this.isCancelPending = isCancelPending;
		return this;
	}

	/**
	 * If the VNF LCM operation occurrence is in \&quot;STARTING\&quot;,
	 * \&quot;PROCESSING\&quot; or \&quot;ROLLING_BACK\&quot; state and the
	 * operation is being cancelled, this attribute shall be set to true. Otherwise,
	 * it shall be set to false.
	 *
	 * @return isCancelPending
	 **/
	@JsonProperty("isCancelPending")
	@ApiModelProperty(required = true, value = "If the VNF LCM operation occurrence is in \"STARTING\", \"PROCESSING\" or \"ROLLING_BACK\" state and the operation is being cancelled, this attribute shall be set to true. Otherwise, it shall be set to false. ")
	@NotNull
	public Boolean isIsCancelPending() {
		return isCancelPending;
	}

	public void setIsCancelPending(final Boolean isCancelPending) {
		this.isCancelPending = isCancelPending;
	}

	public VnfLcmOpOcc cancelMode(final CancelModeType cancelMode) {
		this.cancelMode = cancelMode;
		return this;
	}

	/**
	 * The mode of an ongoing cancellation. Shall be present when
	 * isCancelPending&#x3D;true, and shall be absent otherwise.
	 *
	 * @return cancelMode
	 **/
	@JsonProperty("cancelMode")
	@ApiModelProperty(value = "The mode of an ongoing cancellation. Shall be present when isCancelPending=true, and shall be absent otherwise. ")
	public CancelModeType getCancelMode() {
		return cancelMode;
	}

	public void setCancelMode(final CancelModeType cancelMode) {
		this.cancelMode = cancelMode;
	}

	public VnfLcmOpOcc error(final ProblemDetails error) {
		this.error = error;
		return this;
	}

	/**
	 * If \&quot;operationState\&quot; is \&quot;FAILED_TEMP\&quot; or
	 * \&quot;FAILED\&quot; or \&quot;operationState\&quot; is
	 * \&quot;PROCESSING\&quot; or \&quot;ROLLING_BACK\&quot; and previous value of
	 * \&quot;operationState\&quot; was \&quot;FAILED_TEMP\&quot;, this attribute
	 * shall be present and contain error information, unless it has been requested
	 * to be excluded via an attribute selector.
	 *
	 * @return error
	 **/
	@JsonProperty("error")
	@ApiModelProperty(value = "If \"operationState\" is \"FAILED_TEMP\" or \"FAILED\" or \"operationState\" is \"PROCESSING\" or \"ROLLING_BACK\" and previous value of \"operationState\" was \"FAILED_TEMP\", this attribute shall be present and contain error information, unless it has been requested to be excluded via an attribute selector. ")
	public ProblemDetails getError() {
		return error;
	}

	public void setError(final ProblemDetails error) {
		this.error = error;
	}

	public VnfLcmOpOcc resourceChanges(final VnfLcmOpOccResourceChanges resourceChanges) {
		this.resourceChanges = resourceChanges;
		return this;
	}

	/**
	 * Get resourceChanges
	 *
	 * @return resourceChanges
	 **/
	@JsonProperty("resourceChanges")
	@ApiModelProperty(value = "")
	public VnfLcmOpOccResourceChanges getResourceChanges() {
		return resourceChanges;
	}

	public void setResourceChanges(final VnfLcmOpOccResourceChanges resourceChanges) {
		this.resourceChanges = resourceChanges;
	}

	public VnfLcmOpOcc changedInfo(final VnfInfoModifications changedInfo) {
		this.changedInfo = changedInfo;
		return this;
	}

	/**
	 * Information about the changed VNF instance information, including VNF
	 * configurable properties, if applicable. This allows the NFVO to obtain the
	 * information contained in the latest \&quot;result\&quot; notification if it
	 * has not received it due to an error or a wrongly configured subscription
	 * filter.
	 *
	 * @return changedInfo
	 **/
	@JsonProperty("changedInfo")
	@ApiModelProperty(value = "Information about the changed VNF instance information, including VNF configurable properties, if applicable. This allows the NFVO to obtain the information contained in the latest \"result\" notification if it has not received it due to an error or a wrongly configured subscription filter. ")
	public VnfInfoModifications getChangedInfo() {
		return changedInfo;
	}

	public void setChangedInfo(final VnfInfoModifications changedInfo) {
		this.changedInfo = changedInfo;
	}

	public VnfLcmOpOcc changedExtConnectivity(final List<ExtVirtualLinkInfo> changedExtConnectivity) {
		this.changedExtConnectivity = changedExtConnectivity;
		return this;
	}

	public VnfLcmOpOcc addChangedExtConnectivityItem(final ExtVirtualLinkInfo changedExtConnectivityItem) {
		if (this.changedExtConnectivity == null) {
			this.changedExtConnectivity = new ArrayList<>();
		}
		this.changedExtConnectivity.add(changedExtConnectivityItem);
		return this;
	}

	/**
	 * Information about changed external connectivity, if applicable. This allows
	 * the NFVO to obtain the information contained in the latest
	 * \&quot;result\&quot; notification if it has not received it due to an error
	 * or a wrongly configured subscription filter.
	 *
	 * @return changedExtConnectivity
	 **/
	@JsonProperty("changedExtConnectivity")
	@ApiModelProperty(value = "Information about changed external connectivity, if applicable. This allows the NFVO to obtain the information contained in the latest \"result\" notification if it has not received it due to an error or a wrongly configured subscription filter. ")
	public List<ExtVirtualLinkInfo> getChangedExtConnectivity() {
		return changedExtConnectivity;
	}

	public void setChangedExtConnectivity(final List<ExtVirtualLinkInfo> changedExtConnectivity) {
		this.changedExtConnectivity = changedExtConnectivity;
	}

	public VnfLcmOpOcc links(final VnfLcmOpOccLinks links) {
		this.links = links;
		return this;
	}

	/**
	 * Get links
	 *
	 * @return links
	 **/
	@JsonProperty("_links")
	@ApiModelProperty(value = "")
	public VnfLcmOpOccLinks getLinks() {
		return links;
	}

	public void setLinks(final VnfLcmOpOccLinks links) {
		this.links = links;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("class VnfLcmOpOcc {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    operationState: ").append(toIndentedString(operationState)).append("\n");
		sb.append("    stateEnteredTime: ").append(toIndentedString(stateEnteredTime)).append("\n");
		sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
		sb.append("    vnfInstanceId: ").append(toIndentedString(vnfInstanceId)).append("\n");
		sb.append("    grantId: ").append(toIndentedString(grantId)).append("\n");
		sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
		sb.append("    isAutomaticInvocation: ").append(toIndentedString(isAutomaticInvocation)).append("\n");
		sb.append("    operationParams: ").append(toIndentedString(operationParams)).append("\n");
		sb.append("    isCancelPending: ").append(toIndentedString(isCancelPending)).append("\n");
		sb.append("    cancelMode: ").append(toIndentedString(cancelMode)).append("\n");
		sb.append("    error: ").append(toIndentedString(error)).append("\n");
		sb.append("    resourceChanges: ").append(toIndentedString(resourceChanges)).append("\n");
		sb.append("    changedInfo: ").append(toIndentedString(changedInfo)).append("\n");
		sb.append("    changedExtConnectivity: ").append(toIndentedString(changedExtConnectivity)).append("\n");
		sb.append("    links: ").append(toIndentedString(links)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(final java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
