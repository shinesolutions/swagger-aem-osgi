package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



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

    /**
     * Default constructor.
     */
    public ComAdobeGraniteAuthOauthAccesstokenProviderProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteAuthOauthAccesstokenProviderProperties.
     *
     * @param name name
     * @param authTokenProviderTitle authTokenProviderTitle
     * @param authTokenProviderDefaultClaims authTokenProviderDefaultClaims
     * @param authTokenProviderEndpoint authTokenProviderEndpoint
     * @param authAccessTokenRequest authAccessTokenRequest
     * @param authTokenProviderKeypairAlias authTokenProviderKeypairAlias
     * @param authTokenProviderConnTimeout authTokenProviderConnTimeout
     * @param authTokenProviderSoTimeout authTokenProviderSoTimeout
     * @param authTokenProviderClientId authTokenProviderClientId
     * @param authTokenProviderScope authTokenProviderScope
     * @param authTokenProviderReuseAccessToken authTokenProviderReuseAccessToken
     * @param authTokenProviderRelaxedSsl authTokenProviderRelaxedSsl
     * @param tokenRequestCustomizerType tokenRequestCustomizerType
     * @param authTokenValidatorType authTokenValidatorType
     */
    public ComAdobeGraniteAuthOauthAccesstokenProviderProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyString authTokenProviderTitle, 
        ConfigNodePropertyArray authTokenProviderDefaultClaims, 
        ConfigNodePropertyString authTokenProviderEndpoint, 
        ConfigNodePropertyString authAccessTokenRequest, 
        ConfigNodePropertyString authTokenProviderKeypairAlias, 
        ConfigNodePropertyInteger authTokenProviderConnTimeout, 
        ConfigNodePropertyInteger authTokenProviderSoTimeout, 
        ConfigNodePropertyString authTokenProviderClientId, 
        ConfigNodePropertyString authTokenProviderScope, 
        ConfigNodePropertyBoolean authTokenProviderReuseAccessToken, 
        ConfigNodePropertyBoolean authTokenProviderRelaxedSsl, 
        ConfigNodePropertyString tokenRequestCustomizerType, 
        ConfigNodePropertyString authTokenValidatorType
    ) {
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



    /**
     * Get name
     * @return name
     */
    public ConfigNodePropertyString getName() {
        return name;
    }

    public void setName(ConfigNodePropertyString name) {
        this.name = name;
    }

    /**
     * Get authTokenProviderTitle
     * @return authTokenProviderTitle
     */
    public ConfigNodePropertyString getAuthTokenProviderTitle() {
        return authTokenProviderTitle;
    }

    public void setAuthTokenProviderTitle(ConfigNodePropertyString authTokenProviderTitle) {
        this.authTokenProviderTitle = authTokenProviderTitle;
    }

    /**
     * Get authTokenProviderDefaultClaims
     * @return authTokenProviderDefaultClaims
     */
    public ConfigNodePropertyArray getAuthTokenProviderDefaultClaims() {
        return authTokenProviderDefaultClaims;
    }

    public void setAuthTokenProviderDefaultClaims(ConfigNodePropertyArray authTokenProviderDefaultClaims) {
        this.authTokenProviderDefaultClaims = authTokenProviderDefaultClaims;
    }

    /**
     * Get authTokenProviderEndpoint
     * @return authTokenProviderEndpoint
     */
    public ConfigNodePropertyString getAuthTokenProviderEndpoint() {
        return authTokenProviderEndpoint;
    }

    public void setAuthTokenProviderEndpoint(ConfigNodePropertyString authTokenProviderEndpoint) {
        this.authTokenProviderEndpoint = authTokenProviderEndpoint;
    }

    /**
     * Get authAccessTokenRequest
     * @return authAccessTokenRequest
     */
    public ConfigNodePropertyString getAuthAccessTokenRequest() {
        return authAccessTokenRequest;
    }

    public void setAuthAccessTokenRequest(ConfigNodePropertyString authAccessTokenRequest) {
        this.authAccessTokenRequest = authAccessTokenRequest;
    }

    /**
     * Get authTokenProviderKeypairAlias
     * @return authTokenProviderKeypairAlias
     */
    public ConfigNodePropertyString getAuthTokenProviderKeypairAlias() {
        return authTokenProviderKeypairAlias;
    }

    public void setAuthTokenProviderKeypairAlias(ConfigNodePropertyString authTokenProviderKeypairAlias) {
        this.authTokenProviderKeypairAlias = authTokenProviderKeypairAlias;
    }

    /**
     * Get authTokenProviderConnTimeout
     * @return authTokenProviderConnTimeout
     */
    public ConfigNodePropertyInteger getAuthTokenProviderConnTimeout() {
        return authTokenProviderConnTimeout;
    }

    public void setAuthTokenProviderConnTimeout(ConfigNodePropertyInteger authTokenProviderConnTimeout) {
        this.authTokenProviderConnTimeout = authTokenProviderConnTimeout;
    }

    /**
     * Get authTokenProviderSoTimeout
     * @return authTokenProviderSoTimeout
     */
    public ConfigNodePropertyInteger getAuthTokenProviderSoTimeout() {
        return authTokenProviderSoTimeout;
    }

    public void setAuthTokenProviderSoTimeout(ConfigNodePropertyInteger authTokenProviderSoTimeout) {
        this.authTokenProviderSoTimeout = authTokenProviderSoTimeout;
    }

    /**
     * Get authTokenProviderClientId
     * @return authTokenProviderClientId
     */
    public ConfigNodePropertyString getAuthTokenProviderClientId() {
        return authTokenProviderClientId;
    }

    public void setAuthTokenProviderClientId(ConfigNodePropertyString authTokenProviderClientId) {
        this.authTokenProviderClientId = authTokenProviderClientId;
    }

    /**
     * Get authTokenProviderScope
     * @return authTokenProviderScope
     */
    public ConfigNodePropertyString getAuthTokenProviderScope() {
        return authTokenProviderScope;
    }

    public void setAuthTokenProviderScope(ConfigNodePropertyString authTokenProviderScope) {
        this.authTokenProviderScope = authTokenProviderScope;
    }

    /**
     * Get authTokenProviderReuseAccessToken
     * @return authTokenProviderReuseAccessToken
     */
    public ConfigNodePropertyBoolean getAuthTokenProviderReuseAccessToken() {
        return authTokenProviderReuseAccessToken;
    }

    public void setAuthTokenProviderReuseAccessToken(ConfigNodePropertyBoolean authTokenProviderReuseAccessToken) {
        this.authTokenProviderReuseAccessToken = authTokenProviderReuseAccessToken;
    }

    /**
     * Get authTokenProviderRelaxedSsl
     * @return authTokenProviderRelaxedSsl
     */
    public ConfigNodePropertyBoolean getAuthTokenProviderRelaxedSsl() {
        return authTokenProviderRelaxedSsl;
    }

    public void setAuthTokenProviderRelaxedSsl(ConfigNodePropertyBoolean authTokenProviderRelaxedSsl) {
        this.authTokenProviderRelaxedSsl = authTokenProviderRelaxedSsl;
    }

    /**
     * Get tokenRequestCustomizerType
     * @return tokenRequestCustomizerType
     */
    public ConfigNodePropertyString getTokenRequestCustomizerType() {
        return tokenRequestCustomizerType;
    }

    public void setTokenRequestCustomizerType(ConfigNodePropertyString tokenRequestCustomizerType) {
        this.tokenRequestCustomizerType = tokenRequestCustomizerType;
    }

    /**
     * Get authTokenValidatorType
     * @return authTokenValidatorType
     */
    public ConfigNodePropertyString getAuthTokenValidatorType() {
        return authTokenValidatorType;
    }

    public void setAuthTokenValidatorType(ConfigNodePropertyString authTokenValidatorType) {
        this.authTokenValidatorType = authTokenValidatorType;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

