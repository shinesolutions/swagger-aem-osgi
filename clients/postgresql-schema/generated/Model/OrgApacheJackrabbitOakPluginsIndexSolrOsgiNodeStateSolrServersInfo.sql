--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_so'
--
SELECT pid, title, description, properties FROM org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_so WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_so'
--
INSERT INTO org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_so (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_so'
--
UPDATE org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_so SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_so'
--
DELETE FROM org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_so WHERE 1=2;

