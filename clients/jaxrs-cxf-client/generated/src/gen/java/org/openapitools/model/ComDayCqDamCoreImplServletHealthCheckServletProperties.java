package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplServletHealthCheckServletProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString cqDamSyncWorkflowId;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray cqDamSyncFolderTypes;
 /**
   * Get cqDamSyncWorkflowId
   * @return cqDamSyncWorkflowId
  **/
  @JsonProperty("cq.dam.sync.workflow.id")
  public ConfigNodePropertyString getCqDamSyncWorkflowId() {
    return cqDamSyncWorkflowId;
  }

  public void setCqDamSyncWorkflowId(ConfigNodePropertyString cqDamSyncWorkflowId) {
    this.cqDamSyncWorkflowId = cqDamSyncWorkflowId;
  }

  public ComDayCqDamCoreImplServletHealthCheckServletProperties cqDamSyncWorkflowId(ConfigNodePropertyString cqDamSyncWorkflowId) {
    this.cqDamSyncWorkflowId = cqDamSyncWorkflowId;
    return this;
  }

 /**
   * Get cqDamSyncFolderTypes
   * @return cqDamSyncFolderTypes
  **/
  @JsonProperty("cq.dam.sync.folder.types")
  public ConfigNodePropertyArray getCqDamSyncFolderTypes() {
    return cqDamSyncFolderTypes;
  }

  public void setCqDamSyncFolderTypes(ConfigNodePropertyArray cqDamSyncFolderTypes) {
    this.cqDamSyncFolderTypes = cqDamSyncFolderTypes;
  }

  public ComDayCqDamCoreImplServletHealthCheckServletProperties cqDamSyncFolderTypes(ConfigNodePropertyArray cqDamSyncFolderTypes) {
    this.cqDamSyncFolderTypes = cqDamSyncFolderTypes;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

