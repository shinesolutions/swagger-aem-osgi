--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_scripting_java_impl_java_script_engine_factory'
--
SELECT java/classdebuginfo, java/java_encoding, java/compiler_source_vm, java/compiler_target_vm FROM org_apache_sling_scripting_java_impl_java_script_engine_factory WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_scripting_java_impl_java_script_engine_factory'
--
INSERT INTO org_apache_sling_scripting_java_impl_java_script_engine_factory (java/classdebuginfo, java/java_encoding, java/compiler_source_vm, java/compiler_target_vm) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_scripting_java_impl_java_script_engine_factory'
--
UPDATE org_apache_sling_scripting_java_impl_java_script_engine_factory SET java/classdebuginfo = ?, java/java_encoding = ?, java/compiler_source_vm = ?, java/compiler_target_vm = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_scripting_java_impl_java_script_engine_factory'
--
DELETE FROM org_apache_sling_scripting_java_impl_java_script_engine_factory WHERE 1=2;

