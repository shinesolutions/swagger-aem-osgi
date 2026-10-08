package apimodels;

import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties   {
  @JsonProperty("felix.memoryusage.dump.threshold")
  @Valid

  private ConfigNodePropertyInteger felixMemoryusageDumpThreshold;

  @JsonProperty("felix.memoryusage.dump.interval")
  @Valid

  private ConfigNodePropertyInteger felixMemoryusageDumpInterval;

  @JsonProperty("felix.memoryusage.dump.location")
  @Valid

  private ConfigNodePropertyString felixMemoryusageDumpLocation;

  public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties felixMemoryusageDumpThreshold(ConfigNodePropertyInteger felixMemoryusageDumpThreshold) {
    this.felixMemoryusageDumpThreshold = felixMemoryusageDumpThreshold;
    return this;
  }

   /**
   * Get felixMemoryusageDumpThreshold
   * @return felixMemoryusageDumpThreshold
  **/
  public ConfigNodePropertyInteger getFelixMemoryusageDumpThreshold() {
    return felixMemoryusageDumpThreshold;
  }

  public void setFelixMemoryusageDumpThreshold(ConfigNodePropertyInteger felixMemoryusageDumpThreshold) {
    this.felixMemoryusageDumpThreshold = felixMemoryusageDumpThreshold;
  }

  public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties felixMemoryusageDumpInterval(ConfigNodePropertyInteger felixMemoryusageDumpInterval) {
    this.felixMemoryusageDumpInterval = felixMemoryusageDumpInterval;
    return this;
  }

   /**
   * Get felixMemoryusageDumpInterval
   * @return felixMemoryusageDumpInterval
  **/
  public ConfigNodePropertyInteger getFelixMemoryusageDumpInterval() {
    return felixMemoryusageDumpInterval;
  }

  public void setFelixMemoryusageDumpInterval(ConfigNodePropertyInteger felixMemoryusageDumpInterval) {
    this.felixMemoryusageDumpInterval = felixMemoryusageDumpInterval;
  }

  public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties felixMemoryusageDumpLocation(ConfigNodePropertyString felixMemoryusageDumpLocation) {
    this.felixMemoryusageDumpLocation = felixMemoryusageDumpLocation;
    return this;
  }

   /**
   * Get felixMemoryusageDumpLocation
   * @return felixMemoryusageDumpLocation
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

