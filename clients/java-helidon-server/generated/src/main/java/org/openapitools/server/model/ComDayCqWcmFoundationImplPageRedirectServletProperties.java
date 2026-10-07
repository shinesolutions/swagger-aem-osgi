package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmFoundationImplPageRedirectServletProperties   {

    private ConfigNodePropertyArray excludedResourceTypes;

    /**
     * Default constructor.
     */
    public ComDayCqWcmFoundationImplPageRedirectServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmFoundationImplPageRedirectServletProperties.
     *
     * @param excludedResourceTypes excludedResourceTypes
     */
    public ComDayCqWcmFoundationImplPageRedirectServletProperties(
        ConfigNodePropertyArray excludedResourceTypes
    ) {
        this.excludedResourceTypes = excludedResourceTypes;
    }



    /**
     * Get excludedResourceTypes
     * @return excludedResourceTypes
     */
    public ConfigNodePropertyArray getExcludedResourceTypes() {
        return excludedResourceTypes;
    }

    public void setExcludedResourceTypes(ConfigNodePropertyArray excludedResourceTypes) {
        this.excludedResourceTypes = excludedResourceTypes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmFoundationImplPageRedirectServletProperties {\n");
        
        sb.append("    excludedResourceTypes: ").append(toIndentedString(excludedResourceTypes)).append("\n");
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

