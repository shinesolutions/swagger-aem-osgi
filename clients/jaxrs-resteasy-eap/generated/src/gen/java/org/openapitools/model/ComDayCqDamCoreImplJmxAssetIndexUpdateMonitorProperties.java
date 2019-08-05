package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyFloat;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties   {
  

  private ConfigNodePropertyString jmxObjectname = null;

  private ConfigNodePropertyBoolean propertyMeasureEnabled = null;

  private ConfigNodePropertyString propertyName = null;

  private ConfigNodePropertyInteger propertyMaxWaitMs = null;

  private ConfigNodePropertyFloat propertyMaxRate = null;

  private ConfigNodePropertyBoolean fulltextMeasureEnabled = null;

  private ConfigNodePropertyString fulltextName = null;

  private ConfigNodePropertyInteger fulltextMaxWaitMs = null;

  private ConfigNodePropertyFloat fulltextMaxRate = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("jmx.objectname")
  public ConfigNodePropertyString getJmxObjectname() {
    return jmxObjectname;
  }
  public void setJmxObjectname(ConfigNodePropertyString jmxObjectname) {
    this.jmxObjectname = jmxObjectname;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("property.measure.enabled")
  public ConfigNodePropertyBoolean getPropertyMeasureEnabled() {
    return propertyMeasureEnabled;
  }
  public void setPropertyMeasureEnabled(ConfigNodePropertyBoolean propertyMeasureEnabled) {
    this.propertyMeasureEnabled = propertyMeasureEnabled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("property.name")
  public ConfigNodePropertyString getPropertyName() {
    return propertyName;
  }
  public void setPropertyName(ConfigNodePropertyString propertyName) {
    this.propertyName = propertyName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("property.max.wait.ms")
  public ConfigNodePropertyInteger getPropertyMaxWaitMs() {
    return propertyMaxWaitMs;
  }
  public void setPropertyMaxWaitMs(ConfigNodePropertyInteger propertyMaxWaitMs) {
    this.propertyMaxWaitMs = propertyMaxWaitMs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("property.max.rate")
  public ConfigNodePropertyFloat getPropertyMaxRate() {
    return propertyMaxRate;
  }
  public void setPropertyMaxRate(ConfigNodePropertyFloat propertyMaxRate) {
    this.propertyMaxRate = propertyMaxRate;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fulltext.measure.enabled")
  public ConfigNodePropertyBoolean getFulltextMeasureEnabled() {
    return fulltextMeasureEnabled;
  }
  public void setFulltextMeasureEnabled(ConfigNodePropertyBoolean fulltextMeasureEnabled) {
    this.fulltextMeasureEnabled = fulltextMeasureEnabled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fulltext.name")
  public ConfigNodePropertyString getFulltextName() {
    return fulltextName;
  }
  public void setFulltextName(ConfigNodePropertyString fulltextName) {
    this.fulltextName = fulltextName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fulltext.max.wait.ms")
  public ConfigNodePropertyInteger getFulltextMaxWaitMs() {
    return fulltextMaxWaitMs;
  }
  public void setFulltextMaxWaitMs(ConfigNodePropertyInteger fulltextMaxWaitMs) {
    this.fulltextMaxWaitMs = fulltextMaxWaitMs;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("fulltext.max.rate")
  public ConfigNodePropertyFloat getFulltextMaxRate() {
    return fulltextMaxRate;
  }
  public void setFulltextMaxRate(ConfigNodePropertyFloat fulltextMaxRate) {
    this.fulltextMaxRate = fulltextMaxRate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties = (ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties) o;
    return Objects.equals(jmxObjectname, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.jmxObjectname) &&
        Objects.equals(propertyMeasureEnabled, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.propertyMeasureEnabled) &&
        Objects.equals(propertyName, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.propertyName) &&
        Objects.equals(propertyMaxWaitMs, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.propertyMaxWaitMs) &&
        Objects.equals(propertyMaxRate, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.propertyMaxRate) &&
        Objects.equals(fulltextMeasureEnabled, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.fulltextMeasureEnabled) &&
        Objects.equals(fulltextName, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.fulltextName) &&
        Objects.equals(fulltextMaxWaitMs, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.fulltextMaxWaitMs) &&
        Objects.equals(fulltextMaxRate, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.fulltextMaxRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jmxObjectname, propertyMeasureEnabled, propertyName, propertyMaxWaitMs, propertyMaxRate, fulltextMeasureEnabled, fulltextName, fulltextMaxWaitMs, fulltextMaxRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties {\n");
    
    sb.append("    jmxObjectname: ").append(toIndentedString(jmxObjectname)).append("\n");
    sb.append("    propertyMeasureEnabled: ").append(toIndentedString(propertyMeasureEnabled)).append("\n");
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    propertyMaxWaitMs: ").append(toIndentedString(propertyMaxWaitMs)).append("\n");
    sb.append("    propertyMaxRate: ").append(toIndentedString(propertyMaxRate)).append("\n");
    sb.append("    fulltextMeasureEnabled: ").append(toIndentedString(fulltextMeasureEnabled)).append("\n");
    sb.append("    fulltextName: ").append(toIndentedString(fulltextName)).append("\n");
    sb.append("    fulltextMaxWaitMs: ").append(toIndentedString(fulltextMaxWaitMs)).append("\n");
    sb.append("    fulltextMaxRate: ").append(toIndentedString(fulltextMaxRate)).append("\n");
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

