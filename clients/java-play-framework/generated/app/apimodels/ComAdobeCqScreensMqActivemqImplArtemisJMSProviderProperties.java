package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyDropDown;
import apimodels.ConfigNodePropertyFloat;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties   {
  @JsonProperty("service.ranking")
  private ConfigNodePropertyInteger serviceRanking = null;

  @JsonProperty("global.size")
  private ConfigNodePropertyInteger globalSize = null;

  @JsonProperty("max.disk.usage")
  private ConfigNodePropertyInteger maxDiskUsage = null;

  @JsonProperty("persistence.enabled")
  private ConfigNodePropertyBoolean persistenceEnabled = null;

  @JsonProperty("thread.pool.max.size")
  private ConfigNodePropertyInteger threadPoolMaxSize = null;

  @JsonProperty("scheduled.thread.pool.max.size")
  private ConfigNodePropertyInteger scheduledThreadPoolMaxSize = null;

  @JsonProperty("graceful.shutdown.timeout")
  private ConfigNodePropertyInteger gracefulShutdownTimeout = null;

  @JsonProperty("queues")
  private ConfigNodePropertyArray queues = null;

  @JsonProperty("topics")
  private ConfigNodePropertyArray topics = null;

  @JsonProperty("addresses.max.delivery.attempts")
  private ConfigNodePropertyInteger addressesMaxDeliveryAttempts = null;

  @JsonProperty("addresses.expiry.delay")
  private ConfigNodePropertyInteger addressesExpiryDelay = null;

  @JsonProperty("addresses.address.full.message.policy")
  private ConfigNodePropertyDropDown addressesAddressFullMessagePolicy = null;

  @JsonProperty("addresses.max.size.bytes")
  private ConfigNodePropertyInteger addressesMaxSizeBytes = null;

  @JsonProperty("addresses.page.size.bytes")
  private ConfigNodePropertyInteger addressesPageSizeBytes = null;

  @JsonProperty("addresses.page.cache.max.size")
  private ConfigNodePropertyInteger addressesPageCacheMaxSize = null;

  @JsonProperty("cluster.user")
  private ConfigNodePropertyString clusterUser = null;

  @JsonProperty("cluster.password")
  private ConfigNodePropertyString clusterPassword = null;

  @JsonProperty("cluster.call.timeout")
  private ConfigNodePropertyInteger clusterCallTimeout = null;

  @JsonProperty("cluster.call.failover.timeout")
  private ConfigNodePropertyInteger clusterCallFailoverTimeout = null;

  @JsonProperty("cluster.client.failure.check.period")
  private ConfigNodePropertyInteger clusterClientFailureCheckPeriod = null;

  @JsonProperty("cluster.notification.attempts")
  private ConfigNodePropertyInteger clusterNotificationAttempts = null;

  @JsonProperty("cluster.notification.interval")
  private ConfigNodePropertyInteger clusterNotificationInterval = null;

  @JsonProperty("id.cache.size")
  private ConfigNodePropertyInteger idCacheSize = null;

  @JsonProperty("cluster.confirmation.window.size")
  private ConfigNodePropertyInteger clusterConfirmationWindowSize = null;

  @JsonProperty("cluster.connection.ttl")
  private ConfigNodePropertyInteger clusterConnectionTtl = null;

  @JsonProperty("cluster.duplicate.detection")
  private ConfigNodePropertyBoolean clusterDuplicateDetection = null;

  @JsonProperty("cluster.initial.connect.attempts")
  private ConfigNodePropertyInteger clusterInitialConnectAttempts = null;

  @JsonProperty("cluster.max.retry.interval")
  private ConfigNodePropertyInteger clusterMaxRetryInterval = null;

  @JsonProperty("cluster.min.large.message.size")
  private ConfigNodePropertyInteger clusterMinLargeMessageSize = null;

  @JsonProperty("cluster.producer.window.size")
  private ConfigNodePropertyInteger clusterProducerWindowSize = null;

  @JsonProperty("cluster.reconnect.attempts")
  private ConfigNodePropertyInteger clusterReconnectAttempts = null;

  @JsonProperty("cluster.retry.interval")
  private ConfigNodePropertyInteger clusterRetryInterval = null;

  @JsonProperty("cluster.retry.interval.multiplier")
  private ConfigNodePropertyFloat clusterRetryIntervalMultiplier = null;

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

   /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @Valid
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties globalSize(ConfigNodePropertyInteger globalSize) {
    this.globalSize = globalSize;
    return this;
  }

   /**
   * Get globalSize
   * @return globalSize
  **/
  @Valid
  public ConfigNodePropertyInteger getGlobalSize() {
    return globalSize;
  }

  public void setGlobalSize(ConfigNodePropertyInteger globalSize) {
    this.globalSize = globalSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties maxDiskUsage(ConfigNodePropertyInteger maxDiskUsage) {
    this.maxDiskUsage = maxDiskUsage;
    return this;
  }

   /**
   * Get maxDiskUsage
   * @return maxDiskUsage
  **/
  @Valid
  public ConfigNodePropertyInteger getMaxDiskUsage() {
    return maxDiskUsage;
  }

  public void setMaxDiskUsage(ConfigNodePropertyInteger maxDiskUsage) {
    this.maxDiskUsage = maxDiskUsage;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties persistenceEnabled(ConfigNodePropertyBoolean persistenceEnabled) {
    this.persistenceEnabled = persistenceEnabled;
    return this;
  }

   /**
   * Get persistenceEnabled
   * @return persistenceEnabled
  **/
  @Valid
  public ConfigNodePropertyBoolean getPersistenceEnabled() {
    return persistenceEnabled;
  }

  public void setPersistenceEnabled(ConfigNodePropertyBoolean persistenceEnabled) {
    this.persistenceEnabled = persistenceEnabled;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties threadPoolMaxSize(ConfigNodePropertyInteger threadPoolMaxSize) {
    this.threadPoolMaxSize = threadPoolMaxSize;
    return this;
  }

   /**
   * Get threadPoolMaxSize
   * @return threadPoolMaxSize
  **/
  @Valid
  public ConfigNodePropertyInteger getThreadPoolMaxSize() {
    return threadPoolMaxSize;
  }

  public void setThreadPoolMaxSize(ConfigNodePropertyInteger threadPoolMaxSize) {
    this.threadPoolMaxSize = threadPoolMaxSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties scheduledThreadPoolMaxSize(ConfigNodePropertyInteger scheduledThreadPoolMaxSize) {
    this.scheduledThreadPoolMaxSize = scheduledThreadPoolMaxSize;
    return this;
  }

   /**
   * Get scheduledThreadPoolMaxSize
   * @return scheduledThreadPoolMaxSize
  **/
  @Valid
  public ConfigNodePropertyInteger getScheduledThreadPoolMaxSize() {
    return scheduledThreadPoolMaxSize;
  }

  public void setScheduledThreadPoolMaxSize(ConfigNodePropertyInteger scheduledThreadPoolMaxSize) {
    this.scheduledThreadPoolMaxSize = scheduledThreadPoolMaxSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties gracefulShutdownTimeout(ConfigNodePropertyInteger gracefulShutdownTimeout) {
    this.gracefulShutdownTimeout = gracefulShutdownTimeout;
    return this;
  }

   /**
   * Get gracefulShutdownTimeout
   * @return gracefulShutdownTimeout
  **/
  @Valid
  public ConfigNodePropertyInteger getGracefulShutdownTimeout() {
    return gracefulShutdownTimeout;
  }

  public void setGracefulShutdownTimeout(ConfigNodePropertyInteger gracefulShutdownTimeout) {
    this.gracefulShutdownTimeout = gracefulShutdownTimeout;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties queues(ConfigNodePropertyArray queues) {
    this.queues = queues;
    return this;
  }

   /**
   * Get queues
   * @return queues
  **/
  @Valid
  public ConfigNodePropertyArray getQueues() {
    return queues;
  }

  public void setQueues(ConfigNodePropertyArray queues) {
    this.queues = queues;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties topics(ConfigNodePropertyArray topics) {
    this.topics = topics;
    return this;
  }

   /**
   * Get topics
   * @return topics
  **/
  @Valid
  public ConfigNodePropertyArray getTopics() {
    return topics;
  }

  public void setTopics(ConfigNodePropertyArray topics) {
    this.topics = topics;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesMaxDeliveryAttempts(ConfigNodePropertyInteger addressesMaxDeliveryAttempts) {
    this.addressesMaxDeliveryAttempts = addressesMaxDeliveryAttempts;
    return this;
  }

   /**
   * Get addressesMaxDeliveryAttempts
   * @return addressesMaxDeliveryAttempts
  **/
  @Valid
  public ConfigNodePropertyInteger getAddressesMaxDeliveryAttempts() {
    return addressesMaxDeliveryAttempts;
  }

  public void setAddressesMaxDeliveryAttempts(ConfigNodePropertyInteger addressesMaxDeliveryAttempts) {
    this.addressesMaxDeliveryAttempts = addressesMaxDeliveryAttempts;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesExpiryDelay(ConfigNodePropertyInteger addressesExpiryDelay) {
    this.addressesExpiryDelay = addressesExpiryDelay;
    return this;
  }

   /**
   * Get addressesExpiryDelay
   * @return addressesExpiryDelay
  **/
  @Valid
  public ConfigNodePropertyInteger getAddressesExpiryDelay() {
    return addressesExpiryDelay;
  }

  public void setAddressesExpiryDelay(ConfigNodePropertyInteger addressesExpiryDelay) {
    this.addressesExpiryDelay = addressesExpiryDelay;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesAddressFullMessagePolicy(ConfigNodePropertyDropDown addressesAddressFullMessagePolicy) {
    this.addressesAddressFullMessagePolicy = addressesAddressFullMessagePolicy;
    return this;
  }

   /**
   * Get addressesAddressFullMessagePolicy
   * @return addressesAddressFullMessagePolicy
  **/
  @Valid
  public ConfigNodePropertyDropDown getAddressesAddressFullMessagePolicy() {
    return addressesAddressFullMessagePolicy;
  }

  public void setAddressesAddressFullMessagePolicy(ConfigNodePropertyDropDown addressesAddressFullMessagePolicy) {
    this.addressesAddressFullMessagePolicy = addressesAddressFullMessagePolicy;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesMaxSizeBytes(ConfigNodePropertyInteger addressesMaxSizeBytes) {
    this.addressesMaxSizeBytes = addressesMaxSizeBytes;
    return this;
  }

   /**
   * Get addressesMaxSizeBytes
   * @return addressesMaxSizeBytes
  **/
  @Valid
  public ConfigNodePropertyInteger getAddressesMaxSizeBytes() {
    return addressesMaxSizeBytes;
  }

  public void setAddressesMaxSizeBytes(ConfigNodePropertyInteger addressesMaxSizeBytes) {
    this.addressesMaxSizeBytes = addressesMaxSizeBytes;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesPageSizeBytes(ConfigNodePropertyInteger addressesPageSizeBytes) {
    this.addressesPageSizeBytes = addressesPageSizeBytes;
    return this;
  }

   /**
   * Get addressesPageSizeBytes
   * @return addressesPageSizeBytes
  **/
  @Valid
  public ConfigNodePropertyInteger getAddressesPageSizeBytes() {
    return addressesPageSizeBytes;
  }

  public void setAddressesPageSizeBytes(ConfigNodePropertyInteger addressesPageSizeBytes) {
    this.addressesPageSizeBytes = addressesPageSizeBytes;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesPageCacheMaxSize(ConfigNodePropertyInteger addressesPageCacheMaxSize) {
    this.addressesPageCacheMaxSize = addressesPageCacheMaxSize;
    return this;
  }

   /**
   * Get addressesPageCacheMaxSize
   * @return addressesPageCacheMaxSize
  **/
  @Valid
  public ConfigNodePropertyInteger getAddressesPageCacheMaxSize() {
    return addressesPageCacheMaxSize;
  }

  public void setAddressesPageCacheMaxSize(ConfigNodePropertyInteger addressesPageCacheMaxSize) {
    this.addressesPageCacheMaxSize = addressesPageCacheMaxSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterUser(ConfigNodePropertyString clusterUser) {
    this.clusterUser = clusterUser;
    return this;
  }

   /**
   * Get clusterUser
   * @return clusterUser
  **/
  @Valid
  public ConfigNodePropertyString getClusterUser() {
    return clusterUser;
  }

  public void setClusterUser(ConfigNodePropertyString clusterUser) {
    this.clusterUser = clusterUser;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterPassword(ConfigNodePropertyString clusterPassword) {
    this.clusterPassword = clusterPassword;
    return this;
  }

   /**
   * Get clusterPassword
   * @return clusterPassword
  **/
  @Valid
  public ConfigNodePropertyString getClusterPassword() {
    return clusterPassword;
  }

  public void setClusterPassword(ConfigNodePropertyString clusterPassword) {
    this.clusterPassword = clusterPassword;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterCallTimeout(ConfigNodePropertyInteger clusterCallTimeout) {
    this.clusterCallTimeout = clusterCallTimeout;
    return this;
  }

   /**
   * Get clusterCallTimeout
   * @return clusterCallTimeout
  **/
  @Valid
  public ConfigNodePropertyInteger getClusterCallTimeout() {
    return clusterCallTimeout;
  }

  public void setClusterCallTimeout(ConfigNodePropertyInteger clusterCallTimeout) {
    this.clusterCallTimeout = clusterCallTimeout;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterCallFailoverTimeout(ConfigNodePropertyInteger clusterCallFailoverTimeout) {
    this.clusterCallFailoverTimeout = clusterCallFailoverTimeout;
    return this;
  }

   /**
   * Get clusterCallFailoverTimeout
   * @return clusterCallFailoverTimeout
  **/
  @Valid
  public ConfigNodePropertyInteger getClusterCallFailoverTimeout() {
    return clusterCallFailoverTimeout;
  }

  public void setClusterCallFailoverTimeout(ConfigNodePropertyInteger clusterCallFailoverTimeout) {
    this.clusterCallFailoverTimeout = clusterCallFailoverTimeout;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterClientFailureCheckPeriod(ConfigNodePropertyInteger clusterClientFailureCheckPeriod) {
    this.clusterClientFailureCheckPeriod = clusterClientFailureCheckPeriod;
    return this;
  }

   /**
   * Get clusterClientFailureCheckPeriod
   * @return clusterClientFailureCheckPeriod
  **/
  @Valid
  public ConfigNodePropertyInteger getClusterClientFailureCheckPeriod() {
    return clusterClientFailureCheckPeriod;
  }

  public void setClusterClientFailureCheckPeriod(ConfigNodePropertyInteger clusterClientFailureCheckPeriod) {
    this.clusterClientFailureCheckPeriod = clusterClientFailureCheckPeriod;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterNotificationAttempts(ConfigNodePropertyInteger clusterNotificationAttempts) {
    this.clusterNotificationAttempts = clusterNotificationAttempts;
    return this;
  }

   /**
   * Get clusterNotificationAttempts
   * @return clusterNotificationAttempts
  **/
  @Valid
  public ConfigNodePropertyInteger getClusterNotificationAttempts() {
    return clusterNotificationAttempts;
  }

  public void setClusterNotificationAttempts(ConfigNodePropertyInteger clusterNotificationAttempts) {
    this.clusterNotificationAttempts = clusterNotificationAttempts;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterNotificationInterval(ConfigNodePropertyInteger clusterNotificationInterval) {
    this.clusterNotificationInterval = clusterNotificationInterval;
    return this;
  }

   /**
   * Get clusterNotificationInterval
   * @return clusterNotificationInterval
  **/
  @Valid
  public ConfigNodePropertyInteger getClusterNotificationInterval() {
    return clusterNotificationInterval;
  }

  public void setClusterNotificationInterval(ConfigNodePropertyInteger clusterNotificationInterval) {
    this.clusterNotificationInterval = clusterNotificationInterval;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties idCacheSize(ConfigNodePropertyInteger idCacheSize) {
    this.idCacheSize = idCacheSize;
    return this;
  }

   /**
   * Get idCacheSize
   * @return idCacheSize
  **/
  @Valid
  public ConfigNodePropertyInteger getIdCacheSize() {
    return idCacheSize;
  }

  public void setIdCacheSize(ConfigNodePropertyInteger idCacheSize) {
    this.idCacheSize = idCacheSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterConfirmationWindowSize(ConfigNodePropertyInteger clusterConfirmationWindowSize) {
    this.clusterConfirmationWindowSize = clusterConfirmationWindowSize;
    return this;
  }

   /**
   * Get clusterConfirmationWindowSize
   * @return clusterConfirmationWindowSize
  **/
  @Valid
  public ConfigNodePropertyInteger getClusterConfirmationWindowSize() {
    return clusterConfirmationWindowSize;
  }

  public void setClusterConfirmationWindowSize(ConfigNodePropertyInteger clusterConfirmationWindowSize) {
    this.clusterConfirmationWindowSize = clusterConfirmationWindowSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterConnectionTtl(ConfigNodePropertyInteger clusterConnectionTtl) {
    this.clusterConnectionTtl = clusterConnectionTtl;
    return this;
  }

   /**
   * Get clusterConnectionTtl
   * @return clusterConnectionTtl
  **/
  @Valid
  public ConfigNodePropertyInteger getClusterConnectionTtl() {
    return clusterConnectionTtl;
  }

  public void setClusterConnectionTtl(ConfigNodePropertyInteger clusterConnectionTtl) {
    this.clusterConnectionTtl = clusterConnectionTtl;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterDuplicateDetection(ConfigNodePropertyBoolean clusterDuplicateDetection) {
    this.clusterDuplicateDetection = clusterDuplicateDetection;
    return this;
  }

   /**
   * Get clusterDuplicateDetection
   * @return clusterDuplicateDetection
  **/
  @Valid
  public ConfigNodePropertyBoolean getClusterDuplicateDetection() {
    return clusterDuplicateDetection;
  }

  public void setClusterDuplicateDetection(ConfigNodePropertyBoolean clusterDuplicateDetection) {
    this.clusterDuplicateDetection = clusterDuplicateDetection;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterInitialConnectAttempts(ConfigNodePropertyInteger clusterInitialConnectAttempts) {
    this.clusterInitialConnectAttempts = clusterInitialConnectAttempts;
    return this;
  }

   /**
   * Get clusterInitialConnectAttempts
   * @return clusterInitialConnectAttempts
  **/
  @Valid
  public ConfigNodePropertyInteger getClusterInitialConnectAttempts() {
    return clusterInitialConnectAttempts;
  }

  public void setClusterInitialConnectAttempts(ConfigNodePropertyInteger clusterInitialConnectAttempts) {
    this.clusterInitialConnectAttempts = clusterInitialConnectAttempts;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterMaxRetryInterval(ConfigNodePropertyInteger clusterMaxRetryInterval) {
    this.clusterMaxRetryInterval = clusterMaxRetryInterval;
    return this;
  }

   /**
   * Get clusterMaxRetryInterval
   * @return clusterMaxRetryInterval
  **/
  @Valid
  public ConfigNodePropertyInteger getClusterMaxRetryInterval() {
    return clusterMaxRetryInterval;
  }

  public void setClusterMaxRetryInterval(ConfigNodePropertyInteger clusterMaxRetryInterval) {
    this.clusterMaxRetryInterval = clusterMaxRetryInterval;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterMinLargeMessageSize(ConfigNodePropertyInteger clusterMinLargeMessageSize) {
    this.clusterMinLargeMessageSize = clusterMinLargeMessageSize;
    return this;
  }

   /**
   * Get clusterMinLargeMessageSize
   * @return clusterMinLargeMessageSize
  **/
  @Valid
  public ConfigNodePropertyInteger getClusterMinLargeMessageSize() {
    return clusterMinLargeMessageSize;
  }

  public void setClusterMinLargeMessageSize(ConfigNodePropertyInteger clusterMinLargeMessageSize) {
    this.clusterMinLargeMessageSize = clusterMinLargeMessageSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterProducerWindowSize(ConfigNodePropertyInteger clusterProducerWindowSize) {
    this.clusterProducerWindowSize = clusterProducerWindowSize;
    return this;
  }

   /**
   * Get clusterProducerWindowSize
   * @return clusterProducerWindowSize
  **/
  @Valid
  public ConfigNodePropertyInteger getClusterProducerWindowSize() {
    return clusterProducerWindowSize;
  }

  public void setClusterProducerWindowSize(ConfigNodePropertyInteger clusterProducerWindowSize) {
    this.clusterProducerWindowSize = clusterProducerWindowSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterReconnectAttempts(ConfigNodePropertyInteger clusterReconnectAttempts) {
    this.clusterReconnectAttempts = clusterReconnectAttempts;
    return this;
  }

   /**
   * Get clusterReconnectAttempts
   * @return clusterReconnectAttempts
  **/
  @Valid
  public ConfigNodePropertyInteger getClusterReconnectAttempts() {
    return clusterReconnectAttempts;
  }

  public void setClusterReconnectAttempts(ConfigNodePropertyInteger clusterReconnectAttempts) {
    this.clusterReconnectAttempts = clusterReconnectAttempts;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterRetryInterval(ConfigNodePropertyInteger clusterRetryInterval) {
    this.clusterRetryInterval = clusterRetryInterval;
    return this;
  }

   /**
   * Get clusterRetryInterval
   * @return clusterRetryInterval
  **/
  @Valid
  public ConfigNodePropertyInteger getClusterRetryInterval() {
    return clusterRetryInterval;
  }

  public void setClusterRetryInterval(ConfigNodePropertyInteger clusterRetryInterval) {
    this.clusterRetryInterval = clusterRetryInterval;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterRetryIntervalMultiplier(ConfigNodePropertyFloat clusterRetryIntervalMultiplier) {
    this.clusterRetryIntervalMultiplier = clusterRetryIntervalMultiplier;
    return this;
  }

   /**
   * Get clusterRetryIntervalMultiplier
   * @return clusterRetryIntervalMultiplier
  **/
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

