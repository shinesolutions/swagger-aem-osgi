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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyBoolean;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyInteger;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-14T23:44:05.965Z[GMT]")
public class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties {
  public static final String SERIALIZED_NAME_SCHEDULER_EXPRESSION = "scheduler.expression";
  @SerializedName(SERIALIZED_NAME_SCHEDULER_EXPRESSION)
  private ConfigNodePropertyString schedulerExpression = null;

  public static final String SERIALIZED_NAME_SCHEDULER_CONCURRENT = "scheduler.concurrent";
  @SerializedName(SERIALIZED_NAME_SCHEDULER_CONCURRENT)
  private ConfigNodePropertyBoolean schedulerConcurrent = null;

  public static final String SERIALIZED_NAME_CHUNK_CLEANUP_AGE = "chunk.cleanup.age";
  @SerializedName(SERIALIZED_NAME_CHUNK_CLEANUP_AGE)
  private ConfigNodePropertyInteger chunkCleanupAge = null;

  public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties schedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
    return this;
  }

   /**
   * Get schedulerExpression
   * @return schedulerExpression
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }

  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties schedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
    return this;
  }

   /**
   * Get schedulerConcurrent
   * @return schedulerConcurrent
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }

  public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }

  public OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties chunkCleanupAge(ConfigNodePropertyInteger chunkCleanupAge) {
    this.chunkCleanupAge = chunkCleanupAge;
    return this;
  }

   /**
   * Get chunkCleanupAge
   * @return chunkCleanupAge
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getChunkCleanupAge() {
    return chunkCleanupAge;
  }

  public void setChunkCleanupAge(ConfigNodePropertyInteger chunkCleanupAge) {
    this.chunkCleanupAge = chunkCleanupAge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties = (OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties) o;
    return Objects.equals(this.schedulerExpression, orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.schedulerExpression) &&
        Objects.equals(this.schedulerConcurrent, orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.schedulerConcurrent) &&
        Objects.equals(this.chunkCleanupAge, orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.chunkCleanupAge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedulerExpression, schedulerConcurrent, chunkCleanupAge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties {\n");
    sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
    sb.append("    schedulerConcurrent: ").append(toIndentedString(schedulerConcurrent)).append("\n");
    sb.append("    chunkCleanupAge: ").append(toIndentedString(chunkCleanupAge)).append("\n");
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

