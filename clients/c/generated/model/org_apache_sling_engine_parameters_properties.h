/*
 * org_apache_sling_engine_parameters_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_engine_parameters_properties_H_
#define _org_apache_sling_engine_parameters_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_engine_parameters_properties_t org_apache_sling_engine_parameters_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_engine_parameters_properties_t {
    struct config_node_property_string_t *sling_default_parameter_encoding; //model
    struct config_node_property_integer_t *sling_default_max_parameters; //model
    struct config_node_property_string_t *file_location; //model
    struct config_node_property_integer_t *file_threshold; //model
    struct config_node_property_integer_t *file_max; //model
    struct config_node_property_integer_t *request_max; //model
    struct config_node_property_boolean_t *sling_default_parameter_check_for_additional_container_parameters; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_engine_parameters_properties_t;

__attribute__((deprecated)) org_apache_sling_engine_parameters_properties_t *org_apache_sling_engine_parameters_properties_create(
    config_node_property_string_t *sling_default_parameter_encoding,
    config_node_property_integer_t *sling_default_max_parameters,
    config_node_property_string_t *file_location,
    config_node_property_integer_t *file_threshold,
    config_node_property_integer_t *file_max,
    config_node_property_integer_t *request_max,
    config_node_property_boolean_t *sling_default_parameter_check_for_additional_container_parameters
);

void org_apache_sling_engine_parameters_properties_free(org_apache_sling_engine_parameters_properties_t *org_apache_sling_engine_parameters_properties);

org_apache_sling_engine_parameters_properties_t *org_apache_sling_engine_parameters_properties_parseFromJSON(cJSON *org_apache_sling_engine_parameters_propertiesJSON);

cJSON *org_apache_sling_engine_parameters_properties_convertToJSON(org_apache_sling_engine_parameters_properties_t *org_apache_sling_engine_parameters_properties);

#endif /* _org_apache_sling_engine_parameters_properties_H_ */

