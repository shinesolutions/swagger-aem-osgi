package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger threshold;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jobTopicName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean emailEnabled;
 /**
  * Get threshold
  * @return threshold
  */
  @JsonProperty("threshold")
  public ConfigNodePropertyInteger getThreshold() {
    return threshold;
  }

  /**
   * Sets the <code>threshold</code> property.
   */
 public void setThreshold(ConfigNodePropertyInteger threshold) {
    this.threshold = threshold;
  }

  /**
   * Sets the <code>threshold</code> property.
   */
  public ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties threshold(ConfigNodePropertyInteger threshold) {
    this.threshold = threshold;
    return this;
  }

 /**
  * Get jobTopicName
  * @return jobTopicName
  */
  @JsonProperty("jobTopicName")
  public ConfigNodePropertyString getJobTopicName() {
    return jobTopicName;
  }

  /**
   * Sets the <code>jobTopicName</code> property.
   */
 public void setJobTopicName(ConfigNodePropertyString jobTopicName) {
    this.jobTopicName = jobTopicName;
  }

  /**
   * Sets the <code>jobTopicName</code> property.
   */
  public ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties jobTopicName(ConfigNodePropertyString jobTopicName) {
    this.jobTopicName = jobTopicName;
    return this;
  }

 /**
  * Get emailEnabled
  * @return emailEnabled
  */
  @JsonProperty("emailEnabled")
  public ConfigNodePropertyBoolean getEmailEnabled() {
    return emailEnabled;
  }

  /**
   * Sets the <code>emailEnabled</code> property.
   */
 public void setEmailEnabled(ConfigNodePropertyBoolean emailEnabled) {
    this.emailEnabled = emailEnabled;
  }

  /**
   * Sets the <code>emailEnabled</code> property.
   */
  public ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties emailEnabled(ConfigNodePropertyBoolean emailEnabled) {
    this.emailEnabled = emailEnabled;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

