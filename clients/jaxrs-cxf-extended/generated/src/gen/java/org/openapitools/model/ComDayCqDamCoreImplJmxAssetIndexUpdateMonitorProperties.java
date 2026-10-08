package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyFloat;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString jmxObjectname;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean propertyMeasureEnabled;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString propertyName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger propertyMaxWaitMs;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyFloat propertyMaxRate;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean fulltextMeasureEnabled;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString fulltextName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger fulltextMaxWaitMs;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyFloat fulltextMaxRate;
 /**
  * Get jmxObjectname
  * @return jmxObjectname
  */
  @JsonProperty("jmx.objectname")
  public ConfigNodePropertyString getJmxObjectname() {
    return jmxObjectname;
  }

  /**
   * Sets the <code>jmxObjectname</code> property.
   */
 public void setJmxObjectname(ConfigNodePropertyString jmxObjectname) {
    this.jmxObjectname = jmxObjectname;
  }

  /**
   * Sets the <code>jmxObjectname</code> property.
   */
  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties jmxObjectname(ConfigNodePropertyString jmxObjectname) {
    this.jmxObjectname = jmxObjectname;
    return this;
  }

 /**
  * Get propertyMeasureEnabled
  * @return propertyMeasureEnabled
  */
  @JsonProperty("property.measure.enabled")
  public ConfigNodePropertyBoolean getPropertyMeasureEnabled() {
    return propertyMeasureEnabled;
  }

  /**
   * Sets the <code>propertyMeasureEnabled</code> property.
   */
 public void setPropertyMeasureEnabled(ConfigNodePropertyBoolean propertyMeasureEnabled) {
    this.propertyMeasureEnabled = propertyMeasureEnabled;
  }

  /**
   * Sets the <code>propertyMeasureEnabled</code> property.
   */
  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties propertyMeasureEnabled(ConfigNodePropertyBoolean propertyMeasureEnabled) {
    this.propertyMeasureEnabled = propertyMeasureEnabled;
    return this;
  }

 /**
  * Get propertyName
  * @return propertyName
  */
  @JsonProperty("property.name")
  public ConfigNodePropertyString getPropertyName() {
    return propertyName;
  }

  /**
   * Sets the <code>propertyName</code> property.
   */
 public void setPropertyName(ConfigNodePropertyString propertyName) {
    this.propertyName = propertyName;
  }

  /**
   * Sets the <code>propertyName</code> property.
   */
  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties propertyName(ConfigNodePropertyString propertyName) {
    this.propertyName = propertyName;
    return this;
  }

 /**
  * Get propertyMaxWaitMs
  * @return propertyMaxWaitMs
  */
  @JsonProperty("property.max.wait.ms")
  public ConfigNodePropertyInteger getPropertyMaxWaitMs() {
    return propertyMaxWaitMs;
  }

  /**
   * Sets the <code>propertyMaxWaitMs</code> property.
   */
 public void setPropertyMaxWaitMs(ConfigNodePropertyInteger propertyMaxWaitMs) {
    this.propertyMaxWaitMs = propertyMaxWaitMs;
  }

  /**
   * Sets the <code>propertyMaxWaitMs</code> property.
   */
  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties propertyMaxWaitMs(ConfigNodePropertyInteger propertyMaxWaitMs) {
    this.propertyMaxWaitMs = propertyMaxWaitMs;
    return this;
  }

 /**
  * Get propertyMaxRate
  * @return propertyMaxRate
  */
  @JsonProperty("property.max.rate")
  public ConfigNodePropertyFloat getPropertyMaxRate() {
    return propertyMaxRate;
  }

  /**
   * Sets the <code>propertyMaxRate</code> property.
   */
 public void setPropertyMaxRate(ConfigNodePropertyFloat propertyMaxRate) {
    this.propertyMaxRate = propertyMaxRate;
  }

  /**
   * Sets the <code>propertyMaxRate</code> property.
   */
  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties propertyMaxRate(ConfigNodePropertyFloat propertyMaxRate) {
    this.propertyMaxRate = propertyMaxRate;
    return this;
  }

 /**
  * Get fulltextMeasureEnabled
  * @return fulltextMeasureEnabled
  */
  @JsonProperty("fulltext.measure.enabled")
  public ConfigNodePropertyBoolean getFulltextMeasureEnabled() {
    return fulltextMeasureEnabled;
  }

  /**
   * Sets the <code>fulltextMeasureEnabled</code> property.
   */
 public void setFulltextMeasureEnabled(ConfigNodePropertyBoolean fulltextMeasureEnabled) {
    this.fulltextMeasureEnabled = fulltextMeasureEnabled;
  }

  /**
   * Sets the <code>fulltextMeasureEnabled</code> property.
   */
  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties fulltextMeasureEnabled(ConfigNodePropertyBoolean fulltextMeasureEnabled) {
    this.fulltextMeasureEnabled = fulltextMeasureEnabled;
    return this;
  }

 /**
  * Get fulltextName
  * @return fulltextName
  */
  @JsonProperty("fulltext.name")
  public ConfigNodePropertyString getFulltextName() {
    return fulltextName;
  }

  /**
   * Sets the <code>fulltextName</code> property.
   */
 public void setFulltextName(ConfigNodePropertyString fulltextName) {
    this.fulltextName = fulltextName;
  }

  /**
   * Sets the <code>fulltextName</code> property.
   */
  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties fulltextName(ConfigNodePropertyString fulltextName) {
    this.fulltextName = fulltextName;
    return this;
  }

 /**
  * Get fulltextMaxWaitMs
  * @return fulltextMaxWaitMs
  */
  @JsonProperty("fulltext.max.wait.ms")
  public ConfigNodePropertyInteger getFulltextMaxWaitMs() {
    return fulltextMaxWaitMs;
  }

  /**
   * Sets the <code>fulltextMaxWaitMs</code> property.
   */
 public void setFulltextMaxWaitMs(ConfigNodePropertyInteger fulltextMaxWaitMs) {
    this.fulltextMaxWaitMs = fulltextMaxWaitMs;
  }

  /**
   * Sets the <code>fulltextMaxWaitMs</code> property.
   */
  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties fulltextMaxWaitMs(ConfigNodePropertyInteger fulltextMaxWaitMs) {
    this.fulltextMaxWaitMs = fulltextMaxWaitMs;
    return this;
  }

 /**
  * Get fulltextMaxRate
  * @return fulltextMaxRate
  */
  @JsonProperty("fulltext.max.rate")
  public ConfigNodePropertyFloat getFulltextMaxRate() {
    return fulltextMaxRate;
  }

  /**
   * Sets the <code>fulltextMaxRate</code> property.
   */
 public void setFulltextMaxRate(ConfigNodePropertyFloat fulltextMaxRate) {
    this.fulltextMaxRate = fulltextMaxRate;
  }

  /**
   * Sets the <code>fulltextMaxRate</code> property.
   */
  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties fulltextMaxRate(ConfigNodePropertyFloat fulltextMaxRate) {
    this.fulltextMaxRate = fulltextMaxRate;
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
    ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties = (ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties) o;
    return Objects.equals(this.jmxObjectname, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.jmxObjectname) &&
        Objects.equals(this.propertyMeasureEnabled, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.propertyMeasureEnabled) &&
        Objects.equals(this.propertyName, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.propertyName) &&
        Objects.equals(this.propertyMaxWaitMs, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.propertyMaxWaitMs) &&
        Objects.equals(this.propertyMaxRate, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.propertyMaxRate) &&
        Objects.equals(this.fulltextMeasureEnabled, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.fulltextMeasureEnabled) &&
        Objects.equals(this.fulltextName, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.fulltextName) &&
        Objects.equals(this.fulltextMaxWaitMs, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.fulltextMaxWaitMs) &&
        Objects.equals(this.fulltextMaxRate, comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.fulltextMaxRate);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

