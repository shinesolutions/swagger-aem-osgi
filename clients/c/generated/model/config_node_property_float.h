/*
 * config_node_property_float.h
 *
 * 
 */

#ifndef _config_node_property_float_H_
#define _config_node_property_float_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct config_node_property_float_t config_node_property_float_t;




typedef struct config_node_property_float_t {
    char *name; // string
    int *optional; //boolean
    int *is_set; //boolean
    int *type; //numeric
    double *value; //numeric
    char *description; // string

    int _library_owned; // Is the library responsible for freeing this object?
} config_node_property_float_t;

__attribute__((deprecated)) config_node_property_float_t *config_node_property_float_create(
    char *name,
    int *optional,
    int *is_set,
    int *type,
    double *value,
    char *description
);

void config_node_property_float_free(config_node_property_float_t *config_node_property_float);

config_node_property_float_t *config_node_property_float_parseFromJSON(cJSON *config_node_property_floatJSON);

cJSON *config_node_property_float_convertToJSON(config_node_property_float_t *config_node_property_float);

#endif /* _config_node_property_float_H_ */

