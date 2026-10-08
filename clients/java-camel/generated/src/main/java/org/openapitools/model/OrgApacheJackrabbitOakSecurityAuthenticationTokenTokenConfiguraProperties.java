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
 * OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties
 */

@JsonTypeName("orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties {

  private ConfigNodePropertyString tokenExpiration;

  private ConfigNodePropertyString tokenLength;

  private ConfigNodePropertyBoolean tokenRefresh;

  private ConfigNodePropertyInteger tokenCleanupThreshold;

  private ConfigNodePropertyString passwordHashAlgorithm;

  private ConfigNodePropertyInteger passwordHashIterations;

  private ConfigNodePropertyInteger passwordSaltSize;

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties tokenExpiration(ConfigNodePropertyString tokenExpiration) {
    this.tokenExpiration = tokenExpiration;
    return this;
  }

  /**
   * Get tokenExpiration
   * @return tokenExpiration
   */
  @Valid 
  @Schema(name = "tokenExpiration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tokenExpiration")
  public ConfigNodePropertyString getTokenExpiration() {
    return tokenExpiration;
  }

  public void setTokenExpiration(ConfigNodePropertyString tokenExpiration) {
    this.tokenExpiration = tokenExpiration;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties tokenLength(ConfigNodePropertyString tokenLength) {
    this.tokenLength = tokenLength;
    return this;
  }

  /**
   * Get tokenLength
   * @return tokenLength
   */
  @Valid 
  @Schema(name = "tokenLength", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tokenLength")
  public ConfigNodePropertyString getTokenLength() {
    return tokenLength;
  }

  public void setTokenLength(ConfigNodePropertyString tokenLength) {
    this.tokenLength = tokenLength;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties tokenRefresh(ConfigNodePropertyBoolean tokenRefresh) {
    this.tokenRefresh = tokenRefresh;
    return this;
  }

  /**
   * Get tokenRefresh
   * @return tokenRefresh
   */
  @Valid 
  @Schema(name = "tokenRefresh", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tokenRefresh")
  public ConfigNodePropertyBoolean getTokenRefresh() {
    return tokenRefresh;
  }

  public void setTokenRefresh(ConfigNodePropertyBoolean tokenRefresh) {
    this.tokenRefresh = tokenRefresh;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties tokenCleanupThreshold(ConfigNodePropertyInteger tokenCleanupThreshold) {
    this.tokenCleanupThreshold = tokenCleanupThreshold;
    return this;
  }

  /**
   * Get tokenCleanupThreshold
   * @return tokenCleanupThreshold
   */
  @Valid 
  @Schema(name = "tokenCleanupThreshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tokenCleanupThreshold")
  public ConfigNodePropertyInteger getTokenCleanupThreshold() {
    return tokenCleanupThreshold;
  }

  public void setTokenCleanupThreshold(ConfigNodePropertyInteger tokenCleanupThreshold) {
    this.tokenCleanupThreshold = tokenCleanupThreshold;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties passwordHashAlgorithm(ConfigNodePropertyString passwordHashAlgorithm) {
    this.passwordHashAlgorithm = passwordHashAlgorithm;
    return this;
  }

  /**
   * Get passwordHashAlgorithm
   * @return passwordHashAlgorithm
   */
  @Valid 
  @Schema(name = "passwordHashAlgorithm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passwordHashAlgorithm")
  public ConfigNodePropertyString getPasswordHashAlgorithm() {
    return passwordHashAlgorithm;
  }

  public void setPasswordHashAlgorithm(ConfigNodePropertyString passwordHashAlgorithm) {
    this.passwordHashAlgorithm = passwordHashAlgorithm;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties passwordHashIterations(ConfigNodePropertyInteger passwordHashIterations) {
    this.passwordHashIterations = passwordHashIterations;
    return this;
  }

  /**
   * Get passwordHashIterations
   * @return passwordHashIterations
   */
  @Valid 
  @Schema(name = "passwordHashIterations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passwordHashIterations")
  public ConfigNodePropertyInteger getPasswordHashIterations() {
    return passwordHashIterations;
  }

  public void setPasswordHashIterations(ConfigNodePropertyInteger passwordHashIterations) {
    this.passwordHashIterations = passwordHashIterations;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties passwordSaltSize(ConfigNodePropertyInteger passwordSaltSize) {
    this.passwordSaltSize = passwordSaltSize;
    return this;
  }

  /**
   * Get passwordSaltSize
   * @return passwordSaltSize
   */
  @Valid 
  @Schema(name = "passwordSaltSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passwordSaltSize")
  public ConfigNodePropertyInteger getPasswordSaltSize() {
    return passwordSaltSize;
  }

  public void setPasswordSaltSize(ConfigNodePropertyInteger passwordSaltSize) {
    this.passwordSaltSize = passwordSaltSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties = (OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties) o;
    return Objects.equals(this.tokenExpiration, orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.tokenExpiration) &&
        Objects.equals(this.tokenLength, orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.tokenLength) &&
        Objects.equals(this.tokenRefresh, orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.tokenRefresh) &&
        Objects.equals(this.tokenCleanupThreshold, orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.tokenCleanupThreshold) &&
        Objects.equals(this.passwordHashAlgorithm, orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.passwordHashAlgorithm) &&
        Objects.equals(this.passwordHashIterations, orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.passwordHashIterations) &&
        Objects.equals(this.passwordSaltSize, orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.passwordSaltSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenExpiration, tokenLength, tokenRefresh, tokenCleanupThreshold, passwordHashAlgorithm, passwordHashIterations, passwordSaltSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties {\n");
    sb.append("    tokenExpiration: ").append(toIndentedString(tokenExpiration)).append("\n");
    sb.append("    tokenLength: ").append(toIndentedString(tokenLength)).append("\n");
    sb.append("    tokenRefresh: ").append(toIndentedString(tokenRefresh)).append("\n");
    sb.append("    tokenCleanupThreshold: ").append(toIndentedString(tokenCleanupThreshold)).append("\n");
    sb.append("    passwordHashAlgorithm: ").append(toIndentedString(passwordHashAlgorithm)).append("\n");
    sb.append("    passwordHashIterations: ").append(toIndentedString(passwordHashIterations)).append("\n");
    sb.append("    passwordSaltSize: ").append(toIndentedString(passwordSaltSize)).append("\n");
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

