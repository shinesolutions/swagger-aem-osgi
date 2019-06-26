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
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyInteger;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComDayCrxSecurityTokenImplTokenCleanupTaskProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-26T12:10:03.209Z[GMT]")
public class ComDayCrxSecurityTokenImplTokenCleanupTaskProperties {
  public static final String SERIALIZED_NAME_ENABLE_TOKEN_CLEANUP_TASK = "enable.token.cleanup.task";
  @SerializedName(SERIALIZED_NAME_ENABLE_TOKEN_CLEANUP_TASK)
  private ConfigNodePropertyBoolean enableTokenCleanupTask = null;

  public static final String SERIALIZED_NAME_SCHEDULER_EXPRESSION = "scheduler.expression";
  @SerializedName(SERIALIZED_NAME_SCHEDULER_EXPRESSION)
  private ConfigNodePropertyString schedulerExpression = null;

  public static final String SERIALIZED_NAME_BATCH_SIZE = "batch.size";
  @SerializedName(SERIALIZED_NAME_BATCH_SIZE)
  private ConfigNodePropertyInteger batchSize = null;

  public ComDayCrxSecurityTokenImplTokenCleanupTaskProperties enableTokenCleanupTask(ConfigNodePropertyBoolean enableTokenCleanupTask) {
    this.enableTokenCleanupTask = enableTokenCleanupTask;
    return this;
  }

   /**
   * Get enableTokenCleanupTask
   * @return enableTokenCleanupTask
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getEnableTokenCleanupTask() {
    return enableTokenCleanupTask;
  }

  public void setEnableTokenCleanupTask(ConfigNodePropertyBoolean enableTokenCleanupTask) {
    this.enableTokenCleanupTask = enableTokenCleanupTask;
  }

  public ComDayCrxSecurityTokenImplTokenCleanupTaskProperties schedulerExpression(ConfigNodePropertyString schedulerExpression) {
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

  public ComDayCrxSecurityTokenImplTokenCleanupTaskProperties batchSize(ConfigNodePropertyInteger batchSize) {
    this.batchSize = batchSize;
    return this;
  }

   /**
   * Get batchSize
   * @return batchSize
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(ConfigNodePropertyInteger batchSize) {
    this.batchSize = batchSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCrxSecurityTokenImplTokenCleanupTaskProperties comDayCrxSecurityTokenImplTokenCleanupTaskProperties = (ComDayCrxSecurityTokenImplTokenCleanupTaskProperties) o;
    return Objects.equals(this.enableTokenCleanupTask, comDayCrxSecurityTokenImplTokenCleanupTaskProperties.enableTokenCleanupTask) &&
        Objects.equals(this.schedulerExpression, comDayCrxSecurityTokenImplTokenCleanupTaskProperties.schedulerExpression) &&
        Objects.equals(this.batchSize, comDayCrxSecurityTokenImplTokenCleanupTaskProperties.batchSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableTokenCleanupTask, schedulerExpression, batchSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCrxSecurityTokenImplTokenCleanupTaskProperties {\n");
    sb.append("    enableTokenCleanupTask: ").append(toIndentedString(enableTokenCleanupTask)).append("\n");
    sb.append("    schedulerExpression: ").append(toIndentedString(schedulerExpression)).append("\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
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

