package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class OrgApacheSlingEventImplJobsJobConsumerManagerProperties   {
  
  private ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist = null;

  private ConfigNodePropertyArray jobConsumermanagerWhitelist = null;

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

