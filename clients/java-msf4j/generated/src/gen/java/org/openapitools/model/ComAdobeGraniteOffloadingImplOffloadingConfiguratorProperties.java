package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties   {
  @JsonProperty("offloading.transporter")
  private ConfigNodePropertyString offloadingTransporter;

  @JsonProperty("offloading.cleanup.payload")
  private ConfigNodePropertyBoolean offloadingCleanupPayload;

  public ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties offloadingTransporter(ConfigNodePropertyString offloadingTransporter) {
    this.offloadingTransporter = offloadingTransporter;
    return this;
  }

   /**
   * Get offloadingTransporter
   * @return offloadingTransporter
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOffloadingTransporter() {
    return offloadingTransporter;
  }

  public void setOffloadingTransporter(ConfigNodePropertyString offloadingTransporter) {
    this.offloadingTransporter = offloadingTransporter;
  }

  public ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties offloadingCleanupPayload(ConfigNodePropertyBoolean offloadingCleanupPayload) {
    this.offloadingCleanupPayload = offloadingCleanupPayload;
    return this;
  }

   /**
   * Get offloadingCleanupPayload
   * @return offloadingCleanupPayload
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.offloadingTransporter, comAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.offloadingTransporter) &&
        Objects.equals(this.offloadingCleanupPayload, comAdobeGraniteOffloadingImplOffloadingConfiguratorProperties.offloadingCleanupPayload);
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

