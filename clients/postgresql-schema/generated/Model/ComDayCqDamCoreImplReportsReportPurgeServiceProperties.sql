--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplReportsReportPurgeServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_reports_report_purge_service_propertie'
--
SELECT scheduler/expression, max_saved_reports, time_duration, enable_report_purge FROM com_day_cq_dam_core_impl_reports_report_purge_service_propertie WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_reports_report_purge_service_propertie'
--
INSERT INTO com_day_cq_dam_core_impl_reports_report_purge_service_propertie (scheduler/expression, max_saved_reports, time_duration, enable_report_purge) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_reports_report_purge_service_propertie'
--
UPDATE com_day_cq_dam_core_impl_reports_report_purge_service_propertie SET scheduler/expression = ?, max_saved_reports = ?, time_duration = ?, enable_report_purge = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_reports_report_purge_service_propertie'
--
DELETE FROM com_day_cq_dam_core_impl_reports_report_purge_service_propertie WHERE 1=2;

