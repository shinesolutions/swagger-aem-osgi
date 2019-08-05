package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheSlingCommonsMetricsInternalLogReporterProperties   {
  

  private ConfigNodePropertyInteger period = null;

  private ConfigNodePropertyDropDown timeUnit = null;

  private ConfigNodePropertyDropDown level = null;

  private ConfigNodePropertyString loggerName = null;

  private ConfigNodePropertyString prefix = null;

  private ConfigNodePropertyString pattern = null;

  private ConfigNodePropertyString registryName = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("period")
  public ConfigNodePropertyInteger getPeriod() {
    return period;
  }
  public void setPeriod(ConfigNodePropertyInteger period) {
    this.period = period;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("timeUnit")
  public ConfigNodePropertyDropDown getTimeUnit() {
    return timeUnit;
  }
  public void setTimeUnit(ConfigNodePropertyDropDown timeUnit) {
    this.timeUnit = timeUnit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("level")
  public ConfigNodePropertyDropDown getLevel() {
    return level;
  }
  public void setLevel(ConfigNodePropertyDropDown level) {
    this.level = level;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("loggerName")
  public ConfigNodePropertyString getLoggerName() {
    return loggerName;
  }
  public void setLoggerName(ConfigNodePropertyString loggerName) {
    this.loggerName = loggerName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prefix")
  public ConfigNodePropertyString getPrefix() {
    return prefix;
  }
  public void setPrefix(ConfigNodePropertyString prefix) {
    this.prefix = prefix;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pattern")
  public ConfigNodePropertyString getPattern() {
    return pattern;
  }
  public void setPattern(ConfigNodePropertyString pattern) {
    this.pattern = pattern;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

