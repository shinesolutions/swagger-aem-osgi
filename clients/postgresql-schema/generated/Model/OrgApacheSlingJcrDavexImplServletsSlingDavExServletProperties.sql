--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_p'
--
SELECT alias, dav/create_absolute_uri, dav/protectedhandlers FROM org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_p WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_p'
--
INSERT INTO org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_p (alias, dav/create_absolute_uri, dav/protectedhandlers) VALUES (?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_p'
--
UPDATE org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_p SET alias = ?, dav/create_absolute_uri = ?, dav/protectedhandlers = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_p'
--
DELETE FROM org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_p WHERE 1=2;

