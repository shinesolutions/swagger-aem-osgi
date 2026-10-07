#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties.h"



static com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_t *com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_create_internal(
    config_node_property_boolean_t *mime_allow_empty,
    config_node_property_array_t *mime_allowed
    ) {
    com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_t *com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_local_var = malloc(sizeof(com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_t));
    if (!com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_local_var, 0, sizeof(com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_t));
    com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_local_var->_library_owned = 1;
    com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_local_var->mime_allow_empty = mime_allow_empty;
    com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_local_var->mime_allowed = mime_allowed;
    return com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_t *com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_create(
    config_node_property_boolean_t *mime_allow_empty,
    config_node_property_array_t *mime_allowed
    ) {
    com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_t *result = com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_create_internal (
        mime_allow_empty,
        mime_allowed
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_free(com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_t *com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties) {
    if(NULL == com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties){
        return ;
    }
    if(com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties->mime_allow_empty) {
        config_node_property_boolean_free(com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties->mime_allow_empty);
        com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties->mime_allow_empty = NULL;
    }
    if (com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties->mime_allowed) {
        config_node_property_array_free(com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties->mime_allowed);
        com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties->mime_allowed = NULL;
    }
    free(com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties);
}

cJSON *com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_convertToJSON(com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_t *com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties->mime_allow_empty
    if(com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties->mime_allow_empty) {
    cJSON *mime_allow_empty_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties->mime_allow_empty);
    if(mime_allow_empty_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "mime.allowEmpty", mime_allow_empty_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties->mime_allowed
    if(com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties->mime_allowed) {
    cJSON *mime_allowed_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties->mime_allowed);
    if(mime_allowed_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "mime.allowed", mime_allowed_local_JSON);
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

com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_t *com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_parseFromJSON(cJSON *com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_propertiesJSON){

    com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_t *com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties->mime_allow_empty
    config_node_property_boolean_t *mime_allow_empty_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties->mime_allowed
    config_node_property_array_t *mime_allowed_local_nonprim = NULL;

    // com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties->mime_allow_empty
    cJSON *mime_allow_empty = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_propertiesJSON, "mime.allowEmpty");
    if (cJSON_IsNull(mime_allow_empty)) {
        mime_allow_empty = NULL;
    }
    if (mime_allow_empty) { 
    mime_allow_empty_local_nonprim = config_node_property_boolean_parseFromJSON(mime_allow_empty); //nonprimitive
    }

    // com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties->mime_allowed
    cJSON *mime_allowed = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_propertiesJSON, "mime.allowed");
    if (cJSON_IsNull(mime_allowed)) {
        mime_allowed = NULL;
    }
    if (mime_allowed) { 
    mime_allowed_local_nonprim = config_node_property_array_parseFromJSON(mime_allowed); //nonprimitive
    }



    com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_local_var = com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_create_internal (
        mime_allow_empty ? mime_allow_empty_local_nonprim : NULL,
        mime_allowed ? mime_allowed_local_nonprim : NULL
        );

    if (!com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_properties_local_var;
end:
    if (mime_allow_empty_local_nonprim) {
        config_node_property_boolean_free(mime_allow_empty_local_nonprim);
        mime_allow_empty_local_nonprim = NULL;
    }
    if (mime_allowed_local_nonprim) {
        config_node_property_array_free(mime_allowed_local_nonprim);
        mime_allowed_local_nonprim = NULL;
    }
    return NULL;

}
