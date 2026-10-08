--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_caconfig_impl_def_default_configuration_inheri'
--
SELECT enabled, config_property_inheritance_property_names FROM org_apache_sling_caconfig_impl_def_default_configuration_inheri WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_caconfig_impl_def_default_configuration_inheri'
--
INSERT INTO org_apache_sling_caconfig_impl_def_default_configuration_inheri (enabled, config_property_inheritance_property_names) VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_sling_caconfig_impl_def_default_configuration_inheri'
--
UPDATE org_apache_sling_caconfig_impl_def_default_configuration_inheri SET enabled = ?, config_property_inheritance_property_names = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_caconfig_impl_def_default_configuration_inheri'
--
DELETE FROM org_apache_sling_caconfig_impl_def_default_configuration_inheri WHERE 1=2;

