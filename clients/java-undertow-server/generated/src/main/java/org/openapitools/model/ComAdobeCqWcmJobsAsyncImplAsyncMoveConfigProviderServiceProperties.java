package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties   {
  
  private ConfigNodePropertyInteger threshold = null;
  private ConfigNodePropertyString jobTopicName = null;
  private ConfigNodePropertyBoolean emailEnabled = null;

  /**
   **/
  public ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties threshold(ConfigNodePropertyInteger threshold) {
    this.threshold = threshold;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("threshold")
  public ConfigNodePropertyInteger getThreshold() {
    return threshold;
  }
  public void setThreshold(ConfigNodePropertyInteger threshold) {
    this.threshold = threshold;
  }

  /**
   **/
  public ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties jobTopicName(ConfigNodePropertyString jobTopicName) {
    this.jobTopicName = jobTopicName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("jobTopicName")
  public ConfigNodePropertyString getJobTopicName() {
    return jobTopicName;
  }
  public void setJobTopicName(ConfigNodePropertyString jobTopicName) {
    this.jobTopicName = jobTopicName;
  }

  /**
   **/
  public ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties emailEnabled(ConfigNodePropertyBoolean emailEnabled) {
    this.emailEnabled = emailEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("emailEnabled")
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
    ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties = (ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties) o;
    return Objects.equals(threshold, comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.threshold) &&
        Objects.equals(jobTopicName, comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.jobTopicName) &&
        Objects.equals(emailEnabled, comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.emailEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threshold, jobTopicName, emailEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties {\n");
    
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

