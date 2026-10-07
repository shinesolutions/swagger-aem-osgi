--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_queries_impl_hc_query_health_check_metrics_in'
--
SELECT pid, title, description, properties FROM com_adobe_granite_queries_impl_hc_query_health_check_metrics_in WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_queries_impl_hc_query_health_check_metrics_in'
--
INSERT INTO com_adobe_granite_queries_impl_hc_query_health_check_metrics_in (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_queries_impl_hc_query_health_check_metrics_in'
--
UPDATE com_adobe_granite_queries_impl_hc_query_health_check_metrics_in SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_queries_impl_hc_query_health_check_metrics_in'
--
DELETE FROM com_adobe_granite_queries_impl_hc_query_health_check_metrics_in WHERE 1=2;

