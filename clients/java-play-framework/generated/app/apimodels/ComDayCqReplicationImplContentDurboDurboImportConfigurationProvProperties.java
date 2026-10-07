package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties   {
  @JsonProperty("preserve.hierarchy.nodes")
  @Valid

  private ConfigNodePropertyBoolean preserveHierarchyNodes;

  @JsonProperty("ignore.versioning")
  @Valid

  private ConfigNodePropertyBoolean ignoreVersioning;

  @JsonProperty("import.acl")
  @Valid

  private ConfigNodePropertyBoolean importAcl;

  @JsonProperty("save.threshold")
  @Valid

  private ConfigNodePropertyInteger saveThreshold;

  @JsonProperty("preserve.user.paths")
  @Valid

  private ConfigNodePropertyBoolean preserveUserPaths;

  @JsonProperty("preserve.uuid")
  @Valid

  private ConfigNodePropertyBoolean preserveUuid;

  @JsonProperty("preserve.uuid.nodetypes")
  @Valid

  private ConfigNodePropertyArray preserveUuidNodetypes;

  @JsonProperty("preserve.uuid.subtrees")
  @Valid

  private ConfigNodePropertyArray preserveUuidSubtrees;

  @JsonProperty("auto.commit")
  @Valid

  private ConfigNodePropertyBoolean autoCommit;

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties preserveHierarchyNodes(ConfigNodePropertyBoolean preserveHierarchyNodes) {
    this.preserveHierarchyNodes = preserveHierarchyNodes;
    return this;
  }

   /**
   * Get preserveHierarchyNodes
   * @return preserveHierarchyNodes
  **/
  public ConfigNodePropertyBoolean getPreserveHierarchyNodes() {
    return preserveHierarchyNodes;
  }

  public void setPreserveHierarchyNodes(ConfigNodePropertyBoolean preserveHierarchyNodes) {
    this.preserveHierarchyNodes = preserveHierarchyNodes;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties ignoreVersioning(ConfigNodePropertyBoolean ignoreVersioning) {
    this.ignoreVersioning = ignoreVersioning;
    return this;
  }

   /**
   * Get ignoreVersioning
   * @return ignoreVersioning
  **/
  public ConfigNodePropertyBoolean getIgnoreVersioning() {
    return ignoreVersioning;
  }

  public void setIgnoreVersioning(ConfigNodePropertyBoolean ignoreVersioning) {
    this.ignoreVersioning = ignoreVersioning;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties importAcl(ConfigNodePropertyBoolean importAcl) {
    this.importAcl = importAcl;
    return this;
  }

   /**
   * Get importAcl
   * @return importAcl
  **/
  public ConfigNodePropertyBoolean getImportAcl() {
    return importAcl;
  }

  public void setImportAcl(ConfigNodePropertyBoolean importAcl) {
    this.importAcl = importAcl;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties saveThreshold(ConfigNodePropertyInteger saveThreshold) {
    this.saveThreshold = saveThreshold;
    return this;
  }

   /**
   * Get saveThreshold
   * @return saveThreshold
  **/
  public ConfigNodePropertyInteger getSaveThreshold() {
    return saveThreshold;
  }

  public void setSaveThreshold(ConfigNodePropertyInteger saveThreshold) {
    this.saveThreshold = saveThreshold;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties preserveUserPaths(ConfigNodePropertyBoolean preserveUserPaths) {
    this.preserveUserPaths = preserveUserPaths;
    return this;
  }

   /**
   * Get preserveUserPaths
   * @return preserveUserPaths
  **/
  public ConfigNodePropertyBoolean getPreserveUserPaths() {
    return preserveUserPaths;
  }

  public void setPreserveUserPaths(ConfigNodePropertyBoolean preserveUserPaths) {
    this.preserveUserPaths = preserveUserPaths;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties preserveUuid(ConfigNodePropertyBoolean preserveUuid) {
    this.preserveUuid = preserveUuid;
    return this;
  }

   /**
   * Get preserveUuid
   * @return preserveUuid
  **/
  public ConfigNodePropertyBoolean getPreserveUuid() {
    return preserveUuid;
  }

  public void setPreserveUuid(ConfigNodePropertyBoolean preserveUuid) {
    this.preserveUuid = preserveUuid;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties preserveUuidNodetypes(ConfigNodePropertyArray preserveUuidNodetypes) {
    this.preserveUuidNodetypes = preserveUuidNodetypes;
    return this;
  }

   /**
   * Get preserveUuidNodetypes
   * @return preserveUuidNodetypes
  **/
  public ConfigNodePropertyArray getPreserveUuidNodetypes() {
    return preserveUuidNodetypes;
  }

  public void setPreserveUuidNodetypes(ConfigNodePropertyArray preserveUuidNodetypes) {
    this.preserveUuidNodetypes = preserveUuidNodetypes;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties preserveUuidSubtrees(ConfigNodePropertyArray preserveUuidSubtrees) {
    this.preserveUuidSubtrees = preserveUuidSubtrees;
    return this;
  }

   /**
   * Get preserveUuidSubtrees
   * @return preserveUuidSubtrees
  **/
  public ConfigNodePropertyArray getPreserveUuidSubtrees() {
    return preserveUuidSubtrees;
  }

  public void setPreserveUuidSubtrees(ConfigNodePropertyArray preserveUuidSubtrees) {
    this.preserveUuidSubtrees = preserveUuidSubtrees;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties autoCommit(ConfigNodePropertyBoolean autoCommit) {
    this.autoCommit = autoCommit;
    return this;
  }

   /**
   * Get autoCommit
   * @return autoCommit
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

