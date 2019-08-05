package org.openapitools.model;

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

public class ComAdobeGraniteCompatrouterImplRoutingConfigProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString id = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString compatPath = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString newPath = null;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public ConfigNodePropertyString getId() {
    return id;
  }

  public void setId(ConfigNodePropertyString id) {
    this.id = id;
  }

  public ComAdobeGraniteCompatrouterImplRoutingConfigProperties id(ConfigNodePropertyString id) {
    this.id = id;
    return this;
  }

 /**
   * Get compatPath
   * @return compatPath
  **/
  @JsonProperty("compatPath")
  public ConfigNodePropertyString getCompatPath() {
    return compatPath;
  }

  public void setCompatPath(ConfigNodePropertyString compatPath) {
    this.compatPath = compatPath;
  }

  public ComAdobeGraniteCompatrouterImplRoutingConfigProperties compatPath(ConfigNodePropertyString compatPath) {
    this.compatPath = compatPath;
    return this;
  }

 /**
   * Get newPath
   * @return newPath
  **/
  @JsonProperty("newPath")
  public ConfigNodePropertyString getNewPath() {
    return newPath;
  }

  public void setNewPath(ConfigNodePropertyString newPath) {
    this.newPath = newPath;
  }

  public ComAdobeGraniteCompatrouterImplRoutingConfigProperties newPath(ConfigNodePropertyString newPath) {
    this.newPath = newPath;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteCompatrouterImplRoutingConfigProperties {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    compatPath: ").append(toIndentedString(compatPath)).append("\n");
    sb.append("    newPath: ").append(toIndentedString(newPath)).append("\n");
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

