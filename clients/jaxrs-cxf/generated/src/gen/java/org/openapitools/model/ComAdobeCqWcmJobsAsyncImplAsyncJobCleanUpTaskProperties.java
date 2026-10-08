package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString schedulerExpression;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger jobPurgeThreshold;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger jobPurgeMaxJobs;
 /**
   * Get schedulerExpression
   * @return schedulerExpression
  **/
  @JsonProperty("scheduler.expression")
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }

  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties schedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
    return this;
  }

 /**
   * Get jobPurgeThreshold
   * @return jobPurgeThreshold
  **/
  @JsonProperty("job.purge.threshold")
  public ConfigNodePropertyInteger getJobPurgeThreshold() {
    return jobPurgeThreshold;
  }

  public void setJobPurgeThreshold(ConfigNodePropertyInteger jobPurgeThreshold) {
    this.jobPurgeThreshold = jobPurgeThreshold;
  }

  public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties jobPurgeThreshold(ConfigNodePropertyInteger jobPurgeThreshold) {
    this.jobPurgeThreshold = jobPurgeThreshold;
    return this;
  }

 /**
   * Get jobPurgeMaxJobs
   * @return jobPurgeMaxJobs
  **/
  @JsonProperty("job.purge.max.jobs")
  public ConfigNodePropertyInteger getJobPurgeMaxJobs() {
    return jobPurgeMaxJobs;
  }

  public void setJobPurgeMaxJobs(ConfigNodePropertyInteger jobPurgeMaxJobs) {
    this.jobPurgeMaxJobs = jobPurgeMaxJobs;
  }

  public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties jobPurgeMaxJobs(ConfigNodePropertyInteger jobPurgeMaxJobs) {
    this.jobPurgeMaxJobs = jobPurgeMaxJobs;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

