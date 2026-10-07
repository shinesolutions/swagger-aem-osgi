--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmMsmImplServletsAuditLogServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties'
--
SELECT auditlogservlet/default/events/count, auditlogservlet/default/path FROM com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties'
--
INSERT INTO com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties (auditlogservlet/default/events/count, auditlogservlet/default/path) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties'
--
UPDATE com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties SET auditlogservlet/default/events/count = ?, auditlogservlet/default/path = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties'
--
DELETE FROM com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_properties WHERE 1=2;

