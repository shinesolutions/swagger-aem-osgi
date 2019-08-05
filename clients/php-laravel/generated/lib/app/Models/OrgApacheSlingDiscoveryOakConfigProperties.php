<?php
/**
 * OrgApacheSlingDiscoveryOakConfigProperties
 */
namespace app\Models;

/**
 * OrgApacheSlingDiscoveryOakConfigProperties
 */
class OrgApacheSlingDiscoveryOakConfigProperties {

    /** @var \app\Models\ConfigNodePropertyInteger $connector_ping_timeout */
    private $connector_ping_timeout;

    /** @var \app\Models\ConfigNodePropertyInteger $connector_ping_interval */
    private $connector_ping_interval;

    /** @var \app\Models\ConfigNodePropertyInteger $discovery_lite_check_interval */
    private $discovery_lite_check_interval;

    /** @var \app\Models\ConfigNodePropertyInteger $cluster_sync_service_timeout */
    private $cluster_sync_service_timeout;

    /** @var \app\Models\ConfigNodePropertyInteger $cluster_sync_service_interval */
    private $cluster_sync_service_interval;

    /** @var \app\Models\ConfigNodePropertyBoolean $enable_sync_token */
    private $enable_sync_token;

    /** @var \app\Models\ConfigNodePropertyInteger $min_event_delay */
    private $min_event_delay;

    /** @var \app\Models\ConfigNodePropertyInteger $socket_connect_timeout */
    private $socket_connect_timeout;

    /** @var \app\Models\ConfigNodePropertyInteger $so_timeout */
    private $so_timeout;

    /** @var \app\Models\ConfigNodePropertyArray $topology_connector_urls */
    private $topology_connector_urls;

    /** @var \app\Models\ConfigNodePropertyArray $topology_connector_whitelist */
    private $topology_connector_whitelist;

    /** @var \app\Models\ConfigNodePropertyBoolean $auto_stop_local_loop_enabled */
    private $auto_stop_local_loop_enabled;

    /** @var \app\Models\ConfigNodePropertyBoolean $gzip_connector_requests_enabled */
    private $gzip_connector_requests_enabled;

    /** @var \app\Models\ConfigNodePropertyBoolean $hmac_enabled */
    private $hmac_enabled;

    /** @var \app\Models\ConfigNodePropertyBoolean $enable_encryption */
    private $enable_encryption;

    /** @var \app\Models\ConfigNodePropertyString $shared_key */
    private $shared_key;

    /** @var \app\Models\ConfigNodePropertyInteger $hmac_shared_key_ttl */
    private $hmac_shared_key_ttl;

    /** @var \app\Models\ConfigNodePropertyString $backoff_standby_factor */
    private $backoff_standby_factor;

    /** @var \app\Models\ConfigNodePropertyString $backoff_stable_factor */
    private $backoff_stable_factor;

}
