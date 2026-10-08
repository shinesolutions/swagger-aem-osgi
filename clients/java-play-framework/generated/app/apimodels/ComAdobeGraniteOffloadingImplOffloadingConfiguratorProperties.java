package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties   {
  @JsonProperty("offloading.transporter")
  @Valid

  private ConfigNodePropertyString offloadingTransporter;

  @JsonProperty("offloading.cleanup.payload")
  @Valid

  private ConfigNodePropertyBoolean offloadingCleanupPayload;

  public ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties offloadingTransporter(ConfigNodePropertyString offloadingTransporter) {
    this.offloadingTransporter = offloadingTransporter;
    return this;
  }

   /**
   * Get offloadingTransporter
   * @return offloadingTransporter
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

