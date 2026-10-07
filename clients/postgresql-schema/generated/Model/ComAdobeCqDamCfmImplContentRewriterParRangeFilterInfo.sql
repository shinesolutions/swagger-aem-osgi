--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqDamCfmImplContentRewriterParRangeFilterInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter_inf'
--
SELECT pid, title, description, properties FROM com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter_inf WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter_inf'
--
INSERT INTO com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter_inf (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter_inf'
--
UPDATE com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter_inf SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter_inf'
--
DELETE FROM com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter_inf WHERE 1=2;

