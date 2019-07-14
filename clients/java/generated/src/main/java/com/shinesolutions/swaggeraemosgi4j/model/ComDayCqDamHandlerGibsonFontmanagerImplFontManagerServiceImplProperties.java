/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraemosgi4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyArray;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-14T23:44:05.965Z[GMT]")
public class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties {
  public static final String SERIALIZED_NAME_EVENT_FILTER = "event.filter";
  @SerializedName(SERIALIZED_NAME_EVENT_FILTER)
  private ConfigNodePropertyString eventFilter = null;

  public static final String SERIALIZED_NAME_FONTMGR_SYSTEM_FONT_DIR = "fontmgr.system.font.dir";
  @SerializedName(SERIALIZED_NAME_FONTMGR_SYSTEM_FONT_DIR)
  private ConfigNodePropertyArray fontmgrSystemFontDir = null;

  public static final String SERIALIZED_NAME_FONTMGR_ADOBE_FONT_DIR = "fontmgr.adobe.font.dir";
  @SerializedName(SERIALIZED_NAME_FONTMGR_ADOBE_FONT_DIR)
  private ConfigNodePropertyString fontmgrAdobeFontDir = null;

  public static final String SERIALIZED_NAME_FONTMGR_CUSTOMER_FONT_DIR = "fontmgr.customer.font.dir";
  @SerializedName(SERIALIZED_NAME_FONTMGR_CUSTOMER_FONT_DIR)
  private ConfigNodePropertyString fontmgrCustomerFontDir = null;

  public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties eventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

   /**
   * Get eventFilter
   * @return eventFilter
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties fontmgrSystemFontDir(ConfigNodePropertyArray fontmgrSystemFontDir) {
    this.fontmgrSystemFontDir = fontmgrSystemFontDir;
    return this;
  }

   /**
   * Get fontmgrSystemFontDir
   * @return fontmgrSystemFontDir
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getFontmgrSystemFontDir() {
    return fontmgrSystemFontDir;
  }

  public void setFontmgrSystemFontDir(ConfigNodePropertyArray fontmgrSystemFontDir) {
    this.fontmgrSystemFontDir = fontmgrSystemFontDir;
  }

  public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties fontmgrAdobeFontDir(ConfigNodePropertyString fontmgrAdobeFontDir) {
    this.fontmgrAdobeFontDir = fontmgrAdobeFontDir;
    return this;
  }

   /**
   * Get fontmgrAdobeFontDir
   * @return fontmgrAdobeFontDir
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getFontmgrAdobeFontDir() {
    return fontmgrAdobeFontDir;
  }

  public void setFontmgrAdobeFontDir(ConfigNodePropertyString fontmgrAdobeFontDir) {
    this.fontmgrAdobeFontDir = fontmgrAdobeFontDir;
  }

  public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties fontmgrCustomerFontDir(ConfigNodePropertyString fontmgrCustomerFontDir) {
    this.fontmgrCustomerFontDir = fontmgrCustomerFontDir;
    return this;
  }

   /**
   * Get fontmgrCustomerFontDir
   * @return fontmgrCustomerFontDir
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getFontmgrCustomerFontDir() {
    return fontmgrCustomerFontDir;
  }

  public void setFontmgrCustomerFontDir(ConfigNodePropertyString fontmgrCustomerFontDir) {
    this.fontmgrCustomerFontDir = fontmgrCustomerFontDir;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

