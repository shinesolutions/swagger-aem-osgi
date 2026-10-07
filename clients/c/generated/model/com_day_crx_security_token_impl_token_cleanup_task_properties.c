#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_crx_security_token_impl_token_cleanup_task_properties.h"



static com_day_crx_security_token_impl_token_cleanup_task_properties_t *com_day_crx_security_token_impl_token_cleanup_task_properties_create_internal(
    config_node_property_boolean_t *enable_token_cleanup_task,
    config_node_property_string_t *scheduler_expression,
    config_node_property_integer_t *batch_size
    ) {
    com_day_crx_security_token_impl_token_cleanup_task_properties_t *com_day_crx_security_token_impl_token_cleanup_task_properties_local_var = malloc(sizeof(com_day_crx_security_token_impl_token_cleanup_task_properties_t));
    if (!com_day_crx_security_token_impl_token_cleanup_task_properties_local_var) {
        return NULL;
    }
    memset(com_day_crx_security_token_impl_token_cleanup_task_properties_local_var, 0, sizeof(com_day_crx_security_token_impl_token_cleanup_task_properties_t));
    com_day_crx_security_token_impl_token_cleanup_task_properties_local_var->_library_owned = 1;
    com_day_crx_security_token_impl_token_cleanup_task_properties_local_var->enable_token_cleanup_task = enable_token_cleanup_task;
    com_day_crx_security_token_impl_token_cleanup_task_properties_local_var->scheduler_expression = scheduler_expression;
    com_day_crx_security_token_impl_token_cleanup_task_properties_local_var->batch_size = batch_size;
    return com_day_crx_security_token_impl_token_cleanup_task_properties_local_var;
}

__attribute__((deprecated)) com_day_crx_security_token_impl_token_cleanup_task_properties_t *com_day_crx_security_token_impl_token_cleanup_task_properties_create(
    config_node_property_boolean_t *enable_token_cleanup_task,
    config_node_property_string_t *scheduler_expression,
    config_node_property_integer_t *batch_size
    ) {
    com_day_crx_security_token_impl_token_cleanup_task_properties_t *result = com_day_crx_security_token_impl_token_cleanup_task_properties_create_internal (
        enable_token_cleanup_task,
        scheduler_expression,
        batch_size
        );
    if (!result) {
    }
    return result;
}

void com_day_crx_security_token_impl_token_cleanup_task_properties_free(com_day_crx_security_token_impl_token_cleanup_task_properties_t *com_day_crx_security_token_impl_token_cleanup_task_properties) {
    if(NULL == com_day_crx_security_token_impl_token_cleanup_task_properties){
        return ;
    }
    if(com_day_crx_security_token_impl_token_cleanup_task_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_crx_security_token_impl_token_cleanup_task_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_crx_security_token_impl_token_cleanup_task_properties->enable_token_cleanup_task) {
        config_node_property_boolean_free(com_day_crx_security_token_impl_token_cleanup_task_properties->enable_token_cleanup_task);
        com_day_crx_security_token_impl_token_cleanup_task_properties->enable_token_cleanup_task = NULL;
    }
    if (com_day_crx_security_token_impl_token_cleanup_task_properties->scheduler_expression) {
        config_node_property_string_free(com_day_crx_security_token_impl_token_cleanup_task_properties->scheduler_expression);
        com_day_crx_security_token_impl_token_cleanup_task_properties->scheduler_expression = NULL;
    }
    if (com_day_crx_security_token_impl_token_cleanup_task_properties->batch_size) {
        config_node_property_integer_free(com_day_crx_security_token_impl_token_cleanup_task_properties->batch_size);
        com_day_crx_security_token_impl_token_cleanup_task_properties->batch_size = NULL;
    }
    free(com_day_crx_security_token_impl_token_cleanup_task_properties);
}

cJSON *com_day_crx_security_token_impl_token_cleanup_task_properties_convertToJSON(com_day_crx_security_token_impl_token_cleanup_task_properties_t *com_day_crx_security_token_impl_token_cleanup_task_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_crx_security_token_impl_token_cleanup_task_properties->enable_token_cleanup_task
    if(com_day_crx_security_token_impl_token_cleanup_task_properties->enable_token_cleanup_task) {
    cJSON *enable_token_cleanup_task_local_JSON = config_node_property_boolean_convertToJSON(com_day_crx_security_token_impl_token_cleanup_task_properties->enable_token_cleanup_task);
    if(enable_token_cleanup_task_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enable.token.cleanup.task", enable_token_cleanup_task_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_crx_security_token_impl_token_cleanup_task_properties->scheduler_expression
    if(com_day_crx_security_token_impl_token_cleanup_task_properties->scheduler_expression) {
    cJSON *scheduler_expression_local_JSON = config_node_property_string_convertToJSON(com_day_crx_security_token_impl_token_cleanup_task_properties->scheduler_expression);
    if(scheduler_expression_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduler.expression", scheduler_expression_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_crx_security_token_impl_token_cleanup_task_properties->batch_size
    if(com_day_crx_security_token_impl_token_cleanup_task_properties->batch_size) {
    cJSON *batch_size_local_JSON = config_node_property_integer_convertToJSON(com_day_crx_security_token_impl_token_cleanup_task_properties->batch_size);
    if(batch_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "batch.size", batch_size_local_JSON);
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

com_day_crx_security_token_impl_token_cleanup_task_properties_t *com_day_crx_security_token_impl_token_cleanup_task_properties_parseFromJSON(cJSON *com_day_crx_security_token_impl_token_cleanup_task_propertiesJSON){

    com_day_crx_security_token_impl_token_cleanup_task_properties_t *com_day_crx_security_token_impl_token_cleanup_task_properties_local_var = NULL;

    // define the local variable for com_day_crx_security_token_impl_token_cleanup_task_properties->enable_token_cleanup_task
    config_node_property_boolean_t *enable_token_cleanup_task_local_nonprim = NULL;

    // define the local variable for com_day_crx_security_token_impl_token_cleanup_task_properties->scheduler_expression
    config_node_property_string_t *scheduler_expression_local_nonprim = NULL;

    // define the local variable for com_day_crx_security_token_impl_token_cleanup_task_properties->batch_size
    config_node_property_integer_t *batch_size_local_nonprim = NULL;

    // com_day_crx_security_token_impl_token_cleanup_task_properties->enable_token_cleanup_task
    cJSON *enable_token_cleanup_task = cJSON_GetObjectItemCaseSensitive(com_day_crx_security_token_impl_token_cleanup_task_propertiesJSON, "enable.token.cleanup.task");
    if (cJSON_IsNull(enable_token_cleanup_task)) {
        enable_token_cleanup_task = NULL;
    }
    if (enable_token_cleanup_task) { 
    enable_token_cleanup_task_local_nonprim = config_node_property_boolean_parseFromJSON(enable_token_cleanup_task); //nonprimitive
    }

    // com_day_crx_security_token_impl_token_cleanup_task_properties->scheduler_expression
    cJSON *scheduler_expression = cJSON_GetObjectItemCaseSensitive(com_day_crx_security_token_impl_token_cleanup_task_propertiesJSON, "scheduler.expression");
    if (cJSON_IsNull(scheduler_expression)) {
        scheduler_expression = NULL;
    }
    if (scheduler_expression) { 
    scheduler_expression_local_nonprim = config_node_property_string_parseFromJSON(scheduler_expression); //nonprimitive
    }

    // com_day_crx_security_token_impl_token_cleanup_task_properties->batch_size
    cJSON *batch_size = cJSON_GetObjectItemCaseSensitive(com_day_crx_security_token_impl_token_cleanup_task_propertiesJSON, "batch.size");
    if (cJSON_IsNull(batch_size)) {
        batch_size = NULL;
    }
    if (batch_size) { 
    batch_size_local_nonprim = config_node_property_integer_parseFromJSON(batch_size); //nonprimitive
    }



    com_day_crx_security_token_impl_token_cleanup_task_properties_local_var = com_day_crx_security_token_impl_token_cleanup_task_properties_create_internal (
        enable_token_cleanup_task ? enable_token_cleanup_task_local_nonprim : NULL,
        scheduler_expression ? scheduler_expression_local_nonprim : NULL,
        batch_size ? batch_size_local_nonprim : NULL
        );

    if (!com_day_crx_security_token_impl_token_cleanup_task_properties_local_var) {
        goto end;
    }

    return com_day_crx_security_token_impl_token_cleanup_task_properties_local_var;
end:
    if (enable_token_cleanup_task_local_nonprim) {
        config_node_property_boolean_free(enable_token_cleanup_task_local_nonprim);
        enable_token_cleanup_task_local_nonprim = NULL;
    }
    if (scheduler_expression_local_nonprim) {
        config_node_property_string_free(scheduler_expression_local_nonprim);
        scheduler_expression_local_nonprim = NULL;
    }
    if (batch_size_local_nonprim) {
        config_node_property_integer_free(batch_size_local_nonprim);
        batch_size_local_nonprim = NULL;
    }
    return NULL;

}
