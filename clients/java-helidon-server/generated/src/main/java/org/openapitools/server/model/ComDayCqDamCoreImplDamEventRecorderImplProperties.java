package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplDamEventRecorderImplProperties   {

    private ConfigNodePropertyString eventFilter;
    private ConfigNodePropertyInteger eventQueueLength;
    private ConfigNodePropertyBoolean eventrecorderEnabled;
    private ConfigNodePropertyArray eventrecorderBlacklist;
    private ConfigNodePropertyDropDown eventrecorderEventtypes;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplDamEventRecorderImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplDamEventRecorderImplProperties.
     *
     * @param eventFilter eventFilter
     * @param eventQueueLength eventQueueLength
     * @param eventrecorderEnabled eventrecorderEnabled
     * @param eventrecorderBlacklist eventrecorderBlacklist
     * @param eventrecorderEventtypes eventrecorderEventtypes
     */
    public ComDayCqDamCoreImplDamEventRecorderImplProperties(
        ConfigNodePropertyString eventFilter, 
        ConfigNodePropertyInteger eventQueueLength, 
        ConfigNodePropertyBoolean eventrecorderEnabled, 
        ConfigNodePropertyArray eventrecorderBlacklist, 
        ConfigNodePropertyDropDown eventrecorderEventtypes
    ) {
        this.eventFilter = eventFilter;
        this.eventQueueLength = eventQueueLength;
        this.eventrecorderEnabled = eventrecorderEnabled;
        this.eventrecorderBlacklist = eventrecorderBlacklist;
        this.eventrecorderEventtypes = eventrecorderEventtypes;
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
     * Get eventQueueLength
     * @return eventQueueLength
     */
    public ConfigNodePropertyInteger getEventQueueLength() {
        return eventQueueLength;
    }

    public void setEventQueueLength(ConfigNodePropertyInteger eventQueueLength) {
        this.eventQueueLength = eventQueueLength;
    }

    /**
     * Get eventrecorderEnabled
     * @return eventrecorderEnabled
     */
    public ConfigNodePropertyBoolean getEventrecorderEnabled() {
        return eventrecorderEnabled;
    }

    public void setEventrecorderEnabled(ConfigNodePropertyBoolean eventrecorderEnabled) {
        this.eventrecorderEnabled = eventrecorderEnabled;
    }

    /**
     * Get eventrecorderBlacklist
     * @return eventrecorderBlacklist
     */
    public ConfigNodePropertyArray getEventrecorderBlacklist() {
        return eventrecorderBlacklist;
    }

    public void setEventrecorderBlacklist(ConfigNodePropertyArray eventrecorderBlacklist) {
        this.eventrecorderBlacklist = eventrecorderBlacklist;
    }

    /**
     * Get eventrecorderEventtypes
     * @return eventrecorderEventtypes
     */
    public ConfigNodePropertyDropDown getEventrecorderEventtypes() {
        return eventrecorderEventtypes;
    }

    public void setEventrecorderEventtypes(ConfigNodePropertyDropDown eventrecorderEventtypes) {
        this.eventrecorderEventtypes = eventrecorderEventtypes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplDamEventRecorderImplProperties {\n");
        
        sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
        sb.append("    eventQueueLength: ").append(toIndentedString(eventQueueLength)).append("\n");
        sb.append("    eventrecorderEnabled: ").append(toIndentedString(eventrecorderEnabled)).append("\n");
        sb.append("    eventrecorderBlacklist: ").append(toIndentedString(eventrecorderBlacklist)).append("\n");
        sb.append("    eventrecorderEventtypes: ").append(toIndentedString(eventrecorderEventtypes)).append("\n");
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

