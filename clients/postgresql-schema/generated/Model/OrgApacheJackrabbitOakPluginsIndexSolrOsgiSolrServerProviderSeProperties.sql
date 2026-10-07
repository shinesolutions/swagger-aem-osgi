--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_p'
--
SELECT server/type FROM org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_p WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_p'
--
INSERT INTO org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_p (server/type) VALUES (?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_p'
--
UPDATE org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_p SET server/type = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_p'
--
DELETE FROM org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_p WHERE 1=2;

