package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties   {
  @JsonProperty("tokenExpiration")
  private ConfigNodePropertyString tokenExpiration = null;

  @JsonProperty("tokenLength")
  private ConfigNodePropertyString tokenLength = null;

  @JsonProperty("tokenRefresh")
  private ConfigNodePropertyBoolean tokenRefresh = null;

  @JsonProperty("tokenCleanupThreshold")
  private ConfigNodePropertyInteger tokenCleanupThreshold = null;

  @JsonProperty("passwordHashAlgorithm")
  private ConfigNodePropertyString passwordHashAlgorithm = null;

  @JsonProperty("passwordHashIterations")
  private ConfigNodePropertyInteger passwordHashIterations = null;

  @JsonProperty("passwordSaltSize")
  private ConfigNodePropertyInteger passwordSaltSize = null;

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties tokenExpiration(ConfigNodePropertyString tokenExpiration) {
    this.tokenExpiration = tokenExpiration;
    return this;
  }

   /**
   * Get tokenExpiration
   * @return tokenExpiration
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getPasswordSaltSize() {
    return passwordSaltSize;
  }

  public void setPasswordSaltSize(ConfigNodePropertyInteger passwordSaltSize) {
    this.passwordSaltSize = passwordSaltSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

