<?php
/**
 * OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties
 */
namespace app\Models;

/**
 * OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties
 */
class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties {

    /** @var \app\Models\ConfigNodePropertyString $mongouri */
    private $mongouri;

    /** @var \app\Models\ConfigNodePropertyString $db */
    private $db;

    /** @var \app\Models\ConfigNodePropertyBoolean $socket_keep_alive */
    private $socket_keep_alive;

    /** @var \app\Models\ConfigNodePropertyInteger $cache */
    private $cache;

    /** @var \app\Models\ConfigNodePropertyInteger $node_cache_percentage */
    private $node_cache_percentage;

    /** @var \app\Models\ConfigNodePropertyInteger $prev_doc_cache_percentage */
    private $prev_doc_cache_percentage;

    /** @var \app\Models\ConfigNodePropertyInteger $children_cache_percentage */
    private $children_cache_percentage;

    /** @var \app\Models\ConfigNodePropertyInteger $diff_cache_percentage */
    private $diff_cache_percentage;

    /** @var \app\Models\ConfigNodePropertyInteger $cache_segment_count */
    private $cache_segment_count;

    /** @var \app\Models\ConfigNodePropertyInteger $cache_stack_move_distance */
    private $cache_stack_move_distance;

    /** @var \app\Models\ConfigNodePropertyInteger $blob_cache_size */
    private $blob_cache_size;

    /** @var \app\Models\ConfigNodePropertyString $persistent_cache */
    private $persistent_cache;

    /** @var \app\Models\ConfigNodePropertyString $journal_cache */
    private $journal_cache;

    /** @var \app\Models\ConfigNodePropertyBoolean $custom_blob_store */
    private $custom_blob_store;

    /** @var \app\Models\ConfigNodePropertyInteger $journal_gc_interval */
    private $journal_gc_interval;

    /** @var \app\Models\ConfigNodePropertyInteger $journal_gc_max_age */
    private $journal_gc_max_age;

    /** @var \app\Models\ConfigNodePropertyBoolean $prefetch_external_changes */
    private $prefetch_external_changes;

    /** @var \app\Models\ConfigNodePropertyString $role */
    private $role;

    /** @var \app\Models\ConfigNodePropertyInteger $version_gc_max_age_in_secs */
    private $version_gc_max_age_in_secs;

    /** @var \app\Models\ConfigNodePropertyString $version_gc_expression */
    private $version_gc_expression;

    /** @var \app\Models\ConfigNodePropertyInteger $version_gc_time_limit_in_secs */
    private $version_gc_time_limit_in_secs;

    /** @var \app\Models\ConfigNodePropertyInteger $blob_gc_max_age_in_secs */
    private $blob_gc_max_age_in_secs;

    /** @var \app\Models\ConfigNodePropertyInteger $blob_track_snapshot_interval_in_secs */
    private $blob_track_snapshot_interval_in_secs;

    /** @var \app\Models\ConfigNodePropertyString $repository_home */
    private $repository_home;

    /** @var \app\Models\ConfigNodePropertyInteger $max_replication_lag_in_secs */
    private $max_replication_lag_in_secs;

    /** @var \app\Models\ConfigNodePropertyDropDown $document_store_type */
    private $document_store_type;

    /** @var \app\Models\ConfigNodePropertyBoolean $bundling_disabled */
    private $bundling_disabled;

    /** @var \app\Models\ConfigNodePropertyInteger $update_limit */
    private $update_limit;

    /** @var \app\Models\ConfigNodePropertyArray $persistent_cache_includes */
    private $persistent_cache_includes;

    /** @var \app\Models\ConfigNodePropertyDropDown $lease_check_mode */
    private $lease_check_mode;

}
