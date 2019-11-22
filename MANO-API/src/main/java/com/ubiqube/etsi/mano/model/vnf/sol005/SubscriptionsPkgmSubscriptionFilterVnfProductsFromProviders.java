package com.ubiqube.etsi.mano.model.vnf.sol005;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class SubscriptionsPkgmSubscriptionFilterVnfProductsFromProviders {

	@ApiModelProperty(required = true, value = "Name of the VNFprovider to match. ")
	/**
	 * Name of the VNFprovider to match.
	 **/
	private String vnfProvider = null;

	@ApiModelProperty(value = "If present, match VNF packages that contain VNF products with certain product names, from one particular provider. ")
	@Valid
	/**
	 * If present, match VNF packages that contain VNF products with certain product
	 * names, from one particular provider.
	 **/
	private List<SubscriptionsPkgmSubscriptionFilterVnfProducts> vnfProducts = null;

	@ApiModelProperty(value = "Match VNF packages with a VNFD identifier listed in the attribute. ")
	/**
	 * Match VNF packages with a VNFD identifier listed in the attribute.
	 **/
	private List<String> vnfdId = null;

	@ApiModelProperty(value = "Match VNF packages with a package identifier listed in the attribute. May be present if the \"notificationTypes\" attribute contains the value \"VnfPackageChangeNotification\", and shall be absent otherwise. ")
	/**
	 * Match VNF packages with a package identifier listed in the attribute. May be
	 * present if the \"notificationTypes\" attribute contains the value
	 * \"VnfPackageChangeNotification\", and shall be absent otherwise.
	 **/
	private List<String> vnfPkgId = null;

	@XmlType(name = "OperationalStateEnum")
	@XmlEnum(String.class)
	public enum OperationalStateEnum {

		@XmlEnumValue("ENABLED")
		ENABLED(String.valueOf("ENABLED")), @XmlEnumValue("DISABLED")
		DISABLED(String.valueOf("DISABLED"));

		private final String value;

		OperationalStateEnum(final String v) {
			value = v;
		}

		public String value() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static OperationalStateEnum fromValue(final String v) {
			for (final OperationalStateEnum b : OperationalStateEnum.values()) {
				if (String.valueOf(b.value).equals(v)) {
					return b;
				}
			}
			return null;
		}
	}

	@ApiModelProperty(value = "Match VNF packages with a package identifier listed in the attribute. May be present if the \"notificationTypes\" attribute contains the value \"VnfPackageChangeNotification\", and shall be absent otherwise. ")
	/**
	 * Match VNF packages with a package identifier listed in the attribute. May be
	 * present if the \"notificationTypes\" attribute contains the value
	 * \"VnfPackageChangeNotification\", and shall be absent otherwise.
	 **/
	private List<OperationalStateEnum> operationalState = null;

	@XmlType(name = "UsageStateEnum")
	@XmlEnum(String.class)
	public enum UsageStateEnum {

		@XmlEnumValue("IN_USE")
		IN_USE(String.valueOf("IN_USE")), @XmlEnumValue("NOT_IN_USE")
		NOT_IN_USE(String.valueOf("NOT_IN_USE"));

		private final String value;

		UsageStateEnum(final String v) {
			value = v;
		}

		public String value() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static UsageStateEnum fromValue(final String v) {
			for (final UsageStateEnum b : UsageStateEnum.values()) {
				if (String.valueOf(b.value).equals(v)) {
					return b;
				}
			}
			return null;
		}
	}

	@ApiModelProperty(value = "Match particular usage state of the on-boarded VNF package. May be present if the \"notificationTypes\" attribute contains the value \"VnfPackageChangeNotification\", and shall be absent otherwise. ")
	/**
	 * Match particular usage state of the on-boarded VNF package. May be present if
	 * the \"notificationTypes\" attribute contains the value
	 * \"VnfPackageChangeNotification\", and shall be absent otherwise.
	 **/
	private List<UsageStateEnum> usageState = null;

	/**
	 * Name of the VNFprovider to match.
	 * 
	 * @return vnfProvider
	 **/
	@JsonProperty("vnfProvider")
	@NotNull
	public String getVnfProvider() {
		return vnfProvider;
	}

	public void setVnfProvider(final String vnfProvider) {
		this.vnfProvider = vnfProvider;
	}

	public SubscriptionsPkgmSubscriptionFilterVnfProductsFromProviders vnfProvider(final String vnfProvider) {
		this.vnfProvider = vnfProvider;
		return this;
	}

	/**
	 * If present, match VNF packages that contain VNF products with certain product
	 * names, from one particular provider.
	 * 
	 * @return vnfProducts
	 **/
	@JsonProperty("vnfProducts")
	public List<SubscriptionsPkgmSubscriptionFilterVnfProducts> getVnfProducts() {
		return vnfProducts;
	}

	public void setVnfProducts(final List<SubscriptionsPkgmSubscriptionFilterVnfProducts> vnfProducts) {
		this.vnfProducts = vnfProducts;
	}

	public SubscriptionsPkgmSubscriptionFilterVnfProductsFromProviders vnfProducts(final List<SubscriptionsPkgmSubscriptionFilterVnfProducts> vnfProducts) {
		this.vnfProducts = vnfProducts;
		return this;
	}

	public SubscriptionsPkgmSubscriptionFilterVnfProductsFromProviders addVnfProductsItem(final SubscriptionsPkgmSubscriptionFilterVnfProducts vnfProductsItem) {
		this.vnfProducts.add(vnfProductsItem);
		return this;
	}

	/**
	 * Match VNF packages with a VNFD identifier listed in the attribute.
	 * 
	 * @return vnfdId
	 **/
	@JsonProperty("vnfdId")
	public List<String> getVnfdId() {
		return vnfdId;
	}

	public void setVnfdId(final List<String> vnfdId) {
		this.vnfdId = vnfdId;
	}

	public SubscriptionsPkgmSubscriptionFilterVnfProductsFromProviders vnfdId(final List<String> vnfdId) {
		this.vnfdId = vnfdId;
		return this;
	}

	public SubscriptionsPkgmSubscriptionFilterVnfProductsFromProviders addVnfdIdItem(final String vnfdIdItem) {
		this.vnfdId.add(vnfdIdItem);
		return this;
	}

	/**
	 * Match VNF packages with a package identifier listed in the attribute. May be
	 * present if the \&quot;notificationTypes\&quot; attribute contains the value
	 * \&quot;VnfPackageChangeNotification\&quot;, and shall be absent otherwise.
	 * 
	 * @return vnfPkgId
	 **/
	@JsonProperty("vnfPkgId")
	public List<String> getVnfPkgId() {
		return vnfPkgId;
	}

	public void setVnfPkgId(final List<String> vnfPkgId) {
		this.vnfPkgId = vnfPkgId;
	}

	public SubscriptionsPkgmSubscriptionFilterVnfProductsFromProviders vnfPkgId(final List<String> vnfPkgId) {
		this.vnfPkgId = vnfPkgId;
		return this;
	}

	public SubscriptionsPkgmSubscriptionFilterVnfProductsFromProviders addVnfPkgIdItem(final String vnfPkgIdItem) {
		this.vnfPkgId.add(vnfPkgIdItem);
		return this;
	}

	/**
	 * Match VNF packages with a package identifier listed in the attribute. May be
	 * present if the \&quot;notificationTypes\&quot; attribute contains the value
	 * \&quot;VnfPackageChangeNotification\&quot;, and shall be absent otherwise.
	 * 
	 * @return operationalState
	 **/
	@JsonProperty("operationalState")
	public List<OperationalStateEnum> getOperationalState() {
		return operationalState;
	}

	public void setOperationalState(final List<OperationalStateEnum> operationalState) {
		this.operationalState = operationalState;
	}

	public SubscriptionsPkgmSubscriptionFilterVnfProductsFromProviders operationalState(final List<OperationalStateEnum> operationalState) {
		this.operationalState = operationalState;
		return this;
	}

	public SubscriptionsPkgmSubscriptionFilterVnfProductsFromProviders addOperationalStateItem(final OperationalStateEnum operationalStateItem) {
		if (null == this.operationalState) {
			this.operationalState = new ArrayList<>();
		}
		this.operationalState.add(operationalStateItem);
		return this;
	}

	/**
	 * Match particular usage state of the on-boarded VNF package. May be present if
	 * the \&quot;notificationTypes\&quot; attribute contains the value
	 * \&quot;VnfPackageChangeNotification\&quot;, and shall be absent otherwise.
	 * 
	 * @return usageState
	 **/
	@JsonProperty("usageState")
	public List<UsageStateEnum> getUsageState() {
		return usageState;
	}

	public void setUsageState(final List<UsageStateEnum> usageState) {
		this.usageState = usageState;
	}

	public SubscriptionsPkgmSubscriptionFilterVnfProductsFromProviders usageState(final List<UsageStateEnum> usageState) {
		this.usageState = usageState;
		return this;
	}

	public SubscriptionsPkgmSubscriptionFilterVnfProductsFromProviders addUsageStateItem(final UsageStateEnum usageStateItem) {
		this.usageState.add(usageStateItem);
		return this;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionsPkgmSubscriptionFilterVnfProductsFromProviders {\n");

		sb.append("    vnfProvider: ").append(toIndentedString(vnfProvider)).append("\n");
		sb.append("    vnfProducts: ").append(toIndentedString(vnfProducts)).append("\n");
		sb.append("    vnfdId: ").append(toIndentedString(vnfdId)).append("\n");
		sb.append("    vnfPkgId: ").append(toIndentedString(vnfPkgId)).append("\n");
		sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
		sb.append("    usageState: ").append(toIndentedString(usageState)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private static String toIndentedString(final Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
