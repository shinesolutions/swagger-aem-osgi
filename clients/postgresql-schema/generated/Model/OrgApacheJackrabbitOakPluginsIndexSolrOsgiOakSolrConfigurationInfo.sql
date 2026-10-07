--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_conf'
--
SELECT pid, title, description, properties FROM org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_conf WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_conf'
--
INSERT INTO org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_conf (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_conf'
--
UPDATE org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_conf SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_conf'
--
DELETE FROM org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_conf WHERE 1=2;

