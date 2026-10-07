/*
 * config_node_property_drop_down_type.h
 *
 * 
 */

#ifndef _config_node_property_drop_down_type_H_
#define _config_node_property_drop_down_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct config_node_property_drop_down_type_t config_node_property_drop_down_type_t;

#include "any_type.h"



typedef struct config_node_property_drop_down_type_t {
    any_type_t *labels; // custom
    any_type_t *values; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} config_node_property_drop_down_type_t;

__attribute__((deprecated)) config_node_property_drop_down_type_t *config_node_property_drop_down_type_create(
    any_type_t *labels,
    any_type_t *values
);

void config_node_property_drop_down_type_free(config_node_property_drop_down_type_t *config_node_property_drop_down_type);

config_node_property_drop_down_type_t *config_node_property_drop_down_type_parseFromJSON(cJSON *config_node_property_drop_down_typeJSON);

cJSON *config_node_property_drop_down_type_convertToJSON(config_node_property_drop_down_type_t *config_node_property_drop_down_type);

#endif /* _config_node_property_drop_down_type_H_ */

