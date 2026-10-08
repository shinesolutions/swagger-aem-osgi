--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplHandlerJpegHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_handler_jpeg_handler_properties'
--
SELECT cq/dam/enable/ext/meta/extraction, large_file_threshold, large_comment_threshold FROM com_day_cq_dam_core_impl_handler_jpeg_handler_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_handler_jpeg_handler_properties'
--
INSERT INTO com_day_cq_dam_core_impl_handler_jpeg_handler_properties (cq/dam/enable/ext/meta/extraction, large_file_threshold, large_comment_threshold) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_handler_jpeg_handler_properties'
--
UPDATE com_day_cq_dam_core_impl_handler_jpeg_handler_properties SET cq/dam/enable/ext/meta/extraction = ?, large_file_threshold = ?, large_comment_threshold = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_handler_jpeg_handler_properties'
--
DELETE FROM com_day_cq_dam_core_impl_handler_jpeg_handler_properties WHERE 1=2;

