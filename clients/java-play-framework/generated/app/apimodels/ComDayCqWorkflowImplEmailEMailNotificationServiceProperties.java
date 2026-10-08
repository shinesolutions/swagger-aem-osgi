package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqWorkflowImplEmailEMailNotificationServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties   {
  @JsonProperty("from.address")
  @Valid

  private ConfigNodePropertyString fromAddress;

  @JsonProperty("host.prefix")
  @Valid

  private ConfigNodePropertyString hostPrefix;

  @JsonProperty("notify.onabort")
  @Valid

  private ConfigNodePropertyBoolean notifyOnabort;

  @JsonProperty("notify.oncomplete")
  @Valid

  private ConfigNodePropertyBoolean notifyOncomplete;

  @JsonProperty("notify.oncontainercomplete")
  @Valid

  private ConfigNodePropertyBoolean notifyOncontainercomplete;

  @JsonProperty("notify.useronly")
  @Valid

  private ConfigNodePropertyBoolean notifyUseronly;

  public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties fromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * Get fromAddress
   * @return fromAddress
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

