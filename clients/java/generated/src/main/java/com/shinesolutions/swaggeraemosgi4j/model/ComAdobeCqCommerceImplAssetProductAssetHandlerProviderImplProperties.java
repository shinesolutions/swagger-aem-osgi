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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-26T13:44:27.963Z[GMT]")
public class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties {
  public static final String SERIALIZED_NAME_CQ_COMMERCE_ASSET_HANDLER_FALLBACK = "cq.commerce.asset.handler.fallback";
  @SerializedName(SERIALIZED_NAME_CQ_COMMERCE_ASSET_HANDLER_FALLBACK)
  private ConfigNodePropertyString cqCommerceAssetHandlerFallback = null;

  public ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties cqCommerceAssetHandlerFallback(ConfigNodePropertyString cqCommerceAssetHandlerFallback) {
    this.cqCommerceAssetHandlerFallback = cqCommerceAssetHandlerFallback;
    return this;
  }

   /**
   * Get cqCommerceAssetHandlerFallback
   * @return cqCommerceAssetHandlerFallback
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getCqCommerceAssetHandlerFallback() {
    return cqCommerceAssetHandlerFallback;
  }

  public void setCqCommerceAssetHandlerFallback(ConfigNodePropertyString cqCommerceAssetHandlerFallback) {
    this.cqCommerceAssetHandlerFallback = cqCommerceAssetHandlerFallback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties = (ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties) o;
    return Objects.equals(this.cqCommerceAssetHandlerFallback, comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties.cqCommerceAssetHandlerFallback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqCommerceAssetHandlerFallback);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties {\n");
    sb.append("    cqCommerceAssetHandlerFallback: ").append(toIndentedString(cqCommerceAssetHandlerFallback)).append("\n");
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

