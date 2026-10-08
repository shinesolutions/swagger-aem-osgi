/*
 * org_apache_sling_commons_log_log_manager_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_commons_log_log_manager_properties_H_
#define _org_apache_sling_commons_log_log_manager_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_commons_log_log_manager_properties_t org_apache_sling_commons_log_log_manager_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_commons_log_log_manager_properties_t {
    struct config_node_property_drop_down_t *org_apache_sling_commons_log_level; //model
    struct config_node_property_string_t *org_apache_sling_commons_log_file; //model
    struct config_node_property_integer_t *org_apache_sling_commons_log_file_number; //model
    struct config_node_property_string_t *org_apache_sling_commons_log_file_size; //model
    struct config_node_property_string_t *org_apache_sling_commons_log_pattern; //model
    struct config_node_property_string_t *org_apache_sling_commons_log_configuration_file; //model
    struct config_node_property_boolean_t *org_apache_sling_commons_log_packaging_data_enabled; //model
    struct config_node_property_integer_t *org_apache_sling_commons_log_max_caller_data_depth; //model
    struct config_node_property_integer_t *org_apache_sling_commons_log_max_old_file_count_in_dump; //model
    struct config_node_property_integer_t *org_apache_sling_commons_log_num_of_lines; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_commons_log_log_manager_properties_t;

__attribute__((deprecated)) org_apache_sling_commons_log_log_manager_properties_t *org_apache_sling_commons_log_log_manager_properties_create(
    config_node_property_drop_down_t *org_apache_sling_commons_log_level,
    config_node_property_string_t *org_apache_sling_commons_log_file,
    config_node_property_integer_t *org_apache_sling_commons_log_file_number,
    config_node_property_string_t *org_apache_sling_commons_log_file_size,
    config_node_property_string_t *org_apache_sling_commons_log_pattern,
    config_node_property_string_t *org_apache_sling_commons_log_configuration_file,
    config_node_property_boolean_t *org_apache_sling_commons_log_packaging_data_enabled,
    config_node_property_integer_t *org_apache_sling_commons_log_max_caller_data_depth,
    config_node_property_integer_t *org_apache_sling_commons_log_max_old_file_count_in_dump,
    config_node_property_integer_t *org_apache_sling_commons_log_num_of_lines
);

void org_apache_sling_commons_log_log_manager_properties_free(org_apache_sling_commons_log_log_manager_properties_t *org_apache_sling_commons_log_log_manager_properties);

org_apache_sling_commons_log_log_manager_properties_t *org_apache_sling_commons_log_log_manager_properties_parseFromJSON(cJSON *org_apache_sling_commons_log_log_manager_propertiesJSON);

cJSON *org_apache_sling_commons_log_log_manager_properties_convertToJSON(org_apache_sling_commons_log_log_manager_properties_t *org_apache_sling_commons_log_log_manager_properties);

#endif /* _org_apache_sling_commons_log_log_manager_properties_H_ */

