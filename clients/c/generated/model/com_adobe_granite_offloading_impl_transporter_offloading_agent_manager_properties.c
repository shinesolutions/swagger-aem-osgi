#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties.h"



static com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_t *com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_create_internal(
    config_node_property_boolean_t *offloading_agentmanager_enabled
    ) {
    com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_t *com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_local_var = malloc(sizeof(com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_t));
    if (!com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_local_var, 0, sizeof(com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_t));
    com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_local_var->_library_owned = 1;
    com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_local_var->offloading_agentmanager_enabled = offloading_agentmanager_enabled;
    return com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_t *com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_create(
    config_node_property_boolean_t *offloading_agentmanager_enabled
    ) {
    com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_t *result = com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_create_internal (
        offloading_agentmanager_enabled
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_free(com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_t *com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties) {
    if(NULL == com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties){
        return ;
    }
    if(com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties->offloading_agentmanager_enabled) {
        config_node_property_boolean_free(com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties->offloading_agentmanager_enabled);
        com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties->offloading_agentmanager_enabled = NULL;
    }
    free(com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties);
}

cJSON *com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_convertToJSON(com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_t *com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties->offloading_agentmanager_enabled
    if(com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties->offloading_agentmanager_enabled) {
    cJSON *offloading_agentmanager_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties->offloading_agentmanager_enabled);
    if(offloading_agentmanager_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "offloading.agentmanager.enabled", offloading_agentmanager_enabled_local_JSON);
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

com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_t *com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_parseFromJSON(cJSON *com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_propertiesJSON){

    com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_t *com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties->offloading_agentmanager_enabled
    config_node_property_boolean_t *offloading_agentmanager_enabled_local_nonprim = NULL;

    // com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties->offloading_agentmanager_enabled
    cJSON *offloading_agentmanager_enabled = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_propertiesJSON, "offloading.agentmanager.enabled");
    if (cJSON_IsNull(offloading_agentmanager_enabled)) {
        offloading_agentmanager_enabled = NULL;
    }
    if (offloading_agentmanager_enabled) { 
    offloading_agentmanager_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(offloading_agentmanager_enabled); //nonprimitive
    }



    com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_local_var = com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_create_internal (
        offloading_agentmanager_enabled ? offloading_agentmanager_enabled_local_nonprim : NULL
        );

    if (!com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_properties_local_var;
end:
    if (offloading_agentmanager_enabled_local_nonprim) {
        config_node_property_boolean_free(offloading_agentmanager_enabled_local_nonprim);
        offloading_agentmanager_enabled_local_nonprim = NULL;
    }
    return NULL;

}
