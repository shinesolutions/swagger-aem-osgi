#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_history_impl_history_service_impl_properties.h"



static com_adobe_cq_history_impl_history_service_impl_properties_t *com_adobe_cq_history_impl_history_service_impl_properties_create_internal(
    config_node_property_array_t *history_service_resource_types,
    config_node_property_array_t *history_service_path_filter
    ) {
    com_adobe_cq_history_impl_history_service_impl_properties_t *com_adobe_cq_history_impl_history_service_impl_properties_local_var = malloc(sizeof(com_adobe_cq_history_impl_history_service_impl_properties_t));
    if (!com_adobe_cq_history_impl_history_service_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_history_impl_history_service_impl_properties_local_var, 0, sizeof(com_adobe_cq_history_impl_history_service_impl_properties_t));
    com_adobe_cq_history_impl_history_service_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_history_impl_history_service_impl_properties_local_var->history_service_resource_types = history_service_resource_types;
    com_adobe_cq_history_impl_history_service_impl_properties_local_var->history_service_path_filter = history_service_path_filter;
    return com_adobe_cq_history_impl_history_service_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_history_impl_history_service_impl_properties_t *com_adobe_cq_history_impl_history_service_impl_properties_create(
    config_node_property_array_t *history_service_resource_types,
    config_node_property_array_t *history_service_path_filter
    ) {
    com_adobe_cq_history_impl_history_service_impl_properties_t *result = com_adobe_cq_history_impl_history_service_impl_properties_create_internal (
        history_service_resource_types,
        history_service_path_filter
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_history_impl_history_service_impl_properties_free(com_adobe_cq_history_impl_history_service_impl_properties_t *com_adobe_cq_history_impl_history_service_impl_properties) {
    if(NULL == com_adobe_cq_history_impl_history_service_impl_properties){
        return ;
    }
    if(com_adobe_cq_history_impl_history_service_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_history_impl_history_service_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_history_impl_history_service_impl_properties->history_service_resource_types) {
        config_node_property_array_free(com_adobe_cq_history_impl_history_service_impl_properties->history_service_resource_types);
        com_adobe_cq_history_impl_history_service_impl_properties->history_service_resource_types = NULL;
    }
    if (com_adobe_cq_history_impl_history_service_impl_properties->history_service_path_filter) {
        config_node_property_array_free(com_adobe_cq_history_impl_history_service_impl_properties->history_service_path_filter);
        com_adobe_cq_history_impl_history_service_impl_properties->history_service_path_filter = NULL;
    }
    free(com_adobe_cq_history_impl_history_service_impl_properties);
}

cJSON *com_adobe_cq_history_impl_history_service_impl_properties_convertToJSON(com_adobe_cq_history_impl_history_service_impl_properties_t *com_adobe_cq_history_impl_history_service_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_history_impl_history_service_impl_properties->history_service_resource_types
    if(com_adobe_cq_history_impl_history_service_impl_properties->history_service_resource_types) {
    cJSON *history_service_resource_types_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_history_impl_history_service_impl_properties->history_service_resource_types);
    if(history_service_resource_types_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "history.service.resourceTypes", history_service_resource_types_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_history_impl_history_service_impl_properties->history_service_path_filter
    if(com_adobe_cq_history_impl_history_service_impl_properties->history_service_path_filter) {
    cJSON *history_service_path_filter_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_history_impl_history_service_impl_properties->history_service_path_filter);
    if(history_service_path_filter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "history.service.pathFilter", history_service_path_filter_local_JSON);
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

com_adobe_cq_history_impl_history_service_impl_properties_t *com_adobe_cq_history_impl_history_service_impl_properties_parseFromJSON(cJSON *com_adobe_cq_history_impl_history_service_impl_propertiesJSON){

    com_adobe_cq_history_impl_history_service_impl_properties_t *com_adobe_cq_history_impl_history_service_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_history_impl_history_service_impl_properties->history_service_resource_types
    config_node_property_array_t *history_service_resource_types_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_history_impl_history_service_impl_properties->history_service_path_filter
    config_node_property_array_t *history_service_path_filter_local_nonprim = NULL;

    // com_adobe_cq_history_impl_history_service_impl_properties->history_service_resource_types
    cJSON *history_service_resource_types = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_history_impl_history_service_impl_propertiesJSON, "history.service.resourceTypes");
    if (cJSON_IsNull(history_service_resource_types)) {
        history_service_resource_types = NULL;
    }
    if (history_service_resource_types) { 
    history_service_resource_types_local_nonprim = config_node_property_array_parseFromJSON(history_service_resource_types); //nonprimitive
    }

    // com_adobe_cq_history_impl_history_service_impl_properties->history_service_path_filter
    cJSON *history_service_path_filter = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_history_impl_history_service_impl_propertiesJSON, "history.service.pathFilter");
    if (cJSON_IsNull(history_service_path_filter)) {
        history_service_path_filter = NULL;
    }
    if (history_service_path_filter) { 
    history_service_path_filter_local_nonprim = config_node_property_array_parseFromJSON(history_service_path_filter); //nonprimitive
    }



    com_adobe_cq_history_impl_history_service_impl_properties_local_var = com_adobe_cq_history_impl_history_service_impl_properties_create_internal (
        history_service_resource_types ? history_service_resource_types_local_nonprim : NULL,
        history_service_path_filter ? history_service_path_filter_local_nonprim : NULL
        );

    if (!com_adobe_cq_history_impl_history_service_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_history_impl_history_service_impl_properties_local_var;
end:
    if (history_service_resource_types_local_nonprim) {
        config_node_property_array_free(history_service_resource_types_local_nonprim);
        history_service_resource_types_local_nonprim = NULL;
    }
    if (history_service_path_filter_local_nonprim) {
        config_node_property_array_free(history_service_path_filter_local_nonprim);
        history_service_path_filter_local_nonprim = NULL;
    }
    return NULL;

}
