/*
 * com_adobe_granite_cors_impl_cors_policy_impl_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_cors_impl_cors_policy_impl_properties_H_
#define _com_adobe_granite_cors_impl_cors_policy_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_cors_impl_cors_policy_impl_properties_t com_adobe_granite_cors_impl_cors_policy_impl_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"



typedef struct com_adobe_granite_cors_impl_cors_policy_impl_properties_t {
    struct config_node_property_array_t *alloworigin; //model
    struct config_node_property_array_t *alloworiginregexp; //model
    struct config_node_property_array_t *allowedpaths; //model
    struct config_node_property_array_t *exposedheaders; //model
    struct config_node_property_integer_t *maxage; //model
    struct config_node_property_array_t *supportedheaders; //model
    struct config_node_property_array_t *supportedmethods; //model
    struct config_node_property_boolean_t *supportscredentials; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_cors_impl_cors_policy_impl_properties_t;

__attribute__((deprecated)) com_adobe_granite_cors_impl_cors_policy_impl_properties_t *com_adobe_granite_cors_impl_cors_policy_impl_properties_create(
    config_node_property_array_t *alloworigin,
    config_node_property_array_t *alloworiginregexp,
    config_node_property_array_t *allowedpaths,
    config_node_property_array_t *exposedheaders,
    config_node_property_integer_t *maxage,
    config_node_property_array_t *supportedheaders,
    config_node_property_array_t *supportedmethods,
    config_node_property_boolean_t *supportscredentials
);

void com_adobe_granite_cors_impl_cors_policy_impl_properties_free(com_adobe_granite_cors_impl_cors_policy_impl_properties_t *com_adobe_granite_cors_impl_cors_policy_impl_properties);

com_adobe_granite_cors_impl_cors_policy_impl_properties_t *com_adobe_granite_cors_impl_cors_policy_impl_properties_parseFromJSON(cJSON *com_adobe_granite_cors_impl_cors_policy_impl_propertiesJSON);

cJSON *com_adobe_granite_cors_impl_cors_policy_impl_properties_convertToJSON(com_adobe_granite_cors_impl_cors_policy_impl_properties_t *com_adobe_granite_cors_impl_cors_policy_impl_properties);

#endif /* _com_adobe_granite_cors_impl_cors_policy_impl_properties_H_ */

