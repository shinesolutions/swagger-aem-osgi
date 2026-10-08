#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_replication_impl_replicator_impl_properties.h"



static com_day_cq_replication_impl_replicator_impl_properties_t *com_day_cq_replication_impl_replicator_impl_properties_create_internal(
    config_node_property_boolean_t *distribute_events
    ) {
    com_day_cq_replication_impl_replicator_impl_properties_t *com_day_cq_replication_impl_replicator_impl_properties_local_var = malloc(sizeof(com_day_cq_replication_impl_replicator_impl_properties_t));
    if (!com_day_cq_replication_impl_replicator_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_replication_impl_replicator_impl_properties_local_var, 0, sizeof(com_day_cq_replication_impl_replicator_impl_properties_t));
    com_day_cq_replication_impl_replicator_impl_properties_local_var->_library_owned = 1;
    com_day_cq_replication_impl_replicator_impl_properties_local_var->distribute_events = distribute_events;
    return com_day_cq_replication_impl_replicator_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_replication_impl_replicator_impl_properties_t *com_day_cq_replication_impl_replicator_impl_properties_create(
    config_node_property_boolean_t *distribute_events
    ) {
    com_day_cq_replication_impl_replicator_impl_properties_t *result = com_day_cq_replication_impl_replicator_impl_properties_create_internal (
        distribute_events
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_replication_impl_replicator_impl_properties_free(com_day_cq_replication_impl_replicator_impl_properties_t *com_day_cq_replication_impl_replicator_impl_properties) {
    if(NULL == com_day_cq_replication_impl_replicator_impl_properties){
        return ;
    }
    if(com_day_cq_replication_impl_replicator_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_replication_impl_replicator_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_replication_impl_replicator_impl_properties->distribute_events) {
        config_node_property_boolean_free(com_day_cq_replication_impl_replicator_impl_properties->distribute_events);
        com_day_cq_replication_impl_replicator_impl_properties->distribute_events = NULL;
    }
    free(com_day_cq_replication_impl_replicator_impl_properties);
}

cJSON *com_day_cq_replication_impl_replicator_impl_properties_convertToJSON(com_day_cq_replication_impl_replicator_impl_properties_t *com_day_cq_replication_impl_replicator_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_replication_impl_replicator_impl_properties->distribute_events
    if(com_day_cq_replication_impl_replicator_impl_properties->distribute_events) {
    cJSON *distribute_events_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_replication_impl_replicator_impl_properties->distribute_events);
    if(distribute_events_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "distribute_events", distribute_events_local_JSON);
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

com_day_cq_replication_impl_replicator_impl_properties_t *com_day_cq_replication_impl_replicator_impl_properties_parseFromJSON(cJSON *com_day_cq_replication_impl_replicator_impl_propertiesJSON){

    com_day_cq_replication_impl_replicator_impl_properties_t *com_day_cq_replication_impl_replicator_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_replication_impl_replicator_impl_properties->distribute_events
    config_node_property_boolean_t *distribute_events_local_nonprim = NULL;

    // com_day_cq_replication_impl_replicator_impl_properties->distribute_events
    cJSON *distribute_events = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_impl_replicator_impl_propertiesJSON, "distribute_events");
    if (cJSON_IsNull(distribute_events)) {
        distribute_events = NULL;
    }
    if (distribute_events) { 
    distribute_events_local_nonprim = config_node_property_boolean_parseFromJSON(distribute_events); //nonprimitive
    }



    com_day_cq_replication_impl_replicator_impl_properties_local_var = com_day_cq_replication_impl_replicator_impl_properties_create_internal (
        distribute_events ? distribute_events_local_nonprim : NULL
        );

    if (!com_day_cq_replication_impl_replicator_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_replication_impl_replicator_impl_properties_local_var;
end:
    if (distribute_events_local_nonprim) {
        config_node_property_boolean_free(distribute_events_local_nonprim);
        distribute_events_local_nonprim = NULL;
    }
    return NULL;

}
