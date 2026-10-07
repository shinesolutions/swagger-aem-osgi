/*
 * org_apache_sling_tracer_internal_log_tracer_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_tracer_internal_log_tracer_properties_H_
#define _org_apache_sling_tracer_internal_log_tracer_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_tracer_internal_log_tracer_properties_t org_apache_sling_tracer_internal_log_tracer_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"



typedef struct org_apache_sling_tracer_internal_log_tracer_properties_t {
    struct config_node_property_array_t *tracer_sets; //model
    struct config_node_property_boolean_t *enabled; //model
    struct config_node_property_boolean_t *servlet_enabled; //model
    struct config_node_property_integer_t *recording_cache_size_in_mb; //model
    struct config_node_property_integer_t *recording_cache_duration_in_secs; //model
    struct config_node_property_boolean_t *recording_compression_enabled; //model
    struct config_node_property_boolean_t *gzip_response; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_tracer_internal_log_tracer_properties_t;

__attribute__((deprecated)) org_apache_sling_tracer_internal_log_tracer_properties_t *org_apache_sling_tracer_internal_log_tracer_properties_create(
    config_node_property_array_t *tracer_sets,
    config_node_property_boolean_t *enabled,
    config_node_property_boolean_t *servlet_enabled,
    config_node_property_integer_t *recording_cache_size_in_mb,
    config_node_property_integer_t *recording_cache_duration_in_secs,
    config_node_property_boolean_t *recording_compression_enabled,
    config_node_property_boolean_t *gzip_response
);

void org_apache_sling_tracer_internal_log_tracer_properties_free(org_apache_sling_tracer_internal_log_tracer_properties_t *org_apache_sling_tracer_internal_log_tracer_properties);

org_apache_sling_tracer_internal_log_tracer_properties_t *org_apache_sling_tracer_internal_log_tracer_properties_parseFromJSON(cJSON *org_apache_sling_tracer_internal_log_tracer_propertiesJSON);

cJSON *org_apache_sling_tracer_internal_log_tracer_properties_convertToJSON(org_apache_sling_tracer_internal_log_tracer_properties_t *org_apache_sling_tracer_internal_log_tracer_properties);

#endif /* _org_apache_sling_tracer_internal_log_tracer_properties_H_ */

