package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties   {
  @JsonProperty("payload.move.white.list")
  private ConfigNodePropertyArray payloadMoveWhiteList = null;

  @JsonProperty("payload.move.handle.from.workflow.process")
  private ConfigNodePropertyBoolean payloadMoveHandleFromWorkflowProcess = null;

  public ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties payloadMoveWhiteList(ConfigNodePropertyArray payloadMoveWhiteList) {
    this.payloadMoveWhiteList = payloadMoveWhiteList;
    return this;
  }

   /**
   * Get payloadMoveWhiteList
   * @return payloadMoveWhiteList
  **/
  @Valid
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
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

