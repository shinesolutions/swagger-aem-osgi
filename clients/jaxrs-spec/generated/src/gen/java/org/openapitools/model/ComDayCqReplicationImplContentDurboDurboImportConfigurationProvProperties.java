package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties   {
  private ConfigNodePropertyBoolean preserveHierarchyNodes;
  private ConfigNodePropertyBoolean ignoreVersioning;
  private ConfigNodePropertyBoolean importAcl;
  private ConfigNodePropertyInteger saveThreshold;
  private ConfigNodePropertyBoolean preserveUserPaths;
  private ConfigNodePropertyBoolean preserveUuid;
  private ConfigNodePropertyArray preserveUuidNodetypes;
  private ConfigNodePropertyArray preserveUuidSubtrees;
  private ConfigNodePropertyBoolean autoCommit;

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties() {
  }

  /**
   **/
  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties preserveHierarchyNodes(ConfigNodePropertyBoolean preserveHierarchyNodes) {
    this.preserveHierarchyNodes = preserveHierarchyNodes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("preserve.hierarchy.nodes")
  @Valid public ConfigNodePropertyBoolean getPreserveHierarchyNodes() {
    return preserveHierarchyNodes;
  }

  @JsonProperty("preserve.hierarchy.nodes")
  public void setPreserveHierarchyNodes(ConfigNodePropertyBoolean preserveHierarchyNodes) {
    this.preserveHierarchyNodes = preserveHierarchyNodes;
  }

  /**
   **/
  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties ignoreVersioning(ConfigNodePropertyBoolean ignoreVersioning) {
    this.ignoreVersioning = ignoreVersioning;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ignore.versioning")
  @Valid public ConfigNodePropertyBoolean getIgnoreVersioning() {
    return ignoreVersioning;
  }

  @JsonProperty("ignore.versioning")
  public void setIgnoreVersioning(ConfigNodePropertyBoolean ignoreVersioning) {
    this.ignoreVersioning = ignoreVersioning;
  }

  /**
   **/
  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties importAcl(ConfigNodePropertyBoolean importAcl) {
    this.importAcl = importAcl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("import.acl")
  @Valid public ConfigNodePropertyBoolean getImportAcl() {
    return importAcl;
  }

  @JsonProperty("import.acl")
  public void setImportAcl(ConfigNodePropertyBoolean importAcl) {
    this.importAcl = importAcl;
  }

  /**
   **/
  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties saveThreshold(ConfigNodePropertyInteger saveThreshold) {
    this.saveThreshold = saveThreshold;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("save.threshold")
  @Valid public ConfigNodePropertyInteger getSaveThreshold() {
    return saveThreshold;
  }

  @JsonProperty("save.threshold")
  public void setSaveThreshold(ConfigNodePropertyInteger saveThreshold) {
    this.saveThreshold = saveThreshold;
  }

  /**
   **/
  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties preserveUserPaths(ConfigNodePropertyBoolean preserveUserPaths) {
    this.preserveUserPaths = preserveUserPaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("preserve.user.paths")
  @Valid public ConfigNodePropertyBoolean getPreserveUserPaths() {
    return preserveUserPaths;
  }

  @JsonProperty("preserve.user.paths")
  public void setPreserveUserPaths(ConfigNodePropertyBoolean preserveUserPaths) {
    this.preserveUserPaths = preserveUserPaths;
  }

  /**
   **/
  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties preserveUuid(ConfigNodePropertyBoolean preserveUuid) {
    this.preserveUuid = preserveUuid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("preserve.uuid")
  @Valid public ConfigNodePropertyBoolean getPreserveUuid() {
    return preserveUuid;
  }

  @JsonProperty("preserve.uuid")
  public void setPreserveUuid(ConfigNodePropertyBoolean preserveUuid) {
    this.preserveUuid = preserveUuid;
  }

  /**
   **/
  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties preserveUuidNodetypes(ConfigNodePropertyArray preserveUuidNodetypes) {
    this.preserveUuidNodetypes = preserveUuidNodetypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("preserve.uuid.nodetypes")
  @Valid public ConfigNodePropertyArray getPreserveUuidNodetypes() {
    return preserveUuidNodetypes;
  }

  @JsonProperty("preserve.uuid.nodetypes")
  public void setPreserveUuidNodetypes(ConfigNodePropertyArray preserveUuidNodetypes) {
    this.preserveUuidNodetypes = preserveUuidNodetypes;
  }

  /**
   **/
  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties preserveUuidSubtrees(ConfigNodePropertyArray preserveUuidSubtrees) {
    this.preserveUuidSubtrees = preserveUuidSubtrees;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("preserve.uuid.subtrees")
  @Valid public ConfigNodePropertyArray getPreserveUuidSubtrees() {
    return preserveUuidSubtrees;
  }

  @JsonProperty("preserve.uuid.subtrees")
  public void setPreserveUuidSubtrees(ConfigNodePropertyArray preserveUuidSubtrees) {
    this.preserveUuidSubtrees = preserveUuidSubtrees;
  }

  /**
   **/
  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties autoCommit(ConfigNodePropertyBoolean autoCommit) {
    this.autoCommit = autoCommit;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("auto.commit")
  @Valid public ConfigNodePropertyBoolean getAutoCommit() {
    return autoCommit;
  }

  @JsonProperty("auto.commit")
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
