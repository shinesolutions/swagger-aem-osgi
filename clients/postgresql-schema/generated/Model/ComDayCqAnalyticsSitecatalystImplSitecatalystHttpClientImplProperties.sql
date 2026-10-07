--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client'
--
SELECT cq/analytics/sitecatalyst/service/datacenter/url, devhostnamepatterns, connection/timeout, socket/timeout FROM com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client'
--
INSERT INTO com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client (cq/analytics/sitecatalyst/service/datacenter/url, devhostnamepatterns, connection/timeout, socket/timeout) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client'
--
UPDATE com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client SET cq/analytics/sitecatalyst/service/datacenter/url = ?, devhostnamepatterns = ?, connection/timeout = ?, socket/timeout = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client'
--
DELETE FROM com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client WHERE 1=2;

