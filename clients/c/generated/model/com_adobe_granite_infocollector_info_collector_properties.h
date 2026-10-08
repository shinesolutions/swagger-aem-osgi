/*
 * com_adobe_granite_infocollector_info_collector_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_infocollector_info_collector_properties_H_
#define _com_adobe_granite_infocollector_info_collector_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_infocollector_info_collector_properties_t com_adobe_granite_infocollector_info_collector_properties_t;

#include "config_node_property_boolean.h"



typedef struct com_adobe_granite_infocollector_info_collector_properties_t {
    struct config_node_property_boolean_t *granite_infocollector_include_thread_dumps; //model
    struct config_node_property_boolean_t *granite_infocollector_include_heap_dump; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_infocollector_info_collector_properties_t;

__attribute__((deprecated)) com_adobe_granite_infocollector_info_collector_properties_t *com_adobe_granite_infocollector_info_collector_properties_create(
    config_node_property_boolean_t *granite_infocollector_include_thread_dumps,
    config_node_property_boolean_t *granite_infocollector_include_heap_dump
);

void com_adobe_granite_infocollector_info_collector_properties_free(com_adobe_granite_infocollector_info_collector_properties_t *com_adobe_granite_infocollector_info_collector_properties);

com_adobe_granite_infocollector_info_collector_properties_t *com_adobe_granite_infocollector_info_collector_properties_parseFromJSON(cJSON *com_adobe_granite_infocollector_info_collector_propertiesJSON);

cJSON *com_adobe_granite_infocollector_info_collector_properties_convertToJSON(com_adobe_granite_infocollector_info_collector_properties_t *com_adobe_granite_infocollector_info_collector_properties);

#endif /* _com_adobe_granite_infocollector_info_collector_properties_H_ */

