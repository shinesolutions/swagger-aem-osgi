#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_forms_common_servlet_temp_clean_up_task_properties.h"



static com_adobe_forms_common_servlet_temp_clean_up_task_properties_t *com_adobe_forms_common_servlet_temp_clean_up_task_properties_create_internal(
    config_node_property_string_t *scheduler_expression,
    config_node_property_string_t *duration_for_temporary_storage,
    config_node_property_string_t *duration_for_anonymous_storage
    ) {
    com_adobe_forms_common_servlet_temp_clean_up_task_properties_t *com_adobe_forms_common_servlet_temp_clean_up_task_properties_local_var = malloc(sizeof(com_adobe_forms_common_servlet_temp_clean_up_task_properties_t));
    if (!com_adobe_forms_common_servlet_temp_clean_up_task_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_forms_common_servlet_temp_clean_up_task_properties_local_var, 0, sizeof(com_adobe_forms_common_servlet_temp_clean_up_task_properties_t));
    com_adobe_forms_common_servlet_temp_clean_up_task_properties_local_var->_library_owned = 1;
    com_adobe_forms_common_servlet_temp_clean_up_task_properties_local_var->scheduler_expression = scheduler_expression;
    com_adobe_forms_common_servlet_temp_clean_up_task_properties_local_var->duration_for_temporary_storage = duration_for_temporary_storage;
    com_adobe_forms_common_servlet_temp_clean_up_task_properties_local_var->duration_for_anonymous_storage = duration_for_anonymous_storage;
    return com_adobe_forms_common_servlet_temp_clean_up_task_properties_local_var;
}

__attribute__((deprecated)) com_adobe_forms_common_servlet_temp_clean_up_task_properties_t *com_adobe_forms_common_servlet_temp_clean_up_task_properties_create(
    config_node_property_string_t *scheduler_expression,
    config_node_property_string_t *duration_for_temporary_storage,
    config_node_property_string_t *duration_for_anonymous_storage
    ) {
    com_adobe_forms_common_servlet_temp_clean_up_task_properties_t *result = com_adobe_forms_common_servlet_temp_clean_up_task_properties_create_internal (
        scheduler_expression,
        duration_for_temporary_storage,
        duration_for_anonymous_storage
        );
    if (!result) {
    }
    return result;
}

void com_adobe_forms_common_servlet_temp_clean_up_task_properties_free(com_adobe_forms_common_servlet_temp_clean_up_task_properties_t *com_adobe_forms_common_servlet_temp_clean_up_task_properties) {
    if(NULL == com_adobe_forms_common_servlet_temp_clean_up_task_properties){
        return ;
    }
    if(com_adobe_forms_common_servlet_temp_clean_up_task_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_forms_common_servlet_temp_clean_up_task_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_forms_common_servlet_temp_clean_up_task_properties->scheduler_expression) {
        config_node_property_string_free(com_adobe_forms_common_servlet_temp_clean_up_task_properties->scheduler_expression);
        com_adobe_forms_common_servlet_temp_clean_up_task_properties->scheduler_expression = NULL;
    }
    if (com_adobe_forms_common_servlet_temp_clean_up_task_properties->duration_for_temporary_storage) {
        config_node_property_string_free(com_adobe_forms_common_servlet_temp_clean_up_task_properties->duration_for_temporary_storage);
        com_adobe_forms_common_servlet_temp_clean_up_task_properties->duration_for_temporary_storage = NULL;
    }
    if (com_adobe_forms_common_servlet_temp_clean_up_task_properties->duration_for_anonymous_storage) {
        config_node_property_string_free(com_adobe_forms_common_servlet_temp_clean_up_task_properties->duration_for_anonymous_storage);
        com_adobe_forms_common_servlet_temp_clean_up_task_properties->duration_for_anonymous_storage = NULL;
    }
    free(com_adobe_forms_common_servlet_temp_clean_up_task_properties);
}

cJSON *com_adobe_forms_common_servlet_temp_clean_up_task_properties_convertToJSON(com_adobe_forms_common_servlet_temp_clean_up_task_properties_t *com_adobe_forms_common_servlet_temp_clean_up_task_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_forms_common_servlet_temp_clean_up_task_properties->scheduler_expression
    if(com_adobe_forms_common_servlet_temp_clean_up_task_properties->scheduler_expression) {
    cJSON *scheduler_expression_local_JSON = config_node_property_string_convertToJSON(com_adobe_forms_common_servlet_temp_clean_up_task_properties->scheduler_expression);
    if(scheduler_expression_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduler.expression", scheduler_expression_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_forms_common_servlet_temp_clean_up_task_properties->duration_for_temporary_storage
    if(com_adobe_forms_common_servlet_temp_clean_up_task_properties->duration_for_temporary_storage) {
    cJSON *duration_for_temporary_storage_local_JSON = config_node_property_string_convertToJSON(com_adobe_forms_common_servlet_temp_clean_up_task_properties->duration_for_temporary_storage);
    if(duration_for_temporary_storage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "Duration for Temporary Storage", duration_for_temporary_storage_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_forms_common_servlet_temp_clean_up_task_properties->duration_for_anonymous_storage
    if(com_adobe_forms_common_servlet_temp_clean_up_task_properties->duration_for_anonymous_storage) {
    cJSON *duration_for_anonymous_storage_local_JSON = config_node_property_string_convertToJSON(com_adobe_forms_common_servlet_temp_clean_up_task_properties->duration_for_anonymous_storage);
    if(duration_for_anonymous_storage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "Duration for Anonymous Storage", duration_for_anonymous_storage_local_JSON);
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

com_adobe_forms_common_servlet_temp_clean_up_task_properties_t *com_adobe_forms_common_servlet_temp_clean_up_task_properties_parseFromJSON(cJSON *com_adobe_forms_common_servlet_temp_clean_up_task_propertiesJSON){

    com_adobe_forms_common_servlet_temp_clean_up_task_properties_t *com_adobe_forms_common_servlet_temp_clean_up_task_properties_local_var = NULL;

    // define the local variable for com_adobe_forms_common_servlet_temp_clean_up_task_properties->scheduler_expression
    config_node_property_string_t *scheduler_expression_local_nonprim = NULL;

    // define the local variable for com_adobe_forms_common_servlet_temp_clean_up_task_properties->duration_for_temporary_storage
    config_node_property_string_t *duration_for_temporary_storage_local_nonprim = NULL;

    // define the local variable for com_adobe_forms_common_servlet_temp_clean_up_task_properties->duration_for_anonymous_storage
    config_node_property_string_t *duration_for_anonymous_storage_local_nonprim = NULL;

    // com_adobe_forms_common_servlet_temp_clean_up_task_properties->scheduler_expression
    cJSON *scheduler_expression = cJSON_GetObjectItemCaseSensitive(com_adobe_forms_common_servlet_temp_clean_up_task_propertiesJSON, "scheduler.expression");
    if (cJSON_IsNull(scheduler_expression)) {
        scheduler_expression = NULL;
    }
    if (scheduler_expression) { 
    scheduler_expression_local_nonprim = config_node_property_string_parseFromJSON(scheduler_expression); //nonprimitive
    }

    // com_adobe_forms_common_servlet_temp_clean_up_task_properties->duration_for_temporary_storage
    cJSON *duration_for_temporary_storage = cJSON_GetObjectItemCaseSensitive(com_adobe_forms_common_servlet_temp_clean_up_task_propertiesJSON, "Duration for Temporary Storage");
    if (cJSON_IsNull(duration_for_temporary_storage)) {
        duration_for_temporary_storage = NULL;
    }
    if (duration_for_temporary_storage) { 
    duration_for_temporary_storage_local_nonprim = config_node_property_string_parseFromJSON(duration_for_temporary_storage); //nonprimitive
    }

    // com_adobe_forms_common_servlet_temp_clean_up_task_properties->duration_for_anonymous_storage
    cJSON *duration_for_anonymous_storage = cJSON_GetObjectItemCaseSensitive(com_adobe_forms_common_servlet_temp_clean_up_task_propertiesJSON, "Duration for Anonymous Storage");
    if (cJSON_IsNull(duration_for_anonymous_storage)) {
        duration_for_anonymous_storage = NULL;
    }
    if (duration_for_anonymous_storage) { 
    duration_for_anonymous_storage_local_nonprim = config_node_property_string_parseFromJSON(duration_for_anonymous_storage); //nonprimitive
    }



    com_adobe_forms_common_servlet_temp_clean_up_task_properties_local_var = com_adobe_forms_common_servlet_temp_clean_up_task_properties_create_internal (
        scheduler_expression ? scheduler_expression_local_nonprim : NULL,
        duration_for_temporary_storage ? duration_for_temporary_storage_local_nonprim : NULL,
        duration_for_anonymous_storage ? duration_for_anonymous_storage_local_nonprim : NULL
        );

    if (!com_adobe_forms_common_servlet_temp_clean_up_task_properties_local_var) {
        goto end;
    }

    return com_adobe_forms_common_servlet_temp_clean_up_task_properties_local_var;
end:
    if (scheduler_expression_local_nonprim) {
        config_node_property_string_free(scheduler_expression_local_nonprim);
        scheduler_expression_local_nonprim = NULL;
    }
    if (duration_for_temporary_storage_local_nonprim) {
        config_node_property_string_free(duration_for_temporary_storage_local_nonprim);
        duration_for_temporary_storage_local_nonprim = NULL;
    }
    if (duration_for_anonymous_storage_local_nonprim) {
        config_node_property_string_free(duration_for_anonymous_storage_local_nonprim);
        duration_for_anonymous_storage_local_nonprim = NULL;
    }
    return NULL;

}
