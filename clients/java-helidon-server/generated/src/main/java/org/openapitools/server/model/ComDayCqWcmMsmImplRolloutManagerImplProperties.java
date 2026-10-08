package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmMsmImplRolloutManagerImplProperties   {

    private ConfigNodePropertyString eventFilter;
    private ConfigNodePropertyArray rolloutmgrExcludedpropsDefault;
    private ConfigNodePropertyArray rolloutmgrExcludedparagraphpropsDefault;
    private ConfigNodePropertyArray rolloutmgrExcludednodetypesDefault;
    private ConfigNodePropertyInteger rolloutmgrThreadpoolMaxsize;
    private ConfigNodePropertyInteger rolloutmgrThreadpoolMaxshutdowntime;
    private ConfigNodePropertyDropDown rolloutmgrThreadpoolPriority;
    private ConfigNodePropertyInteger rolloutmgrCommitSize;
    private ConfigNodePropertyBoolean rolloutmgrConflicthandlingEnabled;

    /**
     * Default constructor.
     */
    public ComDayCqWcmMsmImplRolloutManagerImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmMsmImplRolloutManagerImplProperties.
     *
     * @param eventFilter eventFilter
     * @param rolloutmgrExcludedpropsDefault rolloutmgrExcludedpropsDefault
     * @param rolloutmgrExcludedparagraphpropsDefault rolloutmgrExcludedparagraphpropsDefault
     * @param rolloutmgrExcludednodetypesDefault rolloutmgrExcludednodetypesDefault
     * @param rolloutmgrThreadpoolMaxsize rolloutmgrThreadpoolMaxsize
     * @param rolloutmgrThreadpoolMaxshutdowntime rolloutmgrThreadpoolMaxshutdowntime
     * @param rolloutmgrThreadpoolPriority rolloutmgrThreadpoolPriority
     * @param rolloutmgrCommitSize rolloutmgrCommitSize
     * @param rolloutmgrConflicthandlingEnabled rolloutmgrConflicthandlingEnabled
     */
    public ComDayCqWcmMsmImplRolloutManagerImplProperties(
        ConfigNodePropertyString eventFilter, 
        ConfigNodePropertyArray rolloutmgrExcludedpropsDefault, 
        ConfigNodePropertyArray rolloutmgrExcludedparagraphpropsDefault, 
        ConfigNodePropertyArray rolloutmgrExcludednodetypesDefault, 
        ConfigNodePropertyInteger rolloutmgrThreadpoolMaxsize, 
        ConfigNodePropertyInteger rolloutmgrThreadpoolMaxshutdowntime, 
        ConfigNodePropertyDropDown rolloutmgrThreadpoolPriority, 
        ConfigNodePropertyInteger rolloutmgrCommitSize, 
        ConfigNodePropertyBoolean rolloutmgrConflicthandlingEnabled
    ) {
        this.eventFilter = eventFilter;
        this.rolloutmgrExcludedpropsDefault = rolloutmgrExcludedpropsDefault;
        this.rolloutmgrExcludedparagraphpropsDefault = rolloutmgrExcludedparagraphpropsDefault;
        this.rolloutmgrExcludednodetypesDefault = rolloutmgrExcludednodetypesDefault;
        this.rolloutmgrThreadpoolMaxsize = rolloutmgrThreadpoolMaxsize;
        this.rolloutmgrThreadpoolMaxshutdowntime = rolloutmgrThreadpoolMaxshutdowntime;
        this.rolloutmgrThreadpoolPriority = rolloutmgrThreadpoolPriority;
        this.rolloutmgrCommitSize = rolloutmgrCommitSize;
        this.rolloutmgrConflicthandlingEnabled = rolloutmgrConflicthandlingEnabled;
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
     * Get rolloutmgrExcludedpropsDefault
     * @return rolloutmgrExcludedpropsDefault
     */
    public ConfigNodePropertyArray getRolloutmgrExcludedpropsDefault() {
        return rolloutmgrExcludedpropsDefault;
    }

    public void setRolloutmgrExcludedpropsDefault(ConfigNodePropertyArray rolloutmgrExcludedpropsDefault) {
        this.rolloutmgrExcludedpropsDefault = rolloutmgrExcludedpropsDefault;
    }

    /**
     * Get rolloutmgrExcludedparagraphpropsDefault
     * @return rolloutmgrExcludedparagraphpropsDefault
     */
    public ConfigNodePropertyArray getRolloutmgrExcludedparagraphpropsDefault() {
        return rolloutmgrExcludedparagraphpropsDefault;
    }

    public void setRolloutmgrExcludedparagraphpropsDefault(ConfigNodePropertyArray rolloutmgrExcludedparagraphpropsDefault) {
        this.rolloutmgrExcludedparagraphpropsDefault = rolloutmgrExcludedparagraphpropsDefault;
    }

    /**
     * Get rolloutmgrExcludednodetypesDefault
     * @return rolloutmgrExcludednodetypesDefault
     */
    public ConfigNodePropertyArray getRolloutmgrExcludednodetypesDefault() {
        return rolloutmgrExcludednodetypesDefault;
    }

    public void setRolloutmgrExcludednodetypesDefault(ConfigNodePropertyArray rolloutmgrExcludednodetypesDefault) {
        this.rolloutmgrExcludednodetypesDefault = rolloutmgrExcludednodetypesDefault;
    }

    /**
     * Get rolloutmgrThreadpoolMaxsize
     * @return rolloutmgrThreadpoolMaxsize
     */
    public ConfigNodePropertyInteger getRolloutmgrThreadpoolMaxsize() {
        return rolloutmgrThreadpoolMaxsize;
    }

    public void setRolloutmgrThreadpoolMaxsize(ConfigNodePropertyInteger rolloutmgrThreadpoolMaxsize) {
        this.rolloutmgrThreadpoolMaxsize = rolloutmgrThreadpoolMaxsize;
    }

    /**
     * Get rolloutmgrThreadpoolMaxshutdowntime
     * @return rolloutmgrThreadpoolMaxshutdowntime
     */
    public ConfigNodePropertyInteger getRolloutmgrThreadpoolMaxshutdowntime() {
        return rolloutmgrThreadpoolMaxshutdowntime;
    }

    public void setRolloutmgrThreadpoolMaxshutdowntime(ConfigNodePropertyInteger rolloutmgrThreadpoolMaxshutdowntime) {
        this.rolloutmgrThreadpoolMaxshutdowntime = rolloutmgrThreadpoolMaxshutdowntime;
    }

    /**
     * Get rolloutmgrThreadpoolPriority
     * @return rolloutmgrThreadpoolPriority
     */
    public ConfigNodePropertyDropDown getRolloutmgrThreadpoolPriority() {
        return rolloutmgrThreadpoolPriority;
    }

    public void setRolloutmgrThreadpoolPriority(ConfigNodePropertyDropDown rolloutmgrThreadpoolPriority) {
        this.rolloutmgrThreadpoolPriority = rolloutmgrThreadpoolPriority;
    }

    /**
     * Get rolloutmgrCommitSize
     * @return rolloutmgrCommitSize
     */
    public ConfigNodePropertyInteger getRolloutmgrCommitSize() {
        return rolloutmgrCommitSize;
    }

    public void setRolloutmgrCommitSize(ConfigNodePropertyInteger rolloutmgrCommitSize) {
        this.rolloutmgrCommitSize = rolloutmgrCommitSize;
    }

    /**
     * Get rolloutmgrConflicthandlingEnabled
     * @return rolloutmgrConflicthandlingEnabled
     */
    public ConfigNodePropertyBoolean getRolloutmgrConflicthandlingEnabled() {
        return rolloutmgrConflicthandlingEnabled;
    }

    public void setRolloutmgrConflicthandlingEnabled(ConfigNodePropertyBoolean rolloutmgrConflicthandlingEnabled) {
        this.rolloutmgrConflicthandlingEnabled = rolloutmgrConflicthandlingEnabled;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmMsmImplRolloutManagerImplProperties {\n");
        
        sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
        sb.append("    rolloutmgrExcludedpropsDefault: ").append(toIndentedString(rolloutmgrExcludedpropsDefault)).append("\n");
        sb.append("    rolloutmgrExcludedparagraphpropsDefault: ").append(toIndentedString(rolloutmgrExcludedparagraphpropsDefault)).append("\n");
        sb.append("    rolloutmgrExcludednodetypesDefault: ").append(toIndentedString(rolloutmgrExcludednodetypesDefault)).append("\n");
        sb.append("    rolloutmgrThreadpoolMaxsize: ").append(toIndentedString(rolloutmgrThreadpoolMaxsize)).append("\n");
        sb.append("    rolloutmgrThreadpoolMaxshutdowntime: ").append(toIndentedString(rolloutmgrThreadpoolMaxshutdowntime)).append("\n");
        sb.append("    rolloutmgrThreadpoolPriority: ").append(toIndentedString(rolloutmgrThreadpoolPriority)).append("\n");
        sb.append("    rolloutmgrCommitSize: ").append(toIndentedString(rolloutmgrCommitSize)).append("\n");
        sb.append("    rolloutmgrConflicthandlingEnabled: ").append(toIndentedString(rolloutmgrConflicthandlingEnabled)).append("\n");
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

