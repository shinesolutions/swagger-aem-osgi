--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_security_internal_security_provider_r'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM org_apache_jackrabbit_oak_security_internal_security_provider_r WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_security_internal_security_provider_r'
--
INSERT INTO org_apache_jackrabbit_oak_security_internal_security_provider_r (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_security_internal_security_provider_r'
--
UPDATE org_apache_jackrabbit_oak_security_internal_security_provider_r SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_security_internal_security_provider_r'
--
DELETE FROM org_apache_jackrabbit_oak_security_internal_security_provider_r WHERE 1=2;

