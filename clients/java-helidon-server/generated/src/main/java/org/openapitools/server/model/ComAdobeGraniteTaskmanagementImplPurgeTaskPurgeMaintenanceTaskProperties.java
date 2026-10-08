package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties   {

    private ConfigNodePropertyBoolean purgeCompleted;
    private ConfigNodePropertyInteger completedAge;
    private ConfigNodePropertyBoolean purgeActive;
    private ConfigNodePropertyInteger activeAge;
    private ConfigNodePropertyInteger saveThreshold;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.
     *
     * @param purgeCompleted purgeCompleted
     * @param completedAge completedAge
     * @param purgeActive purgeActive
     * @param activeAge activeAge
     * @param saveThreshold saveThreshold
     */
    public ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties(
        ConfigNodePropertyBoolean purgeCompleted, 
        ConfigNodePropertyInteger completedAge, 
        ConfigNodePropertyBoolean purgeActive, 
        ConfigNodePropertyInteger activeAge, 
        ConfigNodePropertyInteger saveThreshold
    ) {
        this.purgeCompleted = purgeCompleted;
        this.completedAge = completedAge;
        this.purgeActive = purgeActive;
        this.activeAge = activeAge;
        this.saveThreshold = saveThreshold;
    }



    /**
     * Get purgeCompleted
     * @return purgeCompleted
     */
    public ConfigNodePropertyBoolean getPurgeCompleted() {
        return purgeCompleted;
    }

    public void setPurgeCompleted(ConfigNodePropertyBoolean purgeCompleted) {
        this.purgeCompleted = purgeCompleted;
    }

    /**
     * Get completedAge
     * @return completedAge
     */
    public ConfigNodePropertyInteger getCompletedAge() {
        return completedAge;
    }

    public void setCompletedAge(ConfigNodePropertyInteger completedAge) {
        this.completedAge = completedAge;
    }

    /**
     * Get purgeActive
     * @return purgeActive
     */
    public ConfigNodePropertyBoolean getPurgeActive() {
        return purgeActive;
    }

    public void setPurgeActive(ConfigNodePropertyBoolean purgeActive) {
        this.purgeActive = purgeActive;
    }

    /**
     * Get activeAge
     * @return activeAge
     */
    public ConfigNodePropertyInteger getActiveAge() {
        return activeAge;
    }

    public void setActiveAge(ConfigNodePropertyInteger activeAge) {
        this.activeAge = activeAge;
    }

    /**
     * Get saveThreshold
     * @return saveThreshold
     */
    public ConfigNodePropertyInteger getSaveThreshold() {
        return saveThreshold;
    }

    public void setSaveThreshold(ConfigNodePropertyInteger saveThreshold) {
        this.saveThreshold = saveThreshold;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties {\n");
        
        sb.append("    purgeCompleted: ").append(toIndentedString(purgeCompleted)).append("\n");
        sb.append("    completedAge: ").append(toIndentedString(completedAge)).append("\n");
        sb.append("    purgeActive: ").append(toIndentedString(purgeActive)).append("\n");
        sb.append("    activeAge: ").append(toIndentedString(activeAge)).append("\n");
        sb.append("    saveThreshold: ").append(toIndentedString(saveThreshold)).append("\n");
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

