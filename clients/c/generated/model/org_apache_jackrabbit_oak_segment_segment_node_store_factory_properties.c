#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties.h"



static org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_t *org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_create_internal(
    config_node_property_string_t *repository_home,
    config_node_property_string_t *tarmk_mode,
    config_node_property_integer_t *tarmk_size,
    config_node_property_integer_t *segment_cache_size,
    config_node_property_integer_t *string_cache_size,
    config_node_property_integer_t *template_cache_size,
    config_node_property_integer_t *string_deduplication_cache_size,
    config_node_property_integer_t *template_deduplication_cache_size,
    config_node_property_integer_t *node_deduplication_cache_size,
    config_node_property_boolean_t *pause_compaction,
    config_node_property_integer_t *compaction_retry_count,
    config_node_property_integer_t *compaction_force_timeout,
    config_node_property_integer_t *compaction_size_delta_estimation,
    config_node_property_boolean_t *compaction_disable_estimation,
    config_node_property_integer_t *compaction_retained_generations,
    config_node_property_integer_t *compaction_memory_threshold,
    config_node_property_integer_t *compaction_progress_log,
    config_node_property_boolean_t *standby,
    config_node_property_boolean_t *custom_blob_store,
    config_node_property_boolean_t *custom_segment_store,
    config_node_property_boolean_t *split_persistence,
    config_node_property_string_t *repository_backup_dir,
    config_node_property_integer_t *blob_gc_max_age_in_secs,
    config_node_property_integer_t *blob_track_snapshot_interval_in_secs,
    config_node_property_string_t *role,
    config_node_property_boolean_t *register_descriptors,
    config_node_property_boolean_t *dispatch_changes
    ) {
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_t *org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_t));
    if (!org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_t));
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->repository_home = repository_home;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->tarmk_mode = tarmk_mode;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->tarmk_size = tarmk_size;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->segment_cache_size = segment_cache_size;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->string_cache_size = string_cache_size;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->template_cache_size = template_cache_size;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->string_deduplication_cache_size = string_deduplication_cache_size;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->template_deduplication_cache_size = template_deduplication_cache_size;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->node_deduplication_cache_size = node_deduplication_cache_size;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->pause_compaction = pause_compaction;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->compaction_retry_count = compaction_retry_count;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->compaction_force_timeout = compaction_force_timeout;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->compaction_size_delta_estimation = compaction_size_delta_estimation;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->compaction_disable_estimation = compaction_disable_estimation;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->compaction_retained_generations = compaction_retained_generations;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->compaction_memory_threshold = compaction_memory_threshold;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->compaction_progress_log = compaction_progress_log;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->standby = standby;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->custom_blob_store = custom_blob_store;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->custom_segment_store = custom_segment_store;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->split_persistence = split_persistence;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->repository_backup_dir = repository_backup_dir;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->blob_gc_max_age_in_secs = blob_gc_max_age_in_secs;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->blob_track_snapshot_interval_in_secs = blob_track_snapshot_interval_in_secs;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->role = role;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->register_descriptors = register_descriptors;
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var->dispatch_changes = dispatch_changes;
    return org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_t *org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_create(
    config_node_property_string_t *repository_home,
    config_node_property_string_t *tarmk_mode,
    config_node_property_integer_t *tarmk_size,
    config_node_property_integer_t *segment_cache_size,
    config_node_property_integer_t *string_cache_size,
    config_node_property_integer_t *template_cache_size,
    config_node_property_integer_t *string_deduplication_cache_size,
    config_node_property_integer_t *template_deduplication_cache_size,
    config_node_property_integer_t *node_deduplication_cache_size,
    config_node_property_boolean_t *pause_compaction,
    config_node_property_integer_t *compaction_retry_count,
    config_node_property_integer_t *compaction_force_timeout,
    config_node_property_integer_t *compaction_size_delta_estimation,
    config_node_property_boolean_t *compaction_disable_estimation,
    config_node_property_integer_t *compaction_retained_generations,
    config_node_property_integer_t *compaction_memory_threshold,
    config_node_property_integer_t *compaction_progress_log,
    config_node_property_boolean_t *standby,
    config_node_property_boolean_t *custom_blob_store,
    config_node_property_boolean_t *custom_segment_store,
    config_node_property_boolean_t *split_persistence,
    config_node_property_string_t *repository_backup_dir,
    config_node_property_integer_t *blob_gc_max_age_in_secs,
    config_node_property_integer_t *blob_track_snapshot_interval_in_secs,
    config_node_property_string_t *role,
    config_node_property_boolean_t *register_descriptors,
    config_node_property_boolean_t *dispatch_changes
    ) {
    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_t *result = org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_create_internal (
        repository_home,
        tarmk_mode,
        tarmk_size,
        segment_cache_size,
        string_cache_size,
        template_cache_size,
        string_deduplication_cache_size,
        template_deduplication_cache_size,
        node_deduplication_cache_size,
        pause_compaction,
        compaction_retry_count,
        compaction_force_timeout,
        compaction_size_delta_estimation,
        compaction_disable_estimation,
        compaction_retained_generations,
        compaction_memory_threshold,
        compaction_progress_log,
        standby,
        custom_blob_store,
        custom_segment_store,
        split_persistence,
        repository_backup_dir,
        blob_gc_max_age_in_secs,
        blob_track_snapshot_interval_in_secs,
        role,
        register_descriptors,
        dispatch_changes
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_t *org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties) {
    if(NULL == org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->repository_home) {
        config_node_property_string_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->repository_home);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->repository_home = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->tarmk_mode) {
        config_node_property_string_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->tarmk_mode);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->tarmk_mode = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->tarmk_size) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->tarmk_size);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->tarmk_size = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->segment_cache_size) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->segment_cache_size);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->segment_cache_size = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->string_cache_size) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->string_cache_size);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->string_cache_size = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->template_cache_size) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->template_cache_size);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->template_cache_size = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->string_deduplication_cache_size) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->string_deduplication_cache_size);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->string_deduplication_cache_size = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->template_deduplication_cache_size) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->template_deduplication_cache_size);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->template_deduplication_cache_size = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->node_deduplication_cache_size) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->node_deduplication_cache_size);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->node_deduplication_cache_size = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->pause_compaction) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->pause_compaction);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->pause_compaction = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_retry_count) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_retry_count);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_retry_count = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_force_timeout) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_force_timeout);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_force_timeout = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_size_delta_estimation) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_size_delta_estimation);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_size_delta_estimation = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_disable_estimation) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_disable_estimation);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_disable_estimation = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_retained_generations) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_retained_generations);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_retained_generations = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_memory_threshold) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_memory_threshold);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_memory_threshold = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_progress_log) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_progress_log);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_progress_log = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->standby) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->standby);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->standby = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->custom_blob_store) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->custom_blob_store);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->custom_blob_store = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->custom_segment_store) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->custom_segment_store);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->custom_segment_store = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->split_persistence) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->split_persistence);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->split_persistence = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->repository_backup_dir) {
        config_node_property_string_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->repository_backup_dir);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->repository_backup_dir = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->blob_gc_max_age_in_secs) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->blob_gc_max_age_in_secs);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->blob_gc_max_age_in_secs = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->blob_track_snapshot_interval_in_secs) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->blob_track_snapshot_interval_in_secs);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->blob_track_snapshot_interval_in_secs = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->role) {
        config_node_property_string_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->role);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->role = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->register_descriptors) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->register_descriptors);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->register_descriptors = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->dispatch_changes) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->dispatch_changes);
        org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->dispatch_changes = NULL;
    }
    free(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties);
}

cJSON *org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_t *org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->repository_home
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->repository_home) {
    cJSON *repository_home_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->repository_home);
    if(repository_home_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "repository.home", repository_home_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->tarmk_mode
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->tarmk_mode) {
    cJSON *tarmk_mode_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->tarmk_mode);
    if(tarmk_mode_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tarmk.mode", tarmk_mode_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->tarmk_size
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->tarmk_size) {
    cJSON *tarmk_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->tarmk_size);
    if(tarmk_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tarmk.size", tarmk_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->segment_cache_size
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->segment_cache_size) {
    cJSON *segment_cache_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->segment_cache_size);
    if(segment_cache_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "segmentCache.size", segment_cache_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->string_cache_size
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->string_cache_size) {
    cJSON *string_cache_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->string_cache_size);
    if(string_cache_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "stringCache.size", string_cache_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->template_cache_size
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->template_cache_size) {
    cJSON *template_cache_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->template_cache_size);
    if(template_cache_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "templateCache.size", template_cache_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->string_deduplication_cache_size
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->string_deduplication_cache_size) {
    cJSON *string_deduplication_cache_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->string_deduplication_cache_size);
    if(string_deduplication_cache_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "stringDeduplicationCache.size", string_deduplication_cache_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->template_deduplication_cache_size
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->template_deduplication_cache_size) {
    cJSON *template_deduplication_cache_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->template_deduplication_cache_size);
    if(template_deduplication_cache_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "templateDeduplicationCache.size", template_deduplication_cache_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->node_deduplication_cache_size
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->node_deduplication_cache_size) {
    cJSON *node_deduplication_cache_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->node_deduplication_cache_size);
    if(node_deduplication_cache_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "nodeDeduplicationCache.size", node_deduplication_cache_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->pause_compaction
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->pause_compaction) {
    cJSON *pause_compaction_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->pause_compaction);
    if(pause_compaction_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pauseCompaction", pause_compaction_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_retry_count
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_retry_count) {
    cJSON *compaction_retry_count_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_retry_count);
    if(compaction_retry_count_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "compaction.retryCount", compaction_retry_count_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_force_timeout
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_force_timeout) {
    cJSON *compaction_force_timeout_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_force_timeout);
    if(compaction_force_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "compaction.force.timeout", compaction_force_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_size_delta_estimation
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_size_delta_estimation) {
    cJSON *compaction_size_delta_estimation_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_size_delta_estimation);
    if(compaction_size_delta_estimation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "compaction.sizeDeltaEstimation", compaction_size_delta_estimation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_disable_estimation
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_disable_estimation) {
    cJSON *compaction_disable_estimation_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_disable_estimation);
    if(compaction_disable_estimation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "compaction.disableEstimation", compaction_disable_estimation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_retained_generations
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_retained_generations) {
    cJSON *compaction_retained_generations_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_retained_generations);
    if(compaction_retained_generations_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "compaction.retainedGenerations", compaction_retained_generations_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_memory_threshold
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_memory_threshold) {
    cJSON *compaction_memory_threshold_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_memory_threshold);
    if(compaction_memory_threshold_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "compaction.memoryThreshold", compaction_memory_threshold_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_progress_log
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_progress_log) {
    cJSON *compaction_progress_log_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_progress_log);
    if(compaction_progress_log_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "compaction.progressLog", compaction_progress_log_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->standby
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->standby) {
    cJSON *standby_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->standby);
    if(standby_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "standby", standby_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->custom_blob_store
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->custom_blob_store) {
    cJSON *custom_blob_store_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->custom_blob_store);
    if(custom_blob_store_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "customBlobStore", custom_blob_store_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->custom_segment_store
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->custom_segment_store) {
    cJSON *custom_segment_store_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->custom_segment_store);
    if(custom_segment_store_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "customSegmentStore", custom_segment_store_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->split_persistence
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->split_persistence) {
    cJSON *split_persistence_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->split_persistence);
    if(split_persistence_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "splitPersistence", split_persistence_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->repository_backup_dir
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->repository_backup_dir) {
    cJSON *repository_backup_dir_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->repository_backup_dir);
    if(repository_backup_dir_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "repository.backup.dir", repository_backup_dir_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->blob_gc_max_age_in_secs
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->blob_gc_max_age_in_secs) {
    cJSON *blob_gc_max_age_in_secs_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->blob_gc_max_age_in_secs);
    if(blob_gc_max_age_in_secs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "blobGcMaxAgeInSecs", blob_gc_max_age_in_secs_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->blob_track_snapshot_interval_in_secs
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->blob_track_snapshot_interval_in_secs) {
    cJSON *blob_track_snapshot_interval_in_secs_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->blob_track_snapshot_interval_in_secs);
    if(blob_track_snapshot_interval_in_secs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "blobTrackSnapshotIntervalInSecs", blob_track_snapshot_interval_in_secs_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->role
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->role) {
    cJSON *role_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->role);
    if(role_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "role", role_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->register_descriptors
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->register_descriptors) {
    cJSON *register_descriptors_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->register_descriptors);
    if(register_descriptors_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "registerDescriptors", register_descriptors_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->dispatch_changes
    if(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->dispatch_changes) {
    cJSON *dispatch_changes_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->dispatch_changes);
    if(dispatch_changes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dispatchChanges", dispatch_changes_local_JSON);
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

org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_t *org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON){

    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_t *org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->repository_home
    config_node_property_string_t *repository_home_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->tarmk_mode
    config_node_property_string_t *tarmk_mode_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->tarmk_size
    config_node_property_integer_t *tarmk_size_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->segment_cache_size
    config_node_property_integer_t *segment_cache_size_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->string_cache_size
    config_node_property_integer_t *string_cache_size_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->template_cache_size
    config_node_property_integer_t *template_cache_size_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->string_deduplication_cache_size
    config_node_property_integer_t *string_deduplication_cache_size_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->template_deduplication_cache_size
    config_node_property_integer_t *template_deduplication_cache_size_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->node_deduplication_cache_size
    config_node_property_integer_t *node_deduplication_cache_size_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->pause_compaction
    config_node_property_boolean_t *pause_compaction_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_retry_count
    config_node_property_integer_t *compaction_retry_count_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_force_timeout
    config_node_property_integer_t *compaction_force_timeout_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_size_delta_estimation
    config_node_property_integer_t *compaction_size_delta_estimation_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_disable_estimation
    config_node_property_boolean_t *compaction_disable_estimation_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_retained_generations
    config_node_property_integer_t *compaction_retained_generations_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_memory_threshold
    config_node_property_integer_t *compaction_memory_threshold_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_progress_log
    config_node_property_integer_t *compaction_progress_log_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->standby
    config_node_property_boolean_t *standby_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->custom_blob_store
    config_node_property_boolean_t *custom_blob_store_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->custom_segment_store
    config_node_property_boolean_t *custom_segment_store_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->split_persistence
    config_node_property_boolean_t *split_persistence_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->repository_backup_dir
    config_node_property_string_t *repository_backup_dir_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->blob_gc_max_age_in_secs
    config_node_property_integer_t *blob_gc_max_age_in_secs_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->blob_track_snapshot_interval_in_secs
    config_node_property_integer_t *blob_track_snapshot_interval_in_secs_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->role
    config_node_property_string_t *role_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->register_descriptors
    config_node_property_boolean_t *register_descriptors_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->dispatch_changes
    config_node_property_boolean_t *dispatch_changes_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->repository_home
    cJSON *repository_home = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "repository.home");
    if (cJSON_IsNull(repository_home)) {
        repository_home = NULL;
    }
    if (repository_home) { 
    repository_home_local_nonprim = config_node_property_string_parseFromJSON(repository_home); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->tarmk_mode
    cJSON *tarmk_mode = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "tarmk.mode");
    if (cJSON_IsNull(tarmk_mode)) {
        tarmk_mode = NULL;
    }
    if (tarmk_mode) { 
    tarmk_mode_local_nonprim = config_node_property_string_parseFromJSON(tarmk_mode); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->tarmk_size
    cJSON *tarmk_size = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "tarmk.size");
    if (cJSON_IsNull(tarmk_size)) {
        tarmk_size = NULL;
    }
    if (tarmk_size) { 
    tarmk_size_local_nonprim = config_node_property_integer_parseFromJSON(tarmk_size); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->segment_cache_size
    cJSON *segment_cache_size = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "segmentCache.size");
    if (cJSON_IsNull(segment_cache_size)) {
        segment_cache_size = NULL;
    }
    if (segment_cache_size) { 
    segment_cache_size_local_nonprim = config_node_property_integer_parseFromJSON(segment_cache_size); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->string_cache_size
    cJSON *string_cache_size = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "stringCache.size");
    if (cJSON_IsNull(string_cache_size)) {
        string_cache_size = NULL;
    }
    if (string_cache_size) { 
    string_cache_size_local_nonprim = config_node_property_integer_parseFromJSON(string_cache_size); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->template_cache_size
    cJSON *template_cache_size = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "templateCache.size");
    if (cJSON_IsNull(template_cache_size)) {
        template_cache_size = NULL;
    }
    if (template_cache_size) { 
    template_cache_size_local_nonprim = config_node_property_integer_parseFromJSON(template_cache_size); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->string_deduplication_cache_size
    cJSON *string_deduplication_cache_size = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "stringDeduplicationCache.size");
    if (cJSON_IsNull(string_deduplication_cache_size)) {
        string_deduplication_cache_size = NULL;
    }
    if (string_deduplication_cache_size) { 
    string_deduplication_cache_size_local_nonprim = config_node_property_integer_parseFromJSON(string_deduplication_cache_size); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->template_deduplication_cache_size
    cJSON *template_deduplication_cache_size = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "templateDeduplicationCache.size");
    if (cJSON_IsNull(template_deduplication_cache_size)) {
        template_deduplication_cache_size = NULL;
    }
    if (template_deduplication_cache_size) { 
    template_deduplication_cache_size_local_nonprim = config_node_property_integer_parseFromJSON(template_deduplication_cache_size); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->node_deduplication_cache_size
    cJSON *node_deduplication_cache_size = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "nodeDeduplicationCache.size");
    if (cJSON_IsNull(node_deduplication_cache_size)) {
        node_deduplication_cache_size = NULL;
    }
    if (node_deduplication_cache_size) { 
    node_deduplication_cache_size_local_nonprim = config_node_property_integer_parseFromJSON(node_deduplication_cache_size); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->pause_compaction
    cJSON *pause_compaction = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "pauseCompaction");
    if (cJSON_IsNull(pause_compaction)) {
        pause_compaction = NULL;
    }
    if (pause_compaction) { 
    pause_compaction_local_nonprim = config_node_property_boolean_parseFromJSON(pause_compaction); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_retry_count
    cJSON *compaction_retry_count = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "compaction.retryCount");
    if (cJSON_IsNull(compaction_retry_count)) {
        compaction_retry_count = NULL;
    }
    if (compaction_retry_count) { 
    compaction_retry_count_local_nonprim = config_node_property_integer_parseFromJSON(compaction_retry_count); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_force_timeout
    cJSON *compaction_force_timeout = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "compaction.force.timeout");
    if (cJSON_IsNull(compaction_force_timeout)) {
        compaction_force_timeout = NULL;
    }
    if (compaction_force_timeout) { 
    compaction_force_timeout_local_nonprim = config_node_property_integer_parseFromJSON(compaction_force_timeout); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_size_delta_estimation
    cJSON *compaction_size_delta_estimation = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "compaction.sizeDeltaEstimation");
    if (cJSON_IsNull(compaction_size_delta_estimation)) {
        compaction_size_delta_estimation = NULL;
    }
    if (compaction_size_delta_estimation) { 
    compaction_size_delta_estimation_local_nonprim = config_node_property_integer_parseFromJSON(compaction_size_delta_estimation); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_disable_estimation
    cJSON *compaction_disable_estimation = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "compaction.disableEstimation");
    if (cJSON_IsNull(compaction_disable_estimation)) {
        compaction_disable_estimation = NULL;
    }
    if (compaction_disable_estimation) { 
    compaction_disable_estimation_local_nonprim = config_node_property_boolean_parseFromJSON(compaction_disable_estimation); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_retained_generations
    cJSON *compaction_retained_generations = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "compaction.retainedGenerations");
    if (cJSON_IsNull(compaction_retained_generations)) {
        compaction_retained_generations = NULL;
    }
    if (compaction_retained_generations) { 
    compaction_retained_generations_local_nonprim = config_node_property_integer_parseFromJSON(compaction_retained_generations); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_memory_threshold
    cJSON *compaction_memory_threshold = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "compaction.memoryThreshold");
    if (cJSON_IsNull(compaction_memory_threshold)) {
        compaction_memory_threshold = NULL;
    }
    if (compaction_memory_threshold) { 
    compaction_memory_threshold_local_nonprim = config_node_property_integer_parseFromJSON(compaction_memory_threshold); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->compaction_progress_log
    cJSON *compaction_progress_log = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "compaction.progressLog");
    if (cJSON_IsNull(compaction_progress_log)) {
        compaction_progress_log = NULL;
    }
    if (compaction_progress_log) { 
    compaction_progress_log_local_nonprim = config_node_property_integer_parseFromJSON(compaction_progress_log); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->standby
    cJSON *standby = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "standby");
    if (cJSON_IsNull(standby)) {
        standby = NULL;
    }
    if (standby) { 
    standby_local_nonprim = config_node_property_boolean_parseFromJSON(standby); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->custom_blob_store
    cJSON *custom_blob_store = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "customBlobStore");
    if (cJSON_IsNull(custom_blob_store)) {
        custom_blob_store = NULL;
    }
    if (custom_blob_store) { 
    custom_blob_store_local_nonprim = config_node_property_boolean_parseFromJSON(custom_blob_store); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->custom_segment_store
    cJSON *custom_segment_store = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "customSegmentStore");
    if (cJSON_IsNull(custom_segment_store)) {
        custom_segment_store = NULL;
    }
    if (custom_segment_store) { 
    custom_segment_store_local_nonprim = config_node_property_boolean_parseFromJSON(custom_segment_store); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->split_persistence
    cJSON *split_persistence = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "splitPersistence");
    if (cJSON_IsNull(split_persistence)) {
        split_persistence = NULL;
    }
    if (split_persistence) { 
    split_persistence_local_nonprim = config_node_property_boolean_parseFromJSON(split_persistence); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->repository_backup_dir
    cJSON *repository_backup_dir = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "repository.backup.dir");
    if (cJSON_IsNull(repository_backup_dir)) {
        repository_backup_dir = NULL;
    }
    if (repository_backup_dir) { 
    repository_backup_dir_local_nonprim = config_node_property_string_parseFromJSON(repository_backup_dir); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->blob_gc_max_age_in_secs
    cJSON *blob_gc_max_age_in_secs = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "blobGcMaxAgeInSecs");
    if (cJSON_IsNull(blob_gc_max_age_in_secs)) {
        blob_gc_max_age_in_secs = NULL;
    }
    if (blob_gc_max_age_in_secs) { 
    blob_gc_max_age_in_secs_local_nonprim = config_node_property_integer_parseFromJSON(blob_gc_max_age_in_secs); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->blob_track_snapshot_interval_in_secs
    cJSON *blob_track_snapshot_interval_in_secs = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "blobTrackSnapshotIntervalInSecs");
    if (cJSON_IsNull(blob_track_snapshot_interval_in_secs)) {
        blob_track_snapshot_interval_in_secs = NULL;
    }
    if (blob_track_snapshot_interval_in_secs) { 
    blob_track_snapshot_interval_in_secs_local_nonprim = config_node_property_integer_parseFromJSON(blob_track_snapshot_interval_in_secs); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    if (role) { 
    role_local_nonprim = config_node_property_string_parseFromJSON(role); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->register_descriptors
    cJSON *register_descriptors = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "registerDescriptors");
    if (cJSON_IsNull(register_descriptors)) {
        register_descriptors = NULL;
    }
    if (register_descriptors) { 
    register_descriptors_local_nonprim = config_node_property_boolean_parseFromJSON(register_descriptors); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties->dispatch_changes
    cJSON *dispatch_changes = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_segment_node_store_factory_propertiesJSON, "dispatchChanges");
    if (cJSON_IsNull(dispatch_changes)) {
        dispatch_changes = NULL;
    }
    if (dispatch_changes) { 
    dispatch_changes_local_nonprim = config_node_property_boolean_parseFromJSON(dispatch_changes); //nonprimitive
    }



    org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var = org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_create_internal (
        repository_home ? repository_home_local_nonprim : NULL,
        tarmk_mode ? tarmk_mode_local_nonprim : NULL,
        tarmk_size ? tarmk_size_local_nonprim : NULL,
        segment_cache_size ? segment_cache_size_local_nonprim : NULL,
        string_cache_size ? string_cache_size_local_nonprim : NULL,
        template_cache_size ? template_cache_size_local_nonprim : NULL,
        string_deduplication_cache_size ? string_deduplication_cache_size_local_nonprim : NULL,
        template_deduplication_cache_size ? template_deduplication_cache_size_local_nonprim : NULL,
        node_deduplication_cache_size ? node_deduplication_cache_size_local_nonprim : NULL,
        pause_compaction ? pause_compaction_local_nonprim : NULL,
        compaction_retry_count ? compaction_retry_count_local_nonprim : NULL,
        compaction_force_timeout ? compaction_force_timeout_local_nonprim : NULL,
        compaction_size_delta_estimation ? compaction_size_delta_estimation_local_nonprim : NULL,
        compaction_disable_estimation ? compaction_disable_estimation_local_nonprim : NULL,
        compaction_retained_generations ? compaction_retained_generations_local_nonprim : NULL,
        compaction_memory_threshold ? compaction_memory_threshold_local_nonprim : NULL,
        compaction_progress_log ? compaction_progress_log_local_nonprim : NULL,
        standby ? standby_local_nonprim : NULL,
        custom_blob_store ? custom_blob_store_local_nonprim : NULL,
        custom_segment_store ? custom_segment_store_local_nonprim : NULL,
        split_persistence ? split_persistence_local_nonprim : NULL,
        repository_backup_dir ? repository_backup_dir_local_nonprim : NULL,
        blob_gc_max_age_in_secs ? blob_gc_max_age_in_secs_local_nonprim : NULL,
        blob_track_snapshot_interval_in_secs ? blob_track_snapshot_interval_in_secs_local_nonprim : NULL,
        role ? role_local_nonprim : NULL,
        register_descriptors ? register_descriptors_local_nonprim : NULL,
        dispatch_changes ? dispatch_changes_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_segment_segment_node_store_factory_properties_local_var;
end:
    if (repository_home_local_nonprim) {
        config_node_property_string_free(repository_home_local_nonprim);
        repository_home_local_nonprim = NULL;
    }
    if (tarmk_mode_local_nonprim) {
        config_node_property_string_free(tarmk_mode_local_nonprim);
        tarmk_mode_local_nonprim = NULL;
    }
    if (tarmk_size_local_nonprim) {
        config_node_property_integer_free(tarmk_size_local_nonprim);
        tarmk_size_local_nonprim = NULL;
    }
    if (segment_cache_size_local_nonprim) {
        config_node_property_integer_free(segment_cache_size_local_nonprim);
        segment_cache_size_local_nonprim = NULL;
    }
    if (string_cache_size_local_nonprim) {
        config_node_property_integer_free(string_cache_size_local_nonprim);
        string_cache_size_local_nonprim = NULL;
    }
    if (template_cache_size_local_nonprim) {
        config_node_property_integer_free(template_cache_size_local_nonprim);
        template_cache_size_local_nonprim = NULL;
    }
    if (string_deduplication_cache_size_local_nonprim) {
        config_node_property_integer_free(string_deduplication_cache_size_local_nonprim);
        string_deduplication_cache_size_local_nonprim = NULL;
    }
    if (template_deduplication_cache_size_local_nonprim) {
        config_node_property_integer_free(template_deduplication_cache_size_local_nonprim);
        template_deduplication_cache_size_local_nonprim = NULL;
    }
    if (node_deduplication_cache_size_local_nonprim) {
        config_node_property_integer_free(node_deduplication_cache_size_local_nonprim);
        node_deduplication_cache_size_local_nonprim = NULL;
    }
    if (pause_compaction_local_nonprim) {
        config_node_property_boolean_free(pause_compaction_local_nonprim);
        pause_compaction_local_nonprim = NULL;
    }
    if (compaction_retry_count_local_nonprim) {
        config_node_property_integer_free(compaction_retry_count_local_nonprim);
        compaction_retry_count_local_nonprim = NULL;
    }
    if (compaction_force_timeout_local_nonprim) {
        config_node_property_integer_free(compaction_force_timeout_local_nonprim);
        compaction_force_timeout_local_nonprim = NULL;
    }
    if (compaction_size_delta_estimation_local_nonprim) {
        config_node_property_integer_free(compaction_size_delta_estimation_local_nonprim);
        compaction_size_delta_estimation_local_nonprim = NULL;
    }
    if (compaction_disable_estimation_local_nonprim) {
        config_node_property_boolean_free(compaction_disable_estimation_local_nonprim);
        compaction_disable_estimation_local_nonprim = NULL;
    }
    if (compaction_retained_generations_local_nonprim) {
        config_node_property_integer_free(compaction_retained_generations_local_nonprim);
        compaction_retained_generations_local_nonprim = NULL;
    }
    if (compaction_memory_threshold_local_nonprim) {
        config_node_property_integer_free(compaction_memory_threshold_local_nonprim);
        compaction_memory_threshold_local_nonprim = NULL;
    }
    if (compaction_progress_log_local_nonprim) {
        config_node_property_integer_free(compaction_progress_log_local_nonprim);
        compaction_progress_log_local_nonprim = NULL;
    }
    if (standby_local_nonprim) {
        config_node_property_boolean_free(standby_local_nonprim);
        standby_local_nonprim = NULL;
    }
    if (custom_blob_store_local_nonprim) {
        config_node_property_boolean_free(custom_blob_store_local_nonprim);
        custom_blob_store_local_nonprim = NULL;
    }
    if (custom_segment_store_local_nonprim) {
        config_node_property_boolean_free(custom_segment_store_local_nonprim);
        custom_segment_store_local_nonprim = NULL;
    }
    if (split_persistence_local_nonprim) {
        config_node_property_boolean_free(split_persistence_local_nonprim);
        split_persistence_local_nonprim = NULL;
    }
    if (repository_backup_dir_local_nonprim) {
        config_node_property_string_free(repository_backup_dir_local_nonprim);
        repository_backup_dir_local_nonprim = NULL;
    }
    if (blob_gc_max_age_in_secs_local_nonprim) {
        config_node_property_integer_free(blob_gc_max_age_in_secs_local_nonprim);
        blob_gc_max_age_in_secs_local_nonprim = NULL;
    }
    if (blob_track_snapshot_interval_in_secs_local_nonprim) {
        config_node_property_integer_free(blob_track_snapshot_interval_in_secs_local_nonprim);
        blob_track_snapshot_interval_in_secs_local_nonprim = NULL;
    }
    if (role_local_nonprim) {
        config_node_property_string_free(role_local_nonprim);
        role_local_nonprim = NULL;
    }
    if (register_descriptors_local_nonprim) {
        config_node_property_boolean_free(register_descriptors_local_nonprim);
        register_descriptors_local_nonprim = NULL;
    }
    if (dispatch_changes_local_nonprim) {
        config_node_property_boolean_free(dispatch_changes_local_nonprim);
        dispatch_changes_local_nonprim = NULL;
    }
    return NULL;

}
