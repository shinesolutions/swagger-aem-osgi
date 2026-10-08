package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger felixMemoryusageDumpThreshold;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger felixMemoryusageDumpInterval;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString felixMemoryusageDumpLocation;
 /**
  * Get felixMemoryusageDumpThreshold
  * @return felixMemoryusageDumpThreshold
  */
  @JsonProperty("felix.memoryusage.dump.threshold")
  public ConfigNodePropertyInteger getFelixMemoryusageDumpThreshold() {
    return felixMemoryusageDumpThreshold;
  }

  /**
   * Sets the <code>felixMemoryusageDumpThreshold</code> property.
   */
 public void setFelixMemoryusageDumpThreshold(ConfigNodePropertyInteger felixMemoryusageDumpThreshold) {
    this.felixMemoryusageDumpThreshold = felixMemoryusageDumpThreshold;
  }

  /**
   * Sets the <code>felixMemoryusageDumpThreshold</code> property.
   */
  public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties felixMemoryusageDumpThreshold(ConfigNodePropertyInteger felixMemoryusageDumpThreshold) {
    this.felixMemoryusageDumpThreshold = felixMemoryusageDumpThreshold;
    return this;
  }

 /**
  * Get felixMemoryusageDumpInterval
  * @return felixMemoryusageDumpInterval
  */
  @JsonProperty("felix.memoryusage.dump.interval")
  public ConfigNodePropertyInteger getFelixMemoryusageDumpInterval() {
    return felixMemoryusageDumpInterval;
  }

  /**
   * Sets the <code>felixMemoryusageDumpInterval</code> property.
   */
 public void setFelixMemoryusageDumpInterval(ConfigNodePropertyInteger felixMemoryusageDumpInterval) {
    this.felixMemoryusageDumpInterval = felixMemoryusageDumpInterval;
  }

  /**
   * Sets the <code>felixMemoryusageDumpInterval</code> property.
   */
  public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties felixMemoryusageDumpInterval(ConfigNodePropertyInteger felixMemoryusageDumpInterval) {
    this.felixMemoryusageDumpInterval = felixMemoryusageDumpInterval;
    return this;
  }

 /**
  * Get felixMemoryusageDumpLocation
  * @return felixMemoryusageDumpLocation
  */
  @JsonProperty("felix.memoryusage.dump.location")
  public ConfigNodePropertyString getFelixMemoryusageDumpLocation() {
    return felixMemoryusageDumpLocation;
  }

  /**
   * Sets the <code>felixMemoryusageDumpLocation</code> property.
   */
 public void setFelixMemoryusageDumpLocation(ConfigNodePropertyString felixMemoryusageDumpLocation) {
    this.felixMemoryusageDumpLocation = felixMemoryusageDumpLocation;
  }

  /**
   * Sets the <code>felixMemoryusageDumpLocation</code> property.
   */
  public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties felixMemoryusageDumpLocation(ConfigNodePropertyString felixMemoryusageDumpLocation) {
    this.felixMemoryusageDumpLocation = felixMemoryusageDumpLocation;
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
    OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties = (OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties) o;
    return Objects.equals(this.felixMemoryusageDumpThreshold, orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.felixMemoryusageDumpThreshold) &&
        Objects.equals(this.felixMemoryusageDumpInterval, orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.felixMemoryusageDumpInterval) &&
        Objects.equals(this.felixMemoryusageDumpLocation, orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.felixMemoryusageDumpLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(felixMemoryusageDumpThreshold, felixMemoryusageDumpInterval, felixMemoryusageDumpLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties {\n");
    
    sb.append("    felixMemoryusageDumpThreshold: ").append(toIndentedString(felixMemoryusageDumpThreshold)).append("\n");
    sb.append("    felixMemoryusageDumpInterval: ").append(toIndentedString(felixMemoryusageDumpInterval)).append("\n");
    sb.append("    felixMemoryusageDumpLocation: ").append(toIndentedString(felixMemoryusageDumpLocation)).append("\n");
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

