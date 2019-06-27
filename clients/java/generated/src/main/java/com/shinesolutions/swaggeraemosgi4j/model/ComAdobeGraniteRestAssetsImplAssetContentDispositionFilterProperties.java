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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-27T02:21:59.870Z[GMT]")
public class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties {
  public static final String SERIALIZED_NAME_MIME_ALLOW_EMPTY = "mime.allowEmpty";
  @SerializedName(SERIALIZED_NAME_MIME_ALLOW_EMPTY)
  private ConfigNodePropertyBoolean mimeAllowEmpty = null;

  public static final String SERIALIZED_NAME_MIME_ALLOWED = "mime.allowed";
  @SerializedName(SERIALIZED_NAME_MIME_ALLOWED)
  private ConfigNodePropertyArray mimeAllowed = null;

  public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties mimeAllowEmpty(ConfigNodePropertyBoolean mimeAllowEmpty) {
    this.mimeAllowEmpty = mimeAllowEmpty;
    return this;
  }

   /**
   * Get mimeAllowEmpty
   * @return mimeAllowEmpty
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getMimeAllowEmpty() {
    return mimeAllowEmpty;
  }

  public void setMimeAllowEmpty(ConfigNodePropertyBoolean mimeAllowEmpty) {
    this.mimeAllowEmpty = mimeAllowEmpty;
  }

  public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties mimeAllowed(ConfigNodePropertyArray mimeAllowed) {
    this.mimeAllowed = mimeAllowed;
    return this;
  }

   /**
   * Get mimeAllowed
   * @return mimeAllowed
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getMimeAllowed() {
    return mimeAllowed;
  }

  public void setMimeAllowed(ConfigNodePropertyArray mimeAllowed) {
    this.mimeAllowed = mimeAllowed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties = (ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties) o;
    return Objects.equals(this.mimeAllowEmpty, comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.mimeAllowEmpty) &&
        Objects.equals(this.mimeAllowed, comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.mimeAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mimeAllowEmpty, mimeAllowed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties {\n");
    sb.append("    mimeAllowEmpty: ").append(toIndentedString(mimeAllowEmpty)).append("\n");
    sb.append("    mimeAllowed: ").append(toIndentedString(mimeAllowed)).append("\n");
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

