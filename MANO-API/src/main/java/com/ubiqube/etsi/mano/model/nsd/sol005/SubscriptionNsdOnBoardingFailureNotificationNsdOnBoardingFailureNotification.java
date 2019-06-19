package com.ubiqube.etsi.mano.model.nsd.sol005;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
  * \"This type represents an NSD management notification, which informs the receiver of the failure of on-boarding an NSD. It shall comply with the provisions defined in Table 5.5.2.10-1. The support of this notification is mandatory. The notification shall be triggered by the NFVO when the on-boarding of an NSD has failed.\" 
 **/
@ApiModel(description="\"This type represents an NSD management notification, which informs the receiver of the failure of on-boarding an NSD. It shall comply with the provisions defined in Table 5.5.2.10-1. The support of this notification is mandatory. The notification shall be triggered by the NFVO when the on-boarding of an NSD has failed.\" ")
public class SubscriptionNsdOnBoardingFailureNotificationNsdOnBoardingFailureNotification  {
  
  @ApiModelProperty(required = true, value = "An identifier with the intention of being globally unique. ")
 /**
   * An identifier with the intention of being globally unique. 
  **/
  private String id = null;

  @ApiModelProperty(required = true, value = "\"Discriminator for the different notification types. Shall be set to \"NsdOnboardingFailureNotification\" for this notification type.\" ")
 /**
   * \"Discriminator for the different notification types. Shall be set to \"NsdOnboardingFailureNotification\" for this notification type.\" 
  **/
  private String notificationType = null;

  @ApiModelProperty(value = "An identifier with the intention of being globally unique. ")
 /**
   * An identifier with the intention of being globally unique. 
  **/
  private String subscriptionId = null;

  @ApiModelProperty(required = true, value = "Date-time stamp.  Representation: String formatted according to IETF RFC 3339. ")
 /**
   * Date-time stamp.  Representation: String formatted according to IETF RFC 3339. 
  **/
  private Date timeStamp = null;

  @ApiModelProperty(required = true, value = "An identifier with the intention of being globally unique. ")
 /**
   * An identifier with the intention of being globally unique. 
  **/
  private String nsdInfoId = null;

  @ApiModelProperty(value = "An identifier with the intention of being globally unique. ")
 /**
   * An identifier with the intention of being globally unique. 
  **/
  private String nsdId = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private NsDescriptorsNsdInfoOnboardingFailureDetails onboardingFailureDetails = null;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private SubscriptionNsdOnBoardingNotificationNsdOnBoardingNotificationLinks links = null;
 /**
   * An identifier with the intention of being globally unique. 
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SubscriptionNsdOnBoardingFailureNotificationNsdOnBoardingFailureNotification id(String id) {
    this.id = id;
    return this;
  }

 /**
   * \&quot;Discriminator for the different notification types. Shall be set to \&quot;NsdOnboardingFailureNotification\&quot; for this notification type.\&quot; 
   * @return notificationType
  **/
  @JsonProperty("notificationType")
  @NotNull
  public String getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(String notificationType) {
    this.notificationType = notificationType;
  }

  public SubscriptionNsdOnBoardingFailureNotificationNsdOnBoardingFailureNotification notificationType(String notificationType) {
    this.notificationType = notificationType;
    return this;
  }

 /**
   * An identifier with the intention of being globally unique. 
   * @return subscriptionId
  **/
  @JsonProperty("subscriptionId")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public SubscriptionNsdOnBoardingFailureNotificationNsdOnBoardingFailureNotification subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

 /**
   * Date-time stamp.  Representation: String formatted according to IETF RFC 3339. 
   * @return timeStamp
  **/
  @JsonProperty("timeStamp")
  @NotNull
  public Date getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(Date timeStamp) {
    this.timeStamp = timeStamp;
  }

  public SubscriptionNsdOnBoardingFailureNotificationNsdOnBoardingFailureNotification timeStamp(Date timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

 /**
   * An identifier with the intention of being globally unique. 
   * @return nsdInfoId
  **/
  @JsonProperty("nsdInfoId")
  @NotNull
  public String getNsdInfoId() {
    return nsdInfoId;
  }

  public void setNsdInfoId(String nsdInfoId) {
    this.nsdInfoId = nsdInfoId;
  }

  public SubscriptionNsdOnBoardingFailureNotificationNsdOnBoardingFailureNotification nsdInfoId(String nsdInfoId) {
    this.nsdInfoId = nsdInfoId;
    return this;
  }

 /**
   * An identifier with the intention of being globally unique. 
   * @return nsdId
  **/
  @JsonProperty("nsdId")
  public String getNsdId() {
    return nsdId;
  }

  public void setNsdId(String nsdId) {
    this.nsdId = nsdId;
  }

  public SubscriptionNsdOnBoardingFailureNotificationNsdOnBoardingFailureNotification nsdId(String nsdId) {
    this.nsdId = nsdId;
    return this;
  }

 /**
   * Get onboardingFailureDetails
   * @return onboardingFailureDetails
  **/
  @JsonProperty("onboardingFailureDetails")
  @NotNull
  public NsDescriptorsNsdInfoOnboardingFailureDetails getOnboardingFailureDetails() {
    return onboardingFailureDetails;
  }

  public void setOnboardingFailureDetails(NsDescriptorsNsdInfoOnboardingFailureDetails onboardingFailureDetails) {
    this.onboardingFailureDetails = onboardingFailureDetails;
  }

  public SubscriptionNsdOnBoardingFailureNotificationNsdOnBoardingFailureNotification onboardingFailureDetails(NsDescriptorsNsdInfoOnboardingFailureDetails onboardingFailureDetails) {
    this.onboardingFailureDetails = onboardingFailureDetails;
    return this;
  }

 /**
   * Get links
   * @return links
  **/
  @JsonProperty("_links")
  @NotNull
  public SubscriptionNsdOnBoardingNotificationNsdOnBoardingNotificationLinks getLinks() {
    return links;
  }

  public void setLinks(SubscriptionNsdOnBoardingNotificationNsdOnBoardingNotificationLinks links) {
    this.links = links;
  }

  public SubscriptionNsdOnBoardingFailureNotificationNsdOnBoardingFailureNotification links(SubscriptionNsdOnBoardingNotificationNsdOnBoardingNotificationLinks links) {
    this.links = links;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class URIIsProvidedByTheClientWhenCreatingTheSubscriptionNsdOnBoardingFailureNotificationNsdOnBoardingFailureNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    nsdInfoId: ").append(toIndentedString(nsdInfoId)).append("\n");
    sb.append("    nsdId: ").append(toIndentedString(nsdId)).append("\n");
    sb.append("    onboardingFailureDetails: ").append(toIndentedString(onboardingFailureDetails)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
