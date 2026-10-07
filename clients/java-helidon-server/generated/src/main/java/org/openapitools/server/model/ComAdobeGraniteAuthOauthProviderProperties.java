package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteAuthOauthProviderProperties   {

    private ConfigNodePropertyString oauthConfigId;
    private ConfigNodePropertyString oauthClientId;
    private ConfigNodePropertyString oauthClientSecret;
    private ConfigNodePropertyArray oauthScope;
    private ConfigNodePropertyString oauthConfigProviderId;
    private ConfigNodePropertyBoolean oauthCreateUsers;
    private ConfigNodePropertyString oauthUseridProperty;
    private ConfigNodePropertyBoolean forceStrictUsernameMatching;
    private ConfigNodePropertyBoolean oauthEncodeUserids;
    private ConfigNodePropertyBoolean oauthHashUserids;
    private ConfigNodePropertyString oauthCallBackUrl;
    private ConfigNodePropertyBoolean oauthAccessTokenPersist;
    private ConfigNodePropertyBoolean oauthAccessTokenPersistCookie;
    private ConfigNodePropertyBoolean oauthCsrfStateProtection;
    private ConfigNodePropertyBoolean oauthRedirectRequestParams;
    private ConfigNodePropertyBoolean oauthConfigSiblingsAllow;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteAuthOauthProviderProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteAuthOauthProviderProperties.
     *
     * @param oauthConfigId oauthConfigId
     * @param oauthClientId oauthClientId
     * @param oauthClientSecret oauthClientSecret
     * @param oauthScope oauthScope
     * @param oauthConfigProviderId oauthConfigProviderId
     * @param oauthCreateUsers oauthCreateUsers
     * @param oauthUseridProperty oauthUseridProperty
     * @param forceStrictUsernameMatching forceStrictUsernameMatching
     * @param oauthEncodeUserids oauthEncodeUserids
     * @param oauthHashUserids oauthHashUserids
     * @param oauthCallBackUrl oauthCallBackUrl
     * @param oauthAccessTokenPersist oauthAccessTokenPersist
     * @param oauthAccessTokenPersistCookie oauthAccessTokenPersistCookie
     * @param oauthCsrfStateProtection oauthCsrfStateProtection
     * @param oauthRedirectRequestParams oauthRedirectRequestParams
     * @param oauthConfigSiblingsAllow oauthConfigSiblingsAllow
     */
    public ComAdobeGraniteAuthOauthProviderProperties(
        ConfigNodePropertyString oauthConfigId, 
        ConfigNodePropertyString oauthClientId, 
        ConfigNodePropertyString oauthClientSecret, 
        ConfigNodePropertyArray oauthScope, 
        ConfigNodePropertyString oauthConfigProviderId, 
        ConfigNodePropertyBoolean oauthCreateUsers, 
        ConfigNodePropertyString oauthUseridProperty, 
        ConfigNodePropertyBoolean forceStrictUsernameMatching, 
        ConfigNodePropertyBoolean oauthEncodeUserids, 
        ConfigNodePropertyBoolean oauthHashUserids, 
        ConfigNodePropertyString oauthCallBackUrl, 
        ConfigNodePropertyBoolean oauthAccessTokenPersist, 
        ConfigNodePropertyBoolean oauthAccessTokenPersistCookie, 
        ConfigNodePropertyBoolean oauthCsrfStateProtection, 
        ConfigNodePropertyBoolean oauthRedirectRequestParams, 
        ConfigNodePropertyBoolean oauthConfigSiblingsAllow
    ) {
        this.oauthConfigId = oauthConfigId;
        this.oauthClientId = oauthClientId;
        this.oauthClientSecret = oauthClientSecret;
        this.oauthScope = oauthScope;
        this.oauthConfigProviderId = oauthConfigProviderId;
        this.oauthCreateUsers = oauthCreateUsers;
        this.oauthUseridProperty = oauthUseridProperty;
        this.forceStrictUsernameMatching = forceStrictUsernameMatching;
        this.oauthEncodeUserids = oauthEncodeUserids;
        this.oauthHashUserids = oauthHashUserids;
        this.oauthCallBackUrl = oauthCallBackUrl;
        this.oauthAccessTokenPersist = oauthAccessTokenPersist;
        this.oauthAccessTokenPersistCookie = oauthAccessTokenPersistCookie;
        this.oauthCsrfStateProtection = oauthCsrfStateProtection;
        this.oauthRedirectRequestParams = oauthRedirectRequestParams;
        this.oauthConfigSiblingsAllow = oauthConfigSiblingsAllow;
    }



    /**
     * Get oauthConfigId
     * @return oauthConfigId
     */
    public ConfigNodePropertyString getOauthConfigId() {
        return oauthConfigId;
    }

    public void setOauthConfigId(ConfigNodePropertyString oauthConfigId) {
        this.oauthConfigId = oauthConfigId;
    }

    /**
     * Get oauthClientId
     * @return oauthClientId
     */
    public ConfigNodePropertyString getOauthClientId() {
        return oauthClientId;
    }

    public void setOauthClientId(ConfigNodePropertyString oauthClientId) {
        this.oauthClientId = oauthClientId;
    }

    /**
     * Get oauthClientSecret
     * @return oauthClientSecret
     */
    public ConfigNodePropertyString getOauthClientSecret() {
        return oauthClientSecret;
    }

    public void setOauthClientSecret(ConfigNodePropertyString oauthClientSecret) {
        this.oauthClientSecret = oauthClientSecret;
    }

    /**
     * Get oauthScope
     * @return oauthScope
     */
    public ConfigNodePropertyArray getOauthScope() {
        return oauthScope;
    }

    public void setOauthScope(ConfigNodePropertyArray oauthScope) {
        this.oauthScope = oauthScope;
    }

    /**
     * Get oauthConfigProviderId
     * @return oauthConfigProviderId
     */
    public ConfigNodePropertyString getOauthConfigProviderId() {
        return oauthConfigProviderId;
    }

    public void setOauthConfigProviderId(ConfigNodePropertyString oauthConfigProviderId) {
        this.oauthConfigProviderId = oauthConfigProviderId;
    }

    /**
     * Get oauthCreateUsers
     * @return oauthCreateUsers
     */
    public ConfigNodePropertyBoolean getOauthCreateUsers() {
        return oauthCreateUsers;
    }

    public void setOauthCreateUsers(ConfigNodePropertyBoolean oauthCreateUsers) {
        this.oauthCreateUsers = oauthCreateUsers;
    }

    /**
     * Get oauthUseridProperty
     * @return oauthUseridProperty
     */
    public ConfigNodePropertyString getOauthUseridProperty() {
        return oauthUseridProperty;
    }

    public void setOauthUseridProperty(ConfigNodePropertyString oauthUseridProperty) {
        this.oauthUseridProperty = oauthUseridProperty;
    }

    /**
     * Get forceStrictUsernameMatching
     * @return forceStrictUsernameMatching
     */
    public ConfigNodePropertyBoolean getForceStrictUsernameMatching() {
        return forceStrictUsernameMatching;
    }

    public void setForceStrictUsernameMatching(ConfigNodePropertyBoolean forceStrictUsernameMatching) {
        this.forceStrictUsernameMatching = forceStrictUsernameMatching;
    }

    /**
     * Get oauthEncodeUserids
     * @return oauthEncodeUserids
     */
    public ConfigNodePropertyBoolean getOauthEncodeUserids() {
        return oauthEncodeUserids;
    }

    public void setOauthEncodeUserids(ConfigNodePropertyBoolean oauthEncodeUserids) {
        this.oauthEncodeUserids = oauthEncodeUserids;
    }

    /**
     * Get oauthHashUserids
     * @return oauthHashUserids
     */
    public ConfigNodePropertyBoolean getOauthHashUserids() {
        return oauthHashUserids;
    }

    public void setOauthHashUserids(ConfigNodePropertyBoolean oauthHashUserids) {
        this.oauthHashUserids = oauthHashUserids;
    }

    /**
     * Get oauthCallBackUrl
     * @return oauthCallBackUrl
     */
    public ConfigNodePropertyString getOauthCallBackUrl() {
        return oauthCallBackUrl;
    }

    public void setOauthCallBackUrl(ConfigNodePropertyString oauthCallBackUrl) {
        this.oauthCallBackUrl = oauthCallBackUrl;
    }

    /**
     * Get oauthAccessTokenPersist
     * @return oauthAccessTokenPersist
     */
    public ConfigNodePropertyBoolean getOauthAccessTokenPersist() {
        return oauthAccessTokenPersist;
    }

    public void setOauthAccessTokenPersist(ConfigNodePropertyBoolean oauthAccessTokenPersist) {
        this.oauthAccessTokenPersist = oauthAccessTokenPersist;
    }

    /**
     * Get oauthAccessTokenPersistCookie
     * @return oauthAccessTokenPersistCookie
     */
    public ConfigNodePropertyBoolean getOauthAccessTokenPersistCookie() {
        return oauthAccessTokenPersistCookie;
    }

    public void setOauthAccessTokenPersistCookie(ConfigNodePropertyBoolean oauthAccessTokenPersistCookie) {
        this.oauthAccessTokenPersistCookie = oauthAccessTokenPersistCookie;
    }

    /**
     * Get oauthCsrfStateProtection
     * @return oauthCsrfStateProtection
     */
    public ConfigNodePropertyBoolean getOauthCsrfStateProtection() {
        return oauthCsrfStateProtection;
    }

    public void setOauthCsrfStateProtection(ConfigNodePropertyBoolean oauthCsrfStateProtection) {
        this.oauthCsrfStateProtection = oauthCsrfStateProtection;
    }

    /**
     * Get oauthRedirectRequestParams
     * @return oauthRedirectRequestParams
     */
    public ConfigNodePropertyBoolean getOauthRedirectRequestParams() {
        return oauthRedirectRequestParams;
    }

    public void setOauthRedirectRequestParams(ConfigNodePropertyBoolean oauthRedirectRequestParams) {
        this.oauthRedirectRequestParams = oauthRedirectRequestParams;
    }

    /**
     * Get oauthConfigSiblingsAllow
     * @return oauthConfigSiblingsAllow
     */
    public ConfigNodePropertyBoolean getOauthConfigSiblingsAllow() {
        return oauthConfigSiblingsAllow;
    }

    public void setOauthConfigSiblingsAllow(ConfigNodePropertyBoolean oauthConfigSiblingsAllow) {
        this.oauthConfigSiblingsAllow = oauthConfigSiblingsAllow;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteAuthOauthProviderProperties {\n");
        
        sb.append("    oauthConfigId: ").append(toIndentedString(oauthConfigId)).append("\n");
        sb.append("    oauthClientId: ").append(toIndentedString(oauthClientId)).append("\n");
        sb.append("    oauthClientSecret: ").append(toIndentedString(oauthClientSecret)).append("\n");
        sb.append("    oauthScope: ").append(toIndentedString(oauthScope)).append("\n");
        sb.append("    oauthConfigProviderId: ").append(toIndentedString(oauthConfigProviderId)).append("\n");
        sb.append("    oauthCreateUsers: ").append(toIndentedString(oauthCreateUsers)).append("\n");
        sb.append("    oauthUseridProperty: ").append(toIndentedString(oauthUseridProperty)).append("\n");
        sb.append("    forceStrictUsernameMatching: ").append(toIndentedString(forceStrictUsernameMatching)).append("\n");
        sb.append("    oauthEncodeUserids: ").append(toIndentedString(oauthEncodeUserids)).append("\n");
        sb.append("    oauthHashUserids: ").append(toIndentedString(oauthHashUserids)).append("\n");
        sb.append("    oauthCallBackUrl: ").append(toIndentedString(oauthCallBackUrl)).append("\n");
        sb.append("    oauthAccessTokenPersist: ").append(toIndentedString(oauthAccessTokenPersist)).append("\n");
        sb.append("    oauthAccessTokenPersistCookie: ").append(toIndentedString(oauthAccessTokenPersistCookie)).append("\n");
        sb.append("    oauthCsrfStateProtection: ").append(toIndentedString(oauthCsrfStateProtection)).append("\n");
        sb.append("    oauthRedirectRequestParams: ").append(toIndentedString(oauthRedirectRequestParams)).append("\n");
        sb.append("    oauthConfigSiblingsAllow: ").append(toIndentedString(oauthConfigSiblingsAllow)).append("\n");
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

