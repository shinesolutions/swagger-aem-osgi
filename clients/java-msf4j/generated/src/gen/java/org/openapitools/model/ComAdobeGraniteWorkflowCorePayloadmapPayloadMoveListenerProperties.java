package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;

/**
 * ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties   {
  @JsonProperty("payload.move.white.list")
  private ConfigNodePropertyArray payloadMoveWhiteList;

  @JsonProperty("payload.move.handle.from.workflow.process")
  private ConfigNodePropertyBoolean payloadMoveHandleFromWorkflowProcess;

  public ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties payloadMoveWhiteList(ConfigNodePropertyArray payloadMoveWhiteList) {
    this.payloadMoveWhiteList = payloadMoveWhiteList;
    return this;
  }

   /**
   * Get payloadMoveWhiteList
   * @return payloadMoveWhiteList
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getPayloadMoveWhiteList() {
    return payloadMoveWhiteList;
  }

  public void setPayloadMoveWhiteList(ConfigNodePropertyArray payloadMoveWhiteList) {
    this.payloadMoveWhiteList = payloadMoveWhiteList;
  }

  public ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties payloadMoveHandleFromWorkflowProcess(ConfigNodePropertyBoolean payloadMoveHandleFromWorkflowProcess) {
    this.payloadMoveHandleFromWorkflowProcess = payloadMoveHandleFromWorkflowProcess;
    return this;
  }

   /**
   * Get payloadMoveHandleFromWorkflowProcess
   * @return payloadMoveHandleFromWorkflowProcess
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getPayloadMoveHandleFromWorkflowProcess() {
    return payloadMoveHandleFromWorkflowProcess;
  }

  public void setPayloadMoveHandleFromWorkflowProcess(ConfigNodePropertyBoolean payloadMoveHandleFromWorkflowProcess) {
    this.payloadMoveHandleFromWorkflowProcess = payloadMoveHandleFromWorkflowProcess;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties = (ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties) o;
    return Objects.equals(this.payloadMoveWhiteList, comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties.payloadMoveWhiteList) &&
        Objects.equals(this.payloadMoveHandleFromWorkflowProcess, comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties.payloadMoveHandleFromWorkflowProcess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payloadMoveWhiteList, payloadMoveHandleFromWorkflowProcess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties {\n");
    
    sb.append("    payloadMoveWhiteList: ").append(toIndentedString(payloadMoveWhiteList)).append("\n");
    sb.append("    payloadMoveHandleFromWorkflowProcess: ").append(toIndentedString(payloadMoveHandleFromWorkflowProcess)).append("\n");
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

