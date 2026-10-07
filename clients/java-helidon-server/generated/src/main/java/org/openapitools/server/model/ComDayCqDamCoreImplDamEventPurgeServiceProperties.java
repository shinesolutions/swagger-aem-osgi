package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplDamEventPurgeServiceProperties   {

    private ConfigNodePropertyString schedulerExpression;
    private ConfigNodePropertyInteger maxSavedActivities;
    private ConfigNodePropertyInteger saveInterval;
    private ConfigNodePropertyBoolean enableActivityPurge;
    private ConfigNodePropertyDropDown eventTypes;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplDamEventPurgeServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplDamEventPurgeServiceProperties.
     *
     * @param schedulerExpression schedulerExpression
     * @param maxSavedActivities maxSavedActivities
     * @param saveInterval saveInterval
     * @param enableActivityPurge enableActivityPurge
     * @param eventTypes eventTypes
     */
    public ComDayCqDamCoreImplDamEventPurgeServiceProperties(
        ConfigNodePropertyString schedulerExpression, 
        ConfigNodePropertyInteger maxSavedActivities, 
        ConfigNodePropertyInteger saveInterval, 
        ConfigNodePropertyBoolean enableActivityPurge, 
        ConfigNodePropertyDropDown eventTypes
    ) {
        this.schedulerExpression = schedulerExpression;
        this.maxSavedActivities = maxSavedActivities;
        this.saveInterval = saveInterval;
        this.enableActivityPurge = enableActivityPurge;
        this.eventTypes = eventTypes;
    }



    /**
     * Get schedulerExpression
     * @return schedulerExpression
     */
    public ConfigNodePropertyString getSchedulerExpression() {
        return schedulerExpression;
    }

    public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
        this.schedulerExpression = schedulerExpression;
    }

    /**
     * Get maxSavedActivities
     * @return maxSavedActivities
     */
    public ConfigNodePropertyInteger getMaxSavedActivities() {
        return maxSavedActivities;
    }

    public void setMaxSavedActivities(ConfigNodePropertyInteger maxSavedActivities) {
        this.maxSavedActivities = maxSavedActivities;
    }

    /**
     * Get saveInterval
     * @return saveInterval
     */
    public ConfigNodePropertyInteger getSaveInterval() {
        return saveInterval;
    }

    public void setSaveInterval(ConfigNodePropertyInteger saveInterval) {
        this.saveInterval = saveInterval;
    }

    /**
     * Get enableActivityPurge
     * @return enableActivityPurge
     */
    public ConfigNodePropertyBoolean getEnableActivityPurge() {
        return enableActivityPurge;
    }

    public void setEnableActivityPurge(ConfigNodePropertyBoolean enableActivityPurge) {
        this.enableActivityPurge = enableActivityPurge;
    }

    /**
     * Get eventTypes
     * @return eventTypes
     */
    public ConfigNodePropertyDropDown getEventTypes() {
        return eventTypes;
    }

    public void setEventTypes(ConfigNodePropertyDropDown eventTypes) {
        this.eventTypes = eventTypes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplDamEventPurgeServiceProperties {\n");
        
        sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
        sb.append("    maxSavedActivities: ").append(toIndentedString(maxSavedActivities)).append("\n");
        sb.append("    saveInterval: ").append(toIndentedString(saveInterval)).append("\n");
        sb.append("    enableActivityPurge: ").append(toIndentedString(enableActivityPurge)).append("\n");
        sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
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

