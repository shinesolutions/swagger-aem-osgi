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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyInteger;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComDayCqAuthImplLoginSelectorHandlerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-26T13:44:27.963Z[GMT]")
public class ComDayCqAuthImplLoginSelectorHandlerProperties {
  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private ConfigNodePropertyString path = null;

  public static final String SERIALIZED_NAME_SERVICE_RANKING = "service.ranking";
  @SerializedName(SERIALIZED_NAME_SERVICE_RANKING)
  private ConfigNodePropertyInteger serviceRanking = null;

  public static final String SERIALIZED_NAME_AUTH_LOGINSELECTOR_MAPPINGS = "auth.loginselector.mappings";
  @SerializedName(SERIALIZED_NAME_AUTH_LOGINSELECTOR_MAPPINGS)
  private ConfigNodePropertyArray authLoginselectorMappings = null;

  public static final String SERIALIZED_NAME_AUTH_LOGINSELECTOR_CHANGEPW_MAPPINGS = "auth.loginselector.changepw.mappings";
  @SerializedName(SERIALIZED_NAME_AUTH_LOGINSELECTOR_CHANGEPW_MAPPINGS)
  private ConfigNodePropertyArray authLoginselectorChangepwMappings = null;

  public static final String SERIALIZED_NAME_AUTH_LOGINSELECTOR_DEFAULTLOGINPAGE = "auth.loginselector.defaultloginpage";
  @SerializedName(SERIALIZED_NAME_AUTH_LOGINSELECTOR_DEFAULTLOGINPAGE)
  private ConfigNodePropertyString authLoginselectorDefaultloginpage = null;

  public static final String SERIALIZED_NAME_AUTH_LOGINSELECTOR_DEFAULTCHANGEPWPAGE = "auth.loginselector.defaultchangepwpage";
  @SerializedName(SERIALIZED_NAME_AUTH_LOGINSELECTOR_DEFAULTCHANGEPWPAGE)
  private ConfigNodePropertyString authLoginselectorDefaultchangepwpage = null;

  public static final String SERIALIZED_NAME_AUTH_LOGINSELECTOR_HANDLE = "auth.loginselector.handle";
  @SerializedName(SERIALIZED_NAME_AUTH_LOGINSELECTOR_HANDLE)
  private ConfigNodePropertyArray authLoginselectorHandle = null;

  public static final String SERIALIZED_NAME_AUTH_LOGINSELECTOR_HANDLE_ALL_EXTENSIONS = "auth.loginselector.handle.all.extensions";
  @SerializedName(SERIALIZED_NAME_AUTH_LOGINSELECTOR_HANDLE_ALL_EXTENSIONS)
  private ConfigNodePropertyBoolean authLoginselectorHandleAllExtensions = null;

  public ComDayCqAuthImplLoginSelectorHandlerProperties path(ConfigNodePropertyString path) {
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

  public ComDayCqAuthImplLoginSelectorHandlerProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
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

  public ComDayCqAuthImplLoginSelectorHandlerProperties authLoginselectorMappings(ConfigNodePropertyArray authLoginselectorMappings) {
    this.authLoginselectorMappings = authLoginselectorMappings;
    return this;
  }

   /**
   * Get authLoginselectorMappings
   * @return authLoginselectorMappings
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getAuthLoginselectorMappings() {
    return authLoginselectorMappings;
  }

  public void setAuthLoginselectorMappings(ConfigNodePropertyArray authLoginselectorMappings) {
    this.authLoginselectorMappings = authLoginselectorMappings;
  }

  public ComDayCqAuthImplLoginSelectorHandlerProperties authLoginselectorChangepwMappings(ConfigNodePropertyArray authLoginselectorChangepwMappings) {
    this.authLoginselectorChangepwMappings = authLoginselectorChangepwMappings;
    return this;
  }

   /**
   * Get authLoginselectorChangepwMappings
   * @return authLoginselectorChangepwMappings
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getAuthLoginselectorChangepwMappings() {
    return authLoginselectorChangepwMappings;
  }

  public void setAuthLoginselectorChangepwMappings(ConfigNodePropertyArray authLoginselectorChangepwMappings) {
    this.authLoginselectorChangepwMappings = authLoginselectorChangepwMappings;
  }

  public ComDayCqAuthImplLoginSelectorHandlerProperties authLoginselectorDefaultloginpage(ConfigNodePropertyString authLoginselectorDefaultloginpage) {
    this.authLoginselectorDefaultloginpage = authLoginselectorDefaultloginpage;
    return this;
  }

   /**
   * Get authLoginselectorDefaultloginpage
   * @return authLoginselectorDefaultloginpage
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getAuthLoginselectorDefaultloginpage() {
    return authLoginselectorDefaultloginpage;
  }

  public void setAuthLoginselectorDefaultloginpage(ConfigNodePropertyString authLoginselectorDefaultloginpage) {
    this.authLoginselectorDefaultloginpage = authLoginselectorDefaultloginpage;
  }

  public ComDayCqAuthImplLoginSelectorHandlerProperties authLoginselectorDefaultchangepwpage(ConfigNodePropertyString authLoginselectorDefaultchangepwpage) {
    this.authLoginselectorDefaultchangepwpage = authLoginselectorDefaultchangepwpage;
    return this;
  }

   /**
   * Get authLoginselectorDefaultchangepwpage
   * @return authLoginselectorDefaultchangepwpage
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getAuthLoginselectorDefaultchangepwpage() {
    return authLoginselectorDefaultchangepwpage;
  }

  public void setAuthLoginselectorDefaultchangepwpage(ConfigNodePropertyString authLoginselectorDefaultchangepwpage) {
    this.authLoginselectorDefaultchangepwpage = authLoginselectorDefaultchangepwpage;
  }

  public ComDayCqAuthImplLoginSelectorHandlerProperties authLoginselectorHandle(ConfigNodePropertyArray authLoginselectorHandle) {
    this.authLoginselectorHandle = authLoginselectorHandle;
    return this;
  }

   /**
   * Get authLoginselectorHandle
   * @return authLoginselectorHandle
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getAuthLoginselectorHandle() {
    return authLoginselectorHandle;
  }

  public void setAuthLoginselectorHandle(ConfigNodePropertyArray authLoginselectorHandle) {
    this.authLoginselectorHandle = authLoginselectorHandle;
  }

  public ComDayCqAuthImplLoginSelectorHandlerProperties authLoginselectorHandleAllExtensions(ConfigNodePropertyBoolean authLoginselectorHandleAllExtensions) {
    this.authLoginselectorHandleAllExtensions = authLoginselectorHandleAllExtensions;
    return this;
  }

   /**
   * Get authLoginselectorHandleAllExtensions
   * @return authLoginselectorHandleAllExtensions
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getAuthLoginselectorHandleAllExtensions() {
    return authLoginselectorHandleAllExtensions;
  }

  public void setAuthLoginselectorHandleAllExtensions(ConfigNodePropertyBoolean authLoginselectorHandleAllExtensions) {
    this.authLoginselectorHandleAllExtensions = authLoginselectorHandleAllExtensions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqAuthImplLoginSelectorHandlerProperties comDayCqAuthImplLoginSelectorHandlerProperties = (ComDayCqAuthImplLoginSelectorHandlerProperties) o;
    return Objects.equals(this.path, comDayCqAuthImplLoginSelectorHandlerProperties.path) &&
        Objects.equals(this.serviceRanking, comDayCqAuthImplLoginSelectorHandlerProperties.serviceRanking) &&
        Objects.equals(this.authLoginselectorMappings, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorMappings) &&
        Objects.equals(this.authLoginselectorChangepwMappings, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorChangepwMappings) &&
        Objects.equals(this.authLoginselectorDefaultloginpage, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorDefaultloginpage) &&
        Objects.equals(this.authLoginselectorDefaultchangepwpage, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorDefaultchangepwpage) &&
        Objects.equals(this.authLoginselectorHandle, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorHandle) &&
        Objects.equals(this.authLoginselectorHandleAllExtensions, comDayCqAuthImplLoginSelectorHandlerProperties.authLoginselectorHandleAllExtensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, serviceRanking, authLoginselectorMappings, authLoginselectorChangepwMappings, authLoginselectorDefaultloginpage, authLoginselectorDefaultchangepwpage, authLoginselectorHandle, authLoginselectorHandleAllExtensions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqAuthImplLoginSelectorHandlerProperties {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    authLoginselectorMappings: ").append(toIndentedString(authLoginselectorMappings)).append("\n");
    sb.append("    authLoginselectorChangepwMappings: ").append(toIndentedString(authLoginselectorChangepwMappings)).append("\n");
    sb.append("    authLoginselectorDefaultloginpage: ").append(toIndentedString(authLoginselectorDefaultloginpage)).append("\n");
    sb.append("    authLoginselectorDefaultchangepwpage: ").append(toIndentedString(authLoginselectorDefaultchangepwpage)).append("\n");
    sb.append("    authLoginselectorHandle: ").append(toIndentedString(authLoginselectorHandle)).append("\n");
    sb.append("    authLoginselectorHandleAllExtensions: ").append(toIndentedString(authLoginselectorHandleAllExtensions)).append("\n");
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

