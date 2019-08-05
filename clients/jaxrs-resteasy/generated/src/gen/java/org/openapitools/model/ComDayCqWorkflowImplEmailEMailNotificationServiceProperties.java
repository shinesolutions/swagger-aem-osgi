package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties   {
  
  private ConfigNodePropertyString fromAddress = null;
  private ConfigNodePropertyString hostPrefix = null;
  private ConfigNodePropertyBoolean notifyOnabort = null;
  private ConfigNodePropertyBoolean notifyOncomplete = null;
  private ConfigNodePropertyBoolean notifyOncontainercomplete = null;
  private ConfigNodePropertyBoolean notifyUseronly = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("from.address")
  public ConfigNodePropertyString getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("host.prefix")
  public ConfigNodePropertyString getHostPrefix() {
    return hostPrefix;
  }
  public void setHostPrefix(ConfigNodePropertyString hostPrefix) {
    this.hostPrefix = hostPrefix;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notify.onabort")
  public ConfigNodePropertyBoolean getNotifyOnabort() {
    return notifyOnabort;
  }
  public void setNotifyOnabort(ConfigNodePropertyBoolean notifyOnabort) {
    this.notifyOnabort = notifyOnabort;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notify.oncomplete")
  public ConfigNodePropertyBoolean getNotifyOncomplete() {
    return notifyOncomplete;
  }
  public void setNotifyOncomplete(ConfigNodePropertyBoolean notifyOncomplete) {
    this.notifyOncomplete = notifyOncomplete;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notify.oncontainercomplete")
  public ConfigNodePropertyBoolean getNotifyOncontainercomplete() {
    return notifyOncontainercomplete;
  }
  public void setNotifyOncontainercomplete(ConfigNodePropertyBoolean notifyOncontainercomplete) {
    this.notifyOncontainercomplete = notifyOncontainercomplete;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("notify.useronly")
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
    return Objects.equals(fromAddress, comDayCqWorkflowImplEmailEMailNotificationServiceProperties.fromAddress) &&
        Objects.equals(hostPrefix, comDayCqWorkflowImplEmailEMailNotificationServiceProperties.hostPrefix) &&
        Objects.equals(notifyOnabort, comDayCqWorkflowImplEmailEMailNotificationServiceProperties.notifyOnabort) &&
        Objects.equals(notifyOncomplete, comDayCqWorkflowImplEmailEMailNotificationServiceProperties.notifyOncomplete) &&
        Objects.equals(notifyOncontainercomplete, comDayCqWorkflowImplEmailEMailNotificationServiceProperties.notifyOncontainercomplete) &&
        Objects.equals(notifyUseronly, comDayCqWorkflowImplEmailEMailNotificationServiceProperties.notifyUseronly);
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

