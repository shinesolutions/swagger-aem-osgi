package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqScreensDeviceImplDeviceServiceProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("com.adobe.aem.screens.player.pingfrequency")
  private ConfigNodePropertyInteger comAdobeAemScreensPlayerPingfrequency;

  @JsonProperty("com.adobe.aem.screens.device.pasword.specialchars")
  private ConfigNodePropertyString comAdobeAemScreensDevicePaswordSpecialchars;

  @JsonProperty("com.adobe.aem.screens.device.pasword.minlowercasechars")
  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlowercasechars;

  @JsonProperty("com.adobe.aem.screens.device.pasword.minuppercasechars")
  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinuppercasechars;

  @JsonProperty("com.adobe.aem.screens.device.pasword.minnumberchars")
  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinnumberchars;

  @JsonProperty("com.adobe.aem.screens.device.pasword.minspecialchars")
  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinspecialchars;

  @JsonProperty("com.adobe.aem.screens.device.pasword.minlength")
  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlength;

  /**
   * 
   * @return comAdobeAemScreensPlayerPingfrequency
   */
  public ConfigNodePropertyInteger getComAdobeAemScreensPlayerPingfrequency() {
    return comAdobeAemScreensPlayerPingfrequency;
  }

  public void setComAdobeAemScreensPlayerPingfrequency(ConfigNodePropertyInteger comAdobeAemScreensPlayerPingfrequency) {
    this.comAdobeAemScreensPlayerPingfrequency = comAdobeAemScreensPlayerPingfrequency;
  }

  /**
   * 
   * @return comAdobeAemScreensDevicePaswordSpecialchars
   */
  public ConfigNodePropertyString getComAdobeAemScreensDevicePaswordSpecialchars() {
    return comAdobeAemScreensDevicePaswordSpecialchars;
  }

  public void setComAdobeAemScreensDevicePaswordSpecialchars(ConfigNodePropertyString comAdobeAemScreensDevicePaswordSpecialchars) {
    this.comAdobeAemScreensDevicePaswordSpecialchars = comAdobeAemScreensDevicePaswordSpecialchars;
  }

  /**
   * 
   * @return comAdobeAemScreensDevicePaswordMinlowercasechars
   */
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinlowercasechars() {
    return comAdobeAemScreensDevicePaswordMinlowercasechars;
  }

  public void setComAdobeAemScreensDevicePaswordMinlowercasechars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlowercasechars) {
    this.comAdobeAemScreensDevicePaswordMinlowercasechars = comAdobeAemScreensDevicePaswordMinlowercasechars;
  }

  /**
   * 
   * @return comAdobeAemScreensDevicePaswordMinuppercasechars
   */
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinuppercasechars() {
    return comAdobeAemScreensDevicePaswordMinuppercasechars;
  }

  public void setComAdobeAemScreensDevicePaswordMinuppercasechars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinuppercasechars) {
    this.comAdobeAemScreensDevicePaswordMinuppercasechars = comAdobeAemScreensDevicePaswordMinuppercasechars;
  }

  /**
   * 
   * @return comAdobeAemScreensDevicePaswordMinnumberchars
   */
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinnumberchars() {
    return comAdobeAemScreensDevicePaswordMinnumberchars;
  }

  public void setComAdobeAemScreensDevicePaswordMinnumberchars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinnumberchars) {
    this.comAdobeAemScreensDevicePaswordMinnumberchars = comAdobeAemScreensDevicePaswordMinnumberchars;
  }

  /**
   * 
   * @return comAdobeAemScreensDevicePaswordMinspecialchars
   */
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinspecialchars() {
    return comAdobeAemScreensDevicePaswordMinspecialchars;
  }

  public void setComAdobeAemScreensDevicePaswordMinspecialchars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinspecialchars) {
    this.comAdobeAemScreensDevicePaswordMinspecialchars = comAdobeAemScreensDevicePaswordMinspecialchars;
  }

  /**
   * 
   * @return comAdobeAemScreensDevicePaswordMinlength
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
