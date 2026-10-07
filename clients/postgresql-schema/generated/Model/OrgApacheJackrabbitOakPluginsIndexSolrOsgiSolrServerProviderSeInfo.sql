--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_p'
--
SELECT pid, title, description, properties FROM org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_p WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_p'
--
INSERT INTO org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_p (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_p'
--
UPDATE org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_p SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_p'
--
DELETE FROM org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_p WHERE 1=2;

