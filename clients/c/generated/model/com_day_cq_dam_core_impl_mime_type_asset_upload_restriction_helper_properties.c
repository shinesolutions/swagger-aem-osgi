#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties.h"



static com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_t *com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_create_internal(
    config_node_property_boolean_t *cq_dam_allow_all_mime,
    config_node_property_array_t *cq_dam_allowed_asset_mimes
    ) {
    com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_t *com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_t));
    if (!com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_t));
    com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_local_var->cq_dam_allow_all_mime = cq_dam_allow_all_mime;
    com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_local_var->cq_dam_allowed_asset_mimes = cq_dam_allowed_asset_mimes;
    return com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_t *com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_create(
    config_node_property_boolean_t *cq_dam_allow_all_mime,
    config_node_property_array_t *cq_dam_allowed_asset_mimes
    ) {
    com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_t *result = com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_create_internal (
        cq_dam_allow_all_mime,
        cq_dam_allowed_asset_mimes
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_free(com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_t *com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties) {
    if(NULL == com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties->cq_dam_allow_all_mime) {
        config_node_property_boolean_free(com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties->cq_dam_allow_all_mime);
        com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties->cq_dam_allow_all_mime = NULL;
    }
    if (com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties->cq_dam_allowed_asset_mimes) {
        config_node_property_array_free(com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties->cq_dam_allowed_asset_mimes);
        com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties->cq_dam_allowed_asset_mimes = NULL;
    }
    free(com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties);
}

cJSON *com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_convertToJSON(com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_t *com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties->cq_dam_allow_all_mime
    if(com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties->cq_dam_allow_all_mime) {
    cJSON *cq_dam_allow_all_mime_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties->cq_dam_allow_all_mime);
    if(cq_dam_allow_all_mime_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.allow.all.mime", cq_dam_allow_all_mime_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties->cq_dam_allowed_asset_mimes
    if(com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties->cq_dam_allowed_asset_mimes) {
    cJSON *cq_dam_allowed_asset_mimes_local_JSON = config_node_property_array_convertToJSON(com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties->cq_dam_allowed_asset_mimes);
    if(cq_dam_allowed_asset_mimes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.allowed.asset.mimes", cq_dam_allowed_asset_mimes_local_JSON);
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

com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_t *com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_propertiesJSON){

    com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_t *com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties->cq_dam_allow_all_mime
    config_node_property_boolean_t *cq_dam_allow_all_mime_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties->cq_dam_allowed_asset_mimes
    config_node_property_array_t *cq_dam_allowed_asset_mimes_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties->cq_dam_allow_all_mime
    cJSON *cq_dam_allow_all_mime = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_propertiesJSON, "cq.dam.allow.all.mime");
    if (cJSON_IsNull(cq_dam_allow_all_mime)) {
        cq_dam_allow_all_mime = NULL;
    }
    if (cq_dam_allow_all_mime) { 
    cq_dam_allow_all_mime_local_nonprim = config_node_property_boolean_parseFromJSON(cq_dam_allow_all_mime); //nonprimitive
    }

    // com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties->cq_dam_allowed_asset_mimes
    cJSON *cq_dam_allowed_asset_mimes = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_propertiesJSON, "cq.dam.allowed.asset.mimes");
    if (cJSON_IsNull(cq_dam_allowed_asset_mimes)) {
        cq_dam_allowed_asset_mimes = NULL;
    }
    if (cq_dam_allowed_asset_mimes) { 
    cq_dam_allowed_asset_mimes_local_nonprim = config_node_property_array_parseFromJSON(cq_dam_allowed_asset_mimes); //nonprimitive
    }



    com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_local_var = com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_create_internal (
        cq_dam_allow_all_mime ? cq_dam_allow_all_mime_local_nonprim : NULL,
        cq_dam_allowed_asset_mimes ? cq_dam_allowed_asset_mimes_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_properties_local_var;
end:
    if (cq_dam_allow_all_mime_local_nonprim) {
        config_node_property_boolean_free(cq_dam_allow_all_mime_local_nonprim);
        cq_dam_allow_all_mime_local_nonprim = NULL;
    }
    if (cq_dam_allowed_asset_mimes_local_nonprim) {
        config_node_property_array_free(cq_dam_allowed_asset_mimes_local_nonprim);
        cq_dam_allowed_asset_mimes_local_nonprim = NULL;
    }
    return NULL;

}
