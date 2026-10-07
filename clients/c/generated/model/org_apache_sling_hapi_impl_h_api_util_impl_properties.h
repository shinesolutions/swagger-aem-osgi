/*
 * org_apache_sling_hapi_impl_h_api_util_impl_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_hapi_impl_h_api_util_impl_properties_H_
#define _org_apache_sling_hapi_impl_h_api_util_impl_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_hapi_impl_h_api_util_impl_properties_t org_apache_sling_hapi_impl_h_api_util_impl_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_hapi_impl_h_api_util_impl_properties_t {
    struct config_node_property_string_t *org_apache_sling_hapi_tools_resourcetype; //model
    struct config_node_property_string_t *org_apache_sling_hapi_tools_collectionresourcetype; //model
    struct config_node_property_array_t *org_apache_sling_hapi_tools_searchpaths; //model
    struct config_node_property_string_t *org_apache_sling_hapi_tools_externalurl; //model
    struct config_node_property_boolean_t *org_apache_sling_hapi_tools_enabled; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_hapi_impl_h_api_util_impl_properties_t;

__attribute__((deprecated)) org_apache_sling_hapi_impl_h_api_util_impl_properties_t *org_apache_sling_hapi_impl_h_api_util_impl_properties_create(
    config_node_property_string_t *org_apache_sling_hapi_tools_resourcetype,
    config_node_property_string_t *org_apache_sling_hapi_tools_collectionresourcetype,
    config_node_property_array_t *org_apache_sling_hapi_tools_searchpaths,
    config_node_property_string_t *org_apache_sling_hapi_tools_externalurl,
    config_node_property_boolean_t *org_apache_sling_hapi_tools_enabled
);

void org_apache_sling_hapi_impl_h_api_util_impl_properties_free(org_apache_sling_hapi_impl_h_api_util_impl_properties_t *org_apache_sling_hapi_impl_h_api_util_impl_properties);

org_apache_sling_hapi_impl_h_api_util_impl_properties_t *org_apache_sling_hapi_impl_h_api_util_impl_properties_parseFromJSON(cJSON *org_apache_sling_hapi_impl_h_api_util_impl_propertiesJSON);

cJSON *org_apache_sling_hapi_impl_h_api_util_impl_properties_convertToJSON(org_apache_sling_hapi_impl_h_api_util_impl_properties_t *org_apache_sling_hapi_impl_h_api_util_impl_properties);

#endif /* _org_apache_sling_hapi_impl_h_api_util_impl_properties_H_ */

