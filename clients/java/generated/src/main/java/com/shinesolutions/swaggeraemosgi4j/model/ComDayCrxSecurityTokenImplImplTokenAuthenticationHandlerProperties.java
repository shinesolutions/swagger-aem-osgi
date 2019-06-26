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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyDropDown;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-26T13:44:27.963Z[GMT]")
public class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties {
  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private ConfigNodePropertyString path = null;

  public static final String SERIALIZED_NAME_TOKEN_REQUIRED_ATTR = "token.required.attr";
  @SerializedName(SERIALIZED_NAME_TOKEN_REQUIRED_ATTR)
  private ConfigNodePropertyDropDown tokenRequiredAttr = null;

  public static final String SERIALIZED_NAME_TOKEN_ALTERNATE_URL = "token.alternate.url";
  @SerializedName(SERIALIZED_NAME_TOKEN_ALTERNATE_URL)
  private ConfigNodePropertyString tokenAlternateUrl = null;

  public static final String SERIALIZED_NAME_TOKEN_ENCAPSULATED = "token.encapsulated";
  @SerializedName(SERIALIZED_NAME_TOKEN_ENCAPSULATED)
  private ConfigNodePropertyBoolean tokenEncapsulated = null;

  public static final String SERIALIZED_NAME_SKIP_TOKEN_REFRESH = "skip.token.refresh";
  @SerializedName(SERIALIZED_NAME_SKIP_TOKEN_REFRESH)
  private ConfigNodePropertyArray skipTokenRefresh = null;

  public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties tokenRequiredAttr(ConfigNodePropertyDropDown tokenRequiredAttr) {
    this.tokenRequiredAttr = tokenRequiredAttr;
    return this;
  }

   /**
   * Get tokenRequiredAttr
   * @return tokenRequiredAttr
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getTokenRequiredAttr() {
    return tokenRequiredAttr;
  }

  public void setTokenRequiredAttr(ConfigNodePropertyDropDown tokenRequiredAttr) {
    this.tokenRequiredAttr = tokenRequiredAttr;
  }

  public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties tokenAlternateUrl(ConfigNodePropertyString tokenAlternateUrl) {
    this.tokenAlternateUrl = tokenAlternateUrl;
    return this;
  }

   /**
   * Get tokenAlternateUrl
   * @return tokenAlternateUrl
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getTokenAlternateUrl() {
    return tokenAlternateUrl;
  }

  public void setTokenAlternateUrl(ConfigNodePropertyString tokenAlternateUrl) {
    this.tokenAlternateUrl = tokenAlternateUrl;
  }

  public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties tokenEncapsulated(ConfigNodePropertyBoolean tokenEncapsulated) {
    this.tokenEncapsulated = tokenEncapsulated;
    return this;
  }

   /**
   * Get tokenEncapsulated
   * @return tokenEncapsulated
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getTokenEncapsulated() {
    return tokenEncapsulated;
  }

  public void setTokenEncapsulated(ConfigNodePropertyBoolean tokenEncapsulated) {
    this.tokenEncapsulated = tokenEncapsulated;
  }

  public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties skipTokenRefresh(ConfigNodePropertyArray skipTokenRefresh) {
    this.skipTokenRefresh = skipTokenRefresh;
    return this;
  }

   /**
   * Get skipTokenRefresh
   * @return skipTokenRefresh
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getSkipTokenRefresh() {
    return skipTokenRefresh;
  }

  public void setSkipTokenRefresh(ConfigNodePropertyArray skipTokenRefresh) {
    this.skipTokenRefresh = skipTokenRefresh;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties = (ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties) o;
    return Objects.equals(this.path, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.path) &&
        Objects.equals(this.tokenRequiredAttr, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.tokenRequiredAttr) &&
        Objects.equals(this.tokenAlternateUrl, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.tokenAlternateUrl) &&
        Objects.equals(this.tokenEncapsulated, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.tokenEncapsulated) &&
        Objects.equals(this.skipTokenRefresh, comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.skipTokenRefresh);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, tokenRequiredAttr, tokenAlternateUrl, tokenEncapsulated, skipTokenRefresh);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    tokenRequiredAttr: ").append(toIndentedString(tokenRequiredAttr)).append("\n");
    sb.append("    tokenAlternateUrl: ").append(toIndentedString(tokenAlternateUrl)).append("\n");
    sb.append("    tokenEncapsulated: ").append(toIndentedString(tokenEncapsulated)).append("\n");
    sb.append("    skipTokenRefresh: ").append(toIndentedString(skipTokenRefresh)).append("\n");
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

