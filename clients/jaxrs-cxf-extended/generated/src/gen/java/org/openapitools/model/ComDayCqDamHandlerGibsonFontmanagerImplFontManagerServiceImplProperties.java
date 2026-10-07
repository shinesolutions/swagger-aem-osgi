package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString eventFilter;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray fontmgrSystemFontDir;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString fontmgrAdobeFontDir;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString fontmgrCustomerFontDir;
 /**
  * Get eventFilter
  * @return eventFilter
  */
  @JsonProperty("event.filter")
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  /**
   * Sets the <code>eventFilter</code> property.
   */
 public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  /**
   * Sets the <code>eventFilter</code> property.
   */
  public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties eventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

 /**
  * Get fontmgrSystemFontDir
  * @return fontmgrSystemFontDir
  */
  @JsonProperty("fontmgr.system.font.dir")
  public ConfigNodePropertyArray getFontmgrSystemFontDir() {
    return fontmgrSystemFontDir;
  }

  /**
   * Sets the <code>fontmgrSystemFontDir</code> property.
   */
 public void setFontmgrSystemFontDir(ConfigNodePropertyArray fontmgrSystemFontDir) {
    this.fontmgrSystemFontDir = fontmgrSystemFontDir;
  }

  /**
   * Sets the <code>fontmgrSystemFontDir</code> property.
   */
  public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties fontmgrSystemFontDir(ConfigNodePropertyArray fontmgrSystemFontDir) {
    this.fontmgrSystemFontDir = fontmgrSystemFontDir;
    return this;
  }

 /**
  * Get fontmgrAdobeFontDir
  * @return fontmgrAdobeFontDir
  */
  @JsonProperty("fontmgr.adobe.font.dir")
  public ConfigNodePropertyString getFontmgrAdobeFontDir() {
    return fontmgrAdobeFontDir;
  }

  /**
   * Sets the <code>fontmgrAdobeFontDir</code> property.
   */
 public void setFontmgrAdobeFontDir(ConfigNodePropertyString fontmgrAdobeFontDir) {
    this.fontmgrAdobeFontDir = fontmgrAdobeFontDir;
  }

  /**
   * Sets the <code>fontmgrAdobeFontDir</code> property.
   */
  public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties fontmgrAdobeFontDir(ConfigNodePropertyString fontmgrAdobeFontDir) {
    this.fontmgrAdobeFontDir = fontmgrAdobeFontDir;
    return this;
  }

 /**
  * Get fontmgrCustomerFontDir
  * @return fontmgrCustomerFontDir
  */
  @JsonProperty("fontmgr.customer.font.dir")
  public ConfigNodePropertyString getFontmgrCustomerFontDir() {
    return fontmgrCustomerFontDir;
  }

  /**
   * Sets the <code>fontmgrCustomerFontDir</code> property.
   */
 public void setFontmgrCustomerFontDir(ConfigNodePropertyString fontmgrCustomerFontDir) {
    this.fontmgrCustomerFontDir = fontmgrCustomerFontDir;
  }

  /**
   * Sets the <code>fontmgrCustomerFontDir</code> property.
   */
  public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties fontmgrCustomerFontDir(ConfigNodePropertyString fontmgrCustomerFontDir) {
    this.fontmgrCustomerFontDir = fontmgrCustomerFontDir;
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
    ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties = (ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties) o;
    return Objects.equals(this.eventFilter, comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.eventFilter) &&
        Objects.equals(this.fontmgrSystemFontDir, comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.fontmgrSystemFontDir) &&
        Objects.equals(this.fontmgrAdobeFontDir, comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.fontmgrAdobeFontDir) &&
        Objects.equals(this.fontmgrCustomerFontDir, comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.fontmgrCustomerFontDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventFilter, fontmgrSystemFontDir, fontmgrAdobeFontDir, fontmgrCustomerFontDir);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties {\n");
    
    sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
    sb.append("    fontmgrSystemFontDir: ").append(toIndentedString(fontmgrSystemFontDir)).append("\n");
    sb.append("    fontmgrAdobeFontDir: ").append(toIndentedString(fontmgrAdobeFontDir)).append("\n");
    sb.append("    fontmgrCustomerFontDir: ").append(toIndentedString(fontmgrCustomerFontDir)).append("\n");
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

