/*
 * org_apache_sling_hc_core_impl_scriptable_health_check_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_hc_core_impl_scriptable_health_check_properties_H_
#define _org_apache_sling_hc_core_impl_scriptable_health_check_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_hc_core_impl_scriptable_health_check_properties_t org_apache_sling_hc_core_impl_scriptable_health_check_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_hc_core_impl_scriptable_health_check_properties_t {
    struct config_node_property_string_t *hc_name; //model
    struct config_node_property_array_t *hc_tags; //model
    struct config_node_property_string_t *hc_mbean_name; //model
    struct config_node_property_string_t *expression; //model
    struct config_node_property_string_t *language_extension; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_hc_core_impl_scriptable_health_check_properties_t;

__attribute__((deprecated)) org_apache_sling_hc_core_impl_scriptable_health_check_properties_t *org_apache_sling_hc_core_impl_scriptable_health_check_properties_create(
    config_node_property_string_t *hc_name,
    config_node_property_array_t *hc_tags,
    config_node_property_string_t *hc_mbean_name,
    config_node_property_string_t *expression,
    config_node_property_string_t *language_extension
);

void org_apache_sling_hc_core_impl_scriptable_health_check_properties_free(org_apache_sling_hc_core_impl_scriptable_health_check_properties_t *org_apache_sling_hc_core_impl_scriptable_health_check_properties);

org_apache_sling_hc_core_impl_scriptable_health_check_properties_t *org_apache_sling_hc_core_impl_scriptable_health_check_properties_parseFromJSON(cJSON *org_apache_sling_hc_core_impl_scriptable_health_check_propertiesJSON);

cJSON *org_apache_sling_hc_core_impl_scriptable_health_check_properties_convertToJSON(org_apache_sling_hc_core_impl_scriptable_health_check_properties_t *org_apache_sling_hc_core_impl_scriptable_health_check_properties);

#endif /* _org_apache_sling_hc_core_impl_scriptable_health_check_properties_H_ */

