--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_caconfig_resource_impl_def_default_context_pat'
--
SELECT enabled, config_ref_resource_names, config_ref_property_names, service/ranking FROM org_apache_sling_caconfig_resource_impl_def_default_context_pat WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_caconfig_resource_impl_def_default_context_pat'
--
INSERT INTO org_apache_sling_caconfig_resource_impl_def_default_context_pat (enabled, config_ref_resource_names, config_ref_property_names, service/ranking) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_caconfig_resource_impl_def_default_context_pat'
--
UPDATE org_apache_sling_caconfig_resource_impl_def_default_context_pat SET enabled = ?, config_ref_resource_names = ?, config_ref_property_names = ?, service/ranking = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_caconfig_resource_impl_def_default_context_pat'
--
DELETE FROM org_apache_sling_caconfig_resource_impl_def_default_context_pat WHERE 1=2;

