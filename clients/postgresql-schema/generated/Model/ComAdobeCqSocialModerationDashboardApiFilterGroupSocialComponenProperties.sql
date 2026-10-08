--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_moderation_dashboard_api_filter_group_socia'
--
SELECT resource_type/filters, priority FROM com_adobe_cq_social_moderation_dashboard_api_filter_group_socia WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_moderation_dashboard_api_filter_group_socia'
--
INSERT INTO com_adobe_cq_social_moderation_dashboard_api_filter_group_socia (resource_type/filters, priority) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_moderation_dashboard_api_filter_group_socia'
--
UPDATE com_adobe_cq_social_moderation_dashboard_api_filter_group_socia SET resource_type/filters = ?, priority = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_moderation_dashboard_api_filter_group_socia'
--
DELETE FROM com_adobe_cq_social_moderation_dashboard_api_filter_group_socia WHERE 1=2;

