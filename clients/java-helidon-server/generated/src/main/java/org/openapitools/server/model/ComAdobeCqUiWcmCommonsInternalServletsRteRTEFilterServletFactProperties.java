package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties   {

    private ConfigNodePropertyArray resourceTypes;

    /**
     * Default constructor.
     */
    public ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties.
     *
     * @param resourceTypes resourceTypes
     */
    public ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties(
        ConfigNodePropertyArray resourceTypes
    ) {
        this.resourceTypes = resourceTypes;
    }



    /**
     * Get resourceTypes
     * @return resourceTypes
     */
    public ConfigNodePropertyArray getResourceTypes() {
        return resourceTypes;
    }

    public void setResourceTypes(ConfigNodePropertyArray resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties {\n");
        
        sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
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

