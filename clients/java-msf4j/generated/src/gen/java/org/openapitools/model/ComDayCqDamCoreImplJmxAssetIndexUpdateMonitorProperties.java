package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyFloat;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties   {
  @JsonProperty("jmx.objectname")
  private ConfigNodePropertyString jmxObjectname = null;

  @JsonProperty("property.measure.enabled")
  private ConfigNodePropertyBoolean propertyMeasureEnabled = null;

  @JsonProperty("property.name")
  private ConfigNodePropertyString propertyName = null;

  @JsonProperty("property.max.wait.ms")
  private ConfigNodePropertyInteger propertyMaxWaitMs = null;

  @JsonProperty("property.max.rate")
  private ConfigNodePropertyFloat propertyMaxRate = null;

  @JsonProperty("fulltext.measure.enabled")
  private ConfigNodePropertyBoolean fulltextMeasureEnabled = null;

  @JsonProperty("fulltext.name")
  private ConfigNodePropertyString fulltextName = null;

  @JsonProperty("fulltext.max.wait.ms")
  private ConfigNodePropertyInteger fulltextMaxWaitMs = null;

  @JsonProperty("fulltext.max.rate")
  private ConfigNodePropertyFloat fulltextMaxRate = null;

  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties jmxObjectname(ConfigNodePropertyString jmxObjectname) {
    this.jmxObjectname = jmxObjectname;
    return this;
  }

   /**
   * Get jmxObjectname
   * @return jmxObjectname
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getJmxObjectname() {
    return jmxObjectname;
  }

  public void setJmxObjectname(ConfigNodePropertyString jmxObjectname) {
    this.jmxObjectname = jmxObjectname;
  }

  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties propertyMeasureEnabled(ConfigNodePropertyBoolean propertyMeasureEnabled) {
    this.propertyMeasureEnabled = propertyMeasureEnabled;
    return this;
  }

   /**
   * Get propertyMeasureEnabled
   * @return propertyMeasureEnabled
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getPropertyMeasureEnabled() {
    return propertyMeasureEnabled;
  }

  public void setPropertyMeasureEnabled(ConfigNodePropertyBoolean propertyMeasureEnabled) {
    this.propertyMeasureEnabled = propertyMeasureEnabled;
  }

  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties propertyName(ConfigNodePropertyString propertyName) {
    this.propertyName = propertyName;
    return this;
  }

   /**
   * Get propertyName
   * @return propertyName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(ConfigNodePropertyString propertyName) {
    this.propertyName = propertyName;
  }

  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties propertyMaxWaitMs(ConfigNodePropertyInteger propertyMaxWaitMs) {
    this.propertyMaxWaitMs = propertyMaxWaitMs;
    return this;
  }

   /**
   * Get propertyMaxWaitMs
   * @return propertyMaxWaitMs
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getPropertyMaxWaitMs() {
    return propertyMaxWaitMs;
  }

  public void setPropertyMaxWaitMs(ConfigNodePropertyInteger propertyMaxWaitMs) {
    this.propertyMaxWaitMs = propertyMaxWaitMs;
  }

  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties propertyMaxRate(ConfigNodePropertyFloat propertyMaxRate) {
    this.propertyMaxRate = propertyMaxRate;
    return this;
  }

   /**
   * Get propertyMaxRate
   * @return propertyMaxRate
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyFloat getPropertyMaxRate() {
    return propertyMaxRate;
  }

  public void setPropertyMaxRate(ConfigNodePropertyFloat propertyMaxRate) {
    this.propertyMaxRate = propertyMaxRate;
  }

  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties fulltextMeasureEnabled(ConfigNodePropertyBoolean fulltextMeasureEnabled) {
    this.fulltextMeasureEnabled = fulltextMeasureEnabled;
    return this;
  }

   /**
   * Get fulltextMeasureEnabled
   * @return fulltextMeasureEnabled
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getFulltextMeasureEnabled() {
    return fulltextMeasureEnabled;
  }

  public void setFulltextMeasureEnabled(ConfigNodePropertyBoolean fulltextMeasureEnabled) {
    this.fulltextMeasureEnabled = fulltextMeasureEnabled;
  }

  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties fulltextName(ConfigNodePropertyString fulltextName) {
    this.fulltextName = fulltextName;
    return this;
  }

   /**
   * Get fulltextName
   * @return fulltextName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getFulltextName() {
    return fulltextName;
  }

  public void setFulltextName(ConfigNodePropertyString fulltextName) {
    this.fulltextName = fulltextName;
  }

  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties fulltextMaxWaitMs(ConfigNodePropertyInteger fulltextMaxWaitMs) {
    this.fulltextMaxWaitMs = fulltextMaxWaitMs;
    return this;
  }

   /**
   * Get fulltextMaxWaitMs
   * @return fulltextMaxWaitMs
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getFulltextMaxWaitMs() {
    return fulltextMaxWaitMs;
  }

  public void setFulltextMaxWaitMs(ConfigNodePropertyInteger fulltextMaxWaitMs) {
    this.fulltextMaxWaitMs = fulltextMaxWaitMs;
  }

  public ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties fulltextMaxRate(ConfigNodePropertyFloat fulltextMaxRate) {
    this.fulltextMaxRate = fulltextMaxRate;
    return this;
  }

   /**
   * Get fulltextMaxRate
   * @return fulltextMaxRate
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyFloat getFulltextMaxRate() {
    return fulltextMaxRate;
  }

  public void setFulltextMaxRate(ConfigNodePropertyFloat fulltextMaxRate) {
    this.fulltextMaxRate = fulltextMaxRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

