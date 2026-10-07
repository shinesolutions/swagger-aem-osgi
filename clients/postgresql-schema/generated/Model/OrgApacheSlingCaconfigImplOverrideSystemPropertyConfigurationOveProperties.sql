--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_caconfig_impl_override_system_property_configu'
--
SELECT enabled, service/ranking FROM org_apache_sling_caconfig_impl_override_system_property_configu WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_caconfig_impl_override_system_property_configu'
--
INSERT INTO org_apache_sling_caconfig_impl_override_system_property_configu (enabled, service/ranking) VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_sling_caconfig_impl_override_system_property_configu'
--
UPDATE org_apache_sling_caconfig_impl_override_system_property_configu SET enabled = ?, service/ranking = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_caconfig_impl_override_system_property_configu'
--
DELETE FROM org_apache_sling_caconfig_impl_override_system_property_configu WHERE 1=2;

