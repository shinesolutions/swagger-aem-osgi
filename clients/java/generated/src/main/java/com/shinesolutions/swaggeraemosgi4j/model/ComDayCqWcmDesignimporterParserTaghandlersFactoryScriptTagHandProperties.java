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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyInteger;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-27T11:23:34.688Z[GMT]")
public class ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties {
  public static final String SERIALIZED_NAME_SERVICE_RANKING = "service.ranking";
  @SerializedName(SERIALIZED_NAME_SERVICE_RANKING)
  private ConfigNodePropertyInteger serviceRanking = null;

  public static final String SERIALIZED_NAME_TAGPATTERN = "tagpattern";
  @SerializedName(SERIALIZED_NAME_TAGPATTERN)
  private ConfigNodePropertyString tagpattern = null;

  public ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
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

  public ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties tagpattern(ConfigNodePropertyString tagpattern) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties = (ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties) o;
    return Objects.equals(this.serviceRanking, comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties.serviceRanking) &&
        Objects.equals(this.tagpattern, comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties.tagpattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking, tagpattern);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties {\n");
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    tagpattern: ").append(toIndentedString(tagpattern)).append("\n");
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

