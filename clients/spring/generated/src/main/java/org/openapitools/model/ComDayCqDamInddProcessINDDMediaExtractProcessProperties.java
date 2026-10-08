package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqDamInddProcessINDDMediaExtractProcessProperties
 */

@JsonTypeName("comDayCqDamInddProcessINDDMediaExtractProcessProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamInddProcessINDDMediaExtractProcessProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString processLabel;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqDamInddPagesRegex;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean idsJobDecoupled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString idsJobWorkflowModel;

  public ComDayCqDamInddProcessINDDMediaExtractProcessProperties processLabel(@Nullable ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
    return this;
  }

  /**
   * Get processLabel
   * @return processLabel
   */
  @Valid 
  @Schema(name = "process.label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("process.label")
  public @Nullable ConfigNodePropertyString getProcessLabel() {
    return processLabel;
  }

  @JsonProperty("process.label")
  public void setProcessLabel(@Nullable ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
  }

  public ComDayCqDamInddProcessINDDMediaExtractProcessProperties cqDamInddPagesRegex(@Nullable ConfigNodePropertyString cqDamInddPagesRegex) {
    this.cqDamInddPagesRegex = cqDamInddPagesRegex;
    return this;
  }

  /**
   * Get cqDamInddPagesRegex
   * @return cqDamInddPagesRegex
   */
  @Valid 
  @Schema(name = "cq.dam.indd.pages.regex", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.indd.pages.regex")
  public @Nullable ConfigNodePropertyString getCqDamInddPagesRegex() {
    return cqDamInddPagesRegex;
  }

  @JsonProperty("cq.dam.indd.pages.regex")
  public void setCqDamInddPagesRegex(@Nullable ConfigNodePropertyString cqDamInddPagesRegex) {
    this.cqDamInddPagesRegex = cqDamInddPagesRegex;
  }

  public ComDayCqDamInddProcessINDDMediaExtractProcessProperties idsJobDecoupled(@Nullable ConfigNodePropertyBoolean idsJobDecoupled) {
    this.idsJobDecoupled = idsJobDecoupled;
    return this;
  }

  /**
   * Get idsJobDecoupled
   * @return idsJobDecoupled
   */
  @Valid 
  @Schema(name = "ids.job.decoupled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ids.job.decoupled")
  public @Nullable ConfigNodePropertyBoolean getIdsJobDecoupled() {
    return idsJobDecoupled;
  }

  @JsonProperty("ids.job.decoupled")
  public void setIdsJobDecoupled(@Nullable ConfigNodePropertyBoolean idsJobDecoupled) {
    this.idsJobDecoupled = idsJobDecoupled;
  }

  public ComDayCqDamInddProcessINDDMediaExtractProcessProperties idsJobWorkflowModel(@Nullable ConfigNodePropertyString idsJobWorkflowModel) {
    this.idsJobWorkflowModel = idsJobWorkflowModel;
    return this;
  }

  /**
   * Get idsJobWorkflowModel
   * @return idsJobWorkflowModel
   */
  @Valid 
  @Schema(name = "ids.job.workflow.model", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ids.job.workflow.model")
  public @Nullable ConfigNodePropertyString getIdsJobWorkflowModel() {
    return idsJobWorkflowModel;
  }

  @JsonProperty("ids.job.workflow.model")
  public void setIdsJobWorkflowModel(@Nullable ConfigNodePropertyString idsJobWorkflowModel) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

