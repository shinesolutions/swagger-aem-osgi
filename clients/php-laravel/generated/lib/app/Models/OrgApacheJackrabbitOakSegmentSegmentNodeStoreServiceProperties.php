<?php
/**
 * OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties
 */
namespace app\Models;

/**
 * OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties
 */
class OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties {

    /** @var \app\Models\ConfigNodePropertyString $repository_home */
    private $repository_home;

    /** @var \app\Models\ConfigNodePropertyString $tarmk_mode */
    private $tarmk_mode;

    /** @var \app\Models\ConfigNodePropertyInteger $tarmk_size */
    private $tarmk_size;

    /** @var \app\Models\ConfigNodePropertyInteger $segment_cache_size */
    private $segment_cache_size;

    /** @var \app\Models\ConfigNodePropertyInteger $string_cache_size */
    private $string_cache_size;

    /** @var \app\Models\ConfigNodePropertyInteger $template_cache_size */
    private $template_cache_size;

    /** @var \app\Models\ConfigNodePropertyInteger $string_deduplication_cache_size */
    private $string_deduplication_cache_size;

    /** @var \app\Models\ConfigNodePropertyInteger $template_deduplication_cache_size */
    private $template_deduplication_cache_size;

    /** @var \app\Models\ConfigNodePropertyInteger $node_deduplication_cache_size */
    private $node_deduplication_cache_size;

    /** @var \app\Models\ConfigNodePropertyBoolean $pause_compaction */
    private $pause_compaction;

    /** @var \app\Models\ConfigNodePropertyInteger $compaction_retry_count */
    private $compaction_retry_count;

    /** @var \app\Models\ConfigNodePropertyInteger $compaction_force_timeout */
    private $compaction_force_timeout;

    /** @var \app\Models\ConfigNodePropertyInteger $compaction_size_delta_estimation */
    private $compaction_size_delta_estimation;

    /** @var \app\Models\ConfigNodePropertyBoolean $compaction_disable_estimation */
    private $compaction_disable_estimation;

    /** @var \app\Models\ConfigNodePropertyInteger $compaction_retained_generations */
    private $compaction_retained_generations;

    /** @var \app\Models\ConfigNodePropertyInteger $compaction_memory_threshold */
    private $compaction_memory_threshold;

    /** @var \app\Models\ConfigNodePropertyInteger $compaction_progress_log */
    private $compaction_progress_log;

    /** @var \app\Models\ConfigNodePropertyBoolean $standby */
    private $standby;

    /** @var \app\Models\ConfigNodePropertyBoolean $custom_blob_store */
    private $custom_blob_store;

    /** @var \app\Models\ConfigNodePropertyBoolean $custom_segment_store */
    private $custom_segment_store;

    /** @var \app\Models\ConfigNodePropertyBoolean $split_persistence */
    private $split_persistence;

    /** @var \app\Models\ConfigNodePropertyString $repository_backup_dir */
    private $repository_backup_dir;

    /** @var \app\Models\ConfigNodePropertyInteger $blob_gc_max_age_in_secs */
    private $blob_gc_max_age_in_secs;

    /** @var \app\Models\ConfigNodePropertyInteger $blob_track_snapshot_interval_in_secs */
    private $blob_track_snapshot_interval_in_secs;

}
