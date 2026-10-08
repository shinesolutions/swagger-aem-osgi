package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqScreensDeviceImplDeviceServiceProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger comAdobeAemScreensPlayerPingfrequency;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString comAdobeAemScreensDevicePaswordSpecialchars;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlowercasechars;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinuppercasechars;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinnumberchars;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinspecialchars;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlength;
 /**
  * Get comAdobeAemScreensPlayerPingfrequency
  * @return comAdobeAemScreensPlayerPingfrequency
  */
  @JsonProperty("com.adobe.aem.screens.player.pingfrequency")
  public ConfigNodePropertyInteger getComAdobeAemScreensPlayerPingfrequency() {
    return comAdobeAemScreensPlayerPingfrequency;
  }

  /**
   * Sets the <code>comAdobeAemScreensPlayerPingfrequency</code> property.
   */
 public void setComAdobeAemScreensPlayerPingfrequency(ConfigNodePropertyInteger comAdobeAemScreensPlayerPingfrequency) {
    this.comAdobeAemScreensPlayerPingfrequency = comAdobeAemScreensPlayerPingfrequency;
  }

  /**
   * Sets the <code>comAdobeAemScreensPlayerPingfrequency</code> property.
   */
  public ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeAemScreensPlayerPingfrequency(ConfigNodePropertyInteger comAdobeAemScreensPlayerPingfrequency) {
    this.comAdobeAemScreensPlayerPingfrequency = comAdobeAemScreensPlayerPingfrequency;
    return this;
  }

 /**
  * Get comAdobeAemScreensDevicePaswordSpecialchars
  * @return comAdobeAemScreensDevicePaswordSpecialchars
  */
  @JsonProperty("com.adobe.aem.screens.device.pasword.specialchars")
  public ConfigNodePropertyString getComAdobeAemScreensDevicePaswordSpecialchars() {
    return comAdobeAemScreensDevicePaswordSpecialchars;
  }

  /**
   * Sets the <code>comAdobeAemScreensDevicePaswordSpecialchars</code> property.
   */
 public void setComAdobeAemScreensDevicePaswordSpecialchars(ConfigNodePropertyString comAdobeAemScreensDevicePaswordSpecialchars) {
    this.comAdobeAemScreensDevicePaswordSpecialchars = comAdobeAemScreensDevicePaswordSpecialchars;
  }

  /**
   * Sets the <code>comAdobeAemScreensDevicePaswordSpecialchars</code> property.
   */
  public ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeAemScreensDevicePaswordSpecialchars(ConfigNodePropertyString comAdobeAemScreensDevicePaswordSpecialchars) {
    this.comAdobeAemScreensDevicePaswordSpecialchars = comAdobeAemScreensDevicePaswordSpecialchars;
    return this;
  }

 /**
  * Get comAdobeAemScreensDevicePaswordMinlowercasechars
  * @return comAdobeAemScreensDevicePaswordMinlowercasechars
  */
  @JsonProperty("com.adobe.aem.screens.device.pasword.minlowercasechars")
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinlowercasechars() {
    return comAdobeAemScreensDevicePaswordMinlowercasechars;
  }

  /**
   * Sets the <code>comAdobeAemScreensDevicePaswordMinlowercasechars</code> property.
   */
 public void setComAdobeAemScreensDevicePaswordMinlowercasechars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlowercasechars) {
    this.comAdobeAemScreensDevicePaswordMinlowercasechars = comAdobeAemScreensDevicePaswordMinlowercasechars;
  }

  /**
   * Sets the <code>comAdobeAemScreensDevicePaswordMinlowercasechars</code> property.
   */
  public ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeAemScreensDevicePaswordMinlowercasechars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlowercasechars) {
    this.comAdobeAemScreensDevicePaswordMinlowercasechars = comAdobeAemScreensDevicePaswordMinlowercasechars;
    return this;
  }

 /**
  * Get comAdobeAemScreensDevicePaswordMinuppercasechars
  * @return comAdobeAemScreensDevicePaswordMinuppercasechars
  */
  @JsonProperty("com.adobe.aem.screens.device.pasword.minuppercasechars")
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinuppercasechars() {
    return comAdobeAemScreensDevicePaswordMinuppercasechars;
  }

  /**
   * Sets the <code>comAdobeAemScreensDevicePaswordMinuppercasechars</code> property.
   */
 public void setComAdobeAemScreensDevicePaswordMinuppercasechars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinuppercasechars) {
    this.comAdobeAemScreensDevicePaswordMinuppercasechars = comAdobeAemScreensDevicePaswordMinuppercasechars;
  }

  /**
   * Sets the <code>comAdobeAemScreensDevicePaswordMinuppercasechars</code> property.
   */
  public ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeAemScreensDevicePaswordMinuppercasechars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinuppercasechars) {
    this.comAdobeAemScreensDevicePaswordMinuppercasechars = comAdobeAemScreensDevicePaswordMinuppercasechars;
    return this;
  }

 /**
  * Get comAdobeAemScreensDevicePaswordMinnumberchars
  * @return comAdobeAemScreensDevicePaswordMinnumberchars
  */
  @JsonProperty("com.adobe.aem.screens.device.pasword.minnumberchars")
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinnumberchars() {
    return comAdobeAemScreensDevicePaswordMinnumberchars;
  }

  /**
   * Sets the <code>comAdobeAemScreensDevicePaswordMinnumberchars</code> property.
   */
 public void setComAdobeAemScreensDevicePaswordMinnumberchars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinnumberchars) {
    this.comAdobeAemScreensDevicePaswordMinnumberchars = comAdobeAemScreensDevicePaswordMinnumberchars;
  }

  /**
   * Sets the <code>comAdobeAemScreensDevicePaswordMinnumberchars</code> property.
   */
  public ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeAemScreensDevicePaswordMinnumberchars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinnumberchars) {
    this.comAdobeAemScreensDevicePaswordMinnumberchars = comAdobeAemScreensDevicePaswordMinnumberchars;
    return this;
  }

 /**
  * Get comAdobeAemScreensDevicePaswordMinspecialchars
  * @return comAdobeAemScreensDevicePaswordMinspecialchars
  */
  @JsonProperty("com.adobe.aem.screens.device.pasword.minspecialchars")
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinspecialchars() {
    return comAdobeAemScreensDevicePaswordMinspecialchars;
  }

  /**
   * Sets the <code>comAdobeAemScreensDevicePaswordMinspecialchars</code> property.
   */
 public void setComAdobeAemScreensDevicePaswordMinspecialchars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinspecialchars) {
    this.comAdobeAemScreensDevicePaswordMinspecialchars = comAdobeAemScreensDevicePaswordMinspecialchars;
  }

  /**
   * Sets the <code>comAdobeAemScreensDevicePaswordMinspecialchars</code> property.
   */
  public ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeAemScreensDevicePaswordMinspecialchars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinspecialchars) {
    this.comAdobeAemScreensDevicePaswordMinspecialchars = comAdobeAemScreensDevicePaswordMinspecialchars;
    return this;
  }

 /**
  * Get comAdobeAemScreensDevicePaswordMinlength
  * @return comAdobeAemScreensDevicePaswordMinlength
  */
  @JsonProperty("com.adobe.aem.screens.device.pasword.minlength")
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinlength() {
    return comAdobeAemScreensDevicePaswordMinlength;
  }

  /**
   * Sets the <code>comAdobeAemScreensDevicePaswordMinlength</code> property.
   */
 public void setComAdobeAemScreensDevicePaswordMinlength(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlength) {
    this.comAdobeAemScreensDevicePaswordMinlength = comAdobeAemScreensDevicePaswordMinlength;
  }

  /**
   * Sets the <code>comAdobeAemScreensDevicePaswordMinlength</code> property.
   */
  public ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeAemScreensDevicePaswordMinlength(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlength) {
    this.comAdobeAemScreensDevicePaswordMinlength = comAdobeAemScreensDevicePaswordMinlength;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeCqScreensDeviceImplDeviceServiceProperties = (ComAdobeCqScreensDeviceImplDeviceServiceProperties) o;
    return Objects.equals(this.comAdobeAemScreensPlayerPingfrequency, comAdobeCqScreensDeviceImplDeviceServiceProperties.comAdobeAemScreensPlayerPingfrequency) &&
        Objects.equals(this.comAdobeAemScreensDevicePaswordSpecialchars, comAdobeCqScreensDeviceImplDeviceServiceProperties.comAdobeAemScreensDevicePaswordSpecialchars) &&
        Objects.equals(this.comAdobeAemScreensDevicePaswordMinlowercasechars, comAdobeCqScreensDeviceImplDeviceServiceProperties.comAdobeAemScreensDevicePaswordMinlowercasechars) &&
        Objects.equals(this.comAdobeAemScreensDevicePaswordMinuppercasechars, comAdobeCqScreensDeviceImplDeviceServiceProperties.comAdobeAemScreensDevicePaswordMinuppercasechars) &&
        Objects.equals(this.comAdobeAemScreensDevicePaswordMinnumberchars, comAdobeCqScreensDeviceImplDeviceServiceProperties.comAdobeAemScreensDevicePaswordMinnumberchars) &&
        Objects.equals(this.comAdobeAemScreensDevicePaswordMinspecialchars, comAdobeCqScreensDeviceImplDeviceServiceProperties.comAdobeAemScreensDevicePaswordMinspecialchars) &&
        Objects.equals(this.comAdobeAemScreensDevicePaswordMinlength, comAdobeCqScreensDeviceImplDeviceServiceProperties.comAdobeAemScreensDevicePaswordMinlength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comAdobeAemScreensPlayerPingfrequency, comAdobeAemScreensDevicePaswordSpecialchars, comAdobeAemScreensDevicePaswordMinlowercasechars, comAdobeAemScreensDevicePaswordMinuppercasechars, comAdobeAemScreensDevicePaswordMinnumberchars, comAdobeAemScreensDevicePaswordMinspecialchars, comAdobeAemScreensDevicePaswordMinlength);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

