require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactory
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, repository_home : String? = nil, tarmk_mode : String? = nil, tarmk_size : Int32? = nil, segment_cache_size : Int32? = nil, string_cache_size : Int32? = nil, template_cache_size : Int32? = nil, string_deduplication_cache_size : Int32? = nil, template_deduplication_cache_size : Int32? = nil, node_deduplication_cache_size : Int32? = nil, pause_compaction : Bool? = nil, compaction_retry_count : Int32? = nil, compaction_force_timeout : Int32? = nil, compaction_size_delta_estimation : Int32? = nil, compaction_disable_estimation : Bool? = nil, compaction_retained_generations : Int32? = nil, compaction_memory_threshold : Int32? = nil, compaction_progress_log : Int32? = nil, standby : Bool? = nil, custom_blob_store : Bool? = nil, custom_segment_store : Bool? = nil, split_persistence : Bool? = nil, repository_backup_dir : String? = nil, blob_gc_max_age_in_secs : Int32? = nil, blob_track_snapshot_interval_in_secs : Int32? = nil, role : String? = nil, register_descriptors : Bool? = nil, dispatch_changes : Bool? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreFactory",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "repository.home" => repository_home, "tarmk.mode" => tarmk_mode, "tarmk.size" => tarmk_size, "segmentCache.size" => segment_cache_size, "stringCache.size" => string_cache_size, "templateCache.size" => template_cache_size, "stringDeduplicationCache.size" => string_deduplication_cache_size, "templateDeduplicationCache.size" => template_deduplication_cache_size, "nodeDeduplicationCache.size" => node_deduplication_cache_size, "pauseCompaction" => pause_compaction, "compaction.retryCount" => compaction_retry_count, "compaction.force.timeout" => compaction_force_timeout, "compaction.sizeDeltaEstimation" => compaction_size_delta_estimation, "compaction.disableEstimation" => compaction_disable_estimation, "compaction.retainedGenerations" => compaction_retained_generations, "compaction.memoryThreshold" => compaction_memory_threshold, "compaction.progressLog" => compaction_progress_log, "standby" => standby, "customBlobStore" => custom_blob_store, "customSegmentStore" => custom_segment_store, "splitPersistence" => split_persistence, "repository.backup.dir" => repository_backup_dir, "blobGcMaxAgeInSecs" => blob_gc_max_age_in_secs, "blobTrackSnapshotIntervalInSecs" => blob_track_snapshot_interval_in_secs, "role" => role, "registerDescriptors" => register_descriptors, "dispatchChanges" => dispatch_changes },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
