--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqTaggingImplTagGarbageCollectorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_tagging_impl_tag_garbage_collector_properties'
--
SELECT scheduler/expression FROM com_day_cq_tagging_impl_tag_garbage_collector_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_tagging_impl_tag_garbage_collector_properties'
--
INSERT INTO com_day_cq_tagging_impl_tag_garbage_collector_properties (scheduler/expression) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_tagging_impl_tag_garbage_collector_properties'
--
UPDATE com_day_cq_tagging_impl_tag_garbage_collector_properties SET scheduler/expression = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_tagging_impl_tag_garbage_collector_properties'
--
DELETE FROM com_day_cq_tagging_impl_tag_garbage_collector_properties WHERE 1=2;

