#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties.h"



static org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_t *org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_create_internal(
    config_node_property_boolean_t *disabled,
    config_node_property_boolean_t *debug,
    config_node_property_string_t *local_index_dir,
    config_node_property_boolean_t *enable_open_index_async,
    config_node_property_integer_t *thread_pool_size,
    config_node_property_boolean_t *prefetch_index_files,
    config_node_property_integer_t *extracted_text_cache_size_in_mb,
    config_node_property_integer_t *extracted_text_cache_expiry_in_secs,
    config_node_property_boolean_t *always_use_pre_extracted_cache,
    config_node_property_integer_t *boolean_clause_limit,
    config_node_property_boolean_t *enable_hybrid_indexing,
    config_node_property_integer_t *hybrid_queue_size,
    config_node_property_boolean_t *disable_stored_index_definition,
    config_node_property_boolean_t *deleted_blobs_collection_enabled,
    config_node_property_integer_t *prop_index_cleaner_interval_in_secs,
    config_node_property_boolean_t *enable_single_blob_index_files
    ) {
    org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_t *org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_t));
    if (!org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_t));
    org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var->disabled = disabled;
    org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var->debug = debug;
    org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var->local_index_dir = local_index_dir;
    org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var->enable_open_index_async = enable_open_index_async;
    org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var->thread_pool_size = thread_pool_size;
    org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var->prefetch_index_files = prefetch_index_files;
    org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var->extracted_text_cache_size_in_mb = extracted_text_cache_size_in_mb;
    org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var->extracted_text_cache_expiry_in_secs = extracted_text_cache_expiry_in_secs;
    org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var->always_use_pre_extracted_cache = always_use_pre_extracted_cache;
    org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var->boolean_clause_limit = boolean_clause_limit;
    org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var->enable_hybrid_indexing = enable_hybrid_indexing;
    org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var->hybrid_queue_size = hybrid_queue_size;
    org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var->disable_stored_index_definition = disable_stored_index_definition;
    org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var->deleted_blobs_collection_enabled = deleted_blobs_collection_enabled;
    org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var->prop_index_cleaner_interval_in_secs = prop_index_cleaner_interval_in_secs;
    org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var->enable_single_blob_index_files = enable_single_blob_index_files;
    return org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_t *org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_create(
    config_node_property_boolean_t *disabled,
    config_node_property_boolean_t *debug,
    config_node_property_string_t *local_index_dir,
    config_node_property_boolean_t *enable_open_index_async,
    config_node_property_integer_t *thread_pool_size,
    config_node_property_boolean_t *prefetch_index_files,
    config_node_property_integer_t *extracted_text_cache_size_in_mb,
    config_node_property_integer_t *extracted_text_cache_expiry_in_secs,
    config_node_property_boolean_t *always_use_pre_extracted_cache,
    config_node_property_integer_t *boolean_clause_limit,
    config_node_property_boolean_t *enable_hybrid_indexing,
    config_node_property_integer_t *hybrid_queue_size,
    config_node_property_boolean_t *disable_stored_index_definition,
    config_node_property_boolean_t *deleted_blobs_collection_enabled,
    config_node_property_integer_t *prop_index_cleaner_interval_in_secs,
    config_node_property_boolean_t *enable_single_blob_index_files
    ) {
    org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_t *result = org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_create_internal (
        disabled,
        debug,
        local_index_dir,
        enable_open_index_async,
        thread_pool_size,
        prefetch_index_files,
        extracted_text_cache_size_in_mb,
        extracted_text_cache_expiry_in_secs,
        always_use_pre_extracted_cache,
        boolean_clause_limit,
        enable_hybrid_indexing,
        hybrid_queue_size,
        disable_stored_index_definition,
        deleted_blobs_collection_enabled,
        prop_index_cleaner_interval_in_secs,
        enable_single_blob_index_files
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_free(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_t *org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties) {
    if(NULL == org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->disabled) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->disabled);
        org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->disabled = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->debug) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->debug);
        org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->debug = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->local_index_dir) {
        config_node_property_string_free(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->local_index_dir);
        org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->local_index_dir = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_open_index_async) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_open_index_async);
        org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_open_index_async = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->thread_pool_size) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->thread_pool_size);
        org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->thread_pool_size = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->prefetch_index_files) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->prefetch_index_files);
        org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->prefetch_index_files = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->extracted_text_cache_size_in_mb) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->extracted_text_cache_size_in_mb);
        org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->extracted_text_cache_size_in_mb = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->extracted_text_cache_expiry_in_secs) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->extracted_text_cache_expiry_in_secs);
        org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->extracted_text_cache_expiry_in_secs = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->always_use_pre_extracted_cache) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->always_use_pre_extracted_cache);
        org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->always_use_pre_extracted_cache = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->boolean_clause_limit) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->boolean_clause_limit);
        org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->boolean_clause_limit = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_hybrid_indexing) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_hybrid_indexing);
        org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_hybrid_indexing = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->hybrid_queue_size) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->hybrid_queue_size);
        org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->hybrid_queue_size = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->disable_stored_index_definition) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->disable_stored_index_definition);
        org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->disable_stored_index_definition = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->deleted_blobs_collection_enabled) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->deleted_blobs_collection_enabled);
        org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->deleted_blobs_collection_enabled = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->prop_index_cleaner_interval_in_secs) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->prop_index_cleaner_interval_in_secs);
        org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->prop_index_cleaner_interval_in_secs = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_single_blob_index_files) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_single_blob_index_files);
        org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_single_blob_index_files = NULL;
    }
    free(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties);
}

cJSON *org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_convertToJSON(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_t *org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->disabled
    if(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->disabled) {
    cJSON *disabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->disabled);
    if(disabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "disabled", disabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->debug
    if(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->debug) {
    cJSON *debug_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->debug);
    if(debug_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "debug", debug_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->local_index_dir
    if(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->local_index_dir) {
    cJSON *local_index_dir_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->local_index_dir);
    if(local_index_dir_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "localIndexDir", local_index_dir_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_open_index_async
    if(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_open_index_async) {
    cJSON *enable_open_index_async_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_open_index_async);
    if(enable_open_index_async_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enableOpenIndexAsync", enable_open_index_async_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->thread_pool_size
    if(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->thread_pool_size) {
    cJSON *thread_pool_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->thread_pool_size);
    if(thread_pool_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "threadPoolSize", thread_pool_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->prefetch_index_files
    if(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->prefetch_index_files) {
    cJSON *prefetch_index_files_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->prefetch_index_files);
    if(prefetch_index_files_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "prefetchIndexFiles", prefetch_index_files_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->extracted_text_cache_size_in_mb
    if(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->extracted_text_cache_size_in_mb) {
    cJSON *extracted_text_cache_size_in_mb_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->extracted_text_cache_size_in_mb);
    if(extracted_text_cache_size_in_mb_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "extractedTextCacheSizeInMB", extracted_text_cache_size_in_mb_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->extracted_text_cache_expiry_in_secs
    if(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->extracted_text_cache_expiry_in_secs) {
    cJSON *extracted_text_cache_expiry_in_secs_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->extracted_text_cache_expiry_in_secs);
    if(extracted_text_cache_expiry_in_secs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "extractedTextCacheExpiryInSecs", extracted_text_cache_expiry_in_secs_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->always_use_pre_extracted_cache
    if(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->always_use_pre_extracted_cache) {
    cJSON *always_use_pre_extracted_cache_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->always_use_pre_extracted_cache);
    if(always_use_pre_extracted_cache_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "alwaysUsePreExtractedCache", always_use_pre_extracted_cache_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->boolean_clause_limit
    if(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->boolean_clause_limit) {
    cJSON *boolean_clause_limit_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->boolean_clause_limit);
    if(boolean_clause_limit_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "booleanClauseLimit", boolean_clause_limit_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_hybrid_indexing
    if(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_hybrid_indexing) {
    cJSON *enable_hybrid_indexing_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_hybrid_indexing);
    if(enable_hybrid_indexing_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enableHybridIndexing", enable_hybrid_indexing_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->hybrid_queue_size
    if(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->hybrid_queue_size) {
    cJSON *hybrid_queue_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->hybrid_queue_size);
    if(hybrid_queue_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hybridQueueSize", hybrid_queue_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->disable_stored_index_definition
    if(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->disable_stored_index_definition) {
    cJSON *disable_stored_index_definition_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->disable_stored_index_definition);
    if(disable_stored_index_definition_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "disableStoredIndexDefinition", disable_stored_index_definition_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->deleted_blobs_collection_enabled
    if(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->deleted_blobs_collection_enabled) {
    cJSON *deleted_blobs_collection_enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->deleted_blobs_collection_enabled);
    if(deleted_blobs_collection_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "deletedBlobsCollectionEnabled", deleted_blobs_collection_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->prop_index_cleaner_interval_in_secs
    if(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->prop_index_cleaner_interval_in_secs) {
    cJSON *prop_index_cleaner_interval_in_secs_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->prop_index_cleaner_interval_in_secs);
    if(prop_index_cleaner_interval_in_secs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "propIndexCleanerIntervalInSecs", prop_index_cleaner_interval_in_secs_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_single_blob_index_files
    if(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_single_blob_index_files) {
    cJSON *enable_single_blob_index_files_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_single_blob_index_files);
    if(enable_single_blob_index_files_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enableSingleBlobIndexFiles", enable_single_blob_index_files_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_t *org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_propertiesJSON){

    org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_t *org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->disabled
    config_node_property_boolean_t *disabled_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->debug
    config_node_property_boolean_t *debug_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->local_index_dir
    config_node_property_string_t *local_index_dir_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_open_index_async
    config_node_property_boolean_t *enable_open_index_async_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->thread_pool_size
    config_node_property_integer_t *thread_pool_size_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->prefetch_index_files
    config_node_property_boolean_t *prefetch_index_files_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->extracted_text_cache_size_in_mb
    config_node_property_integer_t *extracted_text_cache_size_in_mb_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->extracted_text_cache_expiry_in_secs
    config_node_property_integer_t *extracted_text_cache_expiry_in_secs_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->always_use_pre_extracted_cache
    config_node_property_boolean_t *always_use_pre_extracted_cache_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->boolean_clause_limit
    config_node_property_integer_t *boolean_clause_limit_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_hybrid_indexing
    config_node_property_boolean_t *enable_hybrid_indexing_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->hybrid_queue_size
    config_node_property_integer_t *hybrid_queue_size_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->disable_stored_index_definition
    config_node_property_boolean_t *disable_stored_index_definition_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->deleted_blobs_collection_enabled
    config_node_property_boolean_t *deleted_blobs_collection_enabled_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->prop_index_cleaner_interval_in_secs
    config_node_property_integer_t *prop_index_cleaner_interval_in_secs_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_single_blob_index_files
    config_node_property_boolean_t *enable_single_blob_index_files_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->disabled
    cJSON *disabled = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_propertiesJSON, "disabled");
    if (cJSON_IsNull(disabled)) {
        disabled = NULL;
    }
    if (disabled) { 
    disabled_local_nonprim = config_node_property_boolean_parseFromJSON(disabled); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->debug
    cJSON *debug = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_propertiesJSON, "debug");
    if (cJSON_IsNull(debug)) {
        debug = NULL;
    }
    if (debug) { 
    debug_local_nonprim = config_node_property_boolean_parseFromJSON(debug); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->local_index_dir
    cJSON *local_index_dir = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_propertiesJSON, "localIndexDir");
    if (cJSON_IsNull(local_index_dir)) {
        local_index_dir = NULL;
    }
    if (local_index_dir) { 
    local_index_dir_local_nonprim = config_node_property_string_parseFromJSON(local_index_dir); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_open_index_async
    cJSON *enable_open_index_async = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_propertiesJSON, "enableOpenIndexAsync");
    if (cJSON_IsNull(enable_open_index_async)) {
        enable_open_index_async = NULL;
    }
    if (enable_open_index_async) { 
    enable_open_index_async_local_nonprim = config_node_property_boolean_parseFromJSON(enable_open_index_async); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->thread_pool_size
    cJSON *thread_pool_size = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_propertiesJSON, "threadPoolSize");
    if (cJSON_IsNull(thread_pool_size)) {
        thread_pool_size = NULL;
    }
    if (thread_pool_size) { 
    thread_pool_size_local_nonprim = config_node_property_integer_parseFromJSON(thread_pool_size); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->prefetch_index_files
    cJSON *prefetch_index_files = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_propertiesJSON, "prefetchIndexFiles");
    if (cJSON_IsNull(prefetch_index_files)) {
        prefetch_index_files = NULL;
    }
    if (prefetch_index_files) { 
    prefetch_index_files_local_nonprim = config_node_property_boolean_parseFromJSON(prefetch_index_files); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->extracted_text_cache_size_in_mb
    cJSON *extracted_text_cache_size_in_mb = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_propertiesJSON, "extractedTextCacheSizeInMB");
    if (cJSON_IsNull(extracted_text_cache_size_in_mb)) {
        extracted_text_cache_size_in_mb = NULL;
    }
    if (extracted_text_cache_size_in_mb) { 
    extracted_text_cache_size_in_mb_local_nonprim = config_node_property_integer_parseFromJSON(extracted_text_cache_size_in_mb); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->extracted_text_cache_expiry_in_secs
    cJSON *extracted_text_cache_expiry_in_secs = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_propertiesJSON, "extractedTextCacheExpiryInSecs");
    if (cJSON_IsNull(extracted_text_cache_expiry_in_secs)) {
        extracted_text_cache_expiry_in_secs = NULL;
    }
    if (extracted_text_cache_expiry_in_secs) { 
    extracted_text_cache_expiry_in_secs_local_nonprim = config_node_property_integer_parseFromJSON(extracted_text_cache_expiry_in_secs); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->always_use_pre_extracted_cache
    cJSON *always_use_pre_extracted_cache = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_propertiesJSON, "alwaysUsePreExtractedCache");
    if (cJSON_IsNull(always_use_pre_extracted_cache)) {
        always_use_pre_extracted_cache = NULL;
    }
    if (always_use_pre_extracted_cache) { 
    always_use_pre_extracted_cache_local_nonprim = config_node_property_boolean_parseFromJSON(always_use_pre_extracted_cache); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->boolean_clause_limit
    cJSON *boolean_clause_limit = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_propertiesJSON, "booleanClauseLimit");
    if (cJSON_IsNull(boolean_clause_limit)) {
        boolean_clause_limit = NULL;
    }
    if (boolean_clause_limit) { 
    boolean_clause_limit_local_nonprim = config_node_property_integer_parseFromJSON(boolean_clause_limit); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_hybrid_indexing
    cJSON *enable_hybrid_indexing = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_propertiesJSON, "enableHybridIndexing");
    if (cJSON_IsNull(enable_hybrid_indexing)) {
        enable_hybrid_indexing = NULL;
    }
    if (enable_hybrid_indexing) { 
    enable_hybrid_indexing_local_nonprim = config_node_property_boolean_parseFromJSON(enable_hybrid_indexing); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->hybrid_queue_size
    cJSON *hybrid_queue_size = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_propertiesJSON, "hybridQueueSize");
    if (cJSON_IsNull(hybrid_queue_size)) {
        hybrid_queue_size = NULL;
    }
    if (hybrid_queue_size) { 
    hybrid_queue_size_local_nonprim = config_node_property_integer_parseFromJSON(hybrid_queue_size); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->disable_stored_index_definition
    cJSON *disable_stored_index_definition = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_propertiesJSON, "disableStoredIndexDefinition");
    if (cJSON_IsNull(disable_stored_index_definition)) {
        disable_stored_index_definition = NULL;
    }
    if (disable_stored_index_definition) { 
    disable_stored_index_definition_local_nonprim = config_node_property_boolean_parseFromJSON(disable_stored_index_definition); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->deleted_blobs_collection_enabled
    cJSON *deleted_blobs_collection_enabled = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_propertiesJSON, "deletedBlobsCollectionEnabled");
    if (cJSON_IsNull(deleted_blobs_collection_enabled)) {
        deleted_blobs_collection_enabled = NULL;
    }
    if (deleted_blobs_collection_enabled) { 
    deleted_blobs_collection_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(deleted_blobs_collection_enabled); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->prop_index_cleaner_interval_in_secs
    cJSON *prop_index_cleaner_interval_in_secs = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_propertiesJSON, "propIndexCleanerIntervalInSecs");
    if (cJSON_IsNull(prop_index_cleaner_interval_in_secs)) {
        prop_index_cleaner_interval_in_secs = NULL;
    }
    if (prop_index_cleaner_interval_in_secs) { 
    prop_index_cleaner_interval_in_secs_local_nonprim = config_node_property_integer_parseFromJSON(prop_index_cleaner_interval_in_secs); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties->enable_single_blob_index_files
    cJSON *enable_single_blob_index_files = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_propertiesJSON, "enableSingleBlobIndexFiles");
    if (cJSON_IsNull(enable_single_blob_index_files)) {
        enable_single_blob_index_files = NULL;
    }
    if (enable_single_blob_index_files) { 
    enable_single_blob_index_files_local_nonprim = config_node_property_boolean_parseFromJSON(enable_single_blob_index_files); //nonprimitive
    }



    org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var = org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_create_internal (
        disabled ? disabled_local_nonprim : NULL,
        debug ? debug_local_nonprim : NULL,
        local_index_dir ? local_index_dir_local_nonprim : NULL,
        enable_open_index_async ? enable_open_index_async_local_nonprim : NULL,
        thread_pool_size ? thread_pool_size_local_nonprim : NULL,
        prefetch_index_files ? prefetch_index_files_local_nonprim : NULL,
        extracted_text_cache_size_in_mb ? extracted_text_cache_size_in_mb_local_nonprim : NULL,
        extracted_text_cache_expiry_in_secs ? extracted_text_cache_expiry_in_secs_local_nonprim : NULL,
        always_use_pre_extracted_cache ? always_use_pre_extracted_cache_local_nonprim : NULL,
        boolean_clause_limit ? boolean_clause_limit_local_nonprim : NULL,
        enable_hybrid_indexing ? enable_hybrid_indexing_local_nonprim : NULL,
        hybrid_queue_size ? hybrid_queue_size_local_nonprim : NULL,
        disable_stored_index_definition ? disable_stored_index_definition_local_nonprim : NULL,
        deleted_blobs_collection_enabled ? deleted_blobs_collection_enabled_local_nonprim : NULL,
        prop_index_cleaner_interval_in_secs ? prop_index_cleaner_interval_in_secs_local_nonprim : NULL,
        enable_single_blob_index_files ? enable_single_blob_index_files_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_local_var;
end:
    if (disabled_local_nonprim) {
        config_node_property_boolean_free(disabled_local_nonprim);
        disabled_local_nonprim = NULL;
    }
    if (debug_local_nonprim) {
        config_node_property_boolean_free(debug_local_nonprim);
        debug_local_nonprim = NULL;
    }
    if (local_index_dir_local_nonprim) {
        config_node_property_string_free(local_index_dir_local_nonprim);
        local_index_dir_local_nonprim = NULL;
    }
    if (enable_open_index_async_local_nonprim) {
        config_node_property_boolean_free(enable_open_index_async_local_nonprim);
        enable_open_index_async_local_nonprim = NULL;
    }
    if (thread_pool_size_local_nonprim) {
        config_node_property_integer_free(thread_pool_size_local_nonprim);
        thread_pool_size_local_nonprim = NULL;
    }
    if (prefetch_index_files_local_nonprim) {
        config_node_property_boolean_free(prefetch_index_files_local_nonprim);
        prefetch_index_files_local_nonprim = NULL;
    }
    if (extracted_text_cache_size_in_mb_local_nonprim) {
        config_node_property_integer_free(extracted_text_cache_size_in_mb_local_nonprim);
        extracted_text_cache_size_in_mb_local_nonprim = NULL;
    }
    if (extracted_text_cache_expiry_in_secs_local_nonprim) {
        config_node_property_integer_free(extracted_text_cache_expiry_in_secs_local_nonprim);
        extracted_text_cache_expiry_in_secs_local_nonprim = NULL;
    }
    if (always_use_pre_extracted_cache_local_nonprim) {
        config_node_property_boolean_free(always_use_pre_extracted_cache_local_nonprim);
        always_use_pre_extracted_cache_local_nonprim = NULL;
    }
    if (boolean_clause_limit_local_nonprim) {
        config_node_property_integer_free(boolean_clause_limit_local_nonprim);
        boolean_clause_limit_local_nonprim = NULL;
    }
    if (enable_hybrid_indexing_local_nonprim) {
        config_node_property_boolean_free(enable_hybrid_indexing_local_nonprim);
        enable_hybrid_indexing_local_nonprim = NULL;
    }
    if (hybrid_queue_size_local_nonprim) {
        config_node_property_integer_free(hybrid_queue_size_local_nonprim);
        hybrid_queue_size_local_nonprim = NULL;
    }
    if (disable_stored_index_definition_local_nonprim) {
        config_node_property_boolean_free(disable_stored_index_definition_local_nonprim);
        disable_stored_index_definition_local_nonprim = NULL;
    }
    if (deleted_blobs_collection_enabled_local_nonprim) {
        config_node_property_boolean_free(deleted_blobs_collection_enabled_local_nonprim);
        deleted_blobs_collection_enabled_local_nonprim = NULL;
    }
    if (prop_index_cleaner_interval_in_secs_local_nonprim) {
        config_node_property_integer_free(prop_index_cleaner_interval_in_secs_local_nonprim);
        prop_index_cleaner_interval_in_secs_local_nonprim = NULL;
    }
    if (enable_single_blob_index_files_local_nonprim) {
        config_node_property_boolean_free(enable_single_blob_index_files_local_nonprim);
        enable_single_blob_index_files_local_nonprim = NULL;
    }
    return NULL;

}
