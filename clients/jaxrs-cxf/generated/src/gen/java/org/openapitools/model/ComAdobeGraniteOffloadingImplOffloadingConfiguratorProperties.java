package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
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

public class ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString offloadingTransporter = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean offloadingCleanupPayload = null;
 /**
   * Get offloadingTransporter
   * @return offloadingTransporter
  **/
  @JsonProperty("offloading.transporter")
  public ConfigNodePropertyString getOffloadingTransporter() {
    return offloadingTransporter;
  }

  public void setOffloadingTransporter(ConfigNodePropertyString offloadingTransporter) {
    this.offloadingTransporter = offloadingTransporter;
  }

  public ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties offloadingTransporter(ConfigNodePropertyString offloadingTransporter) {
    this.offloadingTransporter = offloadingTransporter;
    return this;
  }

 /**
   * Get offloadingCleanupPayload
   * @return offloadingCleanupPayload
  **/
  @JsonProperty("offloading.cleanup.payload")
  public ConfigNodePropertyBoolean getOffloadingCleanupPayload() {
    return offloadingCleanupPayload;
  }

  public void setOffloadingCleanupPayload(ConfigNodePropertyBoolean offloadingCleanupPayload) {
    this.offloadingCleanupPayload = offloadingCleanupPayload;
  }

  public ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties offloadingCleanupPayload(ConfigNodePropertyBoolean offloadingCleanupPayload) {
    this.offloadingCleanupPayload = offloadingCleanupPayload;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

