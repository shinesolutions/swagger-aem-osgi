#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties.h"



static com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_t *com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_create_internal(
    config_node_property_boolean_t *nui_enabled,
    config_node_property_string_t *nui_service_url,
    config_node_property_string_t *nui_api_key
    ) {
    com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_t *com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_local_var = malloc(sizeof(com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_t));
    if (!com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_local_var, 0, sizeof(com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_t));
    com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_local_var->_library_owned = 1;
    com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_local_var->nui_enabled = nui_enabled;
    com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_local_var->nui_service_url = nui_service_url;
    com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_local_var->nui_api_key = nui_api_key;
    return com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_t *com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_create(
    config_node_property_boolean_t *nui_enabled,
    config_node_property_string_t *nui_service_url,
    config_node_property_string_t *nui_api_key
    ) {
    com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_t *result = com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_create_internal (
        nui_enabled,
        nui_service_url,
        nui_api_key
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_free(com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_t *com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties) {
    if(NULL == com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties){
        return ;
    }
    if(com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_enabled) {
        config_node_property_boolean_free(com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_enabled);
        com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_enabled = NULL;
    }
    if (com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_service_url) {
        config_node_property_string_free(com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_service_url);
        com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_service_url = NULL;
    }
    if (com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_api_key) {
        config_node_property_string_free(com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_api_key);
        com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_api_key = NULL;
    }
    free(com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties);
}

cJSON *com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_convertToJSON(com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_t *com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_enabled
    if(com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_enabled) {
    cJSON *nui_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_enabled);
    if(nui_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "nuiEnabled", nui_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_service_url
    if(com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_service_url) {
    cJSON *nui_service_url_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_service_url);
    if(nui_service_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "nuiServiceUrl", nui_service_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_api_key
    if(com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_api_key) {
    cJSON *nui_api_key_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_api_key);
    if(nui_api_key_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "nuiApiKey", nui_api_key_local_JSON);
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

com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_t *com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_parseFromJSON(cJSON *com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_propertiesJSON){

    com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_t *com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_enabled
    config_node_property_boolean_t *nui_enabled_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_service_url
    config_node_property_string_t *nui_service_url_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_api_key
    config_node_property_string_t *nui_api_key_local_nonprim = NULL;

    // com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_enabled
    cJSON *nui_enabled = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_propertiesJSON, "nuiEnabled");
    if (cJSON_IsNull(nui_enabled)) {
        nui_enabled = NULL;
    }
    if (nui_enabled) { 
    nui_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(nui_enabled); //nonprimitive
    }

    // com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_service_url
    cJSON *nui_service_url = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_propertiesJSON, "nuiServiceUrl");
    if (cJSON_IsNull(nui_service_url)) {
        nui_service_url = NULL;
    }
    if (nui_service_url) { 
    nui_service_url_local_nonprim = config_node_property_string_parseFromJSON(nui_service_url); //nonprimitive
    }

    // com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties->nui_api_key
    cJSON *nui_api_key = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_propertiesJSON, "nuiApiKey");
    if (cJSON_IsNull(nui_api_key)) {
        nui_api_key = NULL;
    }
    if (nui_api_key) { 
    nui_api_key_local_nonprim = config_node_property_string_parseFromJSON(nui_api_key); //nonprimitive
    }



    com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_local_var = com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_create_internal (
        nui_enabled ? nui_enabled_local_nonprim : NULL,
        nui_service_url ? nui_service_url_local_nonprim : NULL,
        nui_api_key ? nui_api_key_local_nonprim : NULL
        );

    if (!com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties_local_var;
end:
    if (nui_enabled_local_nonprim) {
        config_node_property_boolean_free(nui_enabled_local_nonprim);
        nui_enabled_local_nonprim = NULL;
    }
    if (nui_service_url_local_nonprim) {
        config_node_property_string_free(nui_service_url_local_nonprim);
        nui_service_url_local_nonprim = NULL;
    }
    if (nui_api_key_local_nonprim) {
        config_node_property_string_free(nui_api_key_local_nonprim);
        nui_api_key_local_nonprim = NULL;
    }
    return NULL;

}
