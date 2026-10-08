--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_caconfig_impl_def_default_configuration_inheri'
--
SELECT pid, title, description, properties FROM org_apache_sling_caconfig_impl_def_default_configuration_inheri WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_caconfig_impl_def_default_configuration_inheri'
--
INSERT INTO org_apache_sling_caconfig_impl_def_default_configuration_inheri (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_caconfig_impl_def_default_configuration_inheri'
--
UPDATE org_apache_sling_caconfig_impl_def_default_configuration_inheri SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_caconfig_impl_def_default_configuration_inheri'
--
DELETE FROM org_apache_sling_caconfig_impl_def_default_configuration_inheri WHERE 1=2;

