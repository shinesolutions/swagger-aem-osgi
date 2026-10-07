--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_spi_security_authentication_external_'
--
SELECT jaas/ranking, jaas/control_flag, jaas/realm_name, idp/name, sync/handler_name FROM org_apache_jackrabbit_oak_spi_security_authentication_external_ WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_spi_security_authentication_external_'
--
INSERT INTO org_apache_jackrabbit_oak_spi_security_authentication_external_ (jaas/ranking, jaas/control_flag, jaas/realm_name, idp/name, sync/handler_name) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_spi_security_authentication_external_'
--
UPDATE org_apache_jackrabbit_oak_spi_security_authentication_external_ SET jaas/ranking = ?, jaas/control_flag = ?, jaas/realm_name = ?, idp/name = ?, sync/handler_name = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_spi_security_authentication_external_'
--
DELETE FROM org_apache_jackrabbit_oak_spi_security_authentication_external_ WHERE 1=2;

