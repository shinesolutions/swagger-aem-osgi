/*
 * analytics_component_query_cache_service_properties.h
 *
 * 
 */

#ifndef _analytics_component_query_cache_service_properties_H_
#define _analytics_component_query_cache_service_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct analytics_component_query_cache_service_properties_t analytics_component_query_cache_service_properties_t;

#include "config_node_property_integer.h"



typedef struct analytics_component_query_cache_service_properties_t {
    struct config_node_property_integer_t *cq_analytics_component_query_cache_size; //model

    int _library_owned; // Is the library responsible for freeing this object?
} analytics_component_query_cache_service_properties_t;

__attribute__((deprecated)) analytics_component_query_cache_service_properties_t *analytics_component_query_cache_service_properties_create(
    config_node_property_integer_t *cq_analytics_component_query_cache_size
);

void analytics_component_query_cache_service_properties_free(analytics_component_query_cache_service_properties_t *analytics_component_query_cache_service_properties);

analytics_component_query_cache_service_properties_t *analytics_component_query_cache_service_properties_parseFromJSON(cJSON *analytics_component_query_cache_service_propertiesJSON);

cJSON *analytics_component_query_cache_service_properties_convertToJSON(analytics_component_query_cache_service_properties_t *analytics_component_query_cache_service_properties);

#endif /* _analytics_component_query_cache_service_properties_H_ */

