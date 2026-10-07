/*
 * org_apache_sling_servlets_resolver_sling_servlet_resolver_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_H_
#define _org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_t org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_t {
    struct config_node_property_string_t *servletresolver_servlet_root; //model
    struct config_node_property_integer_t *servletresolver_cache_size; //model
    struct config_node_property_array_t *servletresolver_paths; //model
    struct config_node_property_array_t *servletresolver_default_extensions; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_t;

__attribute__((deprecated)) org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_t *org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_create(
    config_node_property_string_t *servletresolver_servlet_root,
    config_node_property_integer_t *servletresolver_cache_size,
    config_node_property_array_t *servletresolver_paths,
    config_node_property_array_t *servletresolver_default_extensions
);

void org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_free(org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_t *org_apache_sling_servlets_resolver_sling_servlet_resolver_properties);

org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_t *org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_parseFromJSON(cJSON *org_apache_sling_servlets_resolver_sling_servlet_resolver_propertiesJSON);

cJSON *org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_convertToJSON(org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_t *org_apache_sling_servlets_resolver_sling_servlet_resolver_properties);

#endif /* _org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_H_ */

