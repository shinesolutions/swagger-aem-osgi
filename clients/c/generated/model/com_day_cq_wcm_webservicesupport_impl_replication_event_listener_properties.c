#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties.h"



static com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_t *com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_create_internal(
    config_node_property_array_t *flush_agents
    ) {
    com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_t *com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_local_var = malloc(sizeof(com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_t));
    if (!com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_local_var, 0, sizeof(com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_t));
    com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_local_var->flush_agents = flush_agents;
    return com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_t *com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_create(
    config_node_property_array_t *flush_agents
    ) {
    com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_t *result = com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_create_internal (
        flush_agents
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_free(com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_t *com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties) {
    if(NULL == com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties){
        return ;
    }
    if(com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties->flush_agents) {
        config_node_property_array_free(com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties->flush_agents);
        com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties->flush_agents = NULL;
    }
    free(com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties);
}

cJSON *com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_convertToJSON(com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_t *com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties->flush_agents
    if(com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties->flush_agents) {
    cJSON *flush_agents_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties->flush_agents);
    if(flush_agents_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "Flush agents", flush_agents_local_JSON);
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

com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_t *com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_parseFromJSON(cJSON *com_day_cq_wcm_webservicesupport_impl_replication_event_listener_propertiesJSON){

    com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_t *com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties->flush_agents
    config_node_property_array_t *flush_agents_local_nonprim = NULL;

    // com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties->flush_agents
    cJSON *flush_agents = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_webservicesupport_impl_replication_event_listener_propertiesJSON, "Flush agents");
    if (cJSON_IsNull(flush_agents)) {
        flush_agents = NULL;
    }
    if (flush_agents) { 
    flush_agents_local_nonprim = config_node_property_array_parseFromJSON(flush_agents); //nonprimitive
    }



    com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_local_var = com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_create_internal (
        flush_agents ? flush_agents_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_webservicesupport_impl_replication_event_listener_properties_local_var;
end:
    if (flush_agents_local_nonprim) {
        config_node_property_array_free(flush_agents_local_nonprim);
        flush_agents_local_nonprim = NULL;
    }
    return NULL;

}
