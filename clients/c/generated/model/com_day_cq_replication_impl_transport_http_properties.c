#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_replication_impl_transport_http_properties.h"



static com_day_cq_replication_impl_transport_http_properties_t *com_day_cq_replication_impl_transport_http_properties_create_internal(
    config_node_property_array_t *disabled_cipher_suites,
    config_node_property_array_t *enabled_cipher_suites
    ) {
    com_day_cq_replication_impl_transport_http_properties_t *com_day_cq_replication_impl_transport_http_properties_local_var = malloc(sizeof(com_day_cq_replication_impl_transport_http_properties_t));
    if (!com_day_cq_replication_impl_transport_http_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_replication_impl_transport_http_properties_local_var, 0, sizeof(com_day_cq_replication_impl_transport_http_properties_t));
    com_day_cq_replication_impl_transport_http_properties_local_var->_library_owned = 1;
    com_day_cq_replication_impl_transport_http_properties_local_var->disabled_cipher_suites = disabled_cipher_suites;
    com_day_cq_replication_impl_transport_http_properties_local_var->enabled_cipher_suites = enabled_cipher_suites;
    return com_day_cq_replication_impl_transport_http_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_replication_impl_transport_http_properties_t *com_day_cq_replication_impl_transport_http_properties_create(
    config_node_property_array_t *disabled_cipher_suites,
    config_node_property_array_t *enabled_cipher_suites
    ) {
    com_day_cq_replication_impl_transport_http_properties_t *result = com_day_cq_replication_impl_transport_http_properties_create_internal (
        disabled_cipher_suites,
        enabled_cipher_suites
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_replication_impl_transport_http_properties_free(com_day_cq_replication_impl_transport_http_properties_t *com_day_cq_replication_impl_transport_http_properties) {
    if(NULL == com_day_cq_replication_impl_transport_http_properties){
        return ;
    }
    if(com_day_cq_replication_impl_transport_http_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_replication_impl_transport_http_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_replication_impl_transport_http_properties->disabled_cipher_suites) {
        config_node_property_array_free(com_day_cq_replication_impl_transport_http_properties->disabled_cipher_suites);
        com_day_cq_replication_impl_transport_http_properties->disabled_cipher_suites = NULL;
    }
    if (com_day_cq_replication_impl_transport_http_properties->enabled_cipher_suites) {
        config_node_property_array_free(com_day_cq_replication_impl_transport_http_properties->enabled_cipher_suites);
        com_day_cq_replication_impl_transport_http_properties->enabled_cipher_suites = NULL;
    }
    free(com_day_cq_replication_impl_transport_http_properties);
}

cJSON *com_day_cq_replication_impl_transport_http_properties_convertToJSON(com_day_cq_replication_impl_transport_http_properties_t *com_day_cq_replication_impl_transport_http_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_replication_impl_transport_http_properties->disabled_cipher_suites
    if(com_day_cq_replication_impl_transport_http_properties->disabled_cipher_suites) {
    cJSON *disabled_cipher_suites_local_JSON = config_node_property_array_convertToJSON(com_day_cq_replication_impl_transport_http_properties->disabled_cipher_suites);
    if(disabled_cipher_suites_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "disabled.cipher.suites", disabled_cipher_suites_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_replication_impl_transport_http_properties->enabled_cipher_suites
    if(com_day_cq_replication_impl_transport_http_properties->enabled_cipher_suites) {
    cJSON *enabled_cipher_suites_local_JSON = config_node_property_array_convertToJSON(com_day_cq_replication_impl_transport_http_properties->enabled_cipher_suites);
    if(enabled_cipher_suites_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enabled.cipher.suites", enabled_cipher_suites_local_JSON);
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

com_day_cq_replication_impl_transport_http_properties_t *com_day_cq_replication_impl_transport_http_properties_parseFromJSON(cJSON *com_day_cq_replication_impl_transport_http_propertiesJSON){

    com_day_cq_replication_impl_transport_http_properties_t *com_day_cq_replication_impl_transport_http_properties_local_var = NULL;

    // define the local variable for com_day_cq_replication_impl_transport_http_properties->disabled_cipher_suites
    config_node_property_array_t *disabled_cipher_suites_local_nonprim = NULL;

    // define the local variable for com_day_cq_replication_impl_transport_http_properties->enabled_cipher_suites
    config_node_property_array_t *enabled_cipher_suites_local_nonprim = NULL;

    // com_day_cq_replication_impl_transport_http_properties->disabled_cipher_suites
    cJSON *disabled_cipher_suites = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_impl_transport_http_propertiesJSON, "disabled.cipher.suites");
    if (cJSON_IsNull(disabled_cipher_suites)) {
        disabled_cipher_suites = NULL;
    }
    if (disabled_cipher_suites) { 
    disabled_cipher_suites_local_nonprim = config_node_property_array_parseFromJSON(disabled_cipher_suites); //nonprimitive
    }

    // com_day_cq_replication_impl_transport_http_properties->enabled_cipher_suites
    cJSON *enabled_cipher_suites = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_impl_transport_http_propertiesJSON, "enabled.cipher.suites");
    if (cJSON_IsNull(enabled_cipher_suites)) {
        enabled_cipher_suites = NULL;
    }
    if (enabled_cipher_suites) { 
    enabled_cipher_suites_local_nonprim = config_node_property_array_parseFromJSON(enabled_cipher_suites); //nonprimitive
    }



    com_day_cq_replication_impl_transport_http_properties_local_var = com_day_cq_replication_impl_transport_http_properties_create_internal (
        disabled_cipher_suites ? disabled_cipher_suites_local_nonprim : NULL,
        enabled_cipher_suites ? enabled_cipher_suites_local_nonprim : NULL
        );

    if (!com_day_cq_replication_impl_transport_http_properties_local_var) {
        goto end;
    }

    return com_day_cq_replication_impl_transport_http_properties_local_var;
end:
    if (disabled_cipher_suites_local_nonprim) {
        config_node_property_array_free(disabled_cipher_suites_local_nonprim);
        disabled_cipher_suites_local_nonprim = NULL;
    }
    if (enabled_cipher_suites_local_nonprim) {
        config_node_property_array_free(enabled_cipher_suites_local_nonprim);
        enabled_cipher_suites_local_nonprim = NULL;
    }
    return NULL;

}
