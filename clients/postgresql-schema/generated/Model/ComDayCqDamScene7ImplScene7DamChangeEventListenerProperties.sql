--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamScene7ImplScene7DamChangeEventListenerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_pro'
--
SELECT cq/dam/scene7/damchangeeventlistener/enabled, cq/dam/scene7/damchangeeventlistener/observed/paths FROM com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_pro WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_pro'
--
INSERT INTO com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_pro (cq/dam/scene7/damchangeeventlistener/enabled, cq/dam/scene7/damchangeeventlistener/observed/paths) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_pro'
--
UPDATE com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_pro SET cq/dam/scene7/damchangeeventlistener/enabled = ?, cq/dam/scene7/damchangeeventlistener/observed/paths = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_pro'
--
DELETE FROM com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_pro WHERE 1=2;

