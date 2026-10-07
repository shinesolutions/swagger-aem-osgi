package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties   {
  private ConfigNodePropertyString schedulerExpression;
  private ConfigNodePropertyInteger jobPurgeThreshold;
  private ConfigNodePropertyInteger jobPurgeMaxJobs;

  public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties() {
  }

  /**
   **/
  public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties schedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduler.expression")
  @Valid public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }

  @JsonProperty("scheduler.expression")
  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  /**
   **/
  public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties jobPurgeThreshold(ConfigNodePropertyInteger jobPurgeThreshold) {
    this.jobPurgeThreshold = jobPurgeThreshold;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("job.purge.threshold")
  @Valid public ConfigNodePropertyInteger getJobPurgeThreshold() {
    return jobPurgeThreshold;
  }

  @JsonProperty("job.purge.threshold")
  public void setJobPurgeThreshold(ConfigNodePropertyInteger jobPurgeThreshold) {
    this.jobPurgeThreshold = jobPurgeThreshold;
  }

  /**
   **/
  public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties jobPurgeMaxJobs(ConfigNodePropertyInteger jobPurgeMaxJobs) {
    this.jobPurgeMaxJobs = jobPurgeMaxJobs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("job.purge.max.jobs")
  @Valid public ConfigNodePropertyInteger getJobPurgeMaxJobs() {
    return jobPurgeMaxJobs;
  }

  @JsonProperty("job.purge.max.jobs")
  public void setJobPurgeMaxJobs(ConfigNodePropertyInteger jobPurgeMaxJobs) {
    this.jobPurgeMaxJobs = jobPurgeMaxJobs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties = (ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties) o;
    return Objects.equals(this.schedulerExpression, comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.schedulerExpression) &&
        Objects.equals(this.jobPurgeThreshold, comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.jobPurgeThreshold) &&
        Objects.equals(this.jobPurgeMaxJobs, comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.jobPurgeMaxJobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedulerExpression, jobPurgeThreshold, jobPurgeMaxJobs);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
