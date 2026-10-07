--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_segment_segment_node_store_monitor_se'
--
SELECT commits_tracker_writer_groups FROM org_apache_jackrabbit_oak_segment_segment_node_store_monitor_se WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_segment_segment_node_store_monitor_se'
--
INSERT INTO org_apache_jackrabbit_oak_segment_segment_node_store_monitor_se (commits_tracker_writer_groups) VALUES (?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_segment_segment_node_store_monitor_se'
--
UPDATE org_apache_jackrabbit_oak_segment_segment_node_store_monitor_se SET commits_tracker_writer_groups = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_segment_segment_node_store_monitor_se'
--
DELETE FROM org_apache_jackrabbit_oak_segment_segment_node_store_monitor_se WHERE 1=2;

