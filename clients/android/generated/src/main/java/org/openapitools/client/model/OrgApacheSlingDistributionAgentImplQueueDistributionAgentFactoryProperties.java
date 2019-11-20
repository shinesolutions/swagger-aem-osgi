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
import org.openapitools.client.model.ConfigNodePropertyBoolean;
import org.openapitools.client.model.ConfigNodePropertyDropDown;
import org.openapitools.client.model.ConfigNodePropertyString;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties {
  
  @SerializedName("name")
  private ConfigNodePropertyString name = null;
  @SerializedName("title")
  private ConfigNodePropertyString title = null;
  @SerializedName("details")
  private ConfigNodePropertyString details = null;
  @SerializedName("enabled")
  private ConfigNodePropertyBoolean enabled = null;
  @SerializedName("serviceName")
  private ConfigNodePropertyString serviceName = null;
  @SerializedName("log.level")
  private ConfigNodePropertyDropDown logLevel = null;
  @SerializedName("allowed.roots")
  private ConfigNodePropertyArray allowedRoots = null;
  @SerializedName("requestAuthorizationStrategy.target")
  private ConfigNodePropertyString requestAuthorizationStrategyTarget = null;
  @SerializedName("queueProviderFactory.target")
  private ConfigNodePropertyString queueProviderFactoryTarget = null;
  @SerializedName("packageBuilder.target")
  private ConfigNodePropertyString packageBuilderTarget = null;
  @SerializedName("triggers.target")
  private ConfigNodePropertyString triggersTarget = null;
  @SerializedName("priorityQueues")
  private ConfigNodePropertyArray priorityQueues = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getTitle() {
    return title;
  }
  public void setTitle(ConfigNodePropertyString title) {
    this.title = title;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getDetails() {
    return details;
  }
  public void setDetails(ConfigNodePropertyString details) {
    this.details = details;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }
  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getLogLevel() {
    return logLevel;
  }
  public void setLogLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getAllowedRoots() {
    return allowedRoots;
  }
  public void setAllowedRoots(ConfigNodePropertyArray allowedRoots) {
    this.allowedRoots = allowedRoots;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getRequestAuthorizationStrategyTarget() {
    return requestAuthorizationStrategyTarget;
  }
  public void setRequestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getQueueProviderFactoryTarget() {
    return queueProviderFactoryTarget;
  }
  public void setQueueProviderFactoryTarget(ConfigNodePropertyString queueProviderFactoryTarget) {
    this.queueProviderFactoryTarget = queueProviderFactoryTarget;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPackageBuilderTarget() {
    return packageBuilderTarget;
  }
  public void setPackageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getTriggersTarget() {
    return triggersTarget;
  }
  public void setTriggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getPriorityQueues() {
    return priorityQueues;
  }
  public void setPriorityQueues(ConfigNodePropertyArray priorityQueues) {
    this.priorityQueues = priorityQueues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties = (OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) o;
    return (this.name == null ? orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.name == null : this.name.equals(orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.name)) &&
        (this.title == null ? orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.title == null : this.title.equals(orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.title)) &&
        (this.details == null ? orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.details == null : this.details.equals(orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.details)) &&
        (this.enabled == null ? orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.enabled == null : this.enabled.equals(orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.enabled)) &&
        (this.serviceName == null ? orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.serviceName == null : this.serviceName.equals(orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.serviceName)) &&
        (this.logLevel == null ? orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.logLevel == null : this.logLevel.equals(orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.logLevel)) &&
        (this.allowedRoots == null ? orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.allowedRoots == null : this.allowedRoots.equals(orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.allowedRoots)) &&
        (this.requestAuthorizationStrategyTarget == null ? orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.requestAuthorizationStrategyTarget == null : this.requestAuthorizationStrategyTarget.equals(orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.requestAuthorizationStrategyTarget)) &&
        (this.queueProviderFactoryTarget == null ? orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.queueProviderFactoryTarget == null : this.queueProviderFactoryTarget.equals(orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.queueProviderFactoryTarget)) &&
        (this.packageBuilderTarget == null ? orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.packageBuilderTarget == null : this.packageBuilderTarget.equals(orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.packageBuilderTarget)) &&
        (this.triggersTarget == null ? orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.triggersTarget == null : this.triggersTarget.equals(orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.triggersTarget)) &&
        (this.priorityQueues == null ? orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.priorityQueues == null : this.priorityQueues.equals(orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.priorityQueues));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.title == null ? 0: this.title.hashCode());
    result = 31 * result + (this.details == null ? 0: this.details.hashCode());
    result = 31 * result + (this.enabled == null ? 0: this.enabled.hashCode());
    result = 31 * result + (this.serviceName == null ? 0: this.serviceName.hashCode());
    result = 31 * result + (this.logLevel == null ? 0: this.logLevel.hashCode());
    result = 31 * result + (this.allowedRoots == null ? 0: this.allowedRoots.hashCode());
    result = 31 * result + (this.requestAuthorizationStrategyTarget == null ? 0: this.requestAuthorizationStrategyTarget.hashCode());
    result = 31 * result + (this.queueProviderFactoryTarget == null ? 0: this.queueProviderFactoryTarget.hashCode());
    result = 31 * result + (this.packageBuilderTarget == null ? 0: this.packageBuilderTarget.hashCode());
    result = 31 * result + (this.triggersTarget == null ? 0: this.triggersTarget.hashCode());
    result = 31 * result + (this.priorityQueues == null ? 0: this.priorityQueues.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  details: ").append(details).append("\n");
    sb.append("  enabled: ").append(enabled).append("\n");
    sb.append("  serviceName: ").append(serviceName).append("\n");
    sb.append("  logLevel: ").append(logLevel).append("\n");
    sb.append("  allowedRoots: ").append(allowedRoots).append("\n");
    sb.append("  requestAuthorizationStrategyTarget: ").append(requestAuthorizationStrategyTarget).append("\n");
    sb.append("  queueProviderFactoryTarget: ").append(queueProviderFactoryTarget).append("\n");
    sb.append("  packageBuilderTarget: ").append(packageBuilderTarget).append("\n");
    sb.append("  triggersTarget: ").append(triggersTarget).append("\n");
    sb.append("  priorityQueues: ").append(priorityQueues).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}