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
 * ComDayCqWcmCoreImplVersionManagerImplProperties
 */

@JsonTypeName("comDayCqWcmCoreImplVersionManagerImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplVersionManagerImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean versionmanagerCreateVersionOnActivation;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean versionmanagerPurgingEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray versionmanagerPurgePaths;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray versionmanagerIvPaths;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger versionmanagerMaxAgeDays;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger versionmanagerMaxNumberVersions;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger versionmanagerMinNumberVersions;

  public ComDayCqWcmCoreImplVersionManagerImplProperties versionmanagerCreateVersionOnActivation(@Nullable ConfigNodePropertyBoolean versionmanagerCreateVersionOnActivation) {
    this.versionmanagerCreateVersionOnActivation = versionmanagerCreateVersionOnActivation;
    return this;
  }

  /**
   * Get versionmanagerCreateVersionOnActivation
   * @return versionmanagerCreateVersionOnActivation
   */
  @Valid 
  @Schema(name = "versionmanager.createVersionOnActivation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionmanager.createVersionOnActivation")
  public @Nullable ConfigNodePropertyBoolean getVersionmanagerCreateVersionOnActivation() {
    return versionmanagerCreateVersionOnActivation;
  }

  @JsonProperty("versionmanager.createVersionOnActivation")
  public void setVersionmanagerCreateVersionOnActivation(@Nullable ConfigNodePropertyBoolean versionmanagerCreateVersionOnActivation) {
    this.versionmanagerCreateVersionOnActivation = versionmanagerCreateVersionOnActivation;
  }

  public ComDayCqWcmCoreImplVersionManagerImplProperties versionmanagerPurgingEnabled(@Nullable ConfigNodePropertyBoolean versionmanagerPurgingEnabled) {
    this.versionmanagerPurgingEnabled = versionmanagerPurgingEnabled;
    return this;
  }

  /**
   * Get versionmanagerPurgingEnabled
   * @return versionmanagerPurgingEnabled
   */
  @Valid 
  @Schema(name = "versionmanager.purgingEnabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionmanager.purgingEnabled")
  public @Nullable ConfigNodePropertyBoolean getVersionmanagerPurgingEnabled() {
    return versionmanagerPurgingEnabled;
  }

  @JsonProperty("versionmanager.purgingEnabled")
  public void setVersionmanagerPurgingEnabled(@Nullable ConfigNodePropertyBoolean versionmanagerPurgingEnabled) {
    this.versionmanagerPurgingEnabled = versionmanagerPurgingEnabled;
  }

  public ComDayCqWcmCoreImplVersionManagerImplProperties versionmanagerPurgePaths(@Nullable ConfigNodePropertyArray versionmanagerPurgePaths) {
    this.versionmanagerPurgePaths = versionmanagerPurgePaths;
    return this;
  }

  /**
   * Get versionmanagerPurgePaths
   * @return versionmanagerPurgePaths
   */
  @Valid 
  @Schema(name = "versionmanager.purgePaths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionmanager.purgePaths")
  public @Nullable ConfigNodePropertyArray getVersionmanagerPurgePaths() {
    return versionmanagerPurgePaths;
  }

  @JsonProperty("versionmanager.purgePaths")
  public void setVersionmanagerPurgePaths(@Nullable ConfigNodePropertyArray versionmanagerPurgePaths) {
    this.versionmanagerPurgePaths = versionmanagerPurgePaths;
  }

  public ComDayCqWcmCoreImplVersionManagerImplProperties versionmanagerIvPaths(@Nullable ConfigNodePropertyArray versionmanagerIvPaths) {
    this.versionmanagerIvPaths = versionmanagerIvPaths;
    return this;
  }

  /**
   * Get versionmanagerIvPaths
   * @return versionmanagerIvPaths
   */
  @Valid 
  @Schema(name = "versionmanager.ivPaths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionmanager.ivPaths")
  public @Nullable ConfigNodePropertyArray getVersionmanagerIvPaths() {
    return versionmanagerIvPaths;
  }

  @JsonProperty("versionmanager.ivPaths")
  public void setVersionmanagerIvPaths(@Nullable ConfigNodePropertyArray versionmanagerIvPaths) {
    this.versionmanagerIvPaths = versionmanagerIvPaths;
  }

  public ComDayCqWcmCoreImplVersionManagerImplProperties versionmanagerMaxAgeDays(@Nullable ConfigNodePropertyInteger versionmanagerMaxAgeDays) {
    this.versionmanagerMaxAgeDays = versionmanagerMaxAgeDays;
    return this;
  }

  /**
   * Get versionmanagerMaxAgeDays
   * @return versionmanagerMaxAgeDays
   */
  @Valid 
  @Schema(name = "versionmanager.maxAgeDays", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionmanager.maxAgeDays")
  public @Nullable ConfigNodePropertyInteger getVersionmanagerMaxAgeDays() {
    return versionmanagerMaxAgeDays;
  }

  @JsonProperty("versionmanager.maxAgeDays")
  public void setVersionmanagerMaxAgeDays(@Nullable ConfigNodePropertyInteger versionmanagerMaxAgeDays) {
    this.versionmanagerMaxAgeDays = versionmanagerMaxAgeDays;
  }

  public ComDayCqWcmCoreImplVersionManagerImplProperties versionmanagerMaxNumberVersions(@Nullable ConfigNodePropertyInteger versionmanagerMaxNumberVersions) {
    this.versionmanagerMaxNumberVersions = versionmanagerMaxNumberVersions;
    return this;
  }

  /**
   * Get versionmanagerMaxNumberVersions
   * @return versionmanagerMaxNumberVersions
   */
  @Valid 
  @Schema(name = "versionmanager.maxNumberVersions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionmanager.maxNumberVersions")
  public @Nullable ConfigNodePropertyInteger getVersionmanagerMaxNumberVersions() {
    return versionmanagerMaxNumberVersions;
  }

  @JsonProperty("versionmanager.maxNumberVersions")
  public void setVersionmanagerMaxNumberVersions(@Nullable ConfigNodePropertyInteger versionmanagerMaxNumberVersions) {
    this.versionmanagerMaxNumberVersions = versionmanagerMaxNumberVersions;
  }

  public ComDayCqWcmCoreImplVersionManagerImplProperties versionmanagerMinNumberVersions(@Nullable ConfigNodePropertyInteger versionmanagerMinNumberVersions) {
    this.versionmanagerMinNumberVersions = versionmanagerMinNumberVersions;
    return this;
  }

  /**
   * Get versionmanagerMinNumberVersions
   * @return versionmanagerMinNumberVersions
   */
  @Valid 
  @Schema(name = "versionmanager.minNumberVersions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionmanager.minNumberVersions")
  public @Nullable ConfigNodePropertyInteger getVersionmanagerMinNumberVersions() {
    return versionmanagerMinNumberVersions;
  }

  @JsonProperty("versionmanager.minNumberVersions")
  public void setVersionmanagerMinNumberVersions(@Nullable ConfigNodePropertyInteger versionmanagerMinNumberVersions) {
    this.versionmanagerMinNumberVersions = versionmanagerMinNumberVersions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplVersionManagerImplProperties comDayCqWcmCoreImplVersionManagerImplProperties = (ComDayCqWcmCoreImplVersionManagerImplProperties) o;
    return Objects.equals(this.versionmanagerCreateVersionOnActivation, comDayCqWcmCoreImplVersionManagerImplProperties.versionmanagerCreateVersionOnActivation) &&
        Objects.equals(this.versionmanagerPurgingEnabled, comDayCqWcmCoreImplVersionManagerImplProperties.versionmanagerPurgingEnabled) &&
        Objects.equals(this.versionmanagerPurgePaths, comDayCqWcmCoreImplVersionManagerImplProperties.versionmanagerPurgePaths) &&
        Objects.equals(this.versionmanagerIvPaths, comDayCqWcmCoreImplVersionManagerImplProperties.versionmanagerIvPaths) &&
        Objects.equals(this.versionmanagerMaxAgeDays, comDayCqWcmCoreImplVersionManagerImplProperties.versionmanagerMaxAgeDays) &&
        Objects.equals(this.versionmanagerMaxNumberVersions, comDayCqWcmCoreImplVersionManagerImplProperties.versionmanagerMaxNumberVersions) &&
        Objects.equals(this.versionmanagerMinNumberVersions, comDayCqWcmCoreImplVersionManagerImplProperties.versionmanagerMinNumberVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionmanagerCreateVersionOnActivation, versionmanagerPurgingEnabled, versionmanagerPurgePaths, versionmanagerIvPaths, versionmanagerMaxAgeDays, versionmanagerMaxNumberVersions, versionmanagerMinNumberVersions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplVersionManagerImplProperties {\n");
    sb.append("    versionmanagerCreateVersionOnActivation: ").append(toIndentedString(versionmanagerCreateVersionOnActivation)).append("\n");
    sb.append("    versionmanagerPurgingEnabled: ").append(toIndentedString(versionmanagerPurgingEnabled)).append("\n");
    sb.append("    versionmanagerPurgePaths: ").append(toIndentedString(versionmanagerPurgePaths)).append("\n");
    sb.append("    versionmanagerIvPaths: ").append(toIndentedString(versionmanagerIvPaths)).append("\n");
    sb.append("    versionmanagerMaxAgeDays: ").append(toIndentedString(versionmanagerMaxAgeDays)).append("\n");
    sb.append("    versionmanagerMaxNumberVersions: ").append(toIndentedString(versionmanagerMaxNumberVersions)).append("\n");
    sb.append("    versionmanagerMinNumberVersions: ").append(toIndentedString(versionmanagerMinNumberVersions)).append("\n");
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

