package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties   {
  private ConfigNodePropertyString tokenExpiration;
  private ConfigNodePropertyString tokenLength;
  private ConfigNodePropertyBoolean tokenRefresh;
  private ConfigNodePropertyInteger tokenCleanupThreshold;
  private ConfigNodePropertyString passwordHashAlgorithm;
  private ConfigNodePropertyInteger passwordHashIterations;
  private ConfigNodePropertyInteger passwordSaltSize;

  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties() {
  }

  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties tokenExpiration(ConfigNodePropertyString tokenExpiration) {
    this.tokenExpiration = tokenExpiration;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tokenExpiration")
  @Valid public ConfigNodePropertyString getTokenExpiration() {
    return tokenExpiration;
  }

  @JsonProperty("tokenExpiration")
  public void setTokenExpiration(ConfigNodePropertyString tokenExpiration) {
    this.tokenExpiration = tokenExpiration;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties tokenLength(ConfigNodePropertyString tokenLength) {
    this.tokenLength = tokenLength;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tokenLength")
  @Valid public ConfigNodePropertyString getTokenLength() {
    return tokenLength;
  }

  @JsonProperty("tokenLength")
  public void setTokenLength(ConfigNodePropertyString tokenLength) {
    this.tokenLength = tokenLength;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties tokenRefresh(ConfigNodePropertyBoolean tokenRefresh) {
    this.tokenRefresh = tokenRefresh;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tokenRefresh")
  @Valid public ConfigNodePropertyBoolean getTokenRefresh() {
    return tokenRefresh;
  }

  @JsonProperty("tokenRefresh")
  public void setTokenRefresh(ConfigNodePropertyBoolean tokenRefresh) {
    this.tokenRefresh = tokenRefresh;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties tokenCleanupThreshold(ConfigNodePropertyInteger tokenCleanupThreshold) {
    this.tokenCleanupThreshold = tokenCleanupThreshold;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tokenCleanupThreshold")
  @Valid public ConfigNodePropertyInteger getTokenCleanupThreshold() {
    return tokenCleanupThreshold;
  }

  @JsonProperty("tokenCleanupThreshold")
  public void setTokenCleanupThreshold(ConfigNodePropertyInteger tokenCleanupThreshold) {
    this.tokenCleanupThreshold = tokenCleanupThreshold;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties passwordHashAlgorithm(ConfigNodePropertyString passwordHashAlgorithm) {
    this.passwordHashAlgorithm = passwordHashAlgorithm;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("passwordHashAlgorithm")
  @Valid public ConfigNodePropertyString getPasswordHashAlgorithm() {
    return passwordHashAlgorithm;
  }

  @JsonProperty("passwordHashAlgorithm")
  public void setPasswordHashAlgorithm(ConfigNodePropertyString passwordHashAlgorithm) {
    this.passwordHashAlgorithm = passwordHashAlgorithm;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties passwordHashIterations(ConfigNodePropertyInteger passwordHashIterations) {
    this.passwordHashIterations = passwordHashIterations;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("passwordHashIterations")
  @Valid public ConfigNodePropertyInteger getPasswordHashIterations() {
    return passwordHashIterations;
  }

  @JsonProperty("passwordHashIterations")
  public void setPasswordHashIterations(ConfigNodePropertyInteger passwordHashIterations) {
    this.passwordHashIterations = passwordHashIterations;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties passwordSaltSize(ConfigNodePropertyInteger passwordSaltSize) {
    this.passwordSaltSize = passwordSaltSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("passwordSaltSize")
  @Valid public ConfigNodePropertyInteger getPasswordSaltSize() {
    return passwordSaltSize;
  }

  @JsonProperty("passwordSaltSize")
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
