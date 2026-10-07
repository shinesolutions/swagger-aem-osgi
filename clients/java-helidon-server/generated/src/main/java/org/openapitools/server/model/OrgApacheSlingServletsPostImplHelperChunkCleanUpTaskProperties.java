package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties   {

    private ConfigNodePropertyString schedulerExpression;
    private ConfigNodePropertyBoolean schedulerConcurrent;
    private ConfigNodePropertyInteger chunkCleanupAge;

    /**
     * Default constructor.
     */
    public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.
     *
     * @param schedulerExpression schedulerExpression
     * @param schedulerConcurrent schedulerConcurrent
     * @param chunkCleanupAge chunkCleanupAge
     */
    public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties(
        ConfigNodePropertyString schedulerExpression, 
        ConfigNodePropertyBoolean schedulerConcurrent, 
        ConfigNodePropertyInteger chunkCleanupAge
    ) {
        this.schedulerExpression = schedulerExpression;
        this.schedulerConcurrent = schedulerConcurrent;
        this.chunkCleanupAge = chunkCleanupAge;
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
     * Get schedulerConcurrent
     * @return schedulerConcurrent
     */
    public ConfigNodePropertyBoolean getSchedulerConcurrent() {
        return schedulerConcurrent;
    }

    public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
        this.schedulerConcurrent = schedulerConcurrent;
    }

    /**
     * Get chunkCleanupAge
     * @return chunkCleanupAge
     */
    public ConfigNodePropertyInteger getChunkCleanupAge() {
        return chunkCleanupAge;
    }

    public void setChunkCleanupAge(ConfigNodePropertyInteger chunkCleanupAge) {
        this.chunkCleanupAge = chunkCleanupAge;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties {\n");
        
        sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
        sb.append("    schedulerConcurrent: ").append(toIndentedString(schedulerConcurrent)).append("\n");
        sb.append("    chunkCleanupAge: ").append(toIndentedString(chunkCleanupAge)).append("\n");
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

