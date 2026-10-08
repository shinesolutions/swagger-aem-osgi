/*
 * org_apache_sling_commons_log_log_manager_factory_config_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_commons_log_log_manager_factory_config_properties_H_
#define _org_apache_sling_commons_log_log_manager_factory_config_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_commons_log_log_manager_factory_config_properties_t org_apache_sling_commons_log_log_manager_factory_config_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_commons_log_log_manager_factory_config_properties_t {
    struct config_node_property_drop_down_t *org_apache_sling_commons_log_level; //model
    struct config_node_property_string_t *org_apache_sling_commons_log_file; //model
    struct config_node_property_string_t *org_apache_sling_commons_log_pattern; //model
    struct config_node_property_array_t *org_apache_sling_commons_log_names; //model
    struct config_node_property_boolean_t *org_apache_sling_commons_log_additiv; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_commons_log_log_manager_factory_config_properties_t;

__attribute__((deprecated)) org_apache_sling_commons_log_log_manager_factory_config_properties_t *org_apache_sling_commons_log_log_manager_factory_config_properties_create(
    config_node_property_drop_down_t *org_apache_sling_commons_log_level,
    config_node_property_string_t *org_apache_sling_commons_log_file,
    config_node_property_string_t *org_apache_sling_commons_log_pattern,
    config_node_property_array_t *org_apache_sling_commons_log_names,
    config_node_property_boolean_t *org_apache_sling_commons_log_additiv
);

void org_apache_sling_commons_log_log_manager_factory_config_properties_free(org_apache_sling_commons_log_log_manager_factory_config_properties_t *org_apache_sling_commons_log_log_manager_factory_config_properties);

org_apache_sling_commons_log_log_manager_factory_config_properties_t *org_apache_sling_commons_log_log_manager_factory_config_properties_parseFromJSON(cJSON *org_apache_sling_commons_log_log_manager_factory_config_propertiesJSON);

cJSON *org_apache_sling_commons_log_log_manager_factory_config_properties_convertToJSON(org_apache_sling_commons_log_log_manager_factory_config_properties_t *org_apache_sling_commons_log_log_manager_factory_config_properties);

#endif /* _org_apache_sling_commons_log_log_manager_factory_config_properties_H_ */

