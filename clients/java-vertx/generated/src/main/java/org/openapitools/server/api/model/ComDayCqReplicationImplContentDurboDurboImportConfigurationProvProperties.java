package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
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

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties () {

  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties (ConfigNodePropertyBoolean preserveHierarchyNodes, ConfigNodePropertyBoolean ignoreVersioning, ConfigNodePropertyBoolean importAcl, ConfigNodePropertyInteger saveThreshold, ConfigNodePropertyBoolean preserveUserPaths, ConfigNodePropertyBoolean preserveUuid, ConfigNodePropertyArray preserveUuidNodetypes, ConfigNodePropertyArray preserveUuidSubtrees, ConfigNodePropertyBoolean autoCommit) {
    this.preserveHierarchyNodes = preserveHierarchyNodes;
    this.ignoreVersioning = ignoreVersioning;
    this.importAcl = importAcl;
    this.saveThreshold = saveThreshold;
    this.preserveUserPaths = preserveUserPaths;
    this.preserveUuid = preserveUuid;
    this.preserveUuidNodetypes = preserveUuidNodetypes;
    this.preserveUuidSubtrees = preserveUuidSubtrees;
    this.autoCommit = autoCommit;
  }

    
  @JsonProperty("preserve.hierarchy.nodes")
  public ConfigNodePropertyBoolean getPreserveHierarchyNodes() {
    return preserveHierarchyNodes;
  }
  public void setPreserveHierarchyNodes(ConfigNodePropertyBoolean preserveHierarchyNodes) {
    this.preserveHierarchyNodes = preserveHierarchyNodes;
  }

    
  @JsonProperty("ignore.versioning")
  public ConfigNodePropertyBoolean getIgnoreVersioning() {
    return ignoreVersioning;
  }
  public void setIgnoreVersioning(ConfigNodePropertyBoolean ignoreVersioning) {
    this.ignoreVersioning = ignoreVersioning;
  }

    
  @JsonProperty("import.acl")
  public ConfigNodePropertyBoolean getImportAcl() {
    return importAcl;
  }
  public void setImportAcl(ConfigNodePropertyBoolean importAcl) {
    this.importAcl = importAcl;
  }

    
  @JsonProperty("save.threshold")
  public ConfigNodePropertyInteger getSaveThreshold() {
    return saveThreshold;
  }
  public void setSaveThreshold(ConfigNodePropertyInteger saveThreshold) {
    this.saveThreshold = saveThreshold;
  }

    
  @JsonProperty("preserve.user.paths")
  public ConfigNodePropertyBoolean getPreserveUserPaths() {
    return preserveUserPaths;
  }
  public void setPreserveUserPaths(ConfigNodePropertyBoolean preserveUserPaths) {
    this.preserveUserPaths = preserveUserPaths;
  }

    
  @JsonProperty("preserve.uuid")
  public ConfigNodePropertyBoolean getPreserveUuid() {
    return preserveUuid;
  }
  public void setPreserveUuid(ConfigNodePropertyBoolean preserveUuid) {
    this.preserveUuid = preserveUuid;
  }

    
  @JsonProperty("preserve.uuid.nodetypes")
  public ConfigNodePropertyArray getPreserveUuidNodetypes() {
    return preserveUuidNodetypes;
  }
  public void setPreserveUuidNodetypes(ConfigNodePropertyArray preserveUuidNodetypes) {
    this.preserveUuidNodetypes = preserveUuidNodetypes;
  }

    
  @JsonProperty("preserve.uuid.subtrees")
  public ConfigNodePropertyArray getPreserveUuidSubtrees() {
    return preserveUuidSubtrees;
  }
  public void setPreserveUuidSubtrees(ConfigNodePropertyArray preserveUuidSubtrees) {
    this.preserveUuidSubtrees = preserveUuidSubtrees;
  }

    
  @JsonProperty("auto.commit")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
