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
 * OrgApacheHttpProxyconfiguratorProperties
 */

@JsonTypeName("orgApacheHttpProxyconfiguratorProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheHttpProxyconfiguratorProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean proxyEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString proxyHost;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger proxyPort;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString proxyUser;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString proxyPassword;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray proxyExceptions;

  public OrgApacheHttpProxyconfiguratorProperties proxyEnabled(@Nullable ConfigNodePropertyBoolean proxyEnabled) {
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
  public @Nullable ConfigNodePropertyBoolean getProxyEnabled() {
    return proxyEnabled;
  }

  @JsonProperty("proxy.enabled")
  public void setProxyEnabled(@Nullable ConfigNodePropertyBoolean proxyEnabled) {
    this.proxyEnabled = proxyEnabled;
  }

  public OrgApacheHttpProxyconfiguratorProperties proxyHost(@Nullable ConfigNodePropertyString proxyHost) {
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
  public @Nullable ConfigNodePropertyString getProxyHost() {
    return proxyHost;
  }

  @JsonProperty("proxy.host")
  public void setProxyHost(@Nullable ConfigNodePropertyString proxyHost) {
    this.proxyHost = proxyHost;
  }

  public OrgApacheHttpProxyconfiguratorProperties proxyPort(@Nullable ConfigNodePropertyInteger proxyPort) {
    this.proxyPort = proxyPort;
    return this;
  }

  /**
   * Get proxyPort
   * @return proxyPort
   */
  @Valid 
  @Schema(name = "proxy.port", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("proxy.port")
  public @Nullable ConfigNodePropertyInteger getProxyPort() {
    return proxyPort;
  }

  @JsonProperty("proxy.port")
  public void setProxyPort(@Nullable ConfigNodePropertyInteger proxyPort) {
    this.proxyPort = proxyPort;
  }

  public OrgApacheHttpProxyconfiguratorProperties proxyUser(@Nullable ConfigNodePropertyString proxyUser) {
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
  public @Nullable ConfigNodePropertyString getProxyUser() {
    return proxyUser;
  }

  @JsonProperty("proxy.user")
  public void setProxyUser(@Nullable ConfigNodePropertyString proxyUser) {
    this.proxyUser = proxyUser;
  }

  public OrgApacheHttpProxyconfiguratorProperties proxyPassword(@Nullable ConfigNodePropertyString proxyPassword) {
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
  public @Nullable ConfigNodePropertyString getProxyPassword() {
    return proxyPassword;
  }

  @JsonProperty("proxy.password")
  public void setProxyPassword(@Nullable ConfigNodePropertyString proxyPassword) {
    this.proxyPassword = proxyPassword;
  }

  public OrgApacheHttpProxyconfiguratorProperties proxyExceptions(@Nullable ConfigNodePropertyArray proxyExceptions) {
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
  public @Nullable ConfigNodePropertyArray getProxyExceptions() {
    return proxyExceptions;
  }

  @JsonProperty("proxy.exceptions")
  public void setProxyExceptions(@Nullable ConfigNodePropertyArray proxyExceptions) {
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
    OrgApacheHttpProxyconfiguratorProperties orgApacheHttpProxyconfiguratorProperties = (OrgApacheHttpProxyconfiguratorProperties) o;
    return Objects.equals(this.proxyEnabled, orgApacheHttpProxyconfiguratorProperties.proxyEnabled) &&
        Objects.equals(this.proxyHost, orgApacheHttpProxyconfiguratorProperties.proxyHost) &&
        Objects.equals(this.proxyPort, orgApacheHttpProxyconfiguratorProperties.proxyPort) &&
        Objects.equals(this.proxyUser, orgApacheHttpProxyconfiguratorProperties.proxyUser) &&
        Objects.equals(this.proxyPassword, orgApacheHttpProxyconfiguratorProperties.proxyPassword) &&
        Objects.equals(this.proxyExceptions, orgApacheHttpProxyconfiguratorProperties.proxyExceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proxyEnabled, proxyHost, proxyPort, proxyUser, proxyPassword, proxyExceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheHttpProxyconfiguratorProperties {\n");
    sb.append("    proxyEnabled: ").append(toIndentedString(proxyEnabled)).append("\n");
    sb.append("    proxyHost: ").append(toIndentedString(proxyHost)).append("\n");
    sb.append("    proxyPort: ").append(toIndentedString(proxyPort)).append("\n");
    sb.append("    proxyUser: ").append(toIndentedString(proxyUser)).append("\n");
    sb.append("    proxyPassword: ").append(toIndentedString(proxyPassword)).append("\n");
    sb.append("    proxyExceptions: ").append(toIndentedString(proxyExceptions)).append("\n");
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

