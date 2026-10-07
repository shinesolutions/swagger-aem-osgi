package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplServletHealthCheckServletProperties   {
  @JsonProperty("cq.dam.sync.workflow.id")
  private ConfigNodePropertyString cqDamSyncWorkflowId;

  @JsonProperty("cq.dam.sync.folder.types")
  private ConfigNodePropertyArray cqDamSyncFolderTypes;

  /**
   **/
  public ComDayCqDamCoreImplServletHealthCheckServletProperties cqDamSyncWorkflowId(ConfigNodePropertyString cqDamSyncWorkflowId) {
    this.cqDamSyncWorkflowId = cqDamSyncWorkflowId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.sync.workflow.id")
  public ConfigNodePropertyString getCqDamSyncWorkflowId() {
    return cqDamSyncWorkflowId;
  }
  public void setCqDamSyncWorkflowId(ConfigNodePropertyString cqDamSyncWorkflowId) {
    this.cqDamSyncWorkflowId = cqDamSyncWorkflowId;
  }

  /**
   **/
  public ComDayCqDamCoreImplServletHealthCheckServletProperties cqDamSyncFolderTypes(ConfigNodePropertyArray cqDamSyncFolderTypes) {
    this.cqDamSyncFolderTypes = cqDamSyncFolderTypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return Objects.equals(cqDamSyncWorkflowId, comDayCqDamCoreImplServletHealthCheckServletProperties.cqDamSyncWorkflowId) &&
        Objects.equals(cqDamSyncFolderTypes, comDayCqDamCoreImplServletHealthCheckServletProperties.cqDamSyncFolderTypes);
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

