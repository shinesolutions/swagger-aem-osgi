--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_query_query_engine_settings_service_p'
--
SELECT query_limit_in_memory, query_limit_reads, query_fail_traversal, fast_query_size FROM org_apache_jackrabbit_oak_query_query_engine_settings_service_p WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_query_query_engine_settings_service_p'
--
INSERT INTO org_apache_jackrabbit_oak_query_query_engine_settings_service_p (query_limit_in_memory, query_limit_reads, query_fail_traversal, fast_query_size) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_query_query_engine_settings_service_p'
--
UPDATE org_apache_jackrabbit_oak_query_query_engine_settings_service_p SET query_limit_in_memory = ?, query_limit_reads = ?, query_fail_traversal = ?, fast_query_size = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_query_query_engine_settings_service_p'
--
DELETE FROM org_apache_jackrabbit_oak_query_query_engine_settings_service_p WHERE 1=2;

