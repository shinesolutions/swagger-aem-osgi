package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties   {
  
  private @Valid ConfigNodePropertyString name = null;
  private @Valid ConfigNodePropertyString title = null;
  private @Valid ConfigNodePropertyString details = null;
  private @Valid ConfigNodePropertyBoolean enabled = null;
  private @Valid ConfigNodePropertyString serviceName = null;
  private @Valid ConfigNodePropertyDropDown logLevel = null;
  private @Valid ConfigNodePropertyArray allowedRoots = null;
  private @Valid ConfigNodePropertyBoolean queueProcessingEnabled = null;
  private @Valid ConfigNodePropertyArray packageImporterEndpoints = null;
  private @Valid ConfigNodePropertyArray passiveQueues = null;
  private @Valid ConfigNodePropertyArray priorityQueues = null;
  private @Valid ConfigNodePropertyDropDown retryStrategy = null;
  private @Valid ConfigNodePropertyInteger retryAttempts = null;
  private @Valid ConfigNodePropertyString requestAuthorizationStrategyTarget = null;
  private @Valid ConfigNodePropertyString transportSecretProviderTarget = null;
  private @Valid ConfigNodePropertyString packageBuilderTarget = null;
  private @Valid ConfigNodePropertyString triggersTarget = null;
  private @Valid ConfigNodePropertyDropDown queueProvider = null;
  private @Valid ConfigNodePropertyBoolean asyncDelivery = null;
  private @Valid ConfigNodePropertyInteger httpConnTimeout = null;

  /**
   **/
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  
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
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties title(ConfigNodePropertyString title) {
    this.title = title;
    return this;
  }

  
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
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties details(ConfigNodePropertyString details) {
    this.details = details;
    return this;
  }

  
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
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  
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
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  
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
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties logLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
    return this;
  }

  
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
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties allowedRoots(ConfigNodePropertyArray allowedRoots) {
    this.allowedRoots = allowedRoots;
    return this;
  }

  
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
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties queueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.processing.enabled")
  public ConfigNodePropertyBoolean getQueueProcessingEnabled() {
    return queueProcessingEnabled;
  }
  public void setQueueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
  }

  /**
   **/
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties packageImporterEndpoints(ConfigNodePropertyArray packageImporterEndpoints) {
    this.packageImporterEndpoints = packageImporterEndpoints;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("packageImporter.endpoints")
  public ConfigNodePropertyArray getPackageImporterEndpoints() {
    return packageImporterEndpoints;
  }
  public void setPackageImporterEndpoints(ConfigNodePropertyArray packageImporterEndpoints) {
    this.packageImporterEndpoints = packageImporterEndpoints;
  }

  /**
   **/
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties passiveQueues(ConfigNodePropertyArray passiveQueues) {
    this.passiveQueues = passiveQueues;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("passiveQueues")
  public ConfigNodePropertyArray getPassiveQueues() {
    return passiveQueues;
  }
  public void setPassiveQueues(ConfigNodePropertyArray passiveQueues) {
    this.passiveQueues = passiveQueues;
  }

  /**
   **/
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties priorityQueues(ConfigNodePropertyArray priorityQueues) {
    this.priorityQueues = priorityQueues;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("priorityQueues")
  public ConfigNodePropertyArray getPriorityQueues() {
    return priorityQueues;
  }
  public void setPriorityQueues(ConfigNodePropertyArray priorityQueues) {
    this.priorityQueues = priorityQueues;
  }

  /**
   **/
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties retryStrategy(ConfigNodePropertyDropDown retryStrategy) {
    this.retryStrategy = retryStrategy;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("retry.strategy")
  public ConfigNodePropertyDropDown getRetryStrategy() {
    return retryStrategy;
  }
  public void setRetryStrategy(ConfigNodePropertyDropDown retryStrategy) {
    this.retryStrategy = retryStrategy;
  }

  /**
   **/
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties retryAttempts(ConfigNodePropertyInteger retryAttempts) {
    this.retryAttempts = retryAttempts;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("retry.attempts")
  public ConfigNodePropertyInteger getRetryAttempts() {
    return retryAttempts;
  }
  public void setRetryAttempts(ConfigNodePropertyInteger retryAttempts) {
    this.retryAttempts = retryAttempts;
  }

  /**
   **/
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties requestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
    return this;
  }

  
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
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties transportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("transportSecretProvider.target")
  public ConfigNodePropertyString getTransportSecretProviderTarget() {
    return transportSecretProviderTarget;
  }
  public void setTransportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
  }

  /**
   **/
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties packageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
    return this;
  }

  
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
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties triggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
    return this;
  }

  
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
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties queueProvider(ConfigNodePropertyDropDown queueProvider) {
    this.queueProvider = queueProvider;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queue.provider")
  public ConfigNodePropertyDropDown getQueueProvider() {
    return queueProvider;
  }
  public void setQueueProvider(ConfigNodePropertyDropDown queueProvider) {
    this.queueProvider = queueProvider;
  }

  /**
   **/
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties asyncDelivery(ConfigNodePropertyBoolean asyncDelivery) {
    this.asyncDelivery = asyncDelivery;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("async.delivery")
  public ConfigNodePropertyBoolean getAsyncDelivery() {
    return asyncDelivery;
  }
  public void setAsyncDelivery(ConfigNodePropertyBoolean asyncDelivery) {
    this.asyncDelivery = asyncDelivery;
  }

  /**
   **/
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties httpConnTimeout(ConfigNodePropertyInteger httpConnTimeout) {
    this.httpConnTimeout = httpConnTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("http.conn.timeout")
  public ConfigNodePropertyInteger getHttpConnTimeout() {
    return httpConnTimeout;
  }
  public void setHttpConnTimeout(ConfigNodePropertyInteger httpConnTimeout) {
    this.httpConnTimeout = httpConnTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

