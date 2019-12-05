package com.ubiqube.etsi.mano.model.nslcm.sol005;

import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * This type provides information about added, deleted and modified VNFFG
 * instances. It shall comply with the provisions in Table 6.5.3.5-1.
 */
@ApiModel(description = "This type provides information about added, deleted and modified VNFFG instances. It shall comply with the provisions in Table 6.5.3.5-1. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-05T16:49:58.135+01:00")

public class AffectedVnffg {
	@JsonProperty("vnffgInstanceId")
	private String vnffgInstanceId = null;

	@JsonProperty("vnffgdId")
	private String vnffgdId = null;

	/**
	 * Signals the type of change. Permitted values: - ADD - DELETE - MODIFY
	 */
	public enum ChangeTypeEnum {
		ADD("ADD"),

		DELETE("DELETE"),

		MODIFY("MODIFY");

		private final String value;

		ChangeTypeEnum(final String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static ChangeTypeEnum fromValue(final String text) {
			for (final ChangeTypeEnum b : ChangeTypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("changeType")
	private ChangeTypeEnum changeType = null;

	/**
	 * Signals the result of change identified by the \"changeType\" attribute.
	 * Permitted values: - COMPLETED - ROLLED_BACK - FAILED
	 */
	public enum ChangeResultEnum {
		COMPLETED("COMPLETED"),

		ROLLED_BACK("ROLLED_BACK"),

		FAILED("FAILED");

		private final String value;

		ChangeResultEnum(final String value) {
			this.value = value;
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static ChangeResultEnum fromValue(final String text) {
			for (final ChangeResultEnum b : ChangeResultEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

	@JsonProperty("changeResult")
	private ChangeResultEnum changeResult = null;

	public AffectedVnffg vnffgInstanceId(final String vnffgInstanceId) {
		this.vnffgInstanceId = vnffgInstanceId;
		return this;
	}

	/**
	 * Identifier of the VNFFG instance.
	 * 
	 * @return vnffgInstanceId
	 **/
	@ApiModelProperty(required = true, value = "Identifier of the VNFFG instance. ")
	@NotNull

	public String getVnffgInstanceId() {
		return vnffgInstanceId;
	}

	public void setVnffgInstanceId(final String vnffgInstanceId) {
		this.vnffgInstanceId = vnffgInstanceId;
	}

	public AffectedVnffg vnffgdId(final String vnffgdId) {
		this.vnffgdId = vnffgdId;
		return this;
	}

	/**
	 * Identifier of the VNFFGD of the VNFFG instance.
	 * 
	 * @return vnffgdId
	 **/
	@ApiModelProperty(required = true, value = "Identifier of the VNFFGD of the VNFFG instance. ")
	@NotNull

	public String getVnffgdId() {
		return vnffgdId;
	}

	public void setVnffgdId(final String vnffgdId) {
		this.vnffgdId = vnffgdId;
	}

	public AffectedVnffg changeType(final ChangeTypeEnum changeType) {
		this.changeType = changeType;
		return this;
	}

	/**
	 * Signals the type of change. Permitted values: - ADD - DELETE - MODIFY
	 * 
	 * @return changeType
	 **/
	@ApiModelProperty(value = "Signals the type of change. Permitted values: - ADD - DELETE - MODIFY ")

	public ChangeTypeEnum getChangeType() {
		return changeType;
	}

	public void setChangeType(final ChangeTypeEnum changeType) {
		this.changeType = changeType;
	}

	public AffectedVnffg changeResult(final ChangeResultEnum changeResult) {
		this.changeResult = changeResult;
		return this;
	}

	/**
	 * Signals the result of change identified by the \"changeType\" attribute.
	 * Permitted values: - COMPLETED - ROLLED_BACK - FAILED
	 * 
	 * @return changeResult
	 **/
	@ApiModelProperty(value = "Signals the result of change identified by the \"changeType\" attribute. Permitted values: - COMPLETED - ROLLED_BACK - FAILED ")

	public ChangeResultEnum getChangeResult() {
		return changeResult;
	}

	public void setChangeResult(final ChangeResultEnum changeResult) {
		this.changeResult = changeResult;
	}

	@Override
	public boolean equals(final java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if ((o == null) || (getClass() != o.getClass())) {
			return false;
		}
		final AffectedVnffg affectedVnffg = (AffectedVnffg) o;
		return Objects.equals(this.vnffgInstanceId, affectedVnffg.vnffgInstanceId) &&
				Objects.equals(this.vnffgdId, affectedVnffg.vnffgdId) &&
				Objects.equals(this.changeType, affectedVnffg.changeType) &&
				Objects.equals(this.changeResult, affectedVnffg.changeResult);
	}

	@Override
	public int hashCode() {
		return Objects.hash(vnffgInstanceId, vnffgdId, changeType, changeResult);
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("class AffectedVnffg {\n");

		sb.append("    vnffgInstanceId: ").append(toIndentedString(vnffgInstanceId)).append("\n");
		sb.append("    vnffgdId: ").append(toIndentedString(vnffgdId)).append("\n");
		sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
		sb.append("    changeResult: ").append(toIndentedString(changeResult)).append("\n");
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
