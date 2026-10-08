#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_dam_event_purge_service_properties.h"



static com_day_cq_dam_core_impl_dam_event_purge_service_properties_t *com_day_cq_dam_core_impl_dam_event_purge_service_properties_create_internal(
    config_node_property_string_t *scheduler_expression,
    config_node_property_integer_t *max_saved_activities,
    config_node_property_integer_t *save_interval,
    config_node_property_boolean_t *enable_activity_purge,
    config_node_property_drop_down_t *event_types
    ) {
    com_day_cq_dam_core_impl_dam_event_purge_service_properties_t *com_day_cq_dam_core_impl_dam_event_purge_service_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_dam_event_purge_service_properties_t));
    if (!com_day_cq_dam_core_impl_dam_event_purge_service_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_dam_event_purge_service_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_dam_event_purge_service_properties_t));
    com_day_cq_dam_core_impl_dam_event_purge_service_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_dam_event_purge_service_properties_local_var->scheduler_expression = scheduler_expression;
    com_day_cq_dam_core_impl_dam_event_purge_service_properties_local_var->max_saved_activities = max_saved_activities;
    com_day_cq_dam_core_impl_dam_event_purge_service_properties_local_var->save_interval = save_interval;
    com_day_cq_dam_core_impl_dam_event_purge_service_properties_local_var->enable_activity_purge = enable_activity_purge;
    com_day_cq_dam_core_impl_dam_event_purge_service_properties_local_var->event_types = event_types;
    return com_day_cq_dam_core_impl_dam_event_purge_service_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_dam_event_purge_service_properties_t *com_day_cq_dam_core_impl_dam_event_purge_service_properties_create(
    config_node_property_string_t *scheduler_expression,
    config_node_property_integer_t *max_saved_activities,
    config_node_property_integer_t *save_interval,
    config_node_property_boolean_t *enable_activity_purge,
    config_node_property_drop_down_t *event_types
    ) {
    com_day_cq_dam_core_impl_dam_event_purge_service_properties_t *result = com_day_cq_dam_core_impl_dam_event_purge_service_properties_create_internal (
        scheduler_expression,
        max_saved_activities,
        save_interval,
        enable_activity_purge,
        event_types
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_dam_event_purge_service_properties_free(com_day_cq_dam_core_impl_dam_event_purge_service_properties_t *com_day_cq_dam_core_impl_dam_event_purge_service_properties) {
    if(NULL == com_day_cq_dam_core_impl_dam_event_purge_service_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_dam_event_purge_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_dam_event_purge_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_dam_event_purge_service_properties->scheduler_expression) {
        config_node_property_string_free(com_day_cq_dam_core_impl_dam_event_purge_service_properties->scheduler_expression);
        com_day_cq_dam_core_impl_dam_event_purge_service_properties->scheduler_expression = NULL;
    }
    if (com_day_cq_dam_core_impl_dam_event_purge_service_properties->max_saved_activities) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_dam_event_purge_service_properties->max_saved_activities);
        com_day_cq_dam_core_impl_dam_event_purge_service_properties->max_saved_activities = NULL;
    }
    if (com_day_cq_dam_core_impl_dam_event_purge_service_properties->save_interval) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_dam_event_purge_service_properties->save_interval);
        com_day_cq_dam_core_impl_dam_event_purge_service_properties->save_interval = NULL;
    }
    if (com_day_cq_dam_core_impl_dam_event_purge_service_properties->enable_activity_purge) {
        config_node_property_boolean_free(com_day_cq_dam_core_impl_dam_event_purge_service_properties->enable_activity_purge);
        com_day_cq_dam_core_impl_dam_event_purge_service_properties->enable_activity_purge = NULL;
    }
    if (com_day_cq_dam_core_impl_dam_event_purge_service_properties->event_types) {
        config_node_property_drop_down_free(com_day_cq_dam_core_impl_dam_event_purge_service_properties->event_types);
        com_day_cq_dam_core_impl_dam_event_purge_service_properties->event_types = NULL;
    }
    free(com_day_cq_dam_core_impl_dam_event_purge_service_properties);
}

cJSON *com_day_cq_dam_core_impl_dam_event_purge_service_properties_convertToJSON(com_day_cq_dam_core_impl_dam_event_purge_service_properties_t *com_day_cq_dam_core_impl_dam_event_purge_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_dam_event_purge_service_properties->scheduler_expression
    if(com_day_cq_dam_core_impl_dam_event_purge_service_properties->scheduler_expression) {
    cJSON *scheduler_expression_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_dam_event_purge_service_properties->scheduler_expression);
    if(scheduler_expression_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduler.expression", scheduler_expression_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_dam_event_purge_service_properties->max_saved_activities
    if(com_day_cq_dam_core_impl_dam_event_purge_service_properties->max_saved_activities) {
    cJSON *max_saved_activities_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_dam_event_purge_service_properties->max_saved_activities);
    if(max_saved_activities_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxSavedActivities", max_saved_activities_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_dam_event_purge_service_properties->save_interval
    if(com_day_cq_dam_core_impl_dam_event_purge_service_properties->save_interval) {
    cJSON *save_interval_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_dam_event_purge_service_properties->save_interval);
    if(save_interval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "saveInterval", save_interval_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_dam_event_purge_service_properties->enable_activity_purge
    if(com_day_cq_dam_core_impl_dam_event_purge_service_properties->enable_activity_purge) {
    cJSON *enable_activity_purge_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_impl_dam_event_purge_service_properties->enable_activity_purge);
    if(enable_activity_purge_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enableActivityPurge", enable_activity_purge_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_dam_event_purge_service_properties->event_types
    if(com_day_cq_dam_core_impl_dam_event_purge_service_properties->event_types) {
    cJSON *event_types_local_JSON = config_node_property_drop_down_convertToJSON(com_day_cq_dam_core_impl_dam_event_purge_service_properties->event_types);
    if(event_types_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "eventTypes", event_types_local_JSON);
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

com_day_cq_dam_core_impl_dam_event_purge_service_properties_t *com_day_cq_dam_core_impl_dam_event_purge_service_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_dam_event_purge_service_propertiesJSON){

    com_day_cq_dam_core_impl_dam_event_purge_service_properties_t *com_day_cq_dam_core_impl_dam_event_purge_service_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_dam_event_purge_service_properties->scheduler_expression
    config_node_property_string_t *scheduler_expression_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_dam_event_purge_service_properties->max_saved_activities
    config_node_property_integer_t *max_saved_activities_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_dam_event_purge_service_properties->save_interval
    config_node_property_integer_t *save_interval_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_dam_event_purge_service_properties->enable_activity_purge
    config_node_property_boolean_t *enable_activity_purge_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_dam_event_purge_service_properties->event_types
    config_node_property_drop_down_t *event_types_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_dam_event_purge_service_properties->scheduler_expression
    cJSON *scheduler_expression = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_dam_event_purge_service_propertiesJSON, "scheduler.expression");
    if (cJSON_IsNull(scheduler_expression)) {
        scheduler_expression = NULL;
    }
    if (scheduler_expression) { 
    scheduler_expression_local_nonprim = config_node_property_string_parseFromJSON(scheduler_expression); //nonprimitive
    }

    // com_day_cq_dam_core_impl_dam_event_purge_service_properties->max_saved_activities
    cJSON *max_saved_activities = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_dam_event_purge_service_propertiesJSON, "maxSavedActivities");
    if (cJSON_IsNull(max_saved_activities)) {
        max_saved_activities = NULL;
    }
    if (max_saved_activities) { 
    max_saved_activities_local_nonprim = config_node_property_integer_parseFromJSON(max_saved_activities); //nonprimitive
    }

    // com_day_cq_dam_core_impl_dam_event_purge_service_properties->save_interval
    cJSON *save_interval = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_dam_event_purge_service_propertiesJSON, "saveInterval");
    if (cJSON_IsNull(save_interval)) {
        save_interval = NULL;
    }
    if (save_interval) { 
    save_interval_local_nonprim = config_node_property_integer_parseFromJSON(save_interval); //nonprimitive
    }

    // com_day_cq_dam_core_impl_dam_event_purge_service_properties->enable_activity_purge
    cJSON *enable_activity_purge = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_dam_event_purge_service_propertiesJSON, "enableActivityPurge");
    if (cJSON_IsNull(enable_activity_purge)) {
        enable_activity_purge = NULL;
    }
    if (enable_activity_purge) { 
    enable_activity_purge_local_nonprim = config_node_property_boolean_parseFromJSON(enable_activity_purge); //nonprimitive
    }

    // com_day_cq_dam_core_impl_dam_event_purge_service_properties->event_types
    cJSON *event_types = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_dam_event_purge_service_propertiesJSON, "eventTypes");
    if (cJSON_IsNull(event_types)) {
        event_types = NULL;
    }
    if (event_types) { 
    event_types_local_nonprim = config_node_property_drop_down_parseFromJSON(event_types); //nonprimitive
    }



    com_day_cq_dam_core_impl_dam_event_purge_service_properties_local_var = com_day_cq_dam_core_impl_dam_event_purge_service_properties_create_internal (
        scheduler_expression ? scheduler_expression_local_nonprim : NULL,
        max_saved_activities ? max_saved_activities_local_nonprim : NULL,
        save_interval ? save_interval_local_nonprim : NULL,
        enable_activity_purge ? enable_activity_purge_local_nonprim : NULL,
        event_types ? event_types_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_dam_event_purge_service_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_dam_event_purge_service_properties_local_var;
end:
    if (scheduler_expression_local_nonprim) {
        config_node_property_string_free(scheduler_expression_local_nonprim);
        scheduler_expression_local_nonprim = NULL;
    }
    if (max_saved_activities_local_nonprim) {
        config_node_property_integer_free(max_saved_activities_local_nonprim);
        max_saved_activities_local_nonprim = NULL;
    }
    if (save_interval_local_nonprim) {
        config_node_property_integer_free(save_interval_local_nonprim);
        save_interval_local_nonprim = NULL;
    }
    if (enable_activity_purge_local_nonprim) {
        config_node_property_boolean_free(enable_activity_purge_local_nonprim);
        enable_activity_purge_local_nonprim = NULL;
    }
    if (event_types_local_nonprim) {
        config_node_property_drop_down_free(event_types_local_nonprim);
        event_types_local_nonprim = NULL;
    }
    return NULL;

}
