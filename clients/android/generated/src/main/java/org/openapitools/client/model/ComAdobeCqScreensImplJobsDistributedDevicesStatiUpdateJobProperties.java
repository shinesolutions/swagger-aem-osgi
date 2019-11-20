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

import org.openapitools.client.model.ConfigNodePropertyString;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties {
  
  @SerializedName("scheduler.expression")
  private ConfigNodePropertyString schedulerExpression = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSchedulerExpression() {
    return schedulerExpression;
  }
  public void setSchedulerExpression(ConfigNodePropertyString schedulerExpression) {
    this.schedulerExpression = schedulerExpression;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties = (ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties) o;
    return (this.schedulerExpression == null ? comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties.schedulerExpression == null : this.schedulerExpression.equals(comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties.schedulerExpression));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.schedulerExpression == null ? 0: this.schedulerExpression.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties {\n");
    
    sb.append("  schedulerExpression: ").append(schedulerExpression).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}