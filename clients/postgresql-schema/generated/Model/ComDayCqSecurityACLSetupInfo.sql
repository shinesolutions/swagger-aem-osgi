--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqSecurityACLSetupInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_security_acl_setup_info'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM com_day_cq_security_acl_setup_info WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_security_acl_setup_info'
--
INSERT INTO com_day_cq_security_acl_setup_info (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_security_acl_setup_info'
--
UPDATE com_day_cq_security_acl_setup_info SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_security_acl_setup_info'
--
DELETE FROM com_day_cq_security_acl_setup_info WHERE 1=2;

