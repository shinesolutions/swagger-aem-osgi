--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_security_authentication_token_token_c'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM org_apache_jackrabbit_oak_security_authentication_token_token_c WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_security_authentication_token_token_c'
--
INSERT INTO org_apache_jackrabbit_oak_security_authentication_token_token_c (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_security_authentication_token_token_c'
--
UPDATE org_apache_jackrabbit_oak_security_authentication_token_token_c SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_security_authentication_token_token_c'
--
DELETE FROM org_apache_jackrabbit_oak_security_authentication_token_token_c WHERE 1=2;

