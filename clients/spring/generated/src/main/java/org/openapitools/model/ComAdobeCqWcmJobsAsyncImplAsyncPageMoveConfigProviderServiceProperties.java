package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties   {
  @JsonProperty("threshold")
  private ConfigNodePropertyInteger threshold = null;

  @JsonProperty("jobTopicName")
  private ConfigNodePropertyString jobTopicName = null;

  @JsonProperty("emailEnabled")
  private ConfigNodePropertyBoolean emailEnabled = null;

  public ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties threshold(ConfigNodePropertyInteger threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * Get threshold
   * @return threshold
  **/
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

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
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getEmailEnabled() {
    return emailEnabled;
  }

  public void setEmailEnabled(ConfigNodePropertyBoolean emailEnabled) {
    this.emailEnabled = emailEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties = (ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties) o;
    return Objects.equals(this.threshold, comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties.threshold) &&
        Objects.equals(this.jobTopicName, comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties.jobTopicName) &&
        Objects.equals(this.emailEnabled, comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties.emailEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threshold, jobTopicName, emailEnabled);
  }

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

