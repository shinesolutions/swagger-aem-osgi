--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_jcr_jackrabbit_server_rmi_registration_support'
--
SELECT pid, title, description, properties FROM org_apache_sling_jcr_jackrabbit_server_rmi_registration_support WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_jcr_jackrabbit_server_rmi_registration_support'
--
INSERT INTO org_apache_sling_jcr_jackrabbit_server_rmi_registration_support (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_jcr_jackrabbit_server_rmi_registration_support'
--
UPDATE org_apache_sling_jcr_jackrabbit_server_rmi_registration_support SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_jcr_jackrabbit_server_rmi_registration_support'
--
DELETE FROM org_apache_sling_jcr_jackrabbit_server_rmi_registration_support WHERE 1=2;

