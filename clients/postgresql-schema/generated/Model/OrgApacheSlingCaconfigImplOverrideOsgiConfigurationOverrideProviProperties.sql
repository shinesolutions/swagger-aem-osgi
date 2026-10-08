--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_caconfig_impl_override_osgi_configuration_over'
--
SELECT description, overrides, enabled, service/ranking FROM org_apache_sling_caconfig_impl_override_osgi_configuration_over WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_caconfig_impl_override_osgi_configuration_over'
--
INSERT INTO org_apache_sling_caconfig_impl_override_osgi_configuration_over (description, overrides, enabled, service/ranking) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_caconfig_impl_override_osgi_configuration_over'
--
UPDATE org_apache_sling_caconfig_impl_override_osgi_configuration_over SET description = ?, overrides = ?, enabled = ?, service/ranking = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_caconfig_impl_override_osgi_configuration_over'
--
DELETE FROM org_apache_sling_caconfig_impl_override_osgi_configuration_over WHERE 1=2;

