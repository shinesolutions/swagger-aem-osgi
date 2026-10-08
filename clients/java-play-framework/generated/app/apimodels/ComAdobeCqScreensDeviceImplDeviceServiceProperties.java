package apimodels;

import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqScreensDeviceImplDeviceServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqScreensDeviceImplDeviceServiceProperties   {
  @JsonProperty("com.adobe.aem.screens.player.pingfrequency")
  @Valid

  private ConfigNodePropertyInteger comAdobeAemScreensPlayerPingfrequency;

  @JsonProperty("com.adobe.aem.screens.device.pasword.specialchars")
  @Valid

  private ConfigNodePropertyString comAdobeAemScreensDevicePaswordSpecialchars;

  @JsonProperty("com.adobe.aem.screens.device.pasword.minlowercasechars")
  @Valid

  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlowercasechars;

  @JsonProperty("com.adobe.aem.screens.device.pasword.minuppercasechars")
  @Valid

  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinuppercasechars;

  @JsonProperty("com.adobe.aem.screens.device.pasword.minnumberchars")
  @Valid

  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinnumberchars;

  @JsonProperty("com.adobe.aem.screens.device.pasword.minspecialchars")
  @Valid

  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinspecialchars;

  @JsonProperty("com.adobe.aem.screens.device.pasword.minlength")
  @Valid

  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlength;

  public ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeAemScreensPlayerPingfrequency(ConfigNodePropertyInteger comAdobeAemScreensPlayerPingfrequency) {
    this.comAdobeAemScreensPlayerPingfrequency = comAdobeAemScreensPlayerPingfrequency;
    return this;
  }

   /**
   * Get comAdobeAemScreensPlayerPingfrequency
   * @return comAdobeAemScreensPlayerPingfrequency
  **/
  public ConfigNodePropertyInteger getComAdobeAemScreensPlayerPingfrequency() {
    return comAdobeAemScreensPlayerPingfrequency;
  }

  public void setComAdobeAemScreensPlayerPingfrequency(ConfigNodePropertyInteger comAdobeAemScreensPlayerPingfrequency) {
    this.comAdobeAemScreensPlayerPingfrequency = comAdobeAemScreensPlayerPingfrequency;
  }

  public ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeAemScreensDevicePaswordSpecialchars(ConfigNodePropertyString comAdobeAemScreensDevicePaswordSpecialchars) {
    this.comAdobeAemScreensDevicePaswordSpecialchars = comAdobeAemScreensDevicePaswordSpecialchars;
    return this;
  }

   /**
   * Get comAdobeAemScreensDevicePaswordSpecialchars
   * @return comAdobeAemScreensDevicePaswordSpecialchars
  **/
  public ConfigNodePropertyString getComAdobeAemScreensDevicePaswordSpecialchars() {
    return comAdobeAemScreensDevicePaswordSpecialchars;
  }

  public void setComAdobeAemScreensDevicePaswordSpecialchars(ConfigNodePropertyString comAdobeAemScreensDevicePaswordSpecialchars) {
    this.comAdobeAemScreensDevicePaswordSpecialchars = comAdobeAemScreensDevicePaswordSpecialchars;
  }

  public ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeAemScreensDevicePaswordMinlowercasechars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlowercasechars) {
    this.comAdobeAemScreensDevicePaswordMinlowercasechars = comAdobeAemScreensDevicePaswordMinlowercasechars;
    return this;
  }

   /**
   * Get comAdobeAemScreensDevicePaswordMinlowercasechars
   * @return comAdobeAemScreensDevicePaswordMinlowercasechars
  **/
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinlowercasechars() {
    return comAdobeAemScreensDevicePaswordMinlowercasechars;
  }

  public void setComAdobeAemScreensDevicePaswordMinlowercasechars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlowercasechars) {
    this.comAdobeAemScreensDevicePaswordMinlowercasechars = comAdobeAemScreensDevicePaswordMinlowercasechars;
  }

  public ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeAemScreensDevicePaswordMinuppercasechars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinuppercasechars) {
    this.comAdobeAemScreensDevicePaswordMinuppercasechars = comAdobeAemScreensDevicePaswordMinuppercasechars;
    return this;
  }

   /**
   * Get comAdobeAemScreensDevicePaswordMinuppercasechars
   * @return comAdobeAemScreensDevicePaswordMinuppercasechars
  **/
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinuppercasechars() {
    return comAdobeAemScreensDevicePaswordMinuppercasechars;
  }

  public void setComAdobeAemScreensDevicePaswordMinuppercasechars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinuppercasechars) {
    this.comAdobeAemScreensDevicePaswordMinuppercasechars = comAdobeAemScreensDevicePaswordMinuppercasechars;
  }

  public ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeAemScreensDevicePaswordMinnumberchars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinnumberchars) {
    this.comAdobeAemScreensDevicePaswordMinnumberchars = comAdobeAemScreensDevicePaswordMinnumberchars;
    return this;
  }

   /**
   * Get comAdobeAemScreensDevicePaswordMinnumberchars
   * @return comAdobeAemScreensDevicePaswordMinnumberchars
  **/
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinnumberchars() {
    return comAdobeAemScreensDevicePaswordMinnumberchars;
  }

  public void setComAdobeAemScreensDevicePaswordMinnumberchars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinnumberchars) {
    this.comAdobeAemScreensDevicePaswordMinnumberchars = comAdobeAemScreensDevicePaswordMinnumberchars;
  }

  public ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeAemScreensDevicePaswordMinspecialchars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinspecialchars) {
    this.comAdobeAemScreensDevicePaswordMinspecialchars = comAdobeAemScreensDevicePaswordMinspecialchars;
    return this;
  }

   /**
   * Get comAdobeAemScreensDevicePaswordMinspecialchars
   * @return comAdobeAemScreensDevicePaswordMinspecialchars
  **/
  public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinspecialchars() {
    return comAdobeAemScreensDevicePaswordMinspecialchars;
  }

  public void setComAdobeAemScreensDevicePaswordMinspecialchars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinspecialchars) {
    this.comAdobeAemScreensDevicePaswordMinspecialchars = comAdobeAemScreensDevicePaswordMinspecialchars;
  }

  public ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeAemScreensDevicePaswordMinlength(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlength) {
    this.comAdobeAemScreensDevicePaswordMinlength = comAdobeAemScreensDevicePaswordMinlength;
    return this;
  }

   /**
   * Get comAdobeAemScreensDevicePaswordMinlength
   * @return comAdobeAemScreensDevicePaswordMinlength
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

