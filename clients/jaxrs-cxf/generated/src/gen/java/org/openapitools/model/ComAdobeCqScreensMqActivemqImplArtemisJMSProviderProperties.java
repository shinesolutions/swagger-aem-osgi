package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyFloat;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger serviceRanking = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger globalSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger maxDiskUsage = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean persistenceEnabled = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger threadPoolMaxSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger scheduledThreadPoolMaxSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger gracefulShutdownTimeout = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray queues = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray topics = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger addressesMaxDeliveryAttempts = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger addressesExpiryDelay = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown addressesAddressFullMessagePolicy = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger addressesMaxSizeBytes = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger addressesPageSizeBytes = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger addressesPageCacheMaxSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString clusterUser = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString clusterPassword = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger clusterCallTimeout = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger clusterCallFailoverTimeout = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger clusterClientFailureCheckPeriod = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger clusterNotificationAttempts = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger clusterNotificationInterval = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger idCacheSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger clusterConfirmationWindowSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger clusterConnectionTtl = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean clusterDuplicateDetection = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger clusterInitialConnectAttempts = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger clusterMaxRetryInterval = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger clusterMinLargeMessageSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger clusterProducerWindowSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger clusterReconnectAttempts = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger clusterRetryInterval = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyFloat clusterRetryIntervalMultiplier = null;
 /**
   * Get serviceRanking
   * @return serviceRanking
  **/
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

 /**
   * Get globalSize
   * @return globalSize
  **/
  @JsonProperty("global.size")
  public ConfigNodePropertyInteger getGlobalSize() {
    return globalSize;
  }

  public void setGlobalSize(ConfigNodePropertyInteger globalSize) {
    this.globalSize = globalSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties globalSize(ConfigNodePropertyInteger globalSize) {
    this.globalSize = globalSize;
    return this;
  }

 /**
   * Get maxDiskUsage
   * @return maxDiskUsage
  **/
  @JsonProperty("max.disk.usage")
  public ConfigNodePropertyInteger getMaxDiskUsage() {
    return maxDiskUsage;
  }

  public void setMaxDiskUsage(ConfigNodePropertyInteger maxDiskUsage) {
    this.maxDiskUsage = maxDiskUsage;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties maxDiskUsage(ConfigNodePropertyInteger maxDiskUsage) {
    this.maxDiskUsage = maxDiskUsage;
    return this;
  }

 /**
   * Get persistenceEnabled
   * @return persistenceEnabled
  **/
  @JsonProperty("persistence.enabled")
  public ConfigNodePropertyBoolean getPersistenceEnabled() {
    return persistenceEnabled;
  }

  public void setPersistenceEnabled(ConfigNodePropertyBoolean persistenceEnabled) {
    this.persistenceEnabled = persistenceEnabled;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties persistenceEnabled(ConfigNodePropertyBoolean persistenceEnabled) {
    this.persistenceEnabled = persistenceEnabled;
    return this;
  }

 /**
   * Get threadPoolMaxSize
   * @return threadPoolMaxSize
  **/
  @JsonProperty("thread.pool.max.size")
  public ConfigNodePropertyInteger getThreadPoolMaxSize() {
    return threadPoolMaxSize;
  }

  public void setThreadPoolMaxSize(ConfigNodePropertyInteger threadPoolMaxSize) {
    this.threadPoolMaxSize = threadPoolMaxSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties threadPoolMaxSize(ConfigNodePropertyInteger threadPoolMaxSize) {
    this.threadPoolMaxSize = threadPoolMaxSize;
    return this;
  }

 /**
   * Get scheduledThreadPoolMaxSize
   * @return scheduledThreadPoolMaxSize
  **/
  @JsonProperty("scheduled.thread.pool.max.size")
  public ConfigNodePropertyInteger getScheduledThreadPoolMaxSize() {
    return scheduledThreadPoolMaxSize;
  }

  public void setScheduledThreadPoolMaxSize(ConfigNodePropertyInteger scheduledThreadPoolMaxSize) {
    this.scheduledThreadPoolMaxSize = scheduledThreadPoolMaxSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties scheduledThreadPoolMaxSize(ConfigNodePropertyInteger scheduledThreadPoolMaxSize) {
    this.scheduledThreadPoolMaxSize = scheduledThreadPoolMaxSize;
    return this;
  }

 /**
   * Get gracefulShutdownTimeout
   * @return gracefulShutdownTimeout
  **/
  @JsonProperty("graceful.shutdown.timeout")
  public ConfigNodePropertyInteger getGracefulShutdownTimeout() {
    return gracefulShutdownTimeout;
  }

  public void setGracefulShutdownTimeout(ConfigNodePropertyInteger gracefulShutdownTimeout) {
    this.gracefulShutdownTimeout = gracefulShutdownTimeout;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties gracefulShutdownTimeout(ConfigNodePropertyInteger gracefulShutdownTimeout) {
    this.gracefulShutdownTimeout = gracefulShutdownTimeout;
    return this;
  }

 /**
   * Get queues
   * @return queues
  **/
  @JsonProperty("queues")
  public ConfigNodePropertyArray getQueues() {
    return queues;
  }

  public void setQueues(ConfigNodePropertyArray queues) {
    this.queues = queues;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties queues(ConfigNodePropertyArray queues) {
    this.queues = queues;
    return this;
  }

 /**
   * Get topics
   * @return topics
  **/
  @JsonProperty("topics")
  public ConfigNodePropertyArray getTopics() {
    return topics;
  }

  public void setTopics(ConfigNodePropertyArray topics) {
    this.topics = topics;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties topics(ConfigNodePropertyArray topics) {
    this.topics = topics;
    return this;
  }

 /**
   * Get addressesMaxDeliveryAttempts
   * @return addressesMaxDeliveryAttempts
  **/
  @JsonProperty("addresses.max.delivery.attempts")
  public ConfigNodePropertyInteger getAddressesMaxDeliveryAttempts() {
    return addressesMaxDeliveryAttempts;
  }

  public void setAddressesMaxDeliveryAttempts(ConfigNodePropertyInteger addressesMaxDeliveryAttempts) {
    this.addressesMaxDeliveryAttempts = addressesMaxDeliveryAttempts;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesMaxDeliveryAttempts(ConfigNodePropertyInteger addressesMaxDeliveryAttempts) {
    this.addressesMaxDeliveryAttempts = addressesMaxDeliveryAttempts;
    return this;
  }

 /**
   * Get addressesExpiryDelay
   * @return addressesExpiryDelay
  **/
  @JsonProperty("addresses.expiry.delay")
  public ConfigNodePropertyInteger getAddressesExpiryDelay() {
    return addressesExpiryDelay;
  }

  public void setAddressesExpiryDelay(ConfigNodePropertyInteger addressesExpiryDelay) {
    this.addressesExpiryDelay = addressesExpiryDelay;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesExpiryDelay(ConfigNodePropertyInteger addressesExpiryDelay) {
    this.addressesExpiryDelay = addressesExpiryDelay;
    return this;
  }

 /**
   * Get addressesAddressFullMessagePolicy
   * @return addressesAddressFullMessagePolicy
  **/
  @JsonProperty("addresses.address.full.message.policy")
  public ConfigNodePropertyDropDown getAddressesAddressFullMessagePolicy() {
    return addressesAddressFullMessagePolicy;
  }

  public void setAddressesAddressFullMessagePolicy(ConfigNodePropertyDropDown addressesAddressFullMessagePolicy) {
    this.addressesAddressFullMessagePolicy = addressesAddressFullMessagePolicy;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesAddressFullMessagePolicy(ConfigNodePropertyDropDown addressesAddressFullMessagePolicy) {
    this.addressesAddressFullMessagePolicy = addressesAddressFullMessagePolicy;
    return this;
  }

 /**
   * Get addressesMaxSizeBytes
   * @return addressesMaxSizeBytes
  **/
  @JsonProperty("addresses.max.size.bytes")
  public ConfigNodePropertyInteger getAddressesMaxSizeBytes() {
    return addressesMaxSizeBytes;
  }

  public void setAddressesMaxSizeBytes(ConfigNodePropertyInteger addressesMaxSizeBytes) {
    this.addressesMaxSizeBytes = addressesMaxSizeBytes;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesMaxSizeBytes(ConfigNodePropertyInteger addressesMaxSizeBytes) {
    this.addressesMaxSizeBytes = addressesMaxSizeBytes;
    return this;
  }

 /**
   * Get addressesPageSizeBytes
   * @return addressesPageSizeBytes
  **/
  @JsonProperty("addresses.page.size.bytes")
  public ConfigNodePropertyInteger getAddressesPageSizeBytes() {
    return addressesPageSizeBytes;
  }

  public void setAddressesPageSizeBytes(ConfigNodePropertyInteger addressesPageSizeBytes) {
    this.addressesPageSizeBytes = addressesPageSizeBytes;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesPageSizeBytes(ConfigNodePropertyInteger addressesPageSizeBytes) {
    this.addressesPageSizeBytes = addressesPageSizeBytes;
    return this;
  }

 /**
   * Get addressesPageCacheMaxSize
   * @return addressesPageCacheMaxSize
  **/
  @JsonProperty("addresses.page.cache.max.size")
  public ConfigNodePropertyInteger getAddressesPageCacheMaxSize() {
    return addressesPageCacheMaxSize;
  }

  public void setAddressesPageCacheMaxSize(ConfigNodePropertyInteger addressesPageCacheMaxSize) {
    this.addressesPageCacheMaxSize = addressesPageCacheMaxSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties addressesPageCacheMaxSize(ConfigNodePropertyInteger addressesPageCacheMaxSize) {
    this.addressesPageCacheMaxSize = addressesPageCacheMaxSize;
    return this;
  }

 /**
   * Get clusterUser
   * @return clusterUser
  **/
  @JsonProperty("cluster.user")
  public ConfigNodePropertyString getClusterUser() {
    return clusterUser;
  }

  public void setClusterUser(ConfigNodePropertyString clusterUser) {
    this.clusterUser = clusterUser;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterUser(ConfigNodePropertyString clusterUser) {
    this.clusterUser = clusterUser;
    return this;
  }

 /**
   * Get clusterPassword
   * @return clusterPassword
  **/
  @JsonProperty("cluster.password")
  public ConfigNodePropertyString getClusterPassword() {
    return clusterPassword;
  }

  public void setClusterPassword(ConfigNodePropertyString clusterPassword) {
    this.clusterPassword = clusterPassword;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterPassword(ConfigNodePropertyString clusterPassword) {
    this.clusterPassword = clusterPassword;
    return this;
  }

 /**
   * Get clusterCallTimeout
   * @return clusterCallTimeout
  **/
  @JsonProperty("cluster.call.timeout")
  public ConfigNodePropertyInteger getClusterCallTimeout() {
    return clusterCallTimeout;
  }

  public void setClusterCallTimeout(ConfigNodePropertyInteger clusterCallTimeout) {
    this.clusterCallTimeout = clusterCallTimeout;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterCallTimeout(ConfigNodePropertyInteger clusterCallTimeout) {
    this.clusterCallTimeout = clusterCallTimeout;
    return this;
  }

 /**
   * Get clusterCallFailoverTimeout
   * @return clusterCallFailoverTimeout
  **/
  @JsonProperty("cluster.call.failover.timeout")
  public ConfigNodePropertyInteger getClusterCallFailoverTimeout() {
    return clusterCallFailoverTimeout;
  }

  public void setClusterCallFailoverTimeout(ConfigNodePropertyInteger clusterCallFailoverTimeout) {
    this.clusterCallFailoverTimeout = clusterCallFailoverTimeout;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterCallFailoverTimeout(ConfigNodePropertyInteger clusterCallFailoverTimeout) {
    this.clusterCallFailoverTimeout = clusterCallFailoverTimeout;
    return this;
  }

 /**
   * Get clusterClientFailureCheckPeriod
   * @return clusterClientFailureCheckPeriod
  **/
  @JsonProperty("cluster.client.failure.check.period")
  public ConfigNodePropertyInteger getClusterClientFailureCheckPeriod() {
    return clusterClientFailureCheckPeriod;
  }

  public void setClusterClientFailureCheckPeriod(ConfigNodePropertyInteger clusterClientFailureCheckPeriod) {
    this.clusterClientFailureCheckPeriod = clusterClientFailureCheckPeriod;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterClientFailureCheckPeriod(ConfigNodePropertyInteger clusterClientFailureCheckPeriod) {
    this.clusterClientFailureCheckPeriod = clusterClientFailureCheckPeriod;
    return this;
  }

 /**
   * Get clusterNotificationAttempts
   * @return clusterNotificationAttempts
  **/
  @JsonProperty("cluster.notification.attempts")
  public ConfigNodePropertyInteger getClusterNotificationAttempts() {
    return clusterNotificationAttempts;
  }

  public void setClusterNotificationAttempts(ConfigNodePropertyInteger clusterNotificationAttempts) {
    this.clusterNotificationAttempts = clusterNotificationAttempts;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterNotificationAttempts(ConfigNodePropertyInteger clusterNotificationAttempts) {
    this.clusterNotificationAttempts = clusterNotificationAttempts;
    return this;
  }

 /**
   * Get clusterNotificationInterval
   * @return clusterNotificationInterval
  **/
  @JsonProperty("cluster.notification.interval")
  public ConfigNodePropertyInteger getClusterNotificationInterval() {
    return clusterNotificationInterval;
  }

  public void setClusterNotificationInterval(ConfigNodePropertyInteger clusterNotificationInterval) {
    this.clusterNotificationInterval = clusterNotificationInterval;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterNotificationInterval(ConfigNodePropertyInteger clusterNotificationInterval) {
    this.clusterNotificationInterval = clusterNotificationInterval;
    return this;
  }

 /**
   * Get idCacheSize
   * @return idCacheSize
  **/
  @JsonProperty("id.cache.size")
  public ConfigNodePropertyInteger getIdCacheSize() {
    return idCacheSize;
  }

  public void setIdCacheSize(ConfigNodePropertyInteger idCacheSize) {
    this.idCacheSize = idCacheSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties idCacheSize(ConfigNodePropertyInteger idCacheSize) {
    this.idCacheSize = idCacheSize;
    return this;
  }

 /**
   * Get clusterConfirmationWindowSize
   * @return clusterConfirmationWindowSize
  **/
  @JsonProperty("cluster.confirmation.window.size")
  public ConfigNodePropertyInteger getClusterConfirmationWindowSize() {
    return clusterConfirmationWindowSize;
  }

  public void setClusterConfirmationWindowSize(ConfigNodePropertyInteger clusterConfirmationWindowSize) {
    this.clusterConfirmationWindowSize = clusterConfirmationWindowSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterConfirmationWindowSize(ConfigNodePropertyInteger clusterConfirmationWindowSize) {
    this.clusterConfirmationWindowSize = clusterConfirmationWindowSize;
    return this;
  }

 /**
   * Get clusterConnectionTtl
   * @return clusterConnectionTtl
  **/
  @JsonProperty("cluster.connection.ttl")
  public ConfigNodePropertyInteger getClusterConnectionTtl() {
    return clusterConnectionTtl;
  }

  public void setClusterConnectionTtl(ConfigNodePropertyInteger clusterConnectionTtl) {
    this.clusterConnectionTtl = clusterConnectionTtl;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterConnectionTtl(ConfigNodePropertyInteger clusterConnectionTtl) {
    this.clusterConnectionTtl = clusterConnectionTtl;
    return this;
  }

 /**
   * Get clusterDuplicateDetection
   * @return clusterDuplicateDetection
  **/
  @JsonProperty("cluster.duplicate.detection")
  public ConfigNodePropertyBoolean getClusterDuplicateDetection() {
    return clusterDuplicateDetection;
  }

  public void setClusterDuplicateDetection(ConfigNodePropertyBoolean clusterDuplicateDetection) {
    this.clusterDuplicateDetection = clusterDuplicateDetection;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterDuplicateDetection(ConfigNodePropertyBoolean clusterDuplicateDetection) {
    this.clusterDuplicateDetection = clusterDuplicateDetection;
    return this;
  }

 /**
   * Get clusterInitialConnectAttempts
   * @return clusterInitialConnectAttempts
  **/
  @JsonProperty("cluster.initial.connect.attempts")
  public ConfigNodePropertyInteger getClusterInitialConnectAttempts() {
    return clusterInitialConnectAttempts;
  }

  public void setClusterInitialConnectAttempts(ConfigNodePropertyInteger clusterInitialConnectAttempts) {
    this.clusterInitialConnectAttempts = clusterInitialConnectAttempts;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterInitialConnectAttempts(ConfigNodePropertyInteger clusterInitialConnectAttempts) {
    this.clusterInitialConnectAttempts = clusterInitialConnectAttempts;
    return this;
  }

 /**
   * Get clusterMaxRetryInterval
   * @return clusterMaxRetryInterval
  **/
  @JsonProperty("cluster.max.retry.interval")
  public ConfigNodePropertyInteger getClusterMaxRetryInterval() {
    return clusterMaxRetryInterval;
  }

  public void setClusterMaxRetryInterval(ConfigNodePropertyInteger clusterMaxRetryInterval) {
    this.clusterMaxRetryInterval = clusterMaxRetryInterval;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterMaxRetryInterval(ConfigNodePropertyInteger clusterMaxRetryInterval) {
    this.clusterMaxRetryInterval = clusterMaxRetryInterval;
    return this;
  }

 /**
   * Get clusterMinLargeMessageSize
   * @return clusterMinLargeMessageSize
  **/
  @JsonProperty("cluster.min.large.message.size")
  public ConfigNodePropertyInteger getClusterMinLargeMessageSize() {
    return clusterMinLargeMessageSize;
  }

  public void setClusterMinLargeMessageSize(ConfigNodePropertyInteger clusterMinLargeMessageSize) {
    this.clusterMinLargeMessageSize = clusterMinLargeMessageSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterMinLargeMessageSize(ConfigNodePropertyInteger clusterMinLargeMessageSize) {
    this.clusterMinLargeMessageSize = clusterMinLargeMessageSize;
    return this;
  }

 /**
   * Get clusterProducerWindowSize
   * @return clusterProducerWindowSize
  **/
  @JsonProperty("cluster.producer.window.size")
  public ConfigNodePropertyInteger getClusterProducerWindowSize() {
    return clusterProducerWindowSize;
  }

  public void setClusterProducerWindowSize(ConfigNodePropertyInteger clusterProducerWindowSize) {
    this.clusterProducerWindowSize = clusterProducerWindowSize;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterProducerWindowSize(ConfigNodePropertyInteger clusterProducerWindowSize) {
    this.clusterProducerWindowSize = clusterProducerWindowSize;
    return this;
  }

 /**
   * Get clusterReconnectAttempts
   * @return clusterReconnectAttempts
  **/
  @JsonProperty("cluster.reconnect.attempts")
  public ConfigNodePropertyInteger getClusterReconnectAttempts() {
    return clusterReconnectAttempts;
  }

  public void setClusterReconnectAttempts(ConfigNodePropertyInteger clusterReconnectAttempts) {
    this.clusterReconnectAttempts = clusterReconnectAttempts;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterReconnectAttempts(ConfigNodePropertyInteger clusterReconnectAttempts) {
    this.clusterReconnectAttempts = clusterReconnectAttempts;
    return this;
  }

 /**
   * Get clusterRetryInterval
   * @return clusterRetryInterval
  **/
  @JsonProperty("cluster.retry.interval")
  public ConfigNodePropertyInteger getClusterRetryInterval() {
    return clusterRetryInterval;
  }

  public void setClusterRetryInterval(ConfigNodePropertyInteger clusterRetryInterval) {
    this.clusterRetryInterval = clusterRetryInterval;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterRetryInterval(ConfigNodePropertyInteger clusterRetryInterval) {
    this.clusterRetryInterval = clusterRetryInterval;
    return this;
  }

 /**
   * Get clusterRetryIntervalMultiplier
   * @return clusterRetryIntervalMultiplier
  **/
  @JsonProperty("cluster.retry.interval.multiplier")
  public ConfigNodePropertyFloat getClusterRetryIntervalMultiplier() {
    return clusterRetryIntervalMultiplier;
  }

  public void setClusterRetryIntervalMultiplier(ConfigNodePropertyFloat clusterRetryIntervalMultiplier) {
    this.clusterRetryIntervalMultiplier = clusterRetryIntervalMultiplier;
  }

  public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties clusterRetryIntervalMultiplier(ConfigNodePropertyFloat clusterRetryIntervalMultiplier) {
    this.clusterRetryIntervalMultiplier = clusterRetryIntervalMultiplier;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

