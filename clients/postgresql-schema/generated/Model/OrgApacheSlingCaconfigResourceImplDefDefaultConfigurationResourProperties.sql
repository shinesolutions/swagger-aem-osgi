--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_caconfig_resource_impl_def_default_configurati'
--
SELECT enabled, config_path, fallback_paths, config_collection_inheritance_property_names FROM org_apache_sling_caconfig_resource_impl_def_default_configurati WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_caconfig_resource_impl_def_default_configurati'
--
INSERT INTO org_apache_sling_caconfig_resource_impl_def_default_configurati (enabled, config_path, fallback_paths, config_collection_inheritance_property_names) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_caconfig_resource_impl_def_default_configurati'
--
UPDATE org_apache_sling_caconfig_resource_impl_def_default_configurati SET enabled = ?, config_path = ?, fallback_paths = ?, config_collection_inheritance_property_names = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_caconfig_resource_impl_def_default_configurati'
--
DELETE FROM org_apache_sling_caconfig_resource_impl_def_default_configurati WHERE 1=2;

