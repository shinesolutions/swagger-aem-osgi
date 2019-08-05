package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingCommonsMetricsInternalLogReporterProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger period = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown timeUnit = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown level = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString loggerName = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString prefix = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString pattern = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString registryName = null;
 /**
   * Get period
   * @return period
  **/
  @JsonProperty("period")
  public ConfigNodePropertyInteger getPeriod() {
    return period;
  }

  public void setPeriod(ConfigNodePropertyInteger period) {
    this.period = period;
  }

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties period(ConfigNodePropertyInteger period) {
    this.period = period;
    return this;
  }

 /**
   * Get timeUnit
   * @return timeUnit
  **/
  @JsonProperty("timeUnit")
  public ConfigNodePropertyDropDown getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(ConfigNodePropertyDropDown timeUnit) {
    this.timeUnit = timeUnit;
  }

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties timeUnit(ConfigNodePropertyDropDown timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

 /**
   * Get level
   * @return level
  **/
  @JsonProperty("level")
  public ConfigNodePropertyDropDown getLevel() {
    return level;
  }

  public void setLevel(ConfigNodePropertyDropDown level) {
    this.level = level;
  }

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties level(ConfigNodePropertyDropDown level) {
    this.level = level;
    return this;
  }

 /**
   * Get loggerName
   * @return loggerName
  **/
  @JsonProperty("loggerName")
  public ConfigNodePropertyString getLoggerName() {
    return loggerName;
  }

  public void setLoggerName(ConfigNodePropertyString loggerName) {
    this.loggerName = loggerName;
  }

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties loggerName(ConfigNodePropertyString loggerName) {
    this.loggerName = loggerName;
    return this;
  }

 /**
   * Get prefix
   * @return prefix
  **/
  @JsonProperty("prefix")
  public ConfigNodePropertyString getPrefix() {
    return prefix;
  }

  public void setPrefix(ConfigNodePropertyString prefix) {
    this.prefix = prefix;
  }

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties prefix(ConfigNodePropertyString prefix) {
    this.prefix = prefix;
    return this;
  }

 /**
   * Get pattern
   * @return pattern
  **/
  @JsonProperty("pattern")
  public ConfigNodePropertyString getPattern() {
    return pattern;
  }

  public void setPattern(ConfigNodePropertyString pattern) {
    this.pattern = pattern;
  }

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties pattern(ConfigNodePropertyString pattern) {
    this.pattern = pattern;
    return this;
  }

 /**
   * Get registryName
   * @return registryName
  **/
  @JsonProperty("registryName")
  public ConfigNodePropertyString getRegistryName() {
    return registryName;
  }

  public void setRegistryName(ConfigNodePropertyString registryName) {
    this.registryName = registryName;
  }

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties registryName(ConfigNodePropertyString registryName) {
    this.registryName = registryName;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

