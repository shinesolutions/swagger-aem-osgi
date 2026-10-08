package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmUndoUndoConfigProperties   {

    private ConfigNodePropertyBoolean cqWcmUndoEnabled;
    private ConfigNodePropertyString cqWcmUndoPath;
    private ConfigNodePropertyInteger cqWcmUndoValidity;
    private ConfigNodePropertyInteger cqWcmUndoSteps;
    private ConfigNodePropertyString cqWcmUndoPersistence;
    private ConfigNodePropertyBoolean cqWcmUndoPersistenceMode;
    private ConfigNodePropertyString cqWcmUndoMarkermode;
    private ConfigNodePropertyArray cqWcmUndoWhitelist;
    private ConfigNodePropertyArray cqWcmUndoBlacklist;

    /**
     * Default constructor.
     */
    public ComDayCqWcmUndoUndoConfigProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmUndoUndoConfigProperties.
     *
     * @param cqWcmUndoEnabled cqWcmUndoEnabled
     * @param cqWcmUndoPath cqWcmUndoPath
     * @param cqWcmUndoValidity cqWcmUndoValidity
     * @param cqWcmUndoSteps cqWcmUndoSteps
     * @param cqWcmUndoPersistence cqWcmUndoPersistence
     * @param cqWcmUndoPersistenceMode cqWcmUndoPersistenceMode
     * @param cqWcmUndoMarkermode cqWcmUndoMarkermode
     * @param cqWcmUndoWhitelist cqWcmUndoWhitelist
     * @param cqWcmUndoBlacklist cqWcmUndoBlacklist
     */
    public ComDayCqWcmUndoUndoConfigProperties(
        ConfigNodePropertyBoolean cqWcmUndoEnabled, 
        ConfigNodePropertyString cqWcmUndoPath, 
        ConfigNodePropertyInteger cqWcmUndoValidity, 
        ConfigNodePropertyInteger cqWcmUndoSteps, 
        ConfigNodePropertyString cqWcmUndoPersistence, 
        ConfigNodePropertyBoolean cqWcmUndoPersistenceMode, 
        ConfigNodePropertyString cqWcmUndoMarkermode, 
        ConfigNodePropertyArray cqWcmUndoWhitelist, 
        ConfigNodePropertyArray cqWcmUndoBlacklist
    ) {
        this.cqWcmUndoEnabled = cqWcmUndoEnabled;
        this.cqWcmUndoPath = cqWcmUndoPath;
        this.cqWcmUndoValidity = cqWcmUndoValidity;
        this.cqWcmUndoSteps = cqWcmUndoSteps;
        this.cqWcmUndoPersistence = cqWcmUndoPersistence;
        this.cqWcmUndoPersistenceMode = cqWcmUndoPersistenceMode;
        this.cqWcmUndoMarkermode = cqWcmUndoMarkermode;
        this.cqWcmUndoWhitelist = cqWcmUndoWhitelist;
        this.cqWcmUndoBlacklist = cqWcmUndoBlacklist;
    }



    /**
     * Get cqWcmUndoEnabled
     * @return cqWcmUndoEnabled
     */
    public ConfigNodePropertyBoolean getCqWcmUndoEnabled() {
        return cqWcmUndoEnabled;
    }

    public void setCqWcmUndoEnabled(ConfigNodePropertyBoolean cqWcmUndoEnabled) {
        this.cqWcmUndoEnabled = cqWcmUndoEnabled;
    }

    /**
     * Get cqWcmUndoPath
     * @return cqWcmUndoPath
     */
    public ConfigNodePropertyString getCqWcmUndoPath() {
        return cqWcmUndoPath;
    }

    public void setCqWcmUndoPath(ConfigNodePropertyString cqWcmUndoPath) {
        this.cqWcmUndoPath = cqWcmUndoPath;
    }

    /**
     * Get cqWcmUndoValidity
     * @return cqWcmUndoValidity
     */
    public ConfigNodePropertyInteger getCqWcmUndoValidity() {
        return cqWcmUndoValidity;
    }

    public void setCqWcmUndoValidity(ConfigNodePropertyInteger cqWcmUndoValidity) {
        this.cqWcmUndoValidity = cqWcmUndoValidity;
    }

    /**
     * Get cqWcmUndoSteps
     * @return cqWcmUndoSteps
     */
    public ConfigNodePropertyInteger getCqWcmUndoSteps() {
        return cqWcmUndoSteps;
    }

    public void setCqWcmUndoSteps(ConfigNodePropertyInteger cqWcmUndoSteps) {
        this.cqWcmUndoSteps = cqWcmUndoSteps;
    }

    /**
     * Get cqWcmUndoPersistence
     * @return cqWcmUndoPersistence
     */
    public ConfigNodePropertyString getCqWcmUndoPersistence() {
        return cqWcmUndoPersistence;
    }

    public void setCqWcmUndoPersistence(ConfigNodePropertyString cqWcmUndoPersistence) {
        this.cqWcmUndoPersistence = cqWcmUndoPersistence;
    }

    /**
     * Get cqWcmUndoPersistenceMode
     * @return cqWcmUndoPersistenceMode
     */
    public ConfigNodePropertyBoolean getCqWcmUndoPersistenceMode() {
        return cqWcmUndoPersistenceMode;
    }

    public void setCqWcmUndoPersistenceMode(ConfigNodePropertyBoolean cqWcmUndoPersistenceMode) {
        this.cqWcmUndoPersistenceMode = cqWcmUndoPersistenceMode;
    }

    /**
     * Get cqWcmUndoMarkermode
     * @return cqWcmUndoMarkermode
     */
    public ConfigNodePropertyString getCqWcmUndoMarkermode() {
        return cqWcmUndoMarkermode;
    }

    public void setCqWcmUndoMarkermode(ConfigNodePropertyString cqWcmUndoMarkermode) {
        this.cqWcmUndoMarkermode = cqWcmUndoMarkermode;
    }

    /**
     * Get cqWcmUndoWhitelist
     * @return cqWcmUndoWhitelist
     */
    public ConfigNodePropertyArray getCqWcmUndoWhitelist() {
        return cqWcmUndoWhitelist;
    }

    public void setCqWcmUndoWhitelist(ConfigNodePropertyArray cqWcmUndoWhitelist) {
        this.cqWcmUndoWhitelist = cqWcmUndoWhitelist;
    }

    /**
     * Get cqWcmUndoBlacklist
     * @return cqWcmUndoBlacklist
     */
    public ConfigNodePropertyArray getCqWcmUndoBlacklist() {
        return cqWcmUndoBlacklist;
    }

    public void setCqWcmUndoBlacklist(ConfigNodePropertyArray cqWcmUndoBlacklist) {
        this.cqWcmUndoBlacklist = cqWcmUndoBlacklist;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmUndoUndoConfigProperties {\n");
        
        sb.append("    cqWcmUndoEnabled: ").append(toIndentedString(cqWcmUndoEnabled)).append("\n");
        sb.append("    cqWcmUndoPath: ").append(toIndentedString(cqWcmUndoPath)).append("\n");
        sb.append("    cqWcmUndoValidity: ").append(toIndentedString(cqWcmUndoValidity)).append("\n");
        sb.append("    cqWcmUndoSteps: ").append(toIndentedString(cqWcmUndoSteps)).append("\n");
        sb.append("    cqWcmUndoPersistence: ").append(toIndentedString(cqWcmUndoPersistence)).append("\n");
        sb.append("    cqWcmUndoPersistenceMode: ").append(toIndentedString(cqWcmUndoPersistenceMode)).append("\n");
        sb.append("    cqWcmUndoMarkermode: ").append(toIndentedString(cqWcmUndoMarkermode)).append("\n");
        sb.append("    cqWcmUndoWhitelist: ").append(toIndentedString(cqWcmUndoWhitelist)).append("\n");
        sb.append("    cqWcmUndoBlacklist: ").append(toIndentedString(cqWcmUndoBlacklist)).append("\n");
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

