package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties   {
  
  private @Valid ConfigNodePropertyBoolean graniteWorkflowWorkflowPublishEventServiceEnabled = null;

  /**
   **/
  public ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties graniteWorkflowWorkflowPublishEventServiceEnabled(ConfigNodePropertyBoolean graniteWorkflowWorkflowPublishEventServiceEnabled) {
    this.graniteWorkflowWorkflowPublishEventServiceEnabled = graniteWorkflowWorkflowPublishEventServiceEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("granite.workflow.WorkflowPublishEventService.enabled")
  public ConfigNodePropertyBoolean getGraniteWorkflowWorkflowPublishEventServiceEnabled() {
    return graniteWorkflowWorkflowPublishEventServiceEnabled;
  }
  public void setGraniteWorkflowWorkflowPublishEventServiceEnabled(ConfigNodePropertyBoolean graniteWorkflowWorkflowPublishEventServiceEnabled) {
    this.graniteWorkflowWorkflowPublishEventServiceEnabled = graniteWorkflowWorkflowPublishEventServiceEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties = (ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties) o;
    return Objects.equals(graniteWorkflowWorkflowPublishEventServiceEnabled, comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties.graniteWorkflowWorkflowPublishEventServiceEnabled);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

