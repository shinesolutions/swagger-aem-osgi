--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_security_authentication_token_token_c'
--
SELECT token_expiration, token_length, token_refresh, token_cleanup_threshold, password_hash_algorithm, password_hash_iterations, password_salt_size FROM org_apache_jackrabbit_oak_security_authentication_token_token_c WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_security_authentication_token_token_c'
--
INSERT INTO org_apache_jackrabbit_oak_security_authentication_token_token_c (token_expiration, token_length, token_refresh, token_cleanup_threshold, password_hash_algorithm, password_hash_iterations, password_salt_size) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_security_authentication_token_token_c'
--
UPDATE org_apache_jackrabbit_oak_security_authentication_token_token_c SET token_expiration = ?, token_length = ?, token_refresh = ?, token_cleanup_threshold = ?, password_hash_algorithm = ?, password_hash_iterations = ?, password_salt_size = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_security_authentication_token_token_c'
--
DELETE FROM org_apache_jackrabbit_oak_security_authentication_token_token_c WHERE 1=2;

