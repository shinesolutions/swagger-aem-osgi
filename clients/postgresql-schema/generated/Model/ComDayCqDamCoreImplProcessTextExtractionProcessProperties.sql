--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplProcessTextExtractionProcessProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_process_text_extraction_process_proper'
--
SELECT mime_types, max_extract FROM com_day_cq_dam_core_impl_process_text_extraction_process_proper WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_process_text_extraction_process_proper'
--
INSERT INTO com_day_cq_dam_core_impl_process_text_extraction_process_proper (mime_types, max_extract) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_process_text_extraction_process_proper'
--
UPDATE com_day_cq_dam_core_impl_process_text_extraction_process_proper SET mime_types = ?, max_extract = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_process_text_extraction_process_proper'
--
DELETE FROM com_day_cq_dam_core_impl_process_text_extraction_process_proper WHERE 1=2;

