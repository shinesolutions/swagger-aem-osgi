package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeGraniteWorkflowCoreJobJobHandlerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray jobTopics = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean allowSelfProcessTermination = null;
 /**
   * Get jobTopics
   * @return jobTopics
  **/
  @JsonProperty("job.topics")
  public ConfigNodePropertyArray getJobTopics() {
    return jobTopics;
  }

  public void setJobTopics(ConfigNodePropertyArray jobTopics) {
    this.jobTopics = jobTopics;
  }

  public ComAdobeGraniteWorkflowCoreJobJobHandlerProperties jobTopics(ConfigNodePropertyArray jobTopics) {
    this.jobTopics = jobTopics;
    return this;
  }

 /**
   * Get allowSelfProcessTermination
   * @return allowSelfProcessTermination
  **/
  @JsonProperty("allow.self.process.termination")
  public ConfigNodePropertyBoolean getAllowSelfProcessTermination() {
    return allowSelfProcessTermination;
  }

  public void setAllowSelfProcessTermination(ConfigNodePropertyBoolean allowSelfProcessTermination) {
    this.allowSelfProcessTermination = allowSelfProcessTermination;
  }

  public ComAdobeGraniteWorkflowCoreJobJobHandlerProperties allowSelfProcessTermination(ConfigNodePropertyBoolean allowSelfProcessTermination) {
    this.allowSelfProcessTermination = allowSelfProcessTermination;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

