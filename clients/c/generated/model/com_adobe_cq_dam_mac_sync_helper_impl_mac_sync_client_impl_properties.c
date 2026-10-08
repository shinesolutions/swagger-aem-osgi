#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties.h"



static com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_t *com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_create_internal(
    config_node_property_integer_t *com_adobe_dam_mac_sync_client_so_timeout
    ) {
    com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_t *com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_local_var = malloc(sizeof(com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_t));
    if (!com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_local_var, 0, sizeof(com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_t));
    com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_local_var->com_adobe_dam_mac_sync_client_so_timeout = com_adobe_dam_mac_sync_client_so_timeout;
    return com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_t *com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_create(
    config_node_property_integer_t *com_adobe_dam_mac_sync_client_so_timeout
    ) {
    com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_t *result = com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_create_internal (
        com_adobe_dam_mac_sync_client_so_timeout
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_free(com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_t *com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties) {
    if(NULL == com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties){
        return ;
    }
    if(com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties->com_adobe_dam_mac_sync_client_so_timeout) {
        config_node_property_integer_free(com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties->com_adobe_dam_mac_sync_client_so_timeout);
        com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties->com_adobe_dam_mac_sync_client_so_timeout = NULL;
    }
    free(com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties);
}

cJSON *com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_convertToJSON(com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_t *com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties->com_adobe_dam_mac_sync_client_so_timeout
    if(com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties->com_adobe_dam_mac_sync_client_so_timeout) {
    cJSON *com_adobe_dam_mac_sync_client_so_timeout_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties->com_adobe_dam_mac_sync_client_so_timeout);
    if(com_adobe_dam_mac_sync_client_so_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.dam.mac.sync.client.so.timeout", com_adobe_dam_mac_sync_client_so_timeout_local_JSON);
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

com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_t *com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_parseFromJSON(cJSON *com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_propertiesJSON){

    com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_t *com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties->com_adobe_dam_mac_sync_client_so_timeout
    config_node_property_integer_t *com_adobe_dam_mac_sync_client_so_timeout_local_nonprim = NULL;

    // com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties->com_adobe_dam_mac_sync_client_so_timeout
    cJSON *com_adobe_dam_mac_sync_client_so_timeout = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_propertiesJSON, "com.adobe.dam.mac.sync.client.so.timeout");
    if (cJSON_IsNull(com_adobe_dam_mac_sync_client_so_timeout)) {
        com_adobe_dam_mac_sync_client_so_timeout = NULL;
    }
    if (com_adobe_dam_mac_sync_client_so_timeout) { 
    com_adobe_dam_mac_sync_client_so_timeout_local_nonprim = config_node_property_integer_parseFromJSON(com_adobe_dam_mac_sync_client_so_timeout); //nonprimitive
    }



    com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_local_var = com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_create_internal (
        com_adobe_dam_mac_sync_client_so_timeout ? com_adobe_dam_mac_sync_client_so_timeout_local_nonprim : NULL
        );

    if (!com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties_local_var;
end:
    if (com_adobe_dam_mac_sync_client_so_timeout_local_nonprim) {
        config_node_property_integer_free(com_adobe_dam_mac_sync_client_so_timeout_local_nonprim);
        com_adobe_dam_mac_sync_client_so_timeout_local_nonprim = NULL;
    }
    return NULL;

}
