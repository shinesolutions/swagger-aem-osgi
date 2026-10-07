/*
 * org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties.h
 *
 * 
 */

#ifndef _org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties_H_
#define _org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties_t org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_string.h"



typedef struct org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties_t {
    struct config_node_property_string_t *name; //model
    struct config_node_property_string_t *path; //model
    struct config_node_property_array_t *ignored_paths_patterns; //model
    struct config_node_property_string_t *service_name; //model
    struct config_node_property_boolean_t *deep; //model

    int _library_owned; // Is the library responsible for freeing this object?
} org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties_t;

__attribute__((deprecated)) org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties_t *org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties_create(
    config_node_property_string_t *name,
    config_node_property_string_t *path,
    config_node_property_array_t *ignored_paths_patterns,
    config_node_property_string_t *service_name,
    config_node_property_boolean_t *deep
);

void org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties_free(org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties_t *org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties);

org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties_t *org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties_parseFromJSON(cJSON *org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_propertiesJSON);

cJSON *org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties_convertToJSON(org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties_t *org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties);

#endif /* _org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties_H_ */

