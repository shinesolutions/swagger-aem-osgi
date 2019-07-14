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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyArray;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-14T23:44:05.965Z[GMT]")
public class ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties {
  public static final String SERIALIZED_NAME_HC_TAGS = "hc.tags";
  @SerializedName(SERIALIZED_NAME_HC_TAGS)
  private ConfigNodePropertyArray hcTags = null;

  public static final String SERIALIZED_NAME_MAX_QUEUED_JOBS = "max.queued.jobs";
  @SerializedName(SERIALIZED_NAME_MAX_QUEUED_JOBS)
  private ConfigNodePropertyInteger maxQueuedJobs = null;

  public ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

   /**
   * Get hcTags
   * @return hcTags
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties maxQueuedJobs(ConfigNodePropertyInteger maxQueuedJobs) {
    this.maxQueuedJobs = maxQueuedJobs;
    return this;
  }

   /**
   * Get maxQueuedJobs
   * @return maxQueuedJobs
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMaxQueuedJobs() {
    return maxQueuedJobs;
  }

  public void setMaxQueuedJobs(ConfigNodePropertyInteger maxQueuedJobs) {
    this.maxQueuedJobs = maxQueuedJobs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties comAdobeGraniteBundlesHcImplJobsHealthCheckProperties = (ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties) o;
    return Objects.equals(this.hcTags, comAdobeGraniteBundlesHcImplJobsHealthCheckProperties.hcTags) &&
        Objects.equals(this.maxQueuedJobs, comAdobeGraniteBundlesHcImplJobsHealthCheckProperties.maxQueuedJobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcTags, maxQueuedJobs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties {\n");
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    maxQueuedJobs: ").append(toIndentedString(maxQueuedJobs)).append("\n");
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

