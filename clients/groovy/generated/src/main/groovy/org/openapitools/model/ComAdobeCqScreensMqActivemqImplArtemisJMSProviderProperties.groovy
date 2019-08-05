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
    ConfigNodePropertyInteger serviceRanking = null

    ConfigNodePropertyInteger globalSize = null

    ConfigNodePropertyInteger maxDiskUsage = null

    ConfigNodePropertyBoolean persistenceEnabled = null

    ConfigNodePropertyInteger threadPoolMaxSize = null

    ConfigNodePropertyInteger scheduledThreadPoolMaxSize = null

    ConfigNodePropertyInteger gracefulShutdownTimeout = null

    ConfigNodePropertyArray queues = null

    ConfigNodePropertyArray topics = null

    ConfigNodePropertyInteger addressesMaxDeliveryAttempts = null

    ConfigNodePropertyInteger addressesExpiryDelay = null

    ConfigNodePropertyDropDown addressesAddressFullMessagePolicy = null

    ConfigNodePropertyInteger addressesMaxSizeBytes = null

    ConfigNodePropertyInteger addressesPageSizeBytes = null

    ConfigNodePropertyInteger addressesPageCacheMaxSize = null

    ConfigNodePropertyString clusterUser = null

    ConfigNodePropertyString clusterPassword = null

    ConfigNodePropertyInteger clusterCallTimeout = null

    ConfigNodePropertyInteger clusterCallFailoverTimeout = null

    ConfigNodePropertyInteger clusterClientFailureCheckPeriod = null

    ConfigNodePropertyInteger clusterNotificationAttempts = null

    ConfigNodePropertyInteger clusterNotificationInterval = null

    ConfigNodePropertyInteger idCacheSize = null

    ConfigNodePropertyInteger clusterConfirmationWindowSize = null

    ConfigNodePropertyInteger clusterConnectionTtl = null

    ConfigNodePropertyBoolean clusterDuplicateDetection = null

    ConfigNodePropertyInteger clusterInitialConnectAttempts = null

    ConfigNodePropertyInteger clusterMaxRetryInterval = null

    ConfigNodePropertyInteger clusterMinLargeMessageSize = null

    ConfigNodePropertyInteger clusterProducerWindowSize = null

    ConfigNodePropertyInteger clusterReconnectAttempts = null

    ConfigNodePropertyInteger clusterRetryInterval = null

    ConfigNodePropertyFloat clusterRetryIntervalMultiplier = null

}
