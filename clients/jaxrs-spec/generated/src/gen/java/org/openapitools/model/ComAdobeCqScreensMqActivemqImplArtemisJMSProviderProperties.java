package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyFloat;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties   {
  
  private @Valid ConfigNodePropertyInteger serviceRanking = null;
  private @Valid ConfigNodePropertyInteger globalSize = null;
  private @Valid ConfigNodePropertyInteger maxDiskUsage = null;
  private @Valid ConfigNodePropertyBoolean persistenceEnabled = null;
  private @Valid ConfigNodePropertyInteger threadPoolMaxSize = null;
  private @Valid ConfigNodePropertyInteger scheduledThreadPoolMaxSize = null;
  private @Valid ConfigNodePropertyInteger gracefulShutdownTimeout = null;
  private @Valid ConfigNodePropertyArray queues = null;
  private @Valid ConfigNodePropertyArray topics = null;
  private @Valid ConfigNodePropertyInteger addressesMaxDeliveryAttempts = null;
  private @Valid ConfigNodePropertyInteger addressesExpiryDelay = null;
  private @Valid ConfigNodePropertyDropDown addressesAddressFullMessagePolicy = null;
  private @Valid ConfigNodePropertyInteger addressesMaxSizeBytes = null;
  private @Valid ConfigNodePropertyInteger addressesPageSizeBytes = null;
  private @Valid ConfigNodePropertyInteger addressesPageCacheMaxSize = null;
  private @Valid ConfigNodePropertyString clusterUser = null;
  private @Valid ConfigNodePropertyString clusterPassword = null;
  private @Valid ConfigNodePropertyInteger clusterCallTimeout = null;
  private @Valid ConfigNodePropertyInteger clusterCallFailoverTimeout = null;
  private @Valid ConfigNodePropertyInteger clusterClientFailureCheckPeriod = null;
  private @Valid ConfigNodePropertyInteger clusterNotificationAttempts = null;
  private @Valid ConfigNodePropertyInteger clusterNotificationInterval = null;
  private @Valid ConfigNodePropertyInteger idCacheSize = null;
  private @Valid ConfigNodePropertyInteger clusterConfirmationWindowSize = null;
  private @Valid ConfigNodePropertyInteger clusterConnectionTtl = null;
  private @Valid ConfigNodePropertyBoolean clusterDuplicateDetection = null;
  private @Valid ConfigNodePropertyInteger clusterInitialConnectAttempts = null;
  private @Valid ConfigNodePropertyInteger clusterMaxRetryInterval = null;
  private @Valid ConfigNodePropertyInteger clusterMinLargeMessageSize = null;
  private @Valid ConfigNodePropertyInteger clusterProducerWindowSize = null;
  private @Valid ConfigNodePropertyInteger clusterReconnectAttempts = null;
  private @Valid ConfigNodePropertyInteger clusterRetryInterval = null;
  private @Valid ConfigNodePropertyFloat clusterRetryIntervalMultiplier = null;

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties globalSize(ConfigNodePropertyInteger globalSize) {
    this.globalSize = globalSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("global.size")
  public ConfigNodePropertyInteger getGlobalSize() {
    return globalSize;
  }
  public void setGlobalSize(ConfigNodePropertyInteger globalSize) {
    this.globalSize = globalSize;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties maxDiskUsage(ConfigNodePropertyInteger maxDiskUsage) {
    this.maxDiskUsage = maxDiskUsage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("max.disk.usage")
  public ConfigNodePropertyInteger getMaxDiskUsage() {
    return maxDiskUsage;
  }
  public void setMaxDiskUsage(ConfigNodePropertyInteger maxDiskUsage) {
    this.maxDiskUsage = maxDiskUsage;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties persistenceEnabled(ConfigNodePropertyBoolean persistenceEnabled) {
    this.persistenceEnabled = persistenceEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("persistence.enabled")
  public ConfigNodePropertyBoolean getPersistenceEnabled() {
    return persistenceEnabled;
  }
  public void setPersistenceEnabled(ConfigNodePropertyBoolean persistenceEnabled) {
    this.persistenceEnabled = persistenceEnabled;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties threadPoolMaxSize(ConfigNodePropertyInteger threadPoolMaxSize) {
    this.threadPoolMaxSize = threadPoolMaxSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("thread.pool.max.size")
  public ConfigNodePropertyInteger getThreadPoolMaxSize() {
    return threadPoolMaxSize;
  }
  public void setThreadPoolMaxSize(ConfigNodePropertyInteger threadPoolMaxSize) {
    this.threadPoolMaxSize = threadPoolMaxSize;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties scheduledThreadPoolMaxSize(ConfigNodePropertyInteger scheduledThreadPoolMaxSize) {
    this.scheduledThreadPoolMaxSize = scheduledThreadPoolMaxSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scheduled.thread.pool.max.size")
  public ConfigNodePropertyInteger getScheduledThreadPoolMaxSize() {
    return scheduledThreadPoolMaxSize;
  }
  public void setScheduledThreadPoolMaxSize(ConfigNodePropertyInteger scheduledThreadPoolMaxSize) {
    this.scheduledThreadPoolMaxSize = scheduledThreadPoolMaxSize;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties gracefulShutdownTimeout(ConfigNodePropertyInteger gracefulShutdownTimeout) {
    this.gracefulShutdownTimeout = gracefulShutdownTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("graceful.shutdown.timeout")
  public ConfigNodePropertyInteger getGracefulShutdownTimeout() {
    return gracefulShutdownTimeout;
  }
  public void setGracefulShutdownTimeout(ConfigNodePropertyInteger gracefulShutdownTimeout) {
    this.gracefulShutdownTimeout = gracefulShutdownTimeout;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties queues(ConfigNodePropertyArray queues) {
    this.queues = queues;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("queues")
  public ConfigNodePropertyArray getQueues() {
    return queues;
  }
  public void setQueues(ConfigNodePropertyArray queues) {
    this.queues = queues;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties topics(ConfigNodePropertyArray topics) {
    this.topics = topics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("topics")
  public ConfigNodePropertyArray getTopics() {
    return topics;
  }
  public void setTopics(ConfigNodePropertyArray topics) {
    this.topics = topics;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesMaxDeliveryAttempts(ConfigNodePropertyInteger addressesMaxDeliveryAttempts) {
    this.addressesMaxDeliveryAttempts = addressesMaxDeliveryAttempts;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("addresses.max.delivery.attempts")
  public ConfigNodePropertyInteger getAddressesMaxDeliveryAttempts() {
    return addressesMaxDeliveryAttempts;
  }
  public void setAddressesMaxDeliveryAttempts(ConfigNodePropertyInteger addressesMaxDeliveryAttempts) {
    this.addressesMaxDeliveryAttempts = addressesMaxDeliveryAttempts;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesExpiryDelay(ConfigNodePropertyInteger addressesExpiryDelay) {
    this.addressesExpiryDelay = addressesExpiryDelay;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("addresses.expiry.delay")
  public ConfigNodePropertyInteger getAddressesExpiryDelay() {
    return addressesExpiryDelay;
  }
  public void setAddressesExpiryDelay(ConfigNodePropertyInteger addressesExpiryDelay) {
    this.addressesExpiryDelay = addressesExpiryDelay;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesAddressFullMessagePolicy(ConfigNodePropertyDropDown addressesAddressFullMessagePolicy) {
    this.addressesAddressFullMessagePolicy = addressesAddressFullMessagePolicy;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("addresses.address.full.message.policy")
  public ConfigNodePropertyDropDown getAddressesAddressFullMessagePolicy() {
    return addressesAddressFullMessagePolicy;
  }
  public void setAddressesAddressFullMessagePolicy(ConfigNodePropertyDropDown addressesAddressFullMessagePolicy) {
    this.addressesAddressFullMessagePolicy = addressesAddressFullMessagePolicy;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesMaxSizeBytes(ConfigNodePropertyInteger addressesMaxSizeBytes) {
    this.addressesMaxSizeBytes = addressesMaxSizeBytes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("addresses.max.size.bytes")
  public ConfigNodePropertyInteger getAddressesMaxSizeBytes() {
    return addressesMaxSizeBytes;
  }
  public void setAddressesMaxSizeBytes(ConfigNodePropertyInteger addressesMaxSizeBytes) {
    this.addressesMaxSizeBytes = addressesMaxSizeBytes;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesPageSizeBytes(ConfigNodePropertyInteger addressesPageSizeBytes) {
    this.addressesPageSizeBytes = addressesPageSizeBytes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("addresses.page.size.bytes")
  public ConfigNodePropertyInteger getAddressesPageSizeBytes() {
    return addressesPageSizeBytes;
  }
  public void setAddressesPageSizeBytes(ConfigNodePropertyInteger addressesPageSizeBytes) {
    this.addressesPageSizeBytes = addressesPageSizeBytes;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesPageCacheMaxSize(ConfigNodePropertyInteger addressesPageCacheMaxSize) {
    this.addressesPageCacheMaxSize = addressesPageCacheMaxSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("addresses.page.cache.max.size")
  public ConfigNodePropertyInteger getAddressesPageCacheMaxSize() {
    return addressesPageCacheMaxSize;
  }
  public void setAddressesPageCacheMaxSize(ConfigNodePropertyInteger addressesPageCacheMaxSize) {
    this.addressesPageCacheMaxSize = addressesPageCacheMaxSize;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterUser(ConfigNodePropertyString clusterUser) {
    this.clusterUser = clusterUser;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cluster.user")
  public ConfigNodePropertyString getClusterUser() {
    return clusterUser;
  }
  public void setClusterUser(ConfigNodePropertyString clusterUser) {
    this.clusterUser = clusterUser;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterPassword(ConfigNodePropertyString clusterPassword) {
    this.clusterPassword = clusterPassword;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cluster.password")
  public ConfigNodePropertyString getClusterPassword() {
    return clusterPassword;
  }
  public void setClusterPassword(ConfigNodePropertyString clusterPassword) {
    this.clusterPassword = clusterPassword;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterCallTimeout(ConfigNodePropertyInteger clusterCallTimeout) {
    this.clusterCallTimeout = clusterCallTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cluster.call.timeout")
  public ConfigNodePropertyInteger getClusterCallTimeout() {
    return clusterCallTimeout;
  }
  public void setClusterCallTimeout(ConfigNodePropertyInteger clusterCallTimeout) {
    this.clusterCallTimeout = clusterCallTimeout;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterCallFailoverTimeout(ConfigNodePropertyInteger clusterCallFailoverTimeout) {
    this.clusterCallFailoverTimeout = clusterCallFailoverTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cluster.call.failover.timeout")
  public ConfigNodePropertyInteger getClusterCallFailoverTimeout() {
    return clusterCallFailoverTimeout;
  }
  public void setClusterCallFailoverTimeout(ConfigNodePropertyInteger clusterCallFailoverTimeout) {
    this.clusterCallFailoverTimeout = clusterCallFailoverTimeout;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterClientFailureCheckPeriod(ConfigNodePropertyInteger clusterClientFailureCheckPeriod) {
    this.clusterClientFailureCheckPeriod = clusterClientFailureCheckPeriod;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cluster.client.failure.check.period")
  public ConfigNodePropertyInteger getClusterClientFailureCheckPeriod() {
    return clusterClientFailureCheckPeriod;
  }
  public void setClusterClientFailureCheckPeriod(ConfigNodePropertyInteger clusterClientFailureCheckPeriod) {
    this.clusterClientFailureCheckPeriod = clusterClientFailureCheckPeriod;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterNotificationAttempts(ConfigNodePropertyInteger clusterNotificationAttempts) {
    this.clusterNotificationAttempts = clusterNotificationAttempts;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cluster.notification.attempts")
  public ConfigNodePropertyInteger getClusterNotificationAttempts() {
    return clusterNotificationAttempts;
  }
  public void setClusterNotificationAttempts(ConfigNodePropertyInteger clusterNotificationAttempts) {
    this.clusterNotificationAttempts = clusterNotificationAttempts;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterNotificationInterval(ConfigNodePropertyInteger clusterNotificationInterval) {
    this.clusterNotificationInterval = clusterNotificationInterval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cluster.notification.interval")
  public ConfigNodePropertyInteger getClusterNotificationInterval() {
    return clusterNotificationInterval;
  }
  public void setClusterNotificationInterval(ConfigNodePropertyInteger clusterNotificationInterval) {
    this.clusterNotificationInterval = clusterNotificationInterval;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties idCacheSize(ConfigNodePropertyInteger idCacheSize) {
    this.idCacheSize = idCacheSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("id.cache.size")
  public ConfigNodePropertyInteger getIdCacheSize() {
    return idCacheSize;
  }
  public void setIdCacheSize(ConfigNodePropertyInteger idCacheSize) {
    this.idCacheSize = idCacheSize;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterConfirmationWindowSize(ConfigNodePropertyInteger clusterConfirmationWindowSize) {
    this.clusterConfirmationWindowSize = clusterConfirmationWindowSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cluster.confirmation.window.size")
  public ConfigNodePropertyInteger getClusterConfirmationWindowSize() {
    return clusterConfirmationWindowSize;
  }
  public void setClusterConfirmationWindowSize(ConfigNodePropertyInteger clusterConfirmationWindowSize) {
    this.clusterConfirmationWindowSize = clusterConfirmationWindowSize;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterConnectionTtl(ConfigNodePropertyInteger clusterConnectionTtl) {
    this.clusterConnectionTtl = clusterConnectionTtl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cluster.connection.ttl")
  public ConfigNodePropertyInteger getClusterConnectionTtl() {
    return clusterConnectionTtl;
  }
  public void setClusterConnectionTtl(ConfigNodePropertyInteger clusterConnectionTtl) {
    this.clusterConnectionTtl = clusterConnectionTtl;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterDuplicateDetection(ConfigNodePropertyBoolean clusterDuplicateDetection) {
    this.clusterDuplicateDetection = clusterDuplicateDetection;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cluster.duplicate.detection")
  public ConfigNodePropertyBoolean getClusterDuplicateDetection() {
    return clusterDuplicateDetection;
  }
  public void setClusterDuplicateDetection(ConfigNodePropertyBoolean clusterDuplicateDetection) {
    this.clusterDuplicateDetection = clusterDuplicateDetection;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterInitialConnectAttempts(ConfigNodePropertyInteger clusterInitialConnectAttempts) {
    this.clusterInitialConnectAttempts = clusterInitialConnectAttempts;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cluster.initial.connect.attempts")
  public ConfigNodePropertyInteger getClusterInitialConnectAttempts() {
    return clusterInitialConnectAttempts;
  }
  public void setClusterInitialConnectAttempts(ConfigNodePropertyInteger clusterInitialConnectAttempts) {
    this.clusterInitialConnectAttempts = clusterInitialConnectAttempts;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterMaxRetryInterval(ConfigNodePropertyInteger clusterMaxRetryInterval) {
    this.clusterMaxRetryInterval = clusterMaxRetryInterval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cluster.max.retry.interval")
  public ConfigNodePropertyInteger getClusterMaxRetryInterval() {
    return clusterMaxRetryInterval;
  }
  public void setClusterMaxRetryInterval(ConfigNodePropertyInteger clusterMaxRetryInterval) {
    this.clusterMaxRetryInterval = clusterMaxRetryInterval;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterMinLargeMessageSize(ConfigNodePropertyInteger clusterMinLargeMessageSize) {
    this.clusterMinLargeMessageSize = clusterMinLargeMessageSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cluster.min.large.message.size")
  public ConfigNodePropertyInteger getClusterMinLargeMessageSize() {
    return clusterMinLargeMessageSize;
  }
  public void setClusterMinLargeMessageSize(ConfigNodePropertyInteger clusterMinLargeMessageSize) {
    this.clusterMinLargeMessageSize = clusterMinLargeMessageSize;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterProducerWindowSize(ConfigNodePropertyInteger clusterProducerWindowSize) {
    this.clusterProducerWindowSize = clusterProducerWindowSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cluster.producer.window.size")
  public ConfigNodePropertyInteger getClusterProducerWindowSize() {
    return clusterProducerWindowSize;
  }
  public void setClusterProducerWindowSize(ConfigNodePropertyInteger clusterProducerWindowSize) {
    this.clusterProducerWindowSize = clusterProducerWindowSize;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterReconnectAttempts(ConfigNodePropertyInteger clusterReconnectAttempts) {
    this.clusterReconnectAttempts = clusterReconnectAttempts;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cluster.reconnect.attempts")
  public ConfigNodePropertyInteger getClusterReconnectAttempts() {
    return clusterReconnectAttempts;
  }
  public void setClusterReconnectAttempts(ConfigNodePropertyInteger clusterReconnectAttempts) {
    this.clusterReconnectAttempts = clusterReconnectAttempts;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterRetryInterval(ConfigNodePropertyInteger clusterRetryInterval) {
    this.clusterRetryInterval = clusterRetryInterval;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cluster.retry.interval")
  public ConfigNodePropertyInteger getClusterRetryInterval() {
    return clusterRetryInterval;
  }
  public void setClusterRetryInterval(ConfigNodePropertyInteger clusterRetryInterval) {
    this.clusterRetryInterval = clusterRetryInterval;
  }

  /**
   **/
  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterRetryIntervalMultiplier(ConfigNodePropertyFloat clusterRetryIntervalMultiplier) {
    this.clusterRetryIntervalMultiplier = clusterRetryIntervalMultiplier;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cluster.retry.interval.multiplier")
  public ConfigNodePropertyFloat getClusterRetryIntervalMultiplier() {
    return clusterRetryIntervalMultiplier;
  }
  public void setClusterRetryIntervalMultiplier(ConfigNodePropertyFloat clusterRetryIntervalMultiplier) {
    this.clusterRetryIntervalMultiplier = clusterRetryIntervalMultiplier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties = (ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) o;
    return Objects.equals(serviceRanking, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.serviceRanking) &&
        Objects.equals(globalSize, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.globalSize) &&
        Objects.equals(maxDiskUsage, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.maxDiskUsage) &&
        Objects.equals(persistenceEnabled, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.persistenceEnabled) &&
        Objects.equals(threadPoolMaxSize, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.threadPoolMaxSize) &&
        Objects.equals(scheduledThreadPoolMaxSize, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.scheduledThreadPoolMaxSize) &&
        Objects.equals(gracefulShutdownTimeout, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.gracefulShutdownTimeout) &&
        Objects.equals(queues, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.queues) &&
        Objects.equals(topics, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.topics) &&
        Objects.equals(addressesMaxDeliveryAttempts, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.addressesMaxDeliveryAttempts) &&
        Objects.equals(addressesExpiryDelay, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.addressesExpiryDelay) &&
        Objects.equals(addressesAddressFullMessagePolicy, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.addressesAddressFullMessagePolicy) &&
        Objects.equals(addressesMaxSizeBytes, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.addressesMaxSizeBytes) &&
        Objects.equals(addressesPageSizeBytes, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.addressesPageSizeBytes) &&
        Objects.equals(addressesPageCacheMaxSize, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.addressesPageCacheMaxSize) &&
        Objects.equals(clusterUser, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterUser) &&
        Objects.equals(clusterPassword, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterPassword) &&
        Objects.equals(clusterCallTimeout, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterCallTimeout) &&
        Objects.equals(clusterCallFailoverTimeout, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterCallFailoverTimeout) &&
        Objects.equals(clusterClientFailureCheckPeriod, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterClientFailureCheckPeriod) &&
        Objects.equals(clusterNotificationAttempts, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterNotificationAttempts) &&
        Objects.equals(clusterNotificationInterval, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterNotificationInterval) &&
        Objects.equals(idCacheSize, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.idCacheSize) &&
        Objects.equals(clusterConfirmationWindowSize, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterConfirmationWindowSize) &&
        Objects.equals(clusterConnectionTtl, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterConnectionTtl) &&
        Objects.equals(clusterDuplicateDetection, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterDuplicateDetection) &&
        Objects.equals(clusterInitialConnectAttempts, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterInitialConnectAttempts) &&
        Objects.equals(clusterMaxRetryInterval, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterMaxRetryInterval) &&
        Objects.equals(clusterMinLargeMessageSize, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterMinLargeMessageSize) &&
        Objects.equals(clusterProducerWindowSize, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterProducerWindowSize) &&
        Objects.equals(clusterReconnectAttempts, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterReconnectAttempts) &&
        Objects.equals(clusterRetryInterval, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterRetryInterval) &&
        Objects.equals(clusterRetryIntervalMultiplier, comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.clusterRetryIntervalMultiplier);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

