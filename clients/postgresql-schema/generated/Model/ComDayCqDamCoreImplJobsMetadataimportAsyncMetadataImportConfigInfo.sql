--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_imp'
--
SELECT pid, title, description, properties FROM com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_imp WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_imp'
--
INSERT INTO com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_imp (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_imp'
--
UPDATE com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_imp SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_imp'
--
DELETE FROM com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_imp WHERE 1=2;

