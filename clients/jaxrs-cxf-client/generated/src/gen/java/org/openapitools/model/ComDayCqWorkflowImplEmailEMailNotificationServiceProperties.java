package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString fromAddress = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString hostPrefix = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean notifyOnabort = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean notifyOncomplete = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean notifyOncontainercomplete = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean notifyUseronly = null;
 /**
   * Get fromAddress
   * @return fromAddress
  **/
  @JsonProperty("from.address")
  public ConfigNodePropertyString getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
  }

  public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties fromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

 /**
   * Get hostPrefix
   * @return hostPrefix
  **/
  @JsonProperty("host.prefix")
  public ConfigNodePropertyString getHostPrefix() {
    return hostPrefix;
  }

  public void setHostPrefix(ConfigNodePropertyString hostPrefix) {
    this.hostPrefix = hostPrefix;
  }

  public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties hostPrefix(ConfigNodePropertyString hostPrefix) {
    this.hostPrefix = hostPrefix;
    return this;
  }

 /**
   * Get notifyOnabort
   * @return notifyOnabort
  **/
  @JsonProperty("notify.onabort")
  public ConfigNodePropertyBoolean getNotifyOnabort() {
    return notifyOnabort;
  }

  public void setNotifyOnabort(ConfigNodePropertyBoolean notifyOnabort) {
    this.notifyOnabort = notifyOnabort;
  }

  public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties notifyOnabort(ConfigNodePropertyBoolean notifyOnabort) {
    this.notifyOnabort = notifyOnabort;
    return this;
  }

 /**
   * Get notifyOncomplete
   * @return notifyOncomplete
  **/
  @JsonProperty("notify.oncomplete")
  public ConfigNodePropertyBoolean getNotifyOncomplete() {
    return notifyOncomplete;
  }

  public void setNotifyOncomplete(ConfigNodePropertyBoolean notifyOncomplete) {
    this.notifyOncomplete = notifyOncomplete;
  }

  public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties notifyOncomplete(ConfigNodePropertyBoolean notifyOncomplete) {
    this.notifyOncomplete = notifyOncomplete;
    return this;
  }

 /**
   * Get notifyOncontainercomplete
   * @return notifyOncontainercomplete
  **/
  @JsonProperty("notify.oncontainercomplete")
  public ConfigNodePropertyBoolean getNotifyOncontainercomplete() {
    return notifyOncontainercomplete;
  }

  public void setNotifyOncontainercomplete(ConfigNodePropertyBoolean notifyOncontainercomplete) {
    this.notifyOncontainercomplete = notifyOncontainercomplete;
  }

  public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties notifyOncontainercomplete(ConfigNodePropertyBoolean notifyOncontainercomplete) {
    this.notifyOncontainercomplete = notifyOncontainercomplete;
    return this;
  }

 /**
   * Get notifyUseronly
   * @return notifyUseronly
  **/
  @JsonProperty("notify.useronly")
  public ConfigNodePropertyBoolean getNotifyUseronly() {
    return notifyUseronly;
  }

  public void setNotifyUseronly(ConfigNodePropertyBoolean notifyUseronly) {
    this.notifyUseronly = notifyUseronly;
  }

  public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties notifyUseronly(ConfigNodePropertyBoolean notifyUseronly) {
    this.notifyUseronly = notifyUseronly;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties {\n");
    
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    hostPrefix: ").append(toIndentedString(hostPrefix)).append("\n");
    sb.append("    notifyOnabort: ").append(toIndentedString(notifyOnabort)).append("\n");
    sb.append("    notifyOncomplete: ").append(toIndentedString(notifyOncomplete)).append("\n");
    sb.append("    notifyOncontainercomplete: ").append(toIndentedString(notifyOncontainercomplete)).append("\n");
    sb.append("    notifyUseronly: ").append(toIndentedString(notifyUseronly)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

