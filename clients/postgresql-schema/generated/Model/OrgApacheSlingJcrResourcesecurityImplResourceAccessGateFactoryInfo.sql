--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate'
--
SELECT pid, title, description, properties FROM org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate'
--
INSERT INTO org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate'
--
UPDATE org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate'
--
DELETE FROM org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate WHERE 1=2;

