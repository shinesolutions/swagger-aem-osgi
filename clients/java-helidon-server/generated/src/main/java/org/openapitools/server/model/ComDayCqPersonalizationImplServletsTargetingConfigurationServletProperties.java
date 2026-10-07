package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties   {

    private ConfigNodePropertyBoolean forcelocation;

    /**
     * Default constructor.
     */
    public ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties.
     *
     * @param forcelocation forcelocation
     */
    public ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties(
        ConfigNodePropertyBoolean forcelocation
    ) {
        this.forcelocation = forcelocation;
    }



    /**
     * Get forcelocation
     * @return forcelocation
     */
    public ConfigNodePropertyBoolean getForcelocation() {
        return forcelocation;
    }

    public void setForcelocation(ConfigNodePropertyBoolean forcelocation) {
        this.forcelocation = forcelocation;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties {\n");
        
        sb.append("    forcelocation: ").append(toIndentedString(forcelocation)).append("\n");
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

