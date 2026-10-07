--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_segment_segment_node_store_factory_pr'
--
SELECT repository/home, tarmk/mode, tarmk/size, segment_cache/size, string_cache/size, template_cache/size, string_deduplication_cache/size, template_deduplication_cache/size, node_deduplication_cache/size, pause_compaction, compaction/retry_count, compaction/force/timeout, compaction/size_delta_estimation, compaction/disable_estimation, compaction/retained_generations, compaction/memory_threshold, compaction/progress_log, standby, custom_blob_store, custom_segment_store, split_persistence, repository/backup/dir, blob_gc_max_age_in_secs, blob_track_snapshot_interval_in_secs, "role", register_descriptors, dispatch_changes FROM org_apache_jackrabbit_oak_segment_segment_node_store_factory_pr WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_segment_segment_node_store_factory_pr'
--
INSERT INTO org_apache_jackrabbit_oak_segment_segment_node_store_factory_pr (repository/home, tarmk/mode, tarmk/size, segment_cache/size, string_cache/size, template_cache/size, string_deduplication_cache/size, template_deduplication_cache/size, node_deduplication_cache/size, pause_compaction, compaction/retry_count, compaction/force/timeout, compaction/size_delta_estimation, compaction/disable_estimation, compaction/retained_generations, compaction/memory_threshold, compaction/progress_log, standby, custom_blob_store, custom_segment_store, split_persistence, repository/backup/dir, blob_gc_max_age_in_secs, blob_track_snapshot_interval_in_secs, "role", register_descriptors, dispatch_changes) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_segment_segment_node_store_factory_pr'
--
UPDATE org_apache_jackrabbit_oak_segment_segment_node_store_factory_pr SET repository/home = ?, tarmk/mode = ?, tarmk/size = ?, segment_cache/size = ?, string_cache/size = ?, template_cache/size = ?, string_deduplication_cache/size = ?, template_deduplication_cache/size = ?, node_deduplication_cache/size = ?, pause_compaction = ?, compaction/retry_count = ?, compaction/force/timeout = ?, compaction/size_delta_estimation = ?, compaction/disable_estimation = ?, compaction/retained_generations = ?, compaction/memory_threshold = ?, compaction/progress_log = ?, standby = ?, custom_blob_store = ?, custom_segment_store = ?, split_persistence = ?, repository/backup/dir = ?, blob_gc_max_age_in_secs = ?, blob_track_snapshot_interval_in_secs = ?, "role" = ?, register_descriptors = ?, dispatch_changes = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_segment_segment_node_store_factory_pr'
--
DELETE FROM org_apache_jackrabbit_oak_segment_segment_node_store_factory_pr WHERE 1=2;

