--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqAnalyticsSitecatalystImplImporterReportImporterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_analytics_sitecatalyst_impl_importer_report_importer'
--
SELECT report/fetch/attempts, report/fetch/delay FROM com_day_cq_analytics_sitecatalyst_impl_importer_report_importer WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_analytics_sitecatalyst_impl_importer_report_importer'
--
INSERT INTO com_day_cq_analytics_sitecatalyst_impl_importer_report_importer (report/fetch/attempts, report/fetch/delay) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_analytics_sitecatalyst_impl_importer_report_importer'
--
UPDATE com_day_cq_analytics_sitecatalyst_impl_importer_report_importer SET report/fetch/attempts = ?, report/fetch/delay = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_analytics_sitecatalyst_impl_importer_report_importer'
--
DELETE FROM com_day_cq_analytics_sitecatalyst_impl_importer_report_importer WHERE 1=2;

