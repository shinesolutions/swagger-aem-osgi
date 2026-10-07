package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
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
 * ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties
 */

@JsonTypeName("comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword;

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath(@Nullable ConfigNodePropertyArray comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath;
    return this;
  }

  /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath
   */
  @Valid 
  @Schema(name = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath")
  public @Nullable ConfigNodePropertyArray getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath;
  }

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath")
  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath(@Nullable ConfigNodePropertyArray comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency(@Nullable ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency;
    return this;
  }

  /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency
   */
  @Valid 
  @Schema(name = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency")
  public @Nullable ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency;
  }

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency")
  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency(@Nullable ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout(@Nullable ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout;
    return this;
  }

  /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout
   */
  @Valid 
  @Schema(name = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout")
  public @Nullable ConfigNodePropertyInteger getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout;
  }

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout")
  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout(@Nullable ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients(@Nullable ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients;
    return this;
  }

  /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients
   */
  @Valid 
  @Schema(name = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients")
  public @Nullable ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients;
  }

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients")
  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients(@Nullable ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver(@Nullable ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver;
    return this;
  }

  /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver
   */
  @Valid 
  @Schema(name = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver")
  public @Nullable ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver;
  }

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver")
  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver(@Nullable ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport(@Nullable ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport;
    return this;
  }

  /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport
   */
  @Valid 
  @Schema(name = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport")
  public @Nullable ConfigNodePropertyInteger getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport;
  }

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport")
  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport(@Nullable ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls(@Nullable ConfigNodePropertyBoolean comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls;
    return this;
  }

  /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls
   */
  @Valid 
  @Schema(name = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls")
  public @Nullable ConfigNodePropertyBoolean getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls;
  }

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls")
  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls(@Nullable ConfigNodePropertyBoolean comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername(@Nullable ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername;
    return this;
  }

  /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername
   */
  @Valid 
  @Schema(name = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username")
  public @Nullable ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername;
  }

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username")
  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername(@Nullable ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername;
  }

  public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword(@Nullable ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword;
    return this;
  }

  /**
   * Get comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword
   * @return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword
   */
  @Valid 
  @Schema(name = "com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password")
  public @Nullable ConfigNodePropertyString getComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword() {
    return comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword;
  }

  @JsonProperty("com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password")
  public void setComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword(@Nullable ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword) {
    this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties = (ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties) o;
    return Objects.equals(this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath) &&
        Objects.equals(this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency) &&
        Objects.equals(this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout) &&
        Objects.equals(this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients) &&
        Objects.equals(this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver) &&
        Objects.equals(this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport) &&
        Objects.equals(this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls) &&
        Objects.equals(this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername) &&
        Objects.equals(this.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties {\n");
    sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath)).append("\n");
    sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency)).append("\n");
    sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout)).append("\n");
    sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients)).append("\n");
    sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver)).append("\n");
    sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport)).append("\n");
    sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls)).append("\n");
    sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername)).append("\n");
    sb.append("    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword: ").append(toIndentedString(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword)).append("\n");
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

