package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties
 */

@JsonTypeName("comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean preserveHierarchyNodes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean ignoreVersioning;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean importAcl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger saveThreshold;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean preserveUserPaths;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean preserveUuid;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray preserveUuidNodetypes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray preserveUuidSubtrees;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean autoCommit;

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties preserveHierarchyNodes(@Nullable ConfigNodePropertyBoolean preserveHierarchyNodes) {
    this.preserveHierarchyNodes = preserveHierarchyNodes;
    return this;
  }

  /**
   * Get preserveHierarchyNodes
   * @return preserveHierarchyNodes
   */
  @Valid 
  @Schema(name = "preserve.hierarchy.nodes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preserve.hierarchy.nodes")
  public @Nullable ConfigNodePropertyBoolean getPreserveHierarchyNodes() {
    return preserveHierarchyNodes;
  }

  @JsonProperty("preserve.hierarchy.nodes")
  public void setPreserveHierarchyNodes(@Nullable ConfigNodePropertyBoolean preserveHierarchyNodes) {
    this.preserveHierarchyNodes = preserveHierarchyNodes;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties ignoreVersioning(@Nullable ConfigNodePropertyBoolean ignoreVersioning) {
    this.ignoreVersioning = ignoreVersioning;
    return this;
  }

  /**
   * Get ignoreVersioning
   * @return ignoreVersioning
   */
  @Valid 
  @Schema(name = "ignore.versioning", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ignore.versioning")
  public @Nullable ConfigNodePropertyBoolean getIgnoreVersioning() {
    return ignoreVersioning;
  }

  @JsonProperty("ignore.versioning")
  public void setIgnoreVersioning(@Nullable ConfigNodePropertyBoolean ignoreVersioning) {
    this.ignoreVersioning = ignoreVersioning;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties importAcl(@Nullable ConfigNodePropertyBoolean importAcl) {
    this.importAcl = importAcl;
    return this;
  }

  /**
   * Get importAcl
   * @return importAcl
   */
  @Valid 
  @Schema(name = "import.acl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("import.acl")
  public @Nullable ConfigNodePropertyBoolean getImportAcl() {
    return importAcl;
  }

  @JsonProperty("import.acl")
  public void setImportAcl(@Nullable ConfigNodePropertyBoolean importAcl) {
    this.importAcl = importAcl;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties saveThreshold(@Nullable ConfigNodePropertyInteger saveThreshold) {
    this.saveThreshold = saveThreshold;
    return this;
  }

  /**
   * Get saveThreshold
   * @return saveThreshold
   */
  @Valid 
  @Schema(name = "save.threshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("save.threshold")
  public @Nullable ConfigNodePropertyInteger getSaveThreshold() {
    return saveThreshold;
  }

  @JsonProperty("save.threshold")
  public void setSaveThreshold(@Nullable ConfigNodePropertyInteger saveThreshold) {
    this.saveThreshold = saveThreshold;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties preserveUserPaths(@Nullable ConfigNodePropertyBoolean preserveUserPaths) {
    this.preserveUserPaths = preserveUserPaths;
    return this;
  }

  /**
   * Get preserveUserPaths
   * @return preserveUserPaths
   */
  @Valid 
  @Schema(name = "preserve.user.paths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preserve.user.paths")
  public @Nullable ConfigNodePropertyBoolean getPreserveUserPaths() {
    return preserveUserPaths;
  }

  @JsonProperty("preserve.user.paths")
  public void setPreserveUserPaths(@Nullable ConfigNodePropertyBoolean preserveUserPaths) {
    this.preserveUserPaths = preserveUserPaths;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties preserveUuid(@Nullable ConfigNodePropertyBoolean preserveUuid) {
    this.preserveUuid = preserveUuid;
    return this;
  }

  /**
   * Get preserveUuid
   * @return preserveUuid
   */
  @Valid 
  @Schema(name = "preserve.uuid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preserve.uuid")
  public @Nullable ConfigNodePropertyBoolean getPreserveUuid() {
    return preserveUuid;
  }

  @JsonProperty("preserve.uuid")
  public void setPreserveUuid(@Nullable ConfigNodePropertyBoolean preserveUuid) {
    this.preserveUuid = preserveUuid;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties preserveUuidNodetypes(@Nullable ConfigNodePropertyArray preserveUuidNodetypes) {
    this.preserveUuidNodetypes = preserveUuidNodetypes;
    return this;
  }

  /**
   * Get preserveUuidNodetypes
   * @return preserveUuidNodetypes
   */
  @Valid 
  @Schema(name = "preserve.uuid.nodetypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preserve.uuid.nodetypes")
  public @Nullable ConfigNodePropertyArray getPreserveUuidNodetypes() {
    return preserveUuidNodetypes;
  }

  @JsonProperty("preserve.uuid.nodetypes")
  public void setPreserveUuidNodetypes(@Nullable ConfigNodePropertyArray preserveUuidNodetypes) {
    this.preserveUuidNodetypes = preserveUuidNodetypes;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties preserveUuidSubtrees(@Nullable ConfigNodePropertyArray preserveUuidSubtrees) {
    this.preserveUuidSubtrees = preserveUuidSubtrees;
    return this;
  }

  /**
   * Get preserveUuidSubtrees
   * @return preserveUuidSubtrees
   */
  @Valid 
  @Schema(name = "preserve.uuid.subtrees", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preserve.uuid.subtrees")
  public @Nullable ConfigNodePropertyArray getPreserveUuidSubtrees() {
    return preserveUuidSubtrees;
  }

  @JsonProperty("preserve.uuid.subtrees")
  public void setPreserveUuidSubtrees(@Nullable ConfigNodePropertyArray preserveUuidSubtrees) {
    this.preserveUuidSubtrees = preserveUuidSubtrees;
  }

  public ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties autoCommit(@Nullable ConfigNodePropertyBoolean autoCommit) {
    this.autoCommit = autoCommit;
    return this;
  }

  /**
   * Get autoCommit
   * @return autoCommit
   */
  @Valid 
  @Schema(name = "auto.commit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auto.commit")
  public @Nullable ConfigNodePropertyBoolean getAutoCommit() {
    return autoCommit;
  }

  @JsonProperty("auto.commit")
  public void setAutoCommit(@Nullable ConfigNodePropertyBoolean autoCommit) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

