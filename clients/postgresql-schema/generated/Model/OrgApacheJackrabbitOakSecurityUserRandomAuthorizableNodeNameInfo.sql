--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_security_user_random_authorizable_nod'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM org_apache_jackrabbit_oak_security_user_random_authorizable_nod WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_security_user_random_authorizable_nod'
--
INSERT INTO org_apache_jackrabbit_oak_security_user_random_authorizable_nod (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_security_user_random_authorizable_nod'
--
UPDATE org_apache_jackrabbit_oak_security_user_random_authorizable_nod SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_security_user_random_authorizable_nod'
--
DELETE FROM org_apache_jackrabbit_oak_security_user_random_authorizable_nod WHERE 1=2;

