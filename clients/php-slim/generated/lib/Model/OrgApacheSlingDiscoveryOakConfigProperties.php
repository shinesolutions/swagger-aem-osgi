<?php
/**
 * OrgApacheSlingDiscoveryOakConfigProperties
 */
namespace OpenAPIServer\Model;

/**
 * OrgApacheSlingDiscoveryOakConfigProperties
 */
class OrgApacheSlingDiscoveryOakConfigProperties {

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $connectorPingTimeout */
    private $connectorPingTimeout;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $connectorPingInterval */
    private $connectorPingInterval;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $discoveryLiteCheckInterval */
    private $discoveryLiteCheckInterval;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $clusterSyncServiceTimeout */
    private $clusterSyncServiceTimeout;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $clusterSyncServiceInterval */
    private $clusterSyncServiceInterval;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $enableSyncToken */
    private $enableSyncToken;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $minEventDelay */
    private $minEventDelay;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $socketConnectTimeout */
    private $socketConnectTimeout;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $soTimeout */
    private $soTimeout;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $topologyConnectorUrls */
    private $topologyConnectorUrls;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $topologyConnectorWhitelist */
    private $topologyConnectorWhitelist;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $autoStopLocalLoopEnabled */
    private $autoStopLocalLoopEnabled;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $gzipConnectorRequestsEnabled */
    private $gzipConnectorRequestsEnabled;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $hmacEnabled */
    private $hmacEnabled;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $enableEncryption */
    private $enableEncryption;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $sharedKey */
    private $sharedKey;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $hmacSharedKeyTTL */
    private $hmacSharedKeyTTL;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $backoffStandbyFactor */
    private $backoffStandbyFactor;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $backoffStableFactor */
    private $backoffStableFactor;

}
