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
import org.openapitools.model.ConfigNodePropertyFloat;
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
 * ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties
 */

@JsonTypeName("comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger serviceRanking;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger globalSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxDiskUsage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean persistenceEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger threadPoolMaxSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger scheduledThreadPoolMaxSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger gracefulShutdownTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray queues;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray topics;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger addressesMaxDeliveryAttempts;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger addressesExpiryDelay;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown addressesAddressFullMessagePolicy;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger addressesMaxSizeBytes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger addressesPageSizeBytes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger addressesPageCacheMaxSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString clusterUser;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString clusterPassword;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger clusterCallTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger clusterCallFailoverTimeout;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger clusterClientFailureCheckPeriod;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger clusterNotificationAttempts;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger clusterNotificationInterval;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger idCacheSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger clusterConfirmationWindowSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger clusterConnectionTtl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean clusterDuplicateDetection;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger clusterInitialConnectAttempts;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger clusterMaxRetryInterval;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger clusterMinLargeMessageSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger clusterProducerWindowSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger clusterReconnectAttempts;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger clusterRetryInterval;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyFloat clusterRetryIntervalMultiplier;

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties serviceRanking(@Nullable ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  /**
   * Get serviceRanking
   * @return serviceRanking
   */
  @Valid 
  @Schema(name = "service.ranking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service.ranking")
  public @Nullable ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  @JsonProperty("service.ranking")
  public void setServiceRanking(@Nullable ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties globalSize(@Nullable ConfigNodePropertyInteger globalSize) {
    this.globalSize = globalSize;
    return this;
  }

  /**
   * Get globalSize
   * @return globalSize
   */
  @Valid 
  @Schema(name = "global.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("global.size")
  public @Nullable ConfigNodePropertyInteger getGlobalSize() {
    return globalSize;
  }

  @JsonProperty("global.size")
  public void setGlobalSize(@Nullable ConfigNodePropertyInteger globalSize) {
    this.globalSize = globalSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties maxDiskUsage(@Nullable ConfigNodePropertyInteger maxDiskUsage) {
    this.maxDiskUsage = maxDiskUsage;
    return this;
  }

  /**
   * Get maxDiskUsage
   * @return maxDiskUsage
   */
  @Valid 
  @Schema(name = "max.disk.usage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max.disk.usage")
  public @Nullable ConfigNodePropertyInteger getMaxDiskUsage() {
    return maxDiskUsage;
  }

  @JsonProperty("max.disk.usage")
  public void setMaxDiskUsage(@Nullable ConfigNodePropertyInteger maxDiskUsage) {
    this.maxDiskUsage = maxDiskUsage;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties persistenceEnabled(@Nullable ConfigNodePropertyBoolean persistenceEnabled) {
    this.persistenceEnabled = persistenceEnabled;
    return this;
  }

  /**
   * Get persistenceEnabled
   * @return persistenceEnabled
   */
  @Valid 
  @Schema(name = "persistence.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("persistence.enabled")
  public @Nullable ConfigNodePropertyBoolean getPersistenceEnabled() {
    return persistenceEnabled;
  }

  @JsonProperty("persistence.enabled")
  public void setPersistenceEnabled(@Nullable ConfigNodePropertyBoolean persistenceEnabled) {
    this.persistenceEnabled = persistenceEnabled;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties threadPoolMaxSize(@Nullable ConfigNodePropertyInteger threadPoolMaxSize) {
    this.threadPoolMaxSize = threadPoolMaxSize;
    return this;
  }

  /**
   * Get threadPoolMaxSize
   * @return threadPoolMaxSize
   */
  @Valid 
  @Schema(name = "thread.pool.max.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thread.pool.max.size")
  public @Nullable ConfigNodePropertyInteger getThreadPoolMaxSize() {
    return threadPoolMaxSize;
  }

  @JsonProperty("thread.pool.max.size")
  public void setThreadPoolMaxSize(@Nullable ConfigNodePropertyInteger threadPoolMaxSize) {
    this.threadPoolMaxSize = threadPoolMaxSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties scheduledThreadPoolMaxSize(@Nullable ConfigNodePropertyInteger scheduledThreadPoolMaxSize) {
    this.scheduledThreadPoolMaxSize = scheduledThreadPoolMaxSize;
    return this;
  }

  /**
   * Get scheduledThreadPoolMaxSize
   * @return scheduledThreadPoolMaxSize
   */
  @Valid 
  @Schema(name = "scheduled.thread.pool.max.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduled.thread.pool.max.size")
  public @Nullable ConfigNodePropertyInteger getScheduledThreadPoolMaxSize() {
    return scheduledThreadPoolMaxSize;
  }

  @JsonProperty("scheduled.thread.pool.max.size")
  public void setScheduledThreadPoolMaxSize(@Nullable ConfigNodePropertyInteger scheduledThreadPoolMaxSize) {
    this.scheduledThreadPoolMaxSize = scheduledThreadPoolMaxSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties gracefulShutdownTimeout(@Nullable ConfigNodePropertyInteger gracefulShutdownTimeout) {
    this.gracefulShutdownTimeout = gracefulShutdownTimeout;
    return this;
  }

  /**
   * Get gracefulShutdownTimeout
   * @return gracefulShutdownTimeout
   */
  @Valid 
  @Schema(name = "graceful.shutdown.timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("graceful.shutdown.timeout")
  public @Nullable ConfigNodePropertyInteger getGracefulShutdownTimeout() {
    return gracefulShutdownTimeout;
  }

  @JsonProperty("graceful.shutdown.timeout")
  public void setGracefulShutdownTimeout(@Nullable ConfigNodePropertyInteger gracefulShutdownTimeout) {
    this.gracefulShutdownTimeout = gracefulShutdownTimeout;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties queues(@Nullable ConfigNodePropertyArray queues) {
    this.queues = queues;
    return this;
  }

  /**
   * Get queues
   * @return queues
   */
  @Valid 
  @Schema(name = "queues", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queues")
  public @Nullable ConfigNodePropertyArray getQueues() {
    return queues;
  }

  @JsonProperty("queues")
  public void setQueues(@Nullable ConfigNodePropertyArray queues) {
    this.queues = queues;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties topics(@Nullable ConfigNodePropertyArray topics) {
    this.topics = topics;
    return this;
  }

  /**
   * Get topics
   * @return topics
   */
  @Valid 
  @Schema(name = "topics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("topics")
  public @Nullable ConfigNodePropertyArray getTopics() {
    return topics;
  }

  @JsonProperty("topics")
  public void setTopics(@Nullable ConfigNodePropertyArray topics) {
    this.topics = topics;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesMaxDeliveryAttempts(@Nullable ConfigNodePropertyInteger addressesMaxDeliveryAttempts) {
    this.addressesMaxDeliveryAttempts = addressesMaxDeliveryAttempts;
    return this;
  }

  /**
   * Get addressesMaxDeliveryAttempts
   * @return addressesMaxDeliveryAttempts
   */
  @Valid 
  @Schema(name = "addresses.max.delivery.attempts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addresses.max.delivery.attempts")
  public @Nullable ConfigNodePropertyInteger getAddressesMaxDeliveryAttempts() {
    return addressesMaxDeliveryAttempts;
  }

  @JsonProperty("addresses.max.delivery.attempts")
  public void setAddressesMaxDeliveryAttempts(@Nullable ConfigNodePropertyInteger addressesMaxDeliveryAttempts) {
    this.addressesMaxDeliveryAttempts = addressesMaxDeliveryAttempts;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesExpiryDelay(@Nullable ConfigNodePropertyInteger addressesExpiryDelay) {
    this.addressesExpiryDelay = addressesExpiryDelay;
    return this;
  }

  /**
   * Get addressesExpiryDelay
   * @return addressesExpiryDelay
   */
  @Valid 
  @Schema(name = "addresses.expiry.delay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addresses.expiry.delay")
  public @Nullable ConfigNodePropertyInteger getAddressesExpiryDelay() {
    return addressesExpiryDelay;
  }

  @JsonProperty("addresses.expiry.delay")
  public void setAddressesExpiryDelay(@Nullable ConfigNodePropertyInteger addressesExpiryDelay) {
    this.addressesExpiryDelay = addressesExpiryDelay;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesAddressFullMessagePolicy(@Nullable ConfigNodePropertyDropDown addressesAddressFullMessagePolicy) {
    this.addressesAddressFullMessagePolicy = addressesAddressFullMessagePolicy;
    return this;
  }

  /**
   * Get addressesAddressFullMessagePolicy
   * @return addressesAddressFullMessagePolicy
   */
  @Valid 
  @Schema(name = "addresses.address.full.message.policy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addresses.address.full.message.policy")
  public @Nullable ConfigNodePropertyDropDown getAddressesAddressFullMessagePolicy() {
    return addressesAddressFullMessagePolicy;
  }

  @JsonProperty("addresses.address.full.message.policy")
  public void setAddressesAddressFullMessagePolicy(@Nullable ConfigNodePropertyDropDown addressesAddressFullMessagePolicy) {
    this.addressesAddressFullMessagePolicy = addressesAddressFullMessagePolicy;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesMaxSizeBytes(@Nullable ConfigNodePropertyInteger addressesMaxSizeBytes) {
    this.addressesMaxSizeBytes = addressesMaxSizeBytes;
    return this;
  }

  /**
   * Get addressesMaxSizeBytes
   * @return addressesMaxSizeBytes
   */
  @Valid 
  @Schema(name = "addresses.max.size.bytes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addresses.max.size.bytes")
  public @Nullable ConfigNodePropertyInteger getAddressesMaxSizeBytes() {
    return addressesMaxSizeBytes;
  }

  @JsonProperty("addresses.max.size.bytes")
  public void setAddressesMaxSizeBytes(@Nullable ConfigNodePropertyInteger addressesMaxSizeBytes) {
    this.addressesMaxSizeBytes = addressesMaxSizeBytes;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesPageSizeBytes(@Nullable ConfigNodePropertyInteger addressesPageSizeBytes) {
    this.addressesPageSizeBytes = addressesPageSizeBytes;
    return this;
  }

  /**
   * Get addressesPageSizeBytes
   * @return addressesPageSizeBytes
   */
  @Valid 
  @Schema(name = "addresses.page.size.bytes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addresses.page.size.bytes")
  public @Nullable ConfigNodePropertyInteger getAddressesPageSizeBytes() {
    return addressesPageSizeBytes;
  }

  @JsonProperty("addresses.page.size.bytes")
  public void setAddressesPageSizeBytes(@Nullable ConfigNodePropertyInteger addressesPageSizeBytes) {
    this.addressesPageSizeBytes = addressesPageSizeBytes;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesPageCacheMaxSize(@Nullable ConfigNodePropertyInteger addressesPageCacheMaxSize) {
    this.addressesPageCacheMaxSize = addressesPageCacheMaxSize;
    return this;
  }

  /**
   * Get addressesPageCacheMaxSize
   * @return addressesPageCacheMaxSize
   */
  @Valid 
  @Schema(name = "addresses.page.cache.max.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addresses.page.cache.max.size")
  public @Nullable ConfigNodePropertyInteger getAddressesPageCacheMaxSize() {
    return addressesPageCacheMaxSize;
  }

  @JsonProperty("addresses.page.cache.max.size")
  public void setAddressesPageCacheMaxSize(@Nullable ConfigNodePropertyInteger addressesPageCacheMaxSize) {
    this.addressesPageCacheMaxSize = addressesPageCacheMaxSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterUser(@Nullable ConfigNodePropertyString clusterUser) {
    this.clusterUser = clusterUser;
    return this;
  }

  /**
   * Get clusterUser
   * @return clusterUser
   */
  @Valid 
  @Schema(name = "cluster.user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cluster.user")
  public @Nullable ConfigNodePropertyString getClusterUser() {
    return clusterUser;
  }

  @JsonProperty("cluster.user")
  public void setClusterUser(@Nullable ConfigNodePropertyString clusterUser) {
    this.clusterUser = clusterUser;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterPassword(@Nullable ConfigNodePropertyString clusterPassword) {
    this.clusterPassword = clusterPassword;
    return this;
  }

  /**
   * Get clusterPassword
   * @return clusterPassword
   */
  @Valid 
  @Schema(name = "cluster.password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cluster.password")
  public @Nullable ConfigNodePropertyString getClusterPassword() {
    return clusterPassword;
  }

  @JsonProperty("cluster.password")
  public void setClusterPassword(@Nullable ConfigNodePropertyString clusterPassword) {
    this.clusterPassword = clusterPassword;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterCallTimeout(@Nullable ConfigNodePropertyInteger clusterCallTimeout) {
    this.clusterCallTimeout = clusterCallTimeout;
    return this;
  }

  /**
   * Get clusterCallTimeout
   * @return clusterCallTimeout
   */
  @Valid 
  @Schema(name = "cluster.call.timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cluster.call.timeout")
  public @Nullable ConfigNodePropertyInteger getClusterCallTimeout() {
    return clusterCallTimeout;
  }

  @JsonProperty("cluster.call.timeout")
  public void setClusterCallTimeout(@Nullable ConfigNodePropertyInteger clusterCallTimeout) {
    this.clusterCallTimeout = clusterCallTimeout;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterCallFailoverTimeout(@Nullable ConfigNodePropertyInteger clusterCallFailoverTimeout) {
    this.clusterCallFailoverTimeout = clusterCallFailoverTimeout;
    return this;
  }

  /**
   * Get clusterCallFailoverTimeout
   * @return clusterCallFailoverTimeout
   */
  @Valid 
  @Schema(name = "cluster.call.failover.timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cluster.call.failover.timeout")
  public @Nullable ConfigNodePropertyInteger getClusterCallFailoverTimeout() {
    return clusterCallFailoverTimeout;
  }

  @JsonProperty("cluster.call.failover.timeout")
  public void setClusterCallFailoverTimeout(@Nullable ConfigNodePropertyInteger clusterCallFailoverTimeout) {
    this.clusterCallFailoverTimeout = clusterCallFailoverTimeout;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterClientFailureCheckPeriod(@Nullable ConfigNodePropertyInteger clusterClientFailureCheckPeriod) {
    this.clusterClientFailureCheckPeriod = clusterClientFailureCheckPeriod;
    return this;
  }

  /**
   * Get clusterClientFailureCheckPeriod
   * @return clusterClientFailureCheckPeriod
   */
  @Valid 
  @Schema(name = "cluster.client.failure.check.period", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cluster.client.failure.check.period")
  public @Nullable ConfigNodePropertyInteger getClusterClientFailureCheckPeriod() {
    return clusterClientFailureCheckPeriod;
  }

  @JsonProperty("cluster.client.failure.check.period")
  public void setClusterClientFailureCheckPeriod(@Nullable ConfigNodePropertyInteger clusterClientFailureCheckPeriod) {
    this.clusterClientFailureCheckPeriod = clusterClientFailureCheckPeriod;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterNotificationAttempts(@Nullable ConfigNodePropertyInteger clusterNotificationAttempts) {
    this.clusterNotificationAttempts = clusterNotificationAttempts;
    return this;
  }

  /**
   * Get clusterNotificationAttempts
   * @return clusterNotificationAttempts
   */
  @Valid 
  @Schema(name = "cluster.notification.attempts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cluster.notification.attempts")
  public @Nullable ConfigNodePropertyInteger getClusterNotificationAttempts() {
    return clusterNotificationAttempts;
  }

  @JsonProperty("cluster.notification.attempts")
  public void setClusterNotificationAttempts(@Nullable ConfigNodePropertyInteger clusterNotificationAttempts) {
    this.clusterNotificationAttempts = clusterNotificationAttempts;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterNotificationInterval(@Nullable ConfigNodePropertyInteger clusterNotificationInterval) {
    this.clusterNotificationInterval = clusterNotificationInterval;
    return this;
  }

  /**
   * Get clusterNotificationInterval
   * @return clusterNotificationInterval
   */
  @Valid 
  @Schema(name = "cluster.notification.interval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cluster.notification.interval")
  public @Nullable ConfigNodePropertyInteger getClusterNotificationInterval() {
    return clusterNotificationInterval;
  }

  @JsonProperty("cluster.notification.interval")
  public void setClusterNotificationInterval(@Nullable ConfigNodePropertyInteger clusterNotificationInterval) {
    this.clusterNotificationInterval = clusterNotificationInterval;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties idCacheSize(@Nullable ConfigNodePropertyInteger idCacheSize) {
    this.idCacheSize = idCacheSize;
    return this;
  }

  /**
   * Get idCacheSize
   * @return idCacheSize
   */
  @Valid 
  @Schema(name = "id.cache.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id.cache.size")
  public @Nullable ConfigNodePropertyInteger getIdCacheSize() {
    return idCacheSize;
  }

  @JsonProperty("id.cache.size")
  public void setIdCacheSize(@Nullable ConfigNodePropertyInteger idCacheSize) {
    this.idCacheSize = idCacheSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterConfirmationWindowSize(@Nullable ConfigNodePropertyInteger clusterConfirmationWindowSize) {
    this.clusterConfirmationWindowSize = clusterConfirmationWindowSize;
    return this;
  }

  /**
   * Get clusterConfirmationWindowSize
   * @return clusterConfirmationWindowSize
   */
  @Valid 
  @Schema(name = "cluster.confirmation.window.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cluster.confirmation.window.size")
  public @Nullable ConfigNodePropertyInteger getClusterConfirmationWindowSize() {
    return clusterConfirmationWindowSize;
  }

  @JsonProperty("cluster.confirmation.window.size")
  public void setClusterConfirmationWindowSize(@Nullable ConfigNodePropertyInteger clusterConfirmationWindowSize) {
    this.clusterConfirmationWindowSize = clusterConfirmationWindowSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterConnectionTtl(@Nullable ConfigNodePropertyInteger clusterConnectionTtl) {
    this.clusterConnectionTtl = clusterConnectionTtl;
    return this;
  }

  /**
   * Get clusterConnectionTtl
   * @return clusterConnectionTtl
   */
  @Valid 
  @Schema(name = "cluster.connection.ttl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cluster.connection.ttl")
  public @Nullable ConfigNodePropertyInteger getClusterConnectionTtl() {
    return clusterConnectionTtl;
  }

  @JsonProperty("cluster.connection.ttl")
  public void setClusterConnectionTtl(@Nullable ConfigNodePropertyInteger clusterConnectionTtl) {
    this.clusterConnectionTtl = clusterConnectionTtl;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterDuplicateDetection(@Nullable ConfigNodePropertyBoolean clusterDuplicateDetection) {
    this.clusterDuplicateDetection = clusterDuplicateDetection;
    return this;
  }

  /**
   * Get clusterDuplicateDetection
   * @return clusterDuplicateDetection
   */
  @Valid 
  @Schema(name = "cluster.duplicate.detection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cluster.duplicate.detection")
  public @Nullable ConfigNodePropertyBoolean getClusterDuplicateDetection() {
    return clusterDuplicateDetection;
  }

  @JsonProperty("cluster.duplicate.detection")
  public void setClusterDuplicateDetection(@Nullable ConfigNodePropertyBoolean clusterDuplicateDetection) {
    this.clusterDuplicateDetection = clusterDuplicateDetection;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterInitialConnectAttempts(@Nullable ConfigNodePropertyInteger clusterInitialConnectAttempts) {
    this.clusterInitialConnectAttempts = clusterInitialConnectAttempts;
    return this;
  }

  /**
   * Get clusterInitialConnectAttempts
   * @return clusterInitialConnectAttempts
   */
  @Valid 
  @Schema(name = "cluster.initial.connect.attempts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cluster.initial.connect.attempts")
  public @Nullable ConfigNodePropertyInteger getClusterInitialConnectAttempts() {
    return clusterInitialConnectAttempts;
  }

  @JsonProperty("cluster.initial.connect.attempts")
  public void setClusterInitialConnectAttempts(@Nullable ConfigNodePropertyInteger clusterInitialConnectAttempts) {
    this.clusterInitialConnectAttempts = clusterInitialConnectAttempts;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterMaxRetryInterval(@Nullable ConfigNodePropertyInteger clusterMaxRetryInterval) {
    this.clusterMaxRetryInterval = clusterMaxRetryInterval;
    return this;
  }

  /**
   * Get clusterMaxRetryInterval
   * @return clusterMaxRetryInterval
   */
  @Valid 
  @Schema(name = "cluster.max.retry.interval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cluster.max.retry.interval")
  public @Nullable ConfigNodePropertyInteger getClusterMaxRetryInterval() {
    return clusterMaxRetryInterval;
  }

  @JsonProperty("cluster.max.retry.interval")
  public void setClusterMaxRetryInterval(@Nullable ConfigNodePropertyInteger clusterMaxRetryInterval) {
    this.clusterMaxRetryInterval = clusterMaxRetryInterval;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterMinLargeMessageSize(@Nullable ConfigNodePropertyInteger clusterMinLargeMessageSize) {
    this.clusterMinLargeMessageSize = clusterMinLargeMessageSize;
    return this;
  }

  /**
   * Get clusterMinLargeMessageSize
   * @return clusterMinLargeMessageSize
   */
  @Valid 
  @Schema(name = "cluster.min.large.message.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cluster.min.large.message.size")
  public @Nullable ConfigNodePropertyInteger getClusterMinLargeMessageSize() {
    return clusterMinLargeMessageSize;
  }

  @JsonProperty("cluster.min.large.message.size")
  public void setClusterMinLargeMessageSize(@Nullable ConfigNodePropertyInteger clusterMinLargeMessageSize) {
    this.clusterMinLargeMessageSize = clusterMinLargeMessageSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterProducerWindowSize(@Nullable ConfigNodePropertyInteger clusterProducerWindowSize) {
    this.clusterProducerWindowSize = clusterProducerWindowSize;
    return this;
  }

  /**
   * Get clusterProducerWindowSize
   * @return clusterProducerWindowSize
   */
  @Valid 
  @Schema(name = "cluster.producer.window.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cluster.producer.window.size")
  public @Nullable ConfigNodePropertyInteger getClusterProducerWindowSize() {
    return clusterProducerWindowSize;
  }

  @JsonProperty("cluster.producer.window.size")
  public void setClusterProducerWindowSize(@Nullable ConfigNodePropertyInteger clusterProducerWindowSize) {
    this.clusterProducerWindowSize = clusterProducerWindowSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterReconnectAttempts(@Nullable ConfigNodePropertyInteger clusterReconnectAttempts) {
    this.clusterReconnectAttempts = clusterReconnectAttempts;
    return this;
  }

  /**
   * Get clusterReconnectAttempts
   * @return clusterReconnectAttempts
   */
  @Valid 
  @Schema(name = "cluster.reconnect.attempts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cluster.reconnect.attempts")
  public @Nullable ConfigNodePropertyInteger getClusterReconnectAttempts() {
    return clusterReconnectAttempts;
  }

  @JsonProperty("cluster.reconnect.attempts")
  public void setClusterReconnectAttempts(@Nullable ConfigNodePropertyInteger clusterReconnectAttempts) {
    this.clusterReconnectAttempts = clusterReconnectAttempts;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterRetryInterval(@Nullable ConfigNodePropertyInteger clusterRetryInterval) {
    this.clusterRetryInterval = clusterRetryInterval;
    return this;
  }

  /**
   * Get clusterRetryInterval
   * @return clusterRetryInterval
   */
  @Valid 
  @Schema(name = "cluster.retry.interval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cluster.retry.interval")
  public @Nullable ConfigNodePropertyInteger getClusterRetryInterval() {
    return clusterRetryInterval;
  }

  @JsonProperty("cluster.retry.interval")
  public void setClusterRetryInterval(@Nullable ConfigNodePropertyInteger clusterRetryInterval) {
    this.clusterRetryInterval = clusterRetryInterval;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterRetryIntervalMultiplier(@Nullable ConfigNodePropertyFloat clusterRetryIntervalMultiplier) {
    this.clusterRetryIntervalMultiplier = clusterRetryIntervalMultiplier;
    return this;
  }

  /**
   * Get clusterRetryIntervalMultiplier
   * @return clusterRetryIntervalMultiplier
   */
  @Valid 
  @Schema(name = "cluster.retry.interval.multiplier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cluster.retry.interval.multiplier")
  public @Nullable ConfigNodePropertyFloat getClusterRetryIntervalMultiplier() {
    return clusterRetryIntervalMultiplier;
  }

  @JsonProperty("cluster.retry.interval.multiplier")
  public void setClusterRetryIntervalMultiplier(@Nullable ConfigNodePropertyFloat clusterRetryIntervalMultiplier) {
    this.clusterRetryIntervalMultiplier = clusterRetryIntervalMultiplier;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties = (ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) o;
    return Objects.equals(this.serviceRanking, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.serviceRanking) &&
        Objects.equals(this.globalSize, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.globalSize) &&
        Objects.equals(this.maxDiskUsage, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.maxDiskUsage) &&
        Objects.equals(this.persistenceEnabled, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.persistenceEnabled) &&
        Objects.equals(this.threadPoolMaxSize, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.threadPoolMaxSize) &&
        Objects.equals(this.scheduledThreadPoolMaxSize, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.scheduledThreadPoolMaxSize) &&
        Objects.equals(this.gracefulShutdownTimeout, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.gracefulShutdownTimeout) &&
        Objects.equals(this.queues, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.queues) &&
        Objects.equals(this.topics, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.topics) &&
        Objects.equals(this.addressesMaxDeliveryAttempts, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.addressesMaxDeliveryAttempts) &&
        Objects.equals(this.addressesExpiryDelay, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.addressesExpiryDelay) &&
        Objects.equals(this.addressesAddressFullMessagePolicy, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.addressesAddressFullMessagePolicy) &&
        Objects.equals(this.addressesMaxSizeBytes, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.addressesMaxSizeBytes) &&
        Objects.equals(this.addressesPageSizeBytes, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.addressesPageSizeBytes) &&
        Objects.equals(this.addressesPageCacheMaxSize, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.addressesPageCacheMaxSize) &&
        Objects.equals(this.clusterUser, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterUser) &&
        Objects.equals(this.clusterPassword, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterPassword) &&
        Objects.equals(this.clusterCallTimeout, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterCallTimeout) &&
        Objects.equals(this.clusterCallFailoverTimeout, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterCallFailoverTimeout) &&
        Objects.equals(this.clusterClientFailureCheckPeriod, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterClientFailureCheckPeriod) &&
        Objects.equals(this.clusterNotificationAttempts, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterNotificationAttempts) &&
        Objects.equals(this.clusterNotificationInterval, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterNotificationInterval) &&
        Objects.equals(this.idCacheSize, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.idCacheSize) &&
        Objects.equals(this.clusterConfirmationWindowSize, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterConfirmationWindowSize) &&
        Objects.equals(this.clusterConnectionTtl, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterConnectionTtl) &&
        Objects.equals(this.clusterDuplicateDetection, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterDuplicateDetection) &&
        Objects.equals(this.clusterInitialConnectAttempts, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterInitialConnectAttempts) &&
        Objects.equals(this.clusterMaxRetryInterval, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterMaxRetryInterval) &&
        Objects.equals(this.clusterMinLargeMessageSize, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterMinLargeMessageSize) &&
        Objects.equals(this.clusterProducerWindowSize, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterProducerWindowSize) &&
        Objects.equals(this.clusterReconnectAttempts, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterReconnectAttempts) &&
        Objects.equals(this.clusterRetryInterval, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterRetryInterval) &&
        Objects.equals(this.clusterRetryIntervalMultiplier, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterRetryIntervalMultiplier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking, globalSize, maxDiskUsage, persistenceEnabled, threadPoolMaxSize, scheduledThreadPoolMaxSize, gracefulShutdownTimeout, queues, topics, addressesMaxDeliveryAttempts, addressesExpiryDelay, addressesAddressFullMessagePolicy, addressesMaxSizeBytes, addressesPageSizeBytes, addressesPageCacheMaxSize, clusterUser, clusterPassword, clusterCallTimeout, clusterCallFailoverTimeout, clusterClientFailureCheckPeriod, clusterNotificationAttempts, clusterNotificationInterval, idCacheSize, clusterConfirmationWindowSize, clusterConnectionTtl, clusterDuplicateDetection, clusterInitialConnectAttempts, clusterMaxRetryInterval, clusterMinLargeMessageSize, clusterProducerWindowSize, clusterReconnectAttempts, clusterRetryInterval, clusterRetryIntervalMultiplier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties {\n");
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    globalSize: ").append(toIndentedString(globalSize)).append("\n");
    sb.append("    maxDiskUsage: ").append(toIndentedString(maxDiskUsage)).append("\n");
    sb.append("    persistenceEnabled: ").append(toIndentedString(persistenceEnabled)).append("\n");
    sb.append("    threadPoolMaxSize: ").append(toIndentedString(threadPoolMaxSize)).append("\n");
    sb.append("    scheduledThreadPoolMaxSize: ").append(toIndentedString(scheduledThreadPoolMaxSize)).append("\n");
    sb.append("    gracefulShutdownTimeout: ").append(toIndentedString(gracefulShutdownTimeout)).append("\n");
    sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    addressesMaxDeliveryAttempts: ").append(toIndentedString(addressesMaxDeliveryAttempts)).append("\n");
    sb.append("    addressesExpiryDelay: ").append(toIndentedString(addressesExpiryDelay)).append("\n");
    sb.append("    addressesAddressFullMessagePolicy: ").append(toIndentedString(addressesAddressFullMessagePolicy)).append("\n");
    sb.append("    addressesMaxSizeBytes: ").append(toIndentedString(addressesMaxSizeBytes)).append("\n");
    sb.append("    addressesPageSizeBytes: ").append(toIndentedString(addressesPageSizeBytes)).append("\n");
    sb.append("    addressesPageCacheMaxSize: ").append(toIndentedString(addressesPageCacheMaxSize)).append("\n");
    sb.append("    clusterUser: ").append(toIndentedString(clusterUser)).append("\n");
    sb.append("    clusterPassword: ").append(toIndentedString(clusterPassword)).append("\n");
    sb.append("    clusterCallTimeout: ").append(toIndentedString(clusterCallTimeout)).append("\n");
    sb.append("    clusterCallFailoverTimeout: ").append(toIndentedString(clusterCallFailoverTimeout)).append("\n");
    sb.append("    clusterClientFailureCheckPeriod: ").append(toIndentedString(clusterClientFailureCheckPeriod)).append("\n");
    sb.append("    clusterNotificationAttempts: ").append(toIndentedString(clusterNotificationAttempts)).append("\n");
    sb.append("    clusterNotificationInterval: ").append(toIndentedString(clusterNotificationInterval)).append("\n");
    sb.append("    idCacheSize: ").append(toIndentedString(idCacheSize)).append("\n");
    sb.append("    clusterConfirmationWindowSize: ").append(toIndentedString(clusterConfirmationWindowSize)).append("\n");
    sb.append("    clusterConnectionTtl: ").append(toIndentedString(clusterConnectionTtl)).append("\n");
    sb.append("    clusterDuplicateDetection: ").append(toIndentedString(clusterDuplicateDetection)).append("\n");
    sb.append("    clusterInitialConnectAttempts: ").append(toIndentedString(clusterInitialConnectAttempts)).append("\n");
    sb.append("    clusterMaxRetryInterval: ").append(toIndentedString(clusterMaxRetryInterval)).append("\n");
    sb.append("    clusterMinLargeMessageSize: ").append(toIndentedString(clusterMinLargeMessageSize)).append("\n");
    sb.append("    clusterProducerWindowSize: ").append(toIndentedString(clusterProducerWindowSize)).append("\n");
    sb.append("    clusterReconnectAttempts: ").append(toIndentedString(clusterReconnectAttempts)).append("\n");
    sb.append("    clusterRetryInterval: ").append(toIndentedString(clusterRetryInterval)).append("\n");
    sb.append("    clusterRetryIntervalMultiplier: ").append(toIndentedString(clusterRetryIntervalMultiplier)).append("\n");
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

