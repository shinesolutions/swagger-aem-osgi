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
 * ComDayCqDamCoreImplServletAssetStatusServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-27T11:23:34.688Z[GMT]")
public class ComDayCqDamCoreImplServletAssetStatusServletProperties {
  public static final String SERIALIZED_NAME_CQ_DAM_BATCH_STATUS_MAXASSETS = "cq.dam.batch.status.maxassets";
  @SerializedName(SERIALIZED_NAME_CQ_DAM_BATCH_STATUS_MAXASSETS)
  private ConfigNodePropertyInteger cqDamBatchStatusMaxassets = null;

  public ComDayCqDamCoreImplServletAssetStatusServletProperties cqDamBatchStatusMaxassets(ConfigNodePropertyInteger cqDamBatchStatusMaxassets) {
    this.cqDamBatchStatusMaxassets = cqDamBatchStatusMaxassets;
    return this;
  }

   /**
   * Get cqDamBatchStatusMaxassets
   * @return cqDamBatchStatusMaxassets
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCqDamBatchStatusMaxassets() {
    return cqDamBatchStatusMaxassets;
  }

  public void setCqDamBatchStatusMaxassets(ConfigNodePropertyInteger cqDamBatchStatusMaxassets) {
    this.cqDamBatchStatusMaxassets = cqDamBatchStatusMaxassets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletAssetStatusServletProperties comDayCqDamCoreImplServletAssetStatusServletProperties = (ComDayCqDamCoreImplServletAssetStatusServletProperties) o;
    return Objects.equals(this.cqDamBatchStatusMaxassets, comDayCqDamCoreImplServletAssetStatusServletProperties.cqDamBatchStatusMaxassets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamBatchStatusMaxassets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletAssetStatusServletProperties {\n");
    sb.append("    cqDamBatchStatusMaxassets: ").append(toIndentedString(cqDamBatchStatusMaxassets)).append("\n");
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

