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

import org.openapitools.client.model.ConfigNodePropertyArray;
import org.openapitools.client.model.ConfigNodePropertyString;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties {
  
  @SerializedName("adapter.condition")
  private ConfigNodePropertyString adapterCondition = null;
  @SerializedName("taskmanager.admingroups")
  private ConfigNodePropertyArray taskmanagerAdmingroups = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getAdapterCondition() {
    return adapterCondition;
  }
  public void setAdapterCondition(ConfigNodePropertyString adapterCondition) {
    this.adapterCondition = adapterCondition;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getTaskmanagerAdmingroups() {
    return taskmanagerAdmingroups;
  }
  public void setTaskmanagerAdmingroups(ConfigNodePropertyArray taskmanagerAdmingroups) {
    this.taskmanagerAdmingroups = taskmanagerAdmingroups;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties = (ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties) o;
    return (this.adapterCondition == null ? comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.adapterCondition == null : this.adapterCondition.equals(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.adapterCondition)) &&
        (this.taskmanagerAdmingroups == null ? comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.taskmanagerAdmingroups == null : this.taskmanagerAdmingroups.equals(comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.taskmanagerAdmingroups));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.adapterCondition == null ? 0: this.adapterCondition.hashCode());
    result = 31 * result + (this.taskmanagerAdmingroups == null ? 0: this.taskmanagerAdmingroups.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties {\n");
    
    sb.append("  adapterCondition: ").append(adapterCondition).append("\n");
    sb.append("  taskmanagerAdmingroups: ").append(taskmanagerAdmingroups).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}