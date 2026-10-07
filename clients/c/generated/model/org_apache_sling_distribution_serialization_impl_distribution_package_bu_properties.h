/*
 * org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_H_
#define _org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_t org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_drop_down.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_t {
    struct config_node_property_string_t *name; //model
    struct config_node_property_drop_down_t *type; //model
    struct config_node_property_string_t *format_target; //model
    struct config_node_property_string_t *temp_fs_folder; //model
    struct config_node_property_integer_t *file_threshold; //model
    struct config_node_property_drop_down_t *memory_unit; //model
    struct config_node_property_boolean_t *use_off_heap_memory; //model
    struct config_node_property_drop_down_t *digest_algorithm; //model
    struct config_node_property_integer_t *monitoring_queue_size; //model
    struct config_node_property_integer_t *cleanup_delay; //model
    struct config_node_property_array_t *package_filters; //model
    struct config_node_property_array_t *property_filters; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_t;

__attribute__((deprecated)) org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_t *org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_create(
    config_node_property_string_t *name,
    config_node_property_drop_down_t *type,
    config_node_property_string_t *format_target,
    config_node_property_string_t *temp_fs_folder,
    config_node_property_integer_t *file_threshold,
    config_node_property_drop_down_t *memory_unit,
    config_node_property_boolean_t *use_off_heap_memory,
    config_node_property_drop_down_t *digest_algorithm,
    config_node_property_integer_t *monitoring_queue_size,
    config_node_property_integer_t *cleanup_delay,
    config_node_property_array_t *package_filters,
    config_node_property_array_t *property_filters
);

void org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_free(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_t *org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties);

org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_t *org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_parseFromJSON(cJSON *org_apache_sling_distribution_serialization_impl_distribution_package_bu_propertiesJSON);

cJSON *org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_convertToJSON(org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_t *org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties);

#endif /* _org_apache_sling_distribution_serialization_impl_distribution_package_bu_properties_H_ */

