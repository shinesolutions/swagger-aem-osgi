/*
 * config_node_property_drop_down.h
 *
 * 
 */

#ifndef _config_node_property_drop_down_H_
#define _config_node_property_drop_down_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct config_node_property_drop_down_t config_node_property_drop_down_t;

#include "any_type.h"
#include "config_node_property_drop_down_type.h"



typedef struct config_node_property_drop_down_t {
    char *name; // string
    int *optional; //boolean
    int *is_set; //boolean
    struct config_node_property_drop_down_type_t *type; //model
    any_type_t *value; // custom
    char *description; // string

    int _library_owned; // Is the library responsible for freeing this object?
} config_node_property_drop_down_t;

__attribute__((deprecated)) config_node_property_drop_down_t *config_node_property_drop_down_create(
    char *name,
    int *optional,
    int *is_set,
    config_node_property_drop_down_type_t *type,
    any_type_t *value,
    char *description
);

void config_node_property_drop_down_free(config_node_property_drop_down_t *config_node_property_drop_down);

config_node_property_drop_down_t *config_node_property_drop_down_parseFromJSON(cJSON *config_node_property_drop_downJSON);

cJSON *config_node_property_drop_down_convertToJSON(config_node_property_drop_down_t *config_node_property_drop_down);

#endif /* _config_node_property_drop_down_H_ */

