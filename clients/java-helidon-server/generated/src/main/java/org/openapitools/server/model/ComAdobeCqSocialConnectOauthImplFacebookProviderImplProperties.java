package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties   {

    private ConfigNodePropertyString oauthProviderId;
    private ConfigNodePropertyString oauthCloudConfigRoot;
    private ConfigNodePropertyString providerConfigRoot;
    private ConfigNodePropertyBoolean providerConfigCreateTagsEnabled;
    private ConfigNodePropertyDropDown providerConfigUserFolder;
    private ConfigNodePropertyBoolean providerConfigFacebookFetchFields;
    private ConfigNodePropertyArray providerConfigFacebookFields;
    private ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.
     *
     * @param oauthProviderId oauthProviderId
     * @param oauthCloudConfigRoot oauthCloudConfigRoot
     * @param providerConfigRoot providerConfigRoot
     * @param providerConfigCreateTagsEnabled providerConfigCreateTagsEnabled
     * @param providerConfigUserFolder providerConfigUserFolder
     * @param providerConfigFacebookFetchFields providerConfigFacebookFetchFields
     * @param providerConfigFacebookFields providerConfigFacebookFields
     * @param providerConfigRefreshUserdataEnabled providerConfigRefreshUserdataEnabled
     */
    public ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties(
        ConfigNodePropertyString oauthProviderId, 
        ConfigNodePropertyString oauthCloudConfigRoot, 
        ConfigNodePropertyString providerConfigRoot, 
        ConfigNodePropertyBoolean providerConfigCreateTagsEnabled, 
        ConfigNodePropertyDropDown providerConfigUserFolder, 
        ConfigNodePropertyBoolean providerConfigFacebookFetchFields, 
        ConfigNodePropertyArray providerConfigFacebookFields, 
        ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled
    ) {
        this.oauthProviderId = oauthProviderId;
        this.oauthCloudConfigRoot = oauthCloudConfigRoot;
        this.providerConfigRoot = providerConfigRoot;
        this.providerConfigCreateTagsEnabled = providerConfigCreateTagsEnabled;
        this.providerConfigUserFolder = providerConfigUserFolder;
        this.providerConfigFacebookFetchFields = providerConfigFacebookFetchFields;
        this.providerConfigFacebookFields = providerConfigFacebookFields;
        this.providerConfigRefreshUserdataEnabled = providerConfigRefreshUserdataEnabled;
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
     * Get oauthCloudConfigRoot
     * @return oauthCloudConfigRoot
     */
    public ConfigNodePropertyString getOauthCloudConfigRoot() {
        return oauthCloudConfigRoot;
    }

    public void setOauthCloudConfigRoot(ConfigNodePropertyString oauthCloudConfigRoot) {
        this.oauthCloudConfigRoot = oauthCloudConfigRoot;
    }

    /**
     * Get providerConfigRoot
     * @return providerConfigRoot
     */
    public ConfigNodePropertyString getProviderConfigRoot() {
        return providerConfigRoot;
    }

    public void setProviderConfigRoot(ConfigNodePropertyString providerConfigRoot) {
        this.providerConfigRoot = providerConfigRoot;
    }

    /**
     * Get providerConfigCreateTagsEnabled
     * @return providerConfigCreateTagsEnabled
     */
    public ConfigNodePropertyBoolean getProviderConfigCreateTagsEnabled() {
        return providerConfigCreateTagsEnabled;
    }

    public void setProviderConfigCreateTagsEnabled(ConfigNodePropertyBoolean providerConfigCreateTagsEnabled) {
        this.providerConfigCreateTagsEnabled = providerConfigCreateTagsEnabled;
    }

    /**
     * Get providerConfigUserFolder
     * @return providerConfigUserFolder
     */
    public ConfigNodePropertyDropDown getProviderConfigUserFolder() {
        return providerConfigUserFolder;
    }

    public void setProviderConfigUserFolder(ConfigNodePropertyDropDown providerConfigUserFolder) {
        this.providerConfigUserFolder = providerConfigUserFolder;
    }

    /**
     * Get providerConfigFacebookFetchFields
     * @return providerConfigFacebookFetchFields
     */
    public ConfigNodePropertyBoolean getProviderConfigFacebookFetchFields() {
        return providerConfigFacebookFetchFields;
    }

    public void setProviderConfigFacebookFetchFields(ConfigNodePropertyBoolean providerConfigFacebookFetchFields) {
        this.providerConfigFacebookFetchFields = providerConfigFacebookFetchFields;
    }

    /**
     * Get providerConfigFacebookFields
     * @return providerConfigFacebookFields
     */
    public ConfigNodePropertyArray getProviderConfigFacebookFields() {
        return providerConfigFacebookFields;
    }

    public void setProviderConfigFacebookFields(ConfigNodePropertyArray providerConfigFacebookFields) {
        this.providerConfigFacebookFields = providerConfigFacebookFields;
    }

    /**
     * Get providerConfigRefreshUserdataEnabled
     * @return providerConfigRefreshUserdataEnabled
     */
    public ConfigNodePropertyBoolean getProviderConfigRefreshUserdataEnabled() {
        return providerConfigRefreshUserdataEnabled;
    }

    public void setProviderConfigRefreshUserdataEnabled(ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled) {
        this.providerConfigRefreshUserdataEnabled = providerConfigRefreshUserdataEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties {\n");
        
        sb.append("    oauthProviderId: ").append(toIndentedString(oauthProviderId)).append("\n");
        sb.append("    oauthCloudConfigRoot: ").append(toIndentedString(oauthCloudConfigRoot)).append("\n");
        sb.append("    providerConfigRoot: ").append(toIndentedString(providerConfigRoot)).append("\n");
        sb.append("    providerConfigCreateTagsEnabled: ").append(toIndentedString(providerConfigCreateTagsEnabled)).append("\n");
        sb.append("    providerConfigUserFolder: ").append(toIndentedString(providerConfigUserFolder)).append("\n");
        sb.append("    providerConfigFacebookFetchFields: ").append(toIndentedString(providerConfigFacebookFetchFields)).append("\n");
        sb.append("    providerConfigFacebookFields: ").append(toIndentedString(providerConfigFacebookFields)).append("\n");
        sb.append("    providerConfigRefreshUserdataEnabled: ").append(toIndentedString(providerConfigRefreshUserdataEnabled)).append("\n");
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

