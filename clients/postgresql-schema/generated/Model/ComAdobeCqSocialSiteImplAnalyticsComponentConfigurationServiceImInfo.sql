--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_site_impl_analytics_component_configuration'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_site_impl_analytics_component_configuration WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_site_impl_analytics_component_configuration'
--
INSERT INTO com_adobe_cq_social_site_impl_analytics_component_configuration (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_site_impl_analytics_component_configuration'
--
UPDATE com_adobe_cq_social_site_impl_analytics_component_configuration SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_site_impl_analytics_component_configuration'
--
DELETE FROM com_adobe_cq_social_site_impl_analytics_component_configuration WHERE 1=2;

