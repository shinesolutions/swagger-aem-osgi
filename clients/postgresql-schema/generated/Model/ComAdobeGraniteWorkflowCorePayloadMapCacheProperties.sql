--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteWorkflowCorePayloadMapCacheProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_workflow_core_payload_map_cache_properties'
--
SELECT get_system_workflow_models, get_package_root_path FROM com_adobe_granite_workflow_core_payload_map_cache_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_workflow_core_payload_map_cache_properties'
--
INSERT INTO com_adobe_granite_workflow_core_payload_map_cache_properties (get_system_workflow_models, get_package_root_path) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_workflow_core_payload_map_cache_properties'
--
UPDATE com_adobe_granite_workflow_core_payload_map_cache_properties SET get_system_workflow_models = ?, get_package_root_path = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_workflow_core_payload_map_cache_properties'
--
DELETE FROM com_adobe_granite_workflow_core_payload_map_cache_properties WHERE 1=2;

