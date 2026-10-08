package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqProjectsPurgeSchedulerProperties   {

    private ConfigNodePropertyString scheduledpurgeName;
    private ConfigNodePropertyBoolean scheduledpurgePurgeActive;
    private ConfigNodePropertyArray scheduledpurgeTemplates;
    private ConfigNodePropertyBoolean scheduledpurgePurgeGroups;
    private ConfigNodePropertyBoolean scheduledpurgePurgeAssets;
    private ConfigNodePropertyBoolean scheduledpurgeTerminateRunningWorkflows;
    private ConfigNodePropertyInteger scheduledpurgeDaysold;
    private ConfigNodePropertyInteger scheduledpurgeSaveThreshold;

    /**
     * Default constructor.
     */
    public ComAdobeCqProjectsPurgeSchedulerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqProjectsPurgeSchedulerProperties.
     *
     * @param scheduledpurgeName scheduledpurgeName
     * @param scheduledpurgePurgeActive scheduledpurgePurgeActive
     * @param scheduledpurgeTemplates scheduledpurgeTemplates
     * @param scheduledpurgePurgeGroups scheduledpurgePurgeGroups
     * @param scheduledpurgePurgeAssets scheduledpurgePurgeAssets
     * @param scheduledpurgeTerminateRunningWorkflows scheduledpurgeTerminateRunningWorkflows
     * @param scheduledpurgeDaysold scheduledpurgeDaysold
     * @param scheduledpurgeSaveThreshold scheduledpurgeSaveThreshold
     */
    public ComAdobeCqProjectsPurgeSchedulerProperties(
        ConfigNodePropertyString scheduledpurgeName, 
        ConfigNodePropertyBoolean scheduledpurgePurgeActive, 
        ConfigNodePropertyArray scheduledpurgeTemplates, 
        ConfigNodePropertyBoolean scheduledpurgePurgeGroups, 
        ConfigNodePropertyBoolean scheduledpurgePurgeAssets, 
        ConfigNodePropertyBoolean scheduledpurgeTerminateRunningWorkflows, 
        ConfigNodePropertyInteger scheduledpurgeDaysold, 
        ConfigNodePropertyInteger scheduledpurgeSaveThreshold
    ) {
        this.scheduledpurgeName = scheduledpurgeName;
        this.scheduledpurgePurgeActive = scheduledpurgePurgeActive;
        this.scheduledpurgeTemplates = scheduledpurgeTemplates;
        this.scheduledpurgePurgeGroups = scheduledpurgePurgeGroups;
        this.scheduledpurgePurgeAssets = scheduledpurgePurgeAssets;
        this.scheduledpurgeTerminateRunningWorkflows = scheduledpurgeTerminateRunningWorkflows;
        this.scheduledpurgeDaysold = scheduledpurgeDaysold;
        this.scheduledpurgeSaveThreshold = scheduledpurgeSaveThreshold;
    }



    /**
     * Get scheduledpurgeName
     * @return scheduledpurgeName
     */
    public ConfigNodePropertyString getScheduledpurgeName() {
        return scheduledpurgeName;
    }

    public void setScheduledpurgeName(ConfigNodePropertyString scheduledpurgeName) {
        this.scheduledpurgeName = scheduledpurgeName;
    }

    /**
     * Get scheduledpurgePurgeActive
     * @return scheduledpurgePurgeActive
     */
    public ConfigNodePropertyBoolean getScheduledpurgePurgeActive() {
        return scheduledpurgePurgeActive;
    }

    public void setScheduledpurgePurgeActive(ConfigNodePropertyBoolean scheduledpurgePurgeActive) {
        this.scheduledpurgePurgeActive = scheduledpurgePurgeActive;
    }

    /**
     * Get scheduledpurgeTemplates
     * @return scheduledpurgeTemplates
     */
    public ConfigNodePropertyArray getScheduledpurgeTemplates() {
        return scheduledpurgeTemplates;
    }

    public void setScheduledpurgeTemplates(ConfigNodePropertyArray scheduledpurgeTemplates) {
        this.scheduledpurgeTemplates = scheduledpurgeTemplates;
    }

    /**
     * Get scheduledpurgePurgeGroups
     * @return scheduledpurgePurgeGroups
     */
    public ConfigNodePropertyBoolean getScheduledpurgePurgeGroups() {
        return scheduledpurgePurgeGroups;
    }

    public void setScheduledpurgePurgeGroups(ConfigNodePropertyBoolean scheduledpurgePurgeGroups) {
        this.scheduledpurgePurgeGroups = scheduledpurgePurgeGroups;
    }

    /**
     * Get scheduledpurgePurgeAssets
     * @return scheduledpurgePurgeAssets
     */
    public ConfigNodePropertyBoolean getScheduledpurgePurgeAssets() {
        return scheduledpurgePurgeAssets;
    }

    public void setScheduledpurgePurgeAssets(ConfigNodePropertyBoolean scheduledpurgePurgeAssets) {
        this.scheduledpurgePurgeAssets = scheduledpurgePurgeAssets;
    }

    /**
     * Get scheduledpurgeTerminateRunningWorkflows
     * @return scheduledpurgeTerminateRunningWorkflows
     */
    public ConfigNodePropertyBoolean getScheduledpurgeTerminateRunningWorkflows() {
        return scheduledpurgeTerminateRunningWorkflows;
    }

    public void setScheduledpurgeTerminateRunningWorkflows(ConfigNodePropertyBoolean scheduledpurgeTerminateRunningWorkflows) {
        this.scheduledpurgeTerminateRunningWorkflows = scheduledpurgeTerminateRunningWorkflows;
    }

    /**
     * Get scheduledpurgeDaysold
     * @return scheduledpurgeDaysold
     */
    public ConfigNodePropertyInteger getScheduledpurgeDaysold() {
        return scheduledpurgeDaysold;
    }

    public void setScheduledpurgeDaysold(ConfigNodePropertyInteger scheduledpurgeDaysold) {
        this.scheduledpurgeDaysold = scheduledpurgeDaysold;
    }

    /**
     * Get scheduledpurgeSaveThreshold
     * @return scheduledpurgeSaveThreshold
     */
    public ConfigNodePropertyInteger getScheduledpurgeSaveThreshold() {
        return scheduledpurgeSaveThreshold;
    }

    public void setScheduledpurgeSaveThreshold(ConfigNodePropertyInteger scheduledpurgeSaveThreshold) {
        this.scheduledpurgeSaveThreshold = scheduledpurgeSaveThreshold;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqProjectsPurgeSchedulerProperties {\n");
        
        sb.append("    scheduledpurgeName: ").append(toIndentedString(scheduledpurgeName)).append("\n");
        sb.append("    scheduledpurgePurgeActive: ").append(toIndentedString(scheduledpurgePurgeActive)).append("\n");
        sb.append("    scheduledpurgeTemplates: ").append(toIndentedString(scheduledpurgeTemplates)).append("\n");
        sb.append("    scheduledpurgePurgeGroups: ").append(toIndentedString(scheduledpurgePurgeGroups)).append("\n");
        sb.append("    scheduledpurgePurgeAssets: ").append(toIndentedString(scheduledpurgePurgeAssets)).append("\n");
        sb.append("    scheduledpurgeTerminateRunningWorkflows: ").append(toIndentedString(scheduledpurgeTerminateRunningWorkflows)).append("\n");
        sb.append("    scheduledpurgeDaysold: ").append(toIndentedString(scheduledpurgeDaysold)).append("\n");
        sb.append("    scheduledpurgeSaveThreshold: ").append(toIndentedString(scheduledpurgeSaveThreshold)).append("\n");
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

