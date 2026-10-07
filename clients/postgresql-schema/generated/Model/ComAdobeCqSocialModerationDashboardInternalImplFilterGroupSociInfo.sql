--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_moderation_dashboard_internal_impl_filter_g'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_moderation_dashboard_internal_impl_filter_g WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_moderation_dashboard_internal_impl_filter_g'
--
INSERT INTO com_adobe_cq_social_moderation_dashboard_internal_impl_filter_g (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_moderation_dashboard_internal_impl_filter_g'
--
UPDATE com_adobe_cq_social_moderation_dashboard_internal_impl_filter_g SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_moderation_dashboard_internal_impl_filter_g'
--
DELETE FROM com_adobe_cq_social_moderation_dashboard_internal_impl_filter_g WHERE 1=2;

