package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties   {
  @JsonProperty("threshold")
  @Valid

  private ConfigNodePropertyInteger threshold;

  @JsonProperty("jobTopicName")
  @Valid

  private ConfigNodePropertyString jobTopicName;

  @JsonProperty("emailEnabled")
  @Valid

  private ConfigNodePropertyBoolean emailEnabled;

  public ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties threshold(ConfigNodePropertyInteger threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  public ConfigNodePropertyInteger getThreshold() {
    return threshold;
  }

  public void setThreshold(ConfigNodePropertyInteger threshold) {
    this.threshold = threshold;
  }

  public ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties jobTopicName(ConfigNodePropertyString jobTopicName) {
    this.jobTopicName = jobTopicName;
    return this;
  }

   /**
   * Get jobTopicName
   * @return jobTopicName
  **/
  public ConfigNodePropertyString getJobTopicName() {
    return jobTopicName;
  }

  public void setJobTopicName(ConfigNodePropertyString jobTopicName) {
    this.jobTopicName = jobTopicName;
  }

  public ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties emailEnabled(ConfigNodePropertyBoolean emailEnabled) {
    this.emailEnabled = emailEnabled;
    return this;
  }

   /**
   * Get emailEnabled
   * @return emailEnabled
  **/
  public ConfigNodePropertyBoolean getEmailEnabled() {
    return emailEnabled;
  }

  public void setEmailEnabled(ConfigNodePropertyBoolean emailEnabled) {
    this.emailEnabled = emailEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties = (ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties) o;
    return Objects.equals(threshold, comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties.threshold) &&
        Objects.equals(jobTopicName, comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties.jobTopicName) &&
        Objects.equals(emailEnabled, comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties.emailEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threshold, jobTopicName, emailEnabled);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties {\n");
    
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    jobTopicName: ").append(toIndentedString(jobTopicName)).append("\n");
    sb.append("    emailEnabled: ").append(toIndentedString(emailEnabled)).append("\n");
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

