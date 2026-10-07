--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_plugins_index_async_indexer_service_p'
--
SELECT async_configs, lease_time_out_minutes, failing_index_timeout_seconds, error_warn_interval_seconds FROM org_apache_jackrabbit_oak_plugins_index_async_indexer_service_p WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_plugins_index_async_indexer_service_p'
--
INSERT INTO org_apache_jackrabbit_oak_plugins_index_async_indexer_service_p (async_configs, lease_time_out_minutes, failing_index_timeout_seconds, error_warn_interval_seconds) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_plugins_index_async_indexer_service_p'
--
UPDATE org_apache_jackrabbit_oak_plugins_index_async_indexer_service_p SET async_configs = ?, lease_time_out_minutes = ?, failing_index_timeout_seconds = ?, error_warn_interval_seconds = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_plugins_index_async_indexer_service_p'
--
DELETE FROM org_apache_jackrabbit_oak_plugins_index_async_indexer_service_p WHERE 1=2;

