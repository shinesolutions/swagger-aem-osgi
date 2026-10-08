package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties   {

    private ConfigNodePropertyArray supportedPaths;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties.
     *
     * @param supportedPaths supportedPaths
     */
    public ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties(
        ConfigNodePropertyArray supportedPaths
    ) {
        this.supportedPaths = supportedPaths;
    }



    /**
     * Get supportedPaths
     * @return supportedPaths
     */
    public ConfigNodePropertyArray getSupportedPaths() {
        return supportedPaths;
    }

    public void setSupportedPaths(ConfigNodePropertyArray supportedPaths) {
        this.supportedPaths = supportedPaths;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties {\n");
        
        sb.append("    supportedPaths: ").append(toIndentedString(supportedPaths)).append("\n");
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

