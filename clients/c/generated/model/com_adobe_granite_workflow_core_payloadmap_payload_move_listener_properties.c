#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties.h"



static com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_t *com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_create_internal(
    config_node_property_array_t *payload_move_white_list,
    config_node_property_boolean_t *payload_move_handle_from_workflow_process
    ) {
    com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_t *com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_local_var = malloc(sizeof(com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_t));
    if (!com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_local_var, 0, sizeof(com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_t));
    com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_local_var->_library_owned = 1;
    com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_local_var->payload_move_white_list = payload_move_white_list;
    com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_local_var->payload_move_handle_from_workflow_process = payload_move_handle_from_workflow_process;
    return com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_t *com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_create(
    config_node_property_array_t *payload_move_white_list,
    config_node_property_boolean_t *payload_move_handle_from_workflow_process
    ) {
    com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_t *result = com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_create_internal (
        payload_move_white_list,
        payload_move_handle_from_workflow_process
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_free(com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_t *com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties) {
    if(NULL == com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties){
        return ;
    }
    if(com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties->payload_move_white_list) {
        config_node_property_array_free(com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties->payload_move_white_list);
        com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties->payload_move_white_list = NULL;
    }
    if (com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties->payload_move_handle_from_workflow_process) {
        config_node_property_boolean_free(com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties->payload_move_handle_from_workflow_process);
        com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties->payload_move_handle_from_workflow_process = NULL;
    }
    free(com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties);
}

cJSON *com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_convertToJSON(com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_t *com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties->payload_move_white_list
    if(com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties->payload_move_white_list) {
    cJSON *payload_move_white_list_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties->payload_move_white_list);
    if(payload_move_white_list_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "payload.move.white.list", payload_move_white_list_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties->payload_move_handle_from_workflow_process
    if(com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties->payload_move_handle_from_workflow_process) {
    cJSON *payload_move_handle_from_workflow_process_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties->payload_move_handle_from_workflow_process);
    if(payload_move_handle_from_workflow_process_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "payload.move.handle.from.workflow.process", payload_move_handle_from_workflow_process_local_JSON);
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

com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_t *com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_parseFromJSON(cJSON *com_adobe_granite_workflow_core_payloadmap_payload_move_listener_propertiesJSON){

    com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_t *com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties->payload_move_white_list
    config_node_property_array_t *payload_move_white_list_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties->payload_move_handle_from_workflow_process
    config_node_property_boolean_t *payload_move_handle_from_workflow_process_local_nonprim = NULL;

    // com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties->payload_move_white_list
    cJSON *payload_move_white_list = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_core_payloadmap_payload_move_listener_propertiesJSON, "payload.move.white.list");
    if (cJSON_IsNull(payload_move_white_list)) {
        payload_move_white_list = NULL;
    }
    if (payload_move_white_list) { 
    payload_move_white_list_local_nonprim = config_node_property_array_parseFromJSON(payload_move_white_list); //nonprimitive
    }

    // com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties->payload_move_handle_from_workflow_process
    cJSON *payload_move_handle_from_workflow_process = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_core_payloadmap_payload_move_listener_propertiesJSON, "payload.move.handle.from.workflow.process");
    if (cJSON_IsNull(payload_move_handle_from_workflow_process)) {
        payload_move_handle_from_workflow_process = NULL;
    }
    if (payload_move_handle_from_workflow_process) { 
    payload_move_handle_from_workflow_process_local_nonprim = config_node_property_boolean_parseFromJSON(payload_move_handle_from_workflow_process); //nonprimitive
    }



    com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_local_var = com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_create_internal (
        payload_move_white_list ? payload_move_white_list_local_nonprim : NULL,
        payload_move_handle_from_workflow_process ? payload_move_handle_from_workflow_process_local_nonprim : NULL
        );

    if (!com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_workflow_core_payloadmap_payload_move_listener_properties_local_var;
end:
    if (payload_move_white_list_local_nonprim) {
        config_node_property_array_free(payload_move_white_list_local_nonprim);
        payload_move_white_list_local_nonprim = NULL;
    }
    if (payload_move_handle_from_workflow_process_local_nonprim) {
        config_node_property_boolean_free(payload_move_handle_from_workflow_process_local_nonprim);
        payload_move_handle_from_workflow_process_local_nonprim = NULL;
    }
    return NULL;

}
