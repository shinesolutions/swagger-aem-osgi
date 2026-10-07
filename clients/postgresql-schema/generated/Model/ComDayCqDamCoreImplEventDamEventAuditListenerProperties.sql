--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplEventDamEventAuditListenerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_event_dam_event_audit_listener_propert'
--
SELECT event/filter, enabled FROM com_day_cq_dam_core_impl_event_dam_event_audit_listener_propert WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_event_dam_event_audit_listener_propert'
--
INSERT INTO com_day_cq_dam_core_impl_event_dam_event_audit_listener_propert (event/filter, enabled) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_event_dam_event_audit_listener_propert'
--
UPDATE com_day_cq_dam_core_impl_event_dam_event_audit_listener_propert SET event/filter = ?, enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_event_dam_event_audit_listener_propert'
--
DELETE FROM com_day_cq_dam_core_impl_event_dam_event_audit_listener_propert WHERE 1=2;

