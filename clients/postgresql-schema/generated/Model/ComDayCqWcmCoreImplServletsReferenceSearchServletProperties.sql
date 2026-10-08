--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplServletsReferenceSearchServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_servlets_reference_search_servlet_prop'
--
SELECT referencesearchservlet/max_references_per_page, referencesearchservlet/max_pages FROM com_day_cq_wcm_core_impl_servlets_reference_search_servlet_prop WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_servlets_reference_search_servlet_prop'
--
INSERT INTO com_day_cq_wcm_core_impl_servlets_reference_search_servlet_prop (referencesearchservlet/max_references_per_page, referencesearchservlet/max_pages) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_servlets_reference_search_servlet_prop'
--
UPDATE com_day_cq_wcm_core_impl_servlets_reference_search_servlet_prop SET referencesearchservlet/max_references_per_page = ?, referencesearchservlet/max_pages = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_servlets_reference_search_servlet_prop'
--
DELETE FROM com_day_cq_wcm_core_impl_servlets_reference_search_servlet_prop WHERE 1=2;

