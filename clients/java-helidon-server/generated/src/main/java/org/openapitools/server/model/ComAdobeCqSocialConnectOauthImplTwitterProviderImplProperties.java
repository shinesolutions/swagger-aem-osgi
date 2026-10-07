package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties   {

    private ConfigNodePropertyString oauthProviderId;
    private ConfigNodePropertyString oauthCloudConfigRoot;
    private ConfigNodePropertyString providerConfigRoot;
    private ConfigNodePropertyDropDown providerConfigUserFolder;
    private ConfigNodePropertyBoolean providerConfigTwitterEnableParams;
    private ConfigNodePropertyArray providerConfigTwitterParams;
    private ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.
     *
     * @param oauthProviderId oauthProviderId
     * @param oauthCloudConfigRoot oauthCloudConfigRoot
     * @param providerConfigRoot providerConfigRoot
     * @param providerConfigUserFolder providerConfigUserFolder
     * @param providerConfigTwitterEnableParams providerConfigTwitterEnableParams
     * @param providerConfigTwitterParams providerConfigTwitterParams
     * @param providerConfigRefreshUserdataEnabled providerConfigRefreshUserdataEnabled
     */
    public ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties(
        ConfigNodePropertyString oauthProviderId, 
        ConfigNodePropertyString oauthCloudConfigRoot, 
        ConfigNodePropertyString providerConfigRoot, 
        ConfigNodePropertyDropDown providerConfigUserFolder, 
        ConfigNodePropertyBoolean providerConfigTwitterEnableParams, 
        ConfigNodePropertyArray providerConfigTwitterParams, 
        ConfigNodePropertyBoolean providerConfigRefreshUserdataEnabled
    ) {
        this.oauthProviderId = oauthProviderId;
        this.oauthCloudConfigRoot = oauthCloudConfigRoot;
        this.providerConfigRoot = providerConfigRoot;
        this.providerConfigUserFolder = providerConfigUserFolder;
        this.providerConfigTwitterEnableParams = providerConfigTwitterEnableParams;
        this.providerConfigTwitterParams = providerConfigTwitterParams;
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
     * Get providerConfigTwitterEnableParams
     * @return providerConfigTwitterEnableParams
     */
    public ConfigNodePropertyBoolean getProviderConfigTwitterEnableParams() {
        return providerConfigTwitterEnableParams;
    }

    public void setProviderConfigTwitterEnableParams(ConfigNodePropertyBoolean providerConfigTwitterEnableParams) {
        this.providerConfigTwitterEnableParams = providerConfigTwitterEnableParams;
    }

    /**
     * Get providerConfigTwitterParams
     * @return providerConfigTwitterParams
     */
    public ConfigNodePropertyArray getProviderConfigTwitterParams() {
        return providerConfigTwitterParams;
    }

    public void setProviderConfigTwitterParams(ConfigNodePropertyArray providerConfigTwitterParams) {
        this.providerConfigTwitterParams = providerConfigTwitterParams;
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
        sb.append("class ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties {\n");
        
        sb.append("    oauthProviderId: ").append(toIndentedString(oauthProviderId)).append("\n");
        sb.append("    oauthCloudConfigRoot: ").append(toIndentedString(oauthCloudConfigRoot)).append("\n");
        sb.append("    providerConfigRoot: ").append(toIndentedString(providerConfigRoot)).append("\n");
        sb.append("    providerConfigUserFolder: ").append(toIndentedString(providerConfigUserFolder)).append("\n");
        sb.append("    providerConfigTwitterEnableParams: ").append(toIndentedString(providerConfigTwitterEnableParams)).append("\n");
        sb.append("    providerConfigTwitterParams: ").append(toIndentedString(providerConfigTwitterParams)).append("\n");
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

