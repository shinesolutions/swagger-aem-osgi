/*
 * org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_H_
#define _org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_t org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_t {
    struct config_node_property_string_t *alias; //model
    struct config_node_property_boolean_t *dav_create_absolute_uri; //model
    struct config_node_property_string_t *dav_protectedhandlers; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_t;

__attribute__((deprecated)) org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_t *org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_create(
    config_node_property_string_t *alias,
    config_node_property_boolean_t *dav_create_absolute_uri,
    config_node_property_string_t *dav_protectedhandlers
);

void org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_free(org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_t *org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties);

org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_t *org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_parseFromJSON(cJSON *org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_propertiesJSON);

cJSON *org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_convertToJSON(org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_t *org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties);

#endif /* _org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties_H_ */

