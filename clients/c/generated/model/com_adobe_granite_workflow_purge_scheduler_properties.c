#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_workflow_purge_scheduler_properties.h"



static com_adobe_granite_workflow_purge_scheduler_properties_t *com_adobe_granite_workflow_purge_scheduler_properties_create_internal(
    config_node_property_string_t *scheduledpurge_name,
    config_node_property_drop_down_t *scheduledpurge_workflow_status,
    config_node_property_array_t *scheduledpurge_model_ids,
    config_node_property_integer_t *scheduledpurge_daysold
    ) {
    com_adobe_granite_workflow_purge_scheduler_properties_t *com_adobe_granite_workflow_purge_scheduler_properties_local_var = malloc(sizeof(com_adobe_granite_workflow_purge_scheduler_properties_t));
    if (!com_adobe_granite_workflow_purge_scheduler_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_workflow_purge_scheduler_properties_local_var, 0, sizeof(com_adobe_granite_workflow_purge_scheduler_properties_t));
    com_adobe_granite_workflow_purge_scheduler_properties_local_var->_library_owned = 1;
    com_adobe_granite_workflow_purge_scheduler_properties_local_var->scheduledpurge_name = scheduledpurge_name;
    com_adobe_granite_workflow_purge_scheduler_properties_local_var->scheduledpurge_workflow_status = scheduledpurge_workflow_status;
    com_adobe_granite_workflow_purge_scheduler_properties_local_var->scheduledpurge_model_ids = scheduledpurge_model_ids;
    com_adobe_granite_workflow_purge_scheduler_properties_local_var->scheduledpurge_daysold = scheduledpurge_daysold;
    return com_adobe_granite_workflow_purge_scheduler_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_workflow_purge_scheduler_properties_t *com_adobe_granite_workflow_purge_scheduler_properties_create(
    config_node_property_string_t *scheduledpurge_name,
    config_node_property_drop_down_t *scheduledpurge_workflow_status,
    config_node_property_array_t *scheduledpurge_model_ids,
    config_node_property_integer_t *scheduledpurge_daysold
    ) {
    com_adobe_granite_workflow_purge_scheduler_properties_t *result = com_adobe_granite_workflow_purge_scheduler_properties_create_internal (
        scheduledpurge_name,
        scheduledpurge_workflow_status,
        scheduledpurge_model_ids,
        scheduledpurge_daysold
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_workflow_purge_scheduler_properties_free(com_adobe_granite_workflow_purge_scheduler_properties_t *com_adobe_granite_workflow_purge_scheduler_properties) {
    if(NULL == com_adobe_granite_workflow_purge_scheduler_properties){
        return ;
    }
    if(com_adobe_granite_workflow_purge_scheduler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_workflow_purge_scheduler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_name) {
        config_node_property_string_free(com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_name);
        com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_name = NULL;
    }
    if (com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_workflow_status) {
        config_node_property_drop_down_free(com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_workflow_status);
        com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_workflow_status = NULL;
    }
    if (com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_model_ids) {
        config_node_property_array_free(com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_model_ids);
        com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_model_ids = NULL;
    }
    if (com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_daysold) {
        config_node_property_integer_free(com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_daysold);
        com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_daysold = NULL;
    }
    free(com_adobe_granite_workflow_purge_scheduler_properties);
}

cJSON *com_adobe_granite_workflow_purge_scheduler_properties_convertToJSON(com_adobe_granite_workflow_purge_scheduler_properties_t *com_adobe_granite_workflow_purge_scheduler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_name
    if(com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_name) {
    cJSON *scheduledpurge_name_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_name);
    if(scheduledpurge_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduledpurge.name", scheduledpurge_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_workflow_status
    if(com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_workflow_status) {
    cJSON *scheduledpurge_workflow_status_local_JSON = config_node_property_drop_down_convertToJSON(com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_workflow_status);
    if(scheduledpurge_workflow_status_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduledpurge.workflowStatus", scheduledpurge_workflow_status_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_model_ids
    if(com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_model_ids) {
    cJSON *scheduledpurge_model_ids_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_model_ids);
    if(scheduledpurge_model_ids_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduledpurge.modelIds", scheduledpurge_model_ids_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_daysold
    if(com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_daysold) {
    cJSON *scheduledpurge_daysold_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_daysold);
    if(scheduledpurge_daysold_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduledpurge.daysold", scheduledpurge_daysold_local_JSON);
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

com_adobe_granite_workflow_purge_scheduler_properties_t *com_adobe_granite_workflow_purge_scheduler_properties_parseFromJSON(cJSON *com_adobe_granite_workflow_purge_scheduler_propertiesJSON){

    com_adobe_granite_workflow_purge_scheduler_properties_t *com_adobe_granite_workflow_purge_scheduler_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_name
    config_node_property_string_t *scheduledpurge_name_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_workflow_status
    config_node_property_drop_down_t *scheduledpurge_workflow_status_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_model_ids
    config_node_property_array_t *scheduledpurge_model_ids_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_daysold
    config_node_property_integer_t *scheduledpurge_daysold_local_nonprim = NULL;

    // com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_name
    cJSON *scheduledpurge_name = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_purge_scheduler_propertiesJSON, "scheduledpurge.name");
    if (cJSON_IsNull(scheduledpurge_name)) {
        scheduledpurge_name = NULL;
    }
    if (scheduledpurge_name) { 
    scheduledpurge_name_local_nonprim = config_node_property_string_parseFromJSON(scheduledpurge_name); //nonprimitive
    }

    // com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_workflow_status
    cJSON *scheduledpurge_workflow_status = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_purge_scheduler_propertiesJSON, "scheduledpurge.workflowStatus");
    if (cJSON_IsNull(scheduledpurge_workflow_status)) {
        scheduledpurge_workflow_status = NULL;
    }
    if (scheduledpurge_workflow_status) { 
    scheduledpurge_workflow_status_local_nonprim = config_node_property_drop_down_parseFromJSON(scheduledpurge_workflow_status); //nonprimitive
    }

    // com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_model_ids
    cJSON *scheduledpurge_model_ids = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_purge_scheduler_propertiesJSON, "scheduledpurge.modelIds");
    if (cJSON_IsNull(scheduledpurge_model_ids)) {
        scheduledpurge_model_ids = NULL;
    }
    if (scheduledpurge_model_ids) { 
    scheduledpurge_model_ids_local_nonprim = config_node_property_array_parseFromJSON(scheduledpurge_model_ids); //nonprimitive
    }

    // com_adobe_granite_workflow_purge_scheduler_properties->scheduledpurge_daysold
    cJSON *scheduledpurge_daysold = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_purge_scheduler_propertiesJSON, "scheduledpurge.daysold");
    if (cJSON_IsNull(scheduledpurge_daysold)) {
        scheduledpurge_daysold = NULL;
    }
    if (scheduledpurge_daysold) { 
    scheduledpurge_daysold_local_nonprim = config_node_property_integer_parseFromJSON(scheduledpurge_daysold); //nonprimitive
    }



    com_adobe_granite_workflow_purge_scheduler_properties_local_var = com_adobe_granite_workflow_purge_scheduler_properties_create_internal (
        scheduledpurge_name ? scheduledpurge_name_local_nonprim : NULL,
        scheduledpurge_workflow_status ? scheduledpurge_workflow_status_local_nonprim : NULL,
        scheduledpurge_model_ids ? scheduledpurge_model_ids_local_nonprim : NULL,
        scheduledpurge_daysold ? scheduledpurge_daysold_local_nonprim : NULL
        );

    if (!com_adobe_granite_workflow_purge_scheduler_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_workflow_purge_scheduler_properties_local_var;
end:
    if (scheduledpurge_name_local_nonprim) {
        config_node_property_string_free(scheduledpurge_name_local_nonprim);
        scheduledpurge_name_local_nonprim = NULL;
    }
    if (scheduledpurge_workflow_status_local_nonprim) {
        config_node_property_drop_down_free(scheduledpurge_workflow_status_local_nonprim);
        scheduledpurge_workflow_status_local_nonprim = NULL;
    }
    if (scheduledpurge_model_ids_local_nonprim) {
        config_node_property_array_free(scheduledpurge_model_ids_local_nonprim);
        scheduledpurge_model_ids_local_nonprim = NULL;
    }
    if (scheduledpurge_daysold_local_nonprim) {
        config_node_property_integer_free(scheduledpurge_daysold_local_nonprim);
        scheduledpurge_daysold_local_nonprim = NULL;
    }
    return NULL;

}
