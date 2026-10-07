package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties   {
  
  private ConfigNodePropertyString name;
  private ConfigNodePropertyString title;
  private ConfigNodePropertyString details;
  private ConfigNodePropertyBoolean enabled;
  private ConfigNodePropertyString serviceName;
  private ConfigNodePropertyDropDown logLevel;
  private ConfigNodePropertyArray allowedRoots;
  private ConfigNodePropertyString requestAuthorizationStrategyTarget;
  private ConfigNodePropertyString queueProviderFactoryTarget;
  private ConfigNodePropertyString packageBuilderTarget;
  private ConfigNodePropertyString triggersTarget;
  private ConfigNodePropertyArray priorityQueues;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
    return Objects.equals(this.name, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.name) &&
        Objects.equals(this.title, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.title) &&
        Objects.equals(this.details, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.details) &&
        Objects.equals(this.enabled, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.enabled) &&
        Objects.equals(this.serviceName, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.serviceName) &&
        Objects.equals(this.logLevel, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.logLevel) &&
        Objects.equals(this.allowedRoots, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.allowedRoots) &&
        Objects.equals(this.requestAuthorizationStrategyTarget, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.requestAuthorizationStrategyTarget) &&
        Objects.equals(this.queueProviderFactoryTarget, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.queueProviderFactoryTarget) &&
        Objects.equals(this.packageBuilderTarget, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.packageBuilderTarget) &&
        Objects.equals(this.triggersTarget, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.triggersTarget) &&
        Objects.equals(this.priorityQueues, orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.priorityQueues);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

