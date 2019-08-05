package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger felixMemoryusageDumpThreshold = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger felixMemoryusageDumpInterval = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString felixMemoryusageDumpLocation = null;
 /**
   * Get felixMemoryusageDumpThreshold
   * @return felixMemoryusageDumpThreshold
  **/
  @JsonProperty("felix.memoryusage.dump.threshold")
  public ConfigNodePropertyInteger getFelixMemoryusageDumpThreshold() {
    return felixMemoryusageDumpThreshold;
  }

  public void setFelixMemoryusageDumpThreshold(ConfigNodePropertyInteger felixMemoryusageDumpThreshold) {
    this.felixMemoryusageDumpThreshold = felixMemoryusageDumpThreshold;
  }

  public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties felixMemoryusageDumpThreshold(ConfigNodePropertyInteger felixMemoryusageDumpThreshold) {
    this.felixMemoryusageDumpThreshold = felixMemoryusageDumpThreshold;
    return this;
  }

 /**
   * Get felixMemoryusageDumpInterval
   * @return felixMemoryusageDumpInterval
  **/
  @JsonProperty("felix.memoryusage.dump.interval")
  public ConfigNodePropertyInteger getFelixMemoryusageDumpInterval() {
    return felixMemoryusageDumpInterval;
  }

  public void setFelixMemoryusageDumpInterval(ConfigNodePropertyInteger felixMemoryusageDumpInterval) {
    this.felixMemoryusageDumpInterval = felixMemoryusageDumpInterval;
  }

  public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties felixMemoryusageDumpInterval(ConfigNodePropertyInteger felixMemoryusageDumpInterval) {
    this.felixMemoryusageDumpInterval = felixMemoryusageDumpInterval;
    return this;
  }

 /**
   * Get felixMemoryusageDumpLocation
   * @return felixMemoryusageDumpLocation
  **/
  @JsonProperty("felix.memoryusage.dump.location")
  public ConfigNodePropertyString getFelixMemoryusageDumpLocation() {
    return felixMemoryusageDumpLocation;
  }

  public void setFelixMemoryusageDumpLocation(ConfigNodePropertyString felixMemoryusageDumpLocation) {
    this.felixMemoryusageDumpLocation = felixMemoryusageDumpLocation;
  }

  public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties felixMemoryusageDumpLocation(ConfigNodePropertyString felixMemoryusageDumpLocation) {
    this.felixMemoryusageDumpLocation = felixMemoryusageDumpLocation;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

