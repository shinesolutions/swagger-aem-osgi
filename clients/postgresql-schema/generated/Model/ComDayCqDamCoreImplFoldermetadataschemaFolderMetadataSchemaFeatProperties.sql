--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_s'
--
SELECT is_enabled FROM com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_s WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_s'
--
INSERT INTO com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_s (is_enabled) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_s'
--
UPDATE com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_s SET is_enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_s'
--
DELETE FROM com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_s WHERE 1=2;

