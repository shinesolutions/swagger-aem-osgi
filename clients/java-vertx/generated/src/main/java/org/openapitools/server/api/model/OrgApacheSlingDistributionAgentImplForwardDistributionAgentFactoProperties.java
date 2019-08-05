package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties   {
  
  private ConfigNodePropertyString name = null;
  private ConfigNodePropertyString title = null;
  private ConfigNodePropertyString details = null;
  private ConfigNodePropertyBoolean enabled = null;
  private ConfigNodePropertyString serviceName = null;
  private ConfigNodePropertyDropDown logLevel = null;
  private ConfigNodePropertyArray allowedRoots = null;
  private ConfigNodePropertyBoolean queueProcessingEnabled = null;
  private ConfigNodePropertyArray packageImporterEndpoints = null;
  private ConfigNodePropertyArray passiveQueues = null;
  private ConfigNodePropertyArray priorityQueues = null;
  private ConfigNodePropertyDropDown retryStrategy = null;
  private ConfigNodePropertyInteger retryAttempts = null;
  private ConfigNodePropertyString requestAuthorizationStrategyTarget = null;
  private ConfigNodePropertyString transportSecretProviderTarget = null;
  private ConfigNodePropertyString packageBuilderTarget = null;
  private ConfigNodePropertyString triggersTarget = null;
  private ConfigNodePropertyDropDown queueProvider = null;
  private ConfigNodePropertyBoolean asyncDelivery = null;
  private ConfigNodePropertyInteger httpConnTimeout = null;

  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties () {

  }

  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties (ConfigNodePropertyString name, ConfigNodePropertyString title, ConfigNodePropertyString details, ConfigNodePropertyBoolean enabled, ConfigNodePropertyString serviceName, ConfigNodePropertyDropDown logLevel, ConfigNodePropertyArray allowedRoots, ConfigNodePropertyBoolean queueProcessingEnabled, ConfigNodePropertyArray packageImporterEndpoints, ConfigNodePropertyArray passiveQueues, ConfigNodePropertyArray priorityQueues, ConfigNodePropertyDropDown retryStrategy, ConfigNodePropertyInteger retryAttempts, ConfigNodePropertyString requestAuthorizationStrategyTarget, ConfigNodePropertyString transportSecretProviderTarget, ConfigNodePropertyString packageBuilderTarget, ConfigNodePropertyString triggersTarget, ConfigNodePropertyDropDown queueProvider, ConfigNodePropertyBoolean asyncDelivery, ConfigNodePropertyInteger httpConnTimeout) {
    this.name = name;
    this.title = title;
    this.details = details;
    this.enabled = enabled;
    this.serviceName = serviceName;
    this.logLevel = logLevel;
    this.allowedRoots = allowedRoots;
    this.queueProcessingEnabled = queueProcessingEnabled;
    this.packageImporterEndpoints = packageImporterEndpoints;
    this.passiveQueues = passiveQueues;
    this.priorityQueues = priorityQueues;
    this.retryStrategy = retryStrategy;
    this.retryAttempts = retryAttempts;
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
    this.transportSecretProviderTarget = transportSecretProviderTarget;
    this.packageBuilderTarget = packageBuilderTarget;
    this.triggersTarget = triggersTarget;
    this.queueProvider = queueProvider;
    this.asyncDelivery = asyncDelivery;
    this.httpConnTimeout = httpConnTimeout;
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

    
  @JsonProperty("queue.processing.enabled")
  public ConfigNodePropertyBoolean getQueueProcessingEnabled() {
    return queueProcessingEnabled;
  }
  public void setQueueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
  }

    
  @JsonProperty("packageImporter.endpoints")
  public ConfigNodePropertyArray getPackageImporterEndpoints() {
    return packageImporterEndpoints;
  }
  public void setPackageImporterEndpoints(ConfigNodePropertyArray packageImporterEndpoints) {
    this.packageImporterEndpoints = packageImporterEndpoints;
  }

    
  @JsonProperty("passiveQueues")
  public ConfigNodePropertyArray getPassiveQueues() {
    return passiveQueues;
  }
  public void setPassiveQueues(ConfigNodePropertyArray passiveQueues) {
    this.passiveQueues = passiveQueues;
  }

    
  @JsonProperty("priorityQueues")
  public ConfigNodePropertyArray getPriorityQueues() {
    return priorityQueues;
  }
  public void setPriorityQueues(ConfigNodePropertyArray priorityQueues) {
    this.priorityQueues = priorityQueues;
  }

    
  @JsonProperty("retry.strategy")
  public ConfigNodePropertyDropDown getRetryStrategy() {
    return retryStrategy;
  }
  public void setRetryStrategy(ConfigNodePropertyDropDown retryStrategy) {
    this.retryStrategy = retryStrategy;
  }

    
  @JsonProperty("retry.attempts")
  public ConfigNodePropertyInteger getRetryAttempts() {
    return retryAttempts;
  }
  public void setRetryAttempts(ConfigNodePropertyInteger retryAttempts) {
    this.retryAttempts = retryAttempts;
  }

    
  @JsonProperty("requestAuthorizationStrategy.target")
  public ConfigNodePropertyString getRequestAuthorizationStrategyTarget() {
    return requestAuthorizationStrategyTarget;
  }
  public void setRequestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
  }

    
  @JsonProperty("transportSecretProvider.target")
  public ConfigNodePropertyString getTransportSecretProviderTarget() {
    return transportSecretProviderTarget;
  }
  public void setTransportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
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

    
  @JsonProperty("queue.provider")
  public ConfigNodePropertyDropDown getQueueProvider() {
    return queueProvider;
  }
  public void setQueueProvider(ConfigNodePropertyDropDown queueProvider) {
    this.queueProvider = queueProvider;
  }

    
  @JsonProperty("async.delivery")
  public ConfigNodePropertyBoolean getAsyncDelivery() {
    return asyncDelivery;
  }
  public void setAsyncDelivery(ConfigNodePropertyBoolean asyncDelivery) {
    this.asyncDelivery = asyncDelivery;
  }

    
  @JsonProperty("http.conn.timeout")
  public ConfigNodePropertyInteger getHttpConnTimeout() {
    return httpConnTimeout;
  }
  public void setHttpConnTimeout(ConfigNodePropertyInteger httpConnTimeout) {
    this.httpConnTimeout = httpConnTimeout;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties = (OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) o;
    return Objects.equals(name, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.name) &&
        Objects.equals(title, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.title) &&
        Objects.equals(details, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.details) &&
        Objects.equals(enabled, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.enabled) &&
        Objects.equals(serviceName, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.serviceName) &&
        Objects.equals(logLevel, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.logLevel) &&
        Objects.equals(allowedRoots, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.allowedRoots) &&
        Objects.equals(queueProcessingEnabled, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.queueProcessingEnabled) &&
        Objects.equals(packageImporterEndpoints, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.packageImporterEndpoints) &&
        Objects.equals(passiveQueues, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.passiveQueues) &&
        Objects.equals(priorityQueues, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.priorityQueues) &&
        Objects.equals(retryStrategy, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.retryStrategy) &&
        Objects.equals(retryAttempts, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.retryAttempts) &&
        Objects.equals(requestAuthorizationStrategyTarget, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.requestAuthorizationStrategyTarget) &&
        Objects.equals(transportSecretProviderTarget, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.transportSecretProviderTarget) &&
        Objects.equals(packageBuilderTarget, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.packageBuilderTarget) &&
        Objects.equals(triggersTarget, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.triggersTarget) &&
        Objects.equals(queueProvider, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.queueProvider) &&
        Objects.equals(asyncDelivery, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.asyncDelivery) &&
        Objects.equals(httpConnTimeout, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.httpConnTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, title, details, enabled, serviceName, logLevel, allowedRoots, queueProcessingEnabled, packageImporterEndpoints, passiveQueues, priorityQueues, retryStrategy, retryAttempts, requestAuthorizationStrategyTarget, transportSecretProviderTarget, packageBuilderTarget, triggersTarget, queueProvider, asyncDelivery, httpConnTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
    sb.append("    allowedRoots: ").append(toIndentedString(allowedRoots)).append("\n");
    sb.append("    queueProcessingEnabled: ").append(toIndentedString(queueProcessingEnabled)).append("\n");
    sb.append("    packageImporterEndpoints: ").append(toIndentedString(packageImporterEndpoints)).append("\n");
    sb.append("    passiveQueues: ").append(toIndentedString(passiveQueues)).append("\n");
    sb.append("    priorityQueues: ").append(toIndentedString(priorityQueues)).append("\n");
    sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
    sb.append("    retryAttempts: ").append(toIndentedString(retryAttempts)).append("\n");
    sb.append("    requestAuthorizationStrategyTarget: ").append(toIndentedString(requestAuthorizationStrategyTarget)).append("\n");
    sb.append("    transportSecretProviderTarget: ").append(toIndentedString(transportSecretProviderTarget)).append("\n");
    sb.append("    packageBuilderTarget: ").append(toIndentedString(packageBuilderTarget)).append("\n");
    sb.append("    triggersTarget: ").append(toIndentedString(triggersTarget)).append("\n");
    sb.append("    queueProvider: ").append(toIndentedString(queueProvider)).append("\n");
    sb.append("    asyncDelivery: ").append(toIndentedString(asyncDelivery)).append("\n");
    sb.append("    httpConnTimeout: ").append(toIndentedString(httpConnTimeout)).append("\n");
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
