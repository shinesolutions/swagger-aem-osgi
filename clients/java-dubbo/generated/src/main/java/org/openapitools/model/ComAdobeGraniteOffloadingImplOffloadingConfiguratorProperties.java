package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("offloading.transporter")
  private ConfigNodePropertyString offloadingTransporter;

  @JsonProperty("offloading.cleanup.payload")
  private ConfigNodePropertyBoolean offloadingCleanupPayload;

  /**
   * 
   * @return offloadingTransporter
   */
  public ConfigNodePropertyString getOffloadingTransporter() {
    return offloadingTransporter;
  }

  public void setOffloadingTransporter(ConfigNodePropertyString offloadingTransporter) {
    this.offloadingTransporter = offloadingTransporter;
  }

  /**
   * 
   * @return offloadingCleanupPayload
   */
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
