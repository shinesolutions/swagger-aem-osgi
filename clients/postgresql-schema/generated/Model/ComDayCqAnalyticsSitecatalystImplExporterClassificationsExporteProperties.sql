--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_analytics_sitecatalyst_impl_exporter_classifications'
--
SELECT allowed/paths, cq/analytics/saint/exporter/pagesize FROM com_day_cq_analytics_sitecatalyst_impl_exporter_classifications WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_analytics_sitecatalyst_impl_exporter_classifications'
--
INSERT INTO com_day_cq_analytics_sitecatalyst_impl_exporter_classifications (allowed/paths, cq/analytics/saint/exporter/pagesize) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_analytics_sitecatalyst_impl_exporter_classifications'
--
UPDATE com_day_cq_analytics_sitecatalyst_impl_exporter_classifications SET allowed/paths = ?, cq/analytics/saint/exporter/pagesize = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_analytics_sitecatalyst_impl_exporter_classifications'
--
DELETE FROM com_day_cq_analytics_sitecatalyst_impl_exporter_classifications WHERE 1=2;

