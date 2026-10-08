--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_conf'
--
SELECT path/desc/field, path/child/field, path/parent/field, path/exact/field, catch/all/field, collapsed/path/field, path/depth/field, commit/policy, "rows", path/restrictions, property/restrictions, primarytypes/restrictions, ignored/properties, used/properties, type/mappings, property/mappings, collapse/jcrcontent/nodes FROM org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_conf WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_conf'
--
INSERT INTO org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_conf (path/desc/field, path/child/field, path/parent/field, path/exact/field, catch/all/field, collapsed/path/field, path/depth/field, commit/policy, "rows", path/restrictions, property/restrictions, primarytypes/restrictions, ignored/properties, used/properties, type/mappings, property/mappings, collapse/jcrcontent/nodes) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_conf'
--
UPDATE org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_conf SET path/desc/field = ?, path/child/field = ?, path/parent/field = ?, path/exact/field = ?, catch/all/field = ?, collapsed/path/field = ?, path/depth/field = ?, commit/policy = ?, "rows" = ?, path/restrictions = ?, property/restrictions = ?, primarytypes/restrictions = ?, ignored/properties = ?, used/properties = ?, type/mappings = ?, property/mappings = ?, collapse/jcrcontent/nodes = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_conf'
--
DELETE FROM org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_conf WHERE 1=2;

