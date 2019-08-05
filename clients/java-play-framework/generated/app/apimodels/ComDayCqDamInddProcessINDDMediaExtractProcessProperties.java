package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamInddProcessINDDMediaExtractProcessProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamInddProcessINDDMediaExtractProcessProperties   {
  @JsonProperty("process.label")
  private ConfigNodePropertyString processLabel = null;

  @JsonProperty("cq.dam.indd.pages.regex")
  private ConfigNodePropertyString cqDamInddPagesRegex = null;

  @JsonProperty("ids.job.decoupled")
  private ConfigNodePropertyBoolean idsJobDecoupled = null;

  @JsonProperty("ids.job.workflow.model")
  private ConfigNodePropertyString idsJobWorkflowModel = null;

  public ComDayCqDamInddProcessINDDMediaExtractProcessProperties processLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
    return this;
  }

   /**
   * Get processLabel
   * @return processLabel
  **/
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

