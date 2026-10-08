--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplServletCollectionsServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_servlet_collections_servlet_properties'
--
SELECT cq/dam/batch/collections/properties, cq/dam/batch/collections/limit FROM com_day_cq_dam_core_impl_servlet_collections_servlet_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_servlet_collections_servlet_properties'
--
INSERT INTO com_day_cq_dam_core_impl_servlet_collections_servlet_properties (cq/dam/batch/collections/properties, cq/dam/batch/collections/limit) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_servlet_collections_servlet_properties'
--
UPDATE com_day_cq_dam_core_impl_servlet_collections_servlet_properties SET cq/dam/batch/collections/properties = ?, cq/dam/batch/collections/limit = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_servlet_collections_servlet_properties'
--
DELETE FROM com_day_cq_dam_core_impl_servlet_collections_servlet_properties WHERE 1=2;

