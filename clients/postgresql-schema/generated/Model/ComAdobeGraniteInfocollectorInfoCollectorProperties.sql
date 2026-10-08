--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteInfocollectorInfoCollectorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_infocollector_info_collector_properties'
--
SELECT granite/infocollector/include_thread_dumps, granite/infocollector/include_heap_dump FROM com_adobe_granite_infocollector_info_collector_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_infocollector_info_collector_properties'
--
INSERT INTO com_adobe_granite_infocollector_info_collector_properties (granite/infocollector/include_thread_dumps, granite/infocollector/include_heap_dump) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_infocollector_info_collector_properties'
--
UPDATE com_adobe_granite_infocollector_info_collector_properties SET granite/infocollector/include_thread_dumps = ?, granite/infocollector/include_heap_dump = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_infocollector_info_collector_properties'
--
DELETE FROM com_adobe_granite_infocollector_info_collector_properties WHERE 1=2;

