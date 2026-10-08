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
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties   {
  
  private ConfigNodePropertyString offloadingTransporter;
  private ConfigNodePropertyBoolean offloadingCleanupPayload;

  /**
   */
  public ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties offloadingTransporter(ConfigNodePropertyString offloadingTransporter) {
    this.offloadingTransporter = offloadingTransporter;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("offloading.transporter")
  public ConfigNodePropertyString getOffloadingTransporter() {
    return offloadingTransporter;
  }
  public void setOffloadingTransporter(ConfigNodePropertyString offloadingTransporter) {
    this.offloadingTransporter = offloadingTransporter;
  }

  /**
   */
  public ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties offloadingCleanupPayload(ConfigNodePropertyBoolean offloadingCleanupPayload) {
    this.offloadingCleanupPayload = offloadingCleanupPayload;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("offloading.cleanup.payload")
  public ConfigNodePropertyBoolean getOffloadingCleanupPayload() {
    return offloadingCleanupPayload;
  }
  public void setOffloadingCleanupPayload(ConfigNodePropertyBoolean offloadingCleanupPayload) {
    this.offloadingCleanupPayload = offloadingCleanupPayload;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties comAdobeGraniteOffloadingImplOffloadingConfiguratorProperties = (ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties) o;
    return Objects.equals(offloadingTransporter, comAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.offloadingTransporter) &&
        Objects.equals(offloadingCleanupPayload, comAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.offloadingCleanupPayload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offloadingTransporter, offloadingCleanupPayload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties {\n");
    
    sb.append("    offloadingTransporter: ").append(toIndentedString(offloadingTransporter)).append("\n");
    sb.append("    offloadingCleanupPayload: ").append(toIndentedString(offloadingCleanupPayload)).append("\n");
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

