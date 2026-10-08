require "json"

module OpenAPIClient
  module Api
  class OrgApacheSlingDiscoveryOakConfig
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, connector_ping_timeout : Int32? = nil, connector_ping_interval : Int32? = nil, discovery_lite_check_interval : Int32? = nil, cluster_sync_service_timeout : Int32? = nil, cluster_sync_service_interval : Int32? = nil, enable_sync_token : Bool? = nil, min_event_delay : Int32? = nil, socket_connect_timeout : Int32? = nil, so_timeout : Int32? = nil, topology_connector_urls : Array(String)? = nil, topology_connector_whitelist : Array(String)? = nil, auto_stop_local_loop_enabled : Bool? = nil, gzip_connector_requests_enabled : Bool? = nil, hmac_enabled : Bool? = nil, enable_encryption : Bool? = nil, shared_key : String? = nil, hmac_shared_key_ttl : Int32? = nil, backoff_standby_factor : String? = nil, backoff_stable_factor : String? = nil) : Response(OpenAPIClient::OrgApacheSlingDiscoveryOakConfigInfo)
      @conn.request(OpenAPIClient::OrgApacheSlingDiscoveryOakConfigInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.sling.discovery.oak.Config",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "connectorPingTimeout" => connector_ping_timeout, "connectorPingInterval" => connector_ping_interval, "discoveryLiteCheckInterval" => discovery_lite_check_interval, "clusterSyncServiceTimeout" => cluster_sync_service_timeout, "clusterSyncServiceInterval" => cluster_sync_service_interval, "enableSyncToken" => enable_sync_token, "minEventDelay" => min_event_delay, "socketConnectTimeout" => socket_connect_timeout, "soTimeout" => so_timeout, "topologyConnectorUrls" => topology_connector_urls, "topologyConnectorWhitelist" => topology_connector_whitelist, "autoStopLocalLoopEnabled" => auto_stop_local_loop_enabled, "gzipConnectorRequestsEnabled" => gzip_connector_requests_enabled, "hmacEnabled" => hmac_enabled, "enableEncryption" => enable_encryption, "sharedKey" => shared_key, "hmacSharedKeyTTL" => hmac_shared_key_ttl, "backoffStandbyFactor" => backoff_standby_factor, "backoffStableFactor" => backoff_stable_factor },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
