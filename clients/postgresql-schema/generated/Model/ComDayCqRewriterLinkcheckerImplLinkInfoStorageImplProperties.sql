--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_pro'
--
SELECT service/max_links_per_host, service/save_external_link_references FROM com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_pro WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_pro'
--
INSERT INTO com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_pro (service/max_links_per_host, service/save_external_link_references) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_pro'
--
UPDATE com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_pro SET service/max_links_per_host = ?, service/save_external_link_references = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_pro'
--
DELETE FROM com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_pro WHERE 1=2;

