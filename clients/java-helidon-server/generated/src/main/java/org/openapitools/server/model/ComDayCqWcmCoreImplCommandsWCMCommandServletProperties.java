package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplCommandsWCMCommandServletProperties   {

    private ConfigNodePropertyArray wcmcommandservletDeleteWhitelist;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplCommandsWCMCommandServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplCommandsWCMCommandServletProperties.
     *
     * @param wcmcommandservletDeleteWhitelist wcmcommandservletDeleteWhitelist
     */
    public ComDayCqWcmCoreImplCommandsWCMCommandServletProperties(
        ConfigNodePropertyArray wcmcommandservletDeleteWhitelist
    ) {
        this.wcmcommandservletDeleteWhitelist = wcmcommandservletDeleteWhitelist;
    }



    /**
     * Get wcmcommandservletDeleteWhitelist
     * @return wcmcommandservletDeleteWhitelist
     */
    public ConfigNodePropertyArray getWcmcommandservletDeleteWhitelist() {
        return wcmcommandservletDeleteWhitelist;
    }

    public void setWcmcommandservletDeleteWhitelist(ConfigNodePropertyArray wcmcommandservletDeleteWhitelist) {
        this.wcmcommandservletDeleteWhitelist = wcmcommandservletDeleteWhitelist;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplCommandsWCMCommandServletProperties {\n");
        
        sb.append("    wcmcommandservletDeleteWhitelist: ").append(toIndentedString(wcmcommandservletDeleteWhitelist)).append("\n");
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

