/*
 * com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_H_
#define _com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_t com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_t;

#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_t {
    struct config_node_property_boolean_t *enabled; //model
    struct config_node_property_string_t *agent_name; //model
    struct config_node_property_string_t *diff_path; //model
    struct config_node_property_string_t *observed_path; //model
    struct config_node_property_string_t *service_name; //model
    struct config_node_property_string_t *property_names; //model
    struct config_node_property_integer_t *distribution_delay; //model
    struct config_node_property_string_t *service_user_target; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_t;

__attribute__((deprecated)) com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_t *com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_create(
    config_node_property_boolean_t *enabled,
    config_node_property_string_t *agent_name,
    config_node_property_string_t *diff_path,
    config_node_property_string_t *observed_path,
    config_node_property_string_t *service_name,
    config_node_property_string_t *property_names,
    config_node_property_integer_t *distribution_delay,
    config_node_property_string_t *service_user_target
);

void com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_free(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_t *com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties);

com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_t *com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_parseFromJSON(cJSON *com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_propertiesJSON);

cJSON *com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_convertToJSON(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_t *com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties);

#endif /* _com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_H_ */

