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

import org.openapitools.client.model.ConfigNodePropertyInteger;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ComDayCqReplicationImplReverseReplicatorProperties {
  
  @SerializedName("scheduler.period")
  private ConfigNodePropertyInteger schedulerPeriod = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getSchedulerPeriod() {
    return schedulerPeriod;
  }
  public void setSchedulerPeriod(ConfigNodePropertyInteger schedulerPeriod) {
    this.schedulerPeriod = schedulerPeriod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqReplicationImplReverseReplicatorProperties comDayCqReplicationImplReverseReplicatorProperties = (ComDayCqReplicationImplReverseReplicatorProperties) o;
    return (this.schedulerPeriod == null ? comDayCqReplicationImplReverseReplicatorProperties.schedulerPeriod == null : this.schedulerPeriod.equals(comDayCqReplicationImplReverseReplicatorProperties.schedulerPeriod));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.schedulerPeriod == null ? 0: this.schedulerPeriod.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqReplicationImplReverseReplicatorProperties {\n");
    
    sb.append("  schedulerPeriod: ").append(schedulerPeriod).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}