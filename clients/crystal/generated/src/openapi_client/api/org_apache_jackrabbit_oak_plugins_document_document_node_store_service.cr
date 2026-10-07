require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, mongouri : String? = nil, db : String? = nil, socket_keep_alive : Bool? = nil, cache : Int32? = nil, node_cache_percentage : Int32? = nil, prev_doc_cache_percentage : Int32? = nil, children_cache_percentage : Int32? = nil, diff_cache_percentage : Int32? = nil, cache_segment_count : Int32? = nil, cache_stack_move_distance : Int32? = nil, blob_cache_size : Int32? = nil, persistent_cache : String? = nil, journal_cache : String? = nil, custom_blob_store : Bool? = nil, journal_gc_interval : Int32? = nil, journal_gc_max_age : Int32? = nil, prefetch_external_changes : Bool? = nil, role : String? = nil, version_gc_max_age_in_secs : Int32? = nil, version_gc_expression : String? = nil, version_gc_time_limit_in_secs : Int32? = nil, blob_gc_max_age_in_secs : Int32? = nil, blob_track_snapshot_interval_in_secs : Int32? = nil, repository_home : String? = nil, max_replication_lag_in_secs : Int32? = nil, document_store_type : String? = nil, bundling_disabled : Bool? = nil, update_limit : Int32? = nil, persistent_cache_includes : Array(String)? = nil, lease_check_mode : String? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "mongouri" => mongouri, "db" => db, "socketKeepAlive" => socket_keep_alive, "cache" => cache, "nodeCachePercentage" => node_cache_percentage, "prevDocCachePercentage" => prev_doc_cache_percentage, "childrenCachePercentage" => children_cache_percentage, "diffCachePercentage" => diff_cache_percentage, "cacheSegmentCount" => cache_segment_count, "cacheStackMoveDistance" => cache_stack_move_distance, "blobCacheSize" => blob_cache_size, "persistentCache" => persistent_cache, "journalCache" => journal_cache, "customBlobStore" => custom_blob_store, "journalGCInterval" => journal_gc_interval, "journalGCMaxAge" => journal_gc_max_age, "prefetchExternalChanges" => prefetch_external_changes, "role" => role, "versionGcMaxAgeInSecs" => version_gc_max_age_in_secs, "versionGCExpression" => version_gc_expression, "versionGCTimeLimitInSecs" => version_gc_time_limit_in_secs, "blobGcMaxAgeInSecs" => blob_gc_max_age_in_secs, "blobTrackSnapshotIntervalInSecs" => blob_track_snapshot_interval_in_secs, "repository.home" => repository_home, "maxReplicationLagInSecs" => max_replication_lag_in_secs, "documentStoreType" => document_store_type, "bundlingDisabled" => bundling_disabled, "updateLimit" => update_limit, "persistentCacheIncludes" => persistent_cache_includes, "leaseCheckMode" => lease_check_mode },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
