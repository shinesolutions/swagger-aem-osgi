--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_scene7_impl_scene7_configuration_event_listener_'
--
SELECT cq/dam/scene7/configurationeventlistener/enabled FROM com_day_cq_dam_scene7_impl_scene7_configuration_event_listener_ WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_scene7_impl_scene7_configuration_event_listener_'
--
INSERT INTO com_day_cq_dam_scene7_impl_scene7_configuration_event_listener_ (cq/dam/scene7/configurationeventlistener/enabled) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_dam_scene7_impl_scene7_configuration_event_listener_'
--
UPDATE com_day_cq_dam_scene7_impl_scene7_configuration_event_listener_ SET cq/dam/scene7/configurationeventlistener/enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_scene7_impl_scene7_configuration_event_listener_'
--
DELETE FROM com_day_cq_dam_scene7_impl_scene7_configuration_event_listener_ WHERE 1=2;

