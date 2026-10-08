--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_models_jacksonexporter_impl_resource_module_pr'
--
SELECT pid, title, description, properties FROM org_apache_sling_models_jacksonexporter_impl_resource_module_pr WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_models_jacksonexporter_impl_resource_module_pr'
--
INSERT INTO org_apache_sling_models_jacksonexporter_impl_resource_module_pr (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_models_jacksonexporter_impl_resource_module_pr'
--
UPDATE org_apache_sling_models_jacksonexporter_impl_resource_module_pr SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_models_jacksonexporter_impl_resource_module_pr'
--
DELETE FROM org_apache_sling_models_jacksonexporter_impl_resource_module_pr WHERE 1=2;

