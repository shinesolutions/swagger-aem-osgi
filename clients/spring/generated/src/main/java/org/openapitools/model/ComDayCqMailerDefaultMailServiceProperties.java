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
import org.springframework.lang.Nullable;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqMailerDefaultMailServiceProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString smtpHost;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger smtpPort;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString smtpUser;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString smtpPassword;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString fromAddress;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean smtpSsl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean smtpStarttls;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean debugEmail;

  public ComDayCqMailerDefaultMailServiceProperties smtpHost(@Nullable ConfigNodePropertyString smtpHost) {
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
  public @Nullable ConfigNodePropertyString getSmtpHost() {
    return smtpHost;
  }

  @JsonProperty("smtp.host")
  public void setSmtpHost(@Nullable ConfigNodePropertyString smtpHost) {
    this.smtpHost = smtpHost;
  }

  public ComDayCqMailerDefaultMailServiceProperties smtpPort(@Nullable ConfigNodePropertyInteger smtpPort) {
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
  public @Nullable ConfigNodePropertyInteger getSmtpPort() {
    return smtpPort;
  }

  @JsonProperty("smtp.port")
  public void setSmtpPort(@Nullable ConfigNodePropertyInteger smtpPort) {
    this.smtpPort = smtpPort;
  }

  public ComDayCqMailerDefaultMailServiceProperties smtpUser(@Nullable ConfigNodePropertyString smtpUser) {
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
  public @Nullable ConfigNodePropertyString getSmtpUser() {
    return smtpUser;
  }

  @JsonProperty("smtp.user")
  public void setSmtpUser(@Nullable ConfigNodePropertyString smtpUser) {
    this.smtpUser = smtpUser;
  }

  public ComDayCqMailerDefaultMailServiceProperties smtpPassword(@Nullable ConfigNodePropertyString smtpPassword) {
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
  public @Nullable ConfigNodePropertyString getSmtpPassword() {
    return smtpPassword;
  }

  @JsonProperty("smtp.password")
  public void setSmtpPassword(@Nullable ConfigNodePropertyString smtpPassword) {
    this.smtpPassword = smtpPassword;
  }

  public ComDayCqMailerDefaultMailServiceProperties fromAddress(@Nullable ConfigNodePropertyString fromAddress) {
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

  public ComDayCqMailerDefaultMailServiceProperties smtpSsl(@Nullable ConfigNodePropertyBoolean smtpSsl) {
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
  public @Nullable ConfigNodePropertyBoolean getSmtpSsl() {
    return smtpSsl;
  }

  @JsonProperty("smtp.ssl")
  public void setSmtpSsl(@Nullable ConfigNodePropertyBoolean smtpSsl) {
    this.smtpSsl = smtpSsl;
  }

  public ComDayCqMailerDefaultMailServiceProperties smtpStarttls(@Nullable ConfigNodePropertyBoolean smtpStarttls) {
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
  public @Nullable ConfigNodePropertyBoolean getSmtpStarttls() {
    return smtpStarttls;
  }

  @JsonProperty("smtp.starttls")
  public void setSmtpStarttls(@Nullable ConfigNodePropertyBoolean smtpStarttls) {
    this.smtpStarttls = smtpStarttls;
  }

  public ComDayCqMailerDefaultMailServiceProperties debugEmail(@Nullable ConfigNodePropertyBoolean debugEmail) {
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
  public @Nullable ConfigNodePropertyBoolean getDebugEmail() {
    return debugEmail;
  }

  @JsonProperty("debug.email")
  public void setDebugEmail(@Nullable ConfigNodePropertyBoolean debugEmail) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

