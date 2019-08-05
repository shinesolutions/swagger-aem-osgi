package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class OrgApacheSlingEventImplJobsJobConsumerManagerProperties   {
  @JsonProperty("org.apache.sling.installer.configuration.persist")
  private ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist = null;

  @JsonProperty("job.consumermanager.whitelist")
  private ConfigNodePropertyArray jobConsumermanagerWhitelist = null;

  @JsonProperty("job.consumermanager.blacklist")
  private ConfigNodePropertyArray jobConsumermanagerBlacklist = null;

  /**
   **/
  public OrgApacheSlingEventImplJobsJobConsumerManagerProperties orgApacheSlingInstallerConfigurationPersist(ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist) {
    this.orgApacheSlingInstallerConfigurationPersist = orgApacheSlingInstallerConfigurationPersist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.installer.configuration.persist")
  public ConfigNodePropertyBoolean getOrgApacheSlingInstallerConfigurationPersist() {
    return orgApacheSlingInstallerConfigurationPersist;
  }
  public void setOrgApacheSlingInstallerConfigurationPersist(ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist) {
    this.orgApacheSlingInstallerConfigurationPersist = orgApacheSlingInstallerConfigurationPersist;
  }

  /**
   **/
  public OrgApacheSlingEventImplJobsJobConsumerManagerProperties jobConsumermanagerWhitelist(ConfigNodePropertyArray jobConsumermanagerWhitelist) {
    this.jobConsumermanagerWhitelist = jobConsumermanagerWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("job.consumermanager.whitelist")
  public ConfigNodePropertyArray getJobConsumermanagerWhitelist() {
    return jobConsumermanagerWhitelist;
  }
  public void setJobConsumermanagerWhitelist(ConfigNodePropertyArray jobConsumermanagerWhitelist) {
    this.jobConsumermanagerWhitelist = jobConsumermanagerWhitelist;
  }

  /**
   **/
  public OrgApacheSlingEventImplJobsJobConsumerManagerProperties jobConsumermanagerBlacklist(ConfigNodePropertyArray jobConsumermanagerBlacklist) {
    this.jobConsumermanagerBlacklist = jobConsumermanagerBlacklist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("job.consumermanager.blacklist")
  public ConfigNodePropertyArray getJobConsumermanagerBlacklist() {
    return jobConsumermanagerBlacklist;
  }
  public void setJobConsumermanagerBlacklist(ConfigNodePropertyArray jobConsumermanagerBlacklist) {
    this.jobConsumermanagerBlacklist = jobConsumermanagerBlacklist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

