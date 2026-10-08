--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingServletsPostImplSlingPostServletInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_servlets_post_impl_sling_post_servlet_info'
--
SELECT pid, title, description, properties FROM org_apache_sling_servlets_post_impl_sling_post_servlet_info WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_servlets_post_impl_sling_post_servlet_info'
--
INSERT INTO org_apache_sling_servlets_post_impl_sling_post_servlet_info (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_servlets_post_impl_sling_post_servlet_info'
--
UPDATE org_apache_sling_servlets_post_impl_sling_post_servlet_info SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_servlets_post_impl_sling_post_servlet_info'
--
DELETE FROM org_apache_sling_servlets_post_impl_sling_post_servlet_info WHERE 1=2;

