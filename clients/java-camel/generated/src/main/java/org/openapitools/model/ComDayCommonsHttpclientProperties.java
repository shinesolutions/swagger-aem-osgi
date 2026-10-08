package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCommonsHttpclientProperties
 */

@JsonTypeName("comDayCommonsHttpclientProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCommonsHttpclientProperties {

  private ConfigNodePropertyBoolean proxyEnabled;

  private ConfigNodePropertyString proxyHost;

  private ConfigNodePropertyString proxyUser;

  private ConfigNodePropertyString proxyPassword;

  private ConfigNodePropertyString proxyNtlmHost;

  private ConfigNodePropertyString proxyNtlmDomain;

  private ConfigNodePropertyArray proxyExceptions;

  public ComDayCommonsHttpclientProperties proxyEnabled(ConfigNodePropertyBoolean proxyEnabled) {
    this.proxyEnabled = proxyEnabled;
    return this;
  }

  /**
   * Get proxyEnabled
   * @return proxyEnabled
   */
  @Valid 
  @Schema(name = "proxy.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("proxy.enabled")
  public ConfigNodePropertyBoolean getProxyEnabled() {
    return proxyEnabled;
  }

  public void setProxyEnabled(ConfigNodePropertyBoolean proxyEnabled) {
    this.proxyEnabled = proxyEnabled;
  }

  public ComDayCommonsHttpclientProperties proxyHost(ConfigNodePropertyString proxyHost) {
    this.proxyHost = proxyHost;
    return this;
  }

  /**
   * Get proxyHost
   * @return proxyHost
   */
  @Valid 
  @Schema(name = "proxy.host", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("proxy.host")
  public ConfigNodePropertyString getProxyHost() {
    return proxyHost;
  }

  public void setProxyHost(ConfigNodePropertyString proxyHost) {
    this.proxyHost = proxyHost;
  }

  public ComDayCommonsHttpclientProperties proxyUser(ConfigNodePropertyString proxyUser) {
    this.proxyUser = proxyUser;
    return this;
  }

  /**
   * Get proxyUser
   * @return proxyUser
   */
  @Valid 
  @Schema(name = "proxy.user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("proxy.user")
  public ConfigNodePropertyString getProxyUser() {
    return proxyUser;
  }

  public void setProxyUser(ConfigNodePropertyString proxyUser) {
    this.proxyUser = proxyUser;
  }

  public ComDayCommonsHttpclientProperties proxyPassword(ConfigNodePropertyString proxyPassword) {
    this.proxyPassword = proxyPassword;
    return this;
  }

  /**
   * Get proxyPassword
   * @return proxyPassword
   */
  @Valid 
  @Schema(name = "proxy.password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("proxy.password")
  public ConfigNodePropertyString getProxyPassword() {
    return proxyPassword;
  }

  public void setProxyPassword(ConfigNodePropertyString proxyPassword) {
    this.proxyPassword = proxyPassword;
  }

  public ComDayCommonsHttpclientProperties proxyNtlmHost(ConfigNodePropertyString proxyNtlmHost) {
    this.proxyNtlmHost = proxyNtlmHost;
    return this;
  }

  /**
   * Get proxyNtlmHost
   * @return proxyNtlmHost
   */
  @Valid 
  @Schema(name = "proxy.ntlm.host", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("proxy.ntlm.host")
  public ConfigNodePropertyString getProxyNtlmHost() {
    return proxyNtlmHost;
  }

  public void setProxyNtlmHost(ConfigNodePropertyString proxyNtlmHost) {
    this.proxyNtlmHost = proxyNtlmHost;
  }

  public ComDayCommonsHttpclientProperties proxyNtlmDomain(ConfigNodePropertyString proxyNtlmDomain) {
    this.proxyNtlmDomain = proxyNtlmDomain;
    return this;
  }

  /**
   * Get proxyNtlmDomain
   * @return proxyNtlmDomain
   */
  @Valid 
  @Schema(name = "proxy.ntlm.domain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("proxy.ntlm.domain")
  public ConfigNodePropertyString getProxyNtlmDomain() {
    return proxyNtlmDomain;
  }

  public void setProxyNtlmDomain(ConfigNodePropertyString proxyNtlmDomain) {
    this.proxyNtlmDomain = proxyNtlmDomain;
  }

  public ComDayCommonsHttpclientProperties proxyExceptions(ConfigNodePropertyArray proxyExceptions) {
    this.proxyExceptions = proxyExceptions;
    return this;
  }

  /**
   * Get proxyExceptions
   * @return proxyExceptions
   */
  @Valid 
  @Schema(name = "proxy.exceptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("proxy.exceptions")
  public ConfigNodePropertyArray getProxyExceptions() {
    return proxyExceptions;
  }

  public void setProxyExceptions(ConfigNodePropertyArray proxyExceptions) {
    this.proxyExceptions = proxyExceptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCommonsHttpclientProperties comDayCommonsHttpclientProperties = (ComDayCommonsHttpclientProperties) o;
    return Objects.equals(this.proxyEnabled, comDayCommonsHttpclientProperties.proxyEnabled) &&
        Objects.equals(this.proxyHost, comDayCommonsHttpclientProperties.proxyHost) &&
        Objects.equals(this.proxyUser, comDayCommonsHttpclientProperties.proxyUser) &&
        Objects.equals(this.proxyPassword, comDayCommonsHttpclientProperties.proxyPassword) &&
        Objects.equals(this.proxyNtlmHost, comDayCommonsHttpclientProperties.proxyNtlmHost) &&
        Objects.equals(this.proxyNtlmDomain, comDayCommonsHttpclientProperties.proxyNtlmDomain) &&
        Objects.equals(this.proxyExceptions, comDayCommonsHttpclientProperties.proxyExceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proxyEnabled, proxyHost, proxyUser, proxyPassword, proxyNtlmHost, proxyNtlmDomain, proxyExceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCommonsHttpclientProperties {\n");
    sb.append("    proxyEnabled: ").append(toIndentedString(proxyEnabled)).append("\n");
    sb.append("    proxyHost: ").append(toIndentedString(proxyHost)).append("\n");
    sb.append("    proxyUser: ").append(toIndentedString(proxyUser)).append("\n");
    sb.append("    proxyPassword: ").append(toIndentedString(proxyPassword)).append("\n");
    sb.append("    proxyNtlmHost: ").append(toIndentedString(proxyNtlmHost)).append("\n");
    sb.append("    proxyNtlmDomain: ").append(toIndentedString(proxyNtlmDomain)).append("\n");
    sb.append("    proxyExceptions: ").append(toIndentedString(proxyExceptions)).append("\n");
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

