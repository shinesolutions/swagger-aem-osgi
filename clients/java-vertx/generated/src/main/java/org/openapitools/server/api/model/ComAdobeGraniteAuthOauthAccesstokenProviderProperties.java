package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteAuthOauthAccesstokenProviderProperties   {
  
  private ConfigNodePropertyString name = null;
  private ConfigNodePropertyString authTokenProviderTitle = null;
  private ConfigNodePropertyArray authTokenProviderDefaultClaims = null;
  private ConfigNodePropertyString authTokenProviderEndpoint = null;
  private ConfigNodePropertyString authAccessTokenRequest = null;
  private ConfigNodePropertyString authTokenProviderKeypairAlias = null;
  private ConfigNodePropertyInteger authTokenProviderConnTimeout = null;
  private ConfigNodePropertyInteger authTokenProviderSoTimeout = null;
  private ConfigNodePropertyString authTokenProviderClientId = null;
  private ConfigNodePropertyString authTokenProviderScope = null;
  private ConfigNodePropertyBoolean authTokenProviderReuseAccessToken = null;
  private ConfigNodePropertyBoolean authTokenProviderRelaxedSsl = null;
  private ConfigNodePropertyString tokenRequestCustomizerType = null;
  private ConfigNodePropertyString authTokenValidatorType = null;

  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties () {

  }

  public ComAdobeGraniteAuthOauthAccesstokenProviderProperties (ConfigNodePropertyString name, ConfigNodePropertyString authTokenProviderTitle, ConfigNodePropertyArray authTokenProviderDefaultClaims, ConfigNodePropertyString authTokenProviderEndpoint, ConfigNodePropertyString authAccessTokenRequest, ConfigNodePropertyString authTokenProviderKeypairAlias, ConfigNodePropertyInteger authTokenProviderConnTimeout, ConfigNodePropertyInteger authTokenProviderSoTimeout, ConfigNodePropertyString authTokenProviderClientId, ConfigNodePropertyString authTokenProviderScope, ConfigNodePropertyBoolean authTokenProviderReuseAccessToken, ConfigNodePropertyBoolean authTokenProviderRelaxedSsl, ConfigNodePropertyString tokenRequestCustomizerType, ConfigNodePropertyString authTokenValidatorType) {
    this.name = name;
    this.authTokenProviderTitle = authTokenProviderTitle;
    this.authTokenProviderDefaultClaims = authTokenProviderDefaultClaims;
    this.authTokenProviderEndpoint = authTokenProviderEndpoint;
    this.authAccessTokenRequest = authAccessTokenRequest;
    this.authTokenProviderKeypairAlias = authTokenProviderKeypairAlias;
    this.authTokenProviderConnTimeout = authTokenProviderConnTimeout;
    this.authTokenProviderSoTimeout = authTokenProviderSoTimeout;
    this.authTokenProviderClientId = authTokenProviderClientId;
    this.authTokenProviderScope = authTokenProviderScope;
    this.authTokenProviderReuseAccessToken = authTokenProviderReuseAccessToken;
    this.authTokenProviderRelaxedSsl = authTokenProviderRelaxedSsl;
    this.tokenRequestCustomizerType = tokenRequestCustomizerType;
    this.authTokenValidatorType = authTokenValidatorType;
  }

    
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

    
  @JsonProperty("auth.token.provider.title")
  public ConfigNodePropertyString getAuthTokenProviderTitle() {
    return authTokenProviderTitle;
  }
  public void setAuthTokenProviderTitle(ConfigNodePropertyString authTokenProviderTitle) {
    this.authTokenProviderTitle = authTokenProviderTitle;
  }

    
  @JsonProperty("auth.token.provider.default.claims")
  public ConfigNodePropertyArray getAuthTokenProviderDefaultClaims() {
    return authTokenProviderDefaultClaims;
  }
  public void setAuthTokenProviderDefaultClaims(ConfigNodePropertyArray authTokenProviderDefaultClaims) {
    this.authTokenProviderDefaultClaims = authTokenProviderDefaultClaims;
  }

    
  @JsonProperty("auth.token.provider.endpoint")
  public ConfigNodePropertyString getAuthTokenProviderEndpoint() {
    return authTokenProviderEndpoint;
  }
  public void setAuthTokenProviderEndpoint(ConfigNodePropertyString authTokenProviderEndpoint) {
    this.authTokenProviderEndpoint = authTokenProviderEndpoint;
  }

    
  @JsonProperty("auth.access.token.request")
  public ConfigNodePropertyString getAuthAccessTokenRequest() {
    return authAccessTokenRequest;
  }
  public void setAuthAccessTokenRequest(ConfigNodePropertyString authAccessTokenRequest) {
    this.authAccessTokenRequest = authAccessTokenRequest;
  }

    
  @JsonProperty("auth.token.provider.keypair.alias")
  public ConfigNodePropertyString getAuthTokenProviderKeypairAlias() {
    return authTokenProviderKeypairAlias;
  }
  public void setAuthTokenProviderKeypairAlias(ConfigNodePropertyString authTokenProviderKeypairAlias) {
    this.authTokenProviderKeypairAlias = authTokenProviderKeypairAlias;
  }

    
  @JsonProperty("auth.token.provider.conn.timeout")
  public ConfigNodePropertyInteger getAuthTokenProviderConnTimeout() {
    return authTokenProviderConnTimeout;
  }
  public void setAuthTokenProviderConnTimeout(ConfigNodePropertyInteger authTokenProviderConnTimeout) {
    this.authTokenProviderConnTimeout = authTokenProviderConnTimeout;
  }

    
  @JsonProperty("auth.token.provider.so.timeout")
  public ConfigNodePropertyInteger getAuthTokenProviderSoTimeout() {
    return authTokenProviderSoTimeout;
  }
  public void setAuthTokenProviderSoTimeout(ConfigNodePropertyInteger authTokenProviderSoTimeout) {
    this.authTokenProviderSoTimeout = authTokenProviderSoTimeout;
  }

    
  @JsonProperty("auth.token.provider.client.id")
  public ConfigNodePropertyString getAuthTokenProviderClientId() {
    return authTokenProviderClientId;
  }
  public void setAuthTokenProviderClientId(ConfigNodePropertyString authTokenProviderClientId) {
    this.authTokenProviderClientId = authTokenProviderClientId;
  }

    
  @JsonProperty("auth.token.provider.scope")
  public ConfigNodePropertyString getAuthTokenProviderScope() {
    return authTokenProviderScope;
  }
  public void setAuthTokenProviderScope(ConfigNodePropertyString authTokenProviderScope) {
    this.authTokenProviderScope = authTokenProviderScope;
  }

    
  @JsonProperty("auth.token.provider.reuse.access.token")
  public ConfigNodePropertyBoolean getAuthTokenProviderReuseAccessToken() {
    return authTokenProviderReuseAccessToken;
  }
  public void setAuthTokenProviderReuseAccessToken(ConfigNodePropertyBoolean authTokenProviderReuseAccessToken) {
    this.authTokenProviderReuseAccessToken = authTokenProviderReuseAccessToken;
  }

    
  @JsonProperty("auth.token.provider.relaxed.ssl")
  public ConfigNodePropertyBoolean getAuthTokenProviderRelaxedSsl() {
    return authTokenProviderRelaxedSsl;
  }
  public void setAuthTokenProviderRelaxedSsl(ConfigNodePropertyBoolean authTokenProviderRelaxedSsl) {
    this.authTokenProviderRelaxedSsl = authTokenProviderRelaxedSsl;
  }

    
  @JsonProperty("token.request.customizer.type")
  public ConfigNodePropertyString getTokenRequestCustomizerType() {
    return tokenRequestCustomizerType;
  }
  public void setTokenRequestCustomizerType(ConfigNodePropertyString tokenRequestCustomizerType) {
    this.tokenRequestCustomizerType = tokenRequestCustomizerType;
  }

    
  @JsonProperty("auth.token.validator.type")
  public ConfigNodePropertyString getAuthTokenValidatorType() {
    return authTokenValidatorType;
  }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
