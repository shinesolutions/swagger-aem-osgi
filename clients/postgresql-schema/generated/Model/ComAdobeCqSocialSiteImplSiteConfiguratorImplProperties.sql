--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialSiteImplSiteConfiguratorImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_site_impl_site_configurator_impl_properties'
--
SELECT components_using_tags FROM com_adobe_cq_social_site_impl_site_configurator_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_site_impl_site_configurator_impl_properties'
--
INSERT INTO com_adobe_cq_social_site_impl_site_configurator_impl_properties (components_using_tags) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_social_site_impl_site_configurator_impl_properties'
--
UPDATE com_adobe_cq_social_site_impl_site_configurator_impl_properties SET components_using_tags = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_site_impl_site_configurator_impl_properties'
--
DELETE FROM com_adobe_cq_social_site_impl_site_configurator_impl_properties WHERE 1=2;

