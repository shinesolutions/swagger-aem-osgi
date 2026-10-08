--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingJcrDavexImplServletsSlingDavExServletInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_i'
--
SELECT pid, title, description, properties FROM org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_i WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_i'
--
INSERT INTO org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_i (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_i'
--
UPDATE org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_i SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_i'
--
DELETE FROM org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_i WHERE 1=2;

