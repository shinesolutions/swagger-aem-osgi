--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingServletsResolverSlingServletResolverProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_servlets_resolver_sling_servlet_resolver_prope'
--
SELECT servletresolver/servlet_root, servletresolver/cache_size, servletresolver/paths, servletresolver/default_extensions FROM org_apache_sling_servlets_resolver_sling_servlet_resolver_prope WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_servlets_resolver_sling_servlet_resolver_prope'
--
INSERT INTO org_apache_sling_servlets_resolver_sling_servlet_resolver_prope (servletresolver/servlet_root, servletresolver/cache_size, servletresolver/paths, servletresolver/default_extensions) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_servlets_resolver_sling_servlet_resolver_prope'
--
UPDATE org_apache_sling_servlets_resolver_sling_servlet_resolver_prope SET servletresolver/servlet_root = ?, servletresolver/cache_size = ?, servletresolver/paths = ?, servletresolver/default_extensions = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_servlets_resolver_sling_servlet_resolver_prope'
--
DELETE FROM org_apache_sling_servlets_resolver_sling_servlet_resolver_prope WHERE 1=2;

