#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties.h"



static org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_t *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_create_internal(
    config_node_property_string_t *mongouri,
    config_node_property_string_t *db,
    config_node_property_boolean_t *socket_keep_alive,
    config_node_property_integer_t *cache,
    config_node_property_integer_t *node_cache_percentage,
    config_node_property_integer_t *prev_doc_cache_percentage,
    config_node_property_integer_t *children_cache_percentage,
    config_node_property_integer_t *diff_cache_percentage,
    config_node_property_integer_t *cache_segment_count,
    config_node_property_integer_t *cache_stack_move_distance,
    config_node_property_integer_t *blob_cache_size,
    config_node_property_string_t *persistent_cache,
    config_node_property_string_t *journal_cache,
    config_node_property_boolean_t *custom_blob_store,
    config_node_property_integer_t *journal_gc_interval,
    config_node_property_integer_t *journal_gc_max_age,
    config_node_property_boolean_t *prefetch_external_changes,
    config_node_property_string_t *role,
    config_node_property_integer_t *version_gc_max_age_in_secs,
    config_node_property_string_t *version_gc_expression,
    config_node_property_integer_t *version_gc_time_limit_in_secs,
    config_node_property_integer_t *blob_gc_max_age_in_secs,
    config_node_property_integer_t *blob_track_snapshot_interval_in_secs,
    config_node_property_string_t *repository_home,
    config_node_property_integer_t *max_replication_lag_in_secs,
    config_node_property_drop_down_t *document_store_type,
    config_node_property_boolean_t *bundling_disabled,
    config_node_property_integer_t *update_limit,
    config_node_property_array_t *persistent_cache_includes,
    config_node_property_drop_down_t *lease_check_mode
    ) {
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_t *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_t));
    if (!org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_t));
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->mongouri = mongouri;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->db = db;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->socket_keep_alive = socket_keep_alive;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->cache = cache;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->node_cache_percentage = node_cache_percentage;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->prev_doc_cache_percentage = prev_doc_cache_percentage;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->children_cache_percentage = children_cache_percentage;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->diff_cache_percentage = diff_cache_percentage;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->cache_segment_count = cache_segment_count;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->cache_stack_move_distance = cache_stack_move_distance;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->blob_cache_size = blob_cache_size;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->persistent_cache = persistent_cache;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->journal_cache = journal_cache;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->custom_blob_store = custom_blob_store;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->journal_gc_interval = journal_gc_interval;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->journal_gc_max_age = journal_gc_max_age;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->prefetch_external_changes = prefetch_external_changes;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->role = role;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->version_gc_max_age_in_secs = version_gc_max_age_in_secs;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->version_gc_expression = version_gc_expression;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->version_gc_time_limit_in_secs = version_gc_time_limit_in_secs;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->blob_gc_max_age_in_secs = blob_gc_max_age_in_secs;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->blob_track_snapshot_interval_in_secs = blob_track_snapshot_interval_in_secs;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->repository_home = repository_home;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->max_replication_lag_in_secs = max_replication_lag_in_secs;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->document_store_type = document_store_type;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->bundling_disabled = bundling_disabled;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->update_limit = update_limit;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->persistent_cache_includes = persistent_cache_includes;
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var->lease_check_mode = lease_check_mode;
    return org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_t *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_create(
    config_node_property_string_t *mongouri,
    config_node_property_string_t *db,
    config_node_property_boolean_t *socket_keep_alive,
    config_node_property_integer_t *cache,
    config_node_property_integer_t *node_cache_percentage,
    config_node_property_integer_t *prev_doc_cache_percentage,
    config_node_property_integer_t *children_cache_percentage,
    config_node_property_integer_t *diff_cache_percentage,
    config_node_property_integer_t *cache_segment_count,
    config_node_property_integer_t *cache_stack_move_distance,
    config_node_property_integer_t *blob_cache_size,
    config_node_property_string_t *persistent_cache,
    config_node_property_string_t *journal_cache,
    config_node_property_boolean_t *custom_blob_store,
    config_node_property_integer_t *journal_gc_interval,
    config_node_property_integer_t *journal_gc_max_age,
    config_node_property_boolean_t *prefetch_external_changes,
    config_node_property_string_t *role,
    config_node_property_integer_t *version_gc_max_age_in_secs,
    config_node_property_string_t *version_gc_expression,
    config_node_property_integer_t *version_gc_time_limit_in_secs,
    config_node_property_integer_t *blob_gc_max_age_in_secs,
    config_node_property_integer_t *blob_track_snapshot_interval_in_secs,
    config_node_property_string_t *repository_home,
    config_node_property_integer_t *max_replication_lag_in_secs,
    config_node_property_drop_down_t *document_store_type,
    config_node_property_boolean_t *bundling_disabled,
    config_node_property_integer_t *update_limit,
    config_node_property_array_t *persistent_cache_includes,
    config_node_property_drop_down_t *lease_check_mode
    ) {
    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_t *result = org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_create_internal (
        mongouri,
        db,
        socket_keep_alive,
        cache,
        node_cache_percentage,
        prev_doc_cache_percentage,
        children_cache_percentage,
        diff_cache_percentage,
        cache_segment_count,
        cache_stack_move_distance,
        blob_cache_size,
        persistent_cache,
        journal_cache,
        custom_blob_store,
        journal_gc_interval,
        journal_gc_max_age,
        prefetch_external_changes,
        role,
        version_gc_max_age_in_secs,
        version_gc_expression,
        version_gc_time_limit_in_secs,
        blob_gc_max_age_in_secs,
        blob_track_snapshot_interval_in_secs,
        repository_home,
        max_replication_lag_in_secs,
        document_store_type,
        bundling_disabled,
        update_limit,
        persistent_cache_includes,
        lease_check_mode
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_t *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties) {
    if(NULL == org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->mongouri) {
        config_node_property_string_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->mongouri);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->mongouri = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->db) {
        config_node_property_string_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->db);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->db = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->socket_keep_alive) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->socket_keep_alive);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->socket_keep_alive = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->node_cache_percentage) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->node_cache_percentage);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->node_cache_percentage = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->prev_doc_cache_percentage) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->prev_doc_cache_percentage);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->prev_doc_cache_percentage = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->children_cache_percentage) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->children_cache_percentage);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->children_cache_percentage = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->diff_cache_percentage) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->diff_cache_percentage);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->diff_cache_percentage = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache_segment_count) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache_segment_count);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache_segment_count = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache_stack_move_distance) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache_stack_move_distance);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache_stack_move_distance = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_cache_size) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_cache_size);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_cache_size = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->persistent_cache) {
        config_node_property_string_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->persistent_cache);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->persistent_cache = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_cache) {
        config_node_property_string_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_cache);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_cache = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->custom_blob_store) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->custom_blob_store);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->custom_blob_store = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_gc_interval) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_gc_interval);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_gc_interval = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_gc_max_age) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_gc_max_age);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_gc_max_age = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->prefetch_external_changes) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->prefetch_external_changes);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->prefetch_external_changes = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->role) {
        config_node_property_string_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->role);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->role = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_max_age_in_secs) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_max_age_in_secs);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_max_age_in_secs = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_expression) {
        config_node_property_string_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_expression);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_expression = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_time_limit_in_secs) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_time_limit_in_secs);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_time_limit_in_secs = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_gc_max_age_in_secs) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_gc_max_age_in_secs);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_gc_max_age_in_secs = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_track_snapshot_interval_in_secs) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_track_snapshot_interval_in_secs);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_track_snapshot_interval_in_secs = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->repository_home) {
        config_node_property_string_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->repository_home);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->repository_home = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->max_replication_lag_in_secs) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->max_replication_lag_in_secs);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->max_replication_lag_in_secs = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->document_store_type) {
        config_node_property_drop_down_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->document_store_type);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->document_store_type = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->bundling_disabled) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->bundling_disabled);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->bundling_disabled = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->update_limit) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->update_limit);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->update_limit = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->persistent_cache_includes) {
        config_node_property_array_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->persistent_cache_includes);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->persistent_cache_includes = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->lease_check_mode) {
        config_node_property_drop_down_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->lease_check_mode);
        org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->lease_check_mode = NULL;
    }
    free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties);
}

cJSON *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_t *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->mongouri
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->mongouri) {
    cJSON *mongouri_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->mongouri);
    if(mongouri_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "mongouri", mongouri_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->db
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->db) {
    cJSON *db_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->db);
    if(db_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "db", db_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->socket_keep_alive
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->socket_keep_alive) {
    cJSON *socket_keep_alive_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->socket_keep_alive);
    if(socket_keep_alive_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "socketKeepAlive", socket_keep_alive_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache) {
    cJSON *cache_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache);
    if(cache_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cache", cache_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->node_cache_percentage
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->node_cache_percentage) {
    cJSON *node_cache_percentage_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->node_cache_percentage);
    if(node_cache_percentage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "nodeCachePercentage", node_cache_percentage_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->prev_doc_cache_percentage
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->prev_doc_cache_percentage) {
    cJSON *prev_doc_cache_percentage_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->prev_doc_cache_percentage);
    if(prev_doc_cache_percentage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "prevDocCachePercentage", prev_doc_cache_percentage_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->children_cache_percentage
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->children_cache_percentage) {
    cJSON *children_cache_percentage_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->children_cache_percentage);
    if(children_cache_percentage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "childrenCachePercentage", children_cache_percentage_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->diff_cache_percentage
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->diff_cache_percentage) {
    cJSON *diff_cache_percentage_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->diff_cache_percentage);
    if(diff_cache_percentage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "diffCachePercentage", diff_cache_percentage_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache_segment_count
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache_segment_count) {
    cJSON *cache_segment_count_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache_segment_count);
    if(cache_segment_count_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cacheSegmentCount", cache_segment_count_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache_stack_move_distance
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache_stack_move_distance) {
    cJSON *cache_stack_move_distance_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache_stack_move_distance);
    if(cache_stack_move_distance_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cacheStackMoveDistance", cache_stack_move_distance_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_cache_size
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_cache_size) {
    cJSON *blob_cache_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_cache_size);
    if(blob_cache_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "blobCacheSize", blob_cache_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->persistent_cache
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->persistent_cache) {
    cJSON *persistent_cache_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->persistent_cache);
    if(persistent_cache_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "persistentCache", persistent_cache_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_cache
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_cache) {
    cJSON *journal_cache_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_cache);
    if(journal_cache_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "journalCache", journal_cache_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->custom_blob_store
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->custom_blob_store) {
    cJSON *custom_blob_store_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->custom_blob_store);
    if(custom_blob_store_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "customBlobStore", custom_blob_store_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_gc_interval
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_gc_interval) {
    cJSON *journal_gc_interval_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_gc_interval);
    if(journal_gc_interval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "journalGCInterval", journal_gc_interval_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_gc_max_age
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_gc_max_age) {
    cJSON *journal_gc_max_age_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_gc_max_age);
    if(journal_gc_max_age_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "journalGCMaxAge", journal_gc_max_age_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->prefetch_external_changes
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->prefetch_external_changes) {
    cJSON *prefetch_external_changes_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->prefetch_external_changes);
    if(prefetch_external_changes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "prefetchExternalChanges", prefetch_external_changes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->role
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->role) {
    cJSON *role_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->role);
    if(role_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "role", role_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_max_age_in_secs
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_max_age_in_secs) {
    cJSON *version_gc_max_age_in_secs_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_max_age_in_secs);
    if(version_gc_max_age_in_secs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "versionGcMaxAgeInSecs", version_gc_max_age_in_secs_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_expression
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_expression) {
    cJSON *version_gc_expression_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_expression);
    if(version_gc_expression_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "versionGCExpression", version_gc_expression_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_time_limit_in_secs
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_time_limit_in_secs) {
    cJSON *version_gc_time_limit_in_secs_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_time_limit_in_secs);
    if(version_gc_time_limit_in_secs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "versionGCTimeLimitInSecs", version_gc_time_limit_in_secs_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_gc_max_age_in_secs
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_gc_max_age_in_secs) {
    cJSON *blob_gc_max_age_in_secs_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_gc_max_age_in_secs);
    if(blob_gc_max_age_in_secs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "blobGcMaxAgeInSecs", blob_gc_max_age_in_secs_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_track_snapshot_interval_in_secs
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_track_snapshot_interval_in_secs) {
    cJSON *blob_track_snapshot_interval_in_secs_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_track_snapshot_interval_in_secs);
    if(blob_track_snapshot_interval_in_secs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "blobTrackSnapshotIntervalInSecs", blob_track_snapshot_interval_in_secs_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->repository_home
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->repository_home) {
    cJSON *repository_home_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->repository_home);
    if(repository_home_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "repository.home", repository_home_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->max_replication_lag_in_secs
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->max_replication_lag_in_secs) {
    cJSON *max_replication_lag_in_secs_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->max_replication_lag_in_secs);
    if(max_replication_lag_in_secs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxReplicationLagInSecs", max_replication_lag_in_secs_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->document_store_type
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->document_store_type) {
    cJSON *document_store_type_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->document_store_type);
    if(document_store_type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "documentStoreType", document_store_type_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->bundling_disabled
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->bundling_disabled) {
    cJSON *bundling_disabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->bundling_disabled);
    if(bundling_disabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "bundlingDisabled", bundling_disabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->update_limit
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->update_limit) {
    cJSON *update_limit_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->update_limit);
    if(update_limit_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "updateLimit", update_limit_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->persistent_cache_includes
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->persistent_cache_includes) {
    cJSON *persistent_cache_includes_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->persistent_cache_includes);
    if(persistent_cache_includes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "persistentCacheIncludes", persistent_cache_includes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->lease_check_mode
    if(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->lease_check_mode) {
    cJSON *lease_check_mode_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->lease_check_mode);
    if(lease_check_mode_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "leaseCheckMode", lease_check_mode_local_JSON);
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

org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_t *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON){

    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_t *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->mongouri
    config_node_property_string_t *mongouri_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->db
    config_node_property_string_t *db_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->socket_keep_alive
    config_node_property_boolean_t *socket_keep_alive_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache
    config_node_property_integer_t *cache_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->node_cache_percentage
    config_node_property_integer_t *node_cache_percentage_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->prev_doc_cache_percentage
    config_node_property_integer_t *prev_doc_cache_percentage_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->children_cache_percentage
    config_node_property_integer_t *children_cache_percentage_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->diff_cache_percentage
    config_node_property_integer_t *diff_cache_percentage_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache_segment_count
    config_node_property_integer_t *cache_segment_count_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache_stack_move_distance
    config_node_property_integer_t *cache_stack_move_distance_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_cache_size
    config_node_property_integer_t *blob_cache_size_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->persistent_cache
    config_node_property_string_t *persistent_cache_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_cache
    config_node_property_string_t *journal_cache_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->custom_blob_store
    config_node_property_boolean_t *custom_blob_store_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_gc_interval
    config_node_property_integer_t *journal_gc_interval_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_gc_max_age
    config_node_property_integer_t *journal_gc_max_age_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->prefetch_external_changes
    config_node_property_boolean_t *prefetch_external_changes_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->role
    config_node_property_string_t *role_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_max_age_in_secs
    config_node_property_integer_t *version_gc_max_age_in_secs_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_expression
    config_node_property_string_t *version_gc_expression_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_time_limit_in_secs
    config_node_property_integer_t *version_gc_time_limit_in_secs_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_gc_max_age_in_secs
    config_node_property_integer_t *blob_gc_max_age_in_secs_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_track_snapshot_interval_in_secs
    config_node_property_integer_t *blob_track_snapshot_interval_in_secs_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->repository_home
    config_node_property_string_t *repository_home_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->max_replication_lag_in_secs
    config_node_property_integer_t *max_replication_lag_in_secs_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->document_store_type
    config_node_property_drop_down_t *document_store_type_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->bundling_disabled
    config_node_property_boolean_t *bundling_disabled_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->update_limit
    config_node_property_integer_t *update_limit_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->persistent_cache_includes
    config_node_property_array_t *persistent_cache_includes_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->lease_check_mode
    config_node_property_drop_down_t *lease_check_mode_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->mongouri
    cJSON *mongouri = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "mongouri");
    if (cJSON_IsNull(mongouri)) {
        mongouri = NULL;
    }
    if (mongouri) { 
    mongouri_local_nonprim = config_node_property_string_parseFromJSON(mongouri); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->db
    cJSON *db = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "db");
    if (cJSON_IsNull(db)) {
        db = NULL;
    }
    if (db) { 
    db_local_nonprim = config_node_property_string_parseFromJSON(db); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->socket_keep_alive
    cJSON *socket_keep_alive = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "socketKeepAlive");
    if (cJSON_IsNull(socket_keep_alive)) {
        socket_keep_alive = NULL;
    }
    if (socket_keep_alive) { 
    socket_keep_alive_local_nonprim = config_node_property_boolean_parseFromJSON(socket_keep_alive); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache
    cJSON *cache = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "cache");
    if (cJSON_IsNull(cache)) {
        cache = NULL;
    }
    if (cache) { 
    cache_local_nonprim = config_node_property_integer_parseFromJSON(cache); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->node_cache_percentage
    cJSON *node_cache_percentage = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "nodeCachePercentage");
    if (cJSON_IsNull(node_cache_percentage)) {
        node_cache_percentage = NULL;
    }
    if (node_cache_percentage) { 
    node_cache_percentage_local_nonprim = config_node_property_integer_parseFromJSON(node_cache_percentage); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->prev_doc_cache_percentage
    cJSON *prev_doc_cache_percentage = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "prevDocCachePercentage");
    if (cJSON_IsNull(prev_doc_cache_percentage)) {
        prev_doc_cache_percentage = NULL;
    }
    if (prev_doc_cache_percentage) { 
    prev_doc_cache_percentage_local_nonprim = config_node_property_integer_parseFromJSON(prev_doc_cache_percentage); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->children_cache_percentage
    cJSON *children_cache_percentage = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "childrenCachePercentage");
    if (cJSON_IsNull(children_cache_percentage)) {
        children_cache_percentage = NULL;
    }
    if (children_cache_percentage) { 
    children_cache_percentage_local_nonprim = config_node_property_integer_parseFromJSON(children_cache_percentage); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->diff_cache_percentage
    cJSON *diff_cache_percentage = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "diffCachePercentage");
    if (cJSON_IsNull(diff_cache_percentage)) {
        diff_cache_percentage = NULL;
    }
    if (diff_cache_percentage) { 
    diff_cache_percentage_local_nonprim = config_node_property_integer_parseFromJSON(diff_cache_percentage); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache_segment_count
    cJSON *cache_segment_count = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "cacheSegmentCount");
    if (cJSON_IsNull(cache_segment_count)) {
        cache_segment_count = NULL;
    }
    if (cache_segment_count) { 
    cache_segment_count_local_nonprim = config_node_property_integer_parseFromJSON(cache_segment_count); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->cache_stack_move_distance
    cJSON *cache_stack_move_distance = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "cacheStackMoveDistance");
    if (cJSON_IsNull(cache_stack_move_distance)) {
        cache_stack_move_distance = NULL;
    }
    if (cache_stack_move_distance) { 
    cache_stack_move_distance_local_nonprim = config_node_property_integer_parseFromJSON(cache_stack_move_distance); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_cache_size
    cJSON *blob_cache_size = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "blobCacheSize");
    if (cJSON_IsNull(blob_cache_size)) {
        blob_cache_size = NULL;
    }
    if (blob_cache_size) { 
    blob_cache_size_local_nonprim = config_node_property_integer_parseFromJSON(blob_cache_size); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->persistent_cache
    cJSON *persistent_cache = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "persistentCache");
    if (cJSON_IsNull(persistent_cache)) {
        persistent_cache = NULL;
    }
    if (persistent_cache) { 
    persistent_cache_local_nonprim = config_node_property_string_parseFromJSON(persistent_cache); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_cache
    cJSON *journal_cache = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "journalCache");
    if (cJSON_IsNull(journal_cache)) {
        journal_cache = NULL;
    }
    if (journal_cache) { 
    journal_cache_local_nonprim = config_node_property_string_parseFromJSON(journal_cache); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->custom_blob_store
    cJSON *custom_blob_store = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "customBlobStore");
    if (cJSON_IsNull(custom_blob_store)) {
        custom_blob_store = NULL;
    }
    if (custom_blob_store) { 
    custom_blob_store_local_nonprim = config_node_property_boolean_parseFromJSON(custom_blob_store); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_gc_interval
    cJSON *journal_gc_interval = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "journalGCInterval");
    if (cJSON_IsNull(journal_gc_interval)) {
        journal_gc_interval = NULL;
    }
    if (journal_gc_interval) { 
    journal_gc_interval_local_nonprim = config_node_property_integer_parseFromJSON(journal_gc_interval); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->journal_gc_max_age
    cJSON *journal_gc_max_age = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "journalGCMaxAge");
    if (cJSON_IsNull(journal_gc_max_age)) {
        journal_gc_max_age = NULL;
    }
    if (journal_gc_max_age) { 
    journal_gc_max_age_local_nonprim = config_node_property_integer_parseFromJSON(journal_gc_max_age); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->prefetch_external_changes
    cJSON *prefetch_external_changes = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "prefetchExternalChanges");
    if (cJSON_IsNull(prefetch_external_changes)) {
        prefetch_external_changes = NULL;
    }
    if (prefetch_external_changes) { 
    prefetch_external_changes_local_nonprim = config_node_property_boolean_parseFromJSON(prefetch_external_changes); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    if (role) { 
    role_local_nonprim = config_node_property_string_parseFromJSON(role); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_max_age_in_secs
    cJSON *version_gc_max_age_in_secs = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "versionGcMaxAgeInSecs");
    if (cJSON_IsNull(version_gc_max_age_in_secs)) {
        version_gc_max_age_in_secs = NULL;
    }
    if (version_gc_max_age_in_secs) { 
    version_gc_max_age_in_secs_local_nonprim = config_node_property_integer_parseFromJSON(version_gc_max_age_in_secs); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_expression
    cJSON *version_gc_expression = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "versionGCExpression");
    if (cJSON_IsNull(version_gc_expression)) {
        version_gc_expression = NULL;
    }
    if (version_gc_expression) { 
    version_gc_expression_local_nonprim = config_node_property_string_parseFromJSON(version_gc_expression); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->version_gc_time_limit_in_secs
    cJSON *version_gc_time_limit_in_secs = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "versionGCTimeLimitInSecs");
    if (cJSON_IsNull(version_gc_time_limit_in_secs)) {
        version_gc_time_limit_in_secs = NULL;
    }
    if (version_gc_time_limit_in_secs) { 
    version_gc_time_limit_in_secs_local_nonprim = config_node_property_integer_parseFromJSON(version_gc_time_limit_in_secs); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_gc_max_age_in_secs
    cJSON *blob_gc_max_age_in_secs = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "blobGcMaxAgeInSecs");
    if (cJSON_IsNull(blob_gc_max_age_in_secs)) {
        blob_gc_max_age_in_secs = NULL;
    }
    if (blob_gc_max_age_in_secs) { 
    blob_gc_max_age_in_secs_local_nonprim = config_node_property_integer_parseFromJSON(blob_gc_max_age_in_secs); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->blob_track_snapshot_interval_in_secs
    cJSON *blob_track_snapshot_interval_in_secs = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "blobTrackSnapshotIntervalInSecs");
    if (cJSON_IsNull(blob_track_snapshot_interval_in_secs)) {
        blob_track_snapshot_interval_in_secs = NULL;
    }
    if (blob_track_snapshot_interval_in_secs) { 
    blob_track_snapshot_interval_in_secs_local_nonprim = config_node_property_integer_parseFromJSON(blob_track_snapshot_interval_in_secs); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->repository_home
    cJSON *repository_home = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "repository.home");
    if (cJSON_IsNull(repository_home)) {
        repository_home = NULL;
    }
    if (repository_home) { 
    repository_home_local_nonprim = config_node_property_string_parseFromJSON(repository_home); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->max_replication_lag_in_secs
    cJSON *max_replication_lag_in_secs = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "maxReplicationLagInSecs");
    if (cJSON_IsNull(max_replication_lag_in_secs)) {
        max_replication_lag_in_secs = NULL;
    }
    if (max_replication_lag_in_secs) { 
    max_replication_lag_in_secs_local_nonprim = config_node_property_integer_parseFromJSON(max_replication_lag_in_secs); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->document_store_type
    cJSON *document_store_type = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "documentStoreType");
    if (cJSON_IsNull(document_store_type)) {
        document_store_type = NULL;
    }
    if (document_store_type) { 
    document_store_type_local_nonprim = config_node_property_drop_down_parseFromJSON(document_store_type); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->bundling_disabled
    cJSON *bundling_disabled = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "bundlingDisabled");
    if (cJSON_IsNull(bundling_disabled)) {
        bundling_disabled = NULL;
    }
    if (bundling_disabled) { 
    bundling_disabled_local_nonprim = config_node_property_boolean_parseFromJSON(bundling_disabled); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->update_limit
    cJSON *update_limit = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "updateLimit");
    if (cJSON_IsNull(update_limit)) {
        update_limit = NULL;
    }
    if (update_limit) { 
    update_limit_local_nonprim = config_node_property_integer_parseFromJSON(update_limit); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->persistent_cache_includes
    cJSON *persistent_cache_includes = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "persistentCacheIncludes");
    if (cJSON_IsNull(persistent_cache_includes)) {
        persistent_cache_includes = NULL;
    }
    if (persistent_cache_includes) { 
    persistent_cache_includes_local_nonprim = config_node_property_array_parseFromJSON(persistent_cache_includes); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties->lease_check_mode
    cJSON *lease_check_mode = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON, "leaseCheckMode");
    if (cJSON_IsNull(lease_check_mode)) {
        lease_check_mode = NULL;
    }
    if (lease_check_mode) { 
    lease_check_mode_local_nonprim = config_node_property_drop_down_parseFromJSON(lease_check_mode); //nonprimitive
    }



    org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var = org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_create_internal (
        mongouri ? mongouri_local_nonprim : NULL,
        db ? db_local_nonprim : NULL,
        socket_keep_alive ? socket_keep_alive_local_nonprim : NULL,
        cache ? cache_local_nonprim : NULL,
        node_cache_percentage ? node_cache_percentage_local_nonprim : NULL,
        prev_doc_cache_percentage ? prev_doc_cache_percentage_local_nonprim : NULL,
        children_cache_percentage ? children_cache_percentage_local_nonprim : NULL,
        diff_cache_percentage ? diff_cache_percentage_local_nonprim : NULL,
        cache_segment_count ? cache_segment_count_local_nonprim : NULL,
        cache_stack_move_distance ? cache_stack_move_distance_local_nonprim : NULL,
        blob_cache_size ? blob_cache_size_local_nonprim : NULL,
        persistent_cache ? persistent_cache_local_nonprim : NULL,
        journal_cache ? journal_cache_local_nonprim : NULL,
        custom_blob_store ? custom_blob_store_local_nonprim : NULL,
        journal_gc_interval ? journal_gc_interval_local_nonprim : NULL,
        journal_gc_max_age ? journal_gc_max_age_local_nonprim : NULL,
        prefetch_external_changes ? prefetch_external_changes_local_nonprim : NULL,
        role ? role_local_nonprim : NULL,
        version_gc_max_age_in_secs ? version_gc_max_age_in_secs_local_nonprim : NULL,
        version_gc_expression ? version_gc_expression_local_nonprim : NULL,
        version_gc_time_limit_in_secs ? version_gc_time_limit_in_secs_local_nonprim : NULL,
        blob_gc_max_age_in_secs ? blob_gc_max_age_in_secs_local_nonprim : NULL,
        blob_track_snapshot_interval_in_secs ? blob_track_snapshot_interval_in_secs_local_nonprim : NULL,
        repository_home ? repository_home_local_nonprim : NULL,
        max_replication_lag_in_secs ? max_replication_lag_in_secs_local_nonprim : NULL,
        document_store_type ? document_store_type_local_nonprim : NULL,
        bundling_disabled ? bundling_disabled_local_nonprim : NULL,
        update_limit ? update_limit_local_nonprim : NULL,
        persistent_cache_includes ? persistent_cache_includes_local_nonprim : NULL,
        lease_check_mode ? lease_check_mode_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_local_var;
end:
    if (mongouri_local_nonprim) {
        config_node_property_string_free(mongouri_local_nonprim);
        mongouri_local_nonprim = NULL;
    }
    if (db_local_nonprim) {
        config_node_property_string_free(db_local_nonprim);
        db_local_nonprim = NULL;
    }
    if (socket_keep_alive_local_nonprim) {
        config_node_property_boolean_free(socket_keep_alive_local_nonprim);
        socket_keep_alive_local_nonprim = NULL;
    }
    if (cache_local_nonprim) {
        config_node_property_integer_free(cache_local_nonprim);
        cache_local_nonprim = NULL;
    }
    if (node_cache_percentage_local_nonprim) {
        config_node_property_integer_free(node_cache_percentage_local_nonprim);
        node_cache_percentage_local_nonprim = NULL;
    }
    if (prev_doc_cache_percentage_local_nonprim) {
        config_node_property_integer_free(prev_doc_cache_percentage_local_nonprim);
        prev_doc_cache_percentage_local_nonprim = NULL;
    }
    if (children_cache_percentage_local_nonprim) {
        config_node_property_integer_free(children_cache_percentage_local_nonprim);
        children_cache_percentage_local_nonprim = NULL;
    }
    if (diff_cache_percentage_local_nonprim) {
        config_node_property_integer_free(diff_cache_percentage_local_nonprim);
        diff_cache_percentage_local_nonprim = NULL;
    }
    if (cache_segment_count_local_nonprim) {
        config_node_property_integer_free(cache_segment_count_local_nonprim);
        cache_segment_count_local_nonprim = NULL;
    }
    if (cache_stack_move_distance_local_nonprim) {
        config_node_property_integer_free(cache_stack_move_distance_local_nonprim);
        cache_stack_move_distance_local_nonprim = NULL;
    }
    if (blob_cache_size_local_nonprim) {
        config_node_property_integer_free(blob_cache_size_local_nonprim);
        blob_cache_size_local_nonprim = NULL;
    }
    if (persistent_cache_local_nonprim) {
        config_node_property_string_free(persistent_cache_local_nonprim);
        persistent_cache_local_nonprim = NULL;
    }
    if (journal_cache_local_nonprim) {
        config_node_property_string_free(journal_cache_local_nonprim);
        journal_cache_local_nonprim = NULL;
    }
    if (custom_blob_store_local_nonprim) {
        config_node_property_boolean_free(custom_blob_store_local_nonprim);
        custom_blob_store_local_nonprim = NULL;
    }
    if (journal_gc_interval_local_nonprim) {
        config_node_property_integer_free(journal_gc_interval_local_nonprim);
        journal_gc_interval_local_nonprim = NULL;
    }
    if (journal_gc_max_age_local_nonprim) {
        config_node_property_integer_free(journal_gc_max_age_local_nonprim);
        journal_gc_max_age_local_nonprim = NULL;
    }
    if (prefetch_external_changes_local_nonprim) {
        config_node_property_boolean_free(prefetch_external_changes_local_nonprim);
        prefetch_external_changes_local_nonprim = NULL;
    }
    if (role_local_nonprim) {
        config_node_property_string_free(role_local_nonprim);
        role_local_nonprim = NULL;
    }
    if (version_gc_max_age_in_secs_local_nonprim) {
        config_node_property_integer_free(version_gc_max_age_in_secs_local_nonprim);
        version_gc_max_age_in_secs_local_nonprim = NULL;
    }
    if (version_gc_expression_local_nonprim) {
        config_node_property_string_free(version_gc_expression_local_nonprim);
        version_gc_expression_local_nonprim = NULL;
    }
    if (version_gc_time_limit_in_secs_local_nonprim) {
        config_node_property_integer_free(version_gc_time_limit_in_secs_local_nonprim);
        version_gc_time_limit_in_secs_local_nonprim = NULL;
    }
    if (blob_gc_max_age_in_secs_local_nonprim) {
        config_node_property_integer_free(blob_gc_max_age_in_secs_local_nonprim);
        blob_gc_max_age_in_secs_local_nonprim = NULL;
    }
    if (blob_track_snapshot_interval_in_secs_local_nonprim) {
        config_node_property_integer_free(blob_track_snapshot_interval_in_secs_local_nonprim);
        blob_track_snapshot_interval_in_secs_local_nonprim = NULL;
    }
    if (repository_home_local_nonprim) {
        config_node_property_string_free(repository_home_local_nonprim);
        repository_home_local_nonprim = NULL;
    }
    if (max_replication_lag_in_secs_local_nonprim) {
        config_node_property_integer_free(max_replication_lag_in_secs_local_nonprim);
        max_replication_lag_in_secs_local_nonprim = NULL;
    }
    if (document_store_type_local_nonprim) {
        config_node_property_drop_down_free(document_store_type_local_nonprim);
        document_store_type_local_nonprim = NULL;
    }
    if (bundling_disabled_local_nonprim) {
        config_node_property_boolean_free(bundling_disabled_local_nonprim);
        bundling_disabled_local_nonprim = NULL;
    }
    if (update_limit_local_nonprim) {
        config_node_property_integer_free(update_limit_local_nonprim);
        update_limit_local_nonprim = NULL;
    }
    if (persistent_cache_includes_local_nonprim) {
        config_node_property_array_free(persistent_cache_includes_local_nonprim);
        persistent_cache_includes_local_nonprim = NULL;
    }
    if (lease_check_mode_local_nonprim) {
        config_node_property_drop_down_free(lease_check_mode_local_nonprim);
        lease_check_mode_local_nonprim = NULL;
    }
    return NULL;

}
