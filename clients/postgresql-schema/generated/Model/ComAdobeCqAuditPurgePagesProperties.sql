--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqAuditPurgePagesProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_audit_purge_pages_properties'
--
SELECT auditlog/rule/name, auditlog/rule/contentpath, auditlog/rule/minimumage, auditlog/rule/types FROM com_adobe_cq_audit_purge_pages_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_audit_purge_pages_properties'
--
INSERT INTO com_adobe_cq_audit_purge_pages_properties (auditlog/rule/name, auditlog/rule/contentpath, auditlog/rule/minimumage, auditlog/rule/types) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_audit_purge_pages_properties'
--
UPDATE com_adobe_cq_audit_purge_pages_properties SET auditlog/rule/name = ?, auditlog/rule/contentpath = ?, auditlog/rule/minimumage = ?, auditlog/rule/types = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_audit_purge_pages_properties'
--
DELETE FROM com_adobe_cq_audit_purge_pages_properties WHERE 1=2;

