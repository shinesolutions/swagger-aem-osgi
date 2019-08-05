package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties   {
  
  private ConfigNodePropertyString fromAddress = null;
  private ConfigNodePropertyString hostPrefix = null;
  private ConfigNodePropertyBoolean notifyOnabort = null;
  private ConfigNodePropertyBoolean notifyOncomplete = null;
  private ConfigNodePropertyBoolean notifyOncontainercomplete = null;
  private ConfigNodePropertyBoolean notifyUseronly = null;

  public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties () {

  }

  public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties (ConfigNodePropertyString fromAddress, ConfigNodePropertyString hostPrefix, ConfigNodePropertyBoolean notifyOnabort, ConfigNodePropertyBoolean notifyOncomplete, ConfigNodePropertyBoolean notifyOncontainercomplete, ConfigNodePropertyBoolean notifyUseronly) {
    this.fromAddress = fromAddress;
    this.hostPrefix = hostPrefix;
    this.notifyOnabort = notifyOnabort;
    this.notifyOncomplete = notifyOncomplete;
    this.notifyOncontainercomplete = notifyOncontainercomplete;
    this.notifyUseronly = notifyUseronly;
  }

    
  @JsonProperty("from.address")
  public ConfigNodePropertyString getFromAddress() {
    return fromAddress;
  }
  public void setFromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
  }

    
  @JsonProperty("host.prefix")
  public ConfigNodePropertyString getHostPrefix() {
    return hostPrefix;
  }
  public void setHostPrefix(ConfigNodePropertyString hostPrefix) {
    this.hostPrefix = hostPrefix;
  }

    
  @JsonProperty("notify.onabort")
  public ConfigNodePropertyBoolean getNotifyOnabort() {
    return notifyOnabort;
  }
  public void setNotifyOnabort(ConfigNodePropertyBoolean notifyOnabort) {
    this.notifyOnabort = notifyOnabort;
  }

    
  @JsonProperty("notify.oncomplete")
  public ConfigNodePropertyBoolean getNotifyOncomplete() {
    return notifyOncomplete;
  }
  public void setNotifyOncomplete(ConfigNodePropertyBoolean notifyOncomplete) {
    this.notifyOncomplete = notifyOncomplete;
  }

    
  @JsonProperty("notify.oncontainercomplete")
  public ConfigNodePropertyBoolean getNotifyOncontainercomplete() {
    return notifyOncontainercomplete;
  }
  public void setNotifyOncontainercomplete(ConfigNodePropertyBoolean notifyOncontainercomplete) {
    this.notifyOncontainercomplete = notifyOncontainercomplete;
  }

    
  @JsonProperty("notify.useronly")
  public ConfigNodePropertyBoolean getNotifyUseronly() {
    return notifyUseronly;
  }
  public void setNotifyUseronly(ConfigNodePropertyBoolean notifyUseronly) {
    this.notifyUseronly = notifyUseronly;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
