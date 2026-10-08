--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamS7damCommonS7damDamChangeEventListenerInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_inf'
--
SELECT pid, title, description, properties FROM com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_inf WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_inf'
--
INSERT INTO com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_inf (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_inf'
--
UPDATE com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_inf SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_inf'
--
DELETE FROM com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_inf WHERE 1=2;

