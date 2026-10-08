--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamS7damCommonS7damDamChangeEventListenerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_pro'
--
SELECT cq/dam/s7dam/damchangeeventlistener/enabled FROM com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_pro WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_pro'
--
INSERT INTO com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_pro (cq/dam/s7dam/damchangeeventlistener/enabled) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_pro'
--
UPDATE com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_pro SET cq/dam/s7dam/damchangeeventlistener/enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_pro'
--
DELETE FROM com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_pro WHERE 1=2;

