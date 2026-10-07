package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * ComDayCqDamCoreImplServletHealthCheckServletProperties
 */

@JsonTypeName("comDayCqDamCoreImplServletHealthCheckServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplServletHealthCheckServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqDamSyncWorkflowId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cqDamSyncFolderTypes;

  public ComDayCqDamCoreImplServletHealthCheckServletProperties cqDamSyncWorkflowId(@Nullable ConfigNodePropertyString cqDamSyncWorkflowId) {
    this.cqDamSyncWorkflowId = cqDamSyncWorkflowId;
    return this;
  }

  /**
   * Get cqDamSyncWorkflowId
   * @return cqDamSyncWorkflowId
   */
  @Valid 
  @Schema(name = "cq.dam.sync.workflow.id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.sync.workflow.id")
  public @Nullable ConfigNodePropertyString getCqDamSyncWorkflowId() {
    return cqDamSyncWorkflowId;
  }

  @JsonProperty("cq.dam.sync.workflow.id")
  public void setCqDamSyncWorkflowId(@Nullable ConfigNodePropertyString cqDamSyncWorkflowId) {
    this.cqDamSyncWorkflowId = cqDamSyncWorkflowId;
  }

  public ComDayCqDamCoreImplServletHealthCheckServletProperties cqDamSyncFolderTypes(@Nullable ConfigNodePropertyArray cqDamSyncFolderTypes) {
    this.cqDamSyncFolderTypes = cqDamSyncFolderTypes;
    return this;
  }

  /**
   * Get cqDamSyncFolderTypes
   * @return cqDamSyncFolderTypes
   */
  @Valid 
  @Schema(name = "cq.dam.sync.folder.types", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.sync.folder.types")
  public @Nullable ConfigNodePropertyArray getCqDamSyncFolderTypes() {
    return cqDamSyncFolderTypes;
  }

  @JsonProperty("cq.dam.sync.folder.types")
  public void setCqDamSyncFolderTypes(@Nullable ConfigNodePropertyArray cqDamSyncFolderTypes) {
    this.cqDamSyncFolderTypes = cqDamSyncFolderTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletHealthCheckServletProperties comDayCqDamCoreImplServletHealthCheckServletProperties = (ComDayCqDamCoreImplServletHealthCheckServletProperties) o;
    return Objects.equals(this.cqDamSyncWorkflowId, comDayCqDamCoreImplServletHealthCheckServletProperties.cqDamSyncWorkflowId) &&
        Objects.equals(this.cqDamSyncFolderTypes, comDayCqDamCoreImplServletHealthCheckServletProperties.cqDamSyncFolderTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamSyncWorkflowId, cqDamSyncFolderTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletHealthCheckServletProperties {\n");
    sb.append("    cqDamSyncWorkflowId: ").append(toIndentedString(cqDamSyncWorkflowId)).append("\n");
    sb.append("    cqDamSyncFolderTypes: ").append(toIndentedString(cqDamSyncFolderTypes)).append("\n");
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

