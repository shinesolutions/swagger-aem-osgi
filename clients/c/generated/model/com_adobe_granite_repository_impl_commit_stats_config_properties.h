/*
 * com_adobe_granite_repository_impl_commit_stats_config_properties.h
 *
 * 
 */

#ifndef _com_adobe_granite_repository_impl_commit_stats_config_properties_H_
#define _com_adobe_granite_repository_impl_commit_stats_config_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct com_adobe_granite_repository_impl_commit_stats_config_properties_t com_adobe_granite_repository_impl_commit_stats_config_properties_t;

#include "config_node_property_array.h"
#include "config_node_property_boolean.h"
#include "config_node_property_integer.h"
#include "config_node_property_string.h"



typedef struct com_adobe_granite_repository_impl_commit_stats_config_properties_t {
    struct config_node_property_boolean_t *enabled; //model
    struct config_node_property_integer_t *interval_seconds; //model
    struct config_node_property_integer_t *commits_per_interval_threshold; //model
    struct config_node_property_integer_t *max_location_length; //model
    struct config_node_property_integer_t *max_details_shown; //model
    struct config_node_property_integer_t *min_details_percentage; //model
    struct config_node_property_array_t *thread_matchers; //model
    struct config_node_property_integer_t *max_greedy_depth; //model
    struct config_node_property_string_t *greedy_stack_matchers; //model
    struct config_node_property_array_t *stack_filters; //model
    struct config_node_property_array_t *stack_matchers; //model
    struct config_node_property_array_t *stack_categorizers; //model
    struct config_node_property_array_t *stack_shorteners; //model

    int _library_owned; // Is the library responsible for freeing this object?
} com_adobe_granite_repository_impl_commit_stats_config_properties_t;

__attribute__((deprecated)) com_adobe_granite_repository_impl_commit_stats_config_properties_t *com_adobe_granite_repository_impl_commit_stats_config_properties_create(
    config_node_property_boolean_t *enabled,
    config_node_property_integer_t *interval_seconds,
    config_node_property_integer_t *commits_per_interval_threshold,
    config_node_property_integer_t *max_location_length,
    config_node_property_integer_t *max_details_shown,
    config_node_property_integer_t *min_details_percentage,
    config_node_property_array_t *thread_matchers,
    config_node_property_integer_t *max_greedy_depth,
    config_node_property_string_t *greedy_stack_matchers,
    config_node_property_array_t *stack_filters,
    config_node_property_array_t *stack_matchers,
    config_node_property_array_t *stack_categorizers,
    config_node_property_array_t *stack_shorteners
);

void com_adobe_granite_repository_impl_commit_stats_config_properties_free(com_adobe_granite_repository_impl_commit_stats_config_properties_t *com_adobe_granite_repository_impl_commit_stats_config_properties);

com_adobe_granite_repository_impl_commit_stats_config_properties_t *com_adobe_granite_repository_impl_commit_stats_config_properties_parseFromJSON(cJSON *com_adobe_granite_repository_impl_commit_stats_config_propertiesJSON);

cJSON *com_adobe_granite_repository_impl_commit_stats_config_properties_convertToJSON(com_adobe_granite_repository_impl_commit_stats_config_properties_t *com_adobe_granite_repository_impl_commit_stats_config_properties);

#endif /* _com_adobe_granite_repository_impl_commit_stats_config_properties_H_ */

