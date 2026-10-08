/*
 * config_node_property_array.h
 *
 * 
 */

#ifndef _config_node_property_array_H_
#define _config_node_property_array_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct config_node_property_array_t config_node_property_array_t;




typedef struct config_node_property_array_t {
    char *name; // string
    int *optional; //boolean
    int *is_set; //boolean
    int *type; //numeric
    list_t *values; //primitive container
    char *description; // string

    int _library_owned; // Is the library responsible for freeing this object?
} config_node_property_array_t;

__attribute__((deprecated)) config_node_property_array_t *config_node_property_array_create(
    char *name,
    int *optional,
    int *is_set,
    int *type,
    list_t *values,
    char *description
);

void config_node_property_array_free(config_node_property_array_t *config_node_property_array);

config_node_property_array_t *config_node_property_array_parseFromJSON(cJSON *config_node_property_arrayJSON);

cJSON *config_node_property_array_convertToJSON(config_node_property_array_t *config_node_property_array);

#endif /* _config_node_property_array_H_ */

