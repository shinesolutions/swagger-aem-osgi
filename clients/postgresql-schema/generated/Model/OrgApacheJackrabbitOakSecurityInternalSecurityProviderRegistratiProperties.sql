--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_security_internal_security_provider_r'
--
SELECT required_service_pids, authorization_composition_type FROM org_apache_jackrabbit_oak_security_internal_security_provider_r WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_security_internal_security_provider_r'
--
INSERT INTO org_apache_jackrabbit_oak_security_internal_security_provider_r (required_service_pids, authorization_composition_type) VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_security_internal_security_provider_r'
--
UPDATE org_apache_jackrabbit_oak_security_internal_security_provider_r SET required_service_pids = ?, authorization_composition_type = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_security_internal_security_provider_r'
--
DELETE FROM org_apache_jackrabbit_oak_security_internal_security_provider_r WHERE 1=2;

