--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCommonsHandlerStandardImageHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_commons_handler_standard_image_handler_propertie'
--
SELECT large_file_threshold, large_comment_threshold, cq/dam/enable/ext/meta/extraction FROM com_day_cq_dam_commons_handler_standard_image_handler_propertie WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_commons_handler_standard_image_handler_propertie'
--
INSERT INTO com_day_cq_dam_commons_handler_standard_image_handler_propertie (large_file_threshold, large_comment_threshold, cq/dam/enable/ext/meta/extraction) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_commons_handler_standard_image_handler_propertie'
--
UPDATE com_day_cq_dam_commons_handler_standard_image_handler_propertie SET large_file_threshold = ?, large_comment_threshold = ?, cq/dam/enable/ext/meta/extraction = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_commons_handler_standard_image_handler_propertie'
--
DELETE FROM com_day_cq_dam_commons_handler_standard_image_handler_propertie WHERE 1=2;

