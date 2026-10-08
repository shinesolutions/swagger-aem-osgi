package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteAuthOauthAccesstokenProviderProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString name;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString authTokenProviderTitle;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray authTokenProviderDefaultClaims;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString authTokenProviderEndpoint;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString authAccessTokenRequest;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString authTokenProviderKeypairAlias;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger authTokenProviderConnTimeout;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger authTokenProviderSoTimeout;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString authTokenProviderClientId;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString authTokenProviderScope;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean authTokenProviderReuseAccessToken;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean authTokenProviderRelaxedSsl;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString tokenRequestCustomizerType;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString authTokenValidatorType;
 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

 /**
  * Get authTokenProviderTitle
  * @return authTokenProviderTitle
  */
  @JsonProperty("auth.token.provider.title")
  public ConfigNodePropertyString getAuthTokenProviderTitle() {
    return authTokenProviderTitle;
  }

  /**
   * Sets the <code>authTokenProviderTitle</code> property.
   */
 public void setAuthTokenProviderTitle(ConfigNodePropertyString authTokenProviderTitle) {
    this.authTokenProviderTitle = authTokenProviderTitle;
  }

  /**
   * Sets the <code>authTokenProviderTitle</code> property.
   */
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderTitle(ConfigNodePropertyString authTokenProviderTitle) {
    this.authTokenProviderTitle = authTokenProviderTitle;
    return this;
  }

 /**
  * Get authTokenProviderDefaultClaims
  * @return authTokenProviderDefaultClaims
  */
  @JsonProperty("auth.token.provider.default.claims")
  public ConfigNodePropertyArray getAuthTokenProviderDefaultClaims() {
    return authTokenProviderDefaultClaims;
  }

  /**
   * Sets the <code>authTokenProviderDefaultClaims</code> property.
   */
 public void setAuthTokenProviderDefaultClaims(ConfigNodePropertyArray authTokenProviderDefaultClaims) {
    this.authTokenProviderDefaultClaims = authTokenProviderDefaultClaims;
  }

  /**
   * Sets the <code>authTokenProviderDefaultClaims</code> property.
   */
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderDefaultClaims(ConfigNodePropertyArray authTokenProviderDefaultClaims) {
    this.authTokenProviderDefaultClaims = authTokenProviderDefaultClaims;
    return this;
  }

 /**
  * Get authTokenProviderEndpoint
  * @return authTokenProviderEndpoint
  */
  @JsonProperty("auth.token.provider.endpoint")
  public ConfigNodePropertyString getAuthTokenProviderEndpoint() {
    return authTokenProviderEndpoint;
  }

  /**
   * Sets the <code>authTokenProviderEndpoint</code> property.
   */
 public void setAuthTokenProviderEndpoint(ConfigNodePropertyString authTokenProviderEndpoint) {
    this.authTokenProviderEndpoint = authTokenProviderEndpoint;
  }

  /**
   * Sets the <code>authTokenProviderEndpoint</code> property.
   */
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderEndpoint(ConfigNodePropertyString authTokenProviderEndpoint) {
    this.authTokenProviderEndpoint = authTokenProviderEndpoint;
    return this;
  }

 /**
  * Get authAccessTokenRequest
  * @return authAccessTokenRequest
  */
  @JsonProperty("auth.access.token.request")
  public ConfigNodePropertyString getAuthAccessTokenRequest() {
    return authAccessTokenRequest;
  }

  /**
   * Sets the <code>authAccessTokenRequest</code> property.
   */
 public void setAuthAccessTokenRequest(ConfigNodePropertyString authAccessTokenRequest) {
    this.authAccessTokenRequest = authAccessTokenRequest;
  }

  /**
   * Sets the <code>authAccessTokenRequest</code> property.
   */
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authAccessTokenRequest(ConfigNodePropertyString authAccessTokenRequest) {
    this.authAccessTokenRequest = authAccessTokenRequest;
    return this;
  }

 /**
  * Get authTokenProviderKeypairAlias
  * @return authTokenProviderKeypairAlias
  */
  @JsonProperty("auth.token.provider.keypair.alias")
  public ConfigNodePropertyString getAuthTokenProviderKeypairAlias() {
    return authTokenProviderKeypairAlias;
  }

  /**
   * Sets the <code>authTokenProviderKeypairAlias</code> property.
   */
 public void setAuthTokenProviderKeypairAlias(ConfigNodePropertyString authTokenProviderKeypairAlias) {
    this.authTokenProviderKeypairAlias = authTokenProviderKeypairAlias;
  }

  /**
   * Sets the <code>authTokenProviderKeypairAlias</code> property.
   */
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderKeypairAlias(ConfigNodePropertyString authTokenProviderKeypairAlias) {
    this.authTokenProviderKeypairAlias = authTokenProviderKeypairAlias;
    return this;
  }

 /**
  * Get authTokenProviderConnTimeout
  * @return authTokenProviderConnTimeout
  */
  @JsonProperty("auth.token.provider.conn.timeout")
  public ConfigNodePropertyInteger getAuthTokenProviderConnTimeout() {
    return authTokenProviderConnTimeout;
  }

  /**
   * Sets the <code>authTokenProviderConnTimeout</code> property.
   */
 public void setAuthTokenProviderConnTimeout(ConfigNodePropertyInteger authTokenProviderConnTimeout) {
    this.authTokenProviderConnTimeout = authTokenProviderConnTimeout;
  }

  /**
   * Sets the <code>authTokenProviderConnTimeout</code> property.
   */
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderConnTimeout(ConfigNodePropertyInteger authTokenProviderConnTimeout) {
    this.authTokenProviderConnTimeout = authTokenProviderConnTimeout;
    return this;
  }

 /**
  * Get authTokenProviderSoTimeout
  * @return authTokenProviderSoTimeout
  */
  @JsonProperty("auth.token.provider.so.timeout")
  public ConfigNodePropertyInteger getAuthTokenProviderSoTimeout() {
    return authTokenProviderSoTimeout;
  }

  /**
   * Sets the <code>authTokenProviderSoTimeout</code> property.
   */
 public void setAuthTokenProviderSoTimeout(ConfigNodePropertyInteger authTokenProviderSoTimeout) {
    this.authTokenProviderSoTimeout = authTokenProviderSoTimeout;
  }

  /**
   * Sets the <code>authTokenProviderSoTimeout</code> property.
   */
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderSoTimeout(ConfigNodePropertyInteger authTokenProviderSoTimeout) {
    this.authTokenProviderSoTimeout = authTokenProviderSoTimeout;
    return this;
  }

 /**
  * Get authTokenProviderClientId
  * @return authTokenProviderClientId
  */
  @JsonProperty("auth.token.provider.client.id")
  public ConfigNodePropertyString getAuthTokenProviderClientId() {
    return authTokenProviderClientId;
  }

  /**
   * Sets the <code>authTokenProviderClientId</code> property.
   */
 public void setAuthTokenProviderClientId(ConfigNodePropertyString authTokenProviderClientId) {
    this.authTokenProviderClientId = authTokenProviderClientId;
  }

  /**
   * Sets the <code>authTokenProviderClientId</code> property.
   */
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderClientId(ConfigNodePropertyString authTokenProviderClientId) {
    this.authTokenProviderClientId = authTokenProviderClientId;
    return this;
  }

 /**
  * Get authTokenProviderScope
  * @return authTokenProviderScope
  */
  @JsonProperty("auth.token.provider.scope")
  public ConfigNodePropertyString getAuthTokenProviderScope() {
    return authTokenProviderScope;
  }

  /**
   * Sets the <code>authTokenProviderScope</code> property.
   */
 public void setAuthTokenProviderScope(ConfigNodePropertyString authTokenProviderScope) {
    this.authTokenProviderScope = authTokenProviderScope;
  }

  /**
   * Sets the <code>authTokenProviderScope</code> property.
   */
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderScope(ConfigNodePropertyString authTokenProviderScope) {
    this.authTokenProviderScope = authTokenProviderScope;
    return this;
  }

 /**
  * Get authTokenProviderReuseAccessToken
  * @return authTokenProviderReuseAccessToken
  */
  @JsonProperty("auth.token.provider.reuse.access.token")
  public ConfigNodePropertyBoolean getAuthTokenProviderReuseAccessToken() {
    return authTokenProviderReuseAccessToken;
  }

  /**
   * Sets the <code>authTokenProviderReuseAccessToken</code> property.
   */
 public void setAuthTokenProviderReuseAccessToken(ConfigNodePropertyBoolean authTokenProviderReuseAccessToken) {
    this.authTokenProviderReuseAccessToken = authTokenProviderReuseAccessToken;
  }

  /**
   * Sets the <code>authTokenProviderReuseAccessToken</code> property.
   */
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderReuseAccessToken(ConfigNodePropertyBoolean authTokenProviderReuseAccessToken) {
    this.authTokenProviderReuseAccessToken = authTokenProviderReuseAccessToken;
    return this;
  }

 /**
  * Get authTokenProviderRelaxedSsl
  * @return authTokenProviderRelaxedSsl
  */
  @JsonProperty("auth.token.provider.relaxed.ssl")
  public ConfigNodePropertyBoolean getAuthTokenProviderRelaxedSsl() {
    return authTokenProviderRelaxedSsl;
  }

  /**
   * Sets the <code>authTokenProviderRelaxedSsl</code> property.
   */
 public void setAuthTokenProviderRelaxedSsl(ConfigNodePropertyBoolean authTokenProviderRelaxedSsl) {
    this.authTokenProviderRelaxedSsl = authTokenProviderRelaxedSsl;
  }

  /**
   * Sets the <code>authTokenProviderRelaxedSsl</code> property.
   */
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenProviderRelaxedSsl(ConfigNodePropertyBoolean authTokenProviderRelaxedSsl) {
    this.authTokenProviderRelaxedSsl = authTokenProviderRelaxedSsl;
    return this;
  }

 /**
  * Get tokenRequestCustomizerType
  * @return tokenRequestCustomizerType
  */
  @JsonProperty("token.request.customizer.type")
  public ConfigNodePropertyString getTokenRequestCustomizerType() {
    return tokenRequestCustomizerType;
  }

  /**
   * Sets the <code>tokenRequestCustomizerType</code> property.
   */
 public void setTokenRequestCustomizerType(ConfigNodePropertyString tokenRequestCustomizerType) {
    this.tokenRequestCustomizerType = tokenRequestCustomizerType;
  }

  /**
   * Sets the <code>tokenRequestCustomizerType</code> property.
   */
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties tokenRequestCustomizerType(ConfigNodePropertyString tokenRequestCustomizerType) {
    this.tokenRequestCustomizerType = tokenRequestCustomizerType;
    return this;
  }

 /**
  * Get authTokenValidatorType
  * @return authTokenValidatorType
  */
  @JsonProperty("auth.token.validator.type")
  public ConfigNodePropertyString getAuthTokenValidatorType() {
    return authTokenValidatorType;
  }

  /**
   * Sets the <code>authTokenValidatorType</code> property.
   */
 public void setAuthTokenValidatorType(ConfigNodePropertyString authTokenValidatorType) {
    this.authTokenValidatorType = authTokenValidatorType;
  }

  /**
   * Sets the <code>authTokenValidatorType</code> property.
   */
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties authTokenValidatorType(ConfigNodePropertyString authTokenValidatorType) {
    this.authTokenValidatorType = authTokenValidatorType;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

