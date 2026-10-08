# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, disabled: nil, debug: nil, local_index_dir: nil, enable_open_index_async: nil, thread_pool_size: nil, prefetch_index_files: nil, extracted_text_cache_size_in_mb: nil, extracted_text_cache_expiry_in_secs: nil, always_use_pre_extracted_cache: nil, boolean_clause_limit: nil, enable_hybrid_indexing: nil, hybrid_queue_size: nil, disable_stored_index_definition: nil, deleted_blobs_collection_enabled: nil, prop_index_cleaner_interval_in_secs: nil, enable_single_blob_index_files: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.lucene.LuceneIndexProviderService',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexPrH1f8b5a42,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'disabled' => disabled, 'debug' => debug, 'localIndexDir' => local_index_dir, 'enableOpenIndexAsync' => enable_open_index_async, 'threadPoolSize' => thread_pool_size, 'prefetchIndexFiles' => prefetch_index_files, 'extractedTextCacheSizeInMB' => extracted_text_cache_size_in_mb, 'extractedTextCacheExpiryInSecs' => extracted_text_cache_expiry_in_secs, 'alwaysUsePreExtractedCache' => always_use_pre_extracted_cache, 'booleanClauseLimit' => boolean_clause_limit, 'enableHybridIndexing' => enable_hybrid_indexing, 'hybridQueueSize' => hybrid_queue_size, 'disableStoredIndexDefinition' => disable_stored_index_definition, 'deletedBlobsCollectionEnabled' => deleted_blobs_collection_enabled, 'propIndexCleanerIntervalInSecs' => prop_index_cleaner_interval_in_secs, 'enableSingleBlobIndexFiles' => enable_single_blob_index_files }
        )
      end
    end
  end
end
