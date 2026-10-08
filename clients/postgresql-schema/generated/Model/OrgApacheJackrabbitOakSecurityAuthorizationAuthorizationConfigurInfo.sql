--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_security_authorization_authorization_'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM org_apache_jackrabbit_oak_security_authorization_authorization_ WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_security_authorization_authorization_'
--
INSERT INTO org_apache_jackrabbit_oak_security_authorization_authorization_ (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_security_authorization_authorization_'
--
UPDATE org_apache_jackrabbit_oak_security_authorization_authorization_ SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_security_authorization_authorization_'
--
DELETE FROM org_apache_jackrabbit_oak_security_authorization_authorization_ WHERE 1=2;

