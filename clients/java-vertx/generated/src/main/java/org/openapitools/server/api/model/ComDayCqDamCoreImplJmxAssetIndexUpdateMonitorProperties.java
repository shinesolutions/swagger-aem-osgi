package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyFloat;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
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

  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties () {

  }

  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties (ConfigNodePropertyString jmxObjectname, ConfigNodePropertyBoolean propertyMeasureEnabled, ConfigNodePropertyString propertyName, ConfigNodePropertyInteger propertyMaxWaitMs, ConfigNodePropertyFloat propertyMaxRate, ConfigNodePropertyBoolean fulltextMeasureEnabled, ConfigNodePropertyString fulltextName, ConfigNodePropertyInteger fulltextMaxWaitMs, ConfigNodePropertyFloat fulltextMaxRate) {
    this.jmxObjectname = jmxObjectname;
    this.propertyMeasureEnabled = propertyMeasureEnabled;
    this.propertyName = propertyName;
    this.propertyMaxWaitMs = propertyMaxWaitMs;
    this.propertyMaxRate = propertyMaxRate;
    this.fulltextMeasureEnabled = fulltextMeasureEnabled;
    this.fulltextName = fulltextName;
    this.fulltextMaxWaitMs = fulltextMaxWaitMs;
    this.fulltextMaxRate = fulltextMaxRate;
  }

    
  @JsonProperty("jmx.objectname")
  public ConfigNodePropertyString getJmxObjectname() {
    return jmxObjectname;
  }
  public void setJmxObjectname(ConfigNodePropertyString jmxObjectname) {
    this.jmxObjectname = jmxObjectname;
  }

    
  @JsonProperty("property.measure.enabled")
  public ConfigNodePropertyBoolean getPropertyMeasureEnabled() {
    return propertyMeasureEnabled;
  }
  public void setPropertyMeasureEnabled(ConfigNodePropertyBoolean propertyMeasureEnabled) {
    this.propertyMeasureEnabled = propertyMeasureEnabled;
  }

    
  @JsonProperty("property.name")
  public ConfigNodePropertyString getPropertyName() {
    return propertyName;
  }
  public void setPropertyName(ConfigNodePropertyString propertyName) {
    this.propertyName = propertyName;
  }

    
  @JsonProperty("property.max.wait.ms")
  public ConfigNodePropertyInteger getPropertyMaxWaitMs() {
    return propertyMaxWaitMs;
  }
  public void setPropertyMaxWaitMs(ConfigNodePropertyInteger propertyMaxWaitMs) {
    this.propertyMaxWaitMs = propertyMaxWaitMs;
  }

    
  @JsonProperty("property.max.rate")
  public ConfigNodePropertyFloat getPropertyMaxRate() {
    return propertyMaxRate;
  }
  public void setPropertyMaxRate(ConfigNodePropertyFloat propertyMaxRate) {
    this.propertyMaxRate = propertyMaxRate;
  }

    
  @JsonProperty("fulltext.measure.enabled")
  public ConfigNodePropertyBoolean getFulltextMeasureEnabled() {
    return fulltextMeasureEnabled;
  }
  public void setFulltextMeasureEnabled(ConfigNodePropertyBoolean fulltextMeasureEnabled) {
    this.fulltextMeasureEnabled = fulltextMeasureEnabled;
  }

    
  @JsonProperty("fulltext.name")
  public ConfigNodePropertyString getFulltextName() {
    return fulltextName;
  }
  public void setFulltextName(ConfigNodePropertyString fulltextName) {
    this.fulltextName = fulltextName;
  }

    
  @JsonProperty("fulltext.max.wait.ms")
  public ConfigNodePropertyInteger getFulltextMaxWaitMs() {
    return fulltextMaxWaitMs;
  }
  public void setFulltextMaxWaitMs(ConfigNodePropertyInteger fulltextMaxWaitMs) {
    this.fulltextMaxWaitMs = fulltextMaxWaitMs;
  }

    
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
