/*
 * org_apache_sling_security_impl_content_disposition_filter_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_security_impl_content_disposition_filter_properties_H_
#define _org_apache_sling_security_impl_content_disposition_filter_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_security_impl_content_disposition_filter_properties_t org_apache_sling_security_impl_content_disposition_filter_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"



typedef struct org_apache_sling_security_impl_content_disposition_filter_properties_t {
    struct config_node_property_array_t *sling_content_disposition_paths; //model
    struct config_node_property_array_t *sling_content_disposition_excluded_paths; //model
    struct config_node_property_boolean_t *sling_content_disposition_all_paths; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_security_impl_content_disposition_filter_properties_t;

__attribute__((deprecated)) org_apache_sling_security_impl_content_disposition_filter_properties_t *org_apache_sling_security_impl_content_disposition_filter_properties_create(
    config_node_property_array_t *sling_content_disposition_paths,
    config_node_property_array_t *sling_content_disposition_excluded_paths,
    config_node_property_boolean_t *sling_content_disposition_all_paths
);

void org_apache_sling_security_impl_content_disposition_filter_properties_free(org_apache_sling_security_impl_content_disposition_filter_properties_t *org_apache_sling_security_impl_content_disposition_filter_properties);

org_apache_sling_security_impl_content_disposition_filter_properties_t *org_apache_sling_security_impl_content_disposition_filter_properties_parseFromJSON(cJSON *org_apache_sling_security_impl_content_disposition_filter_propertiesJSON);

cJSON *org_apache_sling_security_impl_content_disposition_filter_properties_convertToJSON(org_apache_sling_security_impl_content_disposition_filter_properties_t *org_apache_sling_security_impl_content_disposition_filter_properties);

#endif /* _org_apache_sling_security_impl_content_disposition_filter_properties_H_ */

