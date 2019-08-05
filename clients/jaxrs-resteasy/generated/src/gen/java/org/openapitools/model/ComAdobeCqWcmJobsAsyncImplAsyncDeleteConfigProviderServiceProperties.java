package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties   {
  
  private ConfigNodePropertyInteger threshold = null;
  private ConfigNodePropertyString jobTopicName = null;
  private ConfigNodePropertyBoolean emailEnabled = null;

  /**
   **/
  
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
    ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties = (ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties) o;
    return Objects.equals(threshold, comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties.threshold) &&
        Objects.equals(jobTopicName, comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties.jobTopicName) &&
        Objects.equals(emailEnabled, comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties.emailEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(threshold, jobTopicName, emailEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties {\n");
    
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

