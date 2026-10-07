--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_v'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_v WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_v'
--
INSERT INTO org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_v (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_v'
--
UPDATE org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_v SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_v'
--
DELETE FROM org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_v WHERE 1=2;

