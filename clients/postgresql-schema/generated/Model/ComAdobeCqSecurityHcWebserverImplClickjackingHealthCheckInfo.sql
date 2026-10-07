--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_security_hc_webserver_impl_clickjacking_health_che'
--
SELECT pid, title, description, properties FROM com_adobe_cq_security_hc_webserver_impl_clickjacking_health_che WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_security_hc_webserver_impl_clickjacking_health_che'
--
INSERT INTO com_adobe_cq_security_hc_webserver_impl_clickjacking_health_che (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_security_hc_webserver_impl_clickjacking_health_che'
--
UPDATE com_adobe_cq_security_hc_webserver_impl_clickjacking_health_che SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_security_hc_webserver_impl_clickjacking_health_che'
--
DELETE FROM com_adobe_cq_security_hc_webserver_impl_clickjacking_health_che WHERE 1=2;

