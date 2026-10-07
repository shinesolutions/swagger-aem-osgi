--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client'
--
SELECT pid, title, description, properties, additional_properties, bundle_location, service_location FROM com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client'
--
INSERT INTO com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client (pid, title, description, properties, additional_properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client'
--
UPDATE com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client SET pid = ?, title = ?, description = ?, properties = ?, additional_properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client'
--
DELETE FROM com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client WHERE 1=2;

