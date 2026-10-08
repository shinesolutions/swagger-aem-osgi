--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_inf'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_inf WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_inf'
--
INSERT INTO com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_inf (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_inf'
--
UPDATE com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_inf SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_inf'
--
DELETE FROM com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_inf WHERE 1=2;

