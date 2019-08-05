package apimodels;

import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingCommonsMetricsInternalLogReporterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingCommonsMetricsInternalLogReporterProperties   {
  @JsonProperty("period")
  private ConfigNodePropertyInteger period = null;

  @JsonProperty("timeUnit")
  private ConfigNodePropertyDropDown timeUnit = null;

  @JsonProperty("level")
  private ConfigNodePropertyDropDown level = null;

  @JsonProperty("loggerName")
  private ConfigNodePropertyString loggerName = null;

  @JsonProperty("prefix")
  private ConfigNodePropertyString prefix = null;

  @JsonProperty("pattern")
  private ConfigNodePropertyString pattern = null;

  @JsonProperty("registryName")
  private ConfigNodePropertyString registryName = null;

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties period(ConfigNodePropertyInteger period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
  public ConfigNodePropertyString getRegistryName() {
    return registryName;
  }

  public void setRegistryName(ConfigNodePropertyString registryName) {
    this.registryName = registryName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

