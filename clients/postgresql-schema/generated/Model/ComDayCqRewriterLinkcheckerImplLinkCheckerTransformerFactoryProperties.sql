--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_f'
--
SELECT linkcheckertransformer/disable_rewriting, linkcheckertransformer/disable_checking, linkcheckertransformer/map_cache_size, linkcheckertransformer/strict_extension_check, linkcheckertransformer/strip_htmlt_extension, linkcheckertransformer/rewrite_elements, linkcheckertransformer/strip_extension_path_blacklist FROM com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_f WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_f'
--
INSERT INTO com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_f (linkcheckertransformer/disable_rewriting, linkcheckertransformer/disable_checking, linkcheckertransformer/map_cache_size, linkcheckertransformer/strict_extension_check, linkcheckertransformer/strip_htmlt_extension, linkcheckertransformer/rewrite_elements, linkcheckertransformer/strip_extension_path_blacklist) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_f'
--
UPDATE com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_f SET linkcheckertransformer/disable_rewriting = ?, linkcheckertransformer/disable_checking = ?, linkcheckertransformer/map_cache_size = ?, linkcheckertransformer/strict_extension_check = ?, linkcheckertransformer/strip_htmlt_extension = ?, linkcheckertransformer/rewrite_elements = ?, linkcheckertransformer/strip_extension_path_blacklist = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_f'
--
DELETE FROM com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_f WHERE 1=2;

