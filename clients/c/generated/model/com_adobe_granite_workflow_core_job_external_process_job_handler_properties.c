#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_workflow_core_job_external_process_job_handler_properties.h"



static com_adobe_granite_workflow_core_job_external_process_job_handler_properties_t *com_adobe_granite_workflow_core_job_external_process_job_handler_properties_create_internal(
    config_node_property_integer_t *default_timeout,
    config_node_property_integer_t *max_timeout,
    config_node_property_integer_t *default_period
    ) {
    com_adobe_granite_workflow_core_job_external_process_job_handler_properties_t *com_adobe_granite_workflow_core_job_external_process_job_handler_properties_local_var = malloc(sizeof(com_adobe_granite_workflow_core_job_external_process_job_handler_properties_t));
    if (!com_adobe_granite_workflow_core_job_external_process_job_handler_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_workflow_core_job_external_process_job_handler_properties_local_var, 0, sizeof(com_adobe_granite_workflow_core_job_external_process_job_handler_properties_t));
    com_adobe_granite_workflow_core_job_external_process_job_handler_properties_local_var->_library_owned = 1;
    com_adobe_granite_workflow_core_job_external_process_job_handler_properties_local_var->default_timeout = default_timeout;
    com_adobe_granite_workflow_core_job_external_process_job_handler_properties_local_var->max_timeout = max_timeout;
    com_adobe_granite_workflow_core_job_external_process_job_handler_properties_local_var->default_period = default_period;
    return com_adobe_granite_workflow_core_job_external_process_job_handler_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_workflow_core_job_external_process_job_handler_properties_t *com_adobe_granite_workflow_core_job_external_process_job_handler_properties_create(
    config_node_property_integer_t *default_timeout,
    config_node_property_integer_t *max_timeout,
    config_node_property_integer_t *default_period
    ) {
    com_adobe_granite_workflow_core_job_external_process_job_handler_properties_t *result = com_adobe_granite_workflow_core_job_external_process_job_handler_properties_create_internal (
        default_timeout,
        max_timeout,
        default_period
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_workflow_core_job_external_process_job_handler_properties_free(com_adobe_granite_workflow_core_job_external_process_job_handler_properties_t *com_adobe_granite_workflow_core_job_external_process_job_handler_properties) {
    if(NULL == com_adobe_granite_workflow_core_job_external_process_job_handler_properties){
        return ;
    }
    if(com_adobe_granite_workflow_core_job_external_process_job_handler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_workflow_core_job_external_process_job_handler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_workflow_core_job_external_process_job_handler_properties->default_timeout) {
        config_node_property_integer_free(com_adobe_granite_workflow_core_job_external_process_job_handler_properties->default_timeout);
        com_adobe_granite_workflow_core_job_external_process_job_handler_properties->default_timeout = NULL;
    }
    if (com_adobe_granite_workflow_core_job_external_process_job_handler_properties->max_timeout) {
        config_node_property_integer_free(com_adobe_granite_workflow_core_job_external_process_job_handler_properties->max_timeout);
        com_adobe_granite_workflow_core_job_external_process_job_handler_properties->max_timeout = NULL;
    }
    if (com_adobe_granite_workflow_core_job_external_process_job_handler_properties->default_period) {
        config_node_property_integer_free(com_adobe_granite_workflow_core_job_external_process_job_handler_properties->default_period);
        com_adobe_granite_workflow_core_job_external_process_job_handler_properties->default_period = NULL;
    }
    free(com_adobe_granite_workflow_core_job_external_process_job_handler_properties);
}

cJSON *com_adobe_granite_workflow_core_job_external_process_job_handler_properties_convertToJSON(com_adobe_granite_workflow_core_job_external_process_job_handler_properties_t *com_adobe_granite_workflow_core_job_external_process_job_handler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_workflow_core_job_external_process_job_handler_properties->default_timeout
    if(com_adobe_granite_workflow_core_job_external_process_job_handler_properties->default_timeout) {
    cJSON *default_timeout_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_workflow_core_job_external_process_job_handler_properties->default_timeout);
    if(default_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "default.timeout", default_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_workflow_core_job_external_process_job_handler_properties->max_timeout
    if(com_adobe_granite_workflow_core_job_external_process_job_handler_properties->max_timeout) {
    cJSON *max_timeout_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_workflow_core_job_external_process_job_handler_properties->max_timeout);
    if(max_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "max.timeout", max_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_workflow_core_job_external_process_job_handler_properties->default_period
    if(com_adobe_granite_workflow_core_job_external_process_job_handler_properties->default_period) {
    cJSON *default_period_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_workflow_core_job_external_process_job_handler_properties->default_period);
    if(default_period_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "default.period", default_period_local_JSON);
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

com_adobe_granite_workflow_core_job_external_process_job_handler_properties_t *com_adobe_granite_workflow_core_job_external_process_job_handler_properties_parseFromJSON(cJSON *com_adobe_granite_workflow_core_job_external_process_job_handler_propertiesJSON){

    com_adobe_granite_workflow_core_job_external_process_job_handler_properties_t *com_adobe_granite_workflow_core_job_external_process_job_handler_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_workflow_core_job_external_process_job_handler_properties->default_timeout
    config_node_property_integer_t *default_timeout_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_workflow_core_job_external_process_job_handler_properties->max_timeout
    config_node_property_integer_t *max_timeout_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_workflow_core_job_external_process_job_handler_properties->default_period
    config_node_property_integer_t *default_period_local_nonprim = NULL;

    // com_adobe_granite_workflow_core_job_external_process_job_handler_properties->default_timeout
    cJSON *default_timeout = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_core_job_external_process_job_handler_propertiesJSON, "default.timeout");
    if (cJSON_IsNull(default_timeout)) {
        default_timeout = NULL;
    }
    if (default_timeout) { 
    default_timeout_local_nonprim = config_node_property_integer_parseFromJSON(default_timeout); //nonprimitive
    }

    // com_adobe_granite_workflow_core_job_external_process_job_handler_properties->max_timeout
    cJSON *max_timeout = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_core_job_external_process_job_handler_propertiesJSON, "max.timeout");
    if (cJSON_IsNull(max_timeout)) {
        max_timeout = NULL;
    }
    if (max_timeout) { 
    max_timeout_local_nonprim = config_node_property_integer_parseFromJSON(max_timeout); //nonprimitive
    }

    // com_adobe_granite_workflow_core_job_external_process_job_handler_properties->default_period
    cJSON *default_period = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_core_job_external_process_job_handler_propertiesJSON, "default.period");
    if (cJSON_IsNull(default_period)) {
        default_period = NULL;
    }
    if (default_period) { 
    default_period_local_nonprim = config_node_property_integer_parseFromJSON(default_period); //nonprimitive
    }



    com_adobe_granite_workflow_core_job_external_process_job_handler_properties_local_var = com_adobe_granite_workflow_core_job_external_process_job_handler_properties_create_internal (
        default_timeout ? default_timeout_local_nonprim : NULL,
        max_timeout ? max_timeout_local_nonprim : NULL,
        default_period ? default_period_local_nonprim : NULL
        );

    if (!com_adobe_granite_workflow_core_job_external_process_job_handler_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_workflow_core_job_external_process_job_handler_properties_local_var;
end:
    if (default_timeout_local_nonprim) {
        config_node_property_integer_free(default_timeout_local_nonprim);
        default_timeout_local_nonprim = NULL;
    }
    if (max_timeout_local_nonprim) {
        config_node_property_integer_free(max_timeout_local_nonprim);
        max_timeout_local_nonprim = NULL;
    }
    if (default_period_local_nonprim) {
        config_node_property_integer_free(default_period_local_nonprim);
        default_period_local_nonprim = NULL;
    }
    return NULL;

}
