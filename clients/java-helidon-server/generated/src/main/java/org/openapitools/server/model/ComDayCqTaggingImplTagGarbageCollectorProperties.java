package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqTaggingImplTagGarbageCollectorProperties   {

    private ConfigNodePropertyString schedulerExpression;

    /**
     * Default constructor.
     */
    public ComDayCqTaggingImplTagGarbageCollectorProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqTaggingImplTagGarbageCollectorProperties.
     *
     * @param schedulerExpression schedulerExpression
     */
    public ComDayCqTaggingImplTagGarbageCollectorProperties(
        ConfigNodePropertyString schedulerExpression
    ) {
        this.schedulerExpression = schedulerExpression;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqTaggingImplTagGarbageCollectorProperties {\n");
        
        sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
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

