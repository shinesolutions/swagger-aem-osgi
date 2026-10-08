--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_analytics_sitecatalyst_impl_exporter_classifications'
--
SELECT pid, title, description, properties FROM com_day_cq_analytics_sitecatalyst_impl_exporter_classifications WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_analytics_sitecatalyst_impl_exporter_classifications'
--
INSERT INTO com_day_cq_analytics_sitecatalyst_impl_exporter_classifications (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_analytics_sitecatalyst_impl_exporter_classifications'
--
UPDATE com_day_cq_analytics_sitecatalyst_impl_exporter_classifications SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_analytics_sitecatalyst_impl_exporter_classifications'
--
DELETE FROM com_day_cq_analytics_sitecatalyst_impl_exporter_classifications WHERE 1=2;

