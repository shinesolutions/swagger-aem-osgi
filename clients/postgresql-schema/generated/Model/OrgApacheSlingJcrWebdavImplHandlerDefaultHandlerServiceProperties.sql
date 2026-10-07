--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_jcr_webdav_impl_handler_default_handler_servic'
--
SELECT service/ranking, type/collections, type/noncollections, type/content FROM org_apache_sling_jcr_webdav_impl_handler_default_handler_servic WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_jcr_webdav_impl_handler_default_handler_servic'
--
INSERT INTO org_apache_sling_jcr_webdav_impl_handler_default_handler_servic (service/ranking, type/collections, type/noncollections, type/content) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_jcr_webdav_impl_handler_default_handler_servic'
--
UPDATE org_apache_sling_jcr_webdav_impl_handler_default_handler_servic SET service/ranking = ?, type/collections = ?, type/noncollections = ?, type/content = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_jcr_webdav_impl_handler_default_handler_servic'
--
DELETE FROM org_apache_sling_jcr_webdav_impl_handler_default_handler_servic WHERE 1=2;

