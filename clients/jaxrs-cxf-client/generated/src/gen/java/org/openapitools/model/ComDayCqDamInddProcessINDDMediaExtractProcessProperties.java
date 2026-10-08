package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamInddProcessINDDMediaExtractProcessProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString processLabel;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString cqDamInddPagesRegex;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean idsJobDecoupled;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString idsJobWorkflowModel;
 /**
   * Get processLabel
   * @return processLabel
  **/
  @JsonProperty("process.label")
  public ConfigNodePropertyString getProcessLabel() {
    return processLabel;
  }

  public void setProcessLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
  }

  public ComDayCqDamInddProcessINDDMediaExtractProcessProperties processLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
    return this;
  }

 /**
   * Get cqDamInddPagesRegex
   * @return cqDamInddPagesRegex
  **/
  @JsonProperty("cq.dam.indd.pages.regex")
  public ConfigNodePropertyString getCqDamInddPagesRegex() {
    return cqDamInddPagesRegex;
  }

  public void setCqDamInddPagesRegex(ConfigNodePropertyString cqDamInddPagesRegex) {
    this.cqDamInddPagesRegex = cqDamInddPagesRegex;
  }

  public ComDayCqDamInddProcessINDDMediaExtractProcessProperties cqDamInddPagesRegex(ConfigNodePropertyString cqDamInddPagesRegex) {
    this.cqDamInddPagesRegex = cqDamInddPagesRegex;
    return this;
  }

 /**
   * Get idsJobDecoupled
   * @return idsJobDecoupled
  **/
  @JsonProperty("ids.job.decoupled")
  public ConfigNodePropertyBoolean getIdsJobDecoupled() {
    return idsJobDecoupled;
  }

  public void setIdsJobDecoupled(ConfigNodePropertyBoolean idsJobDecoupled) {
    this.idsJobDecoupled = idsJobDecoupled;
  }

  public ComDayCqDamInddProcessINDDMediaExtractProcessProperties idsJobDecoupled(ConfigNodePropertyBoolean idsJobDecoupled) {
    this.idsJobDecoupled = idsJobDecoupled;
    return this;
  }

 /**
   * Get idsJobWorkflowModel
   * @return idsJobWorkflowModel
  **/
  @JsonProperty("ids.job.workflow.model")
  public ConfigNodePropertyString getIdsJobWorkflowModel() {
    return idsJobWorkflowModel;
  }

  public void setIdsJobWorkflowModel(ConfigNodePropertyString idsJobWorkflowModel) {
    this.idsJobWorkflowModel = idsJobWorkflowModel;
  }

  public ComDayCqDamInddProcessINDDMediaExtractProcessProperties idsJobWorkflowModel(ConfigNodePropertyString idsJobWorkflowModel) {
    this.idsJobWorkflowModel = idsJobWorkflowModel;
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
    ComDayCqDamInddProcessINDDMediaExtractProcessProperties comDayCqDamInddProcessINDDMediaExtractProcessProperties = (ComDayCqDamInddProcessINDDMediaExtractProcessProperties) o;
    return Objects.equals(this.processLabel, comDayCqDamInddProcessINDDMediaExtractProcessProperties.processLabel) &&
        Objects.equals(this.cqDamInddPagesRegex, comDayCqDamInddProcessINDDMediaExtractProcessProperties.cqDamInddPagesRegex) &&
        Objects.equals(this.idsJobDecoupled, comDayCqDamInddProcessINDDMediaExtractProcessProperties.idsJobDecoupled) &&
        Objects.equals(this.idsJobWorkflowModel, comDayCqDamInddProcessINDDMediaExtractProcessProperties.idsJobWorkflowModel);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

