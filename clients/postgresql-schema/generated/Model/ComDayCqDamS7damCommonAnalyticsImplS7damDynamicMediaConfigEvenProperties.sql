--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_'
--
SELECT cq/dam/s7dam/dynamicmediaconfigeventlistener/enabled FROM com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_ WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_'
--
INSERT INTO com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_ (cq/dam/s7dam/dynamicmediaconfigeventlistener/enabled) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_'
--
UPDATE com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_ SET cq/dam/s7dam/dynamicmediaconfigeventlistener/enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_'
--
DELETE FROM com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_ WHERE 1=2;

