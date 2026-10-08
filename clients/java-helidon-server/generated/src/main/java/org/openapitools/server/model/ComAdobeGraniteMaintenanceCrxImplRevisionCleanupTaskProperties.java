package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties   {

    private ConfigNodePropertyArray fullGcDays;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties.
     *
     * @param fullGcDays fullGcDays
     */
    public ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties(
        ConfigNodePropertyArray fullGcDays
    ) {
        this.fullGcDays = fullGcDays;
    }



    /**
     * Get fullGcDays
     * @return fullGcDays
     */
    public ConfigNodePropertyArray getFullGcDays() {
        return fullGcDays;
    }

    public void setFullGcDays(ConfigNodePropertyArray fullGcDays) {
        this.fullGcDays = fullGcDays;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties {\n");
        
        sb.append("    fullGcDays: ").append(toIndentedString(fullGcDays)).append("\n");
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

