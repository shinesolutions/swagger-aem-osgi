/*
 * com_adobe_granite_analyzer_base_system_status_servlet_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_analyzer_base_system_status_servlet_properties_H_
#define _com_adobe_granite_analyzer_base_system_status_servlet_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_analyzer_base_system_status_servlet_properties_t com_adobe_granite_analyzer_base_system_status_servlet_properties_t;

#include "config_node_property_boolean.h"



typedef struct com_adobe_granite_analyzer_base_system_status_servlet_properties_t {
    struct config_node_property_boolean_t *disabled; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_analyzer_base_system_status_servlet_properties_t;

__attribute__((deprecated)) com_adobe_granite_analyzer_base_system_status_servlet_properties_t *com_adobe_granite_analyzer_base_system_status_servlet_properties_create(
    config_node_property_boolean_t *disabled
);

void com_adobe_granite_analyzer_base_system_status_servlet_properties_free(com_adobe_granite_analyzer_base_system_status_servlet_properties_t *com_adobe_granite_analyzer_base_system_status_servlet_properties);

com_adobe_granite_analyzer_base_system_status_servlet_properties_t *com_adobe_granite_analyzer_base_system_status_servlet_properties_parseFromJSON(cJSON *com_adobe_granite_analyzer_base_system_status_servlet_propertiesJSON);

cJSON *com_adobe_granite_analyzer_base_system_status_servlet_properties_convertToJSON(com_adobe_granite_analyzer_base_system_status_servlet_properties_t *com_adobe_granite_analyzer_base_system_status_servlet_properties);

#endif /* _com_adobe_granite_analyzer_base_system_status_servlet_properties_H_ */

