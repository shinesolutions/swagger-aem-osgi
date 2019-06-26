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
 * ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-26T12:10:03.209Z[GMT]")
public class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties {
  public static final String SERIALIZED_NAME_CQ_PAGESUPDATEHANDLER_IMAGERESOURCETYPES = "cq.pagesupdatehandler.imageresourcetypes";
  @SerializedName(SERIALIZED_NAME_CQ_PAGESUPDATEHANDLER_IMAGERESOURCETYPES)
  private ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes = null;

  public static final String SERIALIZED_NAME_CQ_PAGESUPDATEHANDLER_PRODUCTRESOURCETYPES = "cq.pagesupdatehandler.productresourcetypes";
  @SerializedName(SERIALIZED_NAME_CQ_PAGESUPDATEHANDLER_PRODUCTRESOURCETYPES)
  private ConfigNodePropertyArray cqPagesupdatehandlerProductresourcetypes = null;

  public static final String SERIALIZED_NAME_CQ_PAGESUPDATEHANDLER_VIDEORESOURCETYPES = "cq.pagesupdatehandler.videoresourcetypes";
  @SerializedName(SERIALIZED_NAME_CQ_PAGESUPDATEHANDLER_VIDEORESOURCETYPES)
  private ConfigNodePropertyArray cqPagesupdatehandlerVideoresourcetypes = null;

  public static final String SERIALIZED_NAME_CQ_PAGESUPDATEHANDLER_DYNAMICSEQUENCERESOURCETYPES = "cq.pagesupdatehandler.dynamicsequenceresourcetypes";
  @SerializedName(SERIALIZED_NAME_CQ_PAGESUPDATEHANDLER_DYNAMICSEQUENCERESOURCETYPES)
  private ConfigNodePropertyArray cqPagesupdatehandlerDynamicsequenceresourcetypes = null;

  public static final String SERIALIZED_NAME_CQ_PAGESUPDATEHANDLER_PREVIEWMODEPATHS = "cq.pagesupdatehandler.previewmodepaths";
  @SerializedName(SERIALIZED_NAME_CQ_PAGESUPDATEHANDLER_PREVIEWMODEPATHS)
  private ConfigNodePropertyArray cqPagesupdatehandlerPreviewmodepaths = null;

  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties cqPagesupdatehandlerImageresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes) {
    this.cqPagesupdatehandlerImageresourcetypes = cqPagesupdatehandlerImageresourcetypes;
    return this;
  }

   /**
   * Get cqPagesupdatehandlerImageresourcetypes
   * @return cqPagesupdatehandlerImageresourcetypes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getCqPagesupdatehandlerImageresourcetypes() {
    return cqPagesupdatehandlerImageresourcetypes;
  }

  public void setCqPagesupdatehandlerImageresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes) {
    this.cqPagesupdatehandlerImageresourcetypes = cqPagesupdatehandlerImageresourcetypes;
  }

  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties cqPagesupdatehandlerProductresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerProductresourcetypes) {
    this.cqPagesupdatehandlerProductresourcetypes = cqPagesupdatehandlerProductresourcetypes;
    return this;
  }

   /**
   * Get cqPagesupdatehandlerProductresourcetypes
   * @return cqPagesupdatehandlerProductresourcetypes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getCqPagesupdatehandlerProductresourcetypes() {
    return cqPagesupdatehandlerProductresourcetypes;
  }

  public void setCqPagesupdatehandlerProductresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerProductresourcetypes) {
    this.cqPagesupdatehandlerProductresourcetypes = cqPagesupdatehandlerProductresourcetypes;
  }

  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties cqPagesupdatehandlerVideoresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerVideoresourcetypes) {
    this.cqPagesupdatehandlerVideoresourcetypes = cqPagesupdatehandlerVideoresourcetypes;
    return this;
  }

   /**
   * Get cqPagesupdatehandlerVideoresourcetypes
   * @return cqPagesupdatehandlerVideoresourcetypes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getCqPagesupdatehandlerVideoresourcetypes() {
    return cqPagesupdatehandlerVideoresourcetypes;
  }

  public void setCqPagesupdatehandlerVideoresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerVideoresourcetypes) {
    this.cqPagesupdatehandlerVideoresourcetypes = cqPagesupdatehandlerVideoresourcetypes;
  }

  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties cqPagesupdatehandlerDynamicsequenceresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerDynamicsequenceresourcetypes) {
    this.cqPagesupdatehandlerDynamicsequenceresourcetypes = cqPagesupdatehandlerDynamicsequenceresourcetypes;
    return this;
  }

   /**
   * Get cqPagesupdatehandlerDynamicsequenceresourcetypes
   * @return cqPagesupdatehandlerDynamicsequenceresourcetypes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getCqPagesupdatehandlerDynamicsequenceresourcetypes() {
    return cqPagesupdatehandlerDynamicsequenceresourcetypes;
  }

  public void setCqPagesupdatehandlerDynamicsequenceresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerDynamicsequenceresourcetypes) {
    this.cqPagesupdatehandlerDynamicsequenceresourcetypes = cqPagesupdatehandlerDynamicsequenceresourcetypes;
  }

  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties cqPagesupdatehandlerPreviewmodepaths(ConfigNodePropertyArray cqPagesupdatehandlerPreviewmodepaths) {
    this.cqPagesupdatehandlerPreviewmodepaths = cqPagesupdatehandlerPreviewmodepaths;
    return this;
  }

   /**
   * Get cqPagesupdatehandlerPreviewmodepaths
   * @return cqPagesupdatehandlerPreviewmodepaths
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getCqPagesupdatehandlerPreviewmodepaths() {
    return cqPagesupdatehandlerPreviewmodepaths;
  }

  public void setCqPagesupdatehandlerPreviewmodepaths(ConfigNodePropertyArray cqPagesupdatehandlerPreviewmodepaths) {
    this.cqPagesupdatehandlerPreviewmodepaths = cqPagesupdatehandlerPreviewmodepaths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties = (ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties) o;
    return Objects.equals(this.cqPagesupdatehandlerImageresourcetypes, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerImageresourcetypes) &&
        Objects.equals(this.cqPagesupdatehandlerProductresourcetypes, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerProductresourcetypes) &&
        Objects.equals(this.cqPagesupdatehandlerVideoresourcetypes, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerVideoresourcetypes) &&
        Objects.equals(this.cqPagesupdatehandlerDynamicsequenceresourcetypes, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerDynamicsequenceresourcetypes) &&
        Objects.equals(this.cqPagesupdatehandlerPreviewmodepaths, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerPreviewmodepaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqPagesupdatehandlerImageresourcetypes, cqPagesupdatehandlerProductresourcetypes, cqPagesupdatehandlerVideoresourcetypes, cqPagesupdatehandlerDynamicsequenceresourcetypes, cqPagesupdatehandlerPreviewmodepaths);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties {\n");
    sb.append("    cqPagesupdatehandlerImageresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerImageresourcetypes)).append("\n");
    sb.append("    cqPagesupdatehandlerProductresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerProductresourcetypes)).append("\n");
    sb.append("    cqPagesupdatehandlerVideoresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerVideoresourcetypes)).append("\n");
    sb.append("    cqPagesupdatehandlerDynamicsequenceresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerDynamicsequenceresourcetypes)).append("\n");
    sb.append("    cqPagesupdatehandlerPreviewmodepaths: ").append(toIndentedString(cqPagesupdatehandlerPreviewmodepaths)).append("\n");
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

