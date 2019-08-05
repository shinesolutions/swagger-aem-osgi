package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
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

public class ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger threshold = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString jobTopicName = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean emailEnabled = null;
 /**
   * Get threshold
   * @return threshold
  **/
  @JsonProperty("threshold")
  public ConfigNodePropertyInteger getThreshold() {
    return threshold;
  }

  public void setThreshold(ConfigNodePropertyInteger threshold) {
    this.threshold = threshold;
  }

  public ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties threshold(ConfigNodePropertyInteger threshold) {
    this.threshold = threshold;
    return this;
  }

 /**
   * Get jobTopicName
   * @return jobTopicName
  **/
  @JsonProperty("jobTopicName")
  public ConfigNodePropertyString getJobTopicName() {
    return jobTopicName;
  }

  public void setJobTopicName(ConfigNodePropertyString jobTopicName) {
    this.jobTopicName = jobTopicName;
  }

  public ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties jobTopicName(ConfigNodePropertyString jobTopicName) {
    this.jobTopicName = jobTopicName;
    return this;
  }

 /**
   * Get emailEnabled
   * @return emailEnabled
  **/
  @JsonProperty("emailEnabled")
  public ConfigNodePropertyBoolean getEmailEnabled() {
    return emailEnabled;
  }

  public void setEmailEnabled(ConfigNodePropertyBoolean emailEnabled) {
    this.emailEnabled = emailEnabled;
  }

  public ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties emailEnabled(ConfigNodePropertyBoolean emailEnabled) {
    this.emailEnabled = emailEnabled;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

