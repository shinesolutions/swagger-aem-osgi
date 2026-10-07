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
 * OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties
 */

@JsonTypeName("orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString tokenExpiration;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString tokenLength;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean tokenRefresh;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger tokenCleanupThreshold;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString passwordHashAlgorithm;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger passwordHashIterations;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger passwordSaltSize;

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties tokenExpiration(@Nullable ConfigNodePropertyString tokenExpiration) {
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
  public @Nullable ConfigNodePropertyString getTokenExpiration() {
    return tokenExpiration;
  }

  @JsonProperty("tokenExpiration")
  public void setTokenExpiration(@Nullable ConfigNodePropertyString tokenExpiration) {
    this.tokenExpiration = tokenExpiration;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties tokenLength(@Nullable ConfigNodePropertyString tokenLength) {
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
  public @Nullable ConfigNodePropertyString getTokenLength() {
    return tokenLength;
  }

  @JsonProperty("tokenLength")
  public void setTokenLength(@Nullable ConfigNodePropertyString tokenLength) {
    this.tokenLength = tokenLength;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties tokenRefresh(@Nullable ConfigNodePropertyBoolean tokenRefresh) {
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
  public @Nullable ConfigNodePropertyBoolean getTokenRefresh() {
    return tokenRefresh;
  }

  @JsonProperty("tokenRefresh")
  public void setTokenRefresh(@Nullable ConfigNodePropertyBoolean tokenRefresh) {
    this.tokenRefresh = tokenRefresh;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties tokenCleanupThreshold(@Nullable ConfigNodePropertyInteger tokenCleanupThreshold) {
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
  public @Nullable ConfigNodePropertyInteger getTokenCleanupThreshold() {
    return tokenCleanupThreshold;
  }

  @JsonProperty("tokenCleanupThreshold")
  public void setTokenCleanupThreshold(@Nullable ConfigNodePropertyInteger tokenCleanupThreshold) {
    this.tokenCleanupThreshold = tokenCleanupThreshold;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties passwordHashAlgorithm(@Nullable ConfigNodePropertyString passwordHashAlgorithm) {
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
  public @Nullable ConfigNodePropertyString getPasswordHashAlgorithm() {
    return passwordHashAlgorithm;
  }

  @JsonProperty("passwordHashAlgorithm")
  public void setPasswordHashAlgorithm(@Nullable ConfigNodePropertyString passwordHashAlgorithm) {
    this.passwordHashAlgorithm = passwordHashAlgorithm;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties passwordHashIterations(@Nullable ConfigNodePropertyInteger passwordHashIterations) {
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
  public @Nullable ConfigNodePropertyInteger getPasswordHashIterations() {
    return passwordHashIterations;
  }

  @JsonProperty("passwordHashIterations")
  public void setPasswordHashIterations(@Nullable ConfigNodePropertyInteger passwordHashIterations) {
    this.passwordHashIterations = passwordHashIterations;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties passwordSaltSize(@Nullable ConfigNodePropertyInteger passwordSaltSize) {
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
  public @Nullable ConfigNodePropertyInteger getPasswordSaltSize() {
    return passwordSaltSize;
  }

  @JsonProperty("passwordSaltSize")
  public void setPasswordSaltSize(@Nullable ConfigNodePropertyInteger passwordSaltSize) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

