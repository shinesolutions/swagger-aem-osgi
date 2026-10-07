package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties   {

    private ConfigNodePropertyArray principalNames;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties.
     *
     * @param principalNames principalNames
     */
    public OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties(
        ConfigNodePropertyArray principalNames
    ) {
        this.principalNames = principalNames;
    }



    /**
     * Get principalNames
     * @return principalNames
     */
    public ConfigNodePropertyArray getPrincipalNames() {
        return principalNames;
    }

    public void setPrincipalNames(ConfigNodePropertyArray principalNames) {
        this.principalNames = principalNames;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties {\n");
        
        sb.append("    principalNames: ").append(toIndentedString(principalNames)).append("\n");
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

