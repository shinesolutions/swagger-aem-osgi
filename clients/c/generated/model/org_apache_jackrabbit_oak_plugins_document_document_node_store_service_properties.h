/*
 * org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties.h
 *
 * 
 */

#ifndef _org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_H_
#define _org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_t org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_t {
    struct config_node_property_string_t *mongouri; //model
    struct config_node_property_string_t *db; //model
    struct config_node_property_boolean_t *socket_keep_alive; //model
    struct config_node_property_integer_t *cache; //model
    struct config_node_property_integer_t *node_cache_percentage; //model
    struct config_node_property_integer_t *prev_doc_cache_percentage; //model
    struct config_node_property_integer_t *children_cache_percentage; //model
    struct config_node_property_integer_t *diff_cache_percentage; //model
    struct config_node_property_integer_t *cache_segment_count; //model
    struct config_node_property_integer_t *cache_stack_move_distance; //model
    struct config_node_property_integer_t *blob_cache_size; //model
    struct config_node_property_string_t *persistent_cache; //model
    struct config_node_property_string_t *journal_cache; //model
    struct config_node_property_boolean_t *custom_blob_store; //model
    struct config_node_property_integer_t *journal_gc_interval; //model
    struct config_node_property_integer_t *journal_gc_max_age; //model
    struct config_node_property_boolean_t *prefetch_external_changes; //model
    struct config_node_property_string_t *role; //model
    struct config_node_property_integer_t *version_gc_max_age_in_secs; //model
    struct config_node_property_string_t *version_gc_expression; //model
    struct config_node_property_integer_t *version_gc_time_limit_in_secs; //model
    struct config_node_property_integer_t *blob_gc_max_age_in_secs; //model
    struct config_node_property_integer_t *blob_track_snapshot_interval_in_secs; //model
    struct config_node_property_string_t *repository_home; //model
    struct config_node_property_integer_t *max_replication_lag_in_secs; //model
    struct config_node_property_drop_down_t *document_store_type; //model
    struct config_node_property_boolean_t *bundling_disabled; //model
    struct config_node_property_integer_t *update_limit; //model
    struct config_node_property_array_t *persistent_cache_includes; //model
    struct config_node_property_drop_down_t *lease_check_mode; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_t;

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
);

void org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_free(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_t *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties);

org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_t *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_propertiesJSON);

cJSON *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_convertToJSON(org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_t *org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties);

#endif /* _org_apache_jackrabbit_oak_plugins_document_document_node_store_service_properties_H_ */

