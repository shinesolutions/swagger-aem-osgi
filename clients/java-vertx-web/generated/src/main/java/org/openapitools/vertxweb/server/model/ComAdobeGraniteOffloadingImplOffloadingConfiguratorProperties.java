package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyBoolean;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties   {
  
  private ConfigNodePropertyString offloadingTransporter;
  private ConfigNodePropertyBoolean offloadingCleanupPayload;

  public ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties () {

  }

  public ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties (ConfigNodePropertyString offloadingTransporter, ConfigNodePropertyBoolean offloadingCleanupPayload) {
    this.offloadingTransporter = offloadingTransporter;
    this.offloadingCleanupPayload = offloadingCleanupPayload;
  }

    
  @JsonProperty("offloading.transporter")
  public ConfigNodePropertyString getOffloadingTransporter() {
    return offloadingTransporter;
  }
  public void setOffloadingTransporter(ConfigNodePropertyString offloadingTransporter) {
    this.offloadingTransporter = offloadingTransporter;
  }

    
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
