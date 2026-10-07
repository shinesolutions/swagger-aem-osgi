/*
 * messaging_user_component_factory_properties.h
 *
 * 
 */

#ifndef _messaging_user_component_factory_properties_H_
#define _messaging_user_component_factory_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct messaging_user_component_factory_properties_t messaging_user_component_factory_properties_t;

#include "config_node_property_integer.h"



typedef struct messaging_user_component_factory_properties_t {
    struct config_node_property_integer_t *priority; //model

    int _library_owned; // Is the library responsible for freeing this object?
} messaging_user_component_factory_properties_t;

__attribute__((deprecated)) messaging_user_component_factory_properties_t *messaging_user_component_factory_properties_create(
    config_node_property_integer_t *priority
);

void messaging_user_component_factory_properties_free(messaging_user_component_factory_properties_t *messaging_user_component_factory_properties);

messaging_user_component_factory_properties_t *messaging_user_component_factory_properties_parseFromJSON(cJSON *messaging_user_component_factory_propertiesJSON);

cJSON *messaging_user_component_factory_properties_convertToJSON(messaging_user_component_factory_properties_t *messaging_user_component_factory_properties);

#endif /* _messaging_user_component_factory_properties_H_ */

