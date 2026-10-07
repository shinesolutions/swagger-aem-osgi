--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplEventPageEventAuditListenerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_event_page_event_audit_listener_proper'
--
SELECT configured FROM com_day_cq_wcm_core_impl_event_page_event_audit_listener_proper WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_event_page_event_audit_listener_proper'
--
INSERT INTO com_day_cq_wcm_core_impl_event_page_event_audit_listener_proper (configured) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_event_page_event_audit_listener_proper'
--
UPDATE com_day_cq_wcm_core_impl_event_page_event_audit_listener_proper SET configured = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_event_page_event_audit_listener_proper'
--
DELETE FROM com_day_cq_wcm_core_impl_event_page_event_audit_listener_proper WHERE 1=2;

