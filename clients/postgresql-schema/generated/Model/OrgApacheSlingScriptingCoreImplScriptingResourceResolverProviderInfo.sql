--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_scripting_core_impl_scripting_resource_resolve'
--
SELECT pid, title, description, properties FROM org_apache_sling_scripting_core_impl_scripting_resource_resolve WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_scripting_core_impl_scripting_resource_resolve'
--
INSERT INTO org_apache_sling_scripting_core_impl_scripting_resource_resolve (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_scripting_core_impl_scripting_resource_resolve'
--
UPDATE org_apache_sling_scripting_core_impl_scripting_resource_resolve SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_scripting_core_impl_scripting_resource_resolve'
--
DELETE FROM org_apache_sling_scripting_core_impl_scripting_resource_resolve WHERE 1=2;

