package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComDayCqStatisticsImplStatisticsServiceImplProperties
 */

@JsonTypeName("comDayCqStatisticsImplStatisticsServiceImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqStatisticsImplStatisticsServiceImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger schedulerPeriod;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean schedulerConcurrent;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString path;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString workspace;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString keywordsPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean asyncEntries;

  public ComDayCqStatisticsImplStatisticsServiceImplProperties schedulerPeriod(@Nullable ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
    return this;
  }

  /**
   * Get schedulerPeriod
   * @return schedulerPeriod
   */
  @Valid 
  @Schema(name = "scheduler.period", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduler.period")
  public @Nullable ConfigNodePropertyInteger getSchedulerPeriod() {
    return schedulerPeriod;
  }

  @JsonProperty("scheduler.period")
  public void setSchedulerPeriod(@Nullable ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
  }

  public ComDayCqStatisticsImplStatisticsServiceImplProperties schedulerConcurrent(@Nullable ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
    return this;
  }

  /**
   * Get schedulerConcurrent
   * @return schedulerConcurrent
   */
  @Valid 
  @Schema(name = "scheduler.concurrent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduler.concurrent")
  public @Nullable ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }

  @JsonProperty("scheduler.concurrent")
  public void setSchedulerConcurrent(@Nullable ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }

  public ComDayCqStatisticsImplStatisticsServiceImplProperties path(@Nullable ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
   */
  @Valid 
  @Schema(name = "path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path")
  public @Nullable ConfigNodePropertyString getPath() {
    return path;
  }

  @JsonProperty("path")
  public void setPath(@Nullable ConfigNodePropertyString path) {
    this.path = path;
  }

  public ComDayCqStatisticsImplStatisticsServiceImplProperties workspace(@Nullable ConfigNodePropertyString workspace) {
    this.workspace = workspace;
    return this;
  }

  /**
   * Get workspace
   * @return workspace
   */
  @Valid 
  @Schema(name = "workspace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workspace")
  public @Nullable ConfigNodePropertyString getWorkspace() {
    return workspace;
  }

  @JsonProperty("workspace")
  public void setWorkspace(@Nullable ConfigNodePropertyString workspace) {
    this.workspace = workspace;
  }

  public ComDayCqStatisticsImplStatisticsServiceImplProperties keywordsPath(@Nullable ConfigNodePropertyString keywordsPath) {
    this.keywordsPath = keywordsPath;
    return this;
  }

  /**
   * Get keywordsPath
   * @return keywordsPath
   */
  @Valid 
  @Schema(name = "keywordsPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keywordsPath")
  public @Nullable ConfigNodePropertyString getKeywordsPath() {
    return keywordsPath;
  }

  @JsonProperty("keywordsPath")
  public void setKeywordsPath(@Nullable ConfigNodePropertyString keywordsPath) {
    this.keywordsPath = keywordsPath;
  }

  public ComDayCqStatisticsImplStatisticsServiceImplProperties asyncEntries(@Nullable ConfigNodePropertyBoolean asyncEntries) {
    this.asyncEntries = asyncEntries;
    return this;
  }

  /**
   * Get asyncEntries
   * @return asyncEntries
   */
  @Valid 
  @Schema(name = "asyncEntries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asyncEntries")
  public @Nullable ConfigNodePropertyBoolean getAsyncEntries() {
    return asyncEntries;
  }

  @JsonProperty("asyncEntries")
  public void setAsyncEntries(@Nullable ConfigNodePropertyBoolean asyncEntries) {
    this.asyncEntries = asyncEntries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqStatisticsImplStatisticsServiceImplProperties comDayCqStatisticsImplStatisticsServiceImplProperties = (ComDayCqStatisticsImplStatisticsServiceImplProperties) o;
    return Objects.equals(this.schedulerPeriod, comDayCqStatisticsImplStatisticsServiceImplProperties.schedulerPeriod) &&
        Objects.equals(this.schedulerConcurrent, comDayCqStatisticsImplStatisticsServiceImplProperties.schedulerConcurrent) &&
        Objects.equals(this.path, comDayCqStatisticsImplStatisticsServiceImplProperties.path) &&
        Objects.equals(this.workspace, comDayCqStatisticsImplStatisticsServiceImplProperties.workspace) &&
        Objects.equals(this.keywordsPath, comDayCqStatisticsImplStatisticsServiceImplProperties.keywordsPath) &&
        Objects.equals(this.asyncEntries, comDayCqStatisticsImplStatisticsServiceImplProperties.asyncEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedulerPeriod, schedulerConcurrent, path, workspace, keywordsPath, asyncEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqStatisticsImplStatisticsServiceImplProperties {\n");
    sb.append("    schedulerPeriod: ").append(toIndentedString(schedulerPeriod)).append("\n");
    sb.append("    schedulerConcurrent: ").append(toIndentedString(schedulerConcurrent)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    keywordsPath: ").append(toIndentedString(keywordsPath)).append("\n");
    sb.append("    asyncEntries: ").append(toIndentedString(asyncEntries)).append("\n");
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

