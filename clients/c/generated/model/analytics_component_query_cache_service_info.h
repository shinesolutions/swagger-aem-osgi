/*
 * analytics_component_query_cache_service_info.h
 *
 * 
 */

#ifndef _analytics_component_query_cache_service_info_H_
#define _analytics_component_query_cache_service_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct analytics_component_query_cache_service_info_t analytics_component_query_cache_service_info_t;

#include "analytics_component_query_cache_service_properties.h"



typedef struct analytics_component_query_cache_service_info_t {
    char *pid; // string
    char *title; // string
    char *description; // string
    struct analytics_component_query_cache_service_properties_t *properties; //model

    int _library_owned; // Is the library responsible for freeing this object?
} analytics_component_query_cache_service_info_t;

__attribute__((deprecated)) analytics_component_query_cache_service_info_t *analytics_component_query_cache_service_info_create(
    char *pid,
    char *title,
    char *description,
    analytics_component_query_cache_service_properties_t *properties
);

void analytics_component_query_cache_service_info_free(analytics_component_query_cache_service_info_t *analytics_component_query_cache_service_info);

analytics_component_query_cache_service_info_t *analytics_component_query_cache_service_info_parseFromJSON(cJSON *analytics_component_query_cache_service_infoJSON);

cJSON *analytics_component_query_cache_service_info_convertToJSON(analytics_component_query_cache_service_info_t *analytics_component_query_cache_service_info);

#endif /* _analytics_component_query_cache_service_info_H_ */

