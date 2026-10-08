package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties   {

    private ConfigNodePropertyString poolName;
    private ConfigNodePropertyArray allowedPoolNames;
    private ConfigNodePropertyBoolean schedulerUseleaderforsingle;
    private ConfigNodePropertyArray metricsFilters;
    private ConfigNodePropertyInteger slowThresholdMillis;

    /**
     * Default constructor.
     */
    public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.
     *
     * @param poolName poolName
     * @param allowedPoolNames allowedPoolNames
     * @param schedulerUseleaderforsingle schedulerUseleaderforsingle
     * @param metricsFilters metricsFilters
     * @param slowThresholdMillis slowThresholdMillis
     */
    public OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties(
        ConfigNodePropertyString poolName, 
        ConfigNodePropertyArray allowedPoolNames, 
        ConfigNodePropertyBoolean schedulerUseleaderforsingle, 
        ConfigNodePropertyArray metricsFilters, 
        ConfigNodePropertyInteger slowThresholdMillis
    ) {
        this.poolName = poolName;
        this.allowedPoolNames = allowedPoolNames;
        this.schedulerUseleaderforsingle = schedulerUseleaderforsingle;
        this.metricsFilters = metricsFilters;
        this.slowThresholdMillis = slowThresholdMillis;
    }



    /**
     * Get poolName
     * @return poolName
     */
    public ConfigNodePropertyString getPoolName() {
        return poolName;
    }

    public void setPoolName(ConfigNodePropertyString poolName) {
        this.poolName = poolName;
    }

    /**
     * Get allowedPoolNames
     * @return allowedPoolNames
     */
    public ConfigNodePropertyArray getAllowedPoolNames() {
        return allowedPoolNames;
    }

    public void setAllowedPoolNames(ConfigNodePropertyArray allowedPoolNames) {
        this.allowedPoolNames = allowedPoolNames;
    }

    /**
     * Get schedulerUseleaderforsingle
     * @return schedulerUseleaderforsingle
     */
    public ConfigNodePropertyBoolean getSchedulerUseleaderforsingle() {
        return schedulerUseleaderforsingle;
    }

    public void setSchedulerUseleaderforsingle(ConfigNodePropertyBoolean schedulerUseleaderforsingle) {
        this.schedulerUseleaderforsingle = schedulerUseleaderforsingle;
    }

    /**
     * Get metricsFilters
     * @return metricsFilters
     */
    public ConfigNodePropertyArray getMetricsFilters() {
        return metricsFilters;
    }

    public void setMetricsFilters(ConfigNodePropertyArray metricsFilters) {
        this.metricsFilters = metricsFilters;
    }

    /**
     * Get slowThresholdMillis
     * @return slowThresholdMillis
     */
    public ConfigNodePropertyInteger getSlowThresholdMillis() {
        return slowThresholdMillis;
    }

    public void setSlowThresholdMillis(ConfigNodePropertyInteger slowThresholdMillis) {
        this.slowThresholdMillis = slowThresholdMillis;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties {\n");
        
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
        sb.append("    allowedPoolNames: ").append(toIndentedString(allowedPoolNames)).append("\n");
        sb.append("    schedulerUseleaderforsingle: ").append(toIndentedString(schedulerUseleaderforsingle)).append("\n");
        sb.append("    metricsFilters: ").append(toIndentedString(metricsFilters)).append("\n");
        sb.append("    slowThresholdMillis: ").append(toIndentedString(slowThresholdMillis)).append("\n");
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

