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


public class OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties   {
  
  private @Valid ConfigNodePropertyString name = null;
  private @Valid ConfigNodePropertyString title = null;
  private @Valid ConfigNodePropertyString details = null;
  private @Valid ConfigNodePropertyBoolean enabled = null;
  private @Valid ConfigNodePropertyString serviceName = null;
  private @Valid ConfigNodePropertyDropDown logLevel = null;
  private @Valid ConfigNodePropertyBoolean queueProcessingEnabled = null;
  private @Valid ConfigNodePropertyArray passiveQueues = null;
  private @Valid ConfigNodePropertyArray packageExporterEndpoints = null;
  private @Valid ConfigNodePropertyArray packageImporterEndpoints = null;
  private @Valid ConfigNodePropertyDropDown retryStrategy = null;
  private @Valid ConfigNodePropertyInteger retryAttempts = null;
  private @Valid ConfigNodePropertyInteger pullItems = null;
  private @Valid ConfigNodePropertyInteger httpConnTimeout = null;
  private @Valid ConfigNodePropertyString requestAuthorizationStrategyTarget = null;
  private @Valid ConfigNodePropertyString transportSecretProviderTarget = null;
  private @Valid ConfigNodePropertyString packageBuilderTarget = null;
  private @Valid ConfigNodePropertyString triggersTarget = null;

  /**
   **/
  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties name(ConfigNodePropertyString name) {
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
  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties title(ConfigNodePropertyString title) {
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
  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties details(ConfigNodePropertyString details) {
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
  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties enabled(ConfigNodePropertyBoolean enabled) {
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
  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties serviceName(ConfigNodePropertyString serviceName) {
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
  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties logLevel(ConfigNodePropertyDropDown logLevel) {
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
  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties queueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
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
  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties passiveQueues(ConfigNodePropertyArray passiveQueues) {
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
  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties packageExporterEndpoints(ConfigNodePropertyArray packageExporterEndpoints) {
    this.packageExporterEndpoints = packageExporterEndpoints;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("packageExporter.endpoints")
  public ConfigNodePropertyArray getPackageExporterEndpoints() {
    return packageExporterEndpoints;
  }
  public void setPackageExporterEndpoints(ConfigNodePropertyArray packageExporterEndpoints) {
    this.packageExporterEndpoints = packageExporterEndpoints;
  }

  /**
   **/
  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties packageImporterEndpoints(ConfigNodePropertyArray packageImporterEndpoints) {
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
  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties retryStrategy(ConfigNodePropertyDropDown retryStrategy) {
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
  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties retryAttempts(ConfigNodePropertyInteger retryAttempts) {
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
  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties pullItems(ConfigNodePropertyInteger pullItems) {
    this.pullItems = pullItems;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pull.items")
  public ConfigNodePropertyInteger getPullItems() {
    return pullItems;
  }
  public void setPullItems(ConfigNodePropertyInteger pullItems) {
    this.pullItems = pullItems;
  }

  /**
   **/
  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties httpConnTimeout(ConfigNodePropertyInteger httpConnTimeout) {
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

  /**
   **/
  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties requestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
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
  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties transportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
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
  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties packageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
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
  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties triggersTarget(ConfigNodePropertyString triggersTarget) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties = (OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) o;
    return Objects.equals(name, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.name) &&
        Objects.equals(title, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.title) &&
        Objects.equals(details, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.details) &&
        Objects.equals(enabled, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.enabled) &&
        Objects.equals(serviceName, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.serviceName) &&
        Objects.equals(logLevel, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.logLevel) &&
        Objects.equals(queueProcessingEnabled, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.queueProcessingEnabled) &&
        Objects.equals(passiveQueues, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.passiveQueues) &&
        Objects.equals(packageExporterEndpoints, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.packageExporterEndpoints) &&
        Objects.equals(packageImporterEndpoints, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.packageImporterEndpoints) &&
        Objects.equals(retryStrategy, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.retryStrategy) &&
        Objects.equals(retryAttempts, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.retryAttempts) &&
        Objects.equals(pullItems, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.pullItems) &&
        Objects.equals(httpConnTimeout, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.httpConnTimeout) &&
        Objects.equals(requestAuthorizationStrategyTarget, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.requestAuthorizationStrategyTarget) &&
        Objects.equals(transportSecretProviderTarget, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.transportSecretProviderTarget) &&
        Objects.equals(packageBuilderTarget, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.packageBuilderTarget) &&
        Objects.equals(triggersTarget, orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties.triggersTarget);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

