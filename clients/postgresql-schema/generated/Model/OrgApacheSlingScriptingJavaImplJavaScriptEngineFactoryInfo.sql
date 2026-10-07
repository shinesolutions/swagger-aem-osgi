--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_scripting_java_impl_java_script_engine_factory'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM org_apache_sling_scripting_java_impl_java_script_engine_factory WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_scripting_java_impl_java_script_engine_factory'
--
INSERT INTO org_apache_sling_scripting_java_impl_java_script_engine_factory (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_scripting_java_impl_java_script_engine_factory'
--
UPDATE org_apache_sling_scripting_java_impl_java_script_engine_factory SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_scripting_java_impl_java_script_engine_factory'
--
DELETE FROM org_apache_sling_scripting_java_impl_java_script_engine_factory WHERE 1=2;

