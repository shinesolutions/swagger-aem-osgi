package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString name;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString title;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString details;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enabled;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString serviceName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown logLevel;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray allowedRoots;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean queueProcessingEnabled;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray packageImporterEndpoints;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray passiveQueues;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray priorityQueues;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown retryStrategy;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger retryAttempts;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString requestAuthorizationStrategyTarget;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString transportSecretProviderTarget;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString packageBuilderTarget;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString triggersTarget;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown queueProvider;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean asyncDelivery;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger httpConnTimeout;
 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

 /**
  * Get title
  * @return title
  */
  @JsonProperty("title")
  public ConfigNodePropertyString getTitle() {
    return title;
  }

  /**
   * Sets the <code>title</code> property.
   */
 public void setTitle(ConfigNodePropertyString title) {
    this.title = title;
  }

  /**
   * Sets the <code>title</code> property.
   */
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties title(ConfigNodePropertyString title) {
    this.title = title;
    return this;
  }

 /**
  * Get details
  * @return details
  */
  @JsonProperty("details")
  public ConfigNodePropertyString getDetails() {
    return details;
  }

  /**
   * Sets the <code>details</code> property.
   */
 public void setDetails(ConfigNodePropertyString details) {
    this.details = details;
  }

  /**
   * Sets the <code>details</code> property.
   */
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties details(ConfigNodePropertyString details) {
    this.details = details;
    return this;
  }

 /**
  * Get enabled
  * @return enabled
  */
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  /**
   * Sets the <code>enabled</code> property.
   */
 public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Sets the <code>enabled</code> property.
   */
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

 /**
  * Get serviceName
  * @return serviceName
  */
  @JsonProperty("serviceName")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  /**
   * Sets the <code>serviceName</code> property.
   */
 public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  /**
   * Sets the <code>serviceName</code> property.
   */
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

 /**
  * Get logLevel
  * @return logLevel
  */
  @JsonProperty("log.level")
  public ConfigNodePropertyDropDown getLogLevel() {
    return logLevel;
  }

  /**
   * Sets the <code>logLevel</code> property.
   */
 public void setLogLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
  }

  /**
   * Sets the <code>logLevel</code> property.
   */
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties logLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
    return this;
  }

 /**
  * Get allowedRoots
  * @return allowedRoots
  */
  @JsonProperty("allowed.roots")
  public ConfigNodePropertyArray getAllowedRoots() {
    return allowedRoots;
  }

  /**
   * Sets the <code>allowedRoots</code> property.
   */
 public void setAllowedRoots(ConfigNodePropertyArray allowedRoots) {
    this.allowedRoots = allowedRoots;
  }

  /**
   * Sets the <code>allowedRoots</code> property.
   */
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties allowedRoots(ConfigNodePropertyArray allowedRoots) {
    this.allowedRoots = allowedRoots;
    return this;
  }

 /**
  * Get queueProcessingEnabled
  * @return queueProcessingEnabled
  */
  @JsonProperty("queue.processing.enabled")
  public ConfigNodePropertyBoolean getQueueProcessingEnabled() {
    return queueProcessingEnabled;
  }

  /**
   * Sets the <code>queueProcessingEnabled</code> property.
   */
 public void setQueueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
  }

  /**
   * Sets the <code>queueProcessingEnabled</code> property.
   */
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties queueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
    return this;
  }

 /**
  * Get packageImporterEndpoints
  * @return packageImporterEndpoints
  */
  @JsonProperty("packageImporter.endpoints")
  public ConfigNodePropertyArray getPackageImporterEndpoints() {
    return packageImporterEndpoints;
  }

  /**
   * Sets the <code>packageImporterEndpoints</code> property.
   */
 public void setPackageImporterEndpoints(ConfigNodePropertyArray packageImporterEndpoints) {
    this.packageImporterEndpoints = packageImporterEndpoints;
  }

  /**
   * Sets the <code>packageImporterEndpoints</code> property.
   */
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties packageImporterEndpoints(ConfigNodePropertyArray packageImporterEndpoints) {
    this.packageImporterEndpoints = packageImporterEndpoints;
    return this;
  }

 /**
  * Get passiveQueues
  * @return passiveQueues
  */
  @JsonProperty("passiveQueues")
  public ConfigNodePropertyArray getPassiveQueues() {
    return passiveQueues;
  }

  /**
   * Sets the <code>passiveQueues</code> property.
   */
 public void setPassiveQueues(ConfigNodePropertyArray passiveQueues) {
    this.passiveQueues = passiveQueues;
  }

  /**
   * Sets the <code>passiveQueues</code> property.
   */
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties passiveQueues(ConfigNodePropertyArray passiveQueues) {
    this.passiveQueues = passiveQueues;
    return this;
  }

 /**
  * Get priorityQueues
  * @return priorityQueues
  */
  @JsonProperty("priorityQueues")
  public ConfigNodePropertyArray getPriorityQueues() {
    return priorityQueues;
  }

  /**
   * Sets the <code>priorityQueues</code> property.
   */
 public void setPriorityQueues(ConfigNodePropertyArray priorityQueues) {
    this.priorityQueues = priorityQueues;
  }

  /**
   * Sets the <code>priorityQueues</code> property.
   */
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties priorityQueues(ConfigNodePropertyArray priorityQueues) {
    this.priorityQueues = priorityQueues;
    return this;
  }

 /**
  * Get retryStrategy
  * @return retryStrategy
  */
  @JsonProperty("retry.strategy")
  public ConfigNodePropertyDropDown getRetryStrategy() {
    return retryStrategy;
  }

  /**
   * Sets the <code>retryStrategy</code> property.
   */
 public void setRetryStrategy(ConfigNodePropertyDropDown retryStrategy) {
    this.retryStrategy = retryStrategy;
  }

  /**
   * Sets the <code>retryStrategy</code> property.
   */
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties retryStrategy(ConfigNodePropertyDropDown retryStrategy) {
    this.retryStrategy = retryStrategy;
    return this;
  }

 /**
  * Get retryAttempts
  * @return retryAttempts
  */
  @JsonProperty("retry.attempts")
  public ConfigNodePropertyInteger getRetryAttempts() {
    return retryAttempts;
  }

  /**
   * Sets the <code>retryAttempts</code> property.
   */
 public void setRetryAttempts(ConfigNodePropertyInteger retryAttempts) {
    this.retryAttempts = retryAttempts;
  }

  /**
   * Sets the <code>retryAttempts</code> property.
   */
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties retryAttempts(ConfigNodePropertyInteger retryAttempts) {
    this.retryAttempts = retryAttempts;
    return this;
  }

 /**
  * Get requestAuthorizationStrategyTarget
  * @return requestAuthorizationStrategyTarget
  */
  @JsonProperty("requestAuthorizationStrategy.target")
  public ConfigNodePropertyString getRequestAuthorizationStrategyTarget() {
    return requestAuthorizationStrategyTarget;
  }

  /**
   * Sets the <code>requestAuthorizationStrategyTarget</code> property.
   */
 public void setRequestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
  }

  /**
   * Sets the <code>requestAuthorizationStrategyTarget</code> property.
   */
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties requestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
    return this;
  }

 /**
  * Get transportSecretProviderTarget
  * @return transportSecretProviderTarget
  */
  @JsonProperty("transportSecretProvider.target")
  public ConfigNodePropertyString getTransportSecretProviderTarget() {
    return transportSecretProviderTarget;
  }

  /**
   * Sets the <code>transportSecretProviderTarget</code> property.
   */
 public void setTransportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
  }

  /**
   * Sets the <code>transportSecretProviderTarget</code> property.
   */
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties transportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
    return this;
  }

 /**
  * Get packageBuilderTarget
  * @return packageBuilderTarget
  */
  @JsonProperty("packageBuilder.target")
  public ConfigNodePropertyString getPackageBuilderTarget() {
    return packageBuilderTarget;
  }

  /**
   * Sets the <code>packageBuilderTarget</code> property.
   */
 public void setPackageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
  }

  /**
   * Sets the <code>packageBuilderTarget</code> property.
   */
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties packageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
    return this;
  }

 /**
  * Get triggersTarget
  * @return triggersTarget
  */
  @JsonProperty("triggers.target")
  public ConfigNodePropertyString getTriggersTarget() {
    return triggersTarget;
  }

  /**
   * Sets the <code>triggersTarget</code> property.
   */
 public void setTriggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
  }

  /**
   * Sets the <code>triggersTarget</code> property.
   */
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties triggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
    return this;
  }

 /**
  * Get queueProvider
  * @return queueProvider
  */
  @JsonProperty("queue.provider")
  public ConfigNodePropertyDropDown getQueueProvider() {
    return queueProvider;
  }

  /**
   * Sets the <code>queueProvider</code> property.
   */
 public void setQueueProvider(ConfigNodePropertyDropDown queueProvider) {
    this.queueProvider = queueProvider;
  }

  /**
   * Sets the <code>queueProvider</code> property.
   */
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties queueProvider(ConfigNodePropertyDropDown queueProvider) {
    this.queueProvider = queueProvider;
    return this;
  }

 /**
  * Get asyncDelivery
  * @return asyncDelivery
  */
  @JsonProperty("async.delivery")
  public ConfigNodePropertyBoolean getAsyncDelivery() {
    return asyncDelivery;
  }

  /**
   * Sets the <code>asyncDelivery</code> property.
   */
 public void setAsyncDelivery(ConfigNodePropertyBoolean asyncDelivery) {
    this.asyncDelivery = asyncDelivery;
  }

  /**
   * Sets the <code>asyncDelivery</code> property.
   */
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties asyncDelivery(ConfigNodePropertyBoolean asyncDelivery) {
    this.asyncDelivery = asyncDelivery;
    return this;
  }

 /**
  * Get httpConnTimeout
  * @return httpConnTimeout
  */
  @JsonProperty("http.conn.timeout")
  public ConfigNodePropertyInteger getHttpConnTimeout() {
    return httpConnTimeout;
  }

  /**
   * Sets the <code>httpConnTimeout</code> property.
   */
 public void setHttpConnTimeout(ConfigNodePropertyInteger httpConnTimeout) {
    this.httpConnTimeout = httpConnTimeout;
  }

  /**
   * Sets the <code>httpConnTimeout</code> property.
   */
  public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties httpConnTimeout(ConfigNodePropertyInteger httpConnTimeout) {
    this.httpConnTimeout = httpConnTimeout;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

