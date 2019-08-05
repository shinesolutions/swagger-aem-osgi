package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyFloat;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

