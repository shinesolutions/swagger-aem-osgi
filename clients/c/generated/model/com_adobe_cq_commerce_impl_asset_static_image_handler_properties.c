#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_commerce_impl_asset_static_image_handler_properties.h"



static com_adobe_cq_commerce_impl_asset_static_image_handler_properties_t *com_adobe_cq_commerce_impl_asset_static_image_handler_properties_create_internal(
    config_node_property_boolean_t *cq_commerce_asset_handler_active,
    config_node_property_string_t *cq_commerce_asset_handler_name
    ) {
    com_adobe_cq_commerce_impl_asset_static_image_handler_properties_t *com_adobe_cq_commerce_impl_asset_static_image_handler_properties_local_var = malloc(sizeof(com_adobe_cq_commerce_impl_asset_static_image_handler_properties_t));
    if (!com_adobe_cq_commerce_impl_asset_static_image_handler_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_commerce_impl_asset_static_image_handler_properties_local_var, 0, sizeof(com_adobe_cq_commerce_impl_asset_static_image_handler_properties_t));
    com_adobe_cq_commerce_impl_asset_static_image_handler_properties_local_var->_library_owned = 1;
    com_adobe_cq_commerce_impl_asset_static_image_handler_properties_local_var->cq_commerce_asset_handler_active = cq_commerce_asset_handler_active;
    com_adobe_cq_commerce_impl_asset_static_image_handler_properties_local_var->cq_commerce_asset_handler_name = cq_commerce_asset_handler_name;
    return com_adobe_cq_commerce_impl_asset_static_image_handler_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_commerce_impl_asset_static_image_handler_properties_t *com_adobe_cq_commerce_impl_asset_static_image_handler_properties_create(
    config_node_property_boolean_t *cq_commerce_asset_handler_active,
    config_node_property_string_t *cq_commerce_asset_handler_name
    ) {
    com_adobe_cq_commerce_impl_asset_static_image_handler_properties_t *result = com_adobe_cq_commerce_impl_asset_static_image_handler_properties_create_internal (
        cq_commerce_asset_handler_active,
        cq_commerce_asset_handler_name
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_commerce_impl_asset_static_image_handler_properties_free(com_adobe_cq_commerce_impl_asset_static_image_handler_properties_t *com_adobe_cq_commerce_impl_asset_static_image_handler_properties) {
    if(NULL == com_adobe_cq_commerce_impl_asset_static_image_handler_properties){
        return ;
    }
    if(com_adobe_cq_commerce_impl_asset_static_image_handler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_commerce_impl_asset_static_image_handler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_commerce_impl_asset_static_image_handler_properties->cq_commerce_asset_handler_active) {
        config_node_property_boolean_free(com_adobe_cq_commerce_impl_asset_static_image_handler_properties->cq_commerce_asset_handler_active);
        com_adobe_cq_commerce_impl_asset_static_image_handler_properties->cq_commerce_asset_handler_active = NULL;
    }
    if (com_adobe_cq_commerce_impl_asset_static_image_handler_properties->cq_commerce_asset_handler_name) {
        config_node_property_string_free(com_adobe_cq_commerce_impl_asset_static_image_handler_properties->cq_commerce_asset_handler_name);
        com_adobe_cq_commerce_impl_asset_static_image_handler_properties->cq_commerce_asset_handler_name = NULL;
    }
    free(com_adobe_cq_commerce_impl_asset_static_image_handler_properties);
}

cJSON *com_adobe_cq_commerce_impl_asset_static_image_handler_properties_convertToJSON(com_adobe_cq_commerce_impl_asset_static_image_handler_properties_t *com_adobe_cq_commerce_impl_asset_static_image_handler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_commerce_impl_asset_static_image_handler_properties->cq_commerce_asset_handler_active
    if(com_adobe_cq_commerce_impl_asset_static_image_handler_properties->cq_commerce_asset_handler_active) {
    cJSON *cq_commerce_asset_handler_active_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_commerce_impl_asset_static_image_handler_properties->cq_commerce_asset_handler_active);
    if(cq_commerce_asset_handler_active_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.commerce.asset.handler.active", cq_commerce_asset_handler_active_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_commerce_impl_asset_static_image_handler_properties->cq_commerce_asset_handler_name
    if(com_adobe_cq_commerce_impl_asset_static_image_handler_properties->cq_commerce_asset_handler_name) {
    cJSON *cq_commerce_asset_handler_name_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_commerce_impl_asset_static_image_handler_properties->cq_commerce_asset_handler_name);
    if(cq_commerce_asset_handler_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.commerce.asset.handler.name", cq_commerce_asset_handler_name_local_JSON);
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

com_adobe_cq_commerce_impl_asset_static_image_handler_properties_t *com_adobe_cq_commerce_impl_asset_static_image_handler_properties_parseFromJSON(cJSON *com_adobe_cq_commerce_impl_asset_static_image_handler_propertiesJSON){

    com_adobe_cq_commerce_impl_asset_static_image_handler_properties_t *com_adobe_cq_commerce_impl_asset_static_image_handler_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_commerce_impl_asset_static_image_handler_properties->cq_commerce_asset_handler_active
    config_node_property_boolean_t *cq_commerce_asset_handler_active_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_commerce_impl_asset_static_image_handler_properties->cq_commerce_asset_handler_name
    config_node_property_string_t *cq_commerce_asset_handler_name_local_nonprim = NULL;

    // com_adobe_cq_commerce_impl_asset_static_image_handler_properties->cq_commerce_asset_handler_active
    cJSON *cq_commerce_asset_handler_active = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_commerce_impl_asset_static_image_handler_propertiesJSON, "cq.commerce.asset.handler.active");
    if (cJSON_IsNull(cq_commerce_asset_handler_active)) {
        cq_commerce_asset_handler_active = NULL;
    }
    if (cq_commerce_asset_handler_active) { 
    cq_commerce_asset_handler_active_local_nonprim = config_node_property_boolean_parseFromJSON(cq_commerce_asset_handler_active); //nonprimitive
    }

    // com_adobe_cq_commerce_impl_asset_static_image_handler_properties->cq_commerce_asset_handler_name
    cJSON *cq_commerce_asset_handler_name = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_commerce_impl_asset_static_image_handler_propertiesJSON, "cq.commerce.asset.handler.name");
    if (cJSON_IsNull(cq_commerce_asset_handler_name)) {
        cq_commerce_asset_handler_name = NULL;
    }
    if (cq_commerce_asset_handler_name) { 
    cq_commerce_asset_handler_name_local_nonprim = config_node_property_string_parseFromJSON(cq_commerce_asset_handler_name); //nonprimitive
    }



    com_adobe_cq_commerce_impl_asset_static_image_handler_properties_local_var = com_adobe_cq_commerce_impl_asset_static_image_handler_properties_create_internal (
        cq_commerce_asset_handler_active ? cq_commerce_asset_handler_active_local_nonprim : NULL,
        cq_commerce_asset_handler_name ? cq_commerce_asset_handler_name_local_nonprim : NULL
        );

    if (!com_adobe_cq_commerce_impl_asset_static_image_handler_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_commerce_impl_asset_static_image_handler_properties_local_var;
end:
    if (cq_commerce_asset_handler_active_local_nonprim) {
        config_node_property_boolean_free(cq_commerce_asset_handler_active_local_nonprim);
        cq_commerce_asset_handler_active_local_nonprim = NULL;
    }
    if (cq_commerce_asset_handler_name_local_nonprim) {
        config_node_property_string_free(cq_commerce_asset_handler_name_local_nonprim);
        cq_commerce_asset_handler_name_local_nonprim = NULL;
    }
    return NULL;

}
