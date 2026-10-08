package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqPollingImporterImplPollingImporterImplProperties
 */

@JsonTypeName("comDayCqPollingImporterImplPollingImporterImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqPollingImporterImplPollingImporterImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger importerMinInterval;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString importerUser;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray excludePaths;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray includePaths;

  public ComDayCqPollingImporterImplPollingImporterImplProperties importerMinInterval(@Nullable ConfigNodePropertyInteger importerMinInterval) {
    this.importerMinInterval = importerMinInterval;
    return this;
  }

  /**
   * Get importerMinInterval
   * @return importerMinInterval
   */
  @Valid 
  @Schema(name = "importer.min.interval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("importer.min.interval")
  public @Nullable ConfigNodePropertyInteger getImporterMinInterval() {
    return importerMinInterval;
  }

  @JsonProperty("importer.min.interval")
  public void setImporterMinInterval(@Nullable ConfigNodePropertyInteger importerMinInterval) {
    this.importerMinInterval = importerMinInterval;
  }

  public ComDayCqPollingImporterImplPollingImporterImplProperties importerUser(@Nullable ConfigNodePropertyString importerUser) {
    this.importerUser = importerUser;
    return this;
  }

  /**
   * Get importerUser
   * @return importerUser
   */
  @Valid 
  @Schema(name = "importer.user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("importer.user")
  public @Nullable ConfigNodePropertyString getImporterUser() {
    return importerUser;
  }

  @JsonProperty("importer.user")
  public void setImporterUser(@Nullable ConfigNodePropertyString importerUser) {
    this.importerUser = importerUser;
  }

  public ComDayCqPollingImporterImplPollingImporterImplProperties excludePaths(@Nullable ConfigNodePropertyArray excludePaths) {
    this.excludePaths = excludePaths;
    return this;
  }

  /**
   * Get excludePaths
   * @return excludePaths
   */
  @Valid 
  @Schema(name = "exclude.paths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exclude.paths")
  public @Nullable ConfigNodePropertyArray getExcludePaths() {
    return excludePaths;
  }

  @JsonProperty("exclude.paths")
  public void setExcludePaths(@Nullable ConfigNodePropertyArray excludePaths) {
    this.excludePaths = excludePaths;
  }

  public ComDayCqPollingImporterImplPollingImporterImplProperties includePaths(@Nullable ConfigNodePropertyArray includePaths) {
    this.includePaths = includePaths;
    return this;
  }

  /**
   * Get includePaths
   * @return includePaths
   */
  @Valid 
  @Schema(name = "include.paths", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("include.paths")
  public @Nullable ConfigNodePropertyArray getIncludePaths() {
    return includePaths;
  }

  @JsonProperty("include.paths")
  public void setIncludePaths(@Nullable ConfigNodePropertyArray includePaths) {
    this.includePaths = includePaths;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqPollingImporterImplPollingImporterImplProperties comDayCqPollingImporterImplPollingImporterImplProperties = (ComDayCqPollingImporterImplPollingImporterImplProperties) o;
    return Objects.equals(this.importerMinInterval, comDayCqPollingImporterImplPollingImporterImplProperties.importerMinInterval) &&
        Objects.equals(this.importerUser, comDayCqPollingImporterImplPollingImporterImplProperties.importerUser) &&
        Objects.equals(this.excludePaths, comDayCqPollingImporterImplPollingImporterImplProperties.excludePaths) &&
        Objects.equals(this.includePaths, comDayCqPollingImporterImplPollingImporterImplProperties.includePaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importerMinInterval, importerUser, excludePaths, includePaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqPollingImporterImplPollingImporterImplProperties {\n");
    sb.append("    importerMinInterval: ").append(toIndentedString(importerMinInterval)).append("\n");
    sb.append("    importerUser: ").append(toIndentedString(importerUser)).append("\n");
    sb.append("    excludePaths: ").append(toIndentedString(excludePaths)).append("\n");
    sb.append("    includePaths: ").append(toIndentedString(includePaths)).append("\n");
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

