package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties   {
  @JsonProperty("granite.workflow.WorkflowPublishEventService.enabled")
  private ConfigNodePropertyBoolean graniteWorkflowWorkflowPublishEventServiceEnabled;

  public ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties graniteWorkflowWorkflowPublishEventServiceEnabled(ConfigNodePropertyBoolean graniteWorkflowWorkflowPublishEventServiceEnabled) {
    this.graniteWorkflowWorkflowPublishEventServiceEnabled = graniteWorkflowWorkflowPublishEventServiceEnabled;
    return this;
  }

  /**
   * Get graniteWorkflowWorkflowPublishEventServiceEnabled
   * @return graniteWorkflowWorkflowPublishEventServiceEnabled
   */
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getGraniteWorkflowWorkflowPublishEventServiceEnabled() {
    return graniteWorkflowWorkflowPublishEventServiceEnabled;
  }

  public void setGraniteWorkflowWorkflowPublishEventServiceEnabled(ConfigNodePropertyBoolean graniteWorkflowWorkflowPublishEventServiceEnabled) {
    this.graniteWorkflowWorkflowPublishEventServiceEnabled = graniteWorkflowWorkflowPublishEventServiceEnabled;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

