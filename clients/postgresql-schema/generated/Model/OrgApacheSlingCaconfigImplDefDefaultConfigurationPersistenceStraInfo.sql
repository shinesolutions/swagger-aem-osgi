--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_caconfig_impl_def_default_configuration_persis'
--
SELECT pid, title, description, properties FROM org_apache_sling_caconfig_impl_def_default_configuration_persis WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_caconfig_impl_def_default_configuration_persis'
--
INSERT INTO org_apache_sling_caconfig_impl_def_default_configuration_persis (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_caconfig_impl_def_default_configuration_persis'
--
UPDATE org_apache_sling_caconfig_impl_def_default_configuration_persis SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_caconfig_impl_def_default_configuration_persis'
--
DELETE FROM org_apache_sling_caconfig_impl_def_default_configuration_persis WHERE 1=2;

