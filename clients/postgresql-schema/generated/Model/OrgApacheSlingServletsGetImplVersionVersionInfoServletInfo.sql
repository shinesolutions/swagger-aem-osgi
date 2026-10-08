--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingServletsGetImplVersionVersionInfoServletInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_servlets_get_impl_version_version_info_servlet'
--
SELECT pid, title, description, properties FROM org_apache_sling_servlets_get_impl_version_version_info_servlet WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_servlets_get_impl_version_version_info_servlet'
--
INSERT INTO org_apache_sling_servlets_get_impl_version_version_info_servlet (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_servlets_get_impl_version_version_info_servlet'
--
UPDATE org_apache_sling_servlets_get_impl_version_version_info_servlet SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_servlets_get_impl_version_version_info_servlet'
--
DELETE FROM org_apache_sling_servlets_get_impl_version_version_info_servlet WHERE 1=2;

