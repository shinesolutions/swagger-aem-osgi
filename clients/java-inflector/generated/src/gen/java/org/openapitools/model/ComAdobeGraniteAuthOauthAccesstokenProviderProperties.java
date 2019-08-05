package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComAdobeGraniteAuthOauthAccesstokenProviderProperties   {
  @JsonProperty("name")
  private ConfigNodePropertyString name = null;

  @JsonProperty("auth.token.provider.title")
  private ConfigNodePropertyString authTokenProviderTitle = null;

  @JsonProperty("auth.token.provider.default.claims")
  private ConfigNodePropertyArray authTokenProviderDefaultClaims = null;

  @JsonProperty("auth.token.provider.endpoint")
  private ConfigNodePropertyString authTokenProviderEndpoint = null;

  @JsonProperty("auth.access.token.request")
  private ConfigNodePropertyString authAccessTokenRequest = null;

  @JsonProperty("auth.token.provider.keypair.alias")
  private ConfigNodePropertyString authTokenProviderKeypairAlias = null;

  @JsonProperty("auth.token.provider.conn.timeout")
  private ConfigNodePropertyInteger authTokenProviderConnTimeout = null;

  @JsonProperty("auth.token.provider.so.timeout")
  private ConfigNodePropertyInteger authTokenProviderSoTimeout = null;

  @JsonProperty("auth.token.provider.client.id")
  private ConfigNodePropertyString authTokenProviderClientId = null;

  @JsonProperty("auth.token.provider.scope")
  private ConfigNodePropertyString authTokenProviderScope = null;

  @JsonProperty("auth.token.provider.reuse.access.token")
  private ConfigNodePropertyBoolean authTokenProviderReuseAccessToken = null;

  @JsonProperty("auth.token.provider.relaxed.ssl")
  private ConfigNodePropertyBoolean authTokenProviderRelaxedSsl = null;

  @JsonProperty("token.request.customizer.type")
  private ConfigNodePropertyString tokenRequestCustomizerType = null;

  @JsonProperty("auth.token.validator.type")
  private ConfigNodePropertyString authTokenValidatorType = null;

  /**
   **/
  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
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
  public ConfigNodePropertyString getAuthTokenProviderTitle() {
    return authTokenProviderTitle;
  }
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
  public ConfigNodePropertyArray getAuthTokenProviderDefaultClaims() {
    return authTokenProviderDefaultClaims;
  }
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
  public ConfigNodePropertyString getAuthTokenProviderEndpoint() {
    return authTokenProviderEndpoint;
  }
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
  public ConfigNodePropertyString getAuthAccessTokenRequest() {
    return authAccessTokenRequest;
  }
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
  public ConfigNodePropertyString getAuthTokenProviderKeypairAlias() {
    return authTokenProviderKeypairAlias;
  }
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
  public ConfigNodePropertyInteger getAuthTokenProviderConnTimeout() {
    return authTokenProviderConnTimeout;
  }
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
  public ConfigNodePropertyInteger getAuthTokenProviderSoTimeout() {
    return authTokenProviderSoTimeout;
  }
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
  public ConfigNodePropertyString getAuthTokenProviderClientId() {
    return authTokenProviderClientId;
  }
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
  public ConfigNodePropertyString getAuthTokenProviderScope() {
    return authTokenProviderScope;
  }
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
  public ConfigNodePropertyBoolean getAuthTokenProviderReuseAccessToken() {
    return authTokenProviderReuseAccessToken;
  }
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
  public ConfigNodePropertyBoolean getAuthTokenProviderRelaxedSsl() {
    return authTokenProviderRelaxedSsl;
  }
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
  public ConfigNodePropertyString getTokenRequestCustomizerType() {
    return tokenRequestCustomizerType;
  }
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
  public ConfigNodePropertyString getAuthTokenValidatorType() {
    return authTokenValidatorType;
  }
  public void setAuthTokenValidatorType(ConfigNodePropertyString authTokenValidatorType) {
    this.authTokenValidatorType = authTokenValidatorType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAuthOauthAccesstokenProviderProperties comAdobeGraniteAuthOauthAccesstokenProviderProperties = (ComAdobeGraniteAuthOauthAccesstokenProviderProperties) o;
    return Objects.equals(name, comAdobeGraniteAuthOauthAccesstokenProviderProperties.name) &&
        Objects.equals(authTokenProviderTitle, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderTitle) &&
        Objects.equals(authTokenProviderDefaultClaims, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderDefaultClaims) &&
        Objects.equals(authTokenProviderEndpoint, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderEndpoint) &&
        Objects.equals(authAccessTokenRequest, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authAccessTokenRequest) &&
        Objects.equals(authTokenProviderKeypairAlias, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderKeypairAlias) &&
        Objects.equals(authTokenProviderConnTimeout, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderConnTimeout) &&
        Objects.equals(authTokenProviderSoTimeout, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderSoTimeout) &&
        Objects.equals(authTokenProviderClientId, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderClientId) &&
        Objects.equals(authTokenProviderScope, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderScope) &&
        Objects.equals(authTokenProviderReuseAccessToken, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderReuseAccessToken) &&
        Objects.equals(authTokenProviderRelaxedSsl, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenProviderRelaxedSsl) &&
        Objects.equals(tokenRequestCustomizerType, comAdobeGraniteAuthOauthAccesstokenProviderProperties.tokenRequestCustomizerType) &&
        Objects.equals(authTokenValidatorType, comAdobeGraniteAuthOauthAccesstokenProviderProperties.authTokenValidatorType);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

