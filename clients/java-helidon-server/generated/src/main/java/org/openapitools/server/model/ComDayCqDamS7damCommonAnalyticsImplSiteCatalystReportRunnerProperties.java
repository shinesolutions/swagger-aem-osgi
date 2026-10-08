package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties   {

    private ConfigNodePropertyString schedulerExpression;
    private ConfigNodePropertyBoolean schedulerConcurrent;

    /**
     * Default constructor.
     */
    public ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties.
     *
     * @param schedulerExpression schedulerExpression
     * @param schedulerConcurrent schedulerConcurrent
     */
    public ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties(
        ConfigNodePropertyString schedulerExpression, 
        ConfigNodePropertyBoolean schedulerConcurrent
    ) {
        this.schedulerExpression = schedulerExpression;
        this.schedulerConcurrent = schedulerConcurrent;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties {\n");
        
        sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
        sb.append("    schedulerConcurrent: ").append(toIndentedString(schedulerConcurrent)).append("\n");
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

