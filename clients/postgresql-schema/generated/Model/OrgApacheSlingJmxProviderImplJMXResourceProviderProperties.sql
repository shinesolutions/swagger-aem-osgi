--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingJmxProviderImplJMXResourceProviderProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_jmx_provider_impl_jmx_resource_provider_proper'
--
SELECT provider/roots FROM org_apache_sling_jmx_provider_impl_jmx_resource_provider_proper WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_jmx_provider_impl_jmx_resource_provider_proper'
--
INSERT INTO org_apache_sling_jmx_provider_impl_jmx_resource_provider_proper (provider/roots) VALUES (?);

--
-- UPDATE template for table 'org_apache_sling_jmx_provider_impl_jmx_resource_provider_proper'
--
UPDATE org_apache_sling_jmx_provider_impl_jmx_resource_provider_proper SET provider/roots = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_jmx_provider_impl_jmx_resource_provider_proper'
--
DELETE FROM org_apache_sling_jmx_provider_impl_jmx_resource_provider_proper WHERE 1=2;

