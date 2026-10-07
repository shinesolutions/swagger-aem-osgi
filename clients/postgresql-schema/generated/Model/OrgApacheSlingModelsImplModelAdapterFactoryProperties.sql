--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingModelsImplModelAdapterFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_models_impl_model_adapter_factory_properties'
--
SELECT osgi/http/whiteboard/listener, osgi/http/whiteboard/context/select, max/recursion/depth, cleanup/job/period FROM org_apache_sling_models_impl_model_adapter_factory_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_models_impl_model_adapter_factory_properties'
--
INSERT INTO org_apache_sling_models_impl_model_adapter_factory_properties (osgi/http/whiteboard/listener, osgi/http/whiteboard/context/select, max/recursion/depth, cleanup/job/period) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_models_impl_model_adapter_factory_properties'
--
UPDATE org_apache_sling_models_impl_model_adapter_factory_properties SET osgi/http/whiteboard/listener = ?, osgi/http/whiteboard/context/select = ?, max/recursion/depth = ?, cleanup/job/period = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_models_impl_model_adapter_factory_properties'
--
DELETE FROM org_apache_sling_models_impl_model_adapter_factory_properties WHERE 1=2;

