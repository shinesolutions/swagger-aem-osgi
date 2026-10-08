package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties   {
  @JsonProperty("threshold")
  private ConfigNodePropertyInteger threshold;

  @JsonProperty("jobTopicName")
  private ConfigNodePropertyString jobTopicName;

  @JsonProperty("emailEnabled")
  private ConfigNodePropertyBoolean emailEnabled;

  public ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties threshold(ConfigNodePropertyInteger threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * Get threshold
   * @return threshold
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getThreshold() {
    return threshold;
  }

  public void setThreshold(ConfigNodePropertyInteger threshold) {
    this.threshold = threshold;
  }

  public ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties jobTopicName(ConfigNodePropertyString jobTopicName) {
    this.jobTopicName = jobTopicName;
    return this;
  }

  /**
   * Get jobTopicName
   * @return jobTopicName
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getJobTopicName() {
    return jobTopicName;
  }

  public void setJobTopicName(ConfigNodePropertyString jobTopicName) {
    this.jobTopicName = jobTopicName;
  }

  public ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties emailEnabled(ConfigNodePropertyBoolean emailEnabled) {
    this.emailEnabled = emailEnabled;
    return this;
  }

  /**
   * Get emailEnabled
   * @return emailEnabled
   */
  @ApiModelProperty(value = "")
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
    ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties = (ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties) o;
    return Objects.equals(this.threshold, comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties.threshold) &&
        Objects.equals(this.jobTopicName, comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties.jobTopicName) &&
        Objects.equals(this.emailEnabled, comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties.emailEnabled);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

