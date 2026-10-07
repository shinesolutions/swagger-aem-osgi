--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_caconfig_resource_impl_def_default_configurati'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM org_apache_sling_caconfig_resource_impl_def_default_configurati WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_caconfig_resource_impl_def_default_configurati'
--
INSERT INTO org_apache_sling_caconfig_resource_impl_def_default_configurati (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_caconfig_resource_impl_def_default_configurati'
--
UPDATE org_apache_sling_caconfig_resource_impl_def_default_configurati SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_caconfig_resource_impl_def_default_configurati'
--
DELETE FROM org_apache_sling_caconfig_resource_impl_def_default_configurati WHERE 1=2;

