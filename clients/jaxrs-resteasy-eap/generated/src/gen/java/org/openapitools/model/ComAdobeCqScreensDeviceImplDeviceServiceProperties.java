package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeCqScreensDeviceImplDeviceServiceProperties   {
  

  private ConfigNodePropertyInteger comAdobeAemScreensPlayerPingfrequency = null;

  private ConfigNodePropertyString comAdobeAemScreensDevicePaswordSpecialchars = null;

  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlowercasechars = null;

  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinuppercasechars = null;

  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinnumberchars = null;

  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinspecialchars = null;

  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlength = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.aem.screens.player.pingfrequency")
  public ConfigNodePropertyInteger getComAdobeAemScreensPlayerPingfrequency() {
    return comAdobeAemScreensPlayerPingfrequency;
  }
  public void setComAdobeAemScreensPlayerPingfrequency(ConfigNodePropertyInteger comAdobeAemScreensPlayerPingfrequency) {
    this.comAdobeAemScreensPlayerPingfrequency = comAdobeAemScreensPlayerPingfrequency;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.aem.screens.device.pasword.specialchars")
  public ConfigNodePropertyString getComAdobeAemScreensDevicePaswordSpecialchars() {
    return comAdobeAemScreensDevicePaswordSpecialchars;
  }
  public void setComAdobeAemScreensDevicePaswordSpecialchars(ConfigNodePropertyString comAdobeAemScreensDevicePaswordSpecialchars) {
    this.comAdobeAemScreensDevicePaswordSpecialchars = comAdobeAemScreensDevicePaswordSpecialchars;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.aem.screens.device.pasword.minlowercasechars")
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinlowercasechars() {
    return comAdobeAemScreensDevicePaswordMinlowercasechars;
  }
  public void setComAdobeAemScreensDevicePaswordMinlowercasechars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlowercasechars) {
    this.comAdobeAemScreensDevicePaswordMinlowercasechars = comAdobeAemScreensDevicePaswordMinlowercasechars;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.aem.screens.device.pasword.minuppercasechars")
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinuppercasechars() {
    return comAdobeAemScreensDevicePaswordMinuppercasechars;
  }
  public void setComAdobeAemScreensDevicePaswordMinuppercasechars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinuppercasechars) {
    this.comAdobeAemScreensDevicePaswordMinuppercasechars = comAdobeAemScreensDevicePaswordMinuppercasechars;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.aem.screens.device.pasword.minnumberchars")
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinnumberchars() {
    return comAdobeAemScreensDevicePaswordMinnumberchars;
  }
  public void setComAdobeAemScreensDevicePaswordMinnumberchars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinnumberchars) {
    this.comAdobeAemScreensDevicePaswordMinnumberchars = comAdobeAemScreensDevicePaswordMinnumberchars;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.aem.screens.device.pasword.minspecialchars")
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinspecialchars() {
    return comAdobeAemScreensDevicePaswordMinspecialchars;
  }
  public void setComAdobeAemScreensDevicePaswordMinspecialchars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinspecialchars) {
    this.comAdobeAemScreensDevicePaswordMinspecialchars = comAdobeAemScreensDevicePaswordMinspecialchars;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.aem.screens.device.pasword.minlength")
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinlength() {
    return comAdobeAemScreensDevicePaswordMinlength;
  }
  public void setComAdobeAemScreensDevicePaswordMinlength(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlength) {
    this.comAdobeAemScreensDevicePaswordMinlength = comAdobeAemScreensDevicePaswordMinlength;
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
    return Objects.equals(comAdobeAemScreensPlayerPingfrequency, comAdobeCqScreensDeviceImplDeviceServiceProperties.comAdobeAemScreensPlayerPingfrequency) &&
        Objects.equals(comAdobeAemScreensDevicePaswordSpecialchars, comAdobeCqScreensDeviceImplDeviceServiceProperties.comAdobeAemScreensDevicePaswordSpecialchars) &&
        Objects.equals(comAdobeAemScreensDevicePaswordMinlowercasechars, comAdobeCqScreensDeviceImplDeviceServiceProperties.comAdobeAemScreensDevicePaswordMinlowercasechars) &&
        Objects.equals(comAdobeAemScreensDevicePaswordMinuppercasechars, comAdobeCqScreensDeviceImplDeviceServiceProperties.comAdobeAemScreensDevicePaswordMinuppercasechars) &&
        Objects.equals(comAdobeAemScreensDevicePaswordMinnumberchars, comAdobeCqScreensDeviceImplDeviceServiceProperties.comAdobeAemScreensDevicePaswordMinnumberchars) &&
        Objects.equals(comAdobeAemScreensDevicePaswordMinspecialchars, comAdobeCqScreensDeviceImplDeviceServiceProperties.comAdobeAemScreensDevicePaswordMinspecialchars) &&
        Objects.equals(comAdobeAemScreensDevicePaswordMinlength, comAdobeCqScreensDeviceImplDeviceServiceProperties.comAdobeAemScreensDevicePaswordMinlength);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

