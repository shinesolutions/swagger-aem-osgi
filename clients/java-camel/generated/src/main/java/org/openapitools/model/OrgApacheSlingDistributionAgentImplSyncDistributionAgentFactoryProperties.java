package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties
 */

@JsonTypeName("orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties {

  private ConfigNodePropertyString name;

  private ConfigNodePropertyString title;

  private ConfigNodePropertyString details;

  private ConfigNodePropertyBoolean enabled;

  private ConfigNodePropertyString serviceName;

  private ConfigNodePropertyDropDown logLevel;

  private ConfigNodePropertyBoolean queueProcessingEnabled;

  private ConfigNodePropertyArray passiveQueues;

  private ConfigNodePropertyArray packageExporterEndpoints;

  private ConfigNodePropertyArray packageImporterEndpoints;

  private ConfigNodePropertyDropDown retryStrategy;

  private ConfigNodePropertyInteger retryAttempts;

  private ConfigNodePropertyInteger pullItems;

  private ConfigNodePropertyInteger httpConnTimeout;

  private ConfigNodePropertyString requestAuthorizationStrategyTarget;

  private ConfigNodePropertyString transportSecretProviderTarget;

  private ConfigNodePropertyString packageBuilderTarget;

  private ConfigNodePropertyString triggersTarget;

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @Valid 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties title(ConfigNodePropertyString title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @Valid 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public ConfigNodePropertyString getTitle() {
    return title;
  }

  public void setTitle(ConfigNodePropertyString title) {
    this.title = title;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties details(ConfigNodePropertyString details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
   */
  @Valid 
  @Schema(name = "details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public ConfigNodePropertyString getDetails() {
    return details;
  }

  public void setDetails(ConfigNodePropertyString details) {
    this.details = details;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties enabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @Valid 
  @Schema(name = "enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  public void setEnabled(ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
   */
  @Valid 
  @Schema(name = "serviceName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceName")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties logLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
    return this;
  }

  /**
   * Get logLevel
   * @return logLevel
   */
  @Valid 
  @Schema(name = "log.level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("log.level")
  public ConfigNodePropertyDropDown getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties queueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
    return this;
  }

  /**
   * Get queueProcessingEnabled
   * @return queueProcessingEnabled
   */
  @Valid 
  @Schema(name = "queue.processing.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queue.processing.enabled")
  public ConfigNodePropertyBoolean getQueueProcessingEnabled() {
    return queueProcessingEnabled;
  }

  public void setQueueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties passiveQueues(ConfigNodePropertyArray passiveQueues) {
    this.passiveQueues = passiveQueues;
    return this;
  }

  /**
   * Get passiveQueues
   * @return passiveQueues
   */
  @Valid 
  @Schema(name = "passiveQueues", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passiveQueues")
  public ConfigNodePropertyArray getPassiveQueues() {
    return passiveQueues;
  }

  public void setPassiveQueues(ConfigNodePropertyArray passiveQueues) {
    this.passiveQueues = passiveQueues;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties packageExporterEndpoints(ConfigNodePropertyArray packageExporterEndpoints) {
    this.packageExporterEndpoints = packageExporterEndpoints;
    return this;
  }

  /**
   * Get packageExporterEndpoints
   * @return packageExporterEndpoints
   */
  @Valid 
  @Schema(name = "packageExporter.endpoints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("packageExporter.endpoints")
  public ConfigNodePropertyArray getPackageExporterEndpoints() {
    return packageExporterEndpoints;
  }

  public void setPackageExporterEndpoints(ConfigNodePropertyArray packageExporterEndpoints) {
    this.packageExporterEndpoints = packageExporterEndpoints;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties packageImporterEndpoints(ConfigNodePropertyArray packageImporterEndpoints) {
    this.packageImporterEndpoints = packageImporterEndpoints;
    return this;
  }

  /**
   * Get packageImporterEndpoints
   * @return packageImporterEndpoints
   */
  @Valid 
  @Schema(name = "packageImporter.endpoints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("packageImporter.endpoints")
  public ConfigNodePropertyArray getPackageImporterEndpoints() {
    return packageImporterEndpoints;
  }

  public void setPackageImporterEndpoints(ConfigNodePropertyArray packageImporterEndpoints) {
    this.packageImporterEndpoints = packageImporterEndpoints;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties retryStrategy(ConfigNodePropertyDropDown retryStrategy) {
    this.retryStrategy = retryStrategy;
    return this;
  }

  /**
   * Get retryStrategy
   * @return retryStrategy
   */
  @Valid 
  @Schema(name = "retry.strategy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retry.strategy")
  public ConfigNodePropertyDropDown getRetryStrategy() {
    return retryStrategy;
  }

  public void setRetryStrategy(ConfigNodePropertyDropDown retryStrategy) {
    this.retryStrategy = retryStrategy;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties retryAttempts(ConfigNodePropertyInteger retryAttempts) {
    this.retryAttempts = retryAttempts;
    return this;
  }

  /**
   * Get retryAttempts
   * @return retryAttempts
   */
  @Valid 
  @Schema(name = "retry.attempts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retry.attempts")
  public ConfigNodePropertyInteger getRetryAttempts() {
    return retryAttempts;
  }

  public void setRetryAttempts(ConfigNodePropertyInteger retryAttempts) {
    this.retryAttempts = retryAttempts;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties pullItems(ConfigNodePropertyInteger pullItems) {
    this.pullItems = pullItems;
    return this;
  }

  /**
   * Get pullItems
   * @return pullItems
   */
  @Valid 
  @Schema(name = "pull.items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pull.items")
  public ConfigNodePropertyInteger getPullItems() {
    return pullItems;
  }

  public void setPullItems(ConfigNodePropertyInteger pullItems) {
    this.pullItems = pullItems;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties httpConnTimeout(ConfigNodePropertyInteger httpConnTimeout) {
    this.httpConnTimeout = httpConnTimeout;
    return this;
  }

  /**
   * Get httpConnTimeout
   * @return httpConnTimeout
   */
  @Valid 
  @Schema(name = "http.conn.timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("http.conn.timeout")
  public ConfigNodePropertyInteger getHttpConnTimeout() {
    return httpConnTimeout;
  }

  public void setHttpConnTimeout(ConfigNodePropertyInteger httpConnTimeout) {
    this.httpConnTimeout = httpConnTimeout;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties requestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
    return this;
  }

  /**
   * Get requestAuthorizationStrategyTarget
   * @return requestAuthorizationStrategyTarget
   */
  @Valid 
  @Schema(name = "requestAuthorizationStrategy.target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestAuthorizationStrategy.target")
  public ConfigNodePropertyString getRequestAuthorizationStrategyTarget() {
    return requestAuthorizationStrategyTarget;
  }

  public void setRequestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties transportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
    return this;
  }

  /**
   * Get transportSecretProviderTarget
   * @return transportSecretProviderTarget
   */
  @Valid 
  @Schema(name = "transportSecretProvider.target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transportSecretProvider.target")
  public ConfigNodePropertyString getTransportSecretProviderTarget() {
    return transportSecretProviderTarget;
  }

  public void setTransportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties packageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
    return this;
  }

  /**
   * Get packageBuilderTarget
   * @return packageBuilderTarget
   */
  @Valid 
  @Schema(name = "packageBuilder.target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("packageBuilder.target")
  public ConfigNodePropertyString getPackageBuilderTarget() {
    return packageBuilderTarget;
  }

  public void setPackageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties triggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
    return this;
  }

  /**
   * Get triggersTarget
   * @return triggersTarget
   */
  @Valid 
  @Schema(name = "triggers.target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("triggers.target")
  public ConfigNodePropertyString getTriggersTarget() {
    return triggersTarget;
  }

  public void setTriggersTarget(ConfigNodePropertyString triggersTarget) {
    this.triggersTarget = triggersTarget;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

