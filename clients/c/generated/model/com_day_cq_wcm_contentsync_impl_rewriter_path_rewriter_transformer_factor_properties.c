#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties.h"



static com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_t *com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_create_internal(
    config_node_property_array_t *cq_contentsync_pathrewritertransformer_mapping_links,
    config_node_property_array_t *cq_contentsync_pathrewritertransformer_mapping_clientlibs,
    config_node_property_array_t *cq_contentsync_pathrewritertransformer_mapping_images,
    config_node_property_string_t *cq_contentsync_pathrewritertransformer_attribute_pattern,
    config_node_property_string_t *cq_contentsync_pathrewritertransformer_clientlibrary_pattern,
    config_node_property_string_t *cq_contentsync_pathrewritertransformer_clientlibrary_replace
    ) {
    com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_t *com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_local_var = malloc(sizeof(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_t));
    if (!com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_local_var, 0, sizeof(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_t));
    com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_local_var->cq_contentsync_pathrewritertransformer_mapping_links = cq_contentsync_pathrewritertransformer_mapping_links;
    com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_local_var->cq_contentsync_pathrewritertransformer_mapping_clientlibs = cq_contentsync_pathrewritertransformer_mapping_clientlibs;
    com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_local_var->cq_contentsync_pathrewritertransformer_mapping_images = cq_contentsync_pathrewritertransformer_mapping_images;
    com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_local_var->cq_contentsync_pathrewritertransformer_attribute_pattern = cq_contentsync_pathrewritertransformer_attribute_pattern;
    com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_local_var->cq_contentsync_pathrewritertransformer_clientlibrary_pattern = cq_contentsync_pathrewritertransformer_clientlibrary_pattern;
    com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_local_var->cq_contentsync_pathrewritertransformer_clientlibrary_replace = cq_contentsync_pathrewritertransformer_clientlibrary_replace;
    return com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_t *com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_create(
    config_node_property_array_t *cq_contentsync_pathrewritertransformer_mapping_links,
    config_node_property_array_t *cq_contentsync_pathrewritertransformer_mapping_clientlibs,
    config_node_property_array_t *cq_contentsync_pathrewritertransformer_mapping_images,
    config_node_property_string_t *cq_contentsync_pathrewritertransformer_attribute_pattern,
    config_node_property_string_t *cq_contentsync_pathrewritertransformer_clientlibrary_pattern,
    config_node_property_string_t *cq_contentsync_pathrewritertransformer_clientlibrary_replace
    ) {
    com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_t *result = com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_create_internal (
        cq_contentsync_pathrewritertransformer_mapping_links,
        cq_contentsync_pathrewritertransformer_mapping_clientlibs,
        cq_contentsync_pathrewritertransformer_mapping_images,
        cq_contentsync_pathrewritertransformer_attribute_pattern,
        cq_contentsync_pathrewritertransformer_clientlibrary_pattern,
        cq_contentsync_pathrewritertransformer_clientlibrary_replace
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_free(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_t *com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties) {
    if(NULL == com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties){
        return ;
    }
    if(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_links) {
        config_node_property_array_free(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_links);
        com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_links = NULL;
    }
    if (com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_clientlibs) {
        config_node_property_array_free(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_clientlibs);
        com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_clientlibs = NULL;
    }
    if (com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_images) {
        config_node_property_array_free(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_images);
        com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_images = NULL;
    }
    if (com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_attribute_pattern) {
        config_node_property_string_free(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_attribute_pattern);
        com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_attribute_pattern = NULL;
    }
    if (com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_clientlibrary_pattern) {
        config_node_property_string_free(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_clientlibrary_pattern);
        com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_clientlibrary_pattern = NULL;
    }
    if (com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_clientlibrary_replace) {
        config_node_property_string_free(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_clientlibrary_replace);
        com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_clientlibrary_replace = NULL;
    }
    free(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties);
}

cJSON *com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_convertToJSON(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_t *com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_links
    if(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_links) {
    cJSON *cq_contentsync_pathrewritertransformer_mapping_links_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_links);
    if(cq_contentsync_pathrewritertransformer_mapping_links_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.contentsync.pathrewritertransformer.mapping.links", cq_contentsync_pathrewritertransformer_mapping_links_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_clientlibs
    if(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_clientlibs) {
    cJSON *cq_contentsync_pathrewritertransformer_mapping_clientlibs_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_clientlibs);
    if(cq_contentsync_pathrewritertransformer_mapping_clientlibs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.contentsync.pathrewritertransformer.mapping.clientlibs", cq_contentsync_pathrewritertransformer_mapping_clientlibs_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_images
    if(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_images) {
    cJSON *cq_contentsync_pathrewritertransformer_mapping_images_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_images);
    if(cq_contentsync_pathrewritertransformer_mapping_images_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.contentsync.pathrewritertransformer.mapping.images", cq_contentsync_pathrewritertransformer_mapping_images_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_attribute_pattern
    if(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_attribute_pattern) {
    cJSON *cq_contentsync_pathrewritertransformer_attribute_pattern_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_attribute_pattern);
    if(cq_contentsync_pathrewritertransformer_attribute_pattern_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.contentsync.pathrewritertransformer.attribute.pattern", cq_contentsync_pathrewritertransformer_attribute_pattern_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_clientlibrary_pattern
    if(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_clientlibrary_pattern) {
    cJSON *cq_contentsync_pathrewritertransformer_clientlibrary_pattern_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_clientlibrary_pattern);
    if(cq_contentsync_pathrewritertransformer_clientlibrary_pattern_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.contentsync.pathrewritertransformer.clientlibrary.pattern", cq_contentsync_pathrewritertransformer_clientlibrary_pattern_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_clientlibrary_replace
    if(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_clientlibrary_replace) {
    cJSON *cq_contentsync_pathrewritertransformer_clientlibrary_replace_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_clientlibrary_replace);
    if(cq_contentsync_pathrewritertransformer_clientlibrary_replace_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.contentsync.pathrewritertransformer.clientlibrary.replace", cq_contentsync_pathrewritertransformer_clientlibrary_replace_local_JSON);
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

com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_t *com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_parseFromJSON(cJSON *com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_propertiesJSON){

    com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_t *com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_links
    config_node_property_array_t *cq_contentsync_pathrewritertransformer_mapping_links_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_clientlibs
    config_node_property_array_t *cq_contentsync_pathrewritertransformer_mapping_clientlibs_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_images
    config_node_property_array_t *cq_contentsync_pathrewritertransformer_mapping_images_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_attribute_pattern
    config_node_property_string_t *cq_contentsync_pathrewritertransformer_attribute_pattern_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_clientlibrary_pattern
    config_node_property_string_t *cq_contentsync_pathrewritertransformer_clientlibrary_pattern_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_clientlibrary_replace
    config_node_property_string_t *cq_contentsync_pathrewritertransformer_clientlibrary_replace_local_nonprim = NULL;

    // com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_links
    cJSON *cq_contentsync_pathrewritertransformer_mapping_links = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_propertiesJSON, "cq.contentsync.pathrewritertransformer.mapping.links");
    if (cJSON_IsNull(cq_contentsync_pathrewritertransformer_mapping_links)) {
        cq_contentsync_pathrewritertransformer_mapping_links = NULL;
    }
    if (cq_contentsync_pathrewritertransformer_mapping_links) { 
    cq_contentsync_pathrewritertransformer_mapping_links_local_nonprim = config_node_property_array_parseFromJSON(cq_contentsync_pathrewritertransformer_mapping_links); //nonprimitive
    }

    // com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_clientlibs
    cJSON *cq_contentsync_pathrewritertransformer_mapping_clientlibs = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_propertiesJSON, "cq.contentsync.pathrewritertransformer.mapping.clientlibs");
    if (cJSON_IsNull(cq_contentsync_pathrewritertransformer_mapping_clientlibs)) {
        cq_contentsync_pathrewritertransformer_mapping_clientlibs = NULL;
    }
    if (cq_contentsync_pathrewritertransformer_mapping_clientlibs) { 
    cq_contentsync_pathrewritertransformer_mapping_clientlibs_local_nonprim = config_node_property_array_parseFromJSON(cq_contentsync_pathrewritertransformer_mapping_clientlibs); //nonprimitive
    }

    // com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_mapping_images
    cJSON *cq_contentsync_pathrewritertransformer_mapping_images = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_propertiesJSON, "cq.contentsync.pathrewritertransformer.mapping.images");
    if (cJSON_IsNull(cq_contentsync_pathrewritertransformer_mapping_images)) {
        cq_contentsync_pathrewritertransformer_mapping_images = NULL;
    }
    if (cq_contentsync_pathrewritertransformer_mapping_images) { 
    cq_contentsync_pathrewritertransformer_mapping_images_local_nonprim = config_node_property_array_parseFromJSON(cq_contentsync_pathrewritertransformer_mapping_images); //nonprimitive
    }

    // com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_attribute_pattern
    cJSON *cq_contentsync_pathrewritertransformer_attribute_pattern = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_propertiesJSON, "cq.contentsync.pathrewritertransformer.attribute.pattern");
    if (cJSON_IsNull(cq_contentsync_pathrewritertransformer_attribute_pattern)) {
        cq_contentsync_pathrewritertransformer_attribute_pattern = NULL;
    }
    if (cq_contentsync_pathrewritertransformer_attribute_pattern) { 
    cq_contentsync_pathrewritertransformer_attribute_pattern_local_nonprim = config_node_property_string_parseFromJSON(cq_contentsync_pathrewritertransformer_attribute_pattern); //nonprimitive
    }

    // com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_clientlibrary_pattern
    cJSON *cq_contentsync_pathrewritertransformer_clientlibrary_pattern = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_propertiesJSON, "cq.contentsync.pathrewritertransformer.clientlibrary.pattern");
    if (cJSON_IsNull(cq_contentsync_pathrewritertransformer_clientlibrary_pattern)) {
        cq_contentsync_pathrewritertransformer_clientlibrary_pattern = NULL;
    }
    if (cq_contentsync_pathrewritertransformer_clientlibrary_pattern) { 
    cq_contentsync_pathrewritertransformer_clientlibrary_pattern_local_nonprim = config_node_property_string_parseFromJSON(cq_contentsync_pathrewritertransformer_clientlibrary_pattern); //nonprimitive
    }

    // com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties->cq_contentsync_pathrewritertransformer_clientlibrary_replace
    cJSON *cq_contentsync_pathrewritertransformer_clientlibrary_replace = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_propertiesJSON, "cq.contentsync.pathrewritertransformer.clientlibrary.replace");
    if (cJSON_IsNull(cq_contentsync_pathrewritertransformer_clientlibrary_replace)) {
        cq_contentsync_pathrewritertransformer_clientlibrary_replace = NULL;
    }
    if (cq_contentsync_pathrewritertransformer_clientlibrary_replace) { 
    cq_contentsync_pathrewritertransformer_clientlibrary_replace_local_nonprim = config_node_property_string_parseFromJSON(cq_contentsync_pathrewritertransformer_clientlibrary_replace); //nonprimitive
    }



    com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_local_var = com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_create_internal (
        cq_contentsync_pathrewritertransformer_mapping_links ? cq_contentsync_pathrewritertransformer_mapping_links_local_nonprim : NULL,
        cq_contentsync_pathrewritertransformer_mapping_clientlibs ? cq_contentsync_pathrewritertransformer_mapping_clientlibs_local_nonprim : NULL,
        cq_contentsync_pathrewritertransformer_mapping_images ? cq_contentsync_pathrewritertransformer_mapping_images_local_nonprim : NULL,
        cq_contentsync_pathrewritertransformer_attribute_pattern ? cq_contentsync_pathrewritertransformer_attribute_pattern_local_nonprim : NULL,
        cq_contentsync_pathrewritertransformer_clientlibrary_pattern ? cq_contentsync_pathrewritertransformer_clientlibrary_pattern_local_nonprim : NULL,
        cq_contentsync_pathrewritertransformer_clientlibrary_replace ? cq_contentsync_pathrewritertransformer_clientlibrary_replace_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_properties_local_var;
end:
    if (cq_contentsync_pathrewritertransformer_mapping_links_local_nonprim) {
        config_node_property_array_free(cq_contentsync_pathrewritertransformer_mapping_links_local_nonprim);
        cq_contentsync_pathrewritertransformer_mapping_links_local_nonprim = NULL;
    }
    if (cq_contentsync_pathrewritertransformer_mapping_clientlibs_local_nonprim) {
        config_node_property_array_free(cq_contentsync_pathrewritertransformer_mapping_clientlibs_local_nonprim);
        cq_contentsync_pathrewritertransformer_mapping_clientlibs_local_nonprim = NULL;
    }
    if (cq_contentsync_pathrewritertransformer_mapping_images_local_nonprim) {
        config_node_property_array_free(cq_contentsync_pathrewritertransformer_mapping_images_local_nonprim);
        cq_contentsync_pathrewritertransformer_mapping_images_local_nonprim = NULL;
    }
    if (cq_contentsync_pathrewritertransformer_attribute_pattern_local_nonprim) {
        config_node_property_string_free(cq_contentsync_pathrewritertransformer_attribute_pattern_local_nonprim);
        cq_contentsync_pathrewritertransformer_attribute_pattern_local_nonprim = NULL;
    }
    if (cq_contentsync_pathrewritertransformer_clientlibrary_pattern_local_nonprim) {
        config_node_property_string_free(cq_contentsync_pathrewritertransformer_clientlibrary_pattern_local_nonprim);
        cq_contentsync_pathrewritertransformer_clientlibrary_pattern_local_nonprim = NULL;
    }
    if (cq_contentsync_pathrewritertransformer_clientlibrary_replace_local_nonprim) {
        config_node_property_string_free(cq_contentsync_pathrewritertransformer_clientlibrary_replace_local_nonprim);
        cq_contentsync_pathrewritertransformer_clientlibrary_replace_local_nonprim = NULL;
    }
    return NULL;

}
