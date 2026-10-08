package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties   {

    private ConfigNodePropertyBoolean wcmdevmodefilterEnabled;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties.
     *
     * @param wcmdevmodefilterEnabled wcmdevmodefilterEnabled
     */
    public ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties(
        ConfigNodePropertyBoolean wcmdevmodefilterEnabled
    ) {
        this.wcmdevmodefilterEnabled = wcmdevmodefilterEnabled;
    }



    /**
     * Get wcmdevmodefilterEnabled
     * @return wcmdevmodefilterEnabled
     */
    public ConfigNodePropertyBoolean getWcmdevmodefilterEnabled() {
        return wcmdevmodefilterEnabled;
    }

    public void setWcmdevmodefilterEnabled(ConfigNodePropertyBoolean wcmdevmodefilterEnabled) {
        this.wcmdevmodefilterEnabled = wcmdevmodefilterEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties {\n");
        
        sb.append("    wcmdevmodefilterEnabled: ").append(toIndentedString(wcmdevmodefilterEnabled)).append("\n");
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

