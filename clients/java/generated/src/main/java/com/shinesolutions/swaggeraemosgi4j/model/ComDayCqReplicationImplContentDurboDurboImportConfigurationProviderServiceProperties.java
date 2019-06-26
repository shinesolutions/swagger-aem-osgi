/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraemosgi4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyArray;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyBoolean;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-26T12:10:03.209Z[GMT]")
public class ComDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties {
  public static final String SERIALIZED_NAME_PRESERVE_HIERARCHY_NODES = "preserve.hierarchy.nodes";
  @SerializedName(SERIALIZED_NAME_PRESERVE_HIERARCHY_NODES)
  private ConfigNodePropertyBoolean preserveHierarchyNodes = null;

  public static final String SERIALIZED_NAME_IGNORE_VERSIONING = "ignore.versioning";
  @SerializedName(SERIALIZED_NAME_IGNORE_VERSIONING)
  private ConfigNodePropertyBoolean ignoreVersioning = null;

  public static final String SERIALIZED_NAME_IMPORT_ACL = "import.acl";
  @SerializedName(SERIALIZED_NAME_IMPORT_ACL)
  private ConfigNodePropertyBoolean importAcl = null;

  public static final String SERIALIZED_NAME_SAVE_THRESHOLD = "save.threshold";
  @SerializedName(SERIALIZED_NAME_SAVE_THRESHOLD)
  private ConfigNodePropertyInteger saveThreshold = null;

  public static final String SERIALIZED_NAME_PRESERVE_USER_PATHS = "preserve.user.paths";
  @SerializedName(SERIALIZED_NAME_PRESERVE_USER_PATHS)
  private ConfigNodePropertyBoolean preserveUserPaths = null;

  public static final String SERIALIZED_NAME_PRESERVE_UUID = "preserve.uuid";
  @SerializedName(SERIALIZED_NAME_PRESERVE_UUID)
  private ConfigNodePropertyBoolean preserveUuid = null;

  public static final String SERIALIZED_NAME_PRESERVE_UUID_NODETYPES = "preserve.uuid.nodetypes";
  @SerializedName(SERIALIZED_NAME_PRESERVE_UUID_NODETYPES)
  private ConfigNodePropertyArray preserveUuidNodetypes = null;

  public static final String SERIALIZED_NAME_PRESERVE_UUID_SUBTREES = "preserve.uuid.subtrees";
  @SerializedName(SERIALIZED_NAME_PRESERVE_UUID_SUBTREES)
  private ConfigNodePropertyArray preserveUuidSubtrees = null;

  public static final String SERIALIZED_NAME_AUTO_COMMIT = "auto.commit";
  @SerializedName(SERIALIZED_NAME_AUTO_COMMIT)
  private ConfigNodePropertyBoolean autoCommit = null;

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties preserveHierarchyNodes(ConfigNodePropertyBoolean preserveHierarchyNodes) {
    this.preserveHierarchyNodes = preserveHierarchyNodes;
    return this;
  }

   /**
   * Get preserveHierarchyNodes
   * @return preserveHierarchyNodes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getPreserveHierarchyNodes() {
    return preserveHierarchyNodes;
  }

  public void setPreserveHierarchyNodes(ConfigNodePropertyBoolean preserveHierarchyNodes) {
    this.preserveHierarchyNodes = preserveHierarchyNodes;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties ignoreVersioning(ConfigNodePropertyBoolean ignoreVersioning) {
    this.ignoreVersioning = ignoreVersioning;
    return this;
  }

   /**
   * Get ignoreVersioning
   * @return ignoreVersioning
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getIgnoreVersioning() {
    return ignoreVersioning;
  }

  public void setIgnoreVersioning(ConfigNodePropertyBoolean ignoreVersioning) {
    this.ignoreVersioning = ignoreVersioning;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties importAcl(ConfigNodePropertyBoolean importAcl) {
    this.importAcl = importAcl;
    return this;
  }

   /**
   * Get importAcl
   * @return importAcl
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getImportAcl() {
    return importAcl;
  }

  public void setImportAcl(ConfigNodePropertyBoolean importAcl) {
    this.importAcl = importAcl;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties saveThreshold(ConfigNodePropertyInteger saveThreshold) {
    this.saveThreshold = saveThreshold;
    return this;
  }

   /**
   * Get saveThreshold
   * @return saveThreshold
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getSaveThreshold() {
    return saveThreshold;
  }

  public void setSaveThreshold(ConfigNodePropertyInteger saveThreshold) {
    this.saveThreshold = saveThreshold;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties preserveUserPaths(ConfigNodePropertyBoolean preserveUserPaths) {
    this.preserveUserPaths = preserveUserPaths;
    return this;
  }

   /**
   * Get preserveUserPaths
   * @return preserveUserPaths
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getPreserveUserPaths() {
    return preserveUserPaths;
  }

  public void setPreserveUserPaths(ConfigNodePropertyBoolean preserveUserPaths) {
    this.preserveUserPaths = preserveUserPaths;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties preserveUuid(ConfigNodePropertyBoolean preserveUuid) {
    this.preserveUuid = preserveUuid;
    return this;
  }

   /**
   * Get preserveUuid
   * @return preserveUuid
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getPreserveUuid() {
    return preserveUuid;
  }

  public void setPreserveUuid(ConfigNodePropertyBoolean preserveUuid) {
    this.preserveUuid = preserveUuid;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties preserveUuidNodetypes(ConfigNodePropertyArray preserveUuidNodetypes) {
    this.preserveUuidNodetypes = preserveUuidNodetypes;
    return this;
  }

   /**
   * Get preserveUuidNodetypes
   * @return preserveUuidNodetypes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getPreserveUuidNodetypes() {
    return preserveUuidNodetypes;
  }

  public void setPreserveUuidNodetypes(ConfigNodePropertyArray preserveUuidNodetypes) {
    this.preserveUuidNodetypes = preserveUuidNodetypes;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties preserveUuidSubtrees(ConfigNodePropertyArray preserveUuidSubtrees) {
    this.preserveUuidSubtrees = preserveUuidSubtrees;
    return this;
  }

   /**
   * Get preserveUuidSubtrees
   * @return preserveUuidSubtrees
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getPreserveUuidSubtrees() {
    return preserveUuidSubtrees;
  }

  public void setPreserveUuidSubtrees(ConfigNodePropertyArray preserveUuidSubtrees) {
    this.preserveUuidSubtrees = preserveUuidSubtrees;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties autoCommit(ConfigNodePropertyBoolean autoCommit) {
    this.autoCommit = autoCommit;
    return this;
  }

   /**
   * Get autoCommit
   * @return autoCommit
  **/
  @ApiModelProperty(value = "")
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
    ComDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties comDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties = (ComDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties) o;
    return Objects.equals(this.preserveHierarchyNodes, comDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties.preserveHierarchyNodes) &&
        Objects.equals(this.ignoreVersioning, comDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties.ignoreVersioning) &&
        Objects.equals(this.importAcl, comDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties.importAcl) &&
        Objects.equals(this.saveThreshold, comDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties.saveThreshold) &&
        Objects.equals(this.preserveUserPaths, comDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties.preserveUserPaths) &&
        Objects.equals(this.preserveUuid, comDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties.preserveUuid) &&
        Objects.equals(this.preserveUuidNodetypes, comDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties.preserveUuidNodetypes) &&
        Objects.equals(this.preserveUuidSubtrees, comDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties.preserveUuidSubtrees) &&
        Objects.equals(this.autoCommit, comDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties.autoCommit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preserveHierarchyNodes, ignoreVersioning, importAcl, saveThreshold, preserveUserPaths, preserveUuid, preserveUuidNodetypes, preserveUuidSubtrees, autoCommit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqReplicationImplContentDurboDurboImportConfigurationProviderServiceProperties {\n");
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

