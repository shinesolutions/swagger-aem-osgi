#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties.h"



static com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_create_internal(
    config_node_property_array_t *cq_dam_scene7_assetmimetypeservice_mapping
    ) {
    com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_local_var = malloc(sizeof(com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_t));
    if (!com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_local_var, 0, sizeof(com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_t));
    com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_local_var->_library_owned = 1;
    com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_local_var->cq_dam_scene7_assetmimetypeservice_mapping = cq_dam_scene7_assetmimetypeservice_mapping;
    return com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_create(
    config_node_property_array_t *cq_dam_scene7_assetmimetypeservice_mapping
    ) {
    com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_t *result = com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_create_internal (
        cq_dam_scene7_assetmimetypeservice_mapping
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_free(com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties) {
    if(NULL == com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties){
        return ;
    }
    if(com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties->cq_dam_scene7_assetmimetypeservice_mapping) {
        config_node_property_array_free(com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties->cq_dam_scene7_assetmimetypeservice_mapping);
        com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties->cq_dam_scene7_assetmimetypeservice_mapping = NULL;
    }
    free(com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties);
}

cJSON *com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_convertToJSON(com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties->cq_dam_scene7_assetmimetypeservice_mapping
    if(com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties->cq_dam_scene7_assetmimetypeservice_mapping) {
    cJSON *cq_dam_scene7_assetmimetypeservice_mapping_local_JSON = config_node_property_array_convertToJSON(com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties->cq_dam_scene7_assetmimetypeservice_mapping);
    if(cq_dam_scene7_assetmimetypeservice_mapping_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.scene7.assetmimetypeservice.mapping", cq_dam_scene7_assetmimetypeservice_mapping_local_JSON);
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

com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_parseFromJSON(cJSON *com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_propertiesJSON){

    com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_t *com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties->cq_dam_scene7_assetmimetypeservice_mapping
    config_node_property_array_t *cq_dam_scene7_assetmimetypeservice_mapping_local_nonprim = NULL;

    // com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties->cq_dam_scene7_assetmimetypeservice_mapping
    cJSON *cq_dam_scene7_assetmimetypeservice_mapping = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_propertiesJSON, "cq.dam.scene7.assetmimetypeservice.mapping");
    if (cJSON_IsNull(cq_dam_scene7_assetmimetypeservice_mapping)) {
        cq_dam_scene7_assetmimetypeservice_mapping = NULL;
    }
    if (cq_dam_scene7_assetmimetypeservice_mapping) { 
    cq_dam_scene7_assetmimetypeservice_mapping_local_nonprim = config_node_property_array_parseFromJSON(cq_dam_scene7_assetmimetypeservice_mapping); //nonprimitive
    }



    com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_local_var = com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_create_internal (
        cq_dam_scene7_assetmimetypeservice_mapping ? cq_dam_scene7_assetmimetypeservice_mapping_local_nonprim : NULL
        );

    if (!com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_properties_local_var;
end:
    if (cq_dam_scene7_assetmimetypeservice_mapping_local_nonprim) {
        config_node_property_array_free(cq_dam_scene7_assetmimetypeservice_mapping_local_nonprim);
        cq_dam_scene7_assetmimetypeservice_mapping_local_nonprim = NULL;
    }
    return NULL;

}
