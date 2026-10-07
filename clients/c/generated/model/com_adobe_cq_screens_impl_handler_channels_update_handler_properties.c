#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_screens_impl_handler_channels_update_handler_properties.h"



static com_adobe_cq_screens_impl_handler_channels_update_handler_properties_t *com_adobe_cq_screens_impl_handler_channels_update_handler_properties_create_internal(
    config_node_property_array_t *cq_pagesupdatehandler_imageresourcetypes,
    config_node_property_array_t *cq_pagesupdatehandler_productresourcetypes,
    config_node_property_array_t *cq_pagesupdatehandler_videoresourcetypes,
    config_node_property_array_t *cq_pagesupdatehandler_dynamicsequenceresourcetypes,
    config_node_property_array_t *cq_pagesupdatehandler_previewmodepaths
    ) {
    com_adobe_cq_screens_impl_handler_channels_update_handler_properties_t *com_adobe_cq_screens_impl_handler_channels_update_handler_properties_local_var = malloc(sizeof(com_adobe_cq_screens_impl_handler_channels_update_handler_properties_t));
    if (!com_adobe_cq_screens_impl_handler_channels_update_handler_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_screens_impl_handler_channels_update_handler_properties_local_var, 0, sizeof(com_adobe_cq_screens_impl_handler_channels_update_handler_properties_t));
    com_adobe_cq_screens_impl_handler_channels_update_handler_properties_local_var->_library_owned = 1;
    com_adobe_cq_screens_impl_handler_channels_update_handler_properties_local_var->cq_pagesupdatehandler_imageresourcetypes = cq_pagesupdatehandler_imageresourcetypes;
    com_adobe_cq_screens_impl_handler_channels_update_handler_properties_local_var->cq_pagesupdatehandler_productresourcetypes = cq_pagesupdatehandler_productresourcetypes;
    com_adobe_cq_screens_impl_handler_channels_update_handler_properties_local_var->cq_pagesupdatehandler_videoresourcetypes = cq_pagesupdatehandler_videoresourcetypes;
    com_adobe_cq_screens_impl_handler_channels_update_handler_properties_local_var->cq_pagesupdatehandler_dynamicsequenceresourcetypes = cq_pagesupdatehandler_dynamicsequenceresourcetypes;
    com_adobe_cq_screens_impl_handler_channels_update_handler_properties_local_var->cq_pagesupdatehandler_previewmodepaths = cq_pagesupdatehandler_previewmodepaths;
    return com_adobe_cq_screens_impl_handler_channels_update_handler_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_screens_impl_handler_channels_update_handler_properties_t *com_adobe_cq_screens_impl_handler_channels_update_handler_properties_create(
    config_node_property_array_t *cq_pagesupdatehandler_imageresourcetypes,
    config_node_property_array_t *cq_pagesupdatehandler_productresourcetypes,
    config_node_property_array_t *cq_pagesupdatehandler_videoresourcetypes,
    config_node_property_array_t *cq_pagesupdatehandler_dynamicsequenceresourcetypes,
    config_node_property_array_t *cq_pagesupdatehandler_previewmodepaths
    ) {
    com_adobe_cq_screens_impl_handler_channels_update_handler_properties_t *result = com_adobe_cq_screens_impl_handler_channels_update_handler_properties_create_internal (
        cq_pagesupdatehandler_imageresourcetypes,
        cq_pagesupdatehandler_productresourcetypes,
        cq_pagesupdatehandler_videoresourcetypes,
        cq_pagesupdatehandler_dynamicsequenceresourcetypes,
        cq_pagesupdatehandler_previewmodepaths
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_screens_impl_handler_channels_update_handler_properties_free(com_adobe_cq_screens_impl_handler_channels_update_handler_properties_t *com_adobe_cq_screens_impl_handler_channels_update_handler_properties) {
    if(NULL == com_adobe_cq_screens_impl_handler_channels_update_handler_properties){
        return ;
    }
    if(com_adobe_cq_screens_impl_handler_channels_update_handler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_screens_impl_handler_channels_update_handler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_imageresourcetypes) {
        config_node_property_array_free(com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_imageresourcetypes);
        com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_imageresourcetypes = NULL;
    }
    if (com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_productresourcetypes) {
        config_node_property_array_free(com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_productresourcetypes);
        com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_productresourcetypes = NULL;
    }
    if (com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_videoresourcetypes) {
        config_node_property_array_free(com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_videoresourcetypes);
        com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_videoresourcetypes = NULL;
    }
    if (com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_dynamicsequenceresourcetypes) {
        config_node_property_array_free(com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_dynamicsequenceresourcetypes);
        com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_dynamicsequenceresourcetypes = NULL;
    }
    if (com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_previewmodepaths) {
        config_node_property_array_free(com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_previewmodepaths);
        com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_previewmodepaths = NULL;
    }
    free(com_adobe_cq_screens_impl_handler_channels_update_handler_properties);
}

cJSON *com_adobe_cq_screens_impl_handler_channels_update_handler_properties_convertToJSON(com_adobe_cq_screens_impl_handler_channels_update_handler_properties_t *com_adobe_cq_screens_impl_handler_channels_update_handler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_imageresourcetypes
    if(com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_imageresourcetypes) {
    cJSON *cq_pagesupdatehandler_imageresourcetypes_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_imageresourcetypes);
    if(cq_pagesupdatehandler_imageresourcetypes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.pagesupdatehandler.imageresourcetypes", cq_pagesupdatehandler_imageresourcetypes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_productresourcetypes
    if(com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_productresourcetypes) {
    cJSON *cq_pagesupdatehandler_productresourcetypes_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_productresourcetypes);
    if(cq_pagesupdatehandler_productresourcetypes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.pagesupdatehandler.productresourcetypes", cq_pagesupdatehandler_productresourcetypes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_videoresourcetypes
    if(com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_videoresourcetypes) {
    cJSON *cq_pagesupdatehandler_videoresourcetypes_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_videoresourcetypes);
    if(cq_pagesupdatehandler_videoresourcetypes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.pagesupdatehandler.videoresourcetypes", cq_pagesupdatehandler_videoresourcetypes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_dynamicsequenceresourcetypes
    if(com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_dynamicsequenceresourcetypes) {
    cJSON *cq_pagesupdatehandler_dynamicsequenceresourcetypes_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_dynamicsequenceresourcetypes);
    if(cq_pagesupdatehandler_dynamicsequenceresourcetypes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.pagesupdatehandler.dynamicsequenceresourcetypes", cq_pagesupdatehandler_dynamicsequenceresourcetypes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_previewmodepaths
    if(com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_previewmodepaths) {
    cJSON *cq_pagesupdatehandler_previewmodepaths_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_previewmodepaths);
    if(cq_pagesupdatehandler_previewmodepaths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.pagesupdatehandler.previewmodepaths", cq_pagesupdatehandler_previewmodepaths_local_JSON);
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

com_adobe_cq_screens_impl_handler_channels_update_handler_properties_t *com_adobe_cq_screens_impl_handler_channels_update_handler_properties_parseFromJSON(cJSON *com_adobe_cq_screens_impl_handler_channels_update_handler_propertiesJSON){

    com_adobe_cq_screens_impl_handler_channels_update_handler_properties_t *com_adobe_cq_screens_impl_handler_channels_update_handler_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_imageresourcetypes
    config_node_property_array_t *cq_pagesupdatehandler_imageresourcetypes_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_productresourcetypes
    config_node_property_array_t *cq_pagesupdatehandler_productresourcetypes_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_videoresourcetypes
    config_node_property_array_t *cq_pagesupdatehandler_videoresourcetypes_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_dynamicsequenceresourcetypes
    config_node_property_array_t *cq_pagesupdatehandler_dynamicsequenceresourcetypes_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_previewmodepaths
    config_node_property_array_t *cq_pagesupdatehandler_previewmodepaths_local_nonprim = NULL;

    // com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_imageresourcetypes
    cJSON *cq_pagesupdatehandler_imageresourcetypes = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_impl_handler_channels_update_handler_propertiesJSON, "cq.pagesupdatehandler.imageresourcetypes");
    if (cJSON_IsNull(cq_pagesupdatehandler_imageresourcetypes)) {
        cq_pagesupdatehandler_imageresourcetypes = NULL;
    }
    if (cq_pagesupdatehandler_imageresourcetypes) { 
    cq_pagesupdatehandler_imageresourcetypes_local_nonprim = config_node_property_array_parseFromJSON(cq_pagesupdatehandler_imageresourcetypes); //nonprimitive
    }

    // com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_productresourcetypes
    cJSON *cq_pagesupdatehandler_productresourcetypes = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_impl_handler_channels_update_handler_propertiesJSON, "cq.pagesupdatehandler.productresourcetypes");
    if (cJSON_IsNull(cq_pagesupdatehandler_productresourcetypes)) {
        cq_pagesupdatehandler_productresourcetypes = NULL;
    }
    if (cq_pagesupdatehandler_productresourcetypes) { 
    cq_pagesupdatehandler_productresourcetypes_local_nonprim = config_node_property_array_parseFromJSON(cq_pagesupdatehandler_productresourcetypes); //nonprimitive
    }

    // com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_videoresourcetypes
    cJSON *cq_pagesupdatehandler_videoresourcetypes = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_impl_handler_channels_update_handler_propertiesJSON, "cq.pagesupdatehandler.videoresourcetypes");
    if (cJSON_IsNull(cq_pagesupdatehandler_videoresourcetypes)) {
        cq_pagesupdatehandler_videoresourcetypes = NULL;
    }
    if (cq_pagesupdatehandler_videoresourcetypes) { 
    cq_pagesupdatehandler_videoresourcetypes_local_nonprim = config_node_property_array_parseFromJSON(cq_pagesupdatehandler_videoresourcetypes); //nonprimitive
    }

    // com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_dynamicsequenceresourcetypes
    cJSON *cq_pagesupdatehandler_dynamicsequenceresourcetypes = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_impl_handler_channels_update_handler_propertiesJSON, "cq.pagesupdatehandler.dynamicsequenceresourcetypes");
    if (cJSON_IsNull(cq_pagesupdatehandler_dynamicsequenceresourcetypes)) {
        cq_pagesupdatehandler_dynamicsequenceresourcetypes = NULL;
    }
    if (cq_pagesupdatehandler_dynamicsequenceresourcetypes) { 
    cq_pagesupdatehandler_dynamicsequenceresourcetypes_local_nonprim = config_node_property_array_parseFromJSON(cq_pagesupdatehandler_dynamicsequenceresourcetypes); //nonprimitive
    }

    // com_adobe_cq_screens_impl_handler_channels_update_handler_properties->cq_pagesupdatehandler_previewmodepaths
    cJSON *cq_pagesupdatehandler_previewmodepaths = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_impl_handler_channels_update_handler_propertiesJSON, "cq.pagesupdatehandler.previewmodepaths");
    if (cJSON_IsNull(cq_pagesupdatehandler_previewmodepaths)) {
        cq_pagesupdatehandler_previewmodepaths = NULL;
    }
    if (cq_pagesupdatehandler_previewmodepaths) { 
    cq_pagesupdatehandler_previewmodepaths_local_nonprim = config_node_property_array_parseFromJSON(cq_pagesupdatehandler_previewmodepaths); //nonprimitive
    }



    com_adobe_cq_screens_impl_handler_channels_update_handler_properties_local_var = com_adobe_cq_screens_impl_handler_channels_update_handler_properties_create_internal (
        cq_pagesupdatehandler_imageresourcetypes ? cq_pagesupdatehandler_imageresourcetypes_local_nonprim : NULL,
        cq_pagesupdatehandler_productresourcetypes ? cq_pagesupdatehandler_productresourcetypes_local_nonprim : NULL,
        cq_pagesupdatehandler_videoresourcetypes ? cq_pagesupdatehandler_videoresourcetypes_local_nonprim : NULL,
        cq_pagesupdatehandler_dynamicsequenceresourcetypes ? cq_pagesupdatehandler_dynamicsequenceresourcetypes_local_nonprim : NULL,
        cq_pagesupdatehandler_previewmodepaths ? cq_pagesupdatehandler_previewmodepaths_local_nonprim : NULL
        );

    if (!com_adobe_cq_screens_impl_handler_channels_update_handler_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_screens_impl_handler_channels_update_handler_properties_local_var;
end:
    if (cq_pagesupdatehandler_imageresourcetypes_local_nonprim) {
        config_node_property_array_free(cq_pagesupdatehandler_imageresourcetypes_local_nonprim);
        cq_pagesupdatehandler_imageresourcetypes_local_nonprim = NULL;
    }
    if (cq_pagesupdatehandler_productresourcetypes_local_nonprim) {
        config_node_property_array_free(cq_pagesupdatehandler_productresourcetypes_local_nonprim);
        cq_pagesupdatehandler_productresourcetypes_local_nonprim = NULL;
    }
    if (cq_pagesupdatehandler_videoresourcetypes_local_nonprim) {
        config_node_property_array_free(cq_pagesupdatehandler_videoresourcetypes_local_nonprim);
        cq_pagesupdatehandler_videoresourcetypes_local_nonprim = NULL;
    }
    if (cq_pagesupdatehandler_dynamicsequenceresourcetypes_local_nonprim) {
        config_node_property_array_free(cq_pagesupdatehandler_dynamicsequenceresourcetypes_local_nonprim);
        cq_pagesupdatehandler_dynamicsequenceresourcetypes_local_nonprim = NULL;
    }
    if (cq_pagesupdatehandler_previewmodepaths_local_nonprim) {
        config_node_property_array_free(cq_pagesupdatehandler_previewmodepaths_local_nonprim);
        cq_pagesupdatehandler_previewmodepaths_local_nonprim = NULL;
    }
    return NULL;

}
