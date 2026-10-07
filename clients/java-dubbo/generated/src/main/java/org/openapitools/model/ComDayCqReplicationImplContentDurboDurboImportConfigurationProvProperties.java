package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("preserve.hierarchy.nodes")
  private ConfigNodePropertyBoolean preserveHierarchyNodes;

  @JsonProperty("ignore.versioning")
  private ConfigNodePropertyBoolean ignoreVersioning;

  @JsonProperty("import.acl")
  private ConfigNodePropertyBoolean importAcl;

  @JsonProperty("save.threshold")
  private ConfigNodePropertyInteger saveThreshold;

  @JsonProperty("preserve.user.paths")
  private ConfigNodePropertyBoolean preserveUserPaths;

  @JsonProperty("preserve.uuid")
  private ConfigNodePropertyBoolean preserveUuid;

  @JsonProperty("preserve.uuid.nodetypes")
  private ConfigNodePropertyArray preserveUuidNodetypes;

  @JsonProperty("preserve.uuid.subtrees")
  private ConfigNodePropertyArray preserveUuidSubtrees;

  @JsonProperty("auto.commit")
  private ConfigNodePropertyBoolean autoCommit;

  /**
   * 
   * @return preserveHierarchyNodes
   */
  public ConfigNodePropertyBoolean getPreserveHierarchyNodes() {
    return preserveHierarchyNodes;
  }

  public void setPreserveHierarchyNodes(ConfigNodePropertyBoolean preserveHierarchyNodes) {
    this.preserveHierarchyNodes = preserveHierarchyNodes;
  }

  /**
   * 
   * @return ignoreVersioning
   */
  public ConfigNodePropertyBoolean getIgnoreVersioning() {
    return ignoreVersioning;
  }

  public void setIgnoreVersioning(ConfigNodePropertyBoolean ignoreVersioning) {
    this.ignoreVersioning = ignoreVersioning;
  }

  /**
   * 
   * @return importAcl
   */
  public ConfigNodePropertyBoolean getImportAcl() {
    return importAcl;
  }

  public void setImportAcl(ConfigNodePropertyBoolean importAcl) {
    this.importAcl = importAcl;
  }

  /**
   * 
   * @return saveThreshold
   */
  public ConfigNodePropertyInteger getSaveThreshold() {
    return saveThreshold;
  }

  public void setSaveThreshold(ConfigNodePropertyInteger saveThreshold) {
    this.saveThreshold = saveThreshold;
  }

  /**
   * 
   * @return preserveUserPaths
   */
  public ConfigNodePropertyBoolean getPreserveUserPaths() {
    return preserveUserPaths;
  }

  public void setPreserveUserPaths(ConfigNodePropertyBoolean preserveUserPaths) {
    this.preserveUserPaths = preserveUserPaths;
  }

  /**
   * 
   * @return preserveUuid
   */
  public ConfigNodePropertyBoolean getPreserveUuid() {
    return preserveUuid;
  }

  public void setPreserveUuid(ConfigNodePropertyBoolean preserveUuid) {
    this.preserveUuid = preserveUuid;
  }

  /**
   * 
   * @return preserveUuidNodetypes
   */
  public ConfigNodePropertyArray getPreserveUuidNodetypes() {
    return preserveUuidNodetypes;
  }

  public void setPreserveUuidNodetypes(ConfigNodePropertyArray preserveUuidNodetypes) {
    this.preserveUuidNodetypes = preserveUuidNodetypes;
  }

  /**
   * 
   * @return preserveUuidSubtrees
   */
  public ConfigNodePropertyArray getPreserveUuidSubtrees() {
    return preserveUuidSubtrees;
  }

  public void setPreserveUuidSubtrees(ConfigNodePropertyArray preserveUuidSubtrees) {
    this.preserveUuidSubtrees = preserveUuidSubtrees;
  }

  /**
   * 
   * @return autoCommit
   */
  public ConfigNodePropertyBoolean getAutoCommit() {
    return autoCommit;
  }

  public void setAutoCommit(ConfigNodePropertyBoolean autoCommit) {
    this.autoCommit = autoCommit;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
