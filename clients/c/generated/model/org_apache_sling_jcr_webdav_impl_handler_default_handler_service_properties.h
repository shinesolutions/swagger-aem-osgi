/*
 * org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_H_
#define _org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_t org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_t;

#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_t {
    struct config_node_property_integer_t *service_ranking; //model
    struct config_node_property_string_t *type_collections; //model
    struct config_node_property_string_t *type_noncollections; //model
    struct config_node_property_string_t *type_content; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_t;

__attribute__((deprecated)) org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_t *org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_create(
    config_node_property_integer_t *service_ranking,
    config_node_property_string_t *type_collections,
    config_node_property_string_t *type_noncollections,
    config_node_property_string_t *type_content
);

void org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_free(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_t *org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties);

org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_t *org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_parseFromJSON(cJSON *org_apache_sling_jcr_webdav_impl_handler_default_handler_service_propertiesJSON);

cJSON *org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_convertToJSON(org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_t *org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties);

#endif /* _org_apache_sling_jcr_webdav_impl_handler_default_handler_service_properties_H_ */

