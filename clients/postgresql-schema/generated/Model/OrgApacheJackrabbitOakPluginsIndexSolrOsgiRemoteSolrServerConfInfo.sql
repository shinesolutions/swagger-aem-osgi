--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_s'
--
SELECT pid, title, description, properties FROM org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_s WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_s'
--
INSERT INTO org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_s (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_s'
--
UPDATE org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_s SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_s'
--
DELETE FROM org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_s WHERE 1=2;

