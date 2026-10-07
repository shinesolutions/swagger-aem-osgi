/*
 * org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_H_
#define _org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_t org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_t {
    struct config_node_property_array_t *handler_schemes; //model
    struct config_node_property_string_t *sling_jcrinstall_folder_name_regexp; //model
    struct config_node_property_integer_t *sling_jcrinstall_folder_max_depth; //model
    struct config_node_property_array_t *sling_jcrinstall_search_path; //model
    struct config_node_property_string_t *sling_jcrinstall_new_config_path; //model
    struct config_node_property_string_t *sling_jcrinstall_signal_path; //model
    struct config_node_property_boolean_t *sling_jcrinstall_enable_writeback; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_t;

__attribute__((deprecated)) org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_t *org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_create(
    config_node_property_array_t *handler_schemes,
    config_node_property_string_t *sling_jcrinstall_folder_name_regexp,
    config_node_property_integer_t *sling_jcrinstall_folder_max_depth,
    config_node_property_array_t *sling_jcrinstall_search_path,
    config_node_property_string_t *sling_jcrinstall_new_config_path,
    config_node_property_string_t *sling_jcrinstall_signal_path,
    config_node_property_boolean_t *sling_jcrinstall_enable_writeback
);

void org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_free(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_t *org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties);

org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_t *org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_parseFromJSON(cJSON *org_apache_sling_installer_provider_jcr_impl_jcr_installer_propertiesJSON);

cJSON *org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_convertToJSON(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_t *org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties);

#endif /* _org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_H_ */

