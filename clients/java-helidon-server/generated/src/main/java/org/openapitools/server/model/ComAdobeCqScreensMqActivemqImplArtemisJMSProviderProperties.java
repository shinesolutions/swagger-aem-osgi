package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyFloat;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties   {

    private ConfigNodePropertyInteger serviceRanking;
    private ConfigNodePropertyInteger globalSize;
    private ConfigNodePropertyInteger maxDiskUsage;
    private ConfigNodePropertyBoolean persistenceEnabled;
    private ConfigNodePropertyInteger threadPoolMaxSize;
    private ConfigNodePropertyInteger scheduledThreadPoolMaxSize;
    private ConfigNodePropertyInteger gracefulShutdownTimeout;
    private ConfigNodePropertyArray queues;
    private ConfigNodePropertyArray topics;
    private ConfigNodePropertyInteger addressesMaxDeliveryAttempts;
    private ConfigNodePropertyInteger addressesExpiryDelay;
    private ConfigNodePropertyDropDown addressesAddressFullMessagePolicy;
    private ConfigNodePropertyInteger addressesMaxSizeBytes;
    private ConfigNodePropertyInteger addressesPageSizeBytes;
    private ConfigNodePropertyInteger addressesPageCacheMaxSize;
    private ConfigNodePropertyString clusterUser;
    private ConfigNodePropertyString clusterPassword;
    private ConfigNodePropertyInteger clusterCallTimeout;
    private ConfigNodePropertyInteger clusterCallFailoverTimeout;
    private ConfigNodePropertyInteger clusterClientFailureCheckPeriod;
    private ConfigNodePropertyInteger clusterNotificationAttempts;
    private ConfigNodePropertyInteger clusterNotificationInterval;
    private ConfigNodePropertyInteger idCacheSize;
    private ConfigNodePropertyInteger clusterConfirmationWindowSize;
    private ConfigNodePropertyInteger clusterConnectionTtl;
    private ConfigNodePropertyBoolean clusterDuplicateDetection;
    private ConfigNodePropertyInteger clusterInitialConnectAttempts;
    private ConfigNodePropertyInteger clusterMaxRetryInterval;
    private ConfigNodePropertyInteger clusterMinLargeMessageSize;
    private ConfigNodePropertyInteger clusterProducerWindowSize;
    private ConfigNodePropertyInteger clusterReconnectAttempts;
    private ConfigNodePropertyInteger clusterRetryInterval;
    private ConfigNodePropertyFloat clusterRetryIntervalMultiplier;

    /**
     * Default constructor.
     */
    public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.
     *
     * @param serviceRanking serviceRanking
     * @param globalSize globalSize
     * @param maxDiskUsage maxDiskUsage
     * @param persistenceEnabled persistenceEnabled
     * @param threadPoolMaxSize threadPoolMaxSize
     * @param scheduledThreadPoolMaxSize scheduledThreadPoolMaxSize
     * @param gracefulShutdownTimeout gracefulShutdownTimeout
     * @param queues queues
     * @param topics topics
     * @param addressesMaxDeliveryAttempts addressesMaxDeliveryAttempts
     * @param addressesExpiryDelay addressesExpiryDelay
     * @param addressesAddressFullMessagePolicy addressesAddressFullMessagePolicy
     * @param addressesMaxSizeBytes addressesMaxSizeBytes
     * @param addressesPageSizeBytes addressesPageSizeBytes
     * @param addressesPageCacheMaxSize addressesPageCacheMaxSize
     * @param clusterUser clusterUser
     * @param clusterPassword clusterPassword
     * @param clusterCallTimeout clusterCallTimeout
     * @param clusterCallFailoverTimeout clusterCallFailoverTimeout
     * @param clusterClientFailureCheckPeriod clusterClientFailureCheckPeriod
     * @param clusterNotificationAttempts clusterNotificationAttempts
     * @param clusterNotificationInterval clusterNotificationInterval
     * @param idCacheSize idCacheSize
     * @param clusterConfirmationWindowSize clusterConfirmationWindowSize
     * @param clusterConnectionTtl clusterConnectionTtl
     * @param clusterDuplicateDetection clusterDuplicateDetection
     * @param clusterInitialConnectAttempts clusterInitialConnectAttempts
     * @param clusterMaxRetryInterval clusterMaxRetryInterval
     * @param clusterMinLargeMessageSize clusterMinLargeMessageSize
     * @param clusterProducerWindowSize clusterProducerWindowSize
     * @param clusterReconnectAttempts clusterReconnectAttempts
     * @param clusterRetryInterval clusterRetryInterval
     * @param clusterRetryIntervalMultiplier clusterRetryIntervalMultiplier
     */
    public ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties(
        ConfigNodePropertyInteger serviceRanking, 
        ConfigNodePropertyInteger globalSize, 
        ConfigNodePropertyInteger maxDiskUsage, 
        ConfigNodePropertyBoolean persistenceEnabled, 
        ConfigNodePropertyInteger threadPoolMaxSize, 
        ConfigNodePropertyInteger scheduledThreadPoolMaxSize, 
        ConfigNodePropertyInteger gracefulShutdownTimeout, 
        ConfigNodePropertyArray queues, 
        ConfigNodePropertyArray topics, 
        ConfigNodePropertyInteger addressesMaxDeliveryAttempts, 
        ConfigNodePropertyInteger addressesExpiryDelay, 
        ConfigNodePropertyDropDown addressesAddressFullMessagePolicy, 
        ConfigNodePropertyInteger addressesMaxSizeBytes, 
        ConfigNodePropertyInteger addressesPageSizeBytes, 
        ConfigNodePropertyInteger addressesPageCacheMaxSize, 
        ConfigNodePropertyString clusterUser, 
        ConfigNodePropertyString clusterPassword, 
        ConfigNodePropertyInteger clusterCallTimeout, 
        ConfigNodePropertyInteger clusterCallFailoverTimeout, 
        ConfigNodePropertyInteger clusterClientFailureCheckPeriod, 
        ConfigNodePropertyInteger clusterNotificationAttempts, 
        ConfigNodePropertyInteger clusterNotificationInterval, 
        ConfigNodePropertyInteger idCacheSize, 
        ConfigNodePropertyInteger clusterConfirmationWindowSize, 
        ConfigNodePropertyInteger clusterConnectionTtl, 
        ConfigNodePropertyBoolean clusterDuplicateDetection, 
        ConfigNodePropertyInteger clusterInitialConnectAttempts, 
        ConfigNodePropertyInteger clusterMaxRetryInterval, 
        ConfigNodePropertyInteger clusterMinLargeMessageSize, 
        ConfigNodePropertyInteger clusterProducerWindowSize, 
        ConfigNodePropertyInteger clusterReconnectAttempts, 
        ConfigNodePropertyInteger clusterRetryInterval, 
        ConfigNodePropertyFloat clusterRetryIntervalMultiplier
    ) {
        this.serviceRanking = serviceRanking;
        this.globalSize = globalSize;
        this.maxDiskUsage = maxDiskUsage;
        this.persistenceEnabled = persistenceEnabled;
        this.threadPoolMaxSize = threadPoolMaxSize;
        this.scheduledThreadPoolMaxSize = scheduledThreadPoolMaxSize;
        this.gracefulShutdownTimeout = gracefulShutdownTimeout;
        this.queues = queues;
        this.topics = topics;
        this.addressesMaxDeliveryAttempts = addressesMaxDeliveryAttempts;
        this.addressesExpiryDelay = addressesExpiryDelay;
        this.addressesAddressFullMessagePolicy = addressesAddressFullMessagePolicy;
        this.addressesMaxSizeBytes = addressesMaxSizeBytes;
        this.addressesPageSizeBytes = addressesPageSizeBytes;
        this.addressesPageCacheMaxSize = addressesPageCacheMaxSize;
        this.clusterUser = clusterUser;
        this.clusterPassword = clusterPassword;
        this.clusterCallTimeout = clusterCallTimeout;
        this.clusterCallFailoverTimeout = clusterCallFailoverTimeout;
        this.clusterClientFailureCheckPeriod = clusterClientFailureCheckPeriod;
        this.clusterNotificationAttempts = clusterNotificationAttempts;
        this.clusterNotificationInterval = clusterNotificationInterval;
        this.idCacheSize = idCacheSize;
        this.clusterConfirmationWindowSize = clusterConfirmationWindowSize;
        this.clusterConnectionTtl = clusterConnectionTtl;
        this.clusterDuplicateDetection = clusterDuplicateDetection;
        this.clusterInitialConnectAttempts = clusterInitialConnectAttempts;
        this.clusterMaxRetryInterval = clusterMaxRetryInterval;
        this.clusterMinLargeMessageSize = clusterMinLargeMessageSize;
        this.clusterProducerWindowSize = clusterProducerWindowSize;
        this.clusterReconnectAttempts = clusterReconnectAttempts;
        this.clusterRetryInterval = clusterRetryInterval;
        this.clusterRetryIntervalMultiplier = clusterRetryIntervalMultiplier;
    }



    /**
     * Get serviceRanking
     * @return serviceRanking
     */
    public ConfigNodePropertyInteger getServiceRanking() {
        return serviceRanking;
    }

    public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
        this.serviceRanking = serviceRanking;
    }

    /**
     * Get globalSize
     * @return globalSize
     */
    public ConfigNodePropertyInteger getGlobalSize() {
        return globalSize;
    }

    public void setGlobalSize(ConfigNodePropertyInteger globalSize) {
        this.globalSize = globalSize;
    }

    /**
     * Get maxDiskUsage
     * @return maxDiskUsage
     */
    public ConfigNodePropertyInteger getMaxDiskUsage() {
        return maxDiskUsage;
    }

    public void setMaxDiskUsage(ConfigNodePropertyInteger maxDiskUsage) {
        this.maxDiskUsage = maxDiskUsage;
    }

    /**
     * Get persistenceEnabled
     * @return persistenceEnabled
     */
    public ConfigNodePropertyBoolean getPersistenceEnabled() {
        return persistenceEnabled;
    }

    public void setPersistenceEnabled(ConfigNodePropertyBoolean persistenceEnabled) {
        this.persistenceEnabled = persistenceEnabled;
    }

    /**
     * Get threadPoolMaxSize
     * @return threadPoolMaxSize
     */
    public ConfigNodePropertyInteger getThreadPoolMaxSize() {
        return threadPoolMaxSize;
    }

    public void setThreadPoolMaxSize(ConfigNodePropertyInteger threadPoolMaxSize) {
        this.threadPoolMaxSize = threadPoolMaxSize;
    }

    /**
     * Get scheduledThreadPoolMaxSize
     * @return scheduledThreadPoolMaxSize
     */
    public ConfigNodePropertyInteger getScheduledThreadPoolMaxSize() {
        return scheduledThreadPoolMaxSize;
    }

    public void setScheduledThreadPoolMaxSize(ConfigNodePropertyInteger scheduledThreadPoolMaxSize) {
        this.scheduledThreadPoolMaxSize = scheduledThreadPoolMaxSize;
    }

    /**
     * Get gracefulShutdownTimeout
     * @return gracefulShutdownTimeout
     */
    public ConfigNodePropertyInteger getGracefulShutdownTimeout() {
        return gracefulShutdownTimeout;
    }

    public void setGracefulShutdownTimeout(ConfigNodePropertyInteger gracefulShutdownTimeout) {
        this.gracefulShutdownTimeout = gracefulShutdownTimeout;
    }

    /**
     * Get queues
     * @return queues
     */
    public ConfigNodePropertyArray getQueues() {
        return queues;
    }

    public void setQueues(ConfigNodePropertyArray queues) {
        this.queues = queues;
    }

    /**
     * Get topics
     * @return topics
     */
    public ConfigNodePropertyArray getTopics() {
        return topics;
    }

    public void setTopics(ConfigNodePropertyArray topics) {
        this.topics = topics;
    }

    /**
     * Get addressesMaxDeliveryAttempts
     * @return addressesMaxDeliveryAttempts
     */
    public ConfigNodePropertyInteger getAddressesMaxDeliveryAttempts() {
        return addressesMaxDeliveryAttempts;
    }

    public void setAddressesMaxDeliveryAttempts(ConfigNodePropertyInteger addressesMaxDeliveryAttempts) {
        this.addressesMaxDeliveryAttempts = addressesMaxDeliveryAttempts;
    }

    /**
     * Get addressesExpiryDelay
     * @return addressesExpiryDelay
     */
    public ConfigNodePropertyInteger getAddressesExpiryDelay() {
        return addressesExpiryDelay;
    }

    public void setAddressesExpiryDelay(ConfigNodePropertyInteger addressesExpiryDelay) {
        this.addressesExpiryDelay = addressesExpiryDelay;
    }

    /**
     * Get addressesAddressFullMessagePolicy
     * @return addressesAddressFullMessagePolicy
     */
    public ConfigNodePropertyDropDown getAddressesAddressFullMessagePolicy() {
        return addressesAddressFullMessagePolicy;
    }

    public void setAddressesAddressFullMessagePolicy(ConfigNodePropertyDropDown addressesAddressFullMessagePolicy) {
        this.addressesAddressFullMessagePolicy = addressesAddressFullMessagePolicy;
    }

    /**
     * Get addressesMaxSizeBytes
     * @return addressesMaxSizeBytes
     */
    public ConfigNodePropertyInteger getAddressesMaxSizeBytes() {
        return addressesMaxSizeBytes;
    }

    public void setAddressesMaxSizeBytes(ConfigNodePropertyInteger addressesMaxSizeBytes) {
        this.addressesMaxSizeBytes = addressesMaxSizeBytes;
    }

    /**
     * Get addressesPageSizeBytes
     * @return addressesPageSizeBytes
     */
    public ConfigNodePropertyInteger getAddressesPageSizeBytes() {
        return addressesPageSizeBytes;
    }

    public void setAddressesPageSizeBytes(ConfigNodePropertyInteger addressesPageSizeBytes) {
        this.addressesPageSizeBytes = addressesPageSizeBytes;
    }

    /**
     * Get addressesPageCacheMaxSize
     * @return addressesPageCacheMaxSize
     */
    public ConfigNodePropertyInteger getAddressesPageCacheMaxSize() {
        return addressesPageCacheMaxSize;
    }

    public void setAddressesPageCacheMaxSize(ConfigNodePropertyInteger addressesPageCacheMaxSize) {
        this.addressesPageCacheMaxSize = addressesPageCacheMaxSize;
    }

    /**
     * Get clusterUser
     * @return clusterUser
     */
    public ConfigNodePropertyString getClusterUser() {
        return clusterUser;
    }

    public void setClusterUser(ConfigNodePropertyString clusterUser) {
        this.clusterUser = clusterUser;
    }

    /**
     * Get clusterPassword
     * @return clusterPassword
     */
    public ConfigNodePropertyString getClusterPassword() {
        return clusterPassword;
    }

    public void setClusterPassword(ConfigNodePropertyString clusterPassword) {
        this.clusterPassword = clusterPassword;
    }

    /**
     * Get clusterCallTimeout
     * @return clusterCallTimeout
     */
    public ConfigNodePropertyInteger getClusterCallTimeout() {
        return clusterCallTimeout;
    }

    public void setClusterCallTimeout(ConfigNodePropertyInteger clusterCallTimeout) {
        this.clusterCallTimeout = clusterCallTimeout;
    }

    /**
     * Get clusterCallFailoverTimeout
     * @return clusterCallFailoverTimeout
     */
    public ConfigNodePropertyInteger getClusterCallFailoverTimeout() {
        return clusterCallFailoverTimeout;
    }

    public void setClusterCallFailoverTimeout(ConfigNodePropertyInteger clusterCallFailoverTimeout) {
        this.clusterCallFailoverTimeout = clusterCallFailoverTimeout;
    }

    /**
     * Get clusterClientFailureCheckPeriod
     * @return clusterClientFailureCheckPeriod
     */
    public ConfigNodePropertyInteger getClusterClientFailureCheckPeriod() {
        return clusterClientFailureCheckPeriod;
    }

    public void setClusterClientFailureCheckPeriod(ConfigNodePropertyInteger clusterClientFailureCheckPeriod) {
        this.clusterClientFailureCheckPeriod = clusterClientFailureCheckPeriod;
    }

    /**
     * Get clusterNotificationAttempts
     * @return clusterNotificationAttempts
     */
    public ConfigNodePropertyInteger getClusterNotificationAttempts() {
        return clusterNotificationAttempts;
    }

    public void setClusterNotificationAttempts(ConfigNodePropertyInteger clusterNotificationAttempts) {
        this.clusterNotificationAttempts = clusterNotificationAttempts;
    }

    /**
     * Get clusterNotificationInterval
     * @return clusterNotificationInterval
     */
    public ConfigNodePropertyInteger getClusterNotificationInterval() {
        return clusterNotificationInterval;
    }

    public void setClusterNotificationInterval(ConfigNodePropertyInteger clusterNotificationInterval) {
        this.clusterNotificationInterval = clusterNotificationInterval;
    }

    /**
     * Get idCacheSize
     * @return idCacheSize
     */
    public ConfigNodePropertyInteger getIdCacheSize() {
        return idCacheSize;
    }

    public void setIdCacheSize(ConfigNodePropertyInteger idCacheSize) {
        this.idCacheSize = idCacheSize;
    }

    /**
     * Get clusterConfirmationWindowSize
     * @return clusterConfirmationWindowSize
     */
    public ConfigNodePropertyInteger getClusterConfirmationWindowSize() {
        return clusterConfirmationWindowSize;
    }

    public void setClusterConfirmationWindowSize(ConfigNodePropertyInteger clusterConfirmationWindowSize) {
        this.clusterConfirmationWindowSize = clusterConfirmationWindowSize;
    }

    /**
     * Get clusterConnectionTtl
     * @return clusterConnectionTtl
     */
    public ConfigNodePropertyInteger getClusterConnectionTtl() {
        return clusterConnectionTtl;
    }

    public void setClusterConnectionTtl(ConfigNodePropertyInteger clusterConnectionTtl) {
        this.clusterConnectionTtl = clusterConnectionTtl;
    }

    /**
     * Get clusterDuplicateDetection
     * @return clusterDuplicateDetection
     */
    public ConfigNodePropertyBoolean getClusterDuplicateDetection() {
        return clusterDuplicateDetection;
    }

    public void setClusterDuplicateDetection(ConfigNodePropertyBoolean clusterDuplicateDetection) {
        this.clusterDuplicateDetection = clusterDuplicateDetection;
    }

    /**
     * Get clusterInitialConnectAttempts
     * @return clusterInitialConnectAttempts
     */
    public ConfigNodePropertyInteger getClusterInitialConnectAttempts() {
        return clusterInitialConnectAttempts;
    }

    public void setClusterInitialConnectAttempts(ConfigNodePropertyInteger clusterInitialConnectAttempts) {
        this.clusterInitialConnectAttempts = clusterInitialConnectAttempts;
    }

    /**
     * Get clusterMaxRetryInterval
     * @return clusterMaxRetryInterval
     */
    public ConfigNodePropertyInteger getClusterMaxRetryInterval() {
        return clusterMaxRetryInterval;
    }

    public void setClusterMaxRetryInterval(ConfigNodePropertyInteger clusterMaxRetryInterval) {
        this.clusterMaxRetryInterval = clusterMaxRetryInterval;
    }

    /**
     * Get clusterMinLargeMessageSize
     * @return clusterMinLargeMessageSize
     */
    public ConfigNodePropertyInteger getClusterMinLargeMessageSize() {
        return clusterMinLargeMessageSize;
    }

    public void setClusterMinLargeMessageSize(ConfigNodePropertyInteger clusterMinLargeMessageSize) {
        this.clusterMinLargeMessageSize = clusterMinLargeMessageSize;
    }

    /**
     * Get clusterProducerWindowSize
     * @return clusterProducerWindowSize
     */
    public ConfigNodePropertyInteger getClusterProducerWindowSize() {
        return clusterProducerWindowSize;
    }

    public void setClusterProducerWindowSize(ConfigNodePropertyInteger clusterProducerWindowSize) {
        this.clusterProducerWindowSize = clusterProducerWindowSize;
    }

    /**
     * Get clusterReconnectAttempts
     * @return clusterReconnectAttempts
     */
    public ConfigNodePropertyInteger getClusterReconnectAttempts() {
        return clusterReconnectAttempts;
    }

    public void setClusterReconnectAttempts(ConfigNodePropertyInteger clusterReconnectAttempts) {
        this.clusterReconnectAttempts = clusterReconnectAttempts;
    }

    /**
     * Get clusterRetryInterval
     * @return clusterRetryInterval
     */
    public ConfigNodePropertyInteger getClusterRetryInterval() {
        return clusterRetryInterval;
    }

    public void setClusterRetryInterval(ConfigNodePropertyInteger clusterRetryInterval) {
        this.clusterRetryInterval = clusterRetryInterval;
    }

    /**
     * Get clusterRetryIntervalMultiplier
     * @return clusterRetryIntervalMultiplier
     */
    public ConfigNodePropertyFloat getClusterRetryIntervalMultiplier() {
        return clusterRetryIntervalMultiplier;
    }

    public void setClusterRetryIntervalMultiplier(ConfigNodePropertyFloat clusterRetryIntervalMultiplier) {
        this.clusterRetryIntervalMultiplier = clusterRetryIntervalMultiplier;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

