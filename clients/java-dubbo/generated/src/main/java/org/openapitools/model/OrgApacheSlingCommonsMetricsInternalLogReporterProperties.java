package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingCommonsMetricsInternalLogReporterProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("period")
  private ConfigNodePropertyInteger period;

  @JsonProperty("timeUnit")
  private ConfigNodePropertyDropDown timeUnit;

  @JsonProperty("level")
  private ConfigNodePropertyDropDown level;

  @JsonProperty("loggerName")
  private ConfigNodePropertyString loggerName;

  @JsonProperty("prefix")
  private ConfigNodePropertyString prefix;

  @JsonProperty("pattern")
  private ConfigNodePropertyString pattern;

  @JsonProperty("registryName")
  private ConfigNodePropertyString registryName;

  /**
   * 
   * @return period
   */
  public ConfigNodePropertyInteger getPeriod() {
    return period;
  }

  public void setPeriod(ConfigNodePropertyInteger period) {
    this.period = period;
  }

  /**
   * 
   * @return timeUnit
   */
  public ConfigNodePropertyDropDown getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(ConfigNodePropertyDropDown timeUnit) {
    this.timeUnit = timeUnit;
  }

  /**
   * 
   * @return level
   */
  public ConfigNodePropertyDropDown getLevel() {
    return level;
  }

  public void setLevel(ConfigNodePropertyDropDown level) {
    this.level = level;
  }

  /**
   * 
   * @return loggerName
   */
  public ConfigNodePropertyString getLoggerName() {
    return loggerName;
  }

  public void setLoggerName(ConfigNodePropertyString loggerName) {
    this.loggerName = loggerName;
  }

  /**
   * 
   * @return prefix
   */
  public ConfigNodePropertyString getPrefix() {
    return prefix;
  }

  public void setPrefix(ConfigNodePropertyString prefix) {
    this.prefix = prefix;
  }

  /**
   * 
   * @return pattern
   */
  public ConfigNodePropertyString getPattern() {
    return pattern;
  }

  public void setPattern(ConfigNodePropertyString pattern) {
    this.pattern = pattern;
  }

  /**
   * 
   * @return registryName
   */
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
