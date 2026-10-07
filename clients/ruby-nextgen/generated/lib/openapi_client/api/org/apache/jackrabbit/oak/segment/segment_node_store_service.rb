# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakSegmentSegmentNodeStoreService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, repository_home: nil, tarmk_mode: nil, tarmk_size: nil, segment_cache_size: nil, string_cache_size: nil, template_cache_size: nil, string_deduplication_cache_size: nil, template_deduplication_cache_size: nil, node_deduplication_cache_size: nil, pause_compaction: nil, compaction_retry_count: nil, compaction_force_timeout: nil, compaction_size_delta_estimation: nil, compaction_disable_estimation: nil, compaction_retained_generations: nil, compaction_memory_threshold: nil, compaction_progress_log: nil, standby: nil, custom_blob_store: nil, custom_segment_store: nil, split_persistence: nil, repository_backup_dir: nil, blob_gc_max_age_in_secs: nil, blob_track_snapshot_interval_in_secs: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreService',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'repository.home' => repository_home, 'tarmk.mode' => tarmk_mode, 'tarmk.size' => tarmk_size, 'segmentCache.size' => segment_cache_size, 'stringCache.size' => string_cache_size, 'templateCache.size' => template_cache_size, 'stringDeduplicationCache.size' => string_deduplication_cache_size, 'templateDeduplicationCache.size' => template_deduplication_cache_size, 'nodeDeduplicationCache.size' => node_deduplication_cache_size, 'pauseCompaction' => pause_compaction, 'compaction.retryCount' => compaction_retry_count, 'compaction.force.timeout' => compaction_force_timeout, 'compaction.sizeDeltaEstimation' => compaction_size_delta_estimation, 'compaction.disableEstimation' => compaction_disable_estimation, 'compaction.retainedGenerations' => compaction_retained_generations, 'compaction.memoryThreshold' => compaction_memory_threshold, 'compaction.progressLog' => compaction_progress_log, 'standby' => standby, 'customBlobStore' => custom_blob_store, 'customSegmentStore' => custom_segment_store, 'splitPersistence' => split_persistence, 'repository.backup.dir' => repository_backup_dir, 'blobGcMaxAgeInSecs' => blob_gc_max_age_in_secs, 'blobTrackSnapshotIntervalInSecs' => blob_track_snapshot_interval_in_secs }
        )
      end
    end
  end
end
