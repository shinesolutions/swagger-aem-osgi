--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplServletsThumbnailServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties'
--
SELECT workspace, dimensions FROM com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties'
--
INSERT INTO com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties (workspace, dimensions) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties'
--
UPDATE com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties SET workspace = ?, dimensions = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties'
--
DELETE FROM com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties WHERE 1=2;

