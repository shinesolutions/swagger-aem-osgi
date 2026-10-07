package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplEventPageEventAuditListenerProperties   {

    private ConfigNodePropertyString configured;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplEventPageEventAuditListenerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplEventPageEventAuditListenerProperties.
     *
     * @param configured configured
     */
    public ComDayCqWcmCoreImplEventPageEventAuditListenerProperties(
        ConfigNodePropertyString configured
    ) {
        this.configured = configured;
    }



    /**
     * Get configured
     * @return configured
     */
    public ConfigNodePropertyString getConfigured() {
        return configured;
    }

    public void setConfigured(ConfigNodePropertyString configured) {
        this.configured = configured;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplEventPageEventAuditListenerProperties {\n");
        
        sb.append("    configured: ").append(toIndentedString(configured)).append("\n");
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

