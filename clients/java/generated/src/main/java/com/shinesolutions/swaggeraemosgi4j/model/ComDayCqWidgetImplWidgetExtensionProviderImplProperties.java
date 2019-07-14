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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComDayCqWidgetImplWidgetExtensionProviderImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-14T23:44:05.965Z[GMT]")
public class ComDayCqWidgetImplWidgetExtensionProviderImplProperties {
  public static final String SERIALIZED_NAME_EXTENDABLE_WIDGETS = "extendable.widgets";
  @SerializedName(SERIALIZED_NAME_EXTENDABLE_WIDGETS)
  private ConfigNodePropertyArray extendableWidgets = null;

  public static final String SERIALIZED_NAME_WIDGETEXTENSIONPROVIDER_DEBUG = "widgetextensionprovider.debug";
  @SerializedName(SERIALIZED_NAME_WIDGETEXTENSIONPROVIDER_DEBUG)
  private ConfigNodePropertyBoolean widgetextensionproviderDebug = null;

  public ComDayCqWidgetImplWidgetExtensionProviderImplProperties extendableWidgets(ConfigNodePropertyArray extendableWidgets) {
    this.extendableWidgets = extendableWidgets;
    return this;
  }

   /**
   * Get extendableWidgets
   * @return extendableWidgets
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getExtendableWidgets() {
    return extendableWidgets;
  }

  public void setExtendableWidgets(ConfigNodePropertyArray extendableWidgets) {
    this.extendableWidgets = extendableWidgets;
  }

  public ComDayCqWidgetImplWidgetExtensionProviderImplProperties widgetextensionproviderDebug(ConfigNodePropertyBoolean widgetextensionproviderDebug) {
    this.widgetextensionproviderDebug = widgetextensionproviderDebug;
    return this;
  }

   /**
   * Get widgetextensionproviderDebug
   * @return widgetextensionproviderDebug
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getWidgetextensionproviderDebug() {
    return widgetextensionproviderDebug;
  }

  public void setWidgetextensionproviderDebug(ConfigNodePropertyBoolean widgetextensionproviderDebug) {
    this.widgetextensionproviderDebug = widgetextensionproviderDebug;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWidgetImplWidgetExtensionProviderImplProperties comDayCqWidgetImplWidgetExtensionProviderImplProperties = (ComDayCqWidgetImplWidgetExtensionProviderImplProperties) o;
    return Objects.equals(this.extendableWidgets, comDayCqWidgetImplWidgetExtensionProviderImplProperties.extendableWidgets) &&
        Objects.equals(this.widgetextensionproviderDebug, comDayCqWidgetImplWidgetExtensionProviderImplProperties.widgetextensionproviderDebug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extendableWidgets, widgetextensionproviderDebug);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWidgetImplWidgetExtensionProviderImplProperties {\n");
    sb.append("    extendableWidgets: ").append(toIndentedString(extendableWidgets)).append("\n");
    sb.append("    widgetextensionproviderDebug: ").append(toIndentedString(widgetextensionproviderDebug)).append("\n");
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

