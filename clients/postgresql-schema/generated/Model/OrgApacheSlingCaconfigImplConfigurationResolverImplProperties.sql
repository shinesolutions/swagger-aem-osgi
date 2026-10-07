--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCaconfigImplConfigurationResolverImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_caconfig_impl_configuration_resolver_impl_prop'
--
SELECT config_bucket_names FROM org_apache_sling_caconfig_impl_configuration_resolver_impl_prop WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_caconfig_impl_configuration_resolver_impl_prop'
--
INSERT INTO org_apache_sling_caconfig_impl_configuration_resolver_impl_prop (config_bucket_names) VALUES (?);

--
-- UPDATE template for table 'org_apache_sling_caconfig_impl_configuration_resolver_impl_prop'
--
UPDATE org_apache_sling_caconfig_impl_configuration_resolver_impl_prop SET config_bucket_names = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_caconfig_impl_configuration_resolver_impl_prop'
--
DELETE FROM org_apache_sling_caconfig_impl_configuration_resolver_impl_prop WHERE 1=2;

