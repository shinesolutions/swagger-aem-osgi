# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, mongouri: nil, db: nil, socket_keep_alive: nil, cache: nil, node_cache_percentage: nil, prev_doc_cache_percentage: nil, children_cache_percentage: nil, diff_cache_percentage: nil, cache_segment_count: nil, cache_stack_move_distance: nil, blob_cache_size: nil, persistent_cache: nil, journal_cache: nil, custom_blob_store: nil, journal_gc_interval: nil, journal_gc_max_age: nil, prefetch_external_changes: nil, role: nil, version_gc_max_age_in_secs: nil, version_gc_expression: nil, version_gc_time_limit_in_secs: nil, blob_gc_max_age_in_secs: nil, blob_track_snapshot_interval_in_secs: nil, repository_home: nil, max_replication_lag_in_secs: nil, document_store_type: nil, bundling_disabled: nil, update_limit: nil, persistent_cache_includes: nil, lease_check_mode: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreService',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreHfbf818a3,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'mongouri' => mongouri, 'db' => db, 'socketKeepAlive' => socket_keep_alive, 'cache' => cache, 'nodeCachePercentage' => node_cache_percentage, 'prevDocCachePercentage' => prev_doc_cache_percentage, 'childrenCachePercentage' => children_cache_percentage, 'diffCachePercentage' => diff_cache_percentage, 'cacheSegmentCount' => cache_segment_count, 'cacheStackMoveDistance' => cache_stack_move_distance, 'blobCacheSize' => blob_cache_size, 'persistentCache' => persistent_cache, 'journalCache' => journal_cache, 'customBlobStore' => custom_blob_store, 'journalGCInterval' => journal_gc_interval, 'journalGCMaxAge' => journal_gc_max_age, 'prefetchExternalChanges' => prefetch_external_changes, 'role' => role, 'versionGcMaxAgeInSecs' => version_gc_max_age_in_secs, 'versionGCExpression' => version_gc_expression, 'versionGCTimeLimitInSecs' => version_gc_time_limit_in_secs, 'blobGcMaxAgeInSecs' => blob_gc_max_age_in_secs, 'blobTrackSnapshotIntervalInSecs' => blob_track_snapshot_interval_in_secs, 'repository.home' => repository_home, 'maxReplicationLagInSecs' => max_replication_lag_in_secs, 'documentStoreType' => document_store_type, 'bundlingDisabled' => bundling_disabled, 'updateLimit' => update_limit, 'persistentCacheIncludes' => persistent_cache_includes, 'leaseCheckMode' => lease_check_mode }
        )
      end
    end
  end
end
