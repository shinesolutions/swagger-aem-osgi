# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingDiscoveryOakConfig
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, connector_ping_timeout: nil, connector_ping_interval: nil, discovery_lite_check_interval: nil, cluster_sync_service_timeout: nil, cluster_sync_service_interval: nil, enable_sync_token: nil, min_event_delay: nil, socket_connect_timeout: nil, so_timeout: nil, topology_connector_urls: nil, topology_connector_whitelist: nil, auto_stop_local_loop_enabled: nil, gzip_connector_requests_enabled: nil, hmac_enabled: nil, enable_encryption: nil, shared_key: nil, hmac_shared_key_ttl: nil, backoff_standby_factor: nil, backoff_stable_factor: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.discovery.oak.Config',
          type: OpenapiClient::Models::OrgApacheSlingDiscoveryOakConfigInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'connectorPingTimeout' => connector_ping_timeout, 'connectorPingInterval' => connector_ping_interval, 'discoveryLiteCheckInterval' => discovery_lite_check_interval, 'clusterSyncServiceTimeout' => cluster_sync_service_timeout, 'clusterSyncServiceInterval' => cluster_sync_service_interval, 'enableSyncToken' => enable_sync_token, 'minEventDelay' => min_event_delay, 'socketConnectTimeout' => socket_connect_timeout, 'soTimeout' => so_timeout, 'topologyConnectorUrls' => topology_connector_urls, 'topologyConnectorWhitelist' => topology_connector_whitelist, 'autoStopLocalLoopEnabled' => auto_stop_local_loop_enabled, 'gzipConnectorRequestsEnabled' => gzip_connector_requests_enabled, 'hmacEnabled' => hmac_enabled, 'enableEncryption' => enable_encryption, 'sharedKey' => shared_key, 'hmacSharedKeyTTL' => hmac_shared_key_ttl, 'backoffStandbyFactor' => backoff_standby_factor, 'backoffStableFactor' => backoff_stable_factor }
        )
      end
    end
  end
end
