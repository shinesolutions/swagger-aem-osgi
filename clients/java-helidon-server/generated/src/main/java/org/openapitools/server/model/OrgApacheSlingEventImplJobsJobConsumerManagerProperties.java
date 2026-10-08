package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingEventImplJobsJobConsumerManagerProperties   {

    private ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist;
    private ConfigNodePropertyArray jobConsumermanagerWhitelist;
    private ConfigNodePropertyArray jobConsumermanagerBlacklist;

    /**
     * Default constructor.
     */
    public OrgApacheSlingEventImplJobsJobConsumerManagerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingEventImplJobsJobConsumerManagerProperties.
     *
     * @param orgApacheSlingInstallerConfigurationPersist orgApacheSlingInstallerConfigurationPersist
     * @param jobConsumermanagerWhitelist jobConsumermanagerWhitelist
     * @param jobConsumermanagerBlacklist jobConsumermanagerBlacklist
     */
    public OrgApacheSlingEventImplJobsJobConsumerManagerProperties(
        ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist, 
        ConfigNodePropertyArray jobConsumermanagerWhitelist, 
        ConfigNodePropertyArray jobConsumermanagerBlacklist
    ) {
        this.orgApacheSlingInstallerConfigurationPersist = orgApacheSlingInstallerConfigurationPersist;
        this.jobConsumermanagerWhitelist = jobConsumermanagerWhitelist;
        this.jobConsumermanagerBlacklist = jobConsumermanagerBlacklist;
    }



    /**
     * Get orgApacheSlingInstallerConfigurationPersist
     * @return orgApacheSlingInstallerConfigurationPersist
     */
    public ConfigNodePropertyBoolean getOrgApacheSlingInstallerConfigurationPersist() {
        return orgApacheSlingInstallerConfigurationPersist;
    }

    public void setOrgApacheSlingInstallerConfigurationPersist(ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist) {
        this.orgApacheSlingInstallerConfigurationPersist = orgApacheSlingInstallerConfigurationPersist;
    }

    /**
     * Get jobConsumermanagerWhitelist
     * @return jobConsumermanagerWhitelist
     */
    public ConfigNodePropertyArray getJobConsumermanagerWhitelist() {
        return jobConsumermanagerWhitelist;
    }

    public void setJobConsumermanagerWhitelist(ConfigNodePropertyArray jobConsumermanagerWhitelist) {
        this.jobConsumermanagerWhitelist = jobConsumermanagerWhitelist;
    }

    /**
     * Get jobConsumermanagerBlacklist
     * @return jobConsumermanagerBlacklist
     */
    public ConfigNodePropertyArray getJobConsumermanagerBlacklist() {
        return jobConsumermanagerBlacklist;
    }

    public void setJobConsumermanagerBlacklist(ConfigNodePropertyArray jobConsumermanagerBlacklist) {
        this.jobConsumermanagerBlacklist = jobConsumermanagerBlacklist;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingEventImplJobsJobConsumerManagerProperties {\n");
        
        sb.append("    orgApacheSlingInstallerConfigurationPersist: ").append(toIndentedString(orgApacheSlingInstallerConfigurationPersist)).append("\n");
        sb.append("    jobConsumermanagerWhitelist: ").append(toIndentedString(jobConsumermanagerWhitelist)).append("\n");
        sb.append("    jobConsumermanagerBlacklist: ").append(toIndentedString(jobConsumermanagerBlacklist)).append("\n");
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

