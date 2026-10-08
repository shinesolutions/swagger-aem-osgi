--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_segment_segment_node_store_monitor_se'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM org_apache_jackrabbit_oak_segment_segment_node_store_monitor_se WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_segment_segment_node_store_monitor_se'
--
INSERT INTO org_apache_jackrabbit_oak_segment_segment_node_store_monitor_se (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_segment_segment_node_store_monitor_se'
--
UPDATE org_apache_jackrabbit_oak_segment_segment_node_store_monitor_se SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_segment_segment_node_store_monitor_se'
--
DELETE FROM org_apache_jackrabbit_oak_segment_segment_node_store_monitor_se WHERE 1=2;

