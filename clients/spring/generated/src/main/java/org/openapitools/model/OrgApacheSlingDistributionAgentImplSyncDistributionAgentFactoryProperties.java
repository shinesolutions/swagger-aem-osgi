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
import org.springframework.lang.Nullable;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString title;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString details;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString serviceName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown logLevel;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean queueProcessingEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray passiveQueues;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray packageExporterEndpoints;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray packageImporterEndpoints;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown retryStrategy;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger retryAttempts;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger pullItems;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger httpConnTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString requestAuthorizationStrategyTarget;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString transportSecretProviderTarget;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString packageBuilderTarget;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString triggersTarget;

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties name(@Nullable ConfigNodePropertyString name) {
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
  public @Nullable ConfigNodePropertyString getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties title(@Nullable ConfigNodePropertyString title) {
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
  public @Nullable ConfigNodePropertyString getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(@Nullable ConfigNodePropertyString title) {
    this.title = title;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties details(@Nullable ConfigNodePropertyString details) {
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
  public @Nullable ConfigNodePropertyString getDetails() {
    return details;
  }

  @JsonProperty("details")
  public void setDetails(@Nullable ConfigNodePropertyString details) {
    this.details = details;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties enabled(@Nullable ConfigNodePropertyBoolean enabled) {
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
  public @Nullable ConfigNodePropertyBoolean getEnabled() {
    return enabled;
  }

  @JsonProperty("enabled")
  public void setEnabled(@Nullable ConfigNodePropertyBoolean enabled) {
    this.enabled = enabled;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties serviceName(@Nullable ConfigNodePropertyString serviceName) {
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
  public @Nullable ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  @JsonProperty("serviceName")
  public void setServiceName(@Nullable ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties logLevel(@Nullable ConfigNodePropertyDropDown logLevel) {
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
  public @Nullable ConfigNodePropertyDropDown getLogLevel() {
    return logLevel;
  }

  @JsonProperty("log.level")
  public void setLogLevel(@Nullable ConfigNodePropertyDropDown logLevel) {
    this.logLevel = logLevel;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties queueProcessingEnabled(@Nullable ConfigNodePropertyBoolean queueProcessingEnabled) {
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
  public @Nullable ConfigNodePropertyBoolean getQueueProcessingEnabled() {
    return queueProcessingEnabled;
  }

  @JsonProperty("queue.processing.enabled")
  public void setQueueProcessingEnabled(@Nullable ConfigNodePropertyBoolean queueProcessingEnabled) {
    this.queueProcessingEnabled = queueProcessingEnabled;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties passiveQueues(@Nullable ConfigNodePropertyArray passiveQueues) {
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
  public @Nullable ConfigNodePropertyArray getPassiveQueues() {
    return passiveQueues;
  }

  @JsonProperty("passiveQueues")
  public void setPassiveQueues(@Nullable ConfigNodePropertyArray passiveQueues) {
    this.passiveQueues = passiveQueues;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties packageExporterEndpoints(@Nullable ConfigNodePropertyArray packageExporterEndpoints) {
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
  public @Nullable ConfigNodePropertyArray getPackageExporterEndpoints() {
    return packageExporterEndpoints;
  }

  @JsonProperty("packageExporter.endpoints")
  public void setPackageExporterEndpoints(@Nullable ConfigNodePropertyArray packageExporterEndpoints) {
    this.packageExporterEndpoints = packageExporterEndpoints;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties packageImporterEndpoints(@Nullable ConfigNodePropertyArray packageImporterEndpoints) {
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
  public @Nullable ConfigNodePropertyArray getPackageImporterEndpoints() {
    return packageImporterEndpoints;
  }

  @JsonProperty("packageImporter.endpoints")
  public void setPackageImporterEndpoints(@Nullable ConfigNodePropertyArray packageImporterEndpoints) {
    this.packageImporterEndpoints = packageImporterEndpoints;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties retryStrategy(@Nullable ConfigNodePropertyDropDown retryStrategy) {
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
  public @Nullable ConfigNodePropertyDropDown getRetryStrategy() {
    return retryStrategy;
  }

  @JsonProperty("retry.strategy")
  public void setRetryStrategy(@Nullable ConfigNodePropertyDropDown retryStrategy) {
    this.retryStrategy = retryStrategy;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties retryAttempts(@Nullable ConfigNodePropertyInteger retryAttempts) {
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
  public @Nullable ConfigNodePropertyInteger getRetryAttempts() {
    return retryAttempts;
  }

  @JsonProperty("retry.attempts")
  public void setRetryAttempts(@Nullable ConfigNodePropertyInteger retryAttempts) {
    this.retryAttempts = retryAttempts;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties pullItems(@Nullable ConfigNodePropertyInteger pullItems) {
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
  public @Nullable ConfigNodePropertyInteger getPullItems() {
    return pullItems;
  }

  @JsonProperty("pull.items")
  public void setPullItems(@Nullable ConfigNodePropertyInteger pullItems) {
    this.pullItems = pullItems;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties httpConnTimeout(@Nullable ConfigNodePropertyInteger httpConnTimeout) {
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
  public @Nullable ConfigNodePropertyInteger getHttpConnTimeout() {
    return httpConnTimeout;
  }

  @JsonProperty("http.conn.timeout")
  public void setHttpConnTimeout(@Nullable ConfigNodePropertyInteger httpConnTimeout) {
    this.httpConnTimeout = httpConnTimeout;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties requestAuthorizationStrategyTarget(@Nullable ConfigNodePropertyString requestAuthorizationStrategyTarget) {
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
  public @Nullable ConfigNodePropertyString getRequestAuthorizationStrategyTarget() {
    return requestAuthorizationStrategyTarget;
  }

  @JsonProperty("requestAuthorizationStrategy.target")
  public void setRequestAuthorizationStrategyTarget(@Nullable ConfigNodePropertyString requestAuthorizationStrategyTarget) {
    this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties transportSecretProviderTarget(@Nullable ConfigNodePropertyString transportSecretProviderTarget) {
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
  public @Nullable ConfigNodePropertyString getTransportSecretProviderTarget() {
    return transportSecretProviderTarget;
  }

  @JsonProperty("transportSecretProvider.target")
  public void setTransportSecretProviderTarget(@Nullable ConfigNodePropertyString transportSecretProviderTarget) {
    this.transportSecretProviderTarget = transportSecretProviderTarget;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties packageBuilderTarget(@Nullable ConfigNodePropertyString packageBuilderTarget) {
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
  public @Nullable ConfigNodePropertyString getPackageBuilderTarget() {
    return packageBuilderTarget;
  }

  @JsonProperty("packageBuilder.target")
  public void setPackageBuilderTarget(@Nullable ConfigNodePropertyString packageBuilderTarget) {
    this.packageBuilderTarget = packageBuilderTarget;
  }

  public OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties triggersTarget(@Nullable ConfigNodePropertyString triggersTarget) {
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
  public @Nullable ConfigNodePropertyString getTriggersTarget() {
    return triggersTarget;
  }

  @JsonProperty("triggers.target")
  public void setTriggersTarget(@Nullable ConfigNodePropertyString triggersTarget) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

