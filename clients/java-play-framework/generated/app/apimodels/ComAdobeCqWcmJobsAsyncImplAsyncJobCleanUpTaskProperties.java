package apimodels;

import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties   {
  @JsonProperty("scheduler.expression")
  private ConfigNodePropertyString schedulerExpression = null;

  @JsonProperty("job.purge.threshold")
  private ConfigNodePropertyInteger jobPurgeThreshold = null;

  @JsonProperty("job.purge.max.jobs")
  private ConfigNodePropertyInteger jobPurgeMaxJobs = null;

  public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties schedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
    return this;
  }

   /**
   * Get schedulerExpression
   * @return schedulerExpression
  **/
  @Valid
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }

  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties jobPurgeThreshold(ConfigNodePropertyInteger jobPurgeThreshold) {
    this.jobPurgeThreshold = jobPurgeThreshold;
    return this;
  }

   /**
   * Get jobPurgeThreshold
   * @return jobPurgeThreshold
  **/
  @Valid
  public ConfigNodePropertyInteger getJobPurgeThreshold() {
    return jobPurgeThreshold;
  }

  public void setJobPurgeThreshold(ConfigNodePropertyInteger jobPurgeThreshold) {
    this.jobPurgeThreshold = jobPurgeThreshold;
  }

  public ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties jobPurgeMaxJobs(ConfigNodePropertyInteger jobPurgeMaxJobs) {
    this.jobPurgeMaxJobs = jobPurgeMaxJobs;
    return this;
  }

   /**
   * Get jobPurgeMaxJobs
   * @return jobPurgeMaxJobs
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

