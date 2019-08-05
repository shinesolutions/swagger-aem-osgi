package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties   {
  
  private ConfigNodePropertyBoolean preserveHierarchyNodes = null;
  private ConfigNodePropertyBoolean ignoreVersioning = null;
  private ConfigNodePropertyBoolean importAcl = null;
  private ConfigNodePropertyInteger saveThreshold = null;
  private ConfigNodePropertyBoolean preserveUserPaths = null;
  private ConfigNodePropertyBoolean preserveUuid = null;
  private ConfigNodePropertyArray preserveUuidNodetypes = null;
  private ConfigNodePropertyArray preserveUuidSubtrees = null;
  private ConfigNodePropertyBoolean autoCommit = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preserve.hierarchy.nodes")
  public ConfigNodePropertyBoolean getPreserveHierarchyNodes() {
    return preserveHierarchyNodes;
  }
  public void setPreserveHierarchyNodes(ConfigNodePropertyBoolean preserveHierarchyNodes) {
    this.preserveHierarchyNodes = preserveHierarchyNodes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ignore.versioning")
  public ConfigNodePropertyBoolean getIgnoreVersioning() {
    return ignoreVersioning;
  }
  public void setIgnoreVersioning(ConfigNodePropertyBoolean ignoreVersioning) {
    this.ignoreVersioning = ignoreVersioning;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("import.acl")
  public ConfigNodePropertyBoolean getImportAcl() {
    return importAcl;
  }
  public void setImportAcl(ConfigNodePropertyBoolean importAcl) {
    this.importAcl = importAcl;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("save.threshold")
  public ConfigNodePropertyInteger getSaveThreshold() {
    return saveThreshold;
  }
  public void setSaveThreshold(ConfigNodePropertyInteger saveThreshold) {
    this.saveThreshold = saveThreshold;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preserve.user.paths")
  public ConfigNodePropertyBoolean getPreserveUserPaths() {
    return preserveUserPaths;
  }
  public void setPreserveUserPaths(ConfigNodePropertyBoolean preserveUserPaths) {
    this.preserveUserPaths = preserveUserPaths;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preserve.uuid")
  public ConfigNodePropertyBoolean getPreserveUuid() {
    return preserveUuid;
  }
  public void setPreserveUuid(ConfigNodePropertyBoolean preserveUuid) {
    this.preserveUuid = preserveUuid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preserve.uuid.nodetypes")
  public ConfigNodePropertyArray getPreserveUuidNodetypes() {
    return preserveUuidNodetypes;
  }
  public void setPreserveUuidNodetypes(ConfigNodePropertyArray preserveUuidNodetypes) {
    this.preserveUuidNodetypes = preserveUuidNodetypes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("preserve.uuid.subtrees")
  public ConfigNodePropertyArray getPreserveUuidSubtrees() {
    return preserveUuidSubtrees;
  }
  public void setPreserveUuidSubtrees(ConfigNodePropertyArray preserveUuidSubtrees) {
    this.preserveUuidSubtrees = preserveUuidSubtrees;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("auto.commit")
  public ConfigNodePropertyBoolean getAutoCommit() {
    return autoCommit;
  }
  public void setAutoCommit(ConfigNodePropertyBoolean autoCommit) {
    this.autoCommit = autoCommit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties = (ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties) o;
    return Objects.equals(preserveHierarchyNodes, comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.preserveHierarchyNodes) &&
        Objects.equals(ignoreVersioning, comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.ignoreVersioning) &&
        Objects.equals(importAcl, comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.importAcl) &&
        Objects.equals(saveThreshold, comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.saveThreshold) &&
        Objects.equals(preserveUserPaths, comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.preserveUserPaths) &&
        Objects.equals(preserveUuid, comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.preserveUuid) &&
        Objects.equals(preserveUuidNodetypes, comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.preserveUuidNodetypes) &&
        Objects.equals(preserveUuidSubtrees, comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.preserveUuidSubtrees) &&
        Objects.equals(autoCommit, comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.autoCommit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preserveHierarchyNodes, ignoreVersioning, importAcl, saveThreshold, preserveUserPaths, preserveUuid, preserveUuidNodetypes, preserveUuidSubtrees, autoCommit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties {\n");
    
    sb.append("    preserveHierarchyNodes: ").append(toIndentedString(preserveHierarchyNodes)).append("\n");
    sb.append("    ignoreVersioning: ").append(toIndentedString(ignoreVersioning)).append("\n");
    sb.append("    importAcl: ").append(toIndentedString(importAcl)).append("\n");
    sb.append("    saveThreshold: ").append(toIndentedString(saveThreshold)).append("\n");
    sb.append("    preserveUserPaths: ").append(toIndentedString(preserveUserPaths)).append("\n");
    sb.append("    preserveUuid: ").append(toIndentedString(preserveUuid)).append("\n");
    sb.append("    preserveUuidNodetypes: ").append(toIndentedString(preserveUuidNodetypes)).append("\n");
    sb.append("    preserveUuidSubtrees: ").append(toIndentedString(preserveUuidSubtrees)).append("\n");
    sb.append("    autoCommit: ").append(toIndentedString(autoCommit)).append("\n");
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

