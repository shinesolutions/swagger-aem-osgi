/*
 * org_apache_sling_engine_impl_sling_main_servlet_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_engine_impl_sling_main_servlet_properties_H_
#define _org_apache_sling_engine_impl_sling_main_servlet_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_engine_impl_sling_main_servlet_properties_t org_apache_sling_engine_impl_sling_main_servlet_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_engine_impl_sling_main_servlet_properties_t {
    struct config_node_property_integer_t *sling_max_calls; //model
    struct config_node_property_integer_t *sling_max_inclusions; //model
    struct config_node_property_boolean_t *sling_trace_allow; //model
    struct config_node_property_integer_t *sling_max_record_requests; //model
    struct config_node_property_array_t *sling_store_pattern_requests; //model
    struct config_node_property_string_t *sling_serverinfo; //model
    struct config_node_property_array_t *sling_additional_response_headers; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_engine_impl_sling_main_servlet_properties_t;

__attribute__((deprecated)) org_apache_sling_engine_impl_sling_main_servlet_properties_t *org_apache_sling_engine_impl_sling_main_servlet_properties_create(
    config_node_property_integer_t *sling_max_calls,
    config_node_property_integer_t *sling_max_inclusions,
    config_node_property_boolean_t *sling_trace_allow,
    config_node_property_integer_t *sling_max_record_requests,
    config_node_property_array_t *sling_store_pattern_requests,
    config_node_property_string_t *sling_serverinfo,
    config_node_property_array_t *sling_additional_response_headers
);

void org_apache_sling_engine_impl_sling_main_servlet_properties_free(org_apache_sling_engine_impl_sling_main_servlet_properties_t *org_apache_sling_engine_impl_sling_main_servlet_properties);

org_apache_sling_engine_impl_sling_main_servlet_properties_t *org_apache_sling_engine_impl_sling_main_servlet_properties_parseFromJSON(cJSON *org_apache_sling_engine_impl_sling_main_servlet_propertiesJSON);

cJSON *org_apache_sling_engine_impl_sling_main_servlet_properties_convertToJSON(org_apache_sling_engine_impl_sling_main_servlet_properties_t *org_apache_sling_engine_impl_sling_main_servlet_properties);

#endif /* _org_apache_sling_engine_impl_sling_main_servlet_properties_H_ */

