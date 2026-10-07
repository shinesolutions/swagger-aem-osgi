/*
 * config_node_property_string.h
 *
 * 
 */

#ifndef _config_node_property_string_H_
#define _config_node_property_string_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct config_node_property_string_t config_node_property_string_t;




typedef struct config_node_property_string_t {
    char *name; // string
    int *optional; //boolean
    int *is_set; //boolean
    int *type; //numeric
    char *value; // string
    char *description; // string

    int _library_owned; // Is the library responsible for freeing this object?
} config_node_property_string_t;

__attribute__((deprecated)) config_node_property_string_t *config_node_property_string_create(
    char *name,
    int *optional,
    int *is_set,
    int *type,
    char *value,
    char *description
);

void config_node_property_string_free(config_node_property_string_t *config_node_property_string);

config_node_property_string_t *config_node_property_string_parseFromJSON(cJSON *config_node_property_stringJSON);

cJSON *config_node_property_string_convertToJSON(config_node_property_string_t *config_node_property_string);

#endif /* _config_node_property_string_H_ */

