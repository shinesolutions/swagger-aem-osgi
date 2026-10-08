/*
 * org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_H_
#define _org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_t org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_t {
    struct config_node_property_string_t *pool_name; //model
    struct config_node_property_array_t *allowed_pool_names; //model
    struct config_node_property_boolean_t *scheduler_useleaderforsingle; //model
    struct config_node_property_array_t *metrics_filters; //model
    struct config_node_property_integer_t *slow_threshold_millis; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_t;

__attribute__((deprecated)) org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_t *org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_create(
    config_node_property_string_t *pool_name,
    config_node_property_array_t *allowed_pool_names,
    config_node_property_boolean_t *scheduler_useleaderforsingle,
    config_node_property_array_t *metrics_filters,
    config_node_property_integer_t *slow_threshold_millis
);

void org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_free(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_t *org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties);

org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_t *org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_parseFromJSON(cJSON *org_apache_sling_commons_scheduler_impl_quartz_scheduler_propertiesJSON);

cJSON *org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_convertToJSON(org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_t *org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties);

#endif /* _org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties_H_ */

