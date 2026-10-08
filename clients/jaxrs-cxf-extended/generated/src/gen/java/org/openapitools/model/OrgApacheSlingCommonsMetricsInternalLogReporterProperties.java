package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingCommonsMetricsInternalLogReporterProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger period;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown timeUnit;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown level;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString loggerName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString prefix;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString pattern;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString registryName;
 /**
  * Get period
  * @return period
  */
  @JsonProperty("period")
  public ConfigNodePropertyInteger getPeriod() {
    return period;
  }

  /**
   * Sets the <code>period</code> property.
   */
 public void setPeriod(ConfigNodePropertyInteger period) {
    this.period = period;
  }

  /**
   * Sets the <code>period</code> property.
   */
  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties period(ConfigNodePropertyInteger period) {
    this.period = period;
    return this;
  }

 /**
  * Get timeUnit
  * @return timeUnit
  */
  @JsonProperty("timeUnit")
  public ConfigNodePropertyDropDown getTimeUnit() {
    return timeUnit;
  }

  /**
   * Sets the <code>timeUnit</code> property.
   */
 public void setTimeUnit(ConfigNodePropertyDropDown timeUnit) {
    this.timeUnit = timeUnit;
  }

  /**
   * Sets the <code>timeUnit</code> property.
   */
  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties timeUnit(ConfigNodePropertyDropDown timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

 /**
  * Get level
  * @return level
  */
  @JsonProperty("level")
  public ConfigNodePropertyDropDown getLevel() {
    return level;
  }

  /**
   * Sets the <code>level</code> property.
   */
 public void setLevel(ConfigNodePropertyDropDown level) {
    this.level = level;
  }

  /**
   * Sets the <code>level</code> property.
   */
  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties level(ConfigNodePropertyDropDown level) {
    this.level = level;
    return this;
  }

 /**
  * Get loggerName
  * @return loggerName
  */
  @JsonProperty("loggerName")
  public ConfigNodePropertyString getLoggerName() {
    return loggerName;
  }

  /**
   * Sets the <code>loggerName</code> property.
   */
 public void setLoggerName(ConfigNodePropertyString loggerName) {
    this.loggerName = loggerName;
  }

  /**
   * Sets the <code>loggerName</code> property.
   */
  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties loggerName(ConfigNodePropertyString loggerName) {
    this.loggerName = loggerName;
    return this;
  }

 /**
  * Get prefix
  * @return prefix
  */
  @JsonProperty("prefix")
  public ConfigNodePropertyString getPrefix() {
    return prefix;
  }

  /**
   * Sets the <code>prefix</code> property.
   */
 public void setPrefix(ConfigNodePropertyString prefix) {
    this.prefix = prefix;
  }

  /**
   * Sets the <code>prefix</code> property.
   */
  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties prefix(ConfigNodePropertyString prefix) {
    this.prefix = prefix;
    return this;
  }

 /**
  * Get pattern
  * @return pattern
  */
  @JsonProperty("pattern")
  public ConfigNodePropertyString getPattern() {
    return pattern;
  }

  /**
   * Sets the <code>pattern</code> property.
   */
 public void setPattern(ConfigNodePropertyString pattern) {
    this.pattern = pattern;
  }

  /**
   * Sets the <code>pattern</code> property.
   */
  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties pattern(ConfigNodePropertyString pattern) {
    this.pattern = pattern;
    return this;
  }

 /**
  * Get registryName
  * @return registryName
  */
  @JsonProperty("registryName")
  public ConfigNodePropertyString getRegistryName() {
    return registryName;
  }

  /**
   * Sets the <code>registryName</code> property.
   */
 public void setRegistryName(ConfigNodePropertyString registryName) {
    this.registryName = registryName;
  }

  /**
   * Sets the <code>registryName</code> property.
   */
  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties registryName(ConfigNodePropertyString registryName) {
    this.registryName = registryName;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

