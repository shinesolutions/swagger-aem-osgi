--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_prope'
--
SELECT pipeline/type FROM com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_prope WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_prope'
--
INSERT INTO com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_prope (pipeline/type) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_prope'
--
UPDATE com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_prope SET pipeline/type = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_prope'
--
DELETE FROM com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_prope WHERE 1=2;

