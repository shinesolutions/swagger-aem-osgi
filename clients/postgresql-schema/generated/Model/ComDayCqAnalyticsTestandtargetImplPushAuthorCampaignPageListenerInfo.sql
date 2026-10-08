--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_analytics_testandtarget_impl_push_author_campaign_pa'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM com_day_cq_analytics_testandtarget_impl_push_author_campaign_pa WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_analytics_testandtarget_impl_push_author_campaign_pa'
--
INSERT INTO com_day_cq_analytics_testandtarget_impl_push_author_campaign_pa (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_analytics_testandtarget_impl_push_author_campaign_pa'
--
UPDATE com_day_cq_analytics_testandtarget_impl_push_author_campaign_pa SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_analytics_testandtarget_impl_push_author_campaign_pa'
--
DELETE FROM com_day_cq_analytics_testandtarget_impl_push_author_campaign_pa WHERE 1=2;

