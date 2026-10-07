package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyFloat;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties {
    
    ConfigNodePropertyInteger serviceRanking
    
    ConfigNodePropertyInteger globalSize
    
    ConfigNodePropertyInteger maxDiskUsage
    
    ConfigNodePropertyBoolean persistenceEnabled
    
    ConfigNodePropertyInteger threadPoolMaxSize
    
    ConfigNodePropertyInteger scheduledThreadPoolMaxSize
    
    ConfigNodePropertyInteger gracefulShutdownTimeout
    
    ConfigNodePropertyArray queues
    
    ConfigNodePropertyArray topics
    
    ConfigNodePropertyInteger addressesMaxDeliveryAttempts
    
    ConfigNodePropertyInteger addressesExpiryDelay
    
    ConfigNodePropertyDropDown addressesAddressFullMessagePolicy
    
    ConfigNodePropertyInteger addressesMaxSizeBytes
    
    ConfigNodePropertyInteger addressesPageSizeBytes
    
    ConfigNodePropertyInteger addressesPageCacheMaxSize
    
    ConfigNodePropertyString clusterUser
    
    ConfigNodePropertyString clusterPassword
    
    ConfigNodePropertyInteger clusterCallTimeout
    
    ConfigNodePropertyInteger clusterCallFailoverTimeout
    
    ConfigNodePropertyInteger clusterClientFailureCheckPeriod
    
    ConfigNodePropertyInteger clusterNotificationAttempts
    
    ConfigNodePropertyInteger clusterNotificationInterval
    
    ConfigNodePropertyInteger idCacheSize
    
    ConfigNodePropertyInteger clusterConfirmationWindowSize
    
    ConfigNodePropertyInteger clusterConnectionTtl
    
    ConfigNodePropertyBoolean clusterDuplicateDetection
    
    ConfigNodePropertyInteger clusterInitialConnectAttempts
    
    ConfigNodePropertyInteger clusterMaxRetryInterval
    
    ConfigNodePropertyInteger clusterMinLargeMessageSize
    
    ConfigNodePropertyInteger clusterProducerWindowSize
    
    ConfigNodePropertyInteger clusterReconnectAttempts
    
    ConfigNodePropertyInteger clusterRetryInterval
    
    ConfigNodePropertyFloat clusterRetryIntervalMultiplier
}
