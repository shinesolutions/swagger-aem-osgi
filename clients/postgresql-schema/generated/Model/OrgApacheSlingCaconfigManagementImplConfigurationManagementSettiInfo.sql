--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_caconfig_management_impl_configuration_managem'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM org_apache_sling_caconfig_management_impl_configuration_managem WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_caconfig_management_impl_configuration_managem'
--
INSERT INTO org_apache_sling_caconfig_management_impl_configuration_managem (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_caconfig_management_impl_configuration_managem'
--
UPDATE org_apache_sling_caconfig_management_impl_configuration_managem SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_caconfig_management_impl_configuration_managem'
--
DELETE FROM org_apache_sling_caconfig_management_impl_configuration_managem WHERE 1=2;

