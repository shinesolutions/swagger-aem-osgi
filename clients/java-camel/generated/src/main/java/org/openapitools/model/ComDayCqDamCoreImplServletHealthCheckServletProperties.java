package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplServletHealthCheckServletProperties {

  private ConfigNodePropertyString cqDamSyncWorkflowId;

  private ConfigNodePropertyArray cqDamSyncFolderTypes;

  public ComDayCqDamCoreImplServletHealthCheckServletProperties cqDamSyncWorkflowId(ConfigNodePropertyString cqDamSyncWorkflowId) {
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
  public ConfigNodePropertyString getCqDamSyncWorkflowId() {
    return cqDamSyncWorkflowId;
  }

  public void setCqDamSyncWorkflowId(ConfigNodePropertyString cqDamSyncWorkflowId) {
    this.cqDamSyncWorkflowId = cqDamSyncWorkflowId;
  }

  public ComDayCqDamCoreImplServletHealthCheckServletProperties cqDamSyncFolderTypes(ConfigNodePropertyArray cqDamSyncFolderTypes) {
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
  public ConfigNodePropertyArray getCqDamSyncFolderTypes() {
    return cqDamSyncFolderTypes;
  }

  public void setCqDamSyncFolderTypes(ConfigNodePropertyArray cqDamSyncFolderTypes) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

