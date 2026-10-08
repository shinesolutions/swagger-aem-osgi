package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean graniteWorkflowWorkflowPublishEventServiceEnabled;
 /**
   * Get graniteWorkflowWorkflowPublishEventServiceEnabled
   * @return graniteWorkflowWorkflowPublishEventServiceEnabled
  **/
  @JsonProperty("granite.workflow.WorkflowPublishEventService.enabled")
  public ConfigNodePropertyBoolean getGraniteWorkflowWorkflowPublishEventServiceEnabled() {
    return graniteWorkflowWorkflowPublishEventServiceEnabled;
  }

  public void setGraniteWorkflowWorkflowPublishEventServiceEnabled(ConfigNodePropertyBoolean graniteWorkflowWorkflowPublishEventServiceEnabled) {
    this.graniteWorkflowWorkflowPublishEventServiceEnabled = graniteWorkflowWorkflowPublishEventServiceEnabled;
  }

  public ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties graniteWorkflowWorkflowPublishEventServiceEnabled(ConfigNodePropertyBoolean graniteWorkflowWorkflowPublishEventServiceEnabled) {
    this.graniteWorkflowWorkflowPublishEventServiceEnabled = graniteWorkflowWorkflowPublishEventServiceEnabled;
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
    ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties = (ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties) o;
    return Objects.equals(this.graniteWorkflowWorkflowPublishEventServiceEnabled, comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties.graniteWorkflowWorkflowPublishEventServiceEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(graniteWorkflowWorkflowPublishEventServiceEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties {\n");
    
    sb.append("    graniteWorkflowWorkflowPublishEventServiceEnabled: ").append(toIndentedString(graniteWorkflowWorkflowPublishEventServiceEnabled)).append("\n");
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

