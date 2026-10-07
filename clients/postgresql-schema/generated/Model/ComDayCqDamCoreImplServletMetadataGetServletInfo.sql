--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplServletMetadataGetServletInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_servlet_metadata_get_servlet_info'
--
SELECT pid, title, description, properties FROM com_day_cq_dam_core_impl_servlet_metadata_get_servlet_info WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_servlet_metadata_get_servlet_info'
--
INSERT INTO com_day_cq_dam_core_impl_servlet_metadata_get_servlet_info (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_servlet_metadata_get_servlet_info'
--
UPDATE com_day_cq_dam_core_impl_servlet_metadata_get_servlet_info SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_servlet_metadata_get_servlet_info'
--
DELETE FROM com_day_cq_dam_core_impl_servlet_metadata_get_servlet_info WHERE 1=2;

