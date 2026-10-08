package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties   {

    private ConfigNodePropertyArray facebook;
    private ConfigNodePropertyArray twitter;
    private ConfigNodePropertyString providerConfigUserFolder;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.
     *
     * @param facebook facebook
     * @param twitter twitter
     * @param providerConfigUserFolder providerConfigUserFolder
     */
    public ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties(
        ConfigNodePropertyArray facebook, 
        ConfigNodePropertyArray twitter, 
        ConfigNodePropertyString providerConfigUserFolder
    ) {
        this.facebook = facebook;
        this.twitter = twitter;
        this.providerConfigUserFolder = providerConfigUserFolder;
    }



    /**
     * Get facebook
     * @return facebook
     */
    public ConfigNodePropertyArray getFacebook() {
        return facebook;
    }

    public void setFacebook(ConfigNodePropertyArray facebook) {
        this.facebook = facebook;
    }

    /**
     * Get twitter
     * @return twitter
     */
    public ConfigNodePropertyArray getTwitter() {
        return twitter;
    }

    public void setTwitter(ConfigNodePropertyArray twitter) {
        this.twitter = twitter;
    }

    /**
     * Get providerConfigUserFolder
     * @return providerConfigUserFolder
     */
    public ConfigNodePropertyString getProviderConfigUserFolder() {
        return providerConfigUserFolder;
    }

    public void setProviderConfigUserFolder(ConfigNodePropertyString providerConfigUserFolder) {
        this.providerConfigUserFolder = providerConfigUserFolder;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties {\n");
        
        sb.append("    facebook: ").append(toIndentedString(facebook)).append("\n");
        sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
        sb.append("    providerConfigUserFolder: ").append(toIndentedString(providerConfigUserFolder)).append("\n");
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

