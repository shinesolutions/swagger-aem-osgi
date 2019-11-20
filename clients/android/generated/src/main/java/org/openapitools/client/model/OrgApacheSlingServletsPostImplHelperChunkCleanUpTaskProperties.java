/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ConfigNodePropertyBoolean;
import org.openapitools.client.model.ConfigNodePropertyInteger;
import org.openapitools.client.model.ConfigNodePropertyString;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties {
  
  @SerializedName("scheduler.expression")
  private ConfigNodePropertyString schedulerExpression = null;
  @SerializedName("scheduler.concurrent")
  private ConfigNodePropertyBoolean schedulerConcurrent = null;
  @SerializedName("chunk.cleanup.age")
  private ConfigNodePropertyInteger chunkCleanupAge = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }
  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getSchedulerConcurrent() {
    return schedulerConcurrent;
  }
  public void setSchedulerConcurrent(ConfigNodePropertyBoolean schedulerConcurrent) {
    this.schedulerConcurrent = schedulerConcurrent;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getChunkCleanupAge() {
    return chunkCleanupAge;
  }
  public void setChunkCleanupAge(ConfigNodePropertyInteger chunkCleanupAge) {
    this.chunkCleanupAge = chunkCleanupAge;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties = (OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties) o;
    return (this.schedulerExpression == null ? orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.schedulerExpression == null : this.schedulerExpression.equals(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.schedulerExpression)) &&
        (this.schedulerConcurrent == null ? orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.schedulerConcurrent == null : this.schedulerConcurrent.equals(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.schedulerConcurrent)) &&
        (this.chunkCleanupAge == null ? orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.chunkCleanupAge == null : this.chunkCleanupAge.equals(orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.chunkCleanupAge));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.schedulerExpression == null ? 0: this.schedulerExpression.hashCode());
    result = 31 * result + (this.schedulerConcurrent == null ? 0: this.schedulerConcurrent.hashCode());
    result = 31 * result + (this.chunkCleanupAge == null ? 0: this.chunkCleanupAge.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties {\n");
    
    sb.append("  schedulerExpression: ").append(schedulerExpression).append("\n");
    sb.append("  schedulerConcurrent: ").append(schedulerConcurrent).append("\n");
    sb.append("  chunkCleanupAge: ").append(chunkCleanupAge).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}