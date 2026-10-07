/*
 * org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_H_
#define _org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_t org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_t {
    struct config_node_property_string_t *dav_root; //model
    struct config_node_property_boolean_t *dav_create_absolute_uri; //model
    struct config_node_property_string_t *dav_realm; //model
    struct config_node_property_array_t *collection_types; //model
    struct config_node_property_array_t *filter_prefixes; //model
    struct config_node_property_string_t *filter_types; //model
    struct config_node_property_string_t *filter_uris; //model
    struct config_node_property_string_t *type_collections; //model
    struct config_node_property_string_t *type_noncollections; //model
    struct config_node_property_string_t *type_content; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_t;

__attribute__((deprecated)) org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_t *org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_create(
    config_node_property_string_t *dav_root,
    config_node_property_boolean_t *dav_create_absolute_uri,
    config_node_property_string_t *dav_realm,
    config_node_property_array_t *collection_types,
    config_node_property_array_t *filter_prefixes,
    config_node_property_string_t *filter_types,
    config_node_property_string_t *filter_uris,
    config_node_property_string_t *type_collections,
    config_node_property_string_t *type_noncollections,
    config_node_property_string_t *type_content
);

void org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_free(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_t *org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties);

org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_t *org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_parseFromJSON(cJSON *org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_propertiesJSON);

cJSON *org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_convertToJSON(org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_t *org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties);

#endif /* _org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_properties_H_ */

