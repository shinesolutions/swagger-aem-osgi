package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplServletGuidLookupFilterProperties   {

    private ConfigNodePropertyBoolean cqDamCoreGuidlookupfilterEnabled;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplServletGuidLookupFilterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplServletGuidLookupFilterProperties.
     *
     * @param cqDamCoreGuidlookupfilterEnabled cqDamCoreGuidlookupfilterEnabled
     */
    public ComDayCqDamCoreImplServletGuidLookupFilterProperties(
        ConfigNodePropertyBoolean cqDamCoreGuidlookupfilterEnabled
    ) {
        this.cqDamCoreGuidlookupfilterEnabled = cqDamCoreGuidlookupfilterEnabled;
    }



    /**
     * Get cqDamCoreGuidlookupfilterEnabled
     * @return cqDamCoreGuidlookupfilterEnabled
     */
    public ConfigNodePropertyBoolean getCqDamCoreGuidlookupfilterEnabled() {
        return cqDamCoreGuidlookupfilterEnabled;
    }

    public void setCqDamCoreGuidlookupfilterEnabled(ConfigNodePropertyBoolean cqDamCoreGuidlookupfilterEnabled) {
        this.cqDamCoreGuidlookupfilterEnabled = cqDamCoreGuidlookupfilterEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplServletGuidLookupFilterProperties {\n");
        
        sb.append("    cqDamCoreGuidlookupfilterEnabled: ").append(toIndentedString(cqDamCoreGuidlookupfilterEnabled)).append("\n");
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

