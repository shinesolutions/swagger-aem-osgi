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
 * OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties
 */

@JsonTypeName("orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray datasources;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger step;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray archives;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString path;

  public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties datasources(@Nullable ConfigNodePropertyArray datasources) {
    this.datasources = datasources;
    return this;
  }

  /**
   * Get datasources
   * @return datasources
   */
  @Valid 
  @Schema(name = "datasources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("datasources")
  public @Nullable ConfigNodePropertyArray getDatasources() {
    return datasources;
  }

  @JsonProperty("datasources")
  public void setDatasources(@Nullable ConfigNodePropertyArray datasources) {
    this.datasources = datasources;
  }

  public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties step(@Nullable ConfigNodePropertyInteger step) {
    this.step = step;
    return this;
  }

  /**
   * Get step
   * @return step
   */
  @Valid 
  @Schema(name = "step", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("step")
  public @Nullable ConfigNodePropertyInteger getStep() {
    return step;
  }

  @JsonProperty("step")
  public void setStep(@Nullable ConfigNodePropertyInteger step) {
    this.step = step;
  }

  public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties archives(@Nullable ConfigNodePropertyArray archives) {
    this.archives = archives;
    return this;
  }

  /**
   * Get archives
   * @return archives
   */
  @Valid 
  @Schema(name = "archives", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("archives")
  public @Nullable ConfigNodePropertyArray getArchives() {
    return archives;
  }

  @JsonProperty("archives")
  public void setArchives(@Nullable ConfigNodePropertyArray archives) {
    this.archives = archives;
  }

  public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties path(@Nullable ConfigNodePropertyString path) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties = (OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties) o;
    return Objects.equals(this.datasources, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.datasources) &&
        Objects.equals(this.step, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.step) &&
        Objects.equals(this.archives, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.archives) &&
        Objects.equals(this.path, orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasources, step, archives, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties {\n");
    sb.append("    datasources: ").append(toIndentedString(datasources)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    archives: ").append(toIndentedString(archives)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

