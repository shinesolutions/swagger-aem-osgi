--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplServletResourceCollectionServletInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_servlet_resource_collection_servlet_in'
--
SELECT pid, title, description, properties FROM com_day_cq_dam_core_impl_servlet_resource_collection_servlet_in WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_servlet_resource_collection_servlet_in'
--
INSERT INTO com_day_cq_dam_core_impl_servlet_resource_collection_servlet_in (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_servlet_resource_collection_servlet_in'
--
UPDATE com_day_cq_dam_core_impl_servlet_resource_collection_servlet_in SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_servlet_resource_collection_servlet_in'
--
DELETE FROM com_day_cq_dam_core_impl_servlet_resource_collection_servlet_in WHERE 1=2;

