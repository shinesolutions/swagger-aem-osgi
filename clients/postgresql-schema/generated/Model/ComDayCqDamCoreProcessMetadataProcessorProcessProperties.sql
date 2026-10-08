--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreProcessMetadataProcessorProcessProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_process_metadata_processor_process_properti'
--
SELECT process/label, cq/dam/enable/sha1, cq/dam/metadata/xssprotected/properties FROM com_day_cq_dam_core_process_metadata_processor_process_properti WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_process_metadata_processor_process_properti'
--
INSERT INTO com_day_cq_dam_core_process_metadata_processor_process_properti (process/label, cq/dam/enable/sha1, cq/dam/metadata/xssprotected/properties) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_process_metadata_processor_process_properti'
--
UPDATE com_day_cq_dam_core_process_metadata_processor_process_properti SET process/label = ?, cq/dam/enable/sha1 = ?, cq/dam/metadata/xssprotected/properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_process_metadata_processor_process_properti'
--
DELETE FROM com_day_cq_dam_core_process_metadata_processor_process_properti WHERE 1=2;

