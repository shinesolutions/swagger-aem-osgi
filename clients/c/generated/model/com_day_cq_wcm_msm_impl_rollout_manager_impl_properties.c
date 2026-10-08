#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_msm_impl_rollout_manager_impl_properties.h"



static com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_t *com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_create_internal(
    config_node_property_string_t *event_filter,
    config_node_property_array_t *rolloutmgr_excludedprops_default,
    config_node_property_array_t *rolloutmgr_excludedparagraphprops_default,
    config_node_property_array_t *rolloutmgr_excludednodetypes_default,
    config_node_property_integer_t *rolloutmgr_threadpool_maxsize,
    config_node_property_integer_t *rolloutmgr_threadpool_maxshutdowntime,
    config_node_property_drop_down_t *rolloutmgr_threadpool_priority,
    config_node_property_integer_t *rolloutmgr_commit_size,
    config_node_property_boolean_t *rolloutmgr_conflicthandling_enabled
    ) {
    com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_t *com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_local_var = malloc(sizeof(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_t));
    if (!com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_local_var, 0, sizeof(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_t));
    com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_local_var->event_filter = event_filter;
    com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_local_var->rolloutmgr_excludedprops_default = rolloutmgr_excludedprops_default;
    com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_local_var->rolloutmgr_excludedparagraphprops_default = rolloutmgr_excludedparagraphprops_default;
    com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_local_var->rolloutmgr_excludednodetypes_default = rolloutmgr_excludednodetypes_default;
    com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_local_var->rolloutmgr_threadpool_maxsize = rolloutmgr_threadpool_maxsize;
    com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_local_var->rolloutmgr_threadpool_maxshutdowntime = rolloutmgr_threadpool_maxshutdowntime;
    com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_local_var->rolloutmgr_threadpool_priority = rolloutmgr_threadpool_priority;
    com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_local_var->rolloutmgr_commit_size = rolloutmgr_commit_size;
    com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_local_var->rolloutmgr_conflicthandling_enabled = rolloutmgr_conflicthandling_enabled;
    return com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_t *com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_create(
    config_node_property_string_t *event_filter,
    config_node_property_array_t *rolloutmgr_excludedprops_default,
    config_node_property_array_t *rolloutmgr_excludedparagraphprops_default,
    config_node_property_array_t *rolloutmgr_excludednodetypes_default,
    config_node_property_integer_t *rolloutmgr_threadpool_maxsize,
    config_node_property_integer_t *rolloutmgr_threadpool_maxshutdowntime,
    config_node_property_drop_down_t *rolloutmgr_threadpool_priority,
    config_node_property_integer_t *rolloutmgr_commit_size,
    config_node_property_boolean_t *rolloutmgr_conflicthandling_enabled
    ) {
    com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_t *result = com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_create_internal (
        event_filter,
        rolloutmgr_excludedprops_default,
        rolloutmgr_excludedparagraphprops_default,
        rolloutmgr_excludednodetypes_default,
        rolloutmgr_threadpool_maxsize,
        rolloutmgr_threadpool_maxshutdowntime,
        rolloutmgr_threadpool_priority,
        rolloutmgr_commit_size,
        rolloutmgr_conflicthandling_enabled
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_free(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_t *com_day_cq_wcm_msm_impl_rollout_manager_impl_properties) {
    if(NULL == com_day_cq_wcm_msm_impl_rollout_manager_impl_properties){
        return ;
    }
    if(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->event_filter) {
        config_node_property_string_free(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->event_filter);
        com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->event_filter = NULL;
    }
    if (com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludedprops_default) {
        config_node_property_array_free(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludedprops_default);
        com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludedprops_default = NULL;
    }
    if (com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludedparagraphprops_default) {
        config_node_property_array_free(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludedparagraphprops_default);
        com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludedparagraphprops_default = NULL;
    }
    if (com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludednodetypes_default) {
        config_node_property_array_free(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludednodetypes_default);
        com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludednodetypes_default = NULL;
    }
    if (com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_maxsize) {
        config_node_property_integer_free(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_maxsize);
        com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_maxsize = NULL;
    }
    if (com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_maxshutdowntime) {
        config_node_property_integer_free(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_maxshutdowntime);
        com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_maxshutdowntime = NULL;
    }
    if (com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_priority) {
        config_node_property_drop_down_free(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_priority);
        com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_priority = NULL;
    }
    if (com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_commit_size) {
        config_node_property_integer_free(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_commit_size);
        com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_commit_size = NULL;
    }
    if (com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_conflicthandling_enabled) {
        config_node_property_boolean_free(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_conflicthandling_enabled);
        com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_conflicthandling_enabled = NULL;
    }
    free(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties);
}

cJSON *com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_convertToJSON(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_t *com_day_cq_wcm_msm_impl_rollout_manager_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->event_filter
    if(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->event_filter) {
    cJSON *event_filter_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->event_filter);
    if(event_filter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "event.filter", event_filter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludedprops_default
    if(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludedprops_default) {
    cJSON *rolloutmgr_excludedprops_default_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludedprops_default);
    if(rolloutmgr_excludedprops_default_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rolloutmgr.excludedprops.default", rolloutmgr_excludedprops_default_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludedparagraphprops_default
    if(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludedparagraphprops_default) {
    cJSON *rolloutmgr_excludedparagraphprops_default_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludedparagraphprops_default);
    if(rolloutmgr_excludedparagraphprops_default_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rolloutmgr.excludedparagraphprops.default", rolloutmgr_excludedparagraphprops_default_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludednodetypes_default
    if(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludednodetypes_default) {
    cJSON *rolloutmgr_excludednodetypes_default_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludednodetypes_default);
    if(rolloutmgr_excludednodetypes_default_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rolloutmgr.excludednodetypes.default", rolloutmgr_excludednodetypes_default_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_maxsize
    if(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_maxsize) {
    cJSON *rolloutmgr_threadpool_maxsize_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_maxsize);
    if(rolloutmgr_threadpool_maxsize_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rolloutmgr.threadpool.maxsize", rolloutmgr_threadpool_maxsize_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_maxshutdowntime
    if(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_maxshutdowntime) {
    cJSON *rolloutmgr_threadpool_maxshutdowntime_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_maxshutdowntime);
    if(rolloutmgr_threadpool_maxshutdowntime_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rolloutmgr.threadpool.maxshutdowntime", rolloutmgr_threadpool_maxshutdowntime_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_priority
    if(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_priority) {
    cJSON *rolloutmgr_threadpool_priority_local_JSON = config_node_property_drop_down_convertToJSON(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_priority);
    if(rolloutmgr_threadpool_priority_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rolloutmgr.threadpool.priority", rolloutmgr_threadpool_priority_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_commit_size
    if(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_commit_size) {
    cJSON *rolloutmgr_commit_size_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_commit_size);
    if(rolloutmgr_commit_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rolloutmgr.commit.size", rolloutmgr_commit_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_conflicthandling_enabled
    if(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_conflicthandling_enabled) {
    cJSON *rolloutmgr_conflicthandling_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_conflicthandling_enabled);
    if(rolloutmgr_conflicthandling_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "rolloutmgr.conflicthandling.enabled", rolloutmgr_conflicthandling_enabled_local_JSON);
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

com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_t *com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_parseFromJSON(cJSON *com_day_cq_wcm_msm_impl_rollout_manager_impl_propertiesJSON){

    com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_t *com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->event_filter
    config_node_property_string_t *event_filter_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludedprops_default
    config_node_property_array_t *rolloutmgr_excludedprops_default_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludedparagraphprops_default
    config_node_property_array_t *rolloutmgr_excludedparagraphprops_default_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludednodetypes_default
    config_node_property_array_t *rolloutmgr_excludednodetypes_default_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_maxsize
    config_node_property_integer_t *rolloutmgr_threadpool_maxsize_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_maxshutdowntime
    config_node_property_integer_t *rolloutmgr_threadpool_maxshutdowntime_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_priority
    config_node_property_drop_down_t *rolloutmgr_threadpool_priority_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_commit_size
    config_node_property_integer_t *rolloutmgr_commit_size_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_conflicthandling_enabled
    config_node_property_boolean_t *rolloutmgr_conflicthandling_enabled_local_nonprim = NULL;

    // com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->event_filter
    cJSON *event_filter = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_msm_impl_rollout_manager_impl_propertiesJSON, "event.filter");
    if (cJSON_IsNull(event_filter)) {
        event_filter = NULL;
    }
    if (event_filter) { 
    event_filter_local_nonprim = config_node_property_string_parseFromJSON(event_filter); //nonprimitive
    }

    // com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludedprops_default
    cJSON *rolloutmgr_excludedprops_default = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_msm_impl_rollout_manager_impl_propertiesJSON, "rolloutmgr.excludedprops.default");
    if (cJSON_IsNull(rolloutmgr_excludedprops_default)) {
        rolloutmgr_excludedprops_default = NULL;
    }
    if (rolloutmgr_excludedprops_default) { 
    rolloutmgr_excludedprops_default_local_nonprim = config_node_property_array_parseFromJSON(rolloutmgr_excludedprops_default); //nonprimitive
    }

    // com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludedparagraphprops_default
    cJSON *rolloutmgr_excludedparagraphprops_default = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_msm_impl_rollout_manager_impl_propertiesJSON, "rolloutmgr.excludedparagraphprops.default");
    if (cJSON_IsNull(rolloutmgr_excludedparagraphprops_default)) {
        rolloutmgr_excludedparagraphprops_default = NULL;
    }
    if (rolloutmgr_excludedparagraphprops_default) { 
    rolloutmgr_excludedparagraphprops_default_local_nonprim = config_node_property_array_parseFromJSON(rolloutmgr_excludedparagraphprops_default); //nonprimitive
    }

    // com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_excludednodetypes_default
    cJSON *rolloutmgr_excludednodetypes_default = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_msm_impl_rollout_manager_impl_propertiesJSON, "rolloutmgr.excludednodetypes.default");
    if (cJSON_IsNull(rolloutmgr_excludednodetypes_default)) {
        rolloutmgr_excludednodetypes_default = NULL;
    }
    if (rolloutmgr_excludednodetypes_default) { 
    rolloutmgr_excludednodetypes_default_local_nonprim = config_node_property_array_parseFromJSON(rolloutmgr_excludednodetypes_default); //nonprimitive
    }

    // com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_maxsize
    cJSON *rolloutmgr_threadpool_maxsize = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_msm_impl_rollout_manager_impl_propertiesJSON, "rolloutmgr.threadpool.maxsize");
    if (cJSON_IsNull(rolloutmgr_threadpool_maxsize)) {
        rolloutmgr_threadpool_maxsize = NULL;
    }
    if (rolloutmgr_threadpool_maxsize) { 
    rolloutmgr_threadpool_maxsize_local_nonprim = config_node_property_integer_parseFromJSON(rolloutmgr_threadpool_maxsize); //nonprimitive
    }

    // com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_maxshutdowntime
    cJSON *rolloutmgr_threadpool_maxshutdowntime = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_msm_impl_rollout_manager_impl_propertiesJSON, "rolloutmgr.threadpool.maxshutdowntime");
    if (cJSON_IsNull(rolloutmgr_threadpool_maxshutdowntime)) {
        rolloutmgr_threadpool_maxshutdowntime = NULL;
    }
    if (rolloutmgr_threadpool_maxshutdowntime) { 
    rolloutmgr_threadpool_maxshutdowntime_local_nonprim = config_node_property_integer_parseFromJSON(rolloutmgr_threadpool_maxshutdowntime); //nonprimitive
    }

    // com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_threadpool_priority
    cJSON *rolloutmgr_threadpool_priority = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_msm_impl_rollout_manager_impl_propertiesJSON, "rolloutmgr.threadpool.priority");
    if (cJSON_IsNull(rolloutmgr_threadpool_priority)) {
        rolloutmgr_threadpool_priority = NULL;
    }
    if (rolloutmgr_threadpool_priority) { 
    rolloutmgr_threadpool_priority_local_nonprim = config_node_property_drop_down_parseFromJSON(rolloutmgr_threadpool_priority); //nonprimitive
    }

    // com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_commit_size
    cJSON *rolloutmgr_commit_size = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_msm_impl_rollout_manager_impl_propertiesJSON, "rolloutmgr.commit.size");
    if (cJSON_IsNull(rolloutmgr_commit_size)) {
        rolloutmgr_commit_size = NULL;
    }
    if (rolloutmgr_commit_size) { 
    rolloutmgr_commit_size_local_nonprim = config_node_property_integer_parseFromJSON(rolloutmgr_commit_size); //nonprimitive
    }

    // com_day_cq_wcm_msm_impl_rollout_manager_impl_properties->rolloutmgr_conflicthandling_enabled
    cJSON *rolloutmgr_conflicthandling_enabled = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_msm_impl_rollout_manager_impl_propertiesJSON, "rolloutmgr.conflicthandling.enabled");
    if (cJSON_IsNull(rolloutmgr_conflicthandling_enabled)) {
        rolloutmgr_conflicthandling_enabled = NULL;
    }
    if (rolloutmgr_conflicthandling_enabled) { 
    rolloutmgr_conflicthandling_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(rolloutmgr_conflicthandling_enabled); //nonprimitive
    }



    com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_local_var = com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_create_internal (
        event_filter ? event_filter_local_nonprim : NULL,
        rolloutmgr_excludedprops_default ? rolloutmgr_excludedprops_default_local_nonprim : NULL,
        rolloutmgr_excludedparagraphprops_default ? rolloutmgr_excludedparagraphprops_default_local_nonprim : NULL,
        rolloutmgr_excludednodetypes_default ? rolloutmgr_excludednodetypes_default_local_nonprim : NULL,
        rolloutmgr_threadpool_maxsize ? rolloutmgr_threadpool_maxsize_local_nonprim : NULL,
        rolloutmgr_threadpool_maxshutdowntime ? rolloutmgr_threadpool_maxshutdowntime_local_nonprim : NULL,
        rolloutmgr_threadpool_priority ? rolloutmgr_threadpool_priority_local_nonprim : NULL,
        rolloutmgr_commit_size ? rolloutmgr_commit_size_local_nonprim : NULL,
        rolloutmgr_conflicthandling_enabled ? rolloutmgr_conflicthandling_enabled_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_msm_impl_rollout_manager_impl_properties_local_var;
end:
    if (event_filter_local_nonprim) {
        config_node_property_string_free(event_filter_local_nonprim);
        event_filter_local_nonprim = NULL;
    }
    if (rolloutmgr_excludedprops_default_local_nonprim) {
        config_node_property_array_free(rolloutmgr_excludedprops_default_local_nonprim);
        rolloutmgr_excludedprops_default_local_nonprim = NULL;
    }
    if (rolloutmgr_excludedparagraphprops_default_local_nonprim) {
        config_node_property_array_free(rolloutmgr_excludedparagraphprops_default_local_nonprim);
        rolloutmgr_excludedparagraphprops_default_local_nonprim = NULL;
    }
    if (rolloutmgr_excludednodetypes_default_local_nonprim) {
        config_node_property_array_free(rolloutmgr_excludednodetypes_default_local_nonprim);
        rolloutmgr_excludednodetypes_default_local_nonprim = NULL;
    }
    if (rolloutmgr_threadpool_maxsize_local_nonprim) {
        config_node_property_integer_free(rolloutmgr_threadpool_maxsize_local_nonprim);
        rolloutmgr_threadpool_maxsize_local_nonprim = NULL;
    }
    if (rolloutmgr_threadpool_maxshutdowntime_local_nonprim) {
        config_node_property_integer_free(rolloutmgr_threadpool_maxshutdowntime_local_nonprim);
        rolloutmgr_threadpool_maxshutdowntime_local_nonprim = NULL;
    }
    if (rolloutmgr_threadpool_priority_local_nonprim) {
        config_node_property_drop_down_free(rolloutmgr_threadpool_priority_local_nonprim);
        rolloutmgr_threadpool_priority_local_nonprim = NULL;
    }
    if (rolloutmgr_commit_size_local_nonprim) {
        config_node_property_integer_free(rolloutmgr_commit_size_local_nonprim);
        rolloutmgr_commit_size_local_nonprim = NULL;
    }
    if (rolloutmgr_conflicthandling_enabled_local_nonprim) {
        config_node_property_boolean_free(rolloutmgr_conflicthandling_enabled_local_nonprim);
        rolloutmgr_conflicthandling_enabled_local_nonprim = NULL;
    }
    return NULL;

}
