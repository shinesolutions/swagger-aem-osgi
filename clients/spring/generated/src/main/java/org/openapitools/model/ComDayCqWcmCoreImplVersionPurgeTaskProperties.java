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
 * ComDayCqWcmCoreImplVersionPurgeTaskProperties
 */

@JsonTypeName("comDayCqWcmCoreImplVersionPurgeTaskProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplVersionPurgeTaskProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray versionpurgePaths;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean versionpurgeRecursive;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger versionpurgeMaxVersions;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger versionpurgeMinVersions;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger versionpurgeMaxAgeDays;

  public ComDayCqWcmCoreImplVersionPurgeTaskProperties versionpurgePaths(@Nullable ConfigNodePropertyArray versionpurgePaths) {
    this.versionpurgePaths = versionpurgePaths;
    return this;
  }

  /**
   * Get versionpurgePaths
   * @return versionpurgePaths
   */
  @Valid 
  @Schema(name = "versionpurge.paths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionpurge.paths")
  public @Nullable ConfigNodePropertyArray getVersionpurgePaths() {
    return versionpurgePaths;
  }

  @JsonProperty("versionpurge.paths")
  public void setVersionpurgePaths(@Nullable ConfigNodePropertyArray versionpurgePaths) {
    this.versionpurgePaths = versionpurgePaths;
  }

  public ComDayCqWcmCoreImplVersionPurgeTaskProperties versionpurgeRecursive(@Nullable ConfigNodePropertyBoolean versionpurgeRecursive) {
    this.versionpurgeRecursive = versionpurgeRecursive;
    return this;
  }

  /**
   * Get versionpurgeRecursive
   * @return versionpurgeRecursive
   */
  @Valid 
  @Schema(name = "versionpurge.recursive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionpurge.recursive")
  public @Nullable ConfigNodePropertyBoolean getVersionpurgeRecursive() {
    return versionpurgeRecursive;
  }

  @JsonProperty("versionpurge.recursive")
  public void setVersionpurgeRecursive(@Nullable ConfigNodePropertyBoolean versionpurgeRecursive) {
    this.versionpurgeRecursive = versionpurgeRecursive;
  }

  public ComDayCqWcmCoreImplVersionPurgeTaskProperties versionpurgeMaxVersions(@Nullable ConfigNodePropertyInteger versionpurgeMaxVersions) {
    this.versionpurgeMaxVersions = versionpurgeMaxVersions;
    return this;
  }

  /**
   * Get versionpurgeMaxVersions
   * @return versionpurgeMaxVersions
   */
  @Valid 
  @Schema(name = "versionpurge.maxVersions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionpurge.maxVersions")
  public @Nullable ConfigNodePropertyInteger getVersionpurgeMaxVersions() {
    return versionpurgeMaxVersions;
  }

  @JsonProperty("versionpurge.maxVersions")
  public void setVersionpurgeMaxVersions(@Nullable ConfigNodePropertyInteger versionpurgeMaxVersions) {
    this.versionpurgeMaxVersions = versionpurgeMaxVersions;
  }

  public ComDayCqWcmCoreImplVersionPurgeTaskProperties versionpurgeMinVersions(@Nullable ConfigNodePropertyInteger versionpurgeMinVersions) {
    this.versionpurgeMinVersions = versionpurgeMinVersions;
    return this;
  }

  /**
   * Get versionpurgeMinVersions
   * @return versionpurgeMinVersions
   */
  @Valid 
  @Schema(name = "versionpurge.minVersions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionpurge.minVersions")
  public @Nullable ConfigNodePropertyInteger getVersionpurgeMinVersions() {
    return versionpurgeMinVersions;
  }

  @JsonProperty("versionpurge.minVersions")
  public void setVersionpurgeMinVersions(@Nullable ConfigNodePropertyInteger versionpurgeMinVersions) {
    this.versionpurgeMinVersions = versionpurgeMinVersions;
  }

  public ComDayCqWcmCoreImplVersionPurgeTaskProperties versionpurgeMaxAgeDays(@Nullable ConfigNodePropertyInteger versionpurgeMaxAgeDays) {
    this.versionpurgeMaxAgeDays = versionpurgeMaxAgeDays;
    return this;
  }

  /**
   * Get versionpurgeMaxAgeDays
   * @return versionpurgeMaxAgeDays
   */
  @Valid 
  @Schema(name = "versionpurge.maxAgeDays", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionpurge.maxAgeDays")
  public @Nullable ConfigNodePropertyInteger getVersionpurgeMaxAgeDays() {
    return versionpurgeMaxAgeDays;
  }

  @JsonProperty("versionpurge.maxAgeDays")
  public void setVersionpurgeMaxAgeDays(@Nullable ConfigNodePropertyInteger versionpurgeMaxAgeDays) {
    this.versionpurgeMaxAgeDays = versionpurgeMaxAgeDays;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplVersionPurgeTaskProperties comDayCqWcmCoreImplVersionPurgeTaskProperties = (ComDayCqWcmCoreImplVersionPurgeTaskProperties) o;
    return Objects.equals(this.versionpurgePaths, comDayCqWcmCoreImplVersionPurgeTaskProperties.versionpurgePaths) &&
        Objects.equals(this.versionpurgeRecursive, comDayCqWcmCoreImplVersionPurgeTaskProperties.versionpurgeRecursive) &&
        Objects.equals(this.versionpurgeMaxVersions, comDayCqWcmCoreImplVersionPurgeTaskProperties.versionpurgeMaxVersions) &&
        Objects.equals(this.versionpurgeMinVersions, comDayCqWcmCoreImplVersionPurgeTaskProperties.versionpurgeMinVersions) &&
        Objects.equals(this.versionpurgeMaxAgeDays, comDayCqWcmCoreImplVersionPurgeTaskProperties.versionpurgeMaxAgeDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionpurgePaths, versionpurgeRecursive, versionpurgeMaxVersions, versionpurgeMinVersions, versionpurgeMaxAgeDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplVersionPurgeTaskProperties {\n");
    sb.append("    versionpurgePaths: ").append(toIndentedString(versionpurgePaths)).append("\n");
    sb.append("    versionpurgeRecursive: ").append(toIndentedString(versionpurgeRecursive)).append("\n");
    sb.append("    versionpurgeMaxVersions: ").append(toIndentedString(versionpurgeMaxVersions)).append("\n");
    sb.append("    versionpurgeMinVersions: ").append(toIndentedString(versionpurgeMinVersions)).append("\n");
    sb.append("    versionpurgeMaxAgeDays: ").append(toIndentedString(versionpurgeMaxAgeDays)).append("\n");
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

