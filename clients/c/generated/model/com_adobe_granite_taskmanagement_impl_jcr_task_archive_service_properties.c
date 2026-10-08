#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties.h"



static com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_t *com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_create_internal(
    config_node_property_boolean_t *archiving_enabled,
    config_node_property_string_t *scheduler_expression,
    config_node_property_integer_t *archive_since_days_completed
    ) {
    com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_t *com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_local_var = malloc(sizeof(com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_t));
    if (!com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_local_var, 0, sizeof(com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_t));
    com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_local_var->_library_owned = 1;
    com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_local_var->archiving_enabled = archiving_enabled;
    com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_local_var->scheduler_expression = scheduler_expression;
    com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_local_var->archive_since_days_completed = archive_since_days_completed;
    return com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_t *com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_create(
    config_node_property_boolean_t *archiving_enabled,
    config_node_property_string_t *scheduler_expression,
    config_node_property_integer_t *archive_since_days_completed
    ) {
    com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_t *result = com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_create_internal (
        archiving_enabled,
        scheduler_expression,
        archive_since_days_completed
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_free(com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_t *com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties) {
    if(NULL == com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties){
        return ;
    }
    if(com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->archiving_enabled) {
        config_node_property_boolean_free(com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->archiving_enabled);
        com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->archiving_enabled = NULL;
    }
    if (com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->scheduler_expression) {
        config_node_property_string_free(com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->scheduler_expression);
        com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->scheduler_expression = NULL;
    }
    if (com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->archive_since_days_completed) {
        config_node_property_integer_free(com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->archive_since_days_completed);
        com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->archive_since_days_completed = NULL;
    }
    free(com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties);
}

cJSON *com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_convertToJSON(com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_t *com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->archiving_enabled
    if(com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->archiving_enabled) {
    cJSON *archiving_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->archiving_enabled);
    if(archiving_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "archiving.enabled", archiving_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->scheduler_expression
    if(com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->scheduler_expression) {
    cJSON *scheduler_expression_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->scheduler_expression);
    if(scheduler_expression_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduler.expression", scheduler_expression_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->archive_since_days_completed
    if(com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->archive_since_days_completed) {
    cJSON *archive_since_days_completed_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->archive_since_days_completed);
    if(archive_since_days_completed_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "archive.since.days.completed", archive_since_days_completed_local_JSON);
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

com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_t *com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_parseFromJSON(cJSON *com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_propertiesJSON){

    com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_t *com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->archiving_enabled
    config_node_property_boolean_t *archiving_enabled_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->scheduler_expression
    config_node_property_string_t *scheduler_expression_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->archive_since_days_completed
    config_node_property_integer_t *archive_since_days_completed_local_nonprim = NULL;

    // com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->archiving_enabled
    cJSON *archiving_enabled = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_propertiesJSON, "archiving.enabled");
    if (cJSON_IsNull(archiving_enabled)) {
        archiving_enabled = NULL;
    }
    if (archiving_enabled) { 
    archiving_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(archiving_enabled); //nonprimitive
    }

    // com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->scheduler_expression
    cJSON *scheduler_expression = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_propertiesJSON, "scheduler.expression");
    if (cJSON_IsNull(scheduler_expression)) {
        scheduler_expression = NULL;
    }
    if (scheduler_expression) { 
    scheduler_expression_local_nonprim = config_node_property_string_parseFromJSON(scheduler_expression); //nonprimitive
    }

    // com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties->archive_since_days_completed
    cJSON *archive_since_days_completed = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_propertiesJSON, "archive.since.days.completed");
    if (cJSON_IsNull(archive_since_days_completed)) {
        archive_since_days_completed = NULL;
    }
    if (archive_since_days_completed) { 
    archive_since_days_completed_local_nonprim = config_node_property_integer_parseFromJSON(archive_since_days_completed); //nonprimitive
    }



    com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_local_var = com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_create_internal (
        archiving_enabled ? archiving_enabled_local_nonprim : NULL,
        scheduler_expression ? scheduler_expression_local_nonprim : NULL,
        archive_since_days_completed ? archive_since_days_completed_local_nonprim : NULL
        );

    if (!com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_properties_local_var;
end:
    if (archiving_enabled_local_nonprim) {
        config_node_property_boolean_free(archiving_enabled_local_nonprim);
        archiving_enabled_local_nonprim = NULL;
    }
    if (scheduler_expression_local_nonprim) {
        config_node_property_string_free(scheduler_expression_local_nonprim);
        scheduler_expression_local_nonprim = NULL;
    }
    if (archive_since_days_completed_local_nonprim) {
        config_node_property_integer_free(archive_since_days_completed_local_nonprim);
        archive_since_days_completed_local_nonprim = NULL;
    }
    return NULL;

}
