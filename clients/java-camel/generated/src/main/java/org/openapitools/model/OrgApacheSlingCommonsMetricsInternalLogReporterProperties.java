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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingCommonsMetricsInternalLogReporterProperties {

  private ConfigNodePropertyInteger period;

  private ConfigNodePropertyDropDown timeUnit;

  private ConfigNodePropertyDropDown level;

  private ConfigNodePropertyString loggerName;

  private ConfigNodePropertyString prefix;

  private ConfigNodePropertyString pattern;

  private ConfigNodePropertyString registryName;

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties period(ConfigNodePropertyInteger period) {
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
  public ConfigNodePropertyInteger getPeriod() {
    return period;
  }

  public void setPeriod(ConfigNodePropertyInteger period) {
    this.period = period;
  }

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties timeUnit(ConfigNodePropertyDropDown timeUnit) {
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
  public ConfigNodePropertyDropDown getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(ConfigNodePropertyDropDown timeUnit) {
    this.timeUnit = timeUnit;
  }

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties level(ConfigNodePropertyDropDown level) {
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
  public ConfigNodePropertyDropDown getLevel() {
    return level;
  }

  public void setLevel(ConfigNodePropertyDropDown level) {
    this.level = level;
  }

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties loggerName(ConfigNodePropertyString loggerName) {
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
  public ConfigNodePropertyString getLoggerName() {
    return loggerName;
  }

  public void setLoggerName(ConfigNodePropertyString loggerName) {
    this.loggerName = loggerName;
  }

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties prefix(ConfigNodePropertyString prefix) {
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
  public ConfigNodePropertyString getPrefix() {
    return prefix;
  }

  public void setPrefix(ConfigNodePropertyString prefix) {
    this.prefix = prefix;
  }

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties pattern(ConfigNodePropertyString pattern) {
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
  public ConfigNodePropertyString getPattern() {
    return pattern;
  }

  public void setPattern(ConfigNodePropertyString pattern) {
    this.pattern = pattern;
  }

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties registryName(ConfigNodePropertyString registryName) {
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
  public ConfigNodePropertyString getRegistryName() {
    return registryName;
  }

  public void setRegistryName(ConfigNodePropertyString registryName) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

