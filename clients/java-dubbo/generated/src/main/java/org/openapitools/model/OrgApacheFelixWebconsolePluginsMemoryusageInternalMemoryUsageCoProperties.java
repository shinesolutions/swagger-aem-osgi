package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("felix.memoryusage.dump.threshold")
  private ConfigNodePropertyInteger felixMemoryusageDumpThreshold;

  @JsonProperty("felix.memoryusage.dump.interval")
  private ConfigNodePropertyInteger felixMemoryusageDumpInterval;

  @JsonProperty("felix.memoryusage.dump.location")
  private ConfigNodePropertyString felixMemoryusageDumpLocation;

  /**
   * 
   * @return felixMemoryusageDumpThreshold
   */
  public ConfigNodePropertyInteger getFelixMemoryusageDumpThreshold() {
    return felixMemoryusageDumpThreshold;
  }

  public void setFelixMemoryusageDumpThreshold(ConfigNodePropertyInteger felixMemoryusageDumpThreshold) {
    this.felixMemoryusageDumpThreshold = felixMemoryusageDumpThreshold;
  }

  /**
   * 
   * @return felixMemoryusageDumpInterval
   */
  public ConfigNodePropertyInteger getFelixMemoryusageDumpInterval() {
    return felixMemoryusageDumpInterval;
  }

  public void setFelixMemoryusageDumpInterval(ConfigNodePropertyInteger felixMemoryusageDumpInterval) {
    this.felixMemoryusageDumpInterval = felixMemoryusageDumpInterval;
  }

  /**
   * 
   * @return felixMemoryusageDumpLocation
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
