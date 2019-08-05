package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties   {
  
  private ConfigNodePropertyString schedulerExpression = null;
  private ConfigNodePropertyInteger jobPurgeThreshold = null;
  private ConfigNodePropertyInteger jobPurgeMaxJobs = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduler.expression")
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }
  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("job.purge.threshold")
  public ConfigNodePropertyInteger getJobPurgeThreshold() {
    return jobPurgeThreshold;
  }
  public void setJobPurgeThreshold(ConfigNodePropertyInteger jobPurgeThreshold) {
    this.jobPurgeThreshold = jobPurgeThreshold;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("job.purge.max.jobs")
  public ConfigNodePropertyInteger getJobPurgeMaxJobs() {
    return jobPurgeMaxJobs;
  }
  public void setJobPurgeMaxJobs(ConfigNodePropertyInteger jobPurgeMaxJobs) {
    this.jobPurgeMaxJobs = jobPurgeMaxJobs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties = (ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties) o;
    return Objects.equals(schedulerExpression, comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.schedulerExpression) &&
        Objects.equals(jobPurgeThreshold, comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.jobPurgeThreshold) &&
        Objects.equals(jobPurgeMaxJobs, comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.jobPurgeMaxJobs);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

