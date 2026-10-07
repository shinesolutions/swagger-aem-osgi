/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties   {
  
  private ConfigNodePropertyInteger felixMemoryusageDumpThreshold;
  private ConfigNodePropertyInteger felixMemoryusageDumpInterval;
  private ConfigNodePropertyString felixMemoryusageDumpLocation;

  /**
   */
  public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties felixMemoryusageDumpThreshold(ConfigNodePropertyInteger felixMemoryusageDumpThreshold) {
    this.felixMemoryusageDumpThreshold = felixMemoryusageDumpThreshold;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("felix.memoryusage.dump.threshold")
  public ConfigNodePropertyInteger getFelixMemoryusageDumpThreshold() {
    return felixMemoryusageDumpThreshold;
  }
  public void setFelixMemoryusageDumpThreshold(ConfigNodePropertyInteger felixMemoryusageDumpThreshold) {
    this.felixMemoryusageDumpThreshold = felixMemoryusageDumpThreshold;
  }

  /**
   */
  public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties felixMemoryusageDumpInterval(ConfigNodePropertyInteger felixMemoryusageDumpInterval) {
    this.felixMemoryusageDumpInterval = felixMemoryusageDumpInterval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("felix.memoryusage.dump.interval")
  public ConfigNodePropertyInteger getFelixMemoryusageDumpInterval() {
    return felixMemoryusageDumpInterval;
  }
  public void setFelixMemoryusageDumpInterval(ConfigNodePropertyInteger felixMemoryusageDumpInterval) {
    this.felixMemoryusageDumpInterval = felixMemoryusageDumpInterval;
  }

  /**
   */
  public OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties felixMemoryusageDumpLocation(ConfigNodePropertyString felixMemoryusageDumpLocation) {
    this.felixMemoryusageDumpLocation = felixMemoryusageDumpLocation;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

