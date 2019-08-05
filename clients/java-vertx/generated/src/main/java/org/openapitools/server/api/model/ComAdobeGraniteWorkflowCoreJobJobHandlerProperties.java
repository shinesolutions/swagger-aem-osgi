package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteWorkflowCoreJobJobHandlerProperties   {
  
  private ConfigNodePropertyArray jobTopics = null;
  private ConfigNodePropertyBoolean allowSelfProcessTermination = null;

  public ComAdobeGraniteWorkflowCoreJobJobHandlerProperties () {

  }

  public ComAdobeGraniteWorkflowCoreJobJobHandlerProperties (ConfigNodePropertyArray jobTopics, ConfigNodePropertyBoolean allowSelfProcessTermination) {
    this.jobTopics = jobTopics;
    this.allowSelfProcessTermination = allowSelfProcessTermination;
  }

    
  @JsonProperty("job.topics")
  public ConfigNodePropertyArray getJobTopics() {
    return jobTopics;
  }
  public void setJobTopics(ConfigNodePropertyArray jobTopics) {
    this.jobTopics = jobTopics;
  }

    
  @JsonProperty("allow.self.process.termination")
  public ConfigNodePropertyBoolean getAllowSelfProcessTermination() {
    return allowSelfProcessTermination;
  }
  public void setAllowSelfProcessTermination(ConfigNodePropertyBoolean allowSelfProcessTermination) {
    this.allowSelfProcessTermination = allowSelfProcessTermination;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
