--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transfor'
--
SELECT cq/contentsync/pathrewritertransformer/mapping/links, cq/contentsync/pathrewritertransformer/mapping/clientlibs, cq/contentsync/pathrewritertransformer/mapping/images, cq/contentsync/pathrewritertransformer/attribute/pattern, cq/contentsync/pathrewritertransformer/clientlibrary/pattern, cq/contentsync/pathrewritertransformer/clientlibrary/replace FROM com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transfor WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transfor'
--
INSERT INTO com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transfor (cq/contentsync/pathrewritertransformer/mapping/links, cq/contentsync/pathrewritertransformer/mapping/clientlibs, cq/contentsync/pathrewritertransformer/mapping/images, cq/contentsync/pathrewritertransformer/attribute/pattern, cq/contentsync/pathrewritertransformer/clientlibrary/pattern, cq/contentsync/pathrewritertransformer/clientlibrary/replace) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transfor'
--
UPDATE com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transfor SET cq/contentsync/pathrewritertransformer/mapping/links = ?, cq/contentsync/pathrewritertransformer/mapping/clientlibs = ?, cq/contentsync/pathrewritertransformer/mapping/images = ?, cq/contentsync/pathrewritertransformer/attribute/pattern = ?, cq/contentsync/pathrewritertransformer/clientlibrary/pattern = ?, cq/contentsync/pathrewritertransformer/clientlibrary/replace = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transfor'
--
DELETE FROM com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transfor WHERE 1=2;

