--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report'
--
SELECT scheduler/expression, scheduler/concurrent FROM com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report'
--
INSERT INTO com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report (scheduler/expression, scheduler/concurrent) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report'
--
UPDATE com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report SET scheduler/expression = ?, scheduler/concurrent = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report'
--
DELETE FROM com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report WHERE 1=2;

