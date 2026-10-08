package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCrxSecurityTokenImplTokenCleanupTaskProperties   {

    private ConfigNodePropertyBoolean enableTokenCleanupTask;
    private ConfigNodePropertyString schedulerExpression;
    private ConfigNodePropertyInteger batchSize;

    /**
     * Default constructor.
     */
    public ComDayCrxSecurityTokenImplTokenCleanupTaskProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.
     *
     * @param enableTokenCleanupTask enableTokenCleanupTask
     * @param schedulerExpression schedulerExpression
     * @param batchSize batchSize
     */
    public ComDayCrxSecurityTokenImplTokenCleanupTaskProperties(
        ConfigNodePropertyBoolean enableTokenCleanupTask, 
        ConfigNodePropertyString schedulerExpression, 
        ConfigNodePropertyInteger batchSize
    ) {
        this.enableTokenCleanupTask = enableTokenCleanupTask;
        this.schedulerExpression = schedulerExpression;
        this.batchSize = batchSize;
    }



    /**
     * Get enableTokenCleanupTask
     * @return enableTokenCleanupTask
     */
    public ConfigNodePropertyBoolean getEnableTokenCleanupTask() {
        return enableTokenCleanupTask;
    }

    public void setEnableTokenCleanupTask(ConfigNodePropertyBoolean enableTokenCleanupTask) {
        this.enableTokenCleanupTask = enableTokenCleanupTask;
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
     * Get batchSize
     * @return batchSize
     */
    public ConfigNodePropertyInteger getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(ConfigNodePropertyInteger batchSize) {
        this.batchSize = batchSize;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCrxSecurityTokenImplTokenCleanupTaskProperties {\n");
        
        sb.append("    enableTokenCleanupTask: ").append(toIndentedString(enableTokenCleanupTask)).append("\n");
        sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
        sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
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

