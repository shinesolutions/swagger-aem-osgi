--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_propert'
--
SELECT nui_enabled, nui_service_url, nui_api_key FROM com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_propert WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_propert'
--
INSERT INTO com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_propert (nui_enabled, nui_service_url, nui_api_key) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_propert'
--
UPDATE com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_propert SET nui_enabled = ?, nui_service_url = ?, nui_api_key = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_propert'
--
DELETE FROM com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_propert WHERE 1=2;

