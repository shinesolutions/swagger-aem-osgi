package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComDayCqWorkflowImplEmailEMailNotificationServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties   {
  @JsonProperty("from.address")
  private ConfigNodePropertyString fromAddress = null;

  @JsonProperty("host.prefix")
  private ConfigNodePropertyString hostPrefix = null;

  @JsonProperty("notify.onabort")
  private ConfigNodePropertyBoolean notifyOnabort = null;

  @JsonProperty("notify.oncomplete")
  private ConfigNodePropertyBoolean notifyOncomplete = null;

  @JsonProperty("notify.oncontainercomplete")
  private ConfigNodePropertyBoolean notifyOncontainercomplete = null;

  @JsonProperty("notify.useronly")
  private ConfigNodePropertyBoolean notifyUseronly = null;

  public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties fromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

  /**
   * Get fromAddress
   * @return fromAddress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
  }

  public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties hostPrefix(ConfigNodePropertyString hostPrefix) {
    this.hostPrefix = hostPrefix;
    return this;
  }

  /**
   * Get hostPrefix
   * @return hostPrefix
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getHostPrefix() {
    return hostPrefix;
  }

  public void setHostPrefix(ConfigNodePropertyString hostPrefix) {
    this.hostPrefix = hostPrefix;
  }

  public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties notifyOnabort(ConfigNodePropertyBoolean notifyOnabort) {
    this.notifyOnabort = notifyOnabort;
    return this;
  }

  /**
   * Get notifyOnabort
   * @return notifyOnabort
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getNotifyOnabort() {
    return notifyOnabort;
  }

  public void setNotifyOnabort(ConfigNodePropertyBoolean notifyOnabort) {
    this.notifyOnabort = notifyOnabort;
  }

  public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties notifyOncomplete(ConfigNodePropertyBoolean notifyOncomplete) {
    this.notifyOncomplete = notifyOncomplete;
    return this;
  }

  /**
   * Get notifyOncomplete
   * @return notifyOncomplete
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getNotifyOncomplete() {
    return notifyOncomplete;
  }

  public void setNotifyOncomplete(ConfigNodePropertyBoolean notifyOncomplete) {
    this.notifyOncomplete = notifyOncomplete;
  }

  public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties notifyOncontainercomplete(ConfigNodePropertyBoolean notifyOncontainercomplete) {
    this.notifyOncontainercomplete = notifyOncontainercomplete;
    return this;
  }

  /**
   * Get notifyOncontainercomplete
   * @return notifyOncontainercomplete
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getNotifyOncontainercomplete() {
    return notifyOncontainercomplete;
  }

  public void setNotifyOncontainercomplete(ConfigNodePropertyBoolean notifyOncontainercomplete) {
    this.notifyOncontainercomplete = notifyOncontainercomplete;
  }

  public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties notifyUseronly(ConfigNodePropertyBoolean notifyUseronly) {
    this.notifyUseronly = notifyUseronly;
    return this;
  }

  /**
   * Get notifyUseronly
   * @return notifyUseronly
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getNotifyUseronly() {
    return notifyUseronly;
  }

  public void setNotifyUseronly(ConfigNodePropertyBoolean notifyUseronly) {
    this.notifyUseronly = notifyUseronly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWorkflowImplEmailEMailNotificationServiceProperties comDayCqWorkflowImplEmailEMailNotificationServiceProperties = (ComDayCqWorkflowImplEmailEMailNotificationServiceProperties) o;
    return Objects.equals(this.fromAddress, comDayCqWorkflowImplEmailEMailNotificationServiceProperties.fromAddress) &&
        Objects.equals(this.hostPrefix, comDayCqWorkflowImplEmailEMailNotificationServiceProperties.hostPrefix) &&
        Objects.equals(this.notifyOnabort, comDayCqWorkflowImplEmailEMailNotificationServiceProperties.notifyOnabort) &&
        Objects.equals(this.notifyOncomplete, comDayCqWorkflowImplEmailEMailNotificationServiceProperties.notifyOncomplete) &&
        Objects.equals(this.notifyOncontainercomplete, comDayCqWorkflowImplEmailEMailNotificationServiceProperties.notifyOncontainercomplete) &&
        Objects.equals(this.notifyUseronly, comDayCqWorkflowImplEmailEMailNotificationServiceProperties.notifyUseronly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAddress, hostPrefix, notifyOnabort, notifyOncomplete, notifyOncontainercomplete, notifyUseronly);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

