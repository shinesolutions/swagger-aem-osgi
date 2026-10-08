package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyDropDown;
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
 * OrgApacheSlingCommonsMetricsInternalLogReporterProperties
 */

@JsonTypeName("orgApacheSlingCommonsMetricsInternalLogReporterProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingCommonsMetricsInternalLogReporterProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger period;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown timeUnit;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown level;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString loggerName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString prefix;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString pattern;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString registryName;

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties period(@Nullable ConfigNodePropertyInteger period) {
    this.period = period;
    return this;
  }

  /**
   * Get period
   * @return period
   */
  @Valid 
  @Schema(name = "period", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("period")
  public @Nullable ConfigNodePropertyInteger getPeriod() {
    return period;
  }

  @JsonProperty("period")
  public void setPeriod(@Nullable ConfigNodePropertyInteger period) {
    this.period = period;
  }

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties timeUnit(@Nullable ConfigNodePropertyDropDown timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

  /**
   * Get timeUnit
   * @return timeUnit
   */
  @Valid 
  @Schema(name = "timeUnit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeUnit")
  public @Nullable ConfigNodePropertyDropDown getTimeUnit() {
    return timeUnit;
  }

  @JsonProperty("timeUnit")
  public void setTimeUnit(@Nullable ConfigNodePropertyDropDown timeUnit) {
    this.timeUnit = timeUnit;
  }

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties level(@Nullable ConfigNodePropertyDropDown level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
   */
  @Valid 
  @Schema(name = "level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("level")
  public @Nullable ConfigNodePropertyDropDown getLevel() {
    return level;
  }

  @JsonProperty("level")
  public void setLevel(@Nullable ConfigNodePropertyDropDown level) {
    this.level = level;
  }

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties loggerName(@Nullable ConfigNodePropertyString loggerName) {
    this.loggerName = loggerName;
    return this;
  }

  /**
   * Get loggerName
   * @return loggerName
   */
  @Valid 
  @Schema(name = "loggerName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("loggerName")
  public @Nullable ConfigNodePropertyString getLoggerName() {
    return loggerName;
  }

  @JsonProperty("loggerName")
  public void setLoggerName(@Nullable ConfigNodePropertyString loggerName) {
    this.loggerName = loggerName;
  }

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties prefix(@Nullable ConfigNodePropertyString prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Get prefix
   * @return prefix
   */
  @Valid 
  @Schema(name = "prefix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prefix")
  public @Nullable ConfigNodePropertyString getPrefix() {
    return prefix;
  }

  @JsonProperty("prefix")
  public void setPrefix(@Nullable ConfigNodePropertyString prefix) {
    this.prefix = prefix;
  }

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties pattern(@Nullable ConfigNodePropertyString pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * Get pattern
   * @return pattern
   */
  @Valid 
  @Schema(name = "pattern", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pattern")
  public @Nullable ConfigNodePropertyString getPattern() {
    return pattern;
  }

  @JsonProperty("pattern")
  public void setPattern(@Nullable ConfigNodePropertyString pattern) {
    this.pattern = pattern;
  }

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties registryName(@Nullable ConfigNodePropertyString registryName) {
    this.registryName = registryName;
    return this;
  }

  /**
   * Get registryName
   * @return registryName
   */
  @Valid 
  @Schema(name = "registryName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registryName")
  public @Nullable ConfigNodePropertyString getRegistryName() {
    return registryName;
  }

  @JsonProperty("registryName")
  public void setRegistryName(@Nullable ConfigNodePropertyString registryName) {
    this.registryName = registryName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCommonsMetricsInternalLogReporterProperties orgApacheSlingCommonsMetricsInternalLogReporterProperties = (OrgApacheSlingCommonsMetricsInternalLogReporterProperties) o;
    return Objects.equals(this.period, orgApacheSlingCommonsMetricsInternalLogReporterProperties.period) &&
        Objects.equals(this.timeUnit, orgApacheSlingCommonsMetricsInternalLogReporterProperties.timeUnit) &&
        Objects.equals(this.level, orgApacheSlingCommonsMetricsInternalLogReporterProperties.level) &&
        Objects.equals(this.loggerName, orgApacheSlingCommonsMetricsInternalLogReporterProperties.loggerName) &&
        Objects.equals(this.prefix, orgApacheSlingCommonsMetricsInternalLogReporterProperties.prefix) &&
        Objects.equals(this.pattern, orgApacheSlingCommonsMetricsInternalLogReporterProperties.pattern) &&
        Objects.equals(this.registryName, orgApacheSlingCommonsMetricsInternalLogReporterProperties.registryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, timeUnit, level, loggerName, prefix, pattern, registryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCommonsMetricsInternalLogReporterProperties {\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    loggerName: ").append(toIndentedString(loggerName)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    registryName: ").append(toIndentedString(registryName)).append("\n");
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

