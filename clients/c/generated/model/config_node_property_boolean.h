/*
 * config_node_property_boolean.h
 *
 * 
 */

#ifndef _config_node_property_boolean_H_
#define _config_node_property_boolean_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct config_node_property_boolean_t config_node_property_boolean_t;




typedef struct config_node_property_boolean_t {
    char *name; // string
    int *optional; //boolean
    int *is_set; //boolean
    int *type; //numeric
    int *value; //boolean
    char *description; // string

    int _library_owned; // Is the library responsible for freeing this object?
} config_node_property_boolean_t;

__attribute__((deprecated)) config_node_property_boolean_t *config_node_property_boolean_create(
    char *name,
    int *optional,
    int *is_set,
    int *type,
    int *value,
    char *description
);

void config_node_property_boolean_free(config_node_property_boolean_t *config_node_property_boolean);

config_node_property_boolean_t *config_node_property_boolean_parseFromJSON(cJSON *config_node_property_booleanJSON);

cJSON *config_node_property_boolean_convertToJSON(config_node_property_boolean_t *config_node_property_boolean);

#endif /* _config_node_property_boolean_H_ */

