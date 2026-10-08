#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties.h"



static com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_t *com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_create_internal(
    config_node_property_boolean_t *purge_completed,
    config_node_property_integer_t *completed_age,
    config_node_property_boolean_t *purge_active,
    config_node_property_integer_t *active_age,
    config_node_property_integer_t *save_threshold
    ) {
    com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_t *com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_local_var = malloc(sizeof(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_t));
    if (!com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_local_var, 0, sizeof(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_t));
    com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_local_var->_library_owned = 1;
    com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_local_var->purge_completed = purge_completed;
    com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_local_var->completed_age = completed_age;
    com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_local_var->purge_active = purge_active;
    com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_local_var->active_age = active_age;
    com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_local_var->save_threshold = save_threshold;
    return com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_t *com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_create(
    config_node_property_boolean_t *purge_completed,
    config_node_property_integer_t *completed_age,
    config_node_property_boolean_t *purge_active,
    config_node_property_integer_t *active_age,
    config_node_property_integer_t *save_threshold
    ) {
    com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_t *result = com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_create_internal (
        purge_completed,
        completed_age,
        purge_active,
        active_age,
        save_threshold
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_free(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_t *com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties) {
    if(NULL == com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties){
        return ;
    }
    if(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->purge_completed) {
        config_node_property_boolean_free(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->purge_completed);
        com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->purge_completed = NULL;
    }
    if (com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->completed_age) {
        config_node_property_integer_free(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->completed_age);
        com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->completed_age = NULL;
    }
    if (com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->purge_active) {
        config_node_property_boolean_free(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->purge_active);
        com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->purge_active = NULL;
    }
    if (com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->active_age) {
        config_node_property_integer_free(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->active_age);
        com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->active_age = NULL;
    }
    if (com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->save_threshold) {
        config_node_property_integer_free(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->save_threshold);
        com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->save_threshold = NULL;
    }
    free(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties);
}

cJSON *com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_convertToJSON(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_t *com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->purge_completed
    if(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->purge_completed) {
    cJSON *purge_completed_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->purge_completed);
    if(purge_completed_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "purgeCompleted", purge_completed_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->completed_age
    if(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->completed_age) {
    cJSON *completed_age_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->completed_age);
    if(completed_age_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "completedAge", completed_age_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->purge_active
    if(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->purge_active) {
    cJSON *purge_active_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->purge_active);
    if(purge_active_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "purgeActive", purge_active_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->active_age
    if(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->active_age) {
    cJSON *active_age_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->active_age);
    if(active_age_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "activeAge", active_age_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->save_threshold
    if(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->save_threshold) {
    cJSON *save_threshold_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->save_threshold);
    if(save_threshold_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "saveThreshold", save_threshold_local_JSON);
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

com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_t *com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_parseFromJSON(cJSON *com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_propertiesJSON){

    com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_t *com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->purge_completed
    config_node_property_boolean_t *purge_completed_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->completed_age
    config_node_property_integer_t *completed_age_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->purge_active
    config_node_property_boolean_t *purge_active_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->active_age
    config_node_property_integer_t *active_age_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->save_threshold
    config_node_property_integer_t *save_threshold_local_nonprim = NULL;

    // com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->purge_completed
    cJSON *purge_completed = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_propertiesJSON, "purgeCompleted");
    if (cJSON_IsNull(purge_completed)) {
        purge_completed = NULL;
    }
    if (purge_completed) { 
    purge_completed_local_nonprim = config_node_property_boolean_parseFromJSON(purge_completed); //nonprimitive
    }

    // com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->completed_age
    cJSON *completed_age = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_propertiesJSON, "completedAge");
    if (cJSON_IsNull(completed_age)) {
        completed_age = NULL;
    }
    if (completed_age) { 
    completed_age_local_nonprim = config_node_property_integer_parseFromJSON(completed_age); //nonprimitive
    }

    // com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->purge_active
    cJSON *purge_active = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_propertiesJSON, "purgeActive");
    if (cJSON_IsNull(purge_active)) {
        purge_active = NULL;
    }
    if (purge_active) { 
    purge_active_local_nonprim = config_node_property_boolean_parseFromJSON(purge_active); //nonprimitive
    }

    // com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->active_age
    cJSON *active_age = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_propertiesJSON, "activeAge");
    if (cJSON_IsNull(active_age)) {
        active_age = NULL;
    }
    if (active_age) { 
    active_age_local_nonprim = config_node_property_integer_parseFromJSON(active_age); //nonprimitive
    }

    // com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties->save_threshold
    cJSON *save_threshold = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_propertiesJSON, "saveThreshold");
    if (cJSON_IsNull(save_threshold)) {
        save_threshold = NULL;
    }
    if (save_threshold) { 
    save_threshold_local_nonprim = config_node_property_integer_parseFromJSON(save_threshold); //nonprimitive
    }



    com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_local_var = com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_create_internal (
        purge_completed ? purge_completed_local_nonprim : NULL,
        completed_age ? completed_age_local_nonprim : NULL,
        purge_active ? purge_active_local_nonprim : NULL,
        active_age ? active_age_local_nonprim : NULL,
        save_threshold ? save_threshold_local_nonprim : NULL
        );

    if (!com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_properties_local_var;
end:
    if (purge_completed_local_nonprim) {
        config_node_property_boolean_free(purge_completed_local_nonprim);
        purge_completed_local_nonprim = NULL;
    }
    if (completed_age_local_nonprim) {
        config_node_property_integer_free(completed_age_local_nonprim);
        completed_age_local_nonprim = NULL;
    }
    if (purge_active_local_nonprim) {
        config_node_property_boolean_free(purge_active_local_nonprim);
        purge_active_local_nonprim = NULL;
    }
    if (active_age_local_nonprim) {
        config_node_property_integer_free(active_age_local_nonprim);
        active_age_local_nonprim = NULL;
    }
    if (save_threshold_local_nonprim) {
        config_node_property_integer_free(save_threshold_local_nonprim);
        save_threshold_local_nonprim = NULL;
    }
    return NULL;

}
