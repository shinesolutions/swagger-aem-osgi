--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr'
--
SELECT pid, title, description, properties FROM org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr'
--
INSERT INTO org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr'
--
UPDATE org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr'
--
DELETE FROM org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr WHERE 1=2;

