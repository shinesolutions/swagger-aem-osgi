--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_segment_segment_node_store_factory_in'
--
SELECT pid, title, description, properties FROM org_apache_jackrabbit_oak_segment_segment_node_store_factory_in WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_segment_segment_node_store_factory_in'
--
INSERT INTO org_apache_jackrabbit_oak_segment_segment_node_store_factory_in (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_segment_segment_node_store_factory_in'
--
UPDATE org_apache_jackrabbit_oak_segment_segment_node_store_factory_in SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_segment_segment_node_store_factory_in'
--
DELETE FROM org_apache_jackrabbit_oak_segment_segment_node_store_factory_in WHERE 1=2;

