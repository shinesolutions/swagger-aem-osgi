--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_exp'
--
SELECT pid, title, description, properties FROM com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_exp WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_exp'
--
INSERT INTO com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_exp (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_exp'
--
UPDATE com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_exp SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_exp'
--
DELETE FROM com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_exp WHERE 1=2;

