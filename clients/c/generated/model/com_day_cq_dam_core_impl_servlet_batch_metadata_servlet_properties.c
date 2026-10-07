#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties.h"



static com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_t *com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_create_internal(
    config_node_property_array_t *cq_dam_batch_metadata_asset_default,
    config_node_property_array_t *cq_dam_batch_metadata_collection_default,
    config_node_property_integer_t *cq_dam_batch_metadata_maxresources
    ) {
    com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_t *com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_t));
    if (!com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_t));
    com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_local_var->cq_dam_batch_metadata_asset_default = cq_dam_batch_metadata_asset_default;
    com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_local_var->cq_dam_batch_metadata_collection_default = cq_dam_batch_metadata_collection_default;
    com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_local_var->cq_dam_batch_metadata_maxresources = cq_dam_batch_metadata_maxresources;
    return com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_t *com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_create(
    config_node_property_array_t *cq_dam_batch_metadata_asset_default,
    config_node_property_array_t *cq_dam_batch_metadata_collection_default,
    config_node_property_integer_t *cq_dam_batch_metadata_maxresources
    ) {
    com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_t *result = com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_create_internal (
        cq_dam_batch_metadata_asset_default,
        cq_dam_batch_metadata_collection_default,
        cq_dam_batch_metadata_maxresources
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_free(com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_t *com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties) {
    if(NULL == com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_asset_default) {
        config_node_property_array_free(com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_asset_default);
        com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_asset_default = NULL;
    }
    if (com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_collection_default) {
        config_node_property_array_free(com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_collection_default);
        com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_collection_default = NULL;
    }
    if (com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_maxresources) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_maxresources);
        com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_maxresources = NULL;
    }
    free(com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties);
}

cJSON *com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_convertToJSON(com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_t *com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_asset_default
    if(com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_asset_default) {
    cJSON *cq_dam_batch_metadata_asset_default_local_JSON = config_node_property_array_convertToJSON(com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_asset_default);
    if(cq_dam_batch_metadata_asset_default_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.batch.metadata.asset.default", cq_dam_batch_metadata_asset_default_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_collection_default
    if(com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_collection_default) {
    cJSON *cq_dam_batch_metadata_collection_default_local_JSON = config_node_property_array_convertToJSON(com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_collection_default);
    if(cq_dam_batch_metadata_collection_default_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.batch.metadata.collection.default", cq_dam_batch_metadata_collection_default_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_maxresources
    if(com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_maxresources) {
    cJSON *cq_dam_batch_metadata_maxresources_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_maxresources);
    if(cq_dam_batch_metadata_maxresources_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.batch.metadata.maxresources", cq_dam_batch_metadata_maxresources_local_JSON);
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

com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_t *com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_propertiesJSON){

    com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_t *com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_asset_default
    config_node_property_array_t *cq_dam_batch_metadata_asset_default_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_collection_default
    config_node_property_array_t *cq_dam_batch_metadata_collection_default_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_maxresources
    config_node_property_integer_t *cq_dam_batch_metadata_maxresources_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_asset_default
    cJSON *cq_dam_batch_metadata_asset_default = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_propertiesJSON, "cq.dam.batch.metadata.asset.default");
    if (cJSON_IsNull(cq_dam_batch_metadata_asset_default)) {
        cq_dam_batch_metadata_asset_default = NULL;
    }
    if (cq_dam_batch_metadata_asset_default) { 
    cq_dam_batch_metadata_asset_default_local_nonprim = config_node_property_array_parseFromJSON(cq_dam_batch_metadata_asset_default); //nonprimitive
    }

    // com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_collection_default
    cJSON *cq_dam_batch_metadata_collection_default = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_propertiesJSON, "cq.dam.batch.metadata.collection.default");
    if (cJSON_IsNull(cq_dam_batch_metadata_collection_default)) {
        cq_dam_batch_metadata_collection_default = NULL;
    }
    if (cq_dam_batch_metadata_collection_default) { 
    cq_dam_batch_metadata_collection_default_local_nonprim = config_node_property_array_parseFromJSON(cq_dam_batch_metadata_collection_default); //nonprimitive
    }

    // com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties->cq_dam_batch_metadata_maxresources
    cJSON *cq_dam_batch_metadata_maxresources = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_propertiesJSON, "cq.dam.batch.metadata.maxresources");
    if (cJSON_IsNull(cq_dam_batch_metadata_maxresources)) {
        cq_dam_batch_metadata_maxresources = NULL;
    }
    if (cq_dam_batch_metadata_maxresources) { 
    cq_dam_batch_metadata_maxresources_local_nonprim = config_node_property_integer_parseFromJSON(cq_dam_batch_metadata_maxresources); //nonprimitive
    }



    com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_local_var = com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_create_internal (
        cq_dam_batch_metadata_asset_default ? cq_dam_batch_metadata_asset_default_local_nonprim : NULL,
        cq_dam_batch_metadata_collection_default ? cq_dam_batch_metadata_collection_default_local_nonprim : NULL,
        cq_dam_batch_metadata_maxresources ? cq_dam_batch_metadata_maxresources_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_properties_local_var;
end:
    if (cq_dam_batch_metadata_asset_default_local_nonprim) {
        config_node_property_array_free(cq_dam_batch_metadata_asset_default_local_nonprim);
        cq_dam_batch_metadata_asset_default_local_nonprim = NULL;
    }
    if (cq_dam_batch_metadata_collection_default_local_nonprim) {
        config_node_property_array_free(cq_dam_batch_metadata_collection_default_local_nonprim);
        cq_dam_batch_metadata_collection_default_local_nonprim = NULL;
    }
    if (cq_dam_batch_metadata_maxresources_local_nonprim) {
        config_node_property_integer_free(cq_dam_batch_metadata_maxresources_local_nonprim);
        cq_dam_batch_metadata_maxresources_local_nonprim = NULL;
    }
    return NULL;

}
