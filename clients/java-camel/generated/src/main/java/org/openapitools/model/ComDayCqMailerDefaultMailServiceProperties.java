package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqMailerDefaultMailServiceProperties
 */

@JsonTypeName("comDayCqMailerDefaultMailServiceProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqMailerDefaultMailServiceProperties {

  private ConfigNodePropertyString smtpHost;

  private ConfigNodePropertyInteger smtpPort;

  private ConfigNodePropertyString smtpUser;

  private ConfigNodePropertyString smtpPassword;

  private ConfigNodePropertyString fromAddress;

  private ConfigNodePropertyBoolean smtpSsl;

  private ConfigNodePropertyBoolean smtpStarttls;

  private ConfigNodePropertyBoolean debugEmail;

  public ComDayCqMailerDefaultMailServiceProperties smtpHost(ConfigNodePropertyString smtpHost) {
    this.smtpHost = smtpHost;
    return this;
  }

  /**
   * Get smtpHost
   * @return smtpHost
   */
  @Valid 
  @Schema(name = "smtp.host", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("smtp.host")
  public ConfigNodePropertyString getSmtpHost() {
    return smtpHost;
  }

  public void setSmtpHost(ConfigNodePropertyString smtpHost) {
    this.smtpHost = smtpHost;
  }

  public ComDayCqMailerDefaultMailServiceProperties smtpPort(ConfigNodePropertyInteger smtpPort) {
    this.smtpPort = smtpPort;
    return this;
  }

  /**
   * Get smtpPort
   * @return smtpPort
   */
  @Valid 
  @Schema(name = "smtp.port", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("smtp.port")
  public ConfigNodePropertyInteger getSmtpPort() {
    return smtpPort;
  }

  public void setSmtpPort(ConfigNodePropertyInteger smtpPort) {
    this.smtpPort = smtpPort;
  }

  public ComDayCqMailerDefaultMailServiceProperties smtpUser(ConfigNodePropertyString smtpUser) {
    this.smtpUser = smtpUser;
    return this;
  }

  /**
   * Get smtpUser
   * @return smtpUser
   */
  @Valid 
  @Schema(name = "smtp.user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("smtp.user")
  public ConfigNodePropertyString getSmtpUser() {
    return smtpUser;
  }

  public void setSmtpUser(ConfigNodePropertyString smtpUser) {
    this.smtpUser = smtpUser;
  }

  public ComDayCqMailerDefaultMailServiceProperties smtpPassword(ConfigNodePropertyString smtpPassword) {
    this.smtpPassword = smtpPassword;
    return this;
  }

  /**
   * Get smtpPassword
   * @return smtpPassword
   */
  @Valid 
  @Schema(name = "smtp.password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("smtp.password")
  public ConfigNodePropertyString getSmtpPassword() {
    return smtpPassword;
  }

  public void setSmtpPassword(ConfigNodePropertyString smtpPassword) {
    this.smtpPassword = smtpPassword;
  }

  public ComDayCqMailerDefaultMailServiceProperties fromAddress(ConfigNodePropertyString fromAddress) {
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
  public ConfigNodePropertyString getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(ConfigNodePropertyString fromAddress) {
    this.fromAddress = fromAddress;
  }

  public ComDayCqMailerDefaultMailServiceProperties smtpSsl(ConfigNodePropertyBoolean smtpSsl) {
    this.smtpSsl = smtpSsl;
    return this;
  }

  /**
   * Get smtpSsl
   * @return smtpSsl
   */
  @Valid 
  @Schema(name = "smtp.ssl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("smtp.ssl")
  public ConfigNodePropertyBoolean getSmtpSsl() {
    return smtpSsl;
  }

  public void setSmtpSsl(ConfigNodePropertyBoolean smtpSsl) {
    this.smtpSsl = smtpSsl;
  }

  public ComDayCqMailerDefaultMailServiceProperties smtpStarttls(ConfigNodePropertyBoolean smtpStarttls) {
    this.smtpStarttls = smtpStarttls;
    return this;
  }

  /**
   * Get smtpStarttls
   * @return smtpStarttls
   */
  @Valid 
  @Schema(name = "smtp.starttls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("smtp.starttls")
  public ConfigNodePropertyBoolean getSmtpStarttls() {
    return smtpStarttls;
  }

  public void setSmtpStarttls(ConfigNodePropertyBoolean smtpStarttls) {
    this.smtpStarttls = smtpStarttls;
  }

  public ComDayCqMailerDefaultMailServiceProperties debugEmail(ConfigNodePropertyBoolean debugEmail) {
    this.debugEmail = debugEmail;
    return this;
  }

  /**
   * Get debugEmail
   * @return debugEmail
   */
  @Valid 
  @Schema(name = "debug.email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("debug.email")
  public ConfigNodePropertyBoolean getDebugEmail() {
    return debugEmail;
  }

  public void setDebugEmail(ConfigNodePropertyBoolean debugEmail) {
    this.debugEmail = debugEmail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqMailerDefaultMailServiceProperties comDayCqMailerDefaultMailServiceProperties = (ComDayCqMailerDefaultMailServiceProperties) o;
    return Objects.equals(this.smtpHost, comDayCqMailerDefaultMailServiceProperties.smtpHost) &&
        Objects.equals(this.smtpPort, comDayCqMailerDefaultMailServiceProperties.smtpPort) &&
        Objects.equals(this.smtpUser, comDayCqMailerDefaultMailServiceProperties.smtpUser) &&
        Objects.equals(this.smtpPassword, comDayCqMailerDefaultMailServiceProperties.smtpPassword) &&
        Objects.equals(this.fromAddress, comDayCqMailerDefaultMailServiceProperties.fromAddress) &&
        Objects.equals(this.smtpSsl, comDayCqMailerDefaultMailServiceProperties.smtpSsl) &&
        Objects.equals(this.smtpStarttls, comDayCqMailerDefaultMailServiceProperties.smtpStarttls) &&
        Objects.equals(this.debugEmail, comDayCqMailerDefaultMailServiceProperties.debugEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smtpHost, smtpPort, smtpUser, smtpPassword, fromAddress, smtpSsl, smtpStarttls, debugEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqMailerDefaultMailServiceProperties {\n");
    sb.append("    smtpHost: ").append(toIndentedString(smtpHost)).append("\n");
    sb.append("    smtpPort: ").append(toIndentedString(smtpPort)).append("\n");
    sb.append("    smtpUser: ").append(toIndentedString(smtpUser)).append("\n");
    sb.append("    smtpPassword: ").append(toIndentedString(smtpPassword)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    smtpSsl: ").append(toIndentedString(smtpSsl)).append("\n");
    sb.append("    smtpStarttls: ").append(toIndentedString(smtpStarttls)).append("\n");
    sb.append("    debugEmail: ").append(toIndentedString(debugEmail)).append("\n");
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

