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

public class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean nuiEnabled = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString nuiServiceUrl = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString nuiApiKey = null;
 /**
   * Get nuiEnabled
   * @return nuiEnabled
  **/
  @JsonProperty("nuiEnabled")
  public ConfigNodePropertyBoolean getNuiEnabled() {
    return nuiEnabled;
  }

  public void setNuiEnabled(ConfigNodePropertyBoolean nuiEnabled) {
    this.nuiEnabled = nuiEnabled;
  }

  public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties nuiEnabled(ConfigNodePropertyBoolean nuiEnabled) {
    this.nuiEnabled = nuiEnabled;
    return this;
  }

 /**
   * Get nuiServiceUrl
   * @return nuiServiceUrl
  **/
  @JsonProperty("nuiServiceUrl")
  public ConfigNodePropertyString getNuiServiceUrl() {
    return nuiServiceUrl;
  }

  public void setNuiServiceUrl(ConfigNodePropertyString nuiServiceUrl) {
    this.nuiServiceUrl = nuiServiceUrl;
  }

  public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties nuiServiceUrl(ConfigNodePropertyString nuiServiceUrl) {
    this.nuiServiceUrl = nuiServiceUrl;
    return this;
  }

 /**
   * Get nuiApiKey
   * @return nuiApiKey
  **/
  @JsonProperty("nuiApiKey")
  public ConfigNodePropertyString getNuiApiKey() {
    return nuiApiKey;
  }

  public void setNuiApiKey(ConfigNodePropertyString nuiApiKey) {
    this.nuiApiKey = nuiApiKey;
  }

  public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties nuiApiKey(ConfigNodePropertyString nuiApiKey) {
    this.nuiApiKey = nuiApiKey;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties {\n");
    
    sb.append("    nuiEnabled: ").append(toIndentedString(nuiEnabled)).append("\n");
    sb.append("    nuiServiceUrl: ").append(toIndentedString(nuiServiceUrl)).append("\n");
    sb.append("    nuiApiKey: ").append(toIndentedString(nuiApiKey)).append("\n");
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

