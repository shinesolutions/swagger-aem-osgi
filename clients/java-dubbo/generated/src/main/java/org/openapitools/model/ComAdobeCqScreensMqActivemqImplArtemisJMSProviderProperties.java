package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyFloat;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("service.ranking")
  private ConfigNodePropertyInteger serviceRanking;

  @JsonProperty("global.size")
  private ConfigNodePropertyInteger globalSize;

  @JsonProperty("max.disk.usage")
  private ConfigNodePropertyInteger maxDiskUsage;

  @JsonProperty("persistence.enabled")
  private ConfigNodePropertyBoolean persistenceEnabled;

  @JsonProperty("thread.pool.max.size")
  private ConfigNodePropertyInteger threadPoolMaxSize;

  @JsonProperty("scheduled.thread.pool.max.size")
  private ConfigNodePropertyInteger scheduledThreadPoolMaxSize;

  @JsonProperty("graceful.shutdown.timeout")
  private ConfigNodePropertyInteger gracefulShutdownTimeout;

  @JsonProperty("queues")
  private ConfigNodePropertyArray queues;

  @JsonProperty("topics")
  private ConfigNodePropertyArray topics;

  @JsonProperty("addresses.max.delivery.attempts")
  private ConfigNodePropertyInteger addressesMaxDeliveryAttempts;

  @JsonProperty("addresses.expiry.delay")
  private ConfigNodePropertyInteger addressesExpiryDelay;

  @JsonProperty("addresses.address.full.message.policy")
  private ConfigNodePropertyDropDown addressesAddressFullMessagePolicy;

  @JsonProperty("addresses.max.size.bytes")
  private ConfigNodePropertyInteger addressesMaxSizeBytes;

  @JsonProperty("addresses.page.size.bytes")
  private ConfigNodePropertyInteger addressesPageSizeBytes;

  @JsonProperty("addresses.page.cache.max.size")
  private ConfigNodePropertyInteger addressesPageCacheMaxSize;

  @JsonProperty("cluster.user")
  private ConfigNodePropertyString clusterUser;

  @JsonProperty("cluster.password")
  private ConfigNodePropertyString clusterPassword;

  @JsonProperty("cluster.call.timeout")
  private ConfigNodePropertyInteger clusterCallTimeout;

  @JsonProperty("cluster.call.failover.timeout")
  private ConfigNodePropertyInteger clusterCallFailoverTimeout;

  @JsonProperty("cluster.client.failure.check.period")
  private ConfigNodePropertyInteger clusterClientFailureCheckPeriod;

  @JsonProperty("cluster.notification.attempts")
  private ConfigNodePropertyInteger clusterNotificationAttempts;

  @JsonProperty("cluster.notification.interval")
  private ConfigNodePropertyInteger clusterNotificationInterval;

  @JsonProperty("id.cache.size")
  private ConfigNodePropertyInteger idCacheSize;

  @JsonProperty("cluster.confirmation.window.size")
  private ConfigNodePropertyInteger clusterConfirmationWindowSize;

  @JsonProperty("cluster.connection.ttl")
  private ConfigNodePropertyInteger clusterConnectionTtl;

  @JsonProperty("cluster.duplicate.detection")
  private ConfigNodePropertyBoolean clusterDuplicateDetection;

  @JsonProperty("cluster.initial.connect.attempts")
  private ConfigNodePropertyInteger clusterInitialConnectAttempts;

  @JsonProperty("cluster.max.retry.interval")
  private ConfigNodePropertyInteger clusterMaxRetryInterval;

  @JsonProperty("cluster.min.large.message.size")
  private ConfigNodePropertyInteger clusterMinLargeMessageSize;

  @JsonProperty("cluster.producer.window.size")
  private ConfigNodePropertyInteger clusterProducerWindowSize;

  @JsonProperty("cluster.reconnect.attempts")
  private ConfigNodePropertyInteger clusterReconnectAttempts;

  @JsonProperty("cluster.retry.interval")
  private ConfigNodePropertyInteger clusterRetryInterval;

  @JsonProperty("cluster.retry.interval.multiplier")
  private ConfigNodePropertyFloat clusterRetryIntervalMultiplier;

  /**
   * 
   * @return serviceRanking
   */
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  /**
   * 
   * @return globalSize
   */
  public ConfigNodePropertyInteger getGlobalSize() {
    return globalSize;
  }

  public void setGlobalSize(ConfigNodePropertyInteger globalSize) {
    this.globalSize = globalSize;
  }

  /**
   * 
   * @return maxDiskUsage
   */
  public ConfigNodePropertyInteger getMaxDiskUsage() {
    return maxDiskUsage;
  }

  public void setMaxDiskUsage(ConfigNodePropertyInteger maxDiskUsage) {
    this.maxDiskUsage = maxDiskUsage;
  }

  /**
   * 
   * @return persistenceEnabled
   */
  public ConfigNodePropertyBoolean getPersistenceEnabled() {
    return persistenceEnabled;
  }

  public void setPersistenceEnabled(ConfigNodePropertyBoolean persistenceEnabled) {
    this.persistenceEnabled = persistenceEnabled;
  }

  /**
   * 
   * @return threadPoolMaxSize
   */
  public ConfigNodePropertyInteger getThreadPoolMaxSize() {
    return threadPoolMaxSize;
  }

  public void setThreadPoolMaxSize(ConfigNodePropertyInteger threadPoolMaxSize) {
    this.threadPoolMaxSize = threadPoolMaxSize;
  }

  /**
   * 
   * @return scheduledThreadPoolMaxSize
   */
  public ConfigNodePropertyInteger getScheduledThreadPoolMaxSize() {
    return scheduledThreadPoolMaxSize;
  }

  public void setScheduledThreadPoolMaxSize(ConfigNodePropertyInteger scheduledThreadPoolMaxSize) {
    this.scheduledThreadPoolMaxSize = scheduledThreadPoolMaxSize;
  }

  /**
   * 
   * @return gracefulShutdownTimeout
   */
  public ConfigNodePropertyInteger getGracefulShutdownTimeout() {
    return gracefulShutdownTimeout;
  }

  public void setGracefulShutdownTimeout(ConfigNodePropertyInteger gracefulShutdownTimeout) {
    this.gracefulShutdownTimeout = gracefulShutdownTimeout;
  }

  /**
   * 
   * @return queues
   */
  public ConfigNodePropertyArray getQueues() {
    return queues;
  }

  public void setQueues(ConfigNodePropertyArray queues) {
    this.queues = queues;
  }

  /**
   * 
   * @return topics
   */
  public ConfigNodePropertyArray getTopics() {
    return topics;
  }

  public void setTopics(ConfigNodePropertyArray topics) {
    this.topics = topics;
  }

  /**
   * 
   * @return addressesMaxDeliveryAttempts
   */
  public ConfigNodePropertyInteger getAddressesMaxDeliveryAttempts() {
    return addressesMaxDeliveryAttempts;
  }

  public void setAddressesMaxDeliveryAttempts(ConfigNodePropertyInteger addressesMaxDeliveryAttempts) {
    this.addressesMaxDeliveryAttempts = addressesMaxDeliveryAttempts;
  }

  /**
   * 
   * @return addressesExpiryDelay
   */
  public ConfigNodePropertyInteger getAddressesExpiryDelay() {
    return addressesExpiryDelay;
  }

  public void setAddressesExpiryDelay(ConfigNodePropertyInteger addressesExpiryDelay) {
    this.addressesExpiryDelay = addressesExpiryDelay;
  }

  /**
   * 
   * @return addressesAddressFullMessagePolicy
   */
  public ConfigNodePropertyDropDown getAddressesAddressFullMessagePolicy() {
    return addressesAddressFullMessagePolicy;
  }

  public void setAddressesAddressFullMessagePolicy(ConfigNodePropertyDropDown addressesAddressFullMessagePolicy) {
    this.addressesAddressFullMessagePolicy = addressesAddressFullMessagePolicy;
  }

  /**
   * 
   * @return addressesMaxSizeBytes
   */
  public ConfigNodePropertyInteger getAddressesMaxSizeBytes() {
    return addressesMaxSizeBytes;
  }

  public void setAddressesMaxSizeBytes(ConfigNodePropertyInteger addressesMaxSizeBytes) {
    this.addressesMaxSizeBytes = addressesMaxSizeBytes;
  }

  /**
   * 
   * @return addressesPageSizeBytes
   */
  public ConfigNodePropertyInteger getAddressesPageSizeBytes() {
    return addressesPageSizeBytes;
  }

  public void setAddressesPageSizeBytes(ConfigNodePropertyInteger addressesPageSizeBytes) {
    this.addressesPageSizeBytes = addressesPageSizeBytes;
  }

  /**
   * 
   * @return addressesPageCacheMaxSize
   */
  public ConfigNodePropertyInteger getAddressesPageCacheMaxSize() {
    return addressesPageCacheMaxSize;
  }

  public void setAddressesPageCacheMaxSize(ConfigNodePropertyInteger addressesPageCacheMaxSize) {
    this.addressesPageCacheMaxSize = addressesPageCacheMaxSize;
  }

  /**
   * 
   * @return clusterUser
   */
  public ConfigNodePropertyString getClusterUser() {
    return clusterUser;
  }

  public void setClusterUser(ConfigNodePropertyString clusterUser) {
    this.clusterUser = clusterUser;
  }

  /**
   * 
   * @return clusterPassword
   */
  public ConfigNodePropertyString getClusterPassword() {
    return clusterPassword;
  }

  public void setClusterPassword(ConfigNodePropertyString clusterPassword) {
    this.clusterPassword = clusterPassword;
  }

  /**
   * 
   * @return clusterCallTimeout
   */
  public ConfigNodePropertyInteger getClusterCallTimeout() {
    return clusterCallTimeout;
  }

  public void setClusterCallTimeout(ConfigNodePropertyInteger clusterCallTimeout) {
    this.clusterCallTimeout = clusterCallTimeout;
  }

  /**
   * 
   * @return clusterCallFailoverTimeout
   */
  public ConfigNodePropertyInteger getClusterCallFailoverTimeout() {
    return clusterCallFailoverTimeout;
  }

  public void setClusterCallFailoverTimeout(ConfigNodePropertyInteger clusterCallFailoverTimeout) {
    this.clusterCallFailoverTimeout = clusterCallFailoverTimeout;
  }

  /**
   * 
   * @return clusterClientFailureCheckPeriod
   */
  public ConfigNodePropertyInteger getClusterClientFailureCheckPeriod() {
    return clusterClientFailureCheckPeriod;
  }

  public void setClusterClientFailureCheckPeriod(ConfigNodePropertyInteger clusterClientFailureCheckPeriod) {
    this.clusterClientFailureCheckPeriod = clusterClientFailureCheckPeriod;
  }

  /**
   * 
   * @return clusterNotificationAttempts
   */
  public ConfigNodePropertyInteger getClusterNotificationAttempts() {
    return clusterNotificationAttempts;
  }

  public void setClusterNotificationAttempts(ConfigNodePropertyInteger clusterNotificationAttempts) {
    this.clusterNotificationAttempts = clusterNotificationAttempts;
  }

  /**
   * 
   * @return clusterNotificationInterval
   */
  public ConfigNodePropertyInteger getClusterNotificationInterval() {
    return clusterNotificationInterval;
  }

  public void setClusterNotificationInterval(ConfigNodePropertyInteger clusterNotificationInterval) {
    this.clusterNotificationInterval = clusterNotificationInterval;
  }

  /**
   * 
   * @return idCacheSize
   */
  public ConfigNodePropertyInteger getIdCacheSize() {
    return idCacheSize;
  }

  public void setIdCacheSize(ConfigNodePropertyInteger idCacheSize) {
    this.idCacheSize = idCacheSize;
  }

  /**
   * 
   * @return clusterConfirmationWindowSize
   */
  public ConfigNodePropertyInteger getClusterConfirmationWindowSize() {
    return clusterConfirmationWindowSize;
  }

  public void setClusterConfirmationWindowSize(ConfigNodePropertyInteger clusterConfirmationWindowSize) {
    this.clusterConfirmationWindowSize = clusterConfirmationWindowSize;
  }

  /**
   * 
   * @return clusterConnectionTtl
   */
  public ConfigNodePropertyInteger getClusterConnectionTtl() {
    return clusterConnectionTtl;
  }

  public void setClusterConnectionTtl(ConfigNodePropertyInteger clusterConnectionTtl) {
    this.clusterConnectionTtl = clusterConnectionTtl;
  }

  /**
   * 
   * @return clusterDuplicateDetection
   */
  public ConfigNodePropertyBoolean getClusterDuplicateDetection() {
    return clusterDuplicateDetection;
  }

  public void setClusterDuplicateDetection(ConfigNodePropertyBoolean clusterDuplicateDetection) {
    this.clusterDuplicateDetection = clusterDuplicateDetection;
  }

  /**
   * 
   * @return clusterInitialConnectAttempts
   */
  public ConfigNodePropertyInteger getClusterInitialConnectAttempts() {
    return clusterInitialConnectAttempts;
  }

  public void setClusterInitialConnectAttempts(ConfigNodePropertyInteger clusterInitialConnectAttempts) {
    this.clusterInitialConnectAttempts = clusterInitialConnectAttempts;
  }

  /**
   * 
   * @return clusterMaxRetryInterval
   */
  public ConfigNodePropertyInteger getClusterMaxRetryInterval() {
    return clusterMaxRetryInterval;
  }

  public void setClusterMaxRetryInterval(ConfigNodePropertyInteger clusterMaxRetryInterval) {
    this.clusterMaxRetryInterval = clusterMaxRetryInterval;
  }

  /**
   * 
   * @return clusterMinLargeMessageSize
   */
  public ConfigNodePropertyInteger getClusterMinLargeMessageSize() {
    return clusterMinLargeMessageSize;
  }

  public void setClusterMinLargeMessageSize(ConfigNodePropertyInteger clusterMinLargeMessageSize) {
    this.clusterMinLargeMessageSize = clusterMinLargeMessageSize;
  }

  /**
   * 
   * @return clusterProducerWindowSize
   */
  public ConfigNodePropertyInteger getClusterProducerWindowSize() {
    return clusterProducerWindowSize;
  }

  public void setClusterProducerWindowSize(ConfigNodePropertyInteger clusterProducerWindowSize) {
    this.clusterProducerWindowSize = clusterProducerWindowSize;
  }

  /**
   * 
   * @return clusterReconnectAttempts
   */
  public ConfigNodePropertyInteger getClusterReconnectAttempts() {
    return clusterReconnectAttempts;
  }

  public void setClusterReconnectAttempts(ConfigNodePropertyInteger clusterReconnectAttempts) {
    this.clusterReconnectAttempts = clusterReconnectAttempts;
  }

  /**
   * 
   * @return clusterRetryInterval
   */
  public ConfigNodePropertyInteger getClusterRetryInterval() {
    return clusterRetryInterval;
  }

  public void setClusterRetryInterval(ConfigNodePropertyInteger clusterRetryInterval) {
    this.clusterRetryInterval = clusterRetryInterval;
  }

  /**
   * 
   * @return clusterRetryIntervalMultiplier
   */
  public ConfigNodePropertyFloat getClusterRetryIntervalMultiplier() {
    return clusterRetryIntervalMultiplier;
  }

  public void setClusterRetryIntervalMultiplier(ConfigNodePropertyFloat clusterRetryIntervalMultiplier) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
