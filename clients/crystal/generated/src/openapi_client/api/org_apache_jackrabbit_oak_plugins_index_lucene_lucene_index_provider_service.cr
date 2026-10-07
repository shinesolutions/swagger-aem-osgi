require "json"

module OpenAPIClient
  module Api
  class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderService
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, disabled : Bool? = nil, debug : Bool? = nil, local_index_dir : String? = nil, enable_open_index_async : Bool? = nil, thread_pool_size : Int32? = nil, prefetch_index_files : Bool? = nil, extracted_text_cache_size_in_mb : Int32? = nil, extracted_text_cache_expiry_in_secs : Int32? = nil, always_use_pre_extracted_cache : Bool? = nil, boolean_clause_limit : Int32? = nil, enable_hybrid_indexing : Bool? = nil, hybrid_queue_size : Int32? = nil, disable_stored_index_definition : Bool? = nil, deleted_blobs_collection_enabled : Bool? = nil, prop_index_cleaner_interval_in_secs : Int32? = nil, enable_single_blob_index_files : Bool? = nil) : Response(OpenAPIClient::OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo)
      @conn.request(OpenAPIClient::OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo,
        method: :POST,
        path: "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.lucene.LuceneIndexProviderService",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "disabled" => disabled, "debug" => debug, "localIndexDir" => local_index_dir, "enableOpenIndexAsync" => enable_open_index_async, "threadPoolSize" => thread_pool_size, "prefetchIndexFiles" => prefetch_index_files, "extractedTextCacheSizeInMB" => extracted_text_cache_size_in_mb, "extractedTextCacheExpiryInSecs" => extracted_text_cache_expiry_in_secs, "alwaysUsePreExtractedCache" => always_use_pre_extracted_cache, "booleanClauseLimit" => boolean_clause_limit, "enableHybridIndexing" => enable_hybrid_indexing, "hybridQueueSize" => hybrid_queue_size, "disableStoredIndexDefinition" => disable_stored_index_definition, "deletedBlobsCollectionEnabled" => deleted_blobs_collection_enabled, "propIndexCleanerIntervalInSecs" => prop_index_cleaner_interval_in_secs, "enableSingleBlobIndexFiles" => enable_single_blob_index_files },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
