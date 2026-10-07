--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_site_impl_analytics_component_configuration'
--
SELECT cq/social/console/analytics/components FROM com_adobe_cq_social_site_impl_analytics_component_configuration WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_site_impl_analytics_component_configuration'
--
INSERT INTO com_adobe_cq_social_site_impl_analytics_component_configuration (cq/social/console/analytics/components) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_social_site_impl_analytics_component_configuration'
--
UPDATE com_adobe_cq_social_site_impl_analytics_component_configuration SET cq/social/console/analytics/components = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_site_impl_analytics_component_configuration'
--
DELETE FROM com_adobe_cq_social_site_impl_analytics_component_configuration WHERE 1=2;

