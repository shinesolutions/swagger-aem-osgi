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
import com.shinesolutions.swaggeraemosgi4j.model.ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-14T23:44:05.965Z[GMT]")
public class ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo {
  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties properties = null;

  public static final String SERIALIZED_NAME_BUNDLE_LOCATION = "bundle_location";
  @SerializedName(SERIALIZED_NAME_BUNDLE_LOCATION)
  private String bundleLocation;

  public static final String SERIALIZED_NAME_SERVICE_LOCATION = "service_location";
  @SerializedName(SERIALIZED_NAME_SERVICE_LOCATION)
  private String serviceLocation;

  public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

   /**
   * Get pid
   * @return pid
  **/
  @ApiModelProperty(value = "")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo properties(ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties getProperties() {
    return properties;
  }

  public void setProperties(ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties properties) {
    this.properties = properties;
  }

  public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo bundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
    return this;
  }

   /**
   * Get bundleLocation
   * @return bundleLocation
  **/
  @ApiModelProperty(value = "")
  public String getBundleLocation() {
    return bundleLocation;
  }

  public void setBundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
  }

  public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo serviceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
    return this;
  }

   /**
   * Get serviceLocation
   * @return serviceLocation
  **/
  @ApiModelProperty(value = "")
  public String getServiceLocation() {
    return serviceLocation;
  }

  public void setServiceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo = (ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo) o;
    return Objects.equals(this.pid, comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo.pid) &&
        Objects.equals(this.title, comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo.title) &&
        Objects.equals(this.description, comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo.description) &&
        Objects.equals(this.properties, comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo.properties) &&
        Objects.equals(this.bundleLocation, comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo.bundleLocation) &&
        Objects.equals(this.serviceLocation, comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, bundleLocation, serviceLocation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo {\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    bundleLocation: ").append(toIndentedString(bundleLocation)).append("\n");
    sb.append("    serviceLocation: ").append(toIndentedString(serviceLocation)).append("\n");
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

