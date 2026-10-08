
package org.openapitools.client.model


case class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties (
    _serviceRanking: Option[ConfigNodePropertyInteger],
    _globalSize: Option[ConfigNodePropertyInteger],
    _maxDiskUsage: Option[ConfigNodePropertyInteger],
    _persistenceEnabled: Option[ConfigNodePropertyBoolean],
    _threadPoolMaxSize: Option[ConfigNodePropertyInteger],
    _scheduledThreadPoolMaxSize: Option[ConfigNodePropertyInteger],
    _gracefulShutdownTimeout: Option[ConfigNodePropertyInteger],
    _queues: Option[ConfigNodePropertyArray],
    _topics: Option[ConfigNodePropertyArray],
    _addressesMaxDeliveryAttempts: Option[ConfigNodePropertyInteger],
    _addressesExpiryDelay: Option[ConfigNodePropertyInteger],
    _addressesAddressFullMessagePolicy: Option[ConfigNodePropertyDropDown],
    _addressesMaxSizeBytes: Option[ConfigNodePropertyInteger],
    _addressesPageSizeBytes: Option[ConfigNodePropertyInteger],
    _addressesPageCacheMaxSize: Option[ConfigNodePropertyInteger],
    _clusterUser: Option[ConfigNodePropertyString],
    _clusterPassword: Option[ConfigNodePropertyString],
    _clusterCallTimeout: Option[ConfigNodePropertyInteger],
    _clusterCallFailoverTimeout: Option[ConfigNodePropertyInteger],
    _clusterClientFailureCheckPeriod: Option[ConfigNodePropertyInteger],
    _clusterNotificationAttempts: Option[ConfigNodePropertyInteger],
    _clusterNotificationInterval: Option[ConfigNodePropertyInteger],
    _idCacheSize: Option[ConfigNodePropertyInteger],
    _clusterConfirmationWindowSize: Option[ConfigNodePropertyInteger],
    _clusterConnectionTtl: Option[ConfigNodePropertyInteger],
    _clusterDuplicateDetection: Option[ConfigNodePropertyBoolean],
    _clusterInitialConnectAttempts: Option[ConfigNodePropertyInteger],
    _clusterMaxRetryInterval: Option[ConfigNodePropertyInteger],
    _clusterMinLargeMessageSize: Option[ConfigNodePropertyInteger],
    _clusterProducerWindowSize: Option[ConfigNodePropertyInteger],
    _clusterReconnectAttempts: Option[ConfigNodePropertyInteger],
    _clusterRetryInterval: Option[ConfigNodePropertyInteger],
    _clusterRetryIntervalMultiplier: Option[ConfigNodePropertyFloat]
)
object ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties {
    def toStringBody(var_serviceRanking: Object, var_globalSize: Object, var_maxDiskUsage: Object, var_persistenceEnabled: Object, var_threadPoolMaxSize: Object, var_scheduledThreadPoolMaxSize: Object, var_gracefulShutdownTimeout: Object, var_queues: Object, var_topics: Object, var_addressesMaxDeliveryAttempts: Object, var_addressesExpiryDelay: Object, var_addressesAddressFullMessagePolicy: Object, var_addressesMaxSizeBytes: Object, var_addressesPageSizeBytes: Object, var_addressesPageCacheMaxSize: Object, var_clusterUser: Object, var_clusterPassword: Object, var_clusterCallTimeout: Object, var_clusterCallFailoverTimeout: Object, var_clusterClientFailureCheckPeriod: Object, var_clusterNotificationAttempts: Object, var_clusterNotificationInterval: Object, var_idCacheSize: Object, var_clusterConfirmationWindowSize: Object, var_clusterConnectionTtl: Object, var_clusterDuplicateDetection: Object, var_clusterInitialConnectAttempts: Object, var_clusterMaxRetryInterval: Object, var_clusterMinLargeMessageSize: Object, var_clusterProducerWindowSize: Object, var_clusterReconnectAttempts: Object, var_clusterRetryInterval: Object, var_clusterRetryIntervalMultiplier: Object) =
        s"""
        | {
        | "serviceRanking":$var_serviceRanking,"globalSize":$var_globalSize,"maxDiskUsage":$var_maxDiskUsage,"persistenceEnabled":$var_persistenceEnabled,"threadPoolMaxSize":$var_threadPoolMaxSize,"scheduledThreadPoolMaxSize":$var_scheduledThreadPoolMaxSize,"gracefulShutdownTimeout":$var_gracefulShutdownTimeout,"queues":$var_queues,"topics":$var_topics,"addressesMaxDeliveryAttempts":$var_addressesMaxDeliveryAttempts,"addressesExpiryDelay":$var_addressesExpiryDelay,"addressesAddressFullMessagePolicy":$var_addressesAddressFullMessagePolicy,"addressesMaxSizeBytes":$var_addressesMaxSizeBytes,"addressesPageSizeBytes":$var_addressesPageSizeBytes,"addressesPageCacheMaxSize":$var_addressesPageCacheMaxSize,"clusterUser":$var_clusterUser,"clusterPassword":$var_clusterPassword,"clusterCallTimeout":$var_clusterCallTimeout,"clusterCallFailoverTimeout":$var_clusterCallFailoverTimeout,"clusterClientFailureCheckPeriod":$var_clusterClientFailureCheckPeriod,"clusterNotificationAttempts":$var_clusterNotificationAttempts,"clusterNotificationInterval":$var_clusterNotificationInterval,"idCacheSize":$var_idCacheSize,"clusterConfirmationWindowSize":$var_clusterConfirmationWindowSize,"clusterConnectionTtl":$var_clusterConnectionTtl,"clusterDuplicateDetection":$var_clusterDuplicateDetection,"clusterInitialConnectAttempts":$var_clusterInitialConnectAttempts,"clusterMaxRetryInterval":$var_clusterMaxRetryInterval,"clusterMinLargeMessageSize":$var_clusterMinLargeMessageSize,"clusterProducerWindowSize":$var_clusterProducerWindowSize,"clusterReconnectAttempts":$var_clusterReconnectAttempts,"clusterRetryInterval":$var_clusterRetryInterval,"clusterRetryIntervalMultiplier":$var_clusterRetryIntervalMultiplier
        | }
        """.stripMargin
}
