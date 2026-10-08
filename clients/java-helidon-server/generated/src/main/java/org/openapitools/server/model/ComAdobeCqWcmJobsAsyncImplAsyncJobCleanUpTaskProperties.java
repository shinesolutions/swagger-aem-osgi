package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties   {

    private ConfigNodePropertyString schedulerExpression;
    private ConfigNodePropertyInteger jobPurgeThreshold;
    private ConfigNodePropertyInteger jobPurgeMaxJobs;

    /**
     * Default constructor.
     */
    public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.
     *
     * @param schedulerExpression schedulerExpression
     * @param jobPurgeThreshold jobPurgeThreshold
     * @param jobPurgeMaxJobs jobPurgeMaxJobs
     */
    public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties(
        ConfigNodePropertyString schedulerExpression, 
        ConfigNodePropertyInteger jobPurgeThreshold, 
        ConfigNodePropertyInteger jobPurgeMaxJobs
    ) {
        this.schedulerExpression = schedulerExpression;
        this.jobPurgeThreshold = jobPurgeThreshold;
        this.jobPurgeMaxJobs = jobPurgeMaxJobs;
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
     * Get jobPurgeThreshold
     * @return jobPurgeThreshold
     */
    public ConfigNodePropertyInteger getJobPurgeThreshold() {
        return jobPurgeThreshold;
    }

    public void setJobPurgeThreshold(ConfigNodePropertyInteger jobPurgeThreshold) {
        this.jobPurgeThreshold = jobPurgeThreshold;
    }

    /**
     * Get jobPurgeMaxJobs
     * @return jobPurgeMaxJobs
     */
    public ConfigNodePropertyInteger getJobPurgeMaxJobs() {
        return jobPurgeMaxJobs;
    }

    public void setJobPurgeMaxJobs(ConfigNodePropertyInteger jobPurgeMaxJobs) {
        this.jobPurgeMaxJobs = jobPurgeMaxJobs;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties {\n");
        
        sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
        sb.append("    jobPurgeThreshold: ").append(toIndentedString(jobPurgeThreshold)).append("\n");
        sb.append("    jobPurgeMaxJobs: ").append(toIndentedString(jobPurgeMaxJobs)).append("\n");
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

