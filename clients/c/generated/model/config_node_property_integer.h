/*
 * config_node_property_integer.h
 *
 * 
 */

#ifndef _config_node_property_integer_H_
#define _config_node_property_integer_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct config_node_property_integer_t config_node_property_integer_t;




typedef struct config_node_property_integer_t {
    char *name; // string
    int *optional; //boolean
    int *is_set; //boolean
    int *type; //numeric
    int *value; //numeric
    char *description; // string

    int _library_owned; // Is the library responsible for freeing this object?
} config_node_property_integer_t;

__attribute__((deprecated)) config_node_property_integer_t *config_node_property_integer_create(
    char *name,
    int *optional,
    int *is_set,
    int *type,
    int *value,
    char *description
);

void config_node_property_integer_free(config_node_property_integer_t *config_node_property_integer);

config_node_property_integer_t *config_node_property_integer_parseFromJSON(cJSON *config_node_property_integerJSON);

cJSON *config_node_property_integer_convertToJSON(config_node_property_integer_t *config_node_property_integer);

#endif /* _config_node_property_integer_H_ */

