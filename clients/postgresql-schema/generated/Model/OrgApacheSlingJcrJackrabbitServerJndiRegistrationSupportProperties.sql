--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_jcr_jackrabbit_server_jndi_registration_suppor'
--
SELECT java/naming/factory/initial, java/naming/provider/url FROM org_apache_sling_jcr_jackrabbit_server_jndi_registration_suppor WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_jcr_jackrabbit_server_jndi_registration_suppor'
--
INSERT INTO org_apache_sling_jcr_jackrabbit_server_jndi_registration_suppor (java/naming/factory/initial, java/naming/provider/url) VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_sling_jcr_jackrabbit_server_jndi_registration_suppor'
--
UPDATE org_apache_sling_jcr_jackrabbit_server_jndi_registration_suppor SET java/naming/factory/initial = ?, java/naming/provider/url = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_jcr_jackrabbit_server_jndi_registration_suppor'
--
DELETE FROM org_apache_sling_jcr_jackrabbit_server_jndi_registration_suppor WHERE 1=2;

