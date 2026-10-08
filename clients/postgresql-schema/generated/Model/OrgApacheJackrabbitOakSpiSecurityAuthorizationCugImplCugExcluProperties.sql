--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_c'
--
SELECT principal_names FROM org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_c WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_c'
--
INSERT INTO org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_c (principal_names) VALUES (?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_c'
--
UPDATE org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_c SET principal_names = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_c'
--
DELETE FROM org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_c WHERE 1=2;

