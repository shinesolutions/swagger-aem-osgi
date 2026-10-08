package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString tokenExpiration;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString tokenLength;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean tokenRefresh;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger tokenCleanupThreshold;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString passwordHashAlgorithm;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger passwordHashIterations;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger passwordSaltSize;
 /**
   * Get tokenExpiration
   * @return tokenExpiration
  **/
  @JsonProperty("tokenExpiration")
  public ConfigNodePropertyString getTokenExpiration() {
    return tokenExpiration;
  }

  public void setTokenExpiration(ConfigNodePropertyString tokenExpiration) {
    this.tokenExpiration = tokenExpiration;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties tokenExpiration(ConfigNodePropertyString tokenExpiration) {
    this.tokenExpiration = tokenExpiration;
    return this;
  }

 /**
   * Get tokenLength
   * @return tokenLength
  **/
  @JsonProperty("tokenLength")
  public ConfigNodePropertyString getTokenLength() {
    return tokenLength;
  }

  public void setTokenLength(ConfigNodePropertyString tokenLength) {
    this.tokenLength = tokenLength;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties tokenLength(ConfigNodePropertyString tokenLength) {
    this.tokenLength = tokenLength;
    return this;
  }

 /**
   * Get tokenRefresh
   * @return tokenRefresh
  **/
  @JsonProperty("tokenRefresh")
  public ConfigNodePropertyBoolean getTokenRefresh() {
    return tokenRefresh;
  }

  public void setTokenRefresh(ConfigNodePropertyBoolean tokenRefresh) {
    this.tokenRefresh = tokenRefresh;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties tokenRefresh(ConfigNodePropertyBoolean tokenRefresh) {
    this.tokenRefresh = tokenRefresh;
    return this;
  }

 /**
   * Get tokenCleanupThreshold
   * @return tokenCleanupThreshold
  **/
  @JsonProperty("tokenCleanupThreshold")
  public ConfigNodePropertyInteger getTokenCleanupThreshold() {
    return tokenCleanupThreshold;
  }

  public void setTokenCleanupThreshold(ConfigNodePropertyInteger tokenCleanupThreshold) {
    this.tokenCleanupThreshold = tokenCleanupThreshold;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties tokenCleanupThreshold(ConfigNodePropertyInteger tokenCleanupThreshold) {
    this.tokenCleanupThreshold = tokenCleanupThreshold;
    return this;
  }

 /**
   * Get passwordHashAlgorithm
   * @return passwordHashAlgorithm
  **/
  @JsonProperty("passwordHashAlgorithm")
  public ConfigNodePropertyString getPasswordHashAlgorithm() {
    return passwordHashAlgorithm;
  }

  public void setPasswordHashAlgorithm(ConfigNodePropertyString passwordHashAlgorithm) {
    this.passwordHashAlgorithm = passwordHashAlgorithm;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties passwordHashAlgorithm(ConfigNodePropertyString passwordHashAlgorithm) {
    this.passwordHashAlgorithm = passwordHashAlgorithm;
    return this;
  }

 /**
   * Get passwordHashIterations
   * @return passwordHashIterations
  **/
  @JsonProperty("passwordHashIterations")
  public ConfigNodePropertyInteger getPasswordHashIterations() {
    return passwordHashIterations;
  }

  public void setPasswordHashIterations(ConfigNodePropertyInteger passwordHashIterations) {
    this.passwordHashIterations = passwordHashIterations;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties passwordHashIterations(ConfigNodePropertyInteger passwordHashIterations) {
    this.passwordHashIterations = passwordHashIterations;
    return this;
  }

 /**
   * Get passwordSaltSize
   * @return passwordSaltSize
  **/
  @JsonProperty("passwordSaltSize")
  public ConfigNodePropertyInteger getPasswordSaltSize() {
    return passwordSaltSize;
  }

  public void setPasswordSaltSize(ConfigNodePropertyInteger passwordSaltSize) {
    this.passwordSaltSize = passwordSaltSize;
  }

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties passwordSaltSize(ConfigNodePropertyInteger passwordSaltSize) {
    this.passwordSaltSize = passwordSaltSize;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

