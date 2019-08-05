package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
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

public class ComAdobeCqScreensDeviceImplDeviceServiceProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger comAdobeAemScreensPlayerPingfrequency = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString comAdobeAemScreensDevicePaswordSpecialchars = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlowercasechars = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinuppercasechars = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinnumberchars = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinspecialchars = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlength = null;
 /**
   * Get comAdobeAemScreensPlayerPingfrequency
   * @return comAdobeAemScreensPlayerPingfrequency
  **/
  @JsonProperty("com.adobe.aem.screens.player.pingfrequency")
  public ConfigNodePropertyInteger getComAdobeAemScreensPlayerPingfrequency() {
    return comAdobeAemScreensPlayerPingfrequency;
  }

  public void setComAdobeAemScreensPlayerPingfrequency(ConfigNodePropertyInteger comAdobeAemScreensPlayerPingfrequency) {
    this.comAdobeAemScreensPlayerPingfrequency = comAdobeAemScreensPlayerPingfrequency;
  }

  public ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeAemScreensPlayerPingfrequency(ConfigNodePropertyInteger comAdobeAemScreensPlayerPingfrequency) {
    this.comAdobeAemScreensPlayerPingfrequency = comAdobeAemScreensPlayerPingfrequency;
    return this;
  }

 /**
   * Get comAdobeAemScreensDevicePaswordSpecialchars
   * @return comAdobeAemScreensDevicePaswordSpecialchars
  **/
  @JsonProperty("com.adobe.aem.screens.device.pasword.specialchars")
  public ConfigNodePropertyString getComAdobeAemScreensDevicePaswordSpecialchars() {
    return comAdobeAemScreensDevicePaswordSpecialchars;
  }

  public void setComAdobeAemScreensDevicePaswordSpecialchars(ConfigNodePropertyString comAdobeAemScreensDevicePaswordSpecialchars) {
    this.comAdobeAemScreensDevicePaswordSpecialchars = comAdobeAemScreensDevicePaswordSpecialchars;
  }

  public ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeAemScreensDevicePaswordSpecialchars(ConfigNodePropertyString comAdobeAemScreensDevicePaswordSpecialchars) {
    this.comAdobeAemScreensDevicePaswordSpecialchars = comAdobeAemScreensDevicePaswordSpecialchars;
    return this;
  }

 /**
   * Get comAdobeAemScreensDevicePaswordMinlowercasechars
   * @return comAdobeAemScreensDevicePaswordMinlowercasechars
  **/
  @JsonProperty("com.adobe.aem.screens.device.pasword.minlowercasechars")
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinlowercasechars() {
    return comAdobeAemScreensDevicePaswordMinlowercasechars;
  }

  public void setComAdobeAemScreensDevicePaswordMinlowercasechars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlowercasechars) {
    this.comAdobeAemScreensDevicePaswordMinlowercasechars = comAdobeAemScreensDevicePaswordMinlowercasechars;
  }

  public ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeAemScreensDevicePaswordMinlowercasechars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlowercasechars) {
    this.comAdobeAemScreensDevicePaswordMinlowercasechars = comAdobeAemScreensDevicePaswordMinlowercasechars;
    return this;
  }

 /**
   * Get comAdobeAemScreensDevicePaswordMinuppercasechars
   * @return comAdobeAemScreensDevicePaswordMinuppercasechars
  **/
  @JsonProperty("com.adobe.aem.screens.device.pasword.minuppercasechars")
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinuppercasechars() {
    return comAdobeAemScreensDevicePaswordMinuppercasechars;
  }

  public void setComAdobeAemScreensDevicePaswordMinuppercasechars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinuppercasechars) {
    this.comAdobeAemScreensDevicePaswordMinuppercasechars = comAdobeAemScreensDevicePaswordMinuppercasechars;
  }

  public ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeAemScreensDevicePaswordMinuppercasechars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinuppercasechars) {
    this.comAdobeAemScreensDevicePaswordMinuppercasechars = comAdobeAemScreensDevicePaswordMinuppercasechars;
    return this;
  }

 /**
   * Get comAdobeAemScreensDevicePaswordMinnumberchars
   * @return comAdobeAemScreensDevicePaswordMinnumberchars
  **/
  @JsonProperty("com.adobe.aem.screens.device.pasword.minnumberchars")
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinnumberchars() {
    return comAdobeAemScreensDevicePaswordMinnumberchars;
  }

  public void setComAdobeAemScreensDevicePaswordMinnumberchars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinnumberchars) {
    this.comAdobeAemScreensDevicePaswordMinnumberchars = comAdobeAemScreensDevicePaswordMinnumberchars;
  }

  public ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeAemScreensDevicePaswordMinnumberchars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinnumberchars) {
    this.comAdobeAemScreensDevicePaswordMinnumberchars = comAdobeAemScreensDevicePaswordMinnumberchars;
    return this;
  }

 /**
   * Get comAdobeAemScreensDevicePaswordMinspecialchars
   * @return comAdobeAemScreensDevicePaswordMinspecialchars
  **/
  @JsonProperty("com.adobe.aem.screens.device.pasword.minspecialchars")
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinspecialchars() {
    return comAdobeAemScreensDevicePaswordMinspecialchars;
  }

  public void setComAdobeAemScreensDevicePaswordMinspecialchars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinspecialchars) {
    this.comAdobeAemScreensDevicePaswordMinspecialchars = comAdobeAemScreensDevicePaswordMinspecialchars;
  }

  public ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeAemScreensDevicePaswordMinspecialchars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinspecialchars) {
    this.comAdobeAemScreensDevicePaswordMinspecialchars = comAdobeAemScreensDevicePaswordMinspecialchars;
    return this;
  }

 /**
   * Get comAdobeAemScreensDevicePaswordMinlength
   * @return comAdobeAemScreensDevicePaswordMinlength
  **/
  @JsonProperty("com.adobe.aem.screens.device.pasword.minlength")
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinlength() {
    return comAdobeAemScreensDevicePaswordMinlength;
  }

  public void setComAdobeAemScreensDevicePaswordMinlength(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlength) {
    this.comAdobeAemScreensDevicePaswordMinlength = comAdobeAemScreensDevicePaswordMinlength;
  }

  public ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeAemScreensDevicePaswordMinlength(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlength) {
    this.comAdobeAemScreensDevicePaswordMinlength = comAdobeAemScreensDevicePaswordMinlength;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScreensDeviceImplDeviceServiceProperties {\n");
    
    sb.append("    comAdobeAemScreensPlayerPingfrequency: ").append(toIndentedString(comAdobeAemScreensPlayerPingfrequency)).append("\n");
    sb.append("    comAdobeAemScreensDevicePaswordSpecialchars: ").append(toIndentedString(comAdobeAemScreensDevicePaswordSpecialchars)).append("\n");
    sb.append("    comAdobeAemScreensDevicePaswordMinlowercasechars: ").append(toIndentedString(comAdobeAemScreensDevicePaswordMinlowercasechars)).append("\n");
    sb.append("    comAdobeAemScreensDevicePaswordMinuppercasechars: ").append(toIndentedString(comAdobeAemScreensDevicePaswordMinuppercasechars)).append("\n");
    sb.append("    comAdobeAemScreensDevicePaswordMinnumberchars: ").append(toIndentedString(comAdobeAemScreensDevicePaswordMinnumberchars)).append("\n");
    sb.append("    comAdobeAemScreensDevicePaswordMinspecialchars: ").append(toIndentedString(comAdobeAemScreensDevicePaswordMinspecialchars)).append("\n");
    sb.append("    comAdobeAemScreensDevicePaswordMinlength: ").append(toIndentedString(comAdobeAemScreensDevicePaswordMinlength)).append("\n");
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

