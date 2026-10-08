package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties   {

    private ConfigNodePropertyString adapterCondition;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties.
     *
     * @param adapterCondition adapterCondition
     */
    public ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties(
        ConfigNodePropertyString adapterCondition
    ) {
        this.adapterCondition = adapterCondition;
    }



    /**
     * Get adapterCondition
     * @return adapterCondition
     */
    public ConfigNodePropertyString getAdapterCondition() {
        return adapterCondition;
    }

    public void setAdapterCondition(ConfigNodePropertyString adapterCondition) {
        this.adapterCondition = adapterCondition;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties {\n");
        
        sb.append("    adapterCondition: ").append(toIndentedString(adapterCondition)).append("\n");
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

