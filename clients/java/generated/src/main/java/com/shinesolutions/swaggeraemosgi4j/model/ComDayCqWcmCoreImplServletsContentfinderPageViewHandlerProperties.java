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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyBoolean;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-26T12:10:03.209Z[GMT]")
public class ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties {
  public static final String SERIALIZED_NAME_GUESS_TOTAL = "guessTotal";
  @SerializedName(SERIALIZED_NAME_GUESS_TOTAL)
  private ConfigNodePropertyString guessTotal = null;

  public static final String SERIALIZED_NAME_TAG_TITLE_SEARCH = "tagTitleSearch";
  @SerializedName(SERIALIZED_NAME_TAG_TITLE_SEARCH)
  private ConfigNodePropertyBoolean tagTitleSearch = null;

  public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties guessTotal(ConfigNodePropertyString guessTotal) {
    this.guessTotal = guessTotal;
    return this;
  }

   /**
   * Get guessTotal
   * @return guessTotal
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getGuessTotal() {
    return guessTotal;
  }

  public void setGuessTotal(ConfigNodePropertyString guessTotal) {
    this.guessTotal = guessTotal;
  }

  public ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties tagTitleSearch(ConfigNodePropertyBoolean tagTitleSearch) {
    this.tagTitleSearch = tagTitleSearch;
    return this;
  }

   /**
   * Get tagTitleSearch
   * @return tagTitleSearch
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getTagTitleSearch() {
    return tagTitleSearch;
  }

  public void setTagTitleSearch(ConfigNodePropertyBoolean tagTitleSearch) {
    this.tagTitleSearch = tagTitleSearch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties = (ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties) o;
    return Objects.equals(this.guessTotal, comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.guessTotal) &&
        Objects.equals(this.tagTitleSearch, comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.tagTitleSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guessTotal, tagTitleSearch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties {\n");
    sb.append("    guessTotal: ").append(toIndentedString(guessTotal)).append("\n");
    sb.append("    tagTitleSearch: ").append(toIndentedString(tagTitleSearch)).append("\n");
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
