package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqSecurityACLSetupProperties   {

    private ConfigNodePropertyArray cqAclsetupRules;

    /**
     * Default constructor.
     */
    public ComDayCqSecurityACLSetupProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqSecurityACLSetupProperties.
     *
     * @param cqAclsetupRules cqAclsetupRules
     */
    public ComDayCqSecurityACLSetupProperties(
        ConfigNodePropertyArray cqAclsetupRules
    ) {
        this.cqAclsetupRules = cqAclsetupRules;
    }



    /**
     * Get cqAclsetupRules
     * @return cqAclsetupRules
     */
    public ConfigNodePropertyArray getCqAclsetupRules() {
        return cqAclsetupRules;
    }

    public void setCqAclsetupRules(ConfigNodePropertyArray cqAclsetupRules) {
        this.cqAclsetupRules = cqAclsetupRules;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqSecurityACLSetupProperties {\n");
        
        sb.append("    cqAclsetupRules: ").append(toIndentedString(cqAclsetupRules)).append("\n");
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

