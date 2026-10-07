package apimodels;

import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheSlingCommonsMetricsInternalLogReporterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingCommonsMetricsInternalLogReporterProperties   {
  @JsonProperty("period")
  @Valid

  private ConfigNodePropertyInteger period;

  @JsonProperty("timeUnit")
  @Valid

  private ConfigNodePropertyDropDown timeUnit;

  @JsonProperty("level")
  @Valid

  private ConfigNodePropertyDropDown level;

  @JsonProperty("loggerName")
  @Valid

  private ConfigNodePropertyString loggerName;

  @JsonProperty("prefix")
  @Valid

  private ConfigNodePropertyString prefix;

  @JsonProperty("pattern")
  @Valid

  private ConfigNodePropertyString pattern;

  @JsonProperty("registryName")
  @Valid

  private ConfigNodePropertyString registryName;

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties period(ConfigNodePropertyInteger period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(period, orgApacheSlingCommonsMetricsInternalLogReporterProperties.period) &&
        Objects.equals(timeUnit, orgApacheSlingCommonsMetricsInternalLogReporterProperties.timeUnit) &&
        Objects.equals(level, orgApacheSlingCommonsMetricsInternalLogReporterProperties.level) &&
        Objects.equals(loggerName, orgApacheSlingCommonsMetricsInternalLogReporterProperties.loggerName) &&
        Objects.equals(prefix, orgApacheSlingCommonsMetricsInternalLogReporterProperties.prefix) &&
        Objects.equals(pattern, orgApacheSlingCommonsMetricsInternalLogReporterProperties.pattern) &&
        Objects.equals(registryName, orgApacheSlingCommonsMetricsInternalLogReporterProperties.registryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, timeUnit, level, loggerName, prefix, pattern, registryName);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

