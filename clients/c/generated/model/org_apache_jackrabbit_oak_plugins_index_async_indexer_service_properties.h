/*
 * org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties.h
 *
 * 
 */

#ifndef _org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_H_
#define _org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_t org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_integer.h"



typedef struct org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_t {
    struct config_node_property_array_t *async_configs; //model
    struct config_node_property_integer_t *lease_time_out_minutes; //model
    struct config_node_property_integer_t *failing_index_timeout_seconds; //model
    struct config_node_property_integer_t *error_warn_interval_seconds; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_t;

__attribute__((deprecated)) org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_t *org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_create(
    config_node_property_array_t *async_configs,
    config_node_property_integer_t *lease_time_out_minutes,
    config_node_property_integer_t *failing_index_timeout_seconds,
    config_node_property_integer_t *error_warn_interval_seconds
);

void org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_free(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_t *org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties);

org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_t *org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_plugins_index_async_indexer_service_propertiesJSON);

cJSON *org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_convertToJSON(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_t *org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties);

#endif /* _org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_H_ */

