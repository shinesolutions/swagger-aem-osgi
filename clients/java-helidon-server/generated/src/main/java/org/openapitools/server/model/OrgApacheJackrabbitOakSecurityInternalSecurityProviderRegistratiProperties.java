package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties   {

    private ConfigNodePropertyArray requiredServicePids;
    private ConfigNodePropertyDropDown authorizationCompositionType;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties.
     *
     * @param requiredServicePids requiredServicePids
     * @param authorizationCompositionType authorizationCompositionType
     */
    public OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties(
        ConfigNodePropertyArray requiredServicePids, 
        ConfigNodePropertyDropDown authorizationCompositionType
    ) {
        this.requiredServicePids = requiredServicePids;
        this.authorizationCompositionType = authorizationCompositionType;
    }



    /**
     * Get requiredServicePids
     * @return requiredServicePids
     */
    public ConfigNodePropertyArray getRequiredServicePids() {
        return requiredServicePids;
    }

    public void setRequiredServicePids(ConfigNodePropertyArray requiredServicePids) {
        this.requiredServicePids = requiredServicePids;
    }

    /**
     * Get authorizationCompositionType
     * @return authorizationCompositionType
     */
    public ConfigNodePropertyDropDown getAuthorizationCompositionType() {
        return authorizationCompositionType;
    }

    public void setAuthorizationCompositionType(ConfigNodePropertyDropDown authorizationCompositionType) {
        this.authorizationCompositionType = authorizationCompositionType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties {\n");
        
        sb.append("    requiredServicePids: ").append(toIndentedString(requiredServicePids)).append("\n");
        sb.append("    authorizationCompositionType: ").append(toIndentedString(authorizationCompositionType)).append("\n");
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

