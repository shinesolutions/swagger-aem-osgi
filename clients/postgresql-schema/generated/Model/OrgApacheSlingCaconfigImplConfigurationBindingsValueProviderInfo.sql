--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_caconfig_impl_configuration_bindings_value_pro'
--
SELECT pid, title, description, properties FROM org_apache_sling_caconfig_impl_configuration_bindings_value_pro WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_caconfig_impl_configuration_bindings_value_pro'
--
INSERT INTO org_apache_sling_caconfig_impl_configuration_bindings_value_pro (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_caconfig_impl_configuration_bindings_value_pro'
--
UPDATE org_apache_sling_caconfig_impl_configuration_bindings_value_pro SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_caconfig_impl_configuration_bindings_value_pro'
--
DELETE FROM org_apache_sling_caconfig_impl_configuration_bindings_value_pro WHERE 1=2;

