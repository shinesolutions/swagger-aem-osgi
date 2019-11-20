package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties   {
  

  private ConfigNodePropertyString tokenExpiration = null;

  private ConfigNodePropertyString tokenLength = null;

  private ConfigNodePropertyBoolean tokenRefresh = null;

  private ConfigNodePropertyInteger tokenCleanupThreshold = null;

  private ConfigNodePropertyString passwordHashAlgorithm = null;

  private ConfigNodePropertyInteger passwordHashIterations = null;

  private ConfigNodePropertyInteger passwordSaltSize = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tokenExpiration")
  public ConfigNodePropertyString getTokenExpiration() {
    return tokenExpiration;
  }
  public void setTokenExpiration(ConfigNodePropertyString tokenExpiration) {
    this.tokenExpiration = tokenExpiration;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tokenLength")
  public ConfigNodePropertyString getTokenLength() {
    return tokenLength;
  }
  public void setTokenLength(ConfigNodePropertyString tokenLength) {
    this.tokenLength = tokenLength;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tokenRefresh")
  public ConfigNodePropertyBoolean getTokenRefresh() {
    return tokenRefresh;
  }
  public void setTokenRefresh(ConfigNodePropertyBoolean tokenRefresh) {
    this.tokenRefresh = tokenRefresh;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tokenCleanupThreshold")
  public ConfigNodePropertyInteger getTokenCleanupThreshold() {
    return tokenCleanupThreshold;
  }
  public void setTokenCleanupThreshold(ConfigNodePropertyInteger tokenCleanupThreshold) {
    this.tokenCleanupThreshold = tokenCleanupThreshold;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("passwordHashAlgorithm")
  public ConfigNodePropertyString getPasswordHashAlgorithm() {
    return passwordHashAlgorithm;
  }
  public void setPasswordHashAlgorithm(ConfigNodePropertyString passwordHashAlgorithm) {
    this.passwordHashAlgorithm = passwordHashAlgorithm;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("passwordHashIterations")
  public ConfigNodePropertyInteger getPasswordHashIterations() {
    return passwordHashIterations;
  }
  public void setPasswordHashIterations(ConfigNodePropertyInteger passwordHashIterations) {
    this.passwordHashIterations = passwordHashIterations;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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
    return Objects.equals(tokenExpiration, orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.tokenExpiration) &&
        Objects.equals(tokenLength, orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.tokenLength) &&
        Objects.equals(tokenRefresh, orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.tokenRefresh) &&
        Objects.equals(tokenCleanupThreshold, orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.tokenCleanupThreshold) &&
        Objects.equals(passwordHashAlgorithm, orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.passwordHashAlgorithm) &&
        Objects.equals(passwordHashIterations, orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.passwordHashIterations) &&
        Objects.equals(passwordSaltSize, orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.passwordSaltSize);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
