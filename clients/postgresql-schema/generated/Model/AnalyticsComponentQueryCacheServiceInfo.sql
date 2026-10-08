--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'analyticsComponentQueryCacheServiceInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'analytics_component_query_cache_service_info'
--
SELECT pid, title, description, properties FROM analytics_component_query_cache_service_info WHERE 1=1;

--
-- INSERT template for table 'analytics_component_query_cache_service_info'
--
INSERT INTO analytics_component_query_cache_service_info (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'analytics_component_query_cache_service_info'
--
UPDATE analytics_component_query_cache_service_info SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'analytics_component_query_cache_service_info'
--
DELETE FROM analytics_component_query_cache_service_info WHERE 1=2;

