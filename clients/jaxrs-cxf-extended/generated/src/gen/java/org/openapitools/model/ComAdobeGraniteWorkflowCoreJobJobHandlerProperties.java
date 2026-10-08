package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteWorkflowCoreJobJobHandlerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray jobTopics;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean allowSelfProcessTermination;
 /**
  * Get jobTopics
  * @return jobTopics
  */
  @JsonProperty("job.topics")
  public ConfigNodePropertyArray getJobTopics() {
    return jobTopics;
  }

  /**
   * Sets the <code>jobTopics</code> property.
   */
 public void setJobTopics(ConfigNodePropertyArray jobTopics) {
    this.jobTopics = jobTopics;
  }

  /**
   * Sets the <code>jobTopics</code> property.
   */
  public ComAdobeGraniteWorkflowCoreJobJobHandlerProperties jobTopics(ConfigNodePropertyArray jobTopics) {
    this.jobTopics = jobTopics;
    return this;
  }

 /**
  * Get allowSelfProcessTermination
  * @return allowSelfProcessTermination
  */
  @JsonProperty("allow.self.process.termination")
  public ConfigNodePropertyBoolean getAllowSelfProcessTermination() {
    return allowSelfProcessTermination;
  }

  /**
   * Sets the <code>allowSelfProcessTermination</code> property.
   */
 public void setAllowSelfProcessTermination(ConfigNodePropertyBoolean allowSelfProcessTermination) {
    this.allowSelfProcessTermination = allowSelfProcessTermination;
  }

  /**
   * Sets the <code>allowSelfProcessTermination</code> property.
   */
  public ComAdobeGraniteWorkflowCoreJobJobHandlerProperties allowSelfProcessTermination(ConfigNodePropertyBoolean allowSelfProcessTermination) {
    this.allowSelfProcessTermination = allowSelfProcessTermination;
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
    ComAdobeGraniteWorkflowCoreJobJobHandlerProperties comAdobeGraniteWorkflowCoreJobJobHandlerProperties = (ComAdobeGraniteWorkflowCoreJobJobHandlerProperties) o;
    return Objects.equals(this.jobTopics, comAdobeGraniteWorkflowCoreJobJobHandlerProperties.jobTopics) &&
        Objects.equals(this.allowSelfProcessTermination, comAdobeGraniteWorkflowCoreJobJobHandlerProperties.allowSelfProcessTermination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobTopics, allowSelfProcessTermination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteWorkflowCoreJobJobHandlerProperties {\n");
    
    sb.append("    jobTopics: ").append(toIndentedString(jobTopics)).append("\n");
    sb.append("    allowSelfProcessTermination: ").append(toIndentedString(allowSelfProcessTermination)).append("\n");
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

