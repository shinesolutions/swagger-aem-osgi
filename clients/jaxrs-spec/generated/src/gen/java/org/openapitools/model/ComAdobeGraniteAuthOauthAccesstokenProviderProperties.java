package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
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



@JsonTypeName("comAdobeGraniteAuthOauthAccesstokenProviderProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteAuthOauthAccesstokenProviderProperties   {
  private ConfigNodePropertyString name;
  private ConfigNodePropertyString authTokenProviderTitle;
  private ConfigNodePropertyArray authTokenProviderDefaultClaims;
  private ConfigNodePropertyString authTokenProviderEndpoint;
  private ConfigNodePropertyString authAccessTokenRequest;
  private ConfigNodePropertyString authTokenProviderKeypairAlias;
  private ConfigNodePropertyInteger authTokenProviderConnTimeout;
  private ConfigNodePropertyInteger authTokenProviderSoTimeout;
  private ConfigNodePropertyString authTokenProviderClientId;
  private ConfigNodePropertyString authTokenProviderScope;
  private ConfigNodePropertyBoolean authTokenProviderReuseAccessToken;
  private ConfigNodePropertyBoolean authTokenProviderRelaxedSsl;
  private ConfigNodePropertyString tokenRequestCustomizerType;
  private ConfigNodePropertyString authTokenValidatorType;

  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties() {
  }

  /**
   **/
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  @Valid public ConfigNodePropertyString getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   **/
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderTitle(ConfigNodePropertyString authTokenProviderTitle) {
    this.authTokenProviderTitle = authTokenProviderTitle;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.token.provider.title")
  @Valid public ConfigNodePropertyString getAuthTokenProviderTitle() {
    return authTokenProviderTitle;
  }

  @JsonProperty("auth.token.provider.title")
  public void setAuthTokenProviderTitle(ConfigNodePropertyString authTokenProviderTitle) {
    this.authTokenProviderTitle = authTokenProviderTitle;
  }

  /**
   **/
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderDefaultClaims(ConfigNodePropertyArray authTokenProviderDefaultClaims) {
    this.authTokenProviderDefaultClaims = authTokenProviderDefaultClaims;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.token.provider.default.claims")
  @Valid public ConfigNodePropertyArray getAuthTokenProviderDefaultClaims() {
    return authTokenProviderDefaultClaims;
  }

  @JsonProperty("auth.token.provider.default.claims")
  public void setAuthTokenProviderDefaultClaims(ConfigNodePropertyArray authTokenProviderDefaultClaims) {
    this.authTokenProviderDefaultClaims = authTokenProviderDefaultClaims;
  }

  /**
   **/
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderEndpoint(ConfigNodePropertyString authTokenProviderEndpoint) {
    this.authTokenProviderEndpoint = authTokenProviderEndpoint;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.token.provider.endpoint")
  @Valid public ConfigNodePropertyString getAuthTokenProviderEndpoint() {
    return authTokenProviderEndpoint;
  }

  @JsonProperty("auth.token.provider.endpoint")
  public void setAuthTokenProviderEndpoint(ConfigNodePropertyString authTokenProviderEndpoint) {
    this.authTokenProviderEndpoint = authTokenProviderEndpoint;
  }

  /**
   **/
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authAccessTokenRequest(ConfigNodePropertyString authAccessTokenRequest) {
    this.authAccessTokenRequest = authAccessTokenRequest;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.access.token.request")
  @Valid public ConfigNodePropertyString getAuthAccessTokenRequest() {
    return authAccessTokenRequest;
  }

  @JsonProperty("auth.access.token.request")
  public void setAuthAccessTokenRequest(ConfigNodePropertyString authAccessTokenRequest) {
    this.authAccessTokenRequest = authAccessTokenRequest;
  }

  /**
   **/
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderKeypairAlias(ConfigNodePropertyString authTokenProviderKeypairAlias) {
    this.authTokenProviderKeypairAlias = authTokenProviderKeypairAlias;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.token.provider.keypair.alias")
  @Valid public ConfigNodePropertyString getAuthTokenProviderKeypairAlias() {
    return authTokenProviderKeypairAlias;
  }

  @JsonProperty("auth.token.provider.keypair.alias")
  public void setAuthTokenProviderKeypairAlias(ConfigNodePropertyString authTokenProviderKeypairAlias) {
    this.authTokenProviderKeypairAlias = authTokenProviderKeypairAlias;
  }

  /**
   **/
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderConnTimeout(ConfigNodePropertyInteger authTokenProviderConnTimeout) {
    this.authTokenProviderConnTimeout = authTokenProviderConnTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.token.provider.conn.timeout")
  @Valid public ConfigNodePropertyInteger getAuthTokenProviderConnTimeout() {
    return authTokenProviderConnTimeout;
  }

  @JsonProperty("auth.token.provider.conn.timeout")
  public void setAuthTokenProviderConnTimeout(ConfigNodePropertyInteger authTokenProviderConnTimeout) {
    this.authTokenProviderConnTimeout = authTokenProviderConnTimeout;
  }

  /**
   **/
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderSoTimeout(ConfigNodePropertyInteger authTokenProviderSoTimeout) {
    this.authTokenProviderSoTimeout = authTokenProviderSoTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.token.provider.so.timeout")
  @Valid public ConfigNodePropertyInteger getAuthTokenProviderSoTimeout() {
    return authTokenProviderSoTimeout;
  }

  @JsonProperty("auth.token.provider.so.timeout")
  public void setAuthTokenProviderSoTimeout(ConfigNodePropertyInteger authTokenProviderSoTimeout) {
    this.authTokenProviderSoTimeout = authTokenProviderSoTimeout;
  }

  /**
   **/
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderClientId(ConfigNodePropertyString authTokenProviderClientId) {
    this.authTokenProviderClientId = authTokenProviderClientId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.token.provider.client.id")
  @Valid public ConfigNodePropertyString getAuthTokenProviderClientId() {
    return authTokenProviderClientId;
  }

  @JsonProperty("auth.token.provider.client.id")
  public void setAuthTokenProviderClientId(ConfigNodePropertyString authTokenProviderClientId) {
    this.authTokenProviderClientId = authTokenProviderClientId;
  }

  /**
   **/
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderScope(ConfigNodePropertyString authTokenProviderScope) {
    this.authTokenProviderScope = authTokenProviderScope;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.token.provider.scope")
  @Valid public ConfigNodePropertyString getAuthTokenProviderScope() {
    return authTokenProviderScope;
  }

  @JsonProperty("auth.token.provider.scope")
  public void setAuthTokenProviderScope(ConfigNodePropertyString authTokenProviderScope) {
    this.authTokenProviderScope = authTokenProviderScope;
  }

  /**
   **/
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderReuseAccessToken(ConfigNodePropertyBoolean authTokenProviderReuseAccessToken) {
    this.authTokenProviderReuseAccessToken = authTokenProviderReuseAccessToken;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.token.provider.reuse.access.token")
  @Valid public ConfigNodePropertyBoolean getAuthTokenProviderReuseAccessToken() {
    return authTokenProviderReuseAccessToken;
  }

  @JsonProperty("auth.token.provider.reuse.access.token")
  public void setAuthTokenProviderReuseAccessToken(ConfigNodePropertyBoolean authTokenProviderReuseAccessToken) {
    this.authTokenProviderReuseAccessToken = authTokenProviderReuseAccessToken;
  }

  /**
   **/
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderRelaxedSsl(ConfigNodePropertyBoolean authTokenProviderRelaxedSsl) {
    this.authTokenProviderRelaxedSsl = authTokenProviderRelaxedSsl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.token.provider.relaxed.ssl")
  @Valid public ConfigNodePropertyBoolean getAuthTokenProviderRelaxedSsl() {
    return authTokenProviderRelaxedSsl;
  }

  @JsonProperty("auth.token.provider.relaxed.ssl")
  public void setAuthTokenProviderRelaxedSsl(ConfigNodePropertyBoolean authTokenProviderRelaxedSsl) {
    this.authTokenProviderRelaxedSsl = authTokenProviderRelaxedSsl;
  }

  /**
   **/
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties tokenRequestCustomizerType(ConfigNodePropertyString tokenRequestCustomizerType) {
    this.tokenRequestCustomizerType = tokenRequestCustomizerType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("token.request.customizer.type")
  @Valid public ConfigNodePropertyString getTokenRequestCustomizerType() {
    return tokenRequestCustomizerType;
  }

  @JsonProperty("token.request.customizer.type")
  public void setTokenRequestCustomizerType(ConfigNodePropertyString tokenRequestCustomizerType) {
    this.tokenRequestCustomizerType = tokenRequestCustomizerType;
  }

  /**
   **/
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenValidatorType(ConfigNodePropertyString authTokenValidatorType) {
    this.authTokenValidatorType = authTokenValidatorType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auth.token.validator.type")
  @Valid public ConfigNodePropertyString getAuthTokenValidatorType() {
    return authTokenValidatorType;
  }

  @JsonProperty("auth.token.validator.type")
  public void setAuthTokenValidatorType(ConfigNodePropertyString authTokenValidatorType) {
    this.authTokenValidatorType = authTokenValidatorType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthOauthAccesstokenProviderProperties comAdobeGraniteAuthOauthAccesstokenProviderProperties = (ComAdobeGraniteAuthOauthAccesstokenProviderProperties) o;
    return Objects.equals(this.name, comAdobeGraniteAuthOauthAccesstokenProviderProperties.name) &&
        Objects.equals(this.authTokenProviderTitle, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderTitle) &&
        Objects.equals(this.authTokenProviderDefaultClaims, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderDefaultClaims) &&
        Objects.equals(this.authTokenProviderEndpoint, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderEndpoint) &&
        Objects.equals(this.authAccessTokenRequest, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authAccessTokenRequest) &&
        Objects.equals(this.authTokenProviderKeypairAlias, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderKeypairAlias) &&
        Objects.equals(this.authTokenProviderConnTimeout, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderConnTimeout) &&
        Objects.equals(this.authTokenProviderSoTimeout, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderSoTimeout) &&
        Objects.equals(this.authTokenProviderClientId, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderClientId) &&
        Objects.equals(this.authTokenProviderScope, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderScope) &&
        Objects.equals(this.authTokenProviderReuseAccessToken, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderReuseAccessToken) &&
        Objects.equals(this.authTokenProviderRelaxedSsl, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderRelaxedSsl) &&
        Objects.equals(this.tokenRequestCustomizerType, comAdobeGraniteAuthOauthAccesstokenProviderProperties.tokenRequestCustomizerType) &&
        Objects.equals(this.authTokenValidatorType, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenValidatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, authTokenProviderTitle, authTokenProviderDefaultClaims, authTokenProviderEndpoint, authAccessTokenRequest, authTokenProviderKeypairAlias, authTokenProviderConnTimeout, authTokenProviderSoTimeout, authTokenProviderClientId, authTokenProviderScope, authTokenProviderReuseAccessToken, authTokenProviderRelaxedSsl, tokenRequestCustomizerType, authTokenValidatorType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthOauthAccesstokenProviderProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    authTokenProviderTitle: ").append(toIndentedString(authTokenProviderTitle)).append("\n");
    sb.append("    authTokenProviderDefaultClaims: ").append(toIndentedString(authTokenProviderDefaultClaims)).append("\n");
    sb.append("    authTokenProviderEndpoint: ").append(toIndentedString(authTokenProviderEndpoint)).append("\n");
    sb.append("    authAccessTokenRequest: ").append(toIndentedString(authAccessTokenRequest)).append("\n");
    sb.append("    authTokenProviderKeypairAlias: ").append(toIndentedString(authTokenProviderKeypairAlias)).append("\n");
    sb.append("    authTokenProviderConnTimeout: ").append(toIndentedString(authTokenProviderConnTimeout)).append("\n");
    sb.append("    authTokenProviderSoTimeout: ").append(toIndentedString(authTokenProviderSoTimeout)).append("\n");
    sb.append("    authTokenProviderClientId: ").append(toIndentedString(authTokenProviderClientId)).append("\n");
    sb.append("    authTokenProviderScope: ").append(toIndentedString(authTokenProviderScope)).append("\n");
    sb.append("    authTokenProviderReuseAccessToken: ").append(toIndentedString(authTokenProviderReuseAccessToken)).append("\n");
    sb.append("    authTokenProviderRelaxedSsl: ").append(toIndentedString(authTokenProviderRelaxedSsl)).append("\n");
    sb.append("    tokenRequestCustomizerType: ").append(toIndentedString(tokenRequestCustomizerType)).append("\n");
    sb.append("    authTokenValidatorType: ").append(toIndentedString(authTokenValidatorType)).append("\n");
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
