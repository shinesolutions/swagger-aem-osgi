--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplDamEventRecorderImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_dam_event_recorder_impl_properties'
--
SELECT event/filter, event/queue/length, eventrecorder/enabled, eventrecorder/blacklist, eventrecorder/eventtypes FROM com_day_cq_dam_core_impl_dam_event_recorder_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_dam_event_recorder_impl_properties'
--
INSERT INTO com_day_cq_dam_core_impl_dam_event_recorder_impl_properties (event/filter, event/queue/length, eventrecorder/enabled, eventrecorder/blacklist, eventrecorder/eventtypes) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_dam_event_recorder_impl_properties'
--
UPDATE com_day_cq_dam_core_impl_dam_event_recorder_impl_properties SET event/filter = ?, event/queue/length = ?, eventrecorder/enabled = ?, eventrecorder/blacklist = ?, eventrecorder/eventtypes = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_dam_event_recorder_impl_properties'
--
DELETE FROM com_day_cq_dam_core_impl_dam_event_recorder_impl_properties WHERE 1=2;

