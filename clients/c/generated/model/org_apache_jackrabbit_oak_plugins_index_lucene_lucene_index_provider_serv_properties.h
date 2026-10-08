/*
 * org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties.h
 *
 * 
 */

#ifndef _org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_H_
#define _org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_t org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_t {
    struct config_node_property_boolean_t *disabled; //model
    struct config_node_property_boolean_t *debug; //model
    struct config_node_property_string_t *local_index_dir; //model
    struct config_node_property_boolean_t *enable_open_index_async; //model
    struct config_node_property_integer_t *thread_pool_size; //model
    struct config_node_property_boolean_t *prefetch_index_files; //model
    struct config_node_property_integer_t *extracted_text_cache_size_in_mb; //model
    struct config_node_property_integer_t *extracted_text_cache_expiry_in_secs; //model
    struct config_node_property_boolean_t *always_use_pre_extracted_cache; //model
    struct config_node_property_integer_t *boolean_clause_limit; //model
    struct config_node_property_boolean_t *enable_hybrid_indexing; //model
    struct config_node_property_integer_t *hybrid_queue_size; //model
    struct config_node_property_boolean_t *disable_stored_index_definition; //model
    struct config_node_property_boolean_t *deleted_blobs_collection_enabled; //model
    struct config_node_property_integer_t *prop_index_cleaner_interval_in_secs; //model
    struct config_node_property_boolean_t *enable_single_blob_index_files; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_t;

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
);

void org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_free(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_t *org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties);

org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_t *org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_propertiesJSON);

cJSON *org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_convertToJSON(org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_t *org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties);

#endif /* _org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_properties_H_ */

