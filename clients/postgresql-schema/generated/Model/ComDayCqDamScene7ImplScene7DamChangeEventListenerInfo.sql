--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamScene7ImplScene7DamChangeEventListenerInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_inf'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_inf WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_inf'
--
INSERT INTO com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_inf (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_inf'
--
UPDATE com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_inf SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_inf'
--
DELETE FROM com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_inf WHERE 1=2;

