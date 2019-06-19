package com.ubiqube.etsi.mano.model.nsd.sol005;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
  * \"This type represents the links to resources that an NSD management notification can contain.\" 
 **/
@ApiModel(description="\"This type represents the links to resources that an NSD management notification can contain.\" ")
public class SubscriptionNsdOnBoardingNotificationNsdOnBoardingNotificationLinks  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private NsDescriptorsNsdInfoLinksSelf nsdInfo = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private NsDescriptorsNsdInfoLinksSelf subscription = null;
 /**
   * Get nsdInfo
   * @return nsdInfo
  **/
  @JsonProperty("nsdInfo")
  @NotNull
  public NsDescriptorsNsdInfoLinksSelf getNsdInfo() {
    return nsdInfo;
  }

  public void setNsdInfo(NsDescriptorsNsdInfoLinksSelf nsdInfo) {
    this.nsdInfo = nsdInfo;
  }

  public SubscriptionNsdOnBoardingNotificationNsdOnBoardingNotificationLinks nsdInfo(NsDescriptorsNsdInfoLinksSelf nsdInfo) {
    this.nsdInfo = nsdInfo;
    return this;
  }

 /**
   * Get subscription
   * @return subscription
  **/
  @JsonProperty("subscription")
  @NotNull
  public NsDescriptorsNsdInfoLinksSelf getSubscription() {
    return subscription;
  }

  public void setSubscription(NsDescriptorsNsdInfoLinksSelf subscription) {
    this.subscription = subscription;
  }

  public SubscriptionNsdOnBoardingNotificationNsdOnBoardingNotificationLinks subscription(NsDescriptorsNsdInfoLinksSelf subscription) {
    this.subscription = subscription;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class URIIsProvidedByTheClientWhenCreatingTheSubscriptionNsdOnBoardingNotificationNsdOnBoardingNotificationLinks {\n");
    
    sb.append("    nsdInfo: ").append(toIndentedString(nsdInfo)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
