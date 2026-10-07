--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDiscoveryOakConfigProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_discovery_oak_config_properties'
--
SELECT connector_ping_timeout, connector_ping_interval, discovery_lite_check_interval, cluster_sync_service_timeout, cluster_sync_service_interval, enable_sync_token, min_event_delay, socket_connect_timeout, so_timeout, topology_connector_urls, topology_connector_whitelist, auto_stop_local_loop_enabled, gzip_connector_requests_enabled, hmac_enabled, enable_encryption, shared_key, hmac_shared_key_ttl, backoff_standby_factor, backoff_stable_factor FROM org_apache_sling_discovery_oak_config_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_discovery_oak_config_properties'
--
INSERT INTO org_apache_sling_discovery_oak_config_properties (connector_ping_timeout, connector_ping_interval, discovery_lite_check_interval, cluster_sync_service_timeout, cluster_sync_service_interval, enable_sync_token, min_event_delay, socket_connect_timeout, so_timeout, topology_connector_urls, topology_connector_whitelist, auto_stop_local_loop_enabled, gzip_connector_requests_enabled, hmac_enabled, enable_encryption, shared_key, hmac_shared_key_ttl, backoff_standby_factor, backoff_stable_factor) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_discovery_oak_config_properties'
--
UPDATE org_apache_sling_discovery_oak_config_properties SET connector_ping_timeout = ?, connector_ping_interval = ?, discovery_lite_check_interval = ?, cluster_sync_service_timeout = ?, cluster_sync_service_interval = ?, enable_sync_token = ?, min_event_delay = ?, socket_connect_timeout = ?, so_timeout = ?, topology_connector_urls = ?, topology_connector_whitelist = ?, auto_stop_local_loop_enabled = ?, gzip_connector_requests_enabled = ?, hmac_enabled = ?, enable_encryption = ?, shared_key = ?, hmac_shared_key_ttl = ?, backoff_standby_factor = ?, backoff_stable_factor = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_discovery_oak_config_properties'
--
DELETE FROM org_apache_sling_discovery_oak_config_properties WHERE 1=2;

