package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteAuthOauthImplGraniteProviderProperties   {

    private ConfigNodePropertyString oauthProviderId;
    private ConfigNodePropertyString oauthProviderGraniteAuthorizationUrl;
    private ConfigNodePropertyString oauthProviderGraniteTokenUrl;
    private ConfigNodePropertyString oauthProviderGraniteProfileUrl;
    private ConfigNodePropertyString oauthProviderGraniteExtendedDetailsUrls;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteAuthOauthImplGraniteProviderProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteAuthOauthImplGraniteProviderProperties.
     *
     * @param oauthProviderId oauthProviderId
     * @param oauthProviderGraniteAuthorizationUrl oauthProviderGraniteAuthorizationUrl
     * @param oauthProviderGraniteTokenUrl oauthProviderGraniteTokenUrl
     * @param oauthProviderGraniteProfileUrl oauthProviderGraniteProfileUrl
     * @param oauthProviderGraniteExtendedDetailsUrls oauthProviderGraniteExtendedDetailsUrls
     */
    public ComAdobeGraniteAuthOauthImplGraniteProviderProperties(
        ConfigNodePropertyString oauthProviderId, 
        ConfigNodePropertyString oauthProviderGraniteAuthorizationUrl, 
        ConfigNodePropertyString oauthProviderGraniteTokenUrl, 
        ConfigNodePropertyString oauthProviderGraniteProfileUrl, 
        ConfigNodePropertyString oauthProviderGraniteExtendedDetailsUrls
    ) {
        this.oauthProviderId = oauthProviderId;
        this.oauthProviderGraniteAuthorizationUrl = oauthProviderGraniteAuthorizationUrl;
        this.oauthProviderGraniteTokenUrl = oauthProviderGraniteTokenUrl;
        this.oauthProviderGraniteProfileUrl = oauthProviderGraniteProfileUrl;
        this.oauthProviderGraniteExtendedDetailsUrls = oauthProviderGraniteExtendedDetailsUrls;
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
     * Get oauthProviderGraniteAuthorizationUrl
     * @return oauthProviderGraniteAuthorizationUrl
     */
    public ConfigNodePropertyString getOauthProviderGraniteAuthorizationUrl() {
        return oauthProviderGraniteAuthorizationUrl;
    }

    public void setOauthProviderGraniteAuthorizationUrl(ConfigNodePropertyString oauthProviderGraniteAuthorizationUrl) {
        this.oauthProviderGraniteAuthorizationUrl = oauthProviderGraniteAuthorizationUrl;
    }

    /**
     * Get oauthProviderGraniteTokenUrl
     * @return oauthProviderGraniteTokenUrl
     */
    public ConfigNodePropertyString getOauthProviderGraniteTokenUrl() {
        return oauthProviderGraniteTokenUrl;
    }

    public void setOauthProviderGraniteTokenUrl(ConfigNodePropertyString oauthProviderGraniteTokenUrl) {
        this.oauthProviderGraniteTokenUrl = oauthProviderGraniteTokenUrl;
    }

    /**
     * Get oauthProviderGraniteProfileUrl
     * @return oauthProviderGraniteProfileUrl
     */
    public ConfigNodePropertyString getOauthProviderGraniteProfileUrl() {
        return oauthProviderGraniteProfileUrl;
    }

    public void setOauthProviderGraniteProfileUrl(ConfigNodePropertyString oauthProviderGraniteProfileUrl) {
        this.oauthProviderGraniteProfileUrl = oauthProviderGraniteProfileUrl;
    }

    /**
     * Get oauthProviderGraniteExtendedDetailsUrls
     * @return oauthProviderGraniteExtendedDetailsUrls
     */
    public ConfigNodePropertyString getOauthProviderGraniteExtendedDetailsUrls() {
        return oauthProviderGraniteExtendedDetailsUrls;
    }

    public void setOauthProviderGraniteExtendedDetailsUrls(ConfigNodePropertyString oauthProviderGraniteExtendedDetailsUrls) {
        this.oauthProviderGraniteExtendedDetailsUrls = oauthProviderGraniteExtendedDetailsUrls;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteAuthOauthImplGraniteProviderProperties {\n");
        
        sb.append("    oauthProviderId: ").append(toIndentedString(oauthProviderId)).append("\n");
        sb.append("    oauthProviderGraniteAuthorizationUrl: ").append(toIndentedString(oauthProviderGraniteAuthorizationUrl)).append("\n");
        sb.append("    oauthProviderGraniteTokenUrl: ").append(toIndentedString(oauthProviderGraniteTokenUrl)).append("\n");
        sb.append("    oauthProviderGraniteProfileUrl: ").append(toIndentedString(oauthProviderGraniteProfileUrl)).append("\n");
        sb.append("    oauthProviderGraniteExtendedDetailsUrls: ").append(toIndentedString(oauthProviderGraniteExtendedDetailsUrls)).append("\n");
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

