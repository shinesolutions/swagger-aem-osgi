#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties.h"



static com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_t *com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_create_internal(
    config_node_property_string_t *event_filter,
    config_node_property_integer_t *min_thread_pool_size,
    config_node_property_integer_t *max_thread_pool_size,
    config_node_property_boolean_t *cq_wcm_workflow_terminate_on_activate,
    config_node_property_array_t *cq_wcm_worklfow_terminate_exclusion_list
    ) {
    com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_t *com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_local_var = malloc(sizeof(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_t));
    if (!com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_local_var, 0, sizeof(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_t));
    com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_local_var->event_filter = event_filter;
    com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_local_var->min_thread_pool_size = min_thread_pool_size;
    com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_local_var->max_thread_pool_size = max_thread_pool_size;
    com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_local_var->cq_wcm_workflow_terminate_on_activate = cq_wcm_workflow_terminate_on_activate;
    com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_local_var->cq_wcm_worklfow_terminate_exclusion_list = cq_wcm_worklfow_terminate_exclusion_list;
    return com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_t *com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_create(
    config_node_property_string_t *event_filter,
    config_node_property_integer_t *min_thread_pool_size,
    config_node_property_integer_t *max_thread_pool_size,
    config_node_property_boolean_t *cq_wcm_workflow_terminate_on_activate,
    config_node_property_array_t *cq_wcm_worklfow_terminate_exclusion_list
    ) {
    com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_t *result = com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_create_internal (
        event_filter,
        min_thread_pool_size,
        max_thread_pool_size,
        cq_wcm_workflow_terminate_on_activate,
        cq_wcm_worklfow_terminate_exclusion_list
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_free(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_t *com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties) {
    if(NULL == com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties){
        return ;
    }
    if(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->event_filter) {
        config_node_property_string_free(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->event_filter);
        com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->event_filter = NULL;
    }
    if (com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->min_thread_pool_size) {
        config_node_property_integer_free(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->min_thread_pool_size);
        com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->min_thread_pool_size = NULL;
    }
    if (com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->max_thread_pool_size) {
        config_node_property_integer_free(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->max_thread_pool_size);
        com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->max_thread_pool_size = NULL;
    }
    if (com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->cq_wcm_workflow_terminate_on_activate) {
        config_node_property_boolean_free(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->cq_wcm_workflow_terminate_on_activate);
        com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->cq_wcm_workflow_terminate_on_activate = NULL;
    }
    if (com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->cq_wcm_worklfow_terminate_exclusion_list) {
        config_node_property_array_free(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->cq_wcm_worklfow_terminate_exclusion_list);
        com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->cq_wcm_worklfow_terminate_exclusion_list = NULL;
    }
    free(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties);
}

cJSON *com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_convertToJSON(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_t *com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->event_filter
    if(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->event_filter) {
    cJSON *event_filter_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->event_filter);
    if(event_filter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "event.filter", event_filter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->min_thread_pool_size
    if(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->min_thread_pool_size) {
    cJSON *min_thread_pool_size_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->min_thread_pool_size);
    if(min_thread_pool_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "minThreadPoolSize", min_thread_pool_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->max_thread_pool_size
    if(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->max_thread_pool_size) {
    cJSON *max_thread_pool_size_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->max_thread_pool_size);
    if(max_thread_pool_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxThreadPoolSize", max_thread_pool_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->cq_wcm_workflow_terminate_on_activate
    if(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->cq_wcm_workflow_terminate_on_activate) {
    cJSON *cq_wcm_workflow_terminate_on_activate_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->cq_wcm_workflow_terminate_on_activate);
    if(cq_wcm_workflow_terminate_on_activate_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.wcm.workflow.terminate.on.activate", cq_wcm_workflow_terminate_on_activate_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->cq_wcm_worklfow_terminate_exclusion_list
    if(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->cq_wcm_worklfow_terminate_exclusion_list) {
    cJSON *cq_wcm_worklfow_terminate_exclusion_list_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->cq_wcm_worklfow_terminate_exclusion_list);
    if(cq_wcm_worklfow_terminate_exclusion_list_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.wcm.worklfow.terminate.exclusion.list", cq_wcm_worklfow_terminate_exclusion_list_local_JSON);
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

com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_t *com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_parseFromJSON(cJSON *com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_propertiesJSON){

    com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_t *com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->event_filter
    config_node_property_string_t *event_filter_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->min_thread_pool_size
    config_node_property_integer_t *min_thread_pool_size_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->max_thread_pool_size
    config_node_property_integer_t *max_thread_pool_size_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->cq_wcm_workflow_terminate_on_activate
    config_node_property_boolean_t *cq_wcm_workflow_terminate_on_activate_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->cq_wcm_worklfow_terminate_exclusion_list
    config_node_property_array_t *cq_wcm_worklfow_terminate_exclusion_list_local_nonprim = NULL;

    // com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->event_filter
    cJSON *event_filter = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_propertiesJSON, "event.filter");
    if (cJSON_IsNull(event_filter)) {
        event_filter = NULL;
    }
    if (event_filter) { 
    event_filter_local_nonprim = config_node_property_string_parseFromJSON(event_filter); //nonprimitive
    }

    // com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->min_thread_pool_size
    cJSON *min_thread_pool_size = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_propertiesJSON, "minThreadPoolSize");
    if (cJSON_IsNull(min_thread_pool_size)) {
        min_thread_pool_size = NULL;
    }
    if (min_thread_pool_size) { 
    min_thread_pool_size_local_nonprim = config_node_property_integer_parseFromJSON(min_thread_pool_size); //nonprimitive
    }

    // com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->max_thread_pool_size
    cJSON *max_thread_pool_size = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_propertiesJSON, "maxThreadPoolSize");
    if (cJSON_IsNull(max_thread_pool_size)) {
        max_thread_pool_size = NULL;
    }
    if (max_thread_pool_size) { 
    max_thread_pool_size_local_nonprim = config_node_property_integer_parseFromJSON(max_thread_pool_size); //nonprimitive
    }

    // com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->cq_wcm_workflow_terminate_on_activate
    cJSON *cq_wcm_workflow_terminate_on_activate = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_propertiesJSON, "cq.wcm.workflow.terminate.on.activate");
    if (cJSON_IsNull(cq_wcm_workflow_terminate_on_activate)) {
        cq_wcm_workflow_terminate_on_activate = NULL;
    }
    if (cq_wcm_workflow_terminate_on_activate) { 
    cq_wcm_workflow_terminate_on_activate_local_nonprim = config_node_property_boolean_parseFromJSON(cq_wcm_workflow_terminate_on_activate); //nonprimitive
    }

    // com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties->cq_wcm_worklfow_terminate_exclusion_list
    cJSON *cq_wcm_worklfow_terminate_exclusion_list = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_propertiesJSON, "cq.wcm.worklfow.terminate.exclusion.list");
    if (cJSON_IsNull(cq_wcm_worklfow_terminate_exclusion_list)) {
        cq_wcm_worklfow_terminate_exclusion_list = NULL;
    }
    if (cq_wcm_worklfow_terminate_exclusion_list) { 
    cq_wcm_worklfow_terminate_exclusion_list_local_nonprim = config_node_property_array_parseFromJSON(cq_wcm_worklfow_terminate_exclusion_list); //nonprimitive
    }



    com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_local_var = com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_create_internal (
        event_filter ? event_filter_local_nonprim : NULL,
        min_thread_pool_size ? min_thread_pool_size_local_nonprim : NULL,
        max_thread_pool_size ? max_thread_pool_size_local_nonprim : NULL,
        cq_wcm_workflow_terminate_on_activate ? cq_wcm_workflow_terminate_on_activate_local_nonprim : NULL,
        cq_wcm_worklfow_terminate_exclusion_list ? cq_wcm_worklfow_terminate_exclusion_list_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properties_local_var;
end:
    if (event_filter_local_nonprim) {
        config_node_property_string_free(event_filter_local_nonprim);
        event_filter_local_nonprim = NULL;
    }
    if (min_thread_pool_size_local_nonprim) {
        config_node_property_integer_free(min_thread_pool_size_local_nonprim);
        min_thread_pool_size_local_nonprim = NULL;
    }
    if (max_thread_pool_size_local_nonprim) {
        config_node_property_integer_free(max_thread_pool_size_local_nonprim);
        max_thread_pool_size_local_nonprim = NULL;
    }
    if (cq_wcm_workflow_terminate_on_activate_local_nonprim) {
        config_node_property_boolean_free(cq_wcm_workflow_terminate_on_activate_local_nonprim);
        cq_wcm_workflow_terminate_on_activate_local_nonprim = NULL;
    }
    if (cq_wcm_worklfow_terminate_exclusion_list_local_nonprim) {
        config_node_property_array_free(cq_wcm_worklfow_terminate_exclusion_list_local_nonprim);
        cq_wcm_worklfow_terminate_exclusion_list_local_nonprim = NULL;
    }
    return NULL;

}
