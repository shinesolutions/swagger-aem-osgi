--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_spi_security_user_action_default_auth'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM org_apache_jackrabbit_oak_spi_security_user_action_default_auth WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_spi_security_user_action_default_auth'
--
INSERT INTO org_apache_jackrabbit_oak_spi_security_user_action_default_auth (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_spi_security_user_action_default_auth'
--
UPDATE org_apache_jackrabbit_oak_spi_security_user_action_default_auth SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_spi_security_user_action_default_auth'
--
DELETE FROM org_apache_jackrabbit_oak_spi_security_user_action_default_auth WHERE 1=2;

