package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean preserveHierarchyNodes;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean ignoreVersioning;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean importAcl;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger saveThreshold;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean preserveUserPaths;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean preserveUuid;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray preserveUuidNodetypes;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray preserveUuidSubtrees;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean autoCommit;
 /**
   * Get preserveHierarchyNodes
   * @return preserveHierarchyNodes
  **/
  @JsonProperty("preserve.hierarchy.nodes")
  public ConfigNodePropertyBoolean getPreserveHierarchyNodes() {
    return preserveHierarchyNodes;
  }

  public void setPreserveHierarchyNodes(ConfigNodePropertyBoolean preserveHierarchyNodes) {
    this.preserveHierarchyNodes = preserveHierarchyNodes;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties preserveHierarchyNodes(ConfigNodePropertyBoolean preserveHierarchyNodes) {
    this.preserveHierarchyNodes = preserveHierarchyNodes;
    return this;
  }

 /**
   * Get ignoreVersioning
   * @return ignoreVersioning
  **/
  @JsonProperty("ignore.versioning")
  public ConfigNodePropertyBoolean getIgnoreVersioning() {
    return ignoreVersioning;
  }

  public void setIgnoreVersioning(ConfigNodePropertyBoolean ignoreVersioning) {
    this.ignoreVersioning = ignoreVersioning;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties ignoreVersioning(ConfigNodePropertyBoolean ignoreVersioning) {
    this.ignoreVersioning = ignoreVersioning;
    return this;
  }

 /**
   * Get importAcl
   * @return importAcl
  **/
  @JsonProperty("import.acl")
  public ConfigNodePropertyBoolean getImportAcl() {
    return importAcl;
  }

  public void setImportAcl(ConfigNodePropertyBoolean importAcl) {
    this.importAcl = importAcl;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties importAcl(ConfigNodePropertyBoolean importAcl) {
    this.importAcl = importAcl;
    return this;
  }

 /**
   * Get saveThreshold
   * @return saveThreshold
  **/
  @JsonProperty("save.threshold")
  public ConfigNodePropertyInteger getSaveThreshold() {
    return saveThreshold;
  }

  public void setSaveThreshold(ConfigNodePropertyInteger saveThreshold) {
    this.saveThreshold = saveThreshold;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties saveThreshold(ConfigNodePropertyInteger saveThreshold) {
    this.saveThreshold = saveThreshold;
    return this;
  }

 /**
   * Get preserveUserPaths
   * @return preserveUserPaths
  **/
  @JsonProperty("preserve.user.paths")
  public ConfigNodePropertyBoolean getPreserveUserPaths() {
    return preserveUserPaths;
  }

  public void setPreserveUserPaths(ConfigNodePropertyBoolean preserveUserPaths) {
    this.preserveUserPaths = preserveUserPaths;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties preserveUserPaths(ConfigNodePropertyBoolean preserveUserPaths) {
    this.preserveUserPaths = preserveUserPaths;
    return this;
  }

 /**
   * Get preserveUuid
   * @return preserveUuid
  **/
  @JsonProperty("preserve.uuid")
  public ConfigNodePropertyBoolean getPreserveUuid() {
    return preserveUuid;
  }

  public void setPreserveUuid(ConfigNodePropertyBoolean preserveUuid) {
    this.preserveUuid = preserveUuid;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties preserveUuid(ConfigNodePropertyBoolean preserveUuid) {
    this.preserveUuid = preserveUuid;
    return this;
  }

 /**
   * Get preserveUuidNodetypes
   * @return preserveUuidNodetypes
  **/
  @JsonProperty("preserve.uuid.nodetypes")
  public ConfigNodePropertyArray getPreserveUuidNodetypes() {
    return preserveUuidNodetypes;
  }

  public void setPreserveUuidNodetypes(ConfigNodePropertyArray preserveUuidNodetypes) {
    this.preserveUuidNodetypes = preserveUuidNodetypes;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties preserveUuidNodetypes(ConfigNodePropertyArray preserveUuidNodetypes) {
    this.preserveUuidNodetypes = preserveUuidNodetypes;
    return this;
  }

 /**
   * Get preserveUuidSubtrees
   * @return preserveUuidSubtrees
  **/
  @JsonProperty("preserve.uuid.subtrees")
  public ConfigNodePropertyArray getPreserveUuidSubtrees() {
    return preserveUuidSubtrees;
  }

  public void setPreserveUuidSubtrees(ConfigNodePropertyArray preserveUuidSubtrees) {
    this.preserveUuidSubtrees = preserveUuidSubtrees;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties preserveUuidSubtrees(ConfigNodePropertyArray preserveUuidSubtrees) {
    this.preserveUuidSubtrees = preserveUuidSubtrees;
    return this;
  }

 /**
   * Get autoCommit
   * @return autoCommit
  **/
  @JsonProperty("auto.commit")
  public ConfigNodePropertyBoolean getAutoCommit() {
    return autoCommit;
  }

  public void setAutoCommit(ConfigNodePropertyBoolean autoCommit) {
    this.autoCommit = autoCommit;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties autoCommit(ConfigNodePropertyBoolean autoCommit) {
    this.autoCommit = autoCommit;
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
    ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties = (ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties) o;
    return Objects.equals(this.preserveHierarchyNodes, comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.preserveHierarchyNodes) &&
        Objects.equals(this.ignoreVersioning, comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.ignoreVersioning) &&
        Objects.equals(this.importAcl, comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.importAcl) &&
        Objects.equals(this.saveThreshold, comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.saveThreshold) &&
        Objects.equals(this.preserveUserPaths, comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.preserveUserPaths) &&
        Objects.equals(this.preserveUuid, comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.preserveUuid) &&
        Objects.equals(this.preserveUuidNodetypes, comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.preserveUuidNodetypes) &&
        Objects.equals(this.preserveUuidSubtrees, comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.preserveUuidSubtrees) &&
        Objects.equals(this.autoCommit, comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.autoCommit);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

