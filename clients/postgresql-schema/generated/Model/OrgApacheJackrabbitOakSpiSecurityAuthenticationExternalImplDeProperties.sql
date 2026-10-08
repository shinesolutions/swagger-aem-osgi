--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_spi_security_authentication_external_'
--
SELECT handler/name, user/expiration_time, user/auto_membership, user/property_mapping, user/path_prefix, user/membership_exp_time, user/membership_nesting_depth, user/dynamic_membership, user/disable_missing, group/expiration_time, group/auto_membership, group/property_mapping, group/path_prefix, enable_rfc7613_usercase_mapped_profile FROM org_apache_jackrabbit_oak_spi_security_authentication_external_ WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_spi_security_authentication_external_'
--
INSERT INTO org_apache_jackrabbit_oak_spi_security_authentication_external_ (handler/name, user/expiration_time, user/auto_membership, user/property_mapping, user/path_prefix, user/membership_exp_time, user/membership_nesting_depth, user/dynamic_membership, user/disable_missing, group/expiration_time, group/auto_membership, group/property_mapping, group/path_prefix, enable_rfc7613_usercase_mapped_profile) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_spi_security_authentication_external_'
--
UPDATE org_apache_jackrabbit_oak_spi_security_authentication_external_ SET handler/name = ?, user/expiration_time = ?, user/auto_membership = ?, user/property_mapping = ?, user/path_prefix = ?, user/membership_exp_time = ?, user/membership_nesting_depth = ?, user/dynamic_membership = ?, user/disable_missing = ?, group/expiration_time = ?, group/auto_membership = ?, group/property_mapping = ?, group/path_prefix = ?, enable_rfc7613_usercase_mapped_profile = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_spi_security_authentication_external_'
--
DELETE FROM org_apache_jackrabbit_oak_spi_security_authentication_external_ WHERE 1=2;

