package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties   {

    private ConfigNodePropertyString schedulerExpression;
    private ConfigNodePropertyString jmxObjectname;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties.
     *
     * @param schedulerExpression schedulerExpression
     * @param jmxObjectname jmxObjectname
     */
    public ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties(
        ConfigNodePropertyString schedulerExpression, 
        ConfigNodePropertyString jmxObjectname
    ) {
        this.schedulerExpression = schedulerExpression;
        this.jmxObjectname = jmxObjectname;
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
     * Get jmxObjectname
     * @return jmxObjectname
     */
    public ConfigNodePropertyString getJmxObjectname() {
        return jmxObjectname;
    }

    public void setJmxObjectname(ConfigNodePropertyString jmxObjectname) {
        this.jmxObjectname = jmxObjectname;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties {\n");
        
        sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
        sb.append("    jmxObjectname: ").append(toIndentedString(jmxObjectname)).append("\n");
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

