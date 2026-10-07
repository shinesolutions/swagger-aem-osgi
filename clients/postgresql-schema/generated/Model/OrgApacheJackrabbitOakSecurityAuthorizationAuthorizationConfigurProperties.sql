--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_security_authorization_authorization_'
--
SELECT permissions_jr2, import_behavior, read_paths, administrative_principals, configuration_ranking FROM org_apache_jackrabbit_oak_security_authorization_authorization_ WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_security_authorization_authorization_'
--
INSERT INTO org_apache_jackrabbit_oak_security_authorization_authorization_ (permissions_jr2, import_behavior, read_paths, administrative_principals, configuration_ranking) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_security_authorization_authorization_'
--
UPDATE org_apache_jackrabbit_oak_security_authorization_authorization_ SET permissions_jr2 = ?, import_behavior = ?, read_paths = ?, administrative_principals = ?, configuration_ranking = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_security_authorization_authorization_'
--
DELETE FROM org_apache_jackrabbit_oak_security_authorization_authorization_ WHERE 1=2;

