package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingEventImplJobsJobConsumerManagerProperties   {
  
  private ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist = null;
  private ConfigNodePropertyArray jobConsumermanagerWhitelist = null;
  private ConfigNodePropertyArray jobConsumermanagerBlacklist = null;

  public OrgApacheSlingEventImplJobsJobConsumerManagerProperties () {

  }

  public OrgApacheSlingEventImplJobsJobConsumerManagerProperties (ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist, ConfigNodePropertyArray jobConsumermanagerWhitelist, ConfigNodePropertyArray jobConsumermanagerBlacklist) {
    this.orgApacheSlingInstallerConfigurationPersist = orgApacheSlingInstallerConfigurationPersist;
    this.jobConsumermanagerWhitelist = jobConsumermanagerWhitelist;
    this.jobConsumermanagerBlacklist = jobConsumermanagerBlacklist;
  }

    
  @JsonProperty("org.apache.sling.installer.configuration.persist")
  public ConfigNodePropertyBoolean getOrgApacheSlingInstallerConfigurationPersist() {
    return orgApacheSlingInstallerConfigurationPersist;
  }
  public void setOrgApacheSlingInstallerConfigurationPersist(ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist) {
    this.orgApacheSlingInstallerConfigurationPersist = orgApacheSlingInstallerConfigurationPersist;
  }

    
  @JsonProperty("job.consumermanager.whitelist")
  public ConfigNodePropertyArray getJobConsumermanagerWhitelist() {
    return jobConsumermanagerWhitelist;
  }
  public void setJobConsumermanagerWhitelist(ConfigNodePropertyArray jobConsumermanagerWhitelist) {
    this.jobConsumermanagerWhitelist = jobConsumermanagerWhitelist;
  }

    
  @JsonProperty("job.consumermanager.blacklist")
  public ConfigNodePropertyArray getJobConsumermanagerBlacklist() {
    return jobConsumermanagerBlacklist;
  }
  public void setJobConsumermanagerBlacklist(ConfigNodePropertyArray jobConsumermanagerBlacklist) {
    this.jobConsumermanagerBlacklist = jobConsumermanagerBlacklist;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingEventImplJobsJobConsumerManagerProperties orgApacheSlingEventImplJobsJobConsumerManagerProperties = (OrgApacheSlingEventImplJobsJobConsumerManagerProperties) o;
    return Objects.equals(orgApacheSlingInstallerConfigurationPersist, orgApacheSlingEventImplJobsJobConsumerManagerProperties.orgApacheSlingInstallerConfigurationPersist) &&
        Objects.equals(jobConsumermanagerWhitelist, orgApacheSlingEventImplJobsJobConsumerManagerProperties.jobConsumermanagerWhitelist) &&
        Objects.equals(jobConsumermanagerBlacklist, orgApacheSlingEventImplJobsJobConsumerManagerProperties.jobConsumermanagerBlacklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheSlingInstallerConfigurationPersist, jobConsumermanagerWhitelist, jobConsumermanagerBlacklist);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
