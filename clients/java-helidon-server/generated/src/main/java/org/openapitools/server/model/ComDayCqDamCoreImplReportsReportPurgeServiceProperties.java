package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplReportsReportPurgeServiceProperties   {

    private ConfigNodePropertyString schedulerExpression;
    private ConfigNodePropertyInteger maxSavedReports;
    private ConfigNodePropertyInteger timeDuration;
    private ConfigNodePropertyBoolean enableReportPurge;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplReportsReportPurgeServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplReportsReportPurgeServiceProperties.
     *
     * @param schedulerExpression schedulerExpression
     * @param maxSavedReports maxSavedReports
     * @param timeDuration timeDuration
     * @param enableReportPurge enableReportPurge
     */
    public ComDayCqDamCoreImplReportsReportPurgeServiceProperties(
        ConfigNodePropertyString schedulerExpression, 
        ConfigNodePropertyInteger maxSavedReports, 
        ConfigNodePropertyInteger timeDuration, 
        ConfigNodePropertyBoolean enableReportPurge
    ) {
        this.schedulerExpression = schedulerExpression;
        this.maxSavedReports = maxSavedReports;
        this.timeDuration = timeDuration;
        this.enableReportPurge = enableReportPurge;
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
     * Get maxSavedReports
     * @return maxSavedReports
     */
    public ConfigNodePropertyInteger getMaxSavedReports() {
        return maxSavedReports;
    }

    public void setMaxSavedReports(ConfigNodePropertyInteger maxSavedReports) {
        this.maxSavedReports = maxSavedReports;
    }

    /**
     * Get timeDuration
     * @return timeDuration
     */
    public ConfigNodePropertyInteger getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(ConfigNodePropertyInteger timeDuration) {
        this.timeDuration = timeDuration;
    }

    /**
     * Get enableReportPurge
     * @return enableReportPurge
     */
    public ConfigNodePropertyBoolean getEnableReportPurge() {
        return enableReportPurge;
    }

    public void setEnableReportPurge(ConfigNodePropertyBoolean enableReportPurge) {
        this.enableReportPurge = enableReportPurge;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplReportsReportPurgeServiceProperties {\n");
        
        sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
        sb.append("    maxSavedReports: ").append(toIndentedString(maxSavedReports)).append("\n");
        sb.append("    timeDuration: ").append(toIndentedString(timeDuration)).append("\n");
        sb.append("    enableReportPurge: ").append(toIndentedString(enableReportPurge)).append("\n");
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

