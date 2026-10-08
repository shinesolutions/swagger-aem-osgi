--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_plugins_document_document_node_store_'
--
SELECT mongouri, "db", socket_keep_alive, "cache", node_cache_percentage, prev_doc_cache_percentage, children_cache_percentage, diff_cache_percentage, cache_segment_count, cache_stack_move_distance, blob_cache_size, persistent_cache, journal_cache, custom_blob_store, journal_gc_interval, journal_gc_max_age, prefetch_external_changes, "role", version_gc_max_age_in_secs, version_gc_expression, version_gc_time_limit_in_secs, blob_gc_max_age_in_secs, blob_track_snapshot_interval_in_secs, repository/home, max_replication_lag_in_secs, document_store_type, bundling_disabled, update_limit, persistent_cache_includes, lease_check_mode FROM org_apache_jackrabbit_oak_plugins_document_document_node_store_ WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_plugins_document_document_node_store_'
--
INSERT INTO org_apache_jackrabbit_oak_plugins_document_document_node_store_ (mongouri, "db", socket_keep_alive, "cache", node_cache_percentage, prev_doc_cache_percentage, children_cache_percentage, diff_cache_percentage, cache_segment_count, cache_stack_move_distance, blob_cache_size, persistent_cache, journal_cache, custom_blob_store, journal_gc_interval, journal_gc_max_age, prefetch_external_changes, "role", version_gc_max_age_in_secs, version_gc_expression, version_gc_time_limit_in_secs, blob_gc_max_age_in_secs, blob_track_snapshot_interval_in_secs, repository/home, max_replication_lag_in_secs, document_store_type, bundling_disabled, update_limit, persistent_cache_includes, lease_check_mode) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_plugins_document_document_node_store_'
--
UPDATE org_apache_jackrabbit_oak_plugins_document_document_node_store_ SET mongouri = ?, "db" = ?, socket_keep_alive = ?, "cache" = ?, node_cache_percentage = ?, prev_doc_cache_percentage = ?, children_cache_percentage = ?, diff_cache_percentage = ?, cache_segment_count = ?, cache_stack_move_distance = ?, blob_cache_size = ?, persistent_cache = ?, journal_cache = ?, custom_blob_store = ?, journal_gc_interval = ?, journal_gc_max_age = ?, prefetch_external_changes = ?, "role" = ?, version_gc_max_age_in_secs = ?, version_gc_expression = ?, version_gc_time_limit_in_secs = ?, blob_gc_max_age_in_secs = ?, blob_track_snapshot_interval_in_secs = ?, repository/home = ?, max_replication_lag_in_secs = ?, document_store_type = ?, bundling_disabled = ?, update_limit = ?, persistent_cache_includes = ?, lease_check_mode = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_plugins_document_document_node_store_'
--
DELETE FROM org_apache_jackrabbit_oak_plugins_document_document_node_store_ WHERE 1=2;

