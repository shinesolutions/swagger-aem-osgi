package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties   {

    private ConfigNodePropertyBoolean allowOnlySystemUser;

    /**
     * Default constructor.
     */
    public OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties.
     *
     * @param allowOnlySystemUser allowOnlySystemUser
     */
    public OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties(
        ConfigNodePropertyBoolean allowOnlySystemUser
    ) {
        this.allowOnlySystemUser = allowOnlySystemUser;
    }



    /**
     * Get allowOnlySystemUser
     * @return allowOnlySystemUser
     */
    public ConfigNodePropertyBoolean getAllowOnlySystemUser() {
        return allowOnlySystemUser;
    }

    public void setAllowOnlySystemUser(ConfigNodePropertyBoolean allowOnlySystemUser) {
        this.allowOnlySystemUser = allowOnlySystemUser;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties {\n");
        
        sb.append("    allowOnlySystemUser: ").append(toIndentedString(allowOnlySystemUser)).append("\n");
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

