package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWorkflowImplEmailEMailNotificationServiceProperties
 */

@JsonTypeName("comDayCqWorkflowImplEmailEMailNotificationServiceProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString fromAddress;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString hostPrefix;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean notifyOnabort;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean notifyOncomplete;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean notifyOncontainercomplete;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean notifyUseronly;

  public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties fromAddress(@Nullable ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

  /**
   * Get fromAddress
   * @return fromAddress
   */
  @Valid 
  @Schema(name = "from.address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("from.address")
  public @Nullable ConfigNodePropertyString getFromAddress() {
    return fromAddress;
  }

  @JsonProperty("from.address")
  public void setFromAddress(@Nullable ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
  }

  public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties hostPrefix(@Nullable ConfigNodePropertyString hostPrefix) {
    this.hostPrefix = hostPrefix;
    return this;
  }

  /**
   * Get hostPrefix
   * @return hostPrefix
   */
  @Valid 
  @Schema(name = "host.prefix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("host.prefix")
  public @Nullable ConfigNodePropertyString getHostPrefix() {
    return hostPrefix;
  }

  @JsonProperty("host.prefix")
  public void setHostPrefix(@Nullable ConfigNodePropertyString hostPrefix) {
    this.hostPrefix = hostPrefix;
  }

  public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties notifyOnabort(@Nullable ConfigNodePropertyBoolean notifyOnabort) {
    this.notifyOnabort = notifyOnabort;
    return this;
  }

  /**
   * Get notifyOnabort
   * @return notifyOnabort
   */
  @Valid 
  @Schema(name = "notify.onabort", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notify.onabort")
  public @Nullable ConfigNodePropertyBoolean getNotifyOnabort() {
    return notifyOnabort;
  }

  @JsonProperty("notify.onabort")
  public void setNotifyOnabort(@Nullable ConfigNodePropertyBoolean notifyOnabort) {
    this.notifyOnabort = notifyOnabort;
  }

  public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties notifyOncomplete(@Nullable ConfigNodePropertyBoolean notifyOncomplete) {
    this.notifyOncomplete = notifyOncomplete;
    return this;
  }

  /**
   * Get notifyOncomplete
   * @return notifyOncomplete
   */
  @Valid 
  @Schema(name = "notify.oncomplete", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notify.oncomplete")
  public @Nullable ConfigNodePropertyBoolean getNotifyOncomplete() {
    return notifyOncomplete;
  }

  @JsonProperty("notify.oncomplete")
  public void setNotifyOncomplete(@Nullable ConfigNodePropertyBoolean notifyOncomplete) {
    this.notifyOncomplete = notifyOncomplete;
  }

  public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties notifyOncontainercomplete(@Nullable ConfigNodePropertyBoolean notifyOncontainercomplete) {
    this.notifyOncontainercomplete = notifyOncontainercomplete;
    return this;
  }

  /**
   * Get notifyOncontainercomplete
   * @return notifyOncontainercomplete
   */
  @Valid 
  @Schema(name = "notify.oncontainercomplete", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notify.oncontainercomplete")
  public @Nullable ConfigNodePropertyBoolean getNotifyOncontainercomplete() {
    return notifyOncontainercomplete;
  }

  @JsonProperty("notify.oncontainercomplete")
  public void setNotifyOncontainercomplete(@Nullable ConfigNodePropertyBoolean notifyOncontainercomplete) {
    this.notifyOncontainercomplete = notifyOncontainercomplete;
  }

  public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties notifyUseronly(@Nullable ConfigNodePropertyBoolean notifyUseronly) {
    this.notifyUseronly = notifyUseronly;
    return this;
  }

  /**
   * Get notifyUseronly
   * @return notifyUseronly
   */
  @Valid 
  @Schema(name = "notify.useronly", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notify.useronly")
  public @Nullable ConfigNodePropertyBoolean getNotifyUseronly() {
    return notifyUseronly;
  }

  @JsonProperty("notify.useronly")
  public void setNotifyUseronly(@Nullable ConfigNodePropertyBoolean notifyUseronly) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

