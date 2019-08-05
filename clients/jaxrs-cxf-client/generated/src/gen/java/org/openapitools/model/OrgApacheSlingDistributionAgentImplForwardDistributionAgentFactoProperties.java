package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString name = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString title = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString details = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean enabled = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString serviceName = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown logLevel = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray allowedRoots = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean queueProcessingEnabled = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray packageImporterEndpoints = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray passiveQueues = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray priorityQueues = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown retryStrategy = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger retryAttempts = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString requestAuthorizationStrategyTarget = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString transportSecretProviderTarget = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString packageBuilderTarget = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString triggersTarget = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown queueProvider = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean asyncDelivery = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger httpConnTimeout = null;
 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public ConfigNodePropertyString getTitle() {
    return title;
  }

  public void setTitle(ConfigNodePropertyString title) {
    this.title = title;
  }

  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties title(ConfigNodePropertyString title) {
    this.title = title;
    return this;
  }

 /**
   * Get details
   * @return details
  **/
  @JsonProperty("details")
  public ConfigNodePropertyString getDetails() {
    return details;
  }

  public void setDetails(ConfigNodePropertyString details) {
    this.details = details;
  }

  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties details(ConfigNodePropertyString details) {
    this.details = details;
    return this;
  }

 /**
   * Get enabled
   * @return enabled
  **/
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

 /**
   * Get serviceName
   * @return serviceName
  **/
  @JsonProperty("serviceName")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

 /**
   * Get logLevel
   * @return logLevel
  **/
  @JsonProperty("log.level")
  public ConfigNodePropertyDropDown getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
  }

  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties logLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
    return this;
  }

 /**
   * Get allowedRoots
   * @return allowedRoots
  **/
  @JsonProperty("allowed.roots")
  public ConfigNodePropertyArray getAllowedRoots() {
    return allowedRoots;
  }

  public void setAllowedRoots(ConfigNodePropertyArray allowedRoots) {
    this.allowedRoots = allowedRoots;
  }

  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties allowedRoots(ConfigNodePropertyArray allowedRoots) {
    this.allowedRoots = allowedRoots;
    return this;
  }

 /**
   * Get queueProcessingEnabled
   * @return queueProcessingEnabled
  **/
  @JsonProperty("queue.processing.enabled")
  public ConfigNodePropertyBoolean getQueueProcessingEnabled() {
    return queueProcessingEnabled;
  }

  public void setQueueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
  }

  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties queueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
    return this;
  }

 /**
   * Get packageImporterEndpoints
   * @return packageImporterEndpoints
  **/
  @JsonProperty("packageImporter.endpoints")
  public ConfigNodePropertyArray getPackageImporterEndpoints() {
    return packageImporterEndpoints;
  }

  public void setPackageImporterEndpoints(ConfigNodePropertyArray packageImporterEndpoints) {
    this.packageImporterEndpoints = packageImporterEndpoints;
  }

  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties packageImporterEndpoints(ConfigNodePropertyArray packageImporterEndpoints) {
    this.packageImporterEndpoints = packageImporterEndpoints;
    return this;
  }

 /**
   * Get passiveQueues
   * @return passiveQueues
  **/
  @JsonProperty("passiveQueues")
  public ConfigNodePropertyArray getPassiveQueues() {
    return passiveQueues;
  }

  public void setPassiveQueues(ConfigNodePropertyArray passiveQueues) {
    this.passiveQueues = passiveQueues;
  }

  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties passiveQueues(ConfigNodePropertyArray passiveQueues) {
    this.passiveQueues = passiveQueues;
    return this;
  }

 /**
   * Get priorityQueues
   * @return priorityQueues
  **/
  @JsonProperty("priorityQueues")
  public ConfigNodePropertyArray getPriorityQueues() {
    return priorityQueues;
  }

  public void setPriorityQueues(ConfigNodePropertyArray priorityQueues) {
    this.priorityQueues = priorityQueues;
  }

  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties priorityQueues(ConfigNodePropertyArray priorityQueues) {
    this.priorityQueues = priorityQueues;
    return this;
  }

 /**
   * Get retryStrategy
   * @return retryStrategy
  **/
  @JsonProperty("retry.strategy")
  public ConfigNodePropertyDropDown getRetryStrategy() {
    return retryStrategy;
  }

  public void setRetryStrategy(ConfigNodePropertyDropDown retryStrategy) {
    this.retryStrategy = retryStrategy;
  }

  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties retryStrategy(ConfigNodePropertyDropDown retryStrategy) {
    this.retryStrategy = retryStrategy;
    return this;
  }

 /**
   * Get retryAttempts
   * @return retryAttempts
  **/
  @JsonProperty("retry.attempts")
  public ConfigNodePropertyInteger getRetryAttempts() {
    return retryAttempts;
  }

  public void setRetryAttempts(ConfigNodePropertyInteger retryAttempts) {
    this.retryAttempts = retryAttempts;
  }

  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties retryAttempts(ConfigNodePropertyInteger retryAttempts) {
    this.retryAttempts = retryAttempts;
    return this;
  }

 /**
   * Get requestAuthorizationStrategyTarget
   * @return requestAuthorizationStrategyTarget
  **/
  @JsonProperty("requestAuthorizationStrategy.target")
  public ConfigNodePropertyString getRequestAuthorizationStrategyTarget() {
    return requestAuthorizationStrategyTarget;
  }

  public void setRequestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
  }

  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties requestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
    return this;
  }

 /**
   * Get transportSecretProviderTarget
   * @return transportSecretProviderTarget
  **/
  @JsonProperty("transportSecretProvider.target")
  public ConfigNodePropertyString getTransportSecretProviderTarget() {
    return transportSecretProviderTarget;
  }

  public void setTransportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
  }

  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties transportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
    return this;
  }

 /**
   * Get packageBuilderTarget
   * @return packageBuilderTarget
  **/
  @JsonProperty("packageBuilder.target")
  public ConfigNodePropertyString getPackageBuilderTarget() {
    return packageBuilderTarget;
  }

  public void setPackageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
  }

  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties packageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
    return this;
  }

 /**
   * Get triggersTarget
   * @return triggersTarget
  **/
  @JsonProperty("triggers.target")
  public ConfigNodePropertyString getTriggersTarget() {
    return triggersTarget;
  }

  public void setTriggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
  }

  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties triggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
    return this;
  }

 /**
   * Get queueProvider
   * @return queueProvider
  **/
  @JsonProperty("queue.provider")
  public ConfigNodePropertyDropDown getQueueProvider() {
    return queueProvider;
  }

  public void setQueueProvider(ConfigNodePropertyDropDown queueProvider) {
    this.queueProvider = queueProvider;
  }

  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties queueProvider(ConfigNodePropertyDropDown queueProvider) {
    this.queueProvider = queueProvider;
    return this;
  }

 /**
   * Get asyncDelivery
   * @return asyncDelivery
  **/
  @JsonProperty("async.delivery")
  public ConfigNodePropertyBoolean getAsyncDelivery() {
    return asyncDelivery;
  }

  public void setAsyncDelivery(ConfigNodePropertyBoolean asyncDelivery) {
    this.asyncDelivery = asyncDelivery;
  }

  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties asyncDelivery(ConfigNodePropertyBoolean asyncDelivery) {
    this.asyncDelivery = asyncDelivery;
    return this;
  }

 /**
   * Get httpConnTimeout
   * @return httpConnTimeout
  **/
  @JsonProperty("http.conn.timeout")
  public ConfigNodePropertyInteger getHttpConnTimeout() {
    return httpConnTimeout;
  }

  public void setHttpConnTimeout(ConfigNodePropertyInteger httpConnTimeout) {
    this.httpConnTimeout = httpConnTimeout;
  }

  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties httpConnTimeout(ConfigNodePropertyInteger httpConnTimeout) {
    this.httpConnTimeout = httpConnTimeout;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

