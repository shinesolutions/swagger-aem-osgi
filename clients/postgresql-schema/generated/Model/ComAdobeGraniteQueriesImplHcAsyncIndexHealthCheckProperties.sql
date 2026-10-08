--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_queries_impl_hc_async_index_health_check_prop'
--
SELECT indexing/critical/threshold, indexing/warn/threshold, hc/tags FROM com_adobe_granite_queries_impl_hc_async_index_health_check_prop WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_queries_impl_hc_async_index_health_check_prop'
--
INSERT INTO com_adobe_granite_queries_impl_hc_async_index_health_check_prop (indexing/critical/threshold, indexing/warn/threshold, hc/tags) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_queries_impl_hc_async_index_health_check_prop'
--
UPDATE com_adobe_granite_queries_impl_hc_async_index_health_check_prop SET indexing/critical/threshold = ?, indexing/warn/threshold = ?, hc/tags = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_queries_impl_hc_async_index_health_check_prop'
--
DELETE FROM com_adobe_granite_queries_impl_hc_async_index_health_check_prop WHERE 1=2;

