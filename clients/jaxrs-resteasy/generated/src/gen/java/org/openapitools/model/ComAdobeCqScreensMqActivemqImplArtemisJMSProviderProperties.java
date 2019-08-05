package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyFloat;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties   {
  
  private ConfigNodePropertyInteger serviceRanking = null;
  private ConfigNodePropertyInteger globalSize = null;
  private ConfigNodePropertyInteger maxDiskUsage = null;
  private ConfigNodePropertyBoolean persistenceEnabled = null;
  private ConfigNodePropertyInteger threadPoolMaxSize = null;
  private ConfigNodePropertyInteger scheduledThreadPoolMaxSize = null;
  private ConfigNodePropertyInteger gracefulShutdownTimeout = null;
  private ConfigNodePropertyArray queues = null;
  private ConfigNodePropertyArray topics = null;
  private ConfigNodePropertyInteger addressesMaxDeliveryAttempts = null;
  private ConfigNodePropertyInteger addressesExpiryDelay = null;
  private ConfigNodePropertyDropDown addressesAddressFullMessagePolicy = null;
  private ConfigNodePropertyInteger addressesMaxSizeBytes = null;
  private ConfigNodePropertyInteger addressesPageSizeBytes = null;
  private ConfigNodePropertyInteger addressesPageCacheMaxSize = null;
  private ConfigNodePropertyString clusterUser = null;
  private ConfigNodePropertyString clusterPassword = null;
  private ConfigNodePropertyInteger clusterCallTimeout = null;
  private ConfigNodePropertyInteger clusterCallFailoverTimeout = null;
  private ConfigNodePropertyInteger clusterClientFailureCheckPeriod = null;
  private ConfigNodePropertyInteger clusterNotificationAttempts = null;
  private ConfigNodePropertyInteger clusterNotificationInterval = null;
  private ConfigNodePropertyInteger idCacheSize = null;
  private ConfigNodePropertyInteger clusterConfirmationWindowSize = null;
  private ConfigNodePropertyInteger clusterConnectionTtl = null;
  private ConfigNodePropertyBoolean clusterDuplicateDetection = null;
  private ConfigNodePropertyInteger clusterInitialConnectAttempts = null;
  private ConfigNodePropertyInteger clusterMaxRetryInterval = null;
  private ConfigNodePropertyInteger clusterMinLargeMessageSize = null;
  private ConfigNodePropertyInteger clusterProducerWindowSize = null;
  private ConfigNodePropertyInteger clusterReconnectAttempts = null;
  private ConfigNodePropertyInteger clusterRetryInterval = null;
  private ConfigNodePropertyFloat clusterRetryIntervalMultiplier = null;

  /**
   **/
  
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

