package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComDayCqDamInddProcessINDDMediaExtractProcessProperties   {
  
  private ConfigNodePropertyString processLabel = null;

  private ConfigNodePropertyString cqDamInddPagesRegex = null;

  private ConfigNodePropertyBoolean idsJobDecoupled = null;

  private ConfigNodePropertyString idsJobWorkflowModel = null;


  /**
   **/
  public ComDayCqDamInddProcessINDDMediaExtractProcessProperties processLabel(ConfigNodePropertyString processLabel) {
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
  public ComDayCqDamInddProcessINDDMediaExtractProcessProperties cqDamInddPagesRegex(ConfigNodePropertyString cqDamInddPagesRegex) {
    this.cqDamInddPagesRegex = cqDamInddPagesRegex;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.indd.pages.regex")
  public ConfigNodePropertyString getCqDamInddPagesRegex() {
    return cqDamInddPagesRegex;
  }
  public void setCqDamInddPagesRegex(ConfigNodePropertyString cqDamInddPagesRegex) {
    this.cqDamInddPagesRegex = cqDamInddPagesRegex;
  }


  /**
   **/
  public ComDayCqDamInddProcessINDDMediaExtractProcessProperties idsJobDecoupled(ConfigNodePropertyBoolean idsJobDecoupled) {
    this.idsJobDecoupled = idsJobDecoupled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ids.job.decoupled")
  public ConfigNodePropertyBoolean getIdsJobDecoupled() {
    return idsJobDecoupled;
  }
  public void setIdsJobDecoupled(ConfigNodePropertyBoolean idsJobDecoupled) {
    this.idsJobDecoupled = idsJobDecoupled;
  }


  /**
   **/
  public ComDayCqDamInddProcessINDDMediaExtractProcessProperties idsJobWorkflowModel(ConfigNodePropertyString idsJobWorkflowModel) {
    this.idsJobWorkflowModel = idsJobWorkflowModel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ids.job.workflow.model")
  public ConfigNodePropertyString getIdsJobWorkflowModel() {
    return idsJobWorkflowModel;
  }
  public void setIdsJobWorkflowModel(ConfigNodePropertyString idsJobWorkflowModel) {
    this.idsJobWorkflowModel = idsJobWorkflowModel;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamInddProcessINDDMediaExtractProcessProperties comDayCqDamInddProcessINDDMediaExtractProcessProperties = (ComDayCqDamInddProcessINDDMediaExtractProcessProperties) o;
    return Objects.equals(processLabel, comDayCqDamInddProcessINDDMediaExtractProcessProperties.processLabel) &&
        Objects.equals(cqDamInddPagesRegex, comDayCqDamInddProcessINDDMediaExtractProcessProperties.cqDamInddPagesRegex) &&
        Objects.equals(idsJobDecoupled, comDayCqDamInddProcessINDDMediaExtractProcessProperties.idsJobDecoupled) &&
        Objects.equals(idsJobWorkflowModel, comDayCqDamInddProcessINDDMediaExtractProcessProperties.idsJobWorkflowModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processLabel, cqDamInddPagesRegex, idsJobDecoupled, idsJobWorkflowModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamInddProcessINDDMediaExtractProcessProperties {\n");
    
    sb.append("    processLabel: ").append(toIndentedString(processLabel)).append("\n");
    sb.append("    cqDamInddPagesRegex: ").append(toIndentedString(cqDamInddPagesRegex)).append("\n");
    sb.append("    idsJobDecoupled: ").append(toIndentedString(idsJobDecoupled)).append("\n");
    sb.append("    idsJobWorkflowModel: ").append(toIndentedString(idsJobWorkflowModel)).append("\n");
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

