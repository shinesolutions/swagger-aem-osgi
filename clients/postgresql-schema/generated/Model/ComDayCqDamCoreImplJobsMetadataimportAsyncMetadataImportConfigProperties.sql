--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_imp'
--
SELECT operation, operation_icon, topic_name, email_enabled FROM com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_imp WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_imp'
--
INSERT INTO com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_imp (operation, operation_icon, topic_name, email_enabled) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_imp'
--
UPDATE com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_imp SET operation = ?, operation_icon = ?, topic_name = ?, email_enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_imp'
--
DELETE FROM com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_imp WHERE 1=2;

