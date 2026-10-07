--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_moderation_dashboard_api_user_details_socia'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_moderation_dashboard_api_user_details_socia WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_moderation_dashboard_api_user_details_socia'
--
INSERT INTO com_adobe_cq_social_moderation_dashboard_api_user_details_socia (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_moderation_dashboard_api_user_details_socia'
--
UPDATE com_adobe_cq_social_moderation_dashboard_api_user_details_socia SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_moderation_dashboard_api_user_details_socia'
--
DELETE FROM com_adobe_cq_social_moderation_dashboard_api_user_details_socia WHERE 1=2;

