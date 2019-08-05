package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties   {
  
  private ConfigNodePropertyString processLabel = null;

  private ConfigNodePropertyBoolean notifyOnComplete = null;


  /**
   **/
  public ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties processLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("process.label")
  public ConfigNodePropertyString getProcessLabel() {
    return processLabel;
  }
  public void setProcessLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
  }


  /**
   **/
  public ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties notifyOnComplete(ConfigNodePropertyBoolean notifyOnComplete) {
    this.notifyOnComplete = notifyOnComplete;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Notify on Complete")
  public ConfigNodePropertyBoolean getNotifyOnComplete() {
    return notifyOnComplete;
  }
  public void setNotifyOnComplete(ConfigNodePropertyBoolean notifyOnComplete) {
    this.notifyOnComplete = notifyOnComplete;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties = (ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties) o;
    return Objects.equals(processLabel, comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.processLabel) &&
        Objects.equals(notifyOnComplete, comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.notifyOnComplete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processLabel, notifyOnComplete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties {\n");
    
    sb.append("    processLabel: ").append(toIndentedString(processLabel)).append("\n");
    sb.append("    notifyOnComplete: ").append(toIndentedString(notifyOnComplete)).append("\n");
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

