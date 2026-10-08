package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheSlingCommonsMetricsInternalLogReporterProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingCommonsMetricsInternalLogReporterProperties   {
  private ConfigNodePropertyInteger period;
  private ConfigNodePropertyDropDown timeUnit;
  private ConfigNodePropertyDropDown level;
  private ConfigNodePropertyString loggerName;
  private ConfigNodePropertyString prefix;
  private ConfigNodePropertyString pattern;
  private ConfigNodePropertyString registryName;

  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties() {
  }

  /**
   **/
  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties period(ConfigNodePropertyInteger period) {
    this.period = period;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("period")
  @Valid public ConfigNodePropertyInteger getPeriod() {
    return period;
  }

  @JsonProperty("period")
  public void setPeriod(ConfigNodePropertyInteger period) {
    this.period = period;
  }

  /**
   **/
  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties timeUnit(ConfigNodePropertyDropDown timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("timeUnit")
  @Valid public ConfigNodePropertyDropDown getTimeUnit() {
    return timeUnit;
  }

  @JsonProperty("timeUnit")
  public void setTimeUnit(ConfigNodePropertyDropDown timeUnit) {
    this.timeUnit = timeUnit;
  }

  /**
   **/
  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties level(ConfigNodePropertyDropDown level) {
    this.level = level;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("level")
  @Valid public ConfigNodePropertyDropDown getLevel() {
    return level;
  }

  @JsonProperty("level")
  public void setLevel(ConfigNodePropertyDropDown level) {
    this.level = level;
  }

  /**
   **/
  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties loggerName(ConfigNodePropertyString loggerName) {
    this.loggerName = loggerName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("loggerName")
  @Valid public ConfigNodePropertyString getLoggerName() {
    return loggerName;
  }

  @JsonProperty("loggerName")
  public void setLoggerName(ConfigNodePropertyString loggerName) {
    this.loggerName = loggerName;
  }

  /**
   **/
  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties prefix(ConfigNodePropertyString prefix) {
    this.prefix = prefix;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("prefix")
  @Valid public ConfigNodePropertyString getPrefix() {
    return prefix;
  }

  @JsonProperty("prefix")
  public void setPrefix(ConfigNodePropertyString prefix) {
    this.prefix = prefix;
  }

  /**
   **/
  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties pattern(ConfigNodePropertyString pattern) {
    this.pattern = pattern;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pattern")
  @Valid public ConfigNodePropertyString getPattern() {
    return pattern;
  }

  @JsonProperty("pattern")
  public void setPattern(ConfigNodePropertyString pattern) {
    this.pattern = pattern;
  }

  /**
   **/
  public OrgApacheSlingCommonsMetricsInternalLogReporterProperties registryName(ConfigNodePropertyString registryName) {
    this.registryName = registryName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("registryName")
  @Valid public ConfigNodePropertyString getRegistryName() {
    return registryName;
  }

  @JsonProperty("registryName")
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
