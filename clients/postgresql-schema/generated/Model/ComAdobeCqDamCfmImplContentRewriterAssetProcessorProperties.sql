--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqDamCfmImplContentRewriterAssetProcessorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_prop'
--
SELECT pipeline/type FROM com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_prop WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_prop'
--
INSERT INTO com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_prop (pipeline/type) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_prop'
--
UPDATE com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_prop SET pipeline/type = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_prop'
--
DELETE FROM com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_prop WHERE 1=2;

