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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComDayCqDamCoreImplServletCreateAssetServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-26T13:44:27.963Z[GMT]")
public class ComDayCqDamCoreImplServletCreateAssetServletProperties {
  public static final String SERIALIZED_NAME_DETECT_DUPLICATE = "detect_duplicate";
  @SerializedName(SERIALIZED_NAME_DETECT_DUPLICATE)
  private ConfigNodePropertyBoolean detectDuplicate = null;

  public ComDayCqDamCoreImplServletCreateAssetServletProperties detectDuplicate(ConfigNodePropertyBoolean detectDuplicate) {
    this.detectDuplicate = detectDuplicate;
    return this;
  }

   /**
   * Get detectDuplicate
   * @return detectDuplicate
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getDetectDuplicate() {
    return detectDuplicate;
  }

  public void setDetectDuplicate(ConfigNodePropertyBoolean detectDuplicate) {
    this.detectDuplicate = detectDuplicate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletCreateAssetServletProperties comDayCqDamCoreImplServletCreateAssetServletProperties = (ComDayCqDamCoreImplServletCreateAssetServletProperties) o;
    return Objects.equals(this.detectDuplicate, comDayCqDamCoreImplServletCreateAssetServletProperties.detectDuplicate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detectDuplicate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletCreateAssetServletProperties {\n");
    sb.append("    detectDuplicate: ").append(toIndentedString(detectDuplicate)).append("\n");
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

