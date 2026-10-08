package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqScreensDeviceImplDeviceServiceProperties
 */

@JsonTypeName("comAdobeCqScreensDeviceImplDeviceServiceProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqScreensDeviceImplDeviceServiceProperties {

  private ConfigNodePropertyInteger comAdobeAemScreensPlayerPingfrequency;

  private ConfigNodePropertyString comAdobeAemScreensDevicePaswordSpecialchars;

  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlowercasechars;

  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinuppercasechars;

  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinnumberchars;

  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinspecialchars;

  private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlength;

  public ComAdobeCqScreensDeviceImplDeviceServiceProperties comAdobeAemScreensPlayerPingfrequency(ConfigNodePropertyInteger comAdobeAemScreensPlayerPingfrequency) {
    this.comAdobeAemScreensPlayerPingfrequency = comAdobeAemScreensPlayerPingfrequency;
    return this;
  }

  /**
   * Get comAdobeAemScreensPlayerPingfrequency
   * @return comAdobeAemScreensPlayerPingfrequency
   */
  @Valid 
  @Schema(name = "com.adobe.aem.screens.player.pingfrequency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.aem.screens.player.pingfrequency")
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
   */
  @Valid 
  @Schema(name = "com.adobe.aem.screens.device.pasword.specialchars", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.aem.screens.device.pasword.specialchars")
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
   */
  @Valid 
  @Schema(name = "com.adobe.aem.screens.device.pasword.minlowercasechars", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.aem.screens.device.pasword.minlowercasechars")
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
   */
  @Valid 
  @Schema(name = "com.adobe.aem.screens.device.pasword.minuppercasechars", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.aem.screens.device.pasword.minuppercasechars")
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
   */
  @Valid 
  @Schema(name = "com.adobe.aem.screens.device.pasword.minnumberchars", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.aem.screens.device.pasword.minnumberchars")
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
   */
  @Valid 
  @Schema(name = "com.adobe.aem.screens.device.pasword.minspecialchars", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.aem.screens.device.pasword.minspecialchars")
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
   */
  @Valid 
  @Schema(name = "com.adobe.aem.screens.device.pasword.minlength", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

