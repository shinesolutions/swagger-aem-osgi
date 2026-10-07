--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_queries_impl_hc_query_limits_health_check_pro'
--
SELECT hc/tags FROM com_adobe_granite_queries_impl_hc_query_limits_health_check_pro WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_queries_impl_hc_query_limits_health_check_pro'
--
INSERT INTO com_adobe_granite_queries_impl_hc_query_limits_health_check_pro (hc/tags) VALUES (?);

--
-- UPDATE template for table 'com_adobe_granite_queries_impl_hc_query_limits_health_check_pro'
--
UPDATE com_adobe_granite_queries_impl_hc_query_limits_health_check_pro SET hc/tags = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_queries_impl_hc_query_limits_health_check_pro'
--
DELETE FROM com_adobe_granite_queries_impl_hc_query_limits_health_check_pro WHERE 1=2;

