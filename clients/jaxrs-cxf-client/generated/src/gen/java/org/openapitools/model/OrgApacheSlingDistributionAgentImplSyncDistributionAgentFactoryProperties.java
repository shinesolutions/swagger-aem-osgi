package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyString name;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString title;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString details;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean enabled;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString serviceName;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyDropDown logLevel;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyBoolean queueProcessingEnabled;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray passiveQueues;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray packageExporterEndpoints;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray packageImporterEndpoints;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyDropDown retryStrategy;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger retryAttempts;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger pullItems;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyInteger httpConnTimeout;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString requestAuthorizationStrategyTarget;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString transportSecretProviderTarget;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString packageBuilderTarget;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyString triggersTarget;
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

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties name(ConfigNodePropertyString name) {
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

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties title(ConfigNodePropertyString title) {
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

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties details(ConfigNodePropertyString details) {
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

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties enabled(ConfigNodePropertyBoolean enabled) {
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

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties serviceName(ConfigNodePropertyString serviceName) {
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

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties logLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
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

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties queueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
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

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties passiveQueues(ConfigNodePropertyArray passiveQueues) {
    this.passiveQueues = passiveQueues;
    return this;
  }

 /**
   * Get packageExporterEndpoints
   * @return packageExporterEndpoints
  **/
  @JsonProperty("packageExporter.endpoints")
  public ConfigNodePropertyArray getPackageExporterEndpoints() {
    return packageExporterEndpoints;
  }

  public void setPackageExporterEndpoints(ConfigNodePropertyArray packageExporterEndpoints) {
    this.packageExporterEndpoints = packageExporterEndpoints;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties packageExporterEndpoints(ConfigNodePropertyArray packageExporterEndpoints) {
    this.packageExporterEndpoints = packageExporterEndpoints;
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

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties packageImporterEndpoints(ConfigNodePropertyArray packageImporterEndpoints) {
    this.packageImporterEndpoints = packageImporterEndpoints;
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

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties retryStrategy(ConfigNodePropertyDropDown retryStrategy) {
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

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties retryAttempts(ConfigNodePropertyInteger retryAttempts) {
    this.retryAttempts = retryAttempts;
    return this;
  }

 /**
   * Get pullItems
   * @return pullItems
  **/
  @JsonProperty("pull.items")
  public ConfigNodePropertyInteger getPullItems() {
    return pullItems;
  }

  public void setPullItems(ConfigNodePropertyInteger pullItems) {
    this.pullItems = pullItems;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties pullItems(ConfigNodePropertyInteger pullItems) {
    this.pullItems = pullItems;
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

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties httpConnTimeout(ConfigNodePropertyInteger httpConnTimeout) {
    this.httpConnTimeout = httpConnTimeout;
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

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties requestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
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

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties transportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
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

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties packageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
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

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties triggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
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
    OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties = (OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) o;
    return Objects.equals(this.name, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.name) &&
        Objects.equals(this.title, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.title) &&
        Objects.equals(this.details, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.details) &&
        Objects.equals(this.enabled, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.enabled) &&
        Objects.equals(this.serviceName, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.serviceName) &&
        Objects.equals(this.logLevel, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.logLevel) &&
        Objects.equals(this.queueProcessingEnabled, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.queueProcessingEnabled) &&
        Objects.equals(this.passiveQueues, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.passiveQueues) &&
        Objects.equals(this.packageExporterEndpoints, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.packageExporterEndpoints) &&
        Objects.equals(this.packageImporterEndpoints, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.packageImporterEndpoints) &&
        Objects.equals(this.retryStrategy, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.retryStrategy) &&
        Objects.equals(this.retryAttempts, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.retryAttempts) &&
        Objects.equals(this.pullItems, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.pullItems) &&
        Objects.equals(this.httpConnTimeout, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.httpConnTimeout) &&
        Objects.equals(this.requestAuthorizationStrategyTarget, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.requestAuthorizationStrategyTarget) &&
        Objects.equals(this.transportSecretProviderTarget, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.transportSecretProviderTarget) &&
        Objects.equals(this.packageBuilderTarget, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.packageBuilderTarget) &&
        Objects.equals(this.triggersTarget, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.triggersTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, title, details, enabled, serviceName, logLevel, queueProcessingEnabled, passiveQueues, packageExporterEndpoints, packageImporterEndpoints, retryStrategy, retryAttempts, pullItems, httpConnTimeout, requestAuthorizationStrategyTarget, transportSecretProviderTarget, packageBuilderTarget, triggersTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
    sb.append("    queueProcessingEnabled: ").append(toIndentedString(queueProcessingEnabled)).append("\n");
    sb.append("    passiveQueues: ").append(toIndentedString(passiveQueues)).append("\n");
    sb.append("    packageExporterEndpoints: ").append(toIndentedString(packageExporterEndpoints)).append("\n");
    sb.append("    packageImporterEndpoints: ").append(toIndentedString(packageImporterEndpoints)).append("\n");
    sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
    sb.append("    retryAttempts: ").append(toIndentedString(retryAttempts)).append("\n");
    sb.append("    pullItems: ").append(toIndentedString(pullItems)).append("\n");
    sb.append("    httpConnTimeout: ").append(toIndentedString(httpConnTimeout)).append("\n");
    sb.append("    requestAuthorizationStrategyTarget: ").append(toIndentedString(requestAuthorizationStrategyTarget)).append("\n");
    sb.append("    transportSecretProviderTarget: ").append(toIndentedString(transportSecretProviderTarget)).append("\n");
    sb.append("    packageBuilderTarget: ").append(toIndentedString(packageBuilderTarget)).append("\n");
    sb.append("    triggersTarget: ").append(toIndentedString(triggersTarget)).append("\n");
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

