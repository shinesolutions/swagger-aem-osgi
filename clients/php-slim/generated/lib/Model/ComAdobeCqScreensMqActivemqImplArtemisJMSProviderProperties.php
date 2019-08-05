<?php
/**
 * ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties
 */
namespace OpenAPIServer\Model;

/**
 * ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties
 */
class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties {

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $serviceRanking */
    private $serviceRanking;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $globalSize */
    private $globalSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $maxDiskUsage */
    private $maxDiskUsage;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $persistenceEnabled */
    private $persistenceEnabled;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $threadPoolMaxSize */
    private $threadPoolMaxSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $scheduledThreadPoolMaxSize */
    private $scheduledThreadPoolMaxSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $gracefulShutdownTimeout */
    private $gracefulShutdownTimeout;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $queues */
    private $queues;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $topics */
    private $topics;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $addressesMaxDeliveryAttempts */
    private $addressesMaxDeliveryAttempts;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $addressesExpiryDelay */
    private $addressesExpiryDelay;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyDropDown $addressesAddressFullMessagePolicy */
    private $addressesAddressFullMessagePolicy;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $addressesMaxSizeBytes */
    private $addressesMaxSizeBytes;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $addressesPageSizeBytes */
    private $addressesPageSizeBytes;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $addressesPageCacheMaxSize */
    private $addressesPageCacheMaxSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $clusterUser */
    private $clusterUser;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $clusterPassword */
    private $clusterPassword;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $clusterCallTimeout */
    private $clusterCallTimeout;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $clusterCallFailoverTimeout */
    private $clusterCallFailoverTimeout;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $clusterClientFailureCheckPeriod */
    private $clusterClientFailureCheckPeriod;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $clusterNotificationAttempts */
    private $clusterNotificationAttempts;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $clusterNotificationInterval */
    private $clusterNotificationInterval;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $idCacheSize */
    private $idCacheSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $clusterConfirmationWindowSize */
    private $clusterConfirmationWindowSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $clusterConnectionTtl */
    private $clusterConnectionTtl;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $clusterDuplicateDetection */
    private $clusterDuplicateDetection;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $clusterInitialConnectAttempts */
    private $clusterInitialConnectAttempts;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $clusterMaxRetryInterval */
    private $clusterMaxRetryInterval;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $clusterMinLargeMessageSize */
    private $clusterMinLargeMessageSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $clusterProducerWindowSize */
    private $clusterProducerWindowSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $clusterReconnectAttempts */
    private $clusterReconnectAttempts;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $clusterRetryInterval */
    private $clusterRetryInterval;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyFloat $clusterRetryIntervalMultiplier */
    private $clusterRetryIntervalMultiplier;

}
