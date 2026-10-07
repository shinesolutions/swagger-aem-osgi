package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqReplicationImplReverseReplicatorProperties   {

    private ConfigNodePropertyInteger schedulerPeriod;

    /**
     * Default constructor.
     */
    public ComDayCqReplicationImplReverseReplicatorProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqReplicationImplReverseReplicatorProperties.
     *
     * @param schedulerPeriod schedulerPeriod
     */
    public ComDayCqReplicationImplReverseReplicatorProperties(
        ConfigNodePropertyInteger schedulerPeriod
    ) {
        this.schedulerPeriod = schedulerPeriod;
    }



    /**
     * Get schedulerPeriod
     * @return schedulerPeriod
     */
    public ConfigNodePropertyInteger getSchedulerPeriod() {
        return schedulerPeriod;
    }

    public void setSchedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
        this.schedulerPeriod = schedulerPeriod;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqReplicationImplReverseReplicatorProperties {\n");
        
        sb.append("    schedulerPeriod: ").append(toIndentedString(schedulerPeriod)).append("\n");
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

