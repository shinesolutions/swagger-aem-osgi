package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties   {
  
  private ConfigNodePropertyInteger felixMemoryusageDumpThreshold = null;
  private ConfigNodePropertyInteger felixMemoryusageDumpInterval = null;
  private ConfigNodePropertyString felixMemoryusageDumpLocation = null;

  public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties () {

  }

  public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties (ConfigNodePropertyInteger felixMemoryusageDumpThreshold, ConfigNodePropertyInteger felixMemoryusageDumpInterval, ConfigNodePropertyString felixMemoryusageDumpLocation) {
    this.felixMemoryusageDumpThreshold = felixMemoryusageDumpThreshold;
    this.felixMemoryusageDumpInterval = felixMemoryusageDumpInterval;
    this.felixMemoryusageDumpLocation = felixMemoryusageDumpLocation;
  }

    
  @JsonProperty("felix.memoryusage.dump.threshold")
  public ConfigNodePropertyInteger getFelixMemoryusageDumpThreshold() {
    return felixMemoryusageDumpThreshold;
  }
  public void setFelixMemoryusageDumpThreshold(ConfigNodePropertyInteger felixMemoryusageDumpThreshold) {
    this.felixMemoryusageDumpThreshold = felixMemoryusageDumpThreshold;
  }

    
  @JsonProperty("felix.memoryusage.dump.interval")
  public ConfigNodePropertyInteger getFelixMemoryusageDumpInterval() {
    return felixMemoryusageDumpInterval;
  }
  public void setFelixMemoryusageDumpInterval(ConfigNodePropertyInteger felixMemoryusageDumpInterval) {
    this.felixMemoryusageDumpInterval = felixMemoryusageDumpInterval;
  }

    
  @JsonProperty("felix.memoryusage.dump.location")
  public ConfigNodePropertyString getFelixMemoryusageDumpLocation() {
    return felixMemoryusageDumpLocation;
  }
  public void setFelixMemoryusageDumpLocation(ConfigNodePropertyString felixMemoryusageDumpLocation) {
    this.felixMemoryusageDumpLocation = felixMemoryusageDumpLocation;
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
    return Objects.equals(felixMemoryusageDumpThreshold, orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.felixMemoryusageDumpThreshold) &&
        Objects.equals(felixMemoryusageDumpInterval, orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.felixMemoryusageDumpInterval) &&
        Objects.equals(felixMemoryusageDumpLocation, orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.felixMemoryusageDumpLocation);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
