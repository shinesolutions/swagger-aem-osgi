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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComDayCqDamCoreImplReportsReportExportServiceProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-26T12:10:03.209Z[GMT]")
public class ComDayCqDamCoreImplReportsReportExportServiceProperties {
  public static final String SERIALIZED_NAME_QUERY_BATCH_SIZE = "queryBatchSize";
  @SerializedName(SERIALIZED_NAME_QUERY_BATCH_SIZE)
  private ConfigNodePropertyInteger queryBatchSize = null;

  public ComDayCqDamCoreImplReportsReportExportServiceProperties queryBatchSize(ConfigNodePropertyInteger queryBatchSize) {
    this.queryBatchSize = queryBatchSize;
    return this;
  }

   /**
   * Get queryBatchSize
   * @return queryBatchSize
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getQueryBatchSize() {
    return queryBatchSize;
  }

  public void setQueryBatchSize(ConfigNodePropertyInteger queryBatchSize) {
    this.queryBatchSize = queryBatchSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplReportsReportExportServiceProperties comDayCqDamCoreImplReportsReportExportServiceProperties = (ComDayCqDamCoreImplReportsReportExportServiceProperties) o;
    return Objects.equals(this.queryBatchSize, comDayCqDamCoreImplReportsReportExportServiceProperties.queryBatchSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryBatchSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplReportsReportExportServiceProperties {\n");
    sb.append("    queryBatchSize: ").append(toIndentedString(queryBatchSize)).append("\n");
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

