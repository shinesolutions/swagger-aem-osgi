--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplServletDamContentDispositionFilterInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter'
--
SELECT pid, title, description, properties FROM com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter'
--
INSERT INTO com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter'
--
UPDATE com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter'
--
DELETE FROM com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter WHERE 1=2;

