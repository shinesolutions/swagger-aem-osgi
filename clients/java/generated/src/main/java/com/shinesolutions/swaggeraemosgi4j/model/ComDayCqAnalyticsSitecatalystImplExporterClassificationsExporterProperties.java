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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-26T12:10:03.209Z[GMT]")
public class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporterProperties {
  public static final String SERIALIZED_NAME_ALLOWED_PATHS = "allowed.paths";
  @SerializedName(SERIALIZED_NAME_ALLOWED_PATHS)
  private ConfigNodePropertyArray allowedPaths = null;

  public static final String SERIALIZED_NAME_CQ_ANALYTICS_SAINT_EXPORTER_PAGESIZE = "cq.analytics.saint.exporter.pagesize";
  @SerializedName(SERIALIZED_NAME_CQ_ANALYTICS_SAINT_EXPORTER_PAGESIZE)
  private ConfigNodePropertyInteger cqAnalyticsSaintExporterPagesize = null;

  public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporterProperties allowedPaths(ConfigNodePropertyArray allowedPaths) {
    this.allowedPaths = allowedPaths;
    return this;
  }

   /**
   * Get allowedPaths
   * @return allowedPaths
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getAllowedPaths() {
    return allowedPaths;
  }

  public void setAllowedPaths(ConfigNodePropertyArray allowedPaths) {
    this.allowedPaths = allowedPaths;
  }

  public ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporterProperties cqAnalyticsSaintExporterPagesize(ConfigNodePropertyInteger cqAnalyticsSaintExporterPagesize) {
    this.cqAnalyticsSaintExporterPagesize = cqAnalyticsSaintExporterPagesize;
    return this;
  }

   /**
   * Get cqAnalyticsSaintExporterPagesize
   * @return cqAnalyticsSaintExporterPagesize
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCqAnalyticsSaintExporterPagesize() {
    return cqAnalyticsSaintExporterPagesize;
  }

  public void setCqAnalyticsSaintExporterPagesize(ConfigNodePropertyInteger cqAnalyticsSaintExporterPagesize) {
    this.cqAnalyticsSaintExporterPagesize = cqAnalyticsSaintExporterPagesize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporterProperties comDayCqAnalyticsSitecatalystImplExporterClassificationsExporterProperties = (ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporterProperties) o;
    return Objects.equals(this.allowedPaths, comDayCqAnalyticsSitecatalystImplExporterClassificationsExporterProperties.allowedPaths) &&
        Objects.equals(this.cqAnalyticsSaintExporterPagesize, comDayCqAnalyticsSitecatalystImplExporterClassificationsExporterProperties.cqAnalyticsSaintExporterPagesize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedPaths, cqAnalyticsSaintExporterPagesize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporterProperties {\n");
    sb.append("    allowedPaths: ").append(toIndentedString(allowedPaths)).append("\n");
    sb.append("    cqAnalyticsSaintExporterPagesize: ").append(toIndentedString(cqAnalyticsSaintExporterPagesize)).append("\n");
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

