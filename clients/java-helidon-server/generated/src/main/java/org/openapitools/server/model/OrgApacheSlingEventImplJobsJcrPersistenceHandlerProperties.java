package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties   {

    private ConfigNodePropertyBoolean jobConsumermanagerDisableDistribution;
    private ConfigNodePropertyInteger startupDelay;
    private ConfigNodePropertyInteger cleanupPeriod;

    /**
     * Default constructor.
     */
    public OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.
     *
     * @param jobConsumermanagerDisableDistribution jobConsumermanagerDisableDistribution
     * @param startupDelay startupDelay
     * @param cleanupPeriod cleanupPeriod
     */
    public OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties(
        ConfigNodePropertyBoolean jobConsumermanagerDisableDistribution, 
        ConfigNodePropertyInteger startupDelay, 
        ConfigNodePropertyInteger cleanupPeriod
    ) {
        this.jobConsumermanagerDisableDistribution = jobConsumermanagerDisableDistribution;
        this.startupDelay = startupDelay;
        this.cleanupPeriod = cleanupPeriod;
    }



    /**
     * Get jobConsumermanagerDisableDistribution
     * @return jobConsumermanagerDisableDistribution
     */
    public ConfigNodePropertyBoolean getJobConsumermanagerDisableDistribution() {
        return jobConsumermanagerDisableDistribution;
    }

    public void setJobConsumermanagerDisableDistribution(ConfigNodePropertyBoolean jobConsumermanagerDisableDistribution) {
        this.jobConsumermanagerDisableDistribution = jobConsumermanagerDisableDistribution;
    }

    /**
     * Get startupDelay
     * @return startupDelay
     */
    public ConfigNodePropertyInteger getStartupDelay() {
        return startupDelay;
    }

    public void setStartupDelay(ConfigNodePropertyInteger startupDelay) {
        this.startupDelay = startupDelay;
    }

    /**
     * Get cleanupPeriod
     * @return cleanupPeriod
     */
    public ConfigNodePropertyInteger getCleanupPeriod() {
        return cleanupPeriod;
    }

    public void setCleanupPeriod(ConfigNodePropertyInteger cleanupPeriod) {
        this.cleanupPeriod = cleanupPeriod;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties {\n");
        
        sb.append("    jobConsumermanagerDisableDistribution: ").append(toIndentedString(jobConsumermanagerDisableDistribution)).append("\n");
        sb.append("    startupDelay: ").append(toIndentedString(startupDelay)).append("\n");
        sb.append("    cleanupPeriod: ").append(toIndentedString(cleanupPeriod)).append("\n");
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

