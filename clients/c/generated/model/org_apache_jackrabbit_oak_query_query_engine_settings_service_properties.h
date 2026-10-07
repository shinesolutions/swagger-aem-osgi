/*
 * org_apache_jackrabbit_oak_query_query_engine_settings_service_properties.h
 *
 * 
 */

#ifndef _org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_H_
#define _org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_t org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"



typedef struct org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_t {
    struct config_node_property_integer_t *query_limit_in_memory; //model
    struct config_node_property_integer_t *query_limit_reads; //model
    struct config_node_property_boolean_t *query_fail_traversal; //model
    struct config_node_property_boolean_t *fast_query_size; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_t;

__attribute__((deprecated)) org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_t *org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_create(
    config_node_property_integer_t *query_limit_in_memory,
    config_node_property_integer_t *query_limit_reads,
    config_node_property_boolean_t *query_fail_traversal,
    config_node_property_boolean_t *fast_query_size
);

void org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_free(org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_t *org_apache_jackrabbit_oak_query_query_engine_settings_service_properties);

org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_t *org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_query_query_engine_settings_service_propertiesJSON);

cJSON *org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_convertToJSON(org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_t *org_apache_jackrabbit_oak_query_query_engine_settings_service_properties);

#endif /* _org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_H_ */

