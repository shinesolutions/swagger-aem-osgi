--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_security_authentication_authenticatio'
--
SELECT pid, title, description, properties FROM org_apache_jackrabbit_oak_security_authentication_authenticatio WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_security_authentication_authenticatio'
--
INSERT INTO org_apache_jackrabbit_oak_security_authentication_authenticatio (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_security_authentication_authenticatio'
--
UPDATE org_apache_jackrabbit_oak_security_authentication_authenticatio SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_security_authentication_authenticatio'
--
DELETE FROM org_apache_jackrabbit_oak_security_authentication_authenticatio WHERE 1=2;

