--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_analytics_testandtarget_impl_account_options_updater'
--
SELECT cq/analytics/testandtarget/accountoptionsupdater/enabled FROM com_day_cq_analytics_testandtarget_impl_account_options_updater WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_analytics_testandtarget_impl_account_options_updater'
--
INSERT INTO com_day_cq_analytics_testandtarget_impl_account_options_updater (cq/analytics/testandtarget/accountoptionsupdater/enabled) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_analytics_testandtarget_impl_account_options_updater'
--
UPDATE com_day_cq_analytics_testandtarget_impl_account_options_updater SET cq/analytics/testandtarget/accountoptionsupdater/enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_analytics_testandtarget_impl_account_options_updater'
--
DELETE FROM com_day_cq_analytics_testandtarget_impl_account_options_updater WHERE 1=2;

