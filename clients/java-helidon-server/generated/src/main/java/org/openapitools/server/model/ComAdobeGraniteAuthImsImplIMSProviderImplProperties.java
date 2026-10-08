package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteAuthImsImplIMSProviderImplProperties   {

    private ConfigNodePropertyString oauthProviderId;
    private ConfigNodePropertyString oauthProviderImsAuthorizationUrl;
    private ConfigNodePropertyString oauthProviderImsTokenUrl;
    private ConfigNodePropertyString oauthProviderImsProfileUrl;
    private ConfigNodePropertyArray oauthProviderImsExtendedDetailsUrls;
    private ConfigNodePropertyString oauthProviderImsValidateTokenUrl;
    private ConfigNodePropertyString oauthProviderImsSessionProperty;
    private ConfigNodePropertyString oauthProviderImsServiceTokenClientId;
    private ConfigNodePropertyString oauthProviderImsServiceTokenClientSecret;
    private ConfigNodePropertyString oauthProviderImsServiceToken;
    private ConfigNodePropertyString imsOrgRef;
    private ConfigNodePropertyArray imsGroupMapping;
    private ConfigNodePropertyBoolean oauthProviderImsOnlyLicenseGroup;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteAuthImsImplIMSProviderImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteAuthImsImplIMSProviderImplProperties.
     *
     * @param oauthProviderId oauthProviderId
     * @param oauthProviderImsAuthorizationUrl oauthProviderImsAuthorizationUrl
     * @param oauthProviderImsTokenUrl oauthProviderImsTokenUrl
     * @param oauthProviderImsProfileUrl oauthProviderImsProfileUrl
     * @param oauthProviderImsExtendedDetailsUrls oauthProviderImsExtendedDetailsUrls
     * @param oauthProviderImsValidateTokenUrl oauthProviderImsValidateTokenUrl
     * @param oauthProviderImsSessionProperty oauthProviderImsSessionProperty
     * @param oauthProviderImsServiceTokenClientId oauthProviderImsServiceTokenClientId
     * @param oauthProviderImsServiceTokenClientSecret oauthProviderImsServiceTokenClientSecret
     * @param oauthProviderImsServiceToken oauthProviderImsServiceToken
     * @param imsOrgRef imsOrgRef
     * @param imsGroupMapping imsGroupMapping
     * @param oauthProviderImsOnlyLicenseGroup oauthProviderImsOnlyLicenseGroup
     */
    public ComAdobeGraniteAuthImsImplIMSProviderImplProperties(
        ConfigNodePropertyString oauthProviderId, 
        ConfigNodePropertyString oauthProviderImsAuthorizationUrl, 
        ConfigNodePropertyString oauthProviderImsTokenUrl, 
        ConfigNodePropertyString oauthProviderImsProfileUrl, 
        ConfigNodePropertyArray oauthProviderImsExtendedDetailsUrls, 
        ConfigNodePropertyString oauthProviderImsValidateTokenUrl, 
        ConfigNodePropertyString oauthProviderImsSessionProperty, 
        ConfigNodePropertyString oauthProviderImsServiceTokenClientId, 
        ConfigNodePropertyString oauthProviderImsServiceTokenClientSecret, 
        ConfigNodePropertyString oauthProviderImsServiceToken, 
        ConfigNodePropertyString imsOrgRef, 
        ConfigNodePropertyArray imsGroupMapping, 
        ConfigNodePropertyBoolean oauthProviderImsOnlyLicenseGroup
    ) {
        this.oauthProviderId = oauthProviderId;
        this.oauthProviderImsAuthorizationUrl = oauthProviderImsAuthorizationUrl;
        this.oauthProviderImsTokenUrl = oauthProviderImsTokenUrl;
        this.oauthProviderImsProfileUrl = oauthProviderImsProfileUrl;
        this.oauthProviderImsExtendedDetailsUrls = oauthProviderImsExtendedDetailsUrls;
        this.oauthProviderImsValidateTokenUrl = oauthProviderImsValidateTokenUrl;
        this.oauthProviderImsSessionProperty = oauthProviderImsSessionProperty;
        this.oauthProviderImsServiceTokenClientId = oauthProviderImsServiceTokenClientId;
        this.oauthProviderImsServiceTokenClientSecret = oauthProviderImsServiceTokenClientSecret;
        this.oauthProviderImsServiceToken = oauthProviderImsServiceToken;
        this.imsOrgRef = imsOrgRef;
        this.imsGroupMapping = imsGroupMapping;
        this.oauthProviderImsOnlyLicenseGroup = oauthProviderImsOnlyLicenseGroup;
    }



    /**
     * Get oauthProviderId
     * @return oauthProviderId
     */
    public ConfigNodePropertyString getOauthProviderId() {
        return oauthProviderId;
    }

    public void setOauthProviderId(ConfigNodePropertyString oauthProviderId) {
        this.oauthProviderId = oauthProviderId;
    }

    /**
     * Get oauthProviderImsAuthorizationUrl
     * @return oauthProviderImsAuthorizationUrl
     */
    public ConfigNodePropertyString getOauthProviderImsAuthorizationUrl() {
        return oauthProviderImsAuthorizationUrl;
    }

    public void setOauthProviderImsAuthorizationUrl(ConfigNodePropertyString oauthProviderImsAuthorizationUrl) {
        this.oauthProviderImsAuthorizationUrl = oauthProviderImsAuthorizationUrl;
    }

    /**
     * Get oauthProviderImsTokenUrl
     * @return oauthProviderImsTokenUrl
     */
    public ConfigNodePropertyString getOauthProviderImsTokenUrl() {
        return oauthProviderImsTokenUrl;
    }

    public void setOauthProviderImsTokenUrl(ConfigNodePropertyString oauthProviderImsTokenUrl) {
        this.oauthProviderImsTokenUrl = oauthProviderImsTokenUrl;
    }

    /**
     * Get oauthProviderImsProfileUrl
     * @return oauthProviderImsProfileUrl
     */
    public ConfigNodePropertyString getOauthProviderImsProfileUrl() {
        return oauthProviderImsProfileUrl;
    }

    public void setOauthProviderImsProfileUrl(ConfigNodePropertyString oauthProviderImsProfileUrl) {
        this.oauthProviderImsProfileUrl = oauthProviderImsProfileUrl;
    }

    /**
     * Get oauthProviderImsExtendedDetailsUrls
     * @return oauthProviderImsExtendedDetailsUrls
     */
    public ConfigNodePropertyArray getOauthProviderImsExtendedDetailsUrls() {
        return oauthProviderImsExtendedDetailsUrls;
    }

    public void setOauthProviderImsExtendedDetailsUrls(ConfigNodePropertyArray oauthProviderImsExtendedDetailsUrls) {
        this.oauthProviderImsExtendedDetailsUrls = oauthProviderImsExtendedDetailsUrls;
    }

    /**
     * Get oauthProviderImsValidateTokenUrl
     * @return oauthProviderImsValidateTokenUrl
     */
    public ConfigNodePropertyString getOauthProviderImsValidateTokenUrl() {
        return oauthProviderImsValidateTokenUrl;
    }

    public void setOauthProviderImsValidateTokenUrl(ConfigNodePropertyString oauthProviderImsValidateTokenUrl) {
        this.oauthProviderImsValidateTokenUrl = oauthProviderImsValidateTokenUrl;
    }

    /**
     * Get oauthProviderImsSessionProperty
     * @return oauthProviderImsSessionProperty
     */
    public ConfigNodePropertyString getOauthProviderImsSessionProperty() {
        return oauthProviderImsSessionProperty;
    }

    public void setOauthProviderImsSessionProperty(ConfigNodePropertyString oauthProviderImsSessionProperty) {
        this.oauthProviderImsSessionProperty = oauthProviderImsSessionProperty;
    }

    /**
     * Get oauthProviderImsServiceTokenClientId
     * @return oauthProviderImsServiceTokenClientId
     */
    public ConfigNodePropertyString getOauthProviderImsServiceTokenClientId() {
        return oauthProviderImsServiceTokenClientId;
    }

    public void setOauthProviderImsServiceTokenClientId(ConfigNodePropertyString oauthProviderImsServiceTokenClientId) {
        this.oauthProviderImsServiceTokenClientId = oauthProviderImsServiceTokenClientId;
    }

    /**
     * Get oauthProviderImsServiceTokenClientSecret
     * @return oauthProviderImsServiceTokenClientSecret
     */
    public ConfigNodePropertyString getOauthProviderImsServiceTokenClientSecret() {
        return oauthProviderImsServiceTokenClientSecret;
    }

    public void setOauthProviderImsServiceTokenClientSecret(ConfigNodePropertyString oauthProviderImsServiceTokenClientSecret) {
        this.oauthProviderImsServiceTokenClientSecret = oauthProviderImsServiceTokenClientSecret;
    }

    /**
     * Get oauthProviderImsServiceToken
     * @return oauthProviderImsServiceToken
     */
    public ConfigNodePropertyString getOauthProviderImsServiceToken() {
        return oauthProviderImsServiceToken;
    }

    public void setOauthProviderImsServiceToken(ConfigNodePropertyString oauthProviderImsServiceToken) {
        this.oauthProviderImsServiceToken = oauthProviderImsServiceToken;
    }

    /**
     * Get imsOrgRef
     * @return imsOrgRef
     */
    public ConfigNodePropertyString getImsOrgRef() {
        return imsOrgRef;
    }

    public void setImsOrgRef(ConfigNodePropertyString imsOrgRef) {
        this.imsOrgRef = imsOrgRef;
    }

    /**
     * Get imsGroupMapping
     * @return imsGroupMapping
     */
    public ConfigNodePropertyArray getImsGroupMapping() {
        return imsGroupMapping;
    }

    public void setImsGroupMapping(ConfigNodePropertyArray imsGroupMapping) {
        this.imsGroupMapping = imsGroupMapping;
    }

    /**
     * Get oauthProviderImsOnlyLicenseGroup
     * @return oauthProviderImsOnlyLicenseGroup
     */
    public ConfigNodePropertyBoolean getOauthProviderImsOnlyLicenseGroup() {
        return oauthProviderImsOnlyLicenseGroup;
    }

    public void setOauthProviderImsOnlyLicenseGroup(ConfigNodePropertyBoolean oauthProviderImsOnlyLicenseGroup) {
        this.oauthProviderImsOnlyLicenseGroup = oauthProviderImsOnlyLicenseGroup;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteAuthImsImplIMSProviderImplProperties {\n");
        
        sb.append("    oauthProviderId: ").append(toIndentedString(oauthProviderId)).append("\n");
        sb.append("    oauthProviderImsAuthorizationUrl: ").append(toIndentedString(oauthProviderImsAuthorizationUrl)).append("\n");
        sb.append("    oauthProviderImsTokenUrl: ").append(toIndentedString(oauthProviderImsTokenUrl)).append("\n");
        sb.append("    oauthProviderImsProfileUrl: ").append(toIndentedString(oauthProviderImsProfileUrl)).append("\n");
        sb.append("    oauthProviderImsExtendedDetailsUrls: ").append(toIndentedString(oauthProviderImsExtendedDetailsUrls)).append("\n");
        sb.append("    oauthProviderImsValidateTokenUrl: ").append(toIndentedString(oauthProviderImsValidateTokenUrl)).append("\n");
        sb.append("    oauthProviderImsSessionProperty: ").append(toIndentedString(oauthProviderImsSessionProperty)).append("\n");
        sb.append("    oauthProviderImsServiceTokenClientId: ").append(toIndentedString(oauthProviderImsServiceTokenClientId)).append("\n");
        sb.append("    oauthProviderImsServiceTokenClientSecret: ").append(toIndentedString(oauthProviderImsServiceTokenClientSecret)).append("\n");
        sb.append("    oauthProviderImsServiceToken: ").append(toIndentedString(oauthProviderImsServiceToken)).append("\n");
        sb.append("    imsOrgRef: ").append(toIndentedString(imsOrgRef)).append("\n");
        sb.append("    imsGroupMapping: ").append(toIndentedString(imsGroupMapping)).append("\n");
        sb.append("    oauthProviderImsOnlyLicenseGroup: ").append(toIndentedString(oauthProviderImsOnlyLicenseGroup)).append("\n");
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

