--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingScriptingCoreImplScriptCacheImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_scripting_core_impl_script_cache_impl_properti'
--
SELECT org/apache/sling/scripting/cache/size, org/apache/sling/scripting/cache/additional_extensions FROM org_apache_sling_scripting_core_impl_script_cache_impl_properti WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_scripting_core_impl_script_cache_impl_properti'
--
INSERT INTO org_apache_sling_scripting_core_impl_script_cache_impl_properti (org/apache/sling/scripting/cache/size, org/apache/sling/scripting/cache/additional_extensions) VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_sling_scripting_core_impl_script_cache_impl_properti'
--
UPDATE org_apache_sling_scripting_core_impl_script_cache_impl_properti SET org/apache/sling/scripting/cache/size = ?, org/apache/sling/scripting/cache/additional_extensions = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_scripting_core_impl_script_cache_impl_properti'
--
DELETE FROM org_apache_sling_scripting_core_impl_script_cache_impl_properti WHERE 1=2;

