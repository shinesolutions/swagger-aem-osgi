--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplServletBatchMetadataServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_propert'
--
SELECT cq/dam/batch/metadata/asset/default, cq/dam/batch/metadata/collection/default, cq/dam/batch/metadata/maxresources FROM com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_propert WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_propert'
--
INSERT INTO com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_propert (cq/dam/batch/metadata/asset/default, cq/dam/batch/metadata/collection/default, cq/dam/batch/metadata/maxresources) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_propert'
--
UPDATE com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_propert SET cq/dam/batch/metadata/asset/default = ?, cq/dam/batch/metadata/collection/default = ?, cq/dam/batch/metadata/maxresources = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_propert'
--
DELETE FROM com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_propert WHERE 1=2;

