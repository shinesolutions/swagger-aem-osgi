--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_process_exif_tool_extract_metadata_process_'
--
SELECT process/label, cq/dam/enable/sha1 FROM com_day_cq_dam_core_process_exif_tool_extract_metadata_process_ WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_process_exif_tool_extract_metadata_process_'
--
INSERT INTO com_day_cq_dam_core_process_exif_tool_extract_metadata_process_ (process/label, cq/dam/enable/sha1) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_process_exif_tool_extract_metadata_process_'
--
UPDATE com_day_cq_dam_core_process_exif_tool_extract_metadata_process_ SET process/label = ?, cq/dam/enable/sha1 = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_process_exif_tool_extract_metadata_process_'
--
DELETE FROM com_day_cq_dam_core_process_exif_tool_extract_metadata_process_ WHERE 1=2;

