--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_security_authentication_authenticatio'
--
SELECT org/apache/jackrabbit/oak/authentication/app_name, org/apache/jackrabbit/oak/authentication/config_spi_name FROM org_apache_jackrabbit_oak_security_authentication_authenticatio WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_security_authentication_authenticatio'
--
INSERT INTO org_apache_jackrabbit_oak_security_authentication_authenticatio (org/apache/jackrabbit/oak/authentication/app_name, org/apache/jackrabbit/oak/authentication/config_spi_name) VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_security_authentication_authenticatio'
--
UPDATE org_apache_jackrabbit_oak_security_authentication_authenticatio SET org/apache/jackrabbit/oak/authentication/app_name = ?, org/apache/jackrabbit/oak/authentication/config_spi_name = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_security_authentication_authenticatio'
--
DELETE FROM org_apache_jackrabbit_oak_security_authentication_authenticatio WHERE 1=2;

