--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_pro'
--
SELECT disabled, debug, local_index_dir, enable_open_index_async, thread_pool_size, prefetch_index_files, extracted_text_cache_size_in_mb, extracted_text_cache_expiry_in_secs, always_use_pre_extracted_cache, boolean_clause_limit, enable_hybrid_indexing, hybrid_queue_size, disable_stored_index_definition, deleted_blobs_collection_enabled, prop_index_cleaner_interval_in_secs, enable_single_blob_index_files FROM org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_pro WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_pro'
--
INSERT INTO org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_pro (disabled, debug, local_index_dir, enable_open_index_async, thread_pool_size, prefetch_index_files, extracted_text_cache_size_in_mb, extracted_text_cache_expiry_in_secs, always_use_pre_extracted_cache, boolean_clause_limit, enable_hybrid_indexing, hybrid_queue_size, disable_stored_index_definition, deleted_blobs_collection_enabled, prop_index_cleaner_interval_in_secs, enable_single_blob_index_files) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_pro'
--
UPDATE org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_pro SET disabled = ?, debug = ?, local_index_dir = ?, enable_open_index_async = ?, thread_pool_size = ?, prefetch_index_files = ?, extracted_text_cache_size_in_mb = ?, extracted_text_cache_expiry_in_secs = ?, always_use_pre_extracted_cache = ?, boolean_clause_limit = ?, enable_hybrid_indexing = ?, hybrid_queue_size = ?, disable_stored_index_definition = ?, deleted_blobs_collection_enabled = ?, prop_index_cleaner_interval_in_secs = ?, enable_single_blob_index_files = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_pro'
--
DELETE FROM org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_pro WHERE 1=2;

