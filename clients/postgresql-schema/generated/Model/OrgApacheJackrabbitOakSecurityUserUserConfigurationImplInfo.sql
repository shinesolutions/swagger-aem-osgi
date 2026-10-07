--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_security_user_user_configuration_impl'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM org_apache_jackrabbit_oak_security_user_user_configuration_impl WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_security_user_user_configuration_impl'
--
INSERT INTO org_apache_jackrabbit_oak_security_user_user_configuration_impl (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_security_user_user_configuration_impl'
--
UPDATE org_apache_jackrabbit_oak_security_user_user_configuration_impl SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_security_user_user_configuration_impl'
--
DELETE FROM org_apache_jackrabbit_oak_security_user_user_configuration_impl WHERE 1=2;

