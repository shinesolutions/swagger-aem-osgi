package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeGraniteWorkflowCoreJobJobHandlerProperties   {
  
  private ConfigNodePropertyArray jobTopics = null;
  private ConfigNodePropertyBoolean allowSelfProcessTermination = null;

  /**
   **/
  public ComAdobeGraniteWorkflowCoreJobJobHandlerProperties jobTopics(ConfigNodePropertyArray jobTopics) {
    this.jobTopics = jobTopics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("job.topics")
  public ConfigNodePropertyArray getJobTopics() {
    return jobTopics;
  }
  public void setJobTopics(ConfigNodePropertyArray jobTopics) {
    this.jobTopics = jobTopics;
  }

  /**
   **/
  public ComAdobeGraniteWorkflowCoreJobJobHandlerProperties allowSelfProcessTermination(ConfigNodePropertyBoolean allowSelfProcessTermination) {
    this.allowSelfProcessTermination = allowSelfProcessTermination;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("allow.self.process.termination")
  public ConfigNodePropertyBoolean getAllowSelfProcessTermination() {
    return allowSelfProcessTermination;
  }
  public void setAllowSelfProcessTermination(ConfigNodePropertyBoolean allowSelfProcessTermination) {
    this.allowSelfProcessTermination = allowSelfProcessTermination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteWorkflowCoreJobJobHandlerProperties comAdobeGraniteWorkflowCoreJobJobHandlerProperties = (ComAdobeGraniteWorkflowCoreJobJobHandlerProperties) o;
    return Objects.equals(jobTopics, comAdobeGraniteWorkflowCoreJobJobHandlerProperties.jobTopics) &&
        Objects.equals(allowSelfProcessTermination, comAdobeGraniteWorkflowCoreJobJobHandlerProperties.allowSelfProcessTermination);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

