/*
 * org_apache_jackrabbit_oak_segment_segment_node_store_service_properties.h
 *
 * 
 */

#ifndef _org_apache_jackrabbit_oak_segment_segment_node_store_service_properties_H_
#define _org_apache_jackrabbit_oak_segment_segment_node_store_service_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_jackrabbit_oak_segment_segment_node_store_service_properties_t org_apache_jackrabbit_oak_segment_segment_node_store_service_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_jackrabbit_oak_segment_segment_node_store_service_properties_t {
    struct config_node_property_string_t *repository_home; //model
    struct config_node_property_string_t *tarmk_mode; //model
    struct config_node_property_integer_t *tarmk_size; //model
    struct config_node_property_integer_t *segment_cache_size; //model
    struct config_node_property_integer_t *string_cache_size; //model
    struct config_node_property_integer_t *template_cache_size; //model
    struct config_node_property_integer_t *string_deduplication_cache_size; //model
    struct config_node_property_integer_t *template_deduplication_cache_size; //model
    struct config_node_property_integer_t *node_deduplication_cache_size; //model
    struct config_node_property_boolean_t *pause_compaction; //model
    struct config_node_property_integer_t *compaction_retry_count; //model
    struct config_node_property_integer_t *compaction_force_timeout; //model
    struct config_node_property_integer_t *compaction_size_delta_estimation; //model
    struct config_node_property_boolean_t *compaction_disable_estimation; //model
    struct config_node_property_integer_t *compaction_retained_generations; //model
    struct config_node_property_integer_t *compaction_memory_threshold; //model
    struct config_node_property_integer_t *compaction_progress_log; //model
    struct config_node_property_boolean_t *standby; //model
    struct config_node_property_boolean_t *custom_blob_store; //model
    struct config_node_property_boolean_t *custom_segment_store; //model
    struct config_node_property_boolean_t *split_persistence; //model
    struct config_node_property_string_t *repository_backup_dir; //model
    struct config_node_property_integer_t *blob_gc_max_age_in_secs; //model
    struct config_node_property_integer_t *blob_track_snapshot_interval_in_secs; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_jackrabbit_oak_segment_segment_node_store_service_properties_t;

__attribute__((deprecated)) org_apache_jackrabbit_oak_segment_segment_node_store_service_properties_t *org_apache_jackrabbit_oak_segment_segment_node_store_service_properties_create(
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
    config_node_property_integer_t *blob_track_snapshot_interval_in_secs
);

void org_apache_jackrabbit_oak_segment_segment_node_store_service_properties_free(org_apache_jackrabbit_oak_segment_segment_node_store_service_properties_t *org_apache_jackrabbit_oak_segment_segment_node_store_service_properties);

org_apache_jackrabbit_oak_segment_segment_node_store_service_properties_t *org_apache_jackrabbit_oak_segment_segment_node_store_service_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_segment_segment_node_store_service_propertiesJSON);

cJSON *org_apache_jackrabbit_oak_segment_segment_node_store_service_properties_convertToJSON(org_apache_jackrabbit_oak_segment_segment_node_store_service_properties_t *org_apache_jackrabbit_oak_segment_segment_node_store_service_properties);

#endif /* _org_apache_jackrabbit_oak_segment_segment_node_store_service_properties_H_ */

