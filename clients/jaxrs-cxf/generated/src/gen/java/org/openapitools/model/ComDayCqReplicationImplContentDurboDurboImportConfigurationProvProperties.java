package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean preserveHierarchyNodes = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean ignoreVersioning = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean importAcl = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger saveThreshold = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean preserveUserPaths = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean preserveUuid = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray preserveUuidNodetypes = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray preserveUuidSubtrees = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean autoCommit = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

