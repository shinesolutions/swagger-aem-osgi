package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqDamInddProcessINDDMediaExtractProcessProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamInddProcessINDDMediaExtractProcessProperties   {
  @JsonProperty("process.label")
  @Valid

  private ConfigNodePropertyString processLabel;

  @JsonProperty("cq.dam.indd.pages.regex")
  @Valid

  private ConfigNodePropertyString cqDamInddPagesRegex;

  @JsonProperty("ids.job.decoupled")
  @Valid

  private ConfigNodePropertyBoolean idsJobDecoupled;

  @JsonProperty("ids.job.workflow.model")
  @Valid

  private ConfigNodePropertyString idsJobWorkflowModel;

  public ComDayCqDamInddProcessINDDMediaExtractProcessProperties processLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
    return this;
  }

   /**
   * Get processLabel
   * @return processLabel
  **/
  public ConfigNodePropertyString getProcessLabel() {
    return processLabel;
  }

  public void setProcessLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
  }

  public ComDayCqDamInddProcessINDDMediaExtractProcessProperties cqDamInddPagesRegex(ConfigNodePropertyString cqDamInddPagesRegex) {
    this.cqDamInddPagesRegex = cqDamInddPagesRegex;
    return this;
  }

   /**
   * Get cqDamInddPagesRegex
   * @return cqDamInddPagesRegex
  **/
  public ConfigNodePropertyString getCqDamInddPagesRegex() {
    return cqDamInddPagesRegex;
  }

  public void setCqDamInddPagesRegex(ConfigNodePropertyString cqDamInddPagesRegex) {
    this.cqDamInddPagesRegex = cqDamInddPagesRegex;
  }

  public ComDayCqDamInddProcessINDDMediaExtractProcessProperties idsJobDecoupled(ConfigNodePropertyBoolean idsJobDecoupled) {
    this.idsJobDecoupled = idsJobDecoupled;
    return this;
  }

   /**
   * Get idsJobDecoupled
   * @return idsJobDecoupled
  **/
  public ConfigNodePropertyBoolean getIdsJobDecoupled() {
    return idsJobDecoupled;
  }

  public void setIdsJobDecoupled(ConfigNodePropertyBoolean idsJobDecoupled) {
    this.idsJobDecoupled = idsJobDecoupled;
  }

  public ComDayCqDamInddProcessINDDMediaExtractProcessProperties idsJobWorkflowModel(ConfigNodePropertyString idsJobWorkflowModel) {
    this.idsJobWorkflowModel = idsJobWorkflowModel;
    return this;
  }

   /**
   * Get idsJobWorkflowModel
   * @return idsJobWorkflowModel
  **/
  public ConfigNodePropertyString getIdsJobWorkflowModel() {
    return idsJobWorkflowModel;
  }

  public void setIdsJobWorkflowModel(ConfigNodePropertyString idsJobWorkflowModel) {
    this.idsJobWorkflowModel = idsJobWorkflowModel;
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
    return Objects.equals(processLabel, comDayCqDamInddProcessINDDMediaExtractProcessProperties.processLabel) &&
        Objects.equals(cqDamInddPagesRegex, comDayCqDamInddProcessINDDMediaExtractProcessProperties.cqDamInddPagesRegex) &&
        Objects.equals(idsJobDecoupled, comDayCqDamInddProcessINDDMediaExtractProcessProperties.idsJobDecoupled) &&
        Objects.equals(idsJobWorkflowModel, comDayCqDamInddProcessINDDMediaExtractProcessProperties.idsJobWorkflowModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processLabel, cqDamInddPagesRegex, idsJobDecoupled, idsJobWorkflowModel);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

