#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties.h"



static com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_t *com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_create_internal(
    config_node_property_boolean_t *forward_requests
    ) {
    com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_t *com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_local_var = malloc(sizeof(com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_t));
    if (!com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_local_var, 0, sizeof(com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_t));
    com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_local_var->_library_owned = 1;
    com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_local_var->forward_requests = forward_requests;
    return com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_t *com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_create(
    config_node_property_boolean_t *forward_requests
    ) {
    com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_t *result = com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_create_internal (
        forward_requests
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_free(com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_t *com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties) {
    if(NULL == com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties){
        return ;
    }
    if(com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties->forward_requests) {
        config_node_property_boolean_free(com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties->forward_requests);
        com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties->forward_requests = NULL;
    }
    free(com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties);
}

cJSON *com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_convertToJSON(com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_t *com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties->forward_requests
    if(com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties->forward_requests) {
    cJSON *forward_requests_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties->forward_requests);
    if(forward_requests_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "forward.requests", forward_requests_local_JSON);
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

com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_t *com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_parseFromJSON(cJSON *com_adobe_granite_distribution_core_impl_replication_distribution_trans_propertiesJSON){

    com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_t *com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties->forward_requests
    config_node_property_boolean_t *forward_requests_local_nonprim = NULL;

    // com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties->forward_requests
    cJSON *forward_requests = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_distribution_core_impl_replication_distribution_trans_propertiesJSON, "forward.requests");
    if (cJSON_IsNull(forward_requests)) {
        forward_requests = NULL;
    }
    if (forward_requests) { 
    forward_requests_local_nonprim = config_node_property_boolean_parseFromJSON(forward_requests); //nonprimitive
    }



    com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_local_var = com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_create_internal (
        forward_requests ? forward_requests_local_nonprim : NULL
        );

    if (!com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_distribution_core_impl_replication_distribution_trans_properties_local_var;
end:
    if (forward_requests_local_nonprim) {
        config_node_property_boolean_free(forward_requests_local_nonprim);
        forward_requests_local_nonprim = NULL;
    }
    return NULL;

}
