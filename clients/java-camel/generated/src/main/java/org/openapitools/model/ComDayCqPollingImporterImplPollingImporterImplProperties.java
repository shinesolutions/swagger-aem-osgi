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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqPollingImporterImplPollingImporterImplProperties {

  private ConfigNodePropertyInteger importerMinInterval;

  private ConfigNodePropertyString importerUser;

  private ConfigNodePropertyArray excludePaths;

  private ConfigNodePropertyArray includePaths;

  public ComDayCqPollingImporterImplPollingImporterImplProperties importerMinInterval(ConfigNodePropertyInteger importerMinInterval) {
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
  public ConfigNodePropertyInteger getImporterMinInterval() {
    return importerMinInterval;
  }

  public void setImporterMinInterval(ConfigNodePropertyInteger importerMinInterval) {
    this.importerMinInterval = importerMinInterval;
  }

  public ComDayCqPollingImporterImplPollingImporterImplProperties importerUser(ConfigNodePropertyString importerUser) {
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
  public ConfigNodePropertyString getImporterUser() {
    return importerUser;
  }

  public void setImporterUser(ConfigNodePropertyString importerUser) {
    this.importerUser = importerUser;
  }

  public ComDayCqPollingImporterImplPollingImporterImplProperties excludePaths(ConfigNodePropertyArray excludePaths) {
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
  public ConfigNodePropertyArray getExcludePaths() {
    return excludePaths;
  }

  public void setExcludePaths(ConfigNodePropertyArray excludePaths) {
    this.excludePaths = excludePaths;
  }

  public ComDayCqPollingImporterImplPollingImporterImplProperties includePaths(ConfigNodePropertyArray includePaths) {
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
  public ConfigNodePropertyArray getIncludePaths() {
    return includePaths;
  }

  public void setIncludePaths(ConfigNodePropertyArray includePaths) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

