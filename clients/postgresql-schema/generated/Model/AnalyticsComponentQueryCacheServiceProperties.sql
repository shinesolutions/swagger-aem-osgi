--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'analyticsComponentQueryCacheServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'analytics_component_query_cache_service_properties'
--
SELECT cq/analytics/component/query/cache/size FROM analytics_component_query_cache_service_properties WHERE 1=1;

--
-- INSERT template for table 'analytics_component_query_cache_service_properties'
--
INSERT INTO analytics_component_query_cache_service_properties (cq/analytics/component/query/cache/size) VALUES (?);

--
-- UPDATE template for table 'analytics_component_query_cache_service_properties'
--
UPDATE analytics_component_query_cache_service_properties SET cq/analytics/component/query/cache/size = ? WHERE 1=2;

--
-- DELETE template for table 'analytics_component_query_cache_service_properties'
--
DELETE FROM analytics_component_query_cache_service_properties WHERE 1=2;

