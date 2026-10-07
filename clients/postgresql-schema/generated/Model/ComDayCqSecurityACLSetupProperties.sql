--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqSecurityACLSetupProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_security_acl_setup_properties'
--
SELECT cq/aclsetup/rules FROM com_day_cq_security_acl_setup_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_security_acl_setup_properties'
--
INSERT INTO com_day_cq_security_acl_setup_properties (cq/aclsetup/rules) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_security_acl_setup_properties'
--
UPDATE com_day_cq_security_acl_setup_properties SET cq/aclsetup/rules = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_security_acl_setup_properties'
--
DELETE FROM com_day_cq_security_acl_setup_properties WHERE 1=2;

