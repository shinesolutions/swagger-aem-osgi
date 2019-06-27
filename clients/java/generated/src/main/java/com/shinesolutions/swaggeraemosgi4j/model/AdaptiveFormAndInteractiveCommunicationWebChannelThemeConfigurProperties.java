/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-27T11:23:34.688Z[GMT]")
public class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties {
  public static final String SERIALIZED_NAME_FONT_LIST = "fontList";
  @SerializedName(SERIALIZED_NAME_FONT_LIST)
  private ConfigNodePropertyArray fontList = null;

  public AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties fontList(ConfigNodePropertyArray fontList) {
    this.fontList = fontList;
    return this;
  }

   /**
   * Get fontList
   * @return fontList
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getFontList() {
    return fontList;
  }

  public void setFontList(ConfigNodePropertyArray fontList) {
    this.fontList = fontList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties = (AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties) o;
    return Objects.equals(this.fontList, adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties.fontList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fontList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties {\n");
    sb.append("    fontList: ").append(toIndentedString(fontList)).append("\n");
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
