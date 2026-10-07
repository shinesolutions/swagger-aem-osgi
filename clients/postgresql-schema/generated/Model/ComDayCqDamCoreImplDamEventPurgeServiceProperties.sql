--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplDamEventPurgeServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_dam_event_purge_service_properties'
--
SELECT scheduler/expression, max_saved_activities, save_interval, enable_activity_purge, event_types FROM com_day_cq_dam_core_impl_dam_event_purge_service_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_dam_event_purge_service_properties'
--
INSERT INTO com_day_cq_dam_core_impl_dam_event_purge_service_properties (scheduler/expression, max_saved_activities, save_interval, enable_activity_purge, event_types) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_dam_event_purge_service_properties'
--
UPDATE com_day_cq_dam_core_impl_dam_event_purge_service_properties SET scheduler/expression = ?, max_saved_activities = ?, save_interval = ?, enable_activity_purge = ?, event_types = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_dam_event_purge_service_properties'
--
DELETE FROM com_day_cq_dam_core_impl_dam_event_purge_service_properties WHERE 1=2;

