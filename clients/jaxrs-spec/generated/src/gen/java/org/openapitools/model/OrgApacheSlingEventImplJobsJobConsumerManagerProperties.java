package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheSlingEventImplJobsJobConsumerManagerProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingEventImplJobsJobConsumerManagerProperties   {
  private ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist;
  private ConfigNodePropertyArray jobConsumermanagerWhitelist;
  private ConfigNodePropertyArray jobConsumermanagerBlacklist;

  public OrgApacheSlingEventImplJobsJobConsumerManagerProperties() {
  }

  /**
   **/
  public OrgApacheSlingEventImplJobsJobConsumerManagerProperties orgApacheSlingInstallerConfigurationPersist(ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist) {
    this.orgApacheSlingInstallerConfigurationPersist = orgApacheSlingInstallerConfigurationPersist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.installer.configuration.persist")
  @Valid public ConfigNodePropertyBoolean getOrgApacheSlingInstallerConfigurationPersist() {
    return orgApacheSlingInstallerConfigurationPersist;
  }

  @JsonProperty("org.apache.sling.installer.configuration.persist")
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
  @Valid public ConfigNodePropertyArray getJobConsumermanagerWhitelist() {
    return jobConsumermanagerWhitelist;
  }

  @JsonProperty("job.consumermanager.whitelist")
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
  @Valid public ConfigNodePropertyArray getJobConsumermanagerBlacklist() {
    return jobConsumermanagerBlacklist;
  }

  @JsonProperty("job.consumermanager.blacklist")
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
    return Objects.equals(this.orgApacheSlingInstallerConfigurationPersist, orgApacheSlingEventImplJobsJobConsumerManagerProperties.orgApacheSlingInstallerConfigurationPersist) &&
        Objects.equals(this.jobConsumermanagerWhitelist, orgApacheSlingEventImplJobsJobConsumerManagerProperties.jobConsumermanagerWhitelist) &&
        Objects.equals(this.jobConsumermanagerBlacklist, orgApacheSlingEventImplJobsJobConsumerManagerProperties.jobConsumermanagerBlacklist);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
