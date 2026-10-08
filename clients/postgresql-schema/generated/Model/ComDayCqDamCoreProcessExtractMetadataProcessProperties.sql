--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreProcessExtractMetadataProcessProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_process_extract_metadata_process_properties'
--
SELECT process/label, cq/dam/enable/sha1 FROM com_day_cq_dam_core_process_extract_metadata_process_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_process_extract_metadata_process_properties'
--
INSERT INTO com_day_cq_dam_core_process_extract_metadata_process_properties (process/label, cq/dam/enable/sha1) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_process_extract_metadata_process_properties'
--
UPDATE com_day_cq_dam_core_process_extract_metadata_process_properties SET process/label = ?, cq/dam/enable/sha1 = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_process_extract_metadata_process_properties'
--
DELETE FROM com_day_cq_dam_core_process_extract_metadata_process_properties WHERE 1=2;

