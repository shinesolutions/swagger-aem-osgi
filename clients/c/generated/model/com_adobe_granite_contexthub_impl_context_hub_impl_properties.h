/*
 * com_adobe_granite_contexthub_impl_context_hub_impl_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_contexthub_impl_context_hub_impl_properties_H_
#define _com_adobe_granite_contexthub_impl_context_hub_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_contexthub_impl_context_hub_impl_properties_t com_adobe_granite_contexthub_impl_context_hub_impl_properties_t;

#include "config_node_property_boolean.h"



typedef struct com_adobe_granite_contexthub_impl_context_hub_impl_properties_t {
    struct config_node_property_boolean_t *com_adobe_granite_contexthub_silent_mode; //model
    struct config_node_property_boolean_t *com_adobe_granite_contexthub_show_ui; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_contexthub_impl_context_hub_impl_properties_t;

__attribute__((deprecated)) com_adobe_granite_contexthub_impl_context_hub_impl_properties_t *com_adobe_granite_contexthub_impl_context_hub_impl_properties_create(
    config_node_property_boolean_t *com_adobe_granite_contexthub_silent_mode,
    config_node_property_boolean_t *com_adobe_granite_contexthub_show_ui
);

void com_adobe_granite_contexthub_impl_context_hub_impl_properties_free(com_adobe_granite_contexthub_impl_context_hub_impl_properties_t *com_adobe_granite_contexthub_impl_context_hub_impl_properties);

com_adobe_granite_contexthub_impl_context_hub_impl_properties_t *com_adobe_granite_contexthub_impl_context_hub_impl_properties_parseFromJSON(cJSON *com_adobe_granite_contexthub_impl_context_hub_impl_propertiesJSON);

cJSON *com_adobe_granite_contexthub_impl_context_hub_impl_properties_convertToJSON(com_adobe_granite_contexthub_impl_context_hub_impl_properties_t *com_adobe_granite_contexthub_impl_context_hub_impl_properties);

#endif /* _com_adobe_granite_contexthub_impl_context_hub_impl_properties_H_ */

