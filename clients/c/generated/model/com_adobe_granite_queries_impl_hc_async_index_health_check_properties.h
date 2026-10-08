/*
 * com_adobe_granite_queries_impl_hc_async_index_health_check_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_queries_impl_hc_async_index_health_check_properties_H_
#define _com_adobe_granite_queries_impl_hc_async_index_health_check_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_queries_impl_hc_async_index_health_check_properties_t com_adobe_granite_queries_impl_hc_async_index_health_check_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_integer.h"



typedef struct com_adobe_granite_queries_impl_hc_async_index_health_check_properties_t {
    struct config_node_property_integer_t *indexing_critical_threshold; //model
    struct config_node_property_integer_t *indexing_warn_threshold; //model
    struct config_node_property_array_t *hc_tags; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_queries_impl_hc_async_index_health_check_properties_t;

__attribute__((deprecated)) com_adobe_granite_queries_impl_hc_async_index_health_check_properties_t *com_adobe_granite_queries_impl_hc_async_index_health_check_properties_create(
    config_node_property_integer_t *indexing_critical_threshold,
    config_node_property_integer_t *indexing_warn_threshold,
    config_node_property_array_t *hc_tags
);

void com_adobe_granite_queries_impl_hc_async_index_health_check_properties_free(com_adobe_granite_queries_impl_hc_async_index_health_check_properties_t *com_adobe_granite_queries_impl_hc_async_index_health_check_properties);

com_adobe_granite_queries_impl_hc_async_index_health_check_properties_t *com_adobe_granite_queries_impl_hc_async_index_health_check_properties_parseFromJSON(cJSON *com_adobe_granite_queries_impl_hc_async_index_health_check_propertiesJSON);

cJSON *com_adobe_granite_queries_impl_hc_async_index_health_check_properties_convertToJSON(com_adobe_granite_queries_impl_hc_async_index_health_check_properties_t *com_adobe_granite_queries_impl_hc_async_index_health_check_properties);

#endif /* _com_adobe_granite_queries_impl_hc_async_index_health_check_properties_H_ */

