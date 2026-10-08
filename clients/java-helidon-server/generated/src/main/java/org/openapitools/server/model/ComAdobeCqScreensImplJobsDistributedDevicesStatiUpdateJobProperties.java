package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties   {

    private ConfigNodePropertyString schedulerExpression;

    /**
     * Default constructor.
     */
    public ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties.
     *
     * @param schedulerExpression schedulerExpression
     */
    public ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties(
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
        sb.append("class ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties {\n");
        
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

