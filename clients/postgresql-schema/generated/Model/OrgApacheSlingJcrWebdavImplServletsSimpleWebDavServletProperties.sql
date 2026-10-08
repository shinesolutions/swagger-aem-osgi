--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servle'
--
SELECT dav/root, dav/create_absolute_uri, dav/realm, collection/types, filter/prefixes, filter/types, filter/uris, type/collections, type/noncollections, type/content FROM org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servle WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servle'
--
INSERT INTO org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servle (dav/root, dav/create_absolute_uri, dav/realm, collection/types, filter/prefixes, filter/types, filter/uris, type/collections, type/noncollections, type/content) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servle'
--
UPDATE org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servle SET dav/root = ?, dav/create_absolute_uri = ?, dav/realm = ?, collection/types = ?, filter/prefixes = ?, filter/types = ?, filter/uris = ?, type/collections = ?, type/noncollections = ?, type/content = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servle'
--
DELETE FROM org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servle WHERE 1=2;

