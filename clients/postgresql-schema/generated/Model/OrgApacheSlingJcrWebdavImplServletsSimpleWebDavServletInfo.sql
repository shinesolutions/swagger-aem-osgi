--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servle'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servle WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servle'
--
INSERT INTO org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servle (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servle'
--
UPDATE org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servle SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servle'
--
DELETE FROM org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servle WHERE 1=2;

