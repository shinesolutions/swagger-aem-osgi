#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_handler_jpeg_handler_properties.h"



static com_day_cq_dam_core_impl_handler_jpeg_handler_properties_t *com_day_cq_dam_core_impl_handler_jpeg_handler_properties_create_internal(
    config_node_property_boolean_t *cq_dam_enable_ext_meta_extraction,
    config_node_property_integer_t *large_file_threshold,
    config_node_property_integer_t *large_comment_threshold
    ) {
    com_day_cq_dam_core_impl_handler_jpeg_handler_properties_t *com_day_cq_dam_core_impl_handler_jpeg_handler_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_handler_jpeg_handler_properties_t));
    if (!com_day_cq_dam_core_impl_handler_jpeg_handler_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_handler_jpeg_handler_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_handler_jpeg_handler_properties_t));
    com_day_cq_dam_core_impl_handler_jpeg_handler_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_handler_jpeg_handler_properties_local_var->cq_dam_enable_ext_meta_extraction = cq_dam_enable_ext_meta_extraction;
    com_day_cq_dam_core_impl_handler_jpeg_handler_properties_local_var->large_file_threshold = large_file_threshold;
    com_day_cq_dam_core_impl_handler_jpeg_handler_properties_local_var->large_comment_threshold = large_comment_threshold;
    return com_day_cq_dam_core_impl_handler_jpeg_handler_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_handler_jpeg_handler_properties_t *com_day_cq_dam_core_impl_handler_jpeg_handler_properties_create(
    config_node_property_boolean_t *cq_dam_enable_ext_meta_extraction,
    config_node_property_integer_t *large_file_threshold,
    config_node_property_integer_t *large_comment_threshold
    ) {
    com_day_cq_dam_core_impl_handler_jpeg_handler_properties_t *result = com_day_cq_dam_core_impl_handler_jpeg_handler_properties_create_internal (
        cq_dam_enable_ext_meta_extraction,
        large_file_threshold,
        large_comment_threshold
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_handler_jpeg_handler_properties_free(com_day_cq_dam_core_impl_handler_jpeg_handler_properties_t *com_day_cq_dam_core_impl_handler_jpeg_handler_properties) {
    if(NULL == com_day_cq_dam_core_impl_handler_jpeg_handler_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_handler_jpeg_handler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_handler_jpeg_handler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_handler_jpeg_handler_properties->cq_dam_enable_ext_meta_extraction) {
        config_node_property_boolean_free(com_day_cq_dam_core_impl_handler_jpeg_handler_properties->cq_dam_enable_ext_meta_extraction);
        com_day_cq_dam_core_impl_handler_jpeg_handler_properties->cq_dam_enable_ext_meta_extraction = NULL;
    }
    if (com_day_cq_dam_core_impl_handler_jpeg_handler_properties->large_file_threshold) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_handler_jpeg_handler_properties->large_file_threshold);
        com_day_cq_dam_core_impl_handler_jpeg_handler_properties->large_file_threshold = NULL;
    }
    if (com_day_cq_dam_core_impl_handler_jpeg_handler_properties->large_comment_threshold) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_handler_jpeg_handler_properties->large_comment_threshold);
        com_day_cq_dam_core_impl_handler_jpeg_handler_properties->large_comment_threshold = NULL;
    }
    free(com_day_cq_dam_core_impl_handler_jpeg_handler_properties);
}

cJSON *com_day_cq_dam_core_impl_handler_jpeg_handler_properties_convertToJSON(com_day_cq_dam_core_impl_handler_jpeg_handler_properties_t *com_day_cq_dam_core_impl_handler_jpeg_handler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_handler_jpeg_handler_properties->cq_dam_enable_ext_meta_extraction
    if(com_day_cq_dam_core_impl_handler_jpeg_handler_properties->cq_dam_enable_ext_meta_extraction) {
    cJSON *cq_dam_enable_ext_meta_extraction_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_impl_handler_jpeg_handler_properties->cq_dam_enable_ext_meta_extraction);
    if(cq_dam_enable_ext_meta_extraction_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.enable.ext.meta.extraction", cq_dam_enable_ext_meta_extraction_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_handler_jpeg_handler_properties->large_file_threshold
    if(com_day_cq_dam_core_impl_handler_jpeg_handler_properties->large_file_threshold) {
    cJSON *large_file_threshold_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_handler_jpeg_handler_properties->large_file_threshold);
    if(large_file_threshold_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "large_file_threshold", large_file_threshold_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_handler_jpeg_handler_properties->large_comment_threshold
    if(com_day_cq_dam_core_impl_handler_jpeg_handler_properties->large_comment_threshold) {
    cJSON *large_comment_threshold_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_handler_jpeg_handler_properties->large_comment_threshold);
    if(large_comment_threshold_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "large_comment_threshold", large_comment_threshold_local_JSON);
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

com_day_cq_dam_core_impl_handler_jpeg_handler_properties_t *com_day_cq_dam_core_impl_handler_jpeg_handler_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_handler_jpeg_handler_propertiesJSON){

    com_day_cq_dam_core_impl_handler_jpeg_handler_properties_t *com_day_cq_dam_core_impl_handler_jpeg_handler_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_handler_jpeg_handler_properties->cq_dam_enable_ext_meta_extraction
    config_node_property_boolean_t *cq_dam_enable_ext_meta_extraction_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_handler_jpeg_handler_properties->large_file_threshold
    config_node_property_integer_t *large_file_threshold_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_handler_jpeg_handler_properties->large_comment_threshold
    config_node_property_integer_t *large_comment_threshold_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_handler_jpeg_handler_properties->cq_dam_enable_ext_meta_extraction
    cJSON *cq_dam_enable_ext_meta_extraction = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_handler_jpeg_handler_propertiesJSON, "cq.dam.enable.ext.meta.extraction");
    if (cJSON_IsNull(cq_dam_enable_ext_meta_extraction)) {
        cq_dam_enable_ext_meta_extraction = NULL;
    }
    if (cq_dam_enable_ext_meta_extraction) { 
    cq_dam_enable_ext_meta_extraction_local_nonprim = config_node_property_boolean_parseFromJSON(cq_dam_enable_ext_meta_extraction); //nonprimitive
    }

    // com_day_cq_dam_core_impl_handler_jpeg_handler_properties->large_file_threshold
    cJSON *large_file_threshold = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_handler_jpeg_handler_propertiesJSON, "large_file_threshold");
    if (cJSON_IsNull(large_file_threshold)) {
        large_file_threshold = NULL;
    }
    if (large_file_threshold) { 
    large_file_threshold_local_nonprim = config_node_property_integer_parseFromJSON(large_file_threshold); //nonprimitive
    }

    // com_day_cq_dam_core_impl_handler_jpeg_handler_properties->large_comment_threshold
    cJSON *large_comment_threshold = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_handler_jpeg_handler_propertiesJSON, "large_comment_threshold");
    if (cJSON_IsNull(large_comment_threshold)) {
        large_comment_threshold = NULL;
    }
    if (large_comment_threshold) { 
    large_comment_threshold_local_nonprim = config_node_property_integer_parseFromJSON(large_comment_threshold); //nonprimitive
    }



    com_day_cq_dam_core_impl_handler_jpeg_handler_properties_local_var = com_day_cq_dam_core_impl_handler_jpeg_handler_properties_create_internal (
        cq_dam_enable_ext_meta_extraction ? cq_dam_enable_ext_meta_extraction_local_nonprim : NULL,
        large_file_threshold ? large_file_threshold_local_nonprim : NULL,
        large_comment_threshold ? large_comment_threshold_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_handler_jpeg_handler_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_handler_jpeg_handler_properties_local_var;
end:
    if (cq_dam_enable_ext_meta_extraction_local_nonprim) {
        config_node_property_boolean_free(cq_dam_enable_ext_meta_extraction_local_nonprim);
        cq_dam_enable_ext_meta_extraction_local_nonprim = NULL;
    }
    if (large_file_threshold_local_nonprim) {
        config_node_property_integer_free(large_file_threshold_local_nonprim);
        large_file_threshold_local_nonprim = NULL;
    }
    if (large_comment_threshold_local_nonprim) {
        config_node_property_integer_free(large_comment_threshold_local_nonprim);
        large_comment_threshold_local_nonprim = NULL;
    }
    return NULL;

}
