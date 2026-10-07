/*
 * org_apache_felix_systemready_impl_framework_start_check_properties.h
 *
 * 
 */

#ifndef _org_apache_felix_systemready_impl_framework_start_check_properties_H_
#define _org_apache_felix_systemready_impl_framework_start_check_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_felix_systemready_impl_framework_start_check_properties_t org_apache_felix_systemready_impl_framework_start_check_properties_t;

#include "config_node_property_drop_down.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_felix_systemready_impl_framework_start_check_properties_t {
    struct config_node_property_integer_t *timeout; //model
    struct config_node_property_integer_t *target_start_level; //model
    struct config_node_property_string_t *target_start_level_prop_name; //model
    struct config_node_property_drop_down_t *type; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_felix_systemready_impl_framework_start_check_properties_t;

__attribute__((deprecated)) org_apache_felix_systemready_impl_framework_start_check_properties_t *org_apache_felix_systemready_impl_framework_start_check_properties_create(
    config_node_property_integer_t *timeout,
    config_node_property_integer_t *target_start_level,
    config_node_property_string_t *target_start_level_prop_name,
    config_node_property_drop_down_t *type
);

void org_apache_felix_systemready_impl_framework_start_check_properties_free(org_apache_felix_systemready_impl_framework_start_check_properties_t *org_apache_felix_systemready_impl_framework_start_check_properties);

org_apache_felix_systemready_impl_framework_start_check_properties_t *org_apache_felix_systemready_impl_framework_start_check_properties_parseFromJSON(cJSON *org_apache_felix_systemready_impl_framework_start_check_propertiesJSON);

cJSON *org_apache_felix_systemready_impl_framework_start_check_properties_convertToJSON(org_apache_felix_systemready_impl_framework_start_check_properties_t *org_apache_felix_systemready_impl_framework_start_check_properties);

#endif /* _org_apache_felix_systemready_impl_framework_start_check_properties_H_ */

