#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties.h"



static com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_t *com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_create_internal(
    config_node_property_array_t *flush_agents
    ) {
    com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_t *com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_local_var = malloc(sizeof(com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_t));
    if (!com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_local_var, 0, sizeof(com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_t));
    com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_local_var->_library_owned = 1;
    com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_local_var->flush_agents = flush_agents;
    return com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_t *com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_create(
    config_node_property_array_t *flush_agents
    ) {
    com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_t *result = com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_create_internal (
        flush_agents
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_free(com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_t *com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties) {
    if(NULL == com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties){
        return ;
    }
    if(com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties->flush_agents) {
        config_node_property_array_free(com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties->flush_agents);
        com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties->flush_agents = NULL;
    }
    free(com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties);
}

cJSON *com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_convertToJSON(com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_t *com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties->flush_agents
    if(com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties->flush_agents) {
    cJSON *flush_agents_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties->flush_agents);
    if(flush_agents_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "flush.agents", flush_agents_local_JSON);
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

com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_t *com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_parseFromJSON(cJSON *com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_propertiesJSON){

    com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_t *com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties->flush_agents
    config_node_property_array_t *flush_agents_local_nonprim = NULL;

    // com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties->flush_agents
    cJSON *flush_agents = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_propertiesJSON, "flush.agents");
    if (cJSON_IsNull(flush_agents)) {
        flush_agents = NULL;
    }
    if (flush_agents) { 
    flush_agents_local_nonprim = config_node_property_array_parseFromJSON(flush_agents); //nonprimitive
    }



    com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_local_var = com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_create_internal (
        flush_agents ? flush_agents_local_nonprim : NULL
        );

    if (!com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties_local_var;
end:
    if (flush_agents_local_nonprim) {
        config_node_property_array_free(flush_agents_local_nonprim);
        flush_agents_local_nonprim = NULL;
    }
    return NULL;

}
