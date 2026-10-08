package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-10-07T12:54:26.576036107Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingEventImplJobsJobConsumerManagerProperties   {
  
  private ConfigNodePropertyBoolean orgApacheSlingInstallerConfigurationPersist;
  private ConfigNodePropertyArray jobConsumermanagerWhitelist;
  private ConfigNodePropertyArray jobConsumermanagerBlacklist;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
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

