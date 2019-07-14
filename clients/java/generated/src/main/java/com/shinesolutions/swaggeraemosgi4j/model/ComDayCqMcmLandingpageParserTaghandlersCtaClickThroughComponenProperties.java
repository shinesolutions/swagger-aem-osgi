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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyInteger;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-14T23:44:05.965Z[GMT]")
public class ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties {
  public static final String SERIALIZED_NAME_SERVICE_RANKING = "service.ranking";
  @SerializedName(SERIALIZED_NAME_SERVICE_RANKING)
  private ConfigNodePropertyInteger serviceRanking = null;

  public static final String SERIALIZED_NAME_TAGPATTERN = "tagpattern";
  @SerializedName(SERIALIZED_NAME_TAGPATTERN)
  private ConfigNodePropertyString tagpattern = null;

  public static final String SERIALIZED_NAME_COMPONENT_RESOURCE_TYPE = "component.resourceType";
  @SerializedName(SERIALIZED_NAME_COMPONENT_RESOURCE_TYPE)
  private ConfigNodePropertyString componentResourceType = null;

  public ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

   /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties tagpattern(ConfigNodePropertyString tagpattern) {
    this.tagpattern = tagpattern;
    return this;
  }

   /**
   * Get tagpattern
   * @return tagpattern
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getTagpattern() {
    return tagpattern;
  }

  public void setTagpattern(ConfigNodePropertyString tagpattern) {
    this.tagpattern = tagpattern;
  }

  public ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties componentResourceType(ConfigNodePropertyString componentResourceType) {
    this.componentResourceType = componentResourceType;
    return this;
  }

   /**
   * Get componentResourceType
   * @return componentResourceType
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getComponentResourceType() {
    return componentResourceType;
  }

  public void setComponentResourceType(ConfigNodePropertyString componentResourceType) {
    this.componentResourceType = componentResourceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties = (ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties) o;
    return Objects.equals(this.serviceRanking, comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties.serviceRanking) &&
        Objects.equals(this.tagpattern, comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties.tagpattern) &&
        Objects.equals(this.componentResourceType, comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties.componentResourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking, tagpattern, componentResourceType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties {\n");
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    tagpattern: ").append(toIndentedString(tagpattern)).append("\n");
    sb.append("    componentResourceType: ").append(toIndentedString(componentResourceType)).append("\n");
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

