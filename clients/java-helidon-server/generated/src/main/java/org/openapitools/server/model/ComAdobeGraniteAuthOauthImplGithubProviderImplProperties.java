package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteAuthOauthImplGithubProviderImplProperties   {

    private ConfigNodePropertyString oauthProviderId;
    private ConfigNodePropertyString oauthProviderGithubAuthorizationUrl;
    private ConfigNodePropertyString oauthProviderGithubTokenUrl;
    private ConfigNodePropertyString oauthProviderGithubProfileUrl;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteAuthOauthImplGithubProviderImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteAuthOauthImplGithubProviderImplProperties.
     *
     * @param oauthProviderId oauthProviderId
     * @param oauthProviderGithubAuthorizationUrl oauthProviderGithubAuthorizationUrl
     * @param oauthProviderGithubTokenUrl oauthProviderGithubTokenUrl
     * @param oauthProviderGithubProfileUrl oauthProviderGithubProfileUrl
     */
    public ComAdobeGraniteAuthOauthImplGithubProviderImplProperties(
        ConfigNodePropertyString oauthProviderId, 
        ConfigNodePropertyString oauthProviderGithubAuthorizationUrl, 
        ConfigNodePropertyString oauthProviderGithubTokenUrl, 
        ConfigNodePropertyString oauthProviderGithubProfileUrl
    ) {
        this.oauthProviderId = oauthProviderId;
        this.oauthProviderGithubAuthorizationUrl = oauthProviderGithubAuthorizationUrl;
        this.oauthProviderGithubTokenUrl = oauthProviderGithubTokenUrl;
        this.oauthProviderGithubProfileUrl = oauthProviderGithubProfileUrl;
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
     * Get oauthProviderGithubAuthorizationUrl
     * @return oauthProviderGithubAuthorizationUrl
     */
    public ConfigNodePropertyString getOauthProviderGithubAuthorizationUrl() {
        return oauthProviderGithubAuthorizationUrl;
    }

    public void setOauthProviderGithubAuthorizationUrl(ConfigNodePropertyString oauthProviderGithubAuthorizationUrl) {
        this.oauthProviderGithubAuthorizationUrl = oauthProviderGithubAuthorizationUrl;
    }

    /**
     * Get oauthProviderGithubTokenUrl
     * @return oauthProviderGithubTokenUrl
     */
    public ConfigNodePropertyString getOauthProviderGithubTokenUrl() {
        return oauthProviderGithubTokenUrl;
    }

    public void setOauthProviderGithubTokenUrl(ConfigNodePropertyString oauthProviderGithubTokenUrl) {
        this.oauthProviderGithubTokenUrl = oauthProviderGithubTokenUrl;
    }

    /**
     * Get oauthProviderGithubProfileUrl
     * @return oauthProviderGithubProfileUrl
     */
    public ConfigNodePropertyString getOauthProviderGithubProfileUrl() {
        return oauthProviderGithubProfileUrl;
    }

    public void setOauthProviderGithubProfileUrl(ConfigNodePropertyString oauthProviderGithubProfileUrl) {
        this.oauthProviderGithubProfileUrl = oauthProviderGithubProfileUrl;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteAuthOauthImplGithubProviderImplProperties {\n");
        
        sb.append("    oauthProviderId: ").append(toIndentedString(oauthProviderId)).append("\n");
        sb.append("    oauthProviderGithubAuthorizationUrl: ").append(toIndentedString(oauthProviderGithubAuthorizationUrl)).append("\n");
        sb.append("    oauthProviderGithubTokenUrl: ").append(toIndentedString(oauthProviderGithubTokenUrl)).append("\n");
        sb.append("    oauthProviderGithubProfileUrl: ").append(toIndentedString(oauthProviderGithubProfileUrl)).append("\n");
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

