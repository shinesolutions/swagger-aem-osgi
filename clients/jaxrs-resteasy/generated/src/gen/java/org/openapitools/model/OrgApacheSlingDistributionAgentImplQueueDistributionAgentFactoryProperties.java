package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties   {
  
  private ConfigNodePropertyString name = null;
  private ConfigNodePropertyString title = null;
  private ConfigNodePropertyString details = null;
  private ConfigNodePropertyBoolean enabled = null;
  private ConfigNodePropertyString serviceName = null;
  private ConfigNodePropertyDropDown logLevel = null;
  private ConfigNodePropertyArray allowedRoots = null;
  private ConfigNodePropertyString requestAuthorizationStrategyTarget = null;
  private ConfigNodePropertyString queueProviderFactoryTarget = null;
  private ConfigNodePropertyString packageBuilderTarget = null;
  private ConfigNodePropertyString triggersTarget = null;
  private ConfigNodePropertyArray priorityQueues = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public ConfigNodePropertyString getTitle() {
    return title;
  }
  public void setTitle(ConfigNodePropertyString title) {
    this.title = title;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("details")
  public ConfigNodePropertyString getDetails() {
    return details;
  }
  public void setDetails(ConfigNodePropertyString details) {
    this.details = details;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceName")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }
  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("log.level")
  public ConfigNodePropertyDropDown getLogLevel() {
    return logLevel;
  }
  public void setLogLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("allowed.roots")
  public ConfigNodePropertyArray getAllowedRoots() {
    return allowedRoots;
  }
  public void setAllowedRoots(ConfigNodePropertyArray allowedRoots) {
    this.allowedRoots = allowedRoots;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("requestAuthorizationStrategy.target")
  public ConfigNodePropertyString getRequestAuthorizationStrategyTarget() {
    return requestAuthorizationStrategyTarget;
  }
  public void setRequestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("queueProviderFactory.target")
  public ConfigNodePropertyString getQueueProviderFactoryTarget() {
    return queueProviderFactoryTarget;
  }
  public void setQueueProviderFactoryTarget(ConfigNodePropertyString queueProviderFactoryTarget) {
    this.queueProviderFactoryTarget = queueProviderFactoryTarget;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("packageBuilder.target")
  public ConfigNodePropertyString getPackageBuilderTarget() {
    return packageBuilderTarget;
  }
  public void setPackageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("triggers.target")
  public ConfigNodePropertyString getTriggersTarget() {
    return triggersTarget;
  }
  public void setTriggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("priorityQueues")
  public ConfigNodePropertyArray getPriorityQueues() {
    return priorityQueues;
  }
  public void setPriorityQueues(ConfigNodePropertyArray priorityQueues) {
    this.priorityQueues = priorityQueues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties = (OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) o;
    return Objects.equals(name, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.name) &&
        Objects.equals(title, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.title) &&
        Objects.equals(details, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.details) &&
        Objects.equals(enabled, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.enabled) &&
        Objects.equals(serviceName, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.serviceName) &&
        Objects.equals(logLevel, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.logLevel) &&
        Objects.equals(allowedRoots, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.allowedRoots) &&
        Objects.equals(requestAuthorizationStrategyTarget, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.requestAuthorizationStrategyTarget) &&
        Objects.equals(queueProviderFactoryTarget, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.queueProviderFactoryTarget) &&
        Objects.equals(packageBuilderTarget, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.packageBuilderTarget) &&
        Objects.equals(triggersTarget, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.triggersTarget) &&
        Objects.equals(priorityQueues, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.priorityQueues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, title, details, enabled, serviceName, logLevel, allowedRoots, requestAuthorizationStrategyTarget, queueProviderFactoryTarget, packageBuilderTarget, triggersTarget, priorityQueues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
    sb.append("    allowedRoots: ").append(toIndentedString(allowedRoots)).append("\n");
    sb.append("    requestAuthorizationStrategyTarget: ").append(toIndentedString(requestAuthorizationStrategyTarget)).append("\n");
    sb.append("    queueProviderFactoryTarget: ").append(toIndentedString(queueProviderFactoryTarget)).append("\n");
    sb.append("    packageBuilderTarget: ").append(toIndentedString(packageBuilderTarget)).append("\n");
    sb.append("    triggersTarget: ").append(toIndentedString(triggersTarget)).append("\n");
    sb.append("    priorityQueues: ").append(toIndentedString(priorityQueues)).append("\n");
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

