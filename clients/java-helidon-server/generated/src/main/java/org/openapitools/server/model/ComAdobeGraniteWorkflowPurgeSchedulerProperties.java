package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteWorkflowPurgeSchedulerProperties   {

    private ConfigNodePropertyString scheduledpurgeName;
    private ConfigNodePropertyDropDown scheduledpurgeWorkflowStatus;
    private ConfigNodePropertyArray scheduledpurgeModelIds;
    private ConfigNodePropertyInteger scheduledpurgeDaysold;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteWorkflowPurgeSchedulerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteWorkflowPurgeSchedulerProperties.
     *
     * @param scheduledpurgeName scheduledpurgeName
     * @param scheduledpurgeWorkflowStatus scheduledpurgeWorkflowStatus
     * @param scheduledpurgeModelIds scheduledpurgeModelIds
     * @param scheduledpurgeDaysold scheduledpurgeDaysold
     */
    public ComAdobeGraniteWorkflowPurgeSchedulerProperties(
        ConfigNodePropertyString scheduledpurgeName, 
        ConfigNodePropertyDropDown scheduledpurgeWorkflowStatus, 
        ConfigNodePropertyArray scheduledpurgeModelIds, 
        ConfigNodePropertyInteger scheduledpurgeDaysold
    ) {
        this.scheduledpurgeName = scheduledpurgeName;
        this.scheduledpurgeWorkflowStatus = scheduledpurgeWorkflowStatus;
        this.scheduledpurgeModelIds = scheduledpurgeModelIds;
        this.scheduledpurgeDaysold = scheduledpurgeDaysold;
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
     * Get scheduledpurgeWorkflowStatus
     * @return scheduledpurgeWorkflowStatus
     */
    public ConfigNodePropertyDropDown getScheduledpurgeWorkflowStatus() {
        return scheduledpurgeWorkflowStatus;
    }

    public void setScheduledpurgeWorkflowStatus(ConfigNodePropertyDropDown scheduledpurgeWorkflowStatus) {
        this.scheduledpurgeWorkflowStatus = scheduledpurgeWorkflowStatus;
    }

    /**
     * Get scheduledpurgeModelIds
     * @return scheduledpurgeModelIds
     */
    public ConfigNodePropertyArray getScheduledpurgeModelIds() {
        return scheduledpurgeModelIds;
    }

    public void setScheduledpurgeModelIds(ConfigNodePropertyArray scheduledpurgeModelIds) {
        this.scheduledpurgeModelIds = scheduledpurgeModelIds;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteWorkflowPurgeSchedulerProperties {\n");
        
        sb.append("    scheduledpurgeName: ").append(toIndentedString(scheduledpurgeName)).append("\n");
        sb.append("    scheduledpurgeWorkflowStatus: ").append(toIndentedString(scheduledpurgeWorkflowStatus)).append("\n");
        sb.append("    scheduledpurgeModelIds: ").append(toIndentedString(scheduledpurgeModelIds)).append("\n");
        sb.append("    scheduledpurgeDaysold: ").append(toIndentedString(scheduledpurgeDaysold)).append("\n");
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

