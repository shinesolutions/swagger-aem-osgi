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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-27T02:21:59.870Z[GMT]")
public class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties {
  public static final String SERIALIZED_NAME_WORKFLOWPACKAGEINFOPROVIDER_FILTER = "workflowpackageinfoprovider.filter";
  @SerializedName(SERIALIZED_NAME_WORKFLOWPACKAGEINFOPROVIDER_FILTER)
  private ConfigNodePropertyArray workflowpackageinfoproviderFilter = null;

  public static final String SERIALIZED_NAME_WORKFLOWPACKAGEINFOPROVIDER_FILTER_ROOTPATH = "workflowpackageinfoprovider.filter.rootpath";
  @SerializedName(SERIALIZED_NAME_WORKFLOWPACKAGEINFOPROVIDER_FILTER_ROOTPATH)
  private ConfigNodePropertyString workflowpackageinfoproviderFilterRootpath = null;

  public ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties workflowpackageinfoproviderFilter(ConfigNodePropertyArray workflowpackageinfoproviderFilter) {
    this.workflowpackageinfoproviderFilter = workflowpackageinfoproviderFilter;
    return this;
  }

   /**
   * Get workflowpackageinfoproviderFilter
   * @return workflowpackageinfoproviderFilter
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getWorkflowpackageinfoproviderFilter() {
    return workflowpackageinfoproviderFilter;
  }

  public void setWorkflowpackageinfoproviderFilter(ConfigNodePropertyArray workflowpackageinfoproviderFilter) {
    this.workflowpackageinfoproviderFilter = workflowpackageinfoproviderFilter;
  }

  public ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties workflowpackageinfoproviderFilterRootpath(ConfigNodePropertyString workflowpackageinfoproviderFilterRootpath) {
    this.workflowpackageinfoproviderFilterRootpath = workflowpackageinfoproviderFilterRootpath;
    return this;
  }

   /**
   * Get workflowpackageinfoproviderFilterRootpath
   * @return workflowpackageinfoproviderFilterRootpath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getWorkflowpackageinfoproviderFilterRootpath() {
    return workflowpackageinfoproviderFilterRootpath;
  }

  public void setWorkflowpackageinfoproviderFilterRootpath(ConfigNodePropertyString workflowpackageinfoproviderFilterRootpath) {
    this.workflowpackageinfoproviderFilterRootpath = workflowpackageinfoproviderFilterRootpath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties = (ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties) o;
    return Objects.equals(this.workflowpackageinfoproviderFilter, comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.workflowpackageinfoproviderFilter) &&
        Objects.equals(this.workflowpackageinfoproviderFilterRootpath, comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.workflowpackageinfoproviderFilterRootpath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowpackageinfoproviderFilter, workflowpackageinfoproviderFilterRootpath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties {\n");
    sb.append("    workflowpackageinfoproviderFilter: ").append(toIndentedString(workflowpackageinfoproviderFilter)).append("\n");
    sb.append("    workflowpackageinfoproviderFilterRootpath: ").append(toIndentedString(workflowpackageinfoproviderFilterRootpath)).append("\n");
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

