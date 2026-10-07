--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingServletsGetImplVersionVersionInfoServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_servlets_get_impl_version_version_info_servlet'
--
SELECT sling/servlet/selectors, ecma_suport FROM org_apache_sling_servlets_get_impl_version_version_info_servlet WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_servlets_get_impl_version_version_info_servlet'
--
INSERT INTO org_apache_sling_servlets_get_impl_version_version_info_servlet (sling/servlet/selectors, ecma_suport) VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_sling_servlets_get_impl_version_version_info_servlet'
--
UPDATE org_apache_sling_servlets_get_impl_version_version_info_servlet SET sling/servlet/selectors = ?, ecma_suport = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_servlets_get_impl_version_version_info_servlet'
--
DELETE FROM org_apache_sling_servlets_get_impl_version_version_info_servlet WHERE 1=2;

