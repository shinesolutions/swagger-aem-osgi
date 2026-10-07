--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingServletsGetDefaultGetServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_servlets_get_default_get_servlet_properties'
--
SELECT aliases, "index", index/files, enable/html, enable/json, enable/txt, enable/xml, json/maximumresults, ecma_suport FROM org_apache_sling_servlets_get_default_get_servlet_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_servlets_get_default_get_servlet_properties'
--
INSERT INTO org_apache_sling_servlets_get_default_get_servlet_properties (aliases, "index", index/files, enable/html, enable/json, enable/txt, enable/xml, json/maximumresults, ecma_suport) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_servlets_get_default_get_servlet_properties'
--
UPDATE org_apache_sling_servlets_get_default_get_servlet_properties SET aliases = ?, "index" = ?, index/files = ?, enable/html = ?, enable/json = ?, enable/txt = ?, enable/xml = ?, json/maximumresults = ?, ecma_suport = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_servlets_get_default_get_servlet_properties'
--
DELETE FROM org_apache_sling_servlets_get_default_get_servlet_properties WHERE 1=2;

