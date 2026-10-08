--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handl'
--
SELECT guess_total, tag_title_search FROM com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handl WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handl'
--
INSERT INTO com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handl (guess_total, tag_title_search) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handl'
--
UPDATE com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handl SET guess_total = ?, tag_title_search = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handl'
--
DELETE FROM com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handl WHERE 1=2;

