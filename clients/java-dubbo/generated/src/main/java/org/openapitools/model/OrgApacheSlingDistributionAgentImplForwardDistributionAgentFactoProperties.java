package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private ConfigNodePropertyString name;

  @JsonProperty("title")
  private ConfigNodePropertyString title;

  @JsonProperty("details")
  private ConfigNodePropertyString details;

  @JsonProperty("enabled")
  private ConfigNodePropertyBoolean enabled;

  @JsonProperty("serviceName")
  private ConfigNodePropertyString serviceName;

  @JsonProperty("log.level")
  private ConfigNodePropertyDropDown logLevel;

  @JsonProperty("allowed.roots")
  private ConfigNodePropertyArray allowedRoots;

  @JsonProperty("queue.processing.enabled")
  private ConfigNodePropertyBoolean queueProcessingEnabled;

  @JsonProperty("packageImporter.endpoints")
  private ConfigNodePropertyArray packageImporterEndpoints;

  @JsonProperty("passiveQueues")
  private ConfigNodePropertyArray passiveQueues;

  @JsonProperty("priorityQueues")
  private ConfigNodePropertyArray priorityQueues;

  @JsonProperty("retry.strategy")
  private ConfigNodePropertyDropDown retryStrategy;

  @JsonProperty("retry.attempts")
  private ConfigNodePropertyInteger retryAttempts;

  @JsonProperty("requestAuthorizationStrategy.target")
  private ConfigNodePropertyString requestAuthorizationStrategyTarget;

  @JsonProperty("transportSecretProvider.target")
  private ConfigNodePropertyString transportSecretProviderTarget;

  @JsonProperty("packageBuilder.target")
  private ConfigNodePropertyString packageBuilderTarget;

  @JsonProperty("triggers.target")
  private ConfigNodePropertyString triggersTarget;

  @JsonProperty("queue.provider")
  private ConfigNodePropertyDropDown queueProvider;

  @JsonProperty("async.delivery")
  private ConfigNodePropertyBoolean asyncDelivery;

  @JsonProperty("http.conn.timeout")
  private ConfigNodePropertyInteger httpConnTimeout;

  /**
   * 
   * @return name
   */
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   * 
   * @return title
   */
  public ConfigNodePropertyString getTitle() {
    return title;
  }

  public void setTitle(ConfigNodePropertyString title) {
    this.title = title;
  }

  /**
   * 
   * @return details
   */
  public ConfigNodePropertyString getDetails() {
    return details;
  }

  public void setDetails(ConfigNodePropertyString details) {
    this.details = details;
  }

  /**
   * 
   * @return enabled
   */
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  /**
   * 
   * @return serviceName
   */
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  /**
   * 
   * @return logLevel
   */
  public ConfigNodePropertyDropDown getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
  }

  /**
   * 
   * @return allowedRoots
   */
  public ConfigNodePropertyArray getAllowedRoots() {
    return allowedRoots;
  }

  public void setAllowedRoots(ConfigNodePropertyArray allowedRoots) {
    this.allowedRoots = allowedRoots;
  }

  /**
   * 
   * @return queueProcessingEnabled
   */
  public ConfigNodePropertyBoolean getQueueProcessingEnabled() {
    return queueProcessingEnabled;
  }

  public void setQueueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
  }

  /**
   * 
   * @return packageImporterEndpoints
   */
  public ConfigNodePropertyArray getPackageImporterEndpoints() {
    return packageImporterEndpoints;
  }

  public void setPackageImporterEndpoints(ConfigNodePropertyArray packageImporterEndpoints) {
    this.packageImporterEndpoints = packageImporterEndpoints;
  }

  /**
   * 
   * @return passiveQueues
   */
  public ConfigNodePropertyArray getPassiveQueues() {
    return passiveQueues;
  }

  public void setPassiveQueues(ConfigNodePropertyArray passiveQueues) {
    this.passiveQueues = passiveQueues;
  }

  /**
   * 
   * @return priorityQueues
   */
  public ConfigNodePropertyArray getPriorityQueues() {
    return priorityQueues;
  }

  public void setPriorityQueues(ConfigNodePropertyArray priorityQueues) {
    this.priorityQueues = priorityQueues;
  }

  /**
   * 
   * @return retryStrategy
   */
  public ConfigNodePropertyDropDown getRetryStrategy() {
    return retryStrategy;
  }

  public void setRetryStrategy(ConfigNodePropertyDropDown retryStrategy) {
    this.retryStrategy = retryStrategy;
  }

  /**
   * 
   * @return retryAttempts
   */
  public ConfigNodePropertyInteger getRetryAttempts() {
    return retryAttempts;
  }

  public void setRetryAttempts(ConfigNodePropertyInteger retryAttempts) {
    this.retryAttempts = retryAttempts;
  }

  /**
   * 
   * @return requestAuthorizationStrategyTarget
   */
  public ConfigNodePropertyString getRequestAuthorizationStrategyTarget() {
    return requestAuthorizationStrategyTarget;
  }

  public void setRequestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
  }

  /**
   * 
   * @return transportSecretProviderTarget
   */
  public ConfigNodePropertyString getTransportSecretProviderTarget() {
    return transportSecretProviderTarget;
  }

  public void setTransportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
  }

  /**
   * 
   * @return packageBuilderTarget
   */
  public ConfigNodePropertyString getPackageBuilderTarget() {
    return packageBuilderTarget;
  }

  public void setPackageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
  }

  /**
   * 
   * @return triggersTarget
   */
  public ConfigNodePropertyString getTriggersTarget() {
    return triggersTarget;
  }

  public void setTriggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
  }

  /**
   * 
   * @return queueProvider
   */
  public ConfigNodePropertyDropDown getQueueProvider() {
    return queueProvider;
  }

  public void setQueueProvider(ConfigNodePropertyDropDown queueProvider) {
    this.queueProvider = queueProvider;
  }

  /**
   * 
   * @return asyncDelivery
   */
  public ConfigNodePropertyBoolean getAsyncDelivery() {
    return asyncDelivery;
  }

  public void setAsyncDelivery(ConfigNodePropertyBoolean asyncDelivery) {
    this.asyncDelivery = asyncDelivery;
  }

  /**
   * 
   * @return httpConnTimeout
   */
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
    return Objects.equals(this.name, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.name) &&
        Objects.equals(this.title, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.title) &&
        Objects.equals(this.details, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.details) &&
        Objects.equals(this.enabled, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.enabled) &&
        Objects.equals(this.serviceName, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.serviceName) &&
        Objects.equals(this.logLevel, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.logLevel) &&
        Objects.equals(this.allowedRoots, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.allowedRoots) &&
        Objects.equals(this.queueProcessingEnabled, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.queueProcessingEnabled) &&
        Objects.equals(this.packageImporterEndpoints, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.packageImporterEndpoints) &&
        Objects.equals(this.passiveQueues, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.passiveQueues) &&
        Objects.equals(this.priorityQueues, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.priorityQueues) &&
        Objects.equals(this.retryStrategy, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.retryStrategy) &&
        Objects.equals(this.retryAttempts, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.retryAttempts) &&
        Objects.equals(this.requestAuthorizationStrategyTarget, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.requestAuthorizationStrategyTarget) &&
        Objects.equals(this.transportSecretProviderTarget, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.transportSecretProviderTarget) &&
        Objects.equals(this.packageBuilderTarget, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.packageBuilderTarget) &&
        Objects.equals(this.triggersTarget, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.triggersTarget) &&
        Objects.equals(this.queueProvider, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.queueProvider) &&
        Objects.equals(this.asyncDelivery, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.asyncDelivery) &&
        Objects.equals(this.httpConnTimeout, orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.httpConnTimeout);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
