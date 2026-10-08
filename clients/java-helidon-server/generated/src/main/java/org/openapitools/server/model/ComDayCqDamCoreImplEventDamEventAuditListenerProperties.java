package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplEventDamEventAuditListenerProperties   {

    private ConfigNodePropertyString eventFilter;
    private ConfigNodePropertyBoolean enabled;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplEventDamEventAuditListenerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplEventDamEventAuditListenerProperties.
     *
     * @param eventFilter eventFilter
     * @param enabled enabled
     */
    public ComDayCqDamCoreImplEventDamEventAuditListenerProperties(
        ConfigNodePropertyString eventFilter, 
        ConfigNodePropertyBoolean enabled
    ) {
        this.eventFilter = eventFilter;
        this.enabled = enabled;
    }



    /**
     * Get eventFilter
     * @return eventFilter
     */
    public ConfigNodePropertyString getEventFilter() {
        return eventFilter;
    }

    public void setEventFilter(ConfigNodePropertyString eventFilter) {
        this.eventFilter = eventFilter;
    }

    /**
     * Get enabled
     * @return enabled
     */
    public ConfigNodePropertyBoolean getEnabled() {
        return enabled;
    }

    public void setEnabled(ConfigNodePropertyBoolean enabled) {
        this.enabled = enabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplEventDamEventAuditListenerProperties {\n");
        
        sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

