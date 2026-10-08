package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmMsmImplServletsAuditLogServletProperties   {

    private ConfigNodePropertyInteger auditlogservletDefaultEventsCount;
    private ConfigNodePropertyString auditlogservletDefaultPath;

    /**
     * Default constructor.
     */
    public ComDayCqWcmMsmImplServletsAuditLogServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmMsmImplServletsAuditLogServletProperties.
     *
     * @param auditlogservletDefaultEventsCount auditlogservletDefaultEventsCount
     * @param auditlogservletDefaultPath auditlogservletDefaultPath
     */
    public ComDayCqWcmMsmImplServletsAuditLogServletProperties(
        ConfigNodePropertyInteger auditlogservletDefaultEventsCount, 
        ConfigNodePropertyString auditlogservletDefaultPath
    ) {
        this.auditlogservletDefaultEventsCount = auditlogservletDefaultEventsCount;
        this.auditlogservletDefaultPath = auditlogservletDefaultPath;
    }



    /**
     * Get auditlogservletDefaultEventsCount
     * @return auditlogservletDefaultEventsCount
     */
    public ConfigNodePropertyInteger getAuditlogservletDefaultEventsCount() {
        return auditlogservletDefaultEventsCount;
    }

    public void setAuditlogservletDefaultEventsCount(ConfigNodePropertyInteger auditlogservletDefaultEventsCount) {
        this.auditlogservletDefaultEventsCount = auditlogservletDefaultEventsCount;
    }

    /**
     * Get auditlogservletDefaultPath
     * @return auditlogservletDefaultPath
     */
    public ConfigNodePropertyString getAuditlogservletDefaultPath() {
        return auditlogservletDefaultPath;
    }

    public void setAuditlogservletDefaultPath(ConfigNodePropertyString auditlogservletDefaultPath) {
        this.auditlogservletDefaultPath = auditlogservletDefaultPath;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmMsmImplServletsAuditLogServletProperties {\n");
        
        sb.append("    auditlogservletDefaultEventsCount: ").append(toIndentedString(auditlogservletDefaultEventsCount)).append("\n");
        sb.append("    auditlogservletDefaultPath: ").append(toIndentedString(auditlogservletDefaultPath)).append("\n");
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

