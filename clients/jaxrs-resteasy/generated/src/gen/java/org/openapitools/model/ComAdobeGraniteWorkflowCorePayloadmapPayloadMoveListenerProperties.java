package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties   {
  
  private ConfigNodePropertyArray payloadMoveWhiteList = null;
  private ConfigNodePropertyBoolean payloadMoveHandleFromWorkflowProcess = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("payload.move.white.list")
  public ConfigNodePropertyArray getPayloadMoveWhiteList() {
    return payloadMoveWhiteList;
  }
  public void setPayloadMoveWhiteList(ConfigNodePropertyArray payloadMoveWhiteList) {
    this.payloadMoveWhiteList = payloadMoveWhiteList;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("payload.move.handle.from.workflow.process")
  public ConfigNodePropertyBoolean getPayloadMoveHandleFromWorkflowProcess() {
    return payloadMoveHandleFromWorkflowProcess;
  }
  public void setPayloadMoveHandleFromWorkflowProcess(ConfigNodePropertyBoolean payloadMoveHandleFromWorkflowProcess) {
    this.payloadMoveHandleFromWorkflowProcess = payloadMoveHandleFromWorkflowProcess;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties = (ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties) o;
    return Objects.equals(payloadMoveWhiteList, comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties.payloadMoveWhiteList) &&
        Objects.equals(payloadMoveHandleFromWorkflowProcess, comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties.payloadMoveHandleFromWorkflowProcess);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

