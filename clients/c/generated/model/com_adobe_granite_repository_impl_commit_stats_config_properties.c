#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_repository_impl_commit_stats_config_properties.h"



static com_adobe_granite_repository_impl_commit_stats_config_properties_t *com_adobe_granite_repository_impl_commit_stats_config_properties_create_internal(
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
    ) {
    com_adobe_granite_repository_impl_commit_stats_config_properties_t *com_adobe_granite_repository_impl_commit_stats_config_properties_local_var = malloc(sizeof(com_adobe_granite_repository_impl_commit_stats_config_properties_t));
    if (!com_adobe_granite_repository_impl_commit_stats_config_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_repository_impl_commit_stats_config_properties_local_var, 0, sizeof(com_adobe_granite_repository_impl_commit_stats_config_properties_t));
    com_adobe_granite_repository_impl_commit_stats_config_properties_local_var->_library_owned = 1;
    com_adobe_granite_repository_impl_commit_stats_config_properties_local_var->enabled = enabled;
    com_adobe_granite_repository_impl_commit_stats_config_properties_local_var->interval_seconds = interval_seconds;
    com_adobe_granite_repository_impl_commit_stats_config_properties_local_var->commits_per_interval_threshold = commits_per_interval_threshold;
    com_adobe_granite_repository_impl_commit_stats_config_properties_local_var->max_location_length = max_location_length;
    com_adobe_granite_repository_impl_commit_stats_config_properties_local_var->max_details_shown = max_details_shown;
    com_adobe_granite_repository_impl_commit_stats_config_properties_local_var->min_details_percentage = min_details_percentage;
    com_adobe_granite_repository_impl_commit_stats_config_properties_local_var->thread_matchers = thread_matchers;
    com_adobe_granite_repository_impl_commit_stats_config_properties_local_var->max_greedy_depth = max_greedy_depth;
    com_adobe_granite_repository_impl_commit_stats_config_properties_local_var->greedy_stack_matchers = greedy_stack_matchers;
    com_adobe_granite_repository_impl_commit_stats_config_properties_local_var->stack_filters = stack_filters;
    com_adobe_granite_repository_impl_commit_stats_config_properties_local_var->stack_matchers = stack_matchers;
    com_adobe_granite_repository_impl_commit_stats_config_properties_local_var->stack_categorizers = stack_categorizers;
    com_adobe_granite_repository_impl_commit_stats_config_properties_local_var->stack_shorteners = stack_shorteners;
    return com_adobe_granite_repository_impl_commit_stats_config_properties_local_var;
}

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
    ) {
    com_adobe_granite_repository_impl_commit_stats_config_properties_t *result = com_adobe_granite_repository_impl_commit_stats_config_properties_create_internal (
        enabled,
        interval_seconds,
        commits_per_interval_threshold,
        max_location_length,
        max_details_shown,
        min_details_percentage,
        thread_matchers,
        max_greedy_depth,
        greedy_stack_matchers,
        stack_filters,
        stack_matchers,
        stack_categorizers,
        stack_shorteners
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_repository_impl_commit_stats_config_properties_free(com_adobe_granite_repository_impl_commit_stats_config_properties_t *com_adobe_granite_repository_impl_commit_stats_config_properties) {
    if(NULL == com_adobe_granite_repository_impl_commit_stats_config_properties){
        return ;
    }
    if(com_adobe_granite_repository_impl_commit_stats_config_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_repository_impl_commit_stats_config_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_repository_impl_commit_stats_config_properties->enabled) {
        config_node_property_boolean_free(com_adobe_granite_repository_impl_commit_stats_config_properties->enabled);
        com_adobe_granite_repository_impl_commit_stats_config_properties->enabled = NULL;
    }
    if (com_adobe_granite_repository_impl_commit_stats_config_properties->interval_seconds) {
        config_node_property_integer_free(com_adobe_granite_repository_impl_commit_stats_config_properties->interval_seconds);
        com_adobe_granite_repository_impl_commit_stats_config_properties->interval_seconds = NULL;
    }
    if (com_adobe_granite_repository_impl_commit_stats_config_properties->commits_per_interval_threshold) {
        config_node_property_integer_free(com_adobe_granite_repository_impl_commit_stats_config_properties->commits_per_interval_threshold);
        com_adobe_granite_repository_impl_commit_stats_config_properties->commits_per_interval_threshold = NULL;
    }
    if (com_adobe_granite_repository_impl_commit_stats_config_properties->max_location_length) {
        config_node_property_integer_free(com_adobe_granite_repository_impl_commit_stats_config_properties->max_location_length);
        com_adobe_granite_repository_impl_commit_stats_config_properties->max_location_length = NULL;
    }
    if (com_adobe_granite_repository_impl_commit_stats_config_properties->max_details_shown) {
        config_node_property_integer_free(com_adobe_granite_repository_impl_commit_stats_config_properties->max_details_shown);
        com_adobe_granite_repository_impl_commit_stats_config_properties->max_details_shown = NULL;
    }
    if (com_adobe_granite_repository_impl_commit_stats_config_properties->min_details_percentage) {
        config_node_property_integer_free(com_adobe_granite_repository_impl_commit_stats_config_properties->min_details_percentage);
        com_adobe_granite_repository_impl_commit_stats_config_properties->min_details_percentage = NULL;
    }
    if (com_adobe_granite_repository_impl_commit_stats_config_properties->thread_matchers) {
        config_node_property_array_free(com_adobe_granite_repository_impl_commit_stats_config_properties->thread_matchers);
        com_adobe_granite_repository_impl_commit_stats_config_properties->thread_matchers = NULL;
    }
    if (com_adobe_granite_repository_impl_commit_stats_config_properties->max_greedy_depth) {
        config_node_property_integer_free(com_adobe_granite_repository_impl_commit_stats_config_properties->max_greedy_depth);
        com_adobe_granite_repository_impl_commit_stats_config_properties->max_greedy_depth = NULL;
    }
    if (com_adobe_granite_repository_impl_commit_stats_config_properties->greedy_stack_matchers) {
        config_node_property_string_free(com_adobe_granite_repository_impl_commit_stats_config_properties->greedy_stack_matchers);
        com_adobe_granite_repository_impl_commit_stats_config_properties->greedy_stack_matchers = NULL;
    }
    if (com_adobe_granite_repository_impl_commit_stats_config_properties->stack_filters) {
        config_node_property_array_free(com_adobe_granite_repository_impl_commit_stats_config_properties->stack_filters);
        com_adobe_granite_repository_impl_commit_stats_config_properties->stack_filters = NULL;
    }
    if (com_adobe_granite_repository_impl_commit_stats_config_properties->stack_matchers) {
        config_node_property_array_free(com_adobe_granite_repository_impl_commit_stats_config_properties->stack_matchers);
        com_adobe_granite_repository_impl_commit_stats_config_properties->stack_matchers = NULL;
    }
    if (com_adobe_granite_repository_impl_commit_stats_config_properties->stack_categorizers) {
        config_node_property_array_free(com_adobe_granite_repository_impl_commit_stats_config_properties->stack_categorizers);
        com_adobe_granite_repository_impl_commit_stats_config_properties->stack_categorizers = NULL;
    }
    if (com_adobe_granite_repository_impl_commit_stats_config_properties->stack_shorteners) {
        config_node_property_array_free(com_adobe_granite_repository_impl_commit_stats_config_properties->stack_shorteners);
        com_adobe_granite_repository_impl_commit_stats_config_properties->stack_shorteners = NULL;
    }
    free(com_adobe_granite_repository_impl_commit_stats_config_properties);
}

cJSON *com_adobe_granite_repository_impl_commit_stats_config_properties_convertToJSON(com_adobe_granite_repository_impl_commit_stats_config_properties_t *com_adobe_granite_repository_impl_commit_stats_config_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_repository_impl_commit_stats_config_properties->enabled
    if(com_adobe_granite_repository_impl_commit_stats_config_properties->enabled) {
    cJSON *enabled_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_repository_impl_commit_stats_config_properties->enabled);
    if(enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enabled", enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_repository_impl_commit_stats_config_properties->interval_seconds
    if(com_adobe_granite_repository_impl_commit_stats_config_properties->interval_seconds) {
    cJSON *interval_seconds_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_repository_impl_commit_stats_config_properties->interval_seconds);
    if(interval_seconds_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "intervalSeconds", interval_seconds_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_repository_impl_commit_stats_config_properties->commits_per_interval_threshold
    if(com_adobe_granite_repository_impl_commit_stats_config_properties->commits_per_interval_threshold) {
    cJSON *commits_per_interval_threshold_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_repository_impl_commit_stats_config_properties->commits_per_interval_threshold);
    if(commits_per_interval_threshold_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "commitsPerIntervalThreshold", commits_per_interval_threshold_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_repository_impl_commit_stats_config_properties->max_location_length
    if(com_adobe_granite_repository_impl_commit_stats_config_properties->max_location_length) {
    cJSON *max_location_length_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_repository_impl_commit_stats_config_properties->max_location_length);
    if(max_location_length_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxLocationLength", max_location_length_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_repository_impl_commit_stats_config_properties->max_details_shown
    if(com_adobe_granite_repository_impl_commit_stats_config_properties->max_details_shown) {
    cJSON *max_details_shown_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_repository_impl_commit_stats_config_properties->max_details_shown);
    if(max_details_shown_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxDetailsShown", max_details_shown_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_repository_impl_commit_stats_config_properties->min_details_percentage
    if(com_adobe_granite_repository_impl_commit_stats_config_properties->min_details_percentage) {
    cJSON *min_details_percentage_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_repository_impl_commit_stats_config_properties->min_details_percentage);
    if(min_details_percentage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "minDetailsPercentage", min_details_percentage_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_repository_impl_commit_stats_config_properties->thread_matchers
    if(com_adobe_granite_repository_impl_commit_stats_config_properties->thread_matchers) {
    cJSON *thread_matchers_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_repository_impl_commit_stats_config_properties->thread_matchers);
    if(thread_matchers_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "threadMatchers", thread_matchers_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_repository_impl_commit_stats_config_properties->max_greedy_depth
    if(com_adobe_granite_repository_impl_commit_stats_config_properties->max_greedy_depth) {
    cJSON *max_greedy_depth_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_repository_impl_commit_stats_config_properties->max_greedy_depth);
    if(max_greedy_depth_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxGreedyDepth", max_greedy_depth_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_repository_impl_commit_stats_config_properties->greedy_stack_matchers
    if(com_adobe_granite_repository_impl_commit_stats_config_properties->greedy_stack_matchers) {
    cJSON *greedy_stack_matchers_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_repository_impl_commit_stats_config_properties->greedy_stack_matchers);
    if(greedy_stack_matchers_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "greedyStackMatchers", greedy_stack_matchers_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_repository_impl_commit_stats_config_properties->stack_filters
    if(com_adobe_granite_repository_impl_commit_stats_config_properties->stack_filters) {
    cJSON *stack_filters_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_repository_impl_commit_stats_config_properties->stack_filters);
    if(stack_filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "stackFilters", stack_filters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_repository_impl_commit_stats_config_properties->stack_matchers
    if(com_adobe_granite_repository_impl_commit_stats_config_properties->stack_matchers) {
    cJSON *stack_matchers_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_repository_impl_commit_stats_config_properties->stack_matchers);
    if(stack_matchers_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "stackMatchers", stack_matchers_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_repository_impl_commit_stats_config_properties->stack_categorizers
    if(com_adobe_granite_repository_impl_commit_stats_config_properties->stack_categorizers) {
    cJSON *stack_categorizers_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_repository_impl_commit_stats_config_properties->stack_categorizers);
    if(stack_categorizers_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "stackCategorizers", stack_categorizers_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_repository_impl_commit_stats_config_properties->stack_shorteners
    if(com_adobe_granite_repository_impl_commit_stats_config_properties->stack_shorteners) {
    cJSON *stack_shorteners_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_repository_impl_commit_stats_config_properties->stack_shorteners);
    if(stack_shorteners_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "stackShorteners", stack_shorteners_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

com_adobe_granite_repository_impl_commit_stats_config_properties_t *com_adobe_granite_repository_impl_commit_stats_config_properties_parseFromJSON(cJSON *com_adobe_granite_repository_impl_commit_stats_config_propertiesJSON){

    com_adobe_granite_repository_impl_commit_stats_config_properties_t *com_adobe_granite_repository_impl_commit_stats_config_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_repository_impl_commit_stats_config_properties->enabled
    config_node_property_boolean_t *enabled_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_repository_impl_commit_stats_config_properties->interval_seconds
    config_node_property_integer_t *interval_seconds_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_repository_impl_commit_stats_config_properties->commits_per_interval_threshold
    config_node_property_integer_t *commits_per_interval_threshold_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_repository_impl_commit_stats_config_properties->max_location_length
    config_node_property_integer_t *max_location_length_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_repository_impl_commit_stats_config_properties->max_details_shown
    config_node_property_integer_t *max_details_shown_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_repository_impl_commit_stats_config_properties->min_details_percentage
    config_node_property_integer_t *min_details_percentage_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_repository_impl_commit_stats_config_properties->thread_matchers
    config_node_property_array_t *thread_matchers_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_repository_impl_commit_stats_config_properties->max_greedy_depth
    config_node_property_integer_t *max_greedy_depth_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_repository_impl_commit_stats_config_properties->greedy_stack_matchers
    config_node_property_string_t *greedy_stack_matchers_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_repository_impl_commit_stats_config_properties->stack_filters
    config_node_property_array_t *stack_filters_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_repository_impl_commit_stats_config_properties->stack_matchers
    config_node_property_array_t *stack_matchers_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_repository_impl_commit_stats_config_properties->stack_categorizers
    config_node_property_array_t *stack_categorizers_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_repository_impl_commit_stats_config_properties->stack_shorteners
    config_node_property_array_t *stack_shorteners_local_nonprim = NULL;

    // com_adobe_granite_repository_impl_commit_stats_config_properties->enabled
    cJSON *enabled = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_impl_commit_stats_config_propertiesJSON, "enabled");
    if (cJSON_IsNull(enabled)) {
        enabled = NULL;
    }
    if (enabled) { 
    enabled_local_nonprim = config_node_property_boolean_parseFromJSON(enabled); //nonprimitive
    }

    // com_adobe_granite_repository_impl_commit_stats_config_properties->interval_seconds
    cJSON *interval_seconds = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_impl_commit_stats_config_propertiesJSON, "intervalSeconds");
    if (cJSON_IsNull(interval_seconds)) {
        interval_seconds = NULL;
    }
    if (interval_seconds) { 
    interval_seconds_local_nonprim = config_node_property_integer_parseFromJSON(interval_seconds); //nonprimitive
    }

    // com_adobe_granite_repository_impl_commit_stats_config_properties->commits_per_interval_threshold
    cJSON *commits_per_interval_threshold = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_impl_commit_stats_config_propertiesJSON, "commitsPerIntervalThreshold");
    if (cJSON_IsNull(commits_per_interval_threshold)) {
        commits_per_interval_threshold = NULL;
    }
    if (commits_per_interval_threshold) { 
    commits_per_interval_threshold_local_nonprim = config_node_property_integer_parseFromJSON(commits_per_interval_threshold); //nonprimitive
    }

    // com_adobe_granite_repository_impl_commit_stats_config_properties->max_location_length
    cJSON *max_location_length = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_impl_commit_stats_config_propertiesJSON, "maxLocationLength");
    if (cJSON_IsNull(max_location_length)) {
        max_location_length = NULL;
    }
    if (max_location_length) { 
    max_location_length_local_nonprim = config_node_property_integer_parseFromJSON(max_location_length); //nonprimitive
    }

    // com_adobe_granite_repository_impl_commit_stats_config_properties->max_details_shown
    cJSON *max_details_shown = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_impl_commit_stats_config_propertiesJSON, "maxDetailsShown");
    if (cJSON_IsNull(max_details_shown)) {
        max_details_shown = NULL;
    }
    if (max_details_shown) { 
    max_details_shown_local_nonprim = config_node_property_integer_parseFromJSON(max_details_shown); //nonprimitive
    }

    // com_adobe_granite_repository_impl_commit_stats_config_properties->min_details_percentage
    cJSON *min_details_percentage = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_impl_commit_stats_config_propertiesJSON, "minDetailsPercentage");
    if (cJSON_IsNull(min_details_percentage)) {
        min_details_percentage = NULL;
    }
    if (min_details_percentage) { 
    min_details_percentage_local_nonprim = config_node_property_integer_parseFromJSON(min_details_percentage); //nonprimitive
    }

    // com_adobe_granite_repository_impl_commit_stats_config_properties->thread_matchers
    cJSON *thread_matchers = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_impl_commit_stats_config_propertiesJSON, "threadMatchers");
    if (cJSON_IsNull(thread_matchers)) {
        thread_matchers = NULL;
    }
    if (thread_matchers) { 
    thread_matchers_local_nonprim = config_node_property_array_parseFromJSON(thread_matchers); //nonprimitive
    }

    // com_adobe_granite_repository_impl_commit_stats_config_properties->max_greedy_depth
    cJSON *max_greedy_depth = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_impl_commit_stats_config_propertiesJSON, "maxGreedyDepth");
    if (cJSON_IsNull(max_greedy_depth)) {
        max_greedy_depth = NULL;
    }
    if (max_greedy_depth) { 
    max_greedy_depth_local_nonprim = config_node_property_integer_parseFromJSON(max_greedy_depth); //nonprimitive
    }

    // com_adobe_granite_repository_impl_commit_stats_config_properties->greedy_stack_matchers
    cJSON *greedy_stack_matchers = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_impl_commit_stats_config_propertiesJSON, "greedyStackMatchers");
    if (cJSON_IsNull(greedy_stack_matchers)) {
        greedy_stack_matchers = NULL;
    }
    if (greedy_stack_matchers) { 
    greedy_stack_matchers_local_nonprim = config_node_property_string_parseFromJSON(greedy_stack_matchers); //nonprimitive
    }

    // com_adobe_granite_repository_impl_commit_stats_config_properties->stack_filters
    cJSON *stack_filters = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_impl_commit_stats_config_propertiesJSON, "stackFilters");
    if (cJSON_IsNull(stack_filters)) {
        stack_filters = NULL;
    }
    if (stack_filters) { 
    stack_filters_local_nonprim = config_node_property_array_parseFromJSON(stack_filters); //nonprimitive
    }

    // com_adobe_granite_repository_impl_commit_stats_config_properties->stack_matchers
    cJSON *stack_matchers = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_impl_commit_stats_config_propertiesJSON, "stackMatchers");
    if (cJSON_IsNull(stack_matchers)) {
        stack_matchers = NULL;
    }
    if (stack_matchers) { 
    stack_matchers_local_nonprim = config_node_property_array_parseFromJSON(stack_matchers); //nonprimitive
    }

    // com_adobe_granite_repository_impl_commit_stats_config_properties->stack_categorizers
    cJSON *stack_categorizers = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_impl_commit_stats_config_propertiesJSON, "stackCategorizers");
    if (cJSON_IsNull(stack_categorizers)) {
        stack_categorizers = NULL;
    }
    if (stack_categorizers) { 
    stack_categorizers_local_nonprim = config_node_property_array_parseFromJSON(stack_categorizers); //nonprimitive
    }

    // com_adobe_granite_repository_impl_commit_stats_config_properties->stack_shorteners
    cJSON *stack_shorteners = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_repository_impl_commit_stats_config_propertiesJSON, "stackShorteners");
    if (cJSON_IsNull(stack_shorteners)) {
        stack_shorteners = NULL;
    }
    if (stack_shorteners) { 
    stack_shorteners_local_nonprim = config_node_property_array_parseFromJSON(stack_shorteners); //nonprimitive
    }



    com_adobe_granite_repository_impl_commit_stats_config_properties_local_var = com_adobe_granite_repository_impl_commit_stats_config_properties_create_internal (
        enabled ? enabled_local_nonprim : NULL,
        interval_seconds ? interval_seconds_local_nonprim : NULL,
        commits_per_interval_threshold ? commits_per_interval_threshold_local_nonprim : NULL,
        max_location_length ? max_location_length_local_nonprim : NULL,
        max_details_shown ? max_details_shown_local_nonprim : NULL,
        min_details_percentage ? min_details_percentage_local_nonprim : NULL,
        thread_matchers ? thread_matchers_local_nonprim : NULL,
        max_greedy_depth ? max_greedy_depth_local_nonprim : NULL,
        greedy_stack_matchers ? greedy_stack_matchers_local_nonprim : NULL,
        stack_filters ? stack_filters_local_nonprim : NULL,
        stack_matchers ? stack_matchers_local_nonprim : NULL,
        stack_categorizers ? stack_categorizers_local_nonprim : NULL,
        stack_shorteners ? stack_shorteners_local_nonprim : NULL
        );

    if (!com_adobe_granite_repository_impl_commit_stats_config_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_repository_impl_commit_stats_config_properties_local_var;
end:
    if (enabled_local_nonprim) {
        config_node_property_boolean_free(enabled_local_nonprim);
        enabled_local_nonprim = NULL;
    }
    if (interval_seconds_local_nonprim) {
        config_node_property_integer_free(interval_seconds_local_nonprim);
        interval_seconds_local_nonprim = NULL;
    }
    if (commits_per_interval_threshold_local_nonprim) {
        config_node_property_integer_free(commits_per_interval_threshold_local_nonprim);
        commits_per_interval_threshold_local_nonprim = NULL;
    }
    if (max_location_length_local_nonprim) {
        config_node_property_integer_free(max_location_length_local_nonprim);
        max_location_length_local_nonprim = NULL;
    }
    if (max_details_shown_local_nonprim) {
        config_node_property_integer_free(max_details_shown_local_nonprim);
        max_details_shown_local_nonprim = NULL;
    }
    if (min_details_percentage_local_nonprim) {
        config_node_property_integer_free(min_details_percentage_local_nonprim);
        min_details_percentage_local_nonprim = NULL;
    }
    if (thread_matchers_local_nonprim) {
        config_node_property_array_free(thread_matchers_local_nonprim);
        thread_matchers_local_nonprim = NULL;
    }
    if (max_greedy_depth_local_nonprim) {
        config_node_property_integer_free(max_greedy_depth_local_nonprim);
        max_greedy_depth_local_nonprim = NULL;
    }
    if (greedy_stack_matchers_local_nonprim) {
        config_node_property_string_free(greedy_stack_matchers_local_nonprim);
        greedy_stack_matchers_local_nonprim = NULL;
    }
    if (stack_filters_local_nonprim) {
        config_node_property_array_free(stack_filters_local_nonprim);
        stack_filters_local_nonprim = NULL;
    }
    if (stack_matchers_local_nonprim) {
        config_node_property_array_free(stack_matchers_local_nonprim);
        stack_matchers_local_nonprim = NULL;
    }
    if (stack_categorizers_local_nonprim) {
        config_node_property_array_free(stack_categorizers_local_nonprim);
        stack_categorizers_local_nonprim = NULL;
    }
    if (stack_shorteners_local_nonprim) {
        config_node_property_array_free(stack_shorteners_local_nonprim);
        stack_shorteners_local_nonprim = NULL;
    }
    return NULL;

}
