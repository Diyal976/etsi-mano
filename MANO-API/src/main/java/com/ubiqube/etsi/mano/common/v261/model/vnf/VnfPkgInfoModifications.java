package com.ubiqube.etsi.mano.common.v261.model.vnf;

import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This type represents modifications to the information of a VNF package. It
 * shall comply with the provisions defined in Table 9.5.2.3-1.
 */
@ApiModel(description = "This type represents modifications to the information of a VNF package.  It shall comply with the provisions defined in Table 9.5.2.3-1. ")
@Validated
public class VnfPkgInfoModifications {
	@JsonProperty("operationalState")
	private PackageOperationalStateType operationalState = null;

	@JsonProperty("userDefinedData")
	private Map<String, String> userDefinedData = null;

	public VnfPkgInfoModifications operationalState(final PackageOperationalStateType operationalState) {
		this.operationalState = operationalState;
		return this;
	}

	/**
	 * New value of the operational state of the on-boarded instance of the VNF
	 * package.
	 *
	 * @return operationalState
	 **/
	@ApiModelProperty(value = "New value of the operational state of the on-boarded instance of the VNF package. ")

	@Valid

	public PackageOperationalStateType getOperationalState() {
		return operationalState;
	}

	public void setOperationalState(final PackageOperationalStateType operationalState) {
		this.operationalState = operationalState;
	}

	public VnfPkgInfoModifications userDefinedData(final Map<String, String> userDefinedData) {
		this.userDefinedData = userDefinedData;
		return this;
	}

	/**
	 * User defined data to be updated. For existing keys, the value is replaced.
	 *
	 * @return userDefinedData
	 **/
	@ApiModelProperty(value = "User defined data to be updated. For existing keys, the value is replaced. ")

	@Valid

	public Map<String, String> getUserDefinedData() {
		return userDefinedData;
	}

	public void setUserDefinedData(final Map<String, String> userDefinedData) {
		this.userDefinedData = userDefinedData;
	}

	@Override
	public boolean equals(final java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if ((o == null) || (getClass() != o.getClass())) {
			return false;
		}
		final VnfPkgInfoModifications vnfPkgInfoModifications = (VnfPkgInfoModifications) o;
		return Objects.equals(this.operationalState, vnfPkgInfoModifications.operationalState) &&
				Objects.equals(this.userDefinedData, vnfPkgInfoModifications.userDefinedData);
	}

	@Override
	public int hashCode() {
		return Objects.hash(operationalState, userDefinedData);
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("class VnfPkgInfoModifications {\n");

		sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
		sb.append("    userDefinedData: ").append(toIndentedString(userDefinedData)).append("\n");
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
