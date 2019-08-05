package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
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

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties () {

  }

  public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties (ConfigNodePropertyString name, ConfigNodePropertyString title, ConfigNodePropertyString details, ConfigNodePropertyBoolean enabled, ConfigNodePropertyString serviceName, ConfigNodePropertyDropDown logLevel, ConfigNodePropertyArray allowedRoots, ConfigNodePropertyString requestAuthorizationStrategyTarget, ConfigNodePropertyString queueProviderFactoryTarget, ConfigNodePropertyString packageBuilderTarget, ConfigNodePropertyString triggersTarget, ConfigNodePropertyArray priorityQueues) {
    this.name = name;
    this.title = title;
    this.details = details;
    this.enabled = enabled;
    this.serviceName = serviceName;
    this.logLevel = logLevel;
    this.allowedRoots = allowedRoots;
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
    this.queueProviderFactoryTarget = queueProviderFactoryTarget;
    this.packageBuilderTarget = packageBuilderTarget;
    this.triggersTarget = triggersTarget;
    this.priorityQueues = priorityQueues;
  }

    
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

    
  @JsonProperty("title")
  public ConfigNodePropertyString getTitle() {
    return title;
  }
  public void setTitle(ConfigNodePropertyString title) {
    this.title = title;
  }

    
  @JsonProperty("details")
  public ConfigNodePropertyString getDetails() {
    return details;
  }
  public void setDetails(ConfigNodePropertyString details) {
    this.details = details;
  }

    
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }
  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

    
  @JsonProperty("serviceName")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }
  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

    
  @JsonProperty("log.level")
  public ConfigNodePropertyDropDown getLogLevel() {
    return logLevel;
  }
  public void setLogLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
  }

    
  @JsonProperty("allowed.roots")
  public ConfigNodePropertyArray getAllowedRoots() {
    return allowedRoots;
  }
  public void setAllowedRoots(ConfigNodePropertyArray allowedRoots) {
    this.allowedRoots = allowedRoots;
  }

    
  @JsonProperty("requestAuthorizationStrategy.target")
  public ConfigNodePropertyString getRequestAuthorizationStrategyTarget() {
    return requestAuthorizationStrategyTarget;
  }
  public void setRequestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
  }

    
  @JsonProperty("queueProviderFactory.target")
  public ConfigNodePropertyString getQueueProviderFactoryTarget() {
    return queueProviderFactoryTarget;
  }
  public void setQueueProviderFactoryTarget(ConfigNodePropertyString queueProviderFactoryTarget) {
    this.queueProviderFactoryTarget = queueProviderFactoryTarget;
  }

    
  @JsonProperty("packageBuilder.target")
  public ConfigNodePropertyString getPackageBuilderTarget() {
    return packageBuilderTarget;
  }
  public void setPackageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
  }

    
  @JsonProperty("triggers.target")
  public ConfigNodePropertyString getTriggersTarget() {
    return triggersTarget;
  }
  public void setTriggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
  }

    
  @JsonProperty("priorityQueues")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
