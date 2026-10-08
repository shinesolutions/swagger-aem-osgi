#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_replication_impl_reverse_replicator_properties.h"



static com_day_cq_replication_impl_reverse_replicator_properties_t *com_day_cq_replication_impl_reverse_replicator_properties_create_internal(
    config_node_property_integer_t *scheduler_period
    ) {
    com_day_cq_replication_impl_reverse_replicator_properties_t *com_day_cq_replication_impl_reverse_replicator_properties_local_var = malloc(sizeof(com_day_cq_replication_impl_reverse_replicator_properties_t));
    if (!com_day_cq_replication_impl_reverse_replicator_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_replication_impl_reverse_replicator_properties_local_var, 0, sizeof(com_day_cq_replication_impl_reverse_replicator_properties_t));
    com_day_cq_replication_impl_reverse_replicator_properties_local_var->_library_owned = 1;
    com_day_cq_replication_impl_reverse_replicator_properties_local_var->scheduler_period = scheduler_period;
    return com_day_cq_replication_impl_reverse_replicator_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_replication_impl_reverse_replicator_properties_t *com_day_cq_replication_impl_reverse_replicator_properties_create(
    config_node_property_integer_t *scheduler_period
    ) {
    com_day_cq_replication_impl_reverse_replicator_properties_t *result = com_day_cq_replication_impl_reverse_replicator_properties_create_internal (
        scheduler_period
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_replication_impl_reverse_replicator_properties_free(com_day_cq_replication_impl_reverse_replicator_properties_t *com_day_cq_replication_impl_reverse_replicator_properties) {
    if(NULL == com_day_cq_replication_impl_reverse_replicator_properties){
        return ;
    }
    if(com_day_cq_replication_impl_reverse_replicator_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_replication_impl_reverse_replicator_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_replication_impl_reverse_replicator_properties->scheduler_period) {
        config_node_property_integer_free(com_day_cq_replication_impl_reverse_replicator_properties->scheduler_period);
        com_day_cq_replication_impl_reverse_replicator_properties->scheduler_period = NULL;
    }
    free(com_day_cq_replication_impl_reverse_replicator_properties);
}

cJSON *com_day_cq_replication_impl_reverse_replicator_properties_convertToJSON(com_day_cq_replication_impl_reverse_replicator_properties_t *com_day_cq_replication_impl_reverse_replicator_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_replication_impl_reverse_replicator_properties->scheduler_period
    if(com_day_cq_replication_impl_reverse_replicator_properties->scheduler_period) {
    cJSON *scheduler_period_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_replication_impl_reverse_replicator_properties->scheduler_period);
    if(scheduler_period_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduler.period", scheduler_period_local_JSON);
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

com_day_cq_replication_impl_reverse_replicator_properties_t *com_day_cq_replication_impl_reverse_replicator_properties_parseFromJSON(cJSON *com_day_cq_replication_impl_reverse_replicator_propertiesJSON){

    com_day_cq_replication_impl_reverse_replicator_properties_t *com_day_cq_replication_impl_reverse_replicator_properties_local_var = NULL;

    // define the local variable for com_day_cq_replication_impl_reverse_replicator_properties->scheduler_period
    config_node_property_integer_t *scheduler_period_local_nonprim = NULL;

    // com_day_cq_replication_impl_reverse_replicator_properties->scheduler_period
    cJSON *scheduler_period = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_impl_reverse_replicator_propertiesJSON, "scheduler.period");
    if (cJSON_IsNull(scheduler_period)) {
        scheduler_period = NULL;
    }
    if (scheduler_period) { 
    scheduler_period_local_nonprim = config_node_property_integer_parseFromJSON(scheduler_period); //nonprimitive
    }



    com_day_cq_replication_impl_reverse_replicator_properties_local_var = com_day_cq_replication_impl_reverse_replicator_properties_create_internal (
        scheduler_period ? scheduler_period_local_nonprim : NULL
        );

    if (!com_day_cq_replication_impl_reverse_replicator_properties_local_var) {
        goto end;
    }

    return com_day_cq_replication_impl_reverse_replicator_properties_local_var;
end:
    if (scheduler_period_local_nonprim) {
        config_node_property_integer_free(scheduler_period_local_nonprim);
        scheduler_period_local_nonprim = NULL;
    }
    return NULL;

}
