package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString schedulerExpression = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger jobPurgeThreshold = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger jobPurgeMaxJobs = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

