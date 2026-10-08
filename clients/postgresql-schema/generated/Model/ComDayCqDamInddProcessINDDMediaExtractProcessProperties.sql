--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamInddProcessINDDMediaExtractProcessProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_indd_process_indd_media_extract_process_properti'
--
SELECT process/label, cq/dam/indd/pages/regex, ids/job/decoupled, ids/job/workflow/model FROM com_day_cq_dam_indd_process_indd_media_extract_process_properti WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_indd_process_indd_media_extract_process_properti'
--
INSERT INTO com_day_cq_dam_indd_process_indd_media_extract_process_properti (process/label, cq/dam/indd/pages/regex, ids/job/decoupled, ids/job/workflow/model) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_indd_process_indd_media_extract_process_properti'
--
UPDATE com_day_cq_dam_indd_process_indd_media_extract_process_properti SET process/label = ?, cq/dam/indd/pages/regex = ?, ids/job/decoupled = ?, ids/job/workflow/model = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_indd_process_indd_media_extract_process_properti'
--
DELETE FROM com_day_cq_dam_indd_process_indd_media_extract_process_properti WHERE 1=2;

