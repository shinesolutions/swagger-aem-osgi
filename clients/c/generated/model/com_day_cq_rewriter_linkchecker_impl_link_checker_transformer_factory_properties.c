#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties.h"



static com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_create_internal(
    config_node_property_boolean_t *linkcheckertransformer_disable_rewriting,
    config_node_property_boolean_t *linkcheckertransformer_disable_checking,
    config_node_property_integer_t *linkcheckertransformer_map_cache_size,
    config_node_property_boolean_t *linkcheckertransformer_strict_extension_check,
    config_node_property_boolean_t *linkcheckertransformer_strip_htmlt_extension,
    config_node_property_array_t *linkcheckertransformer_rewrite_elements,
    config_node_property_array_t *linkcheckertransformer_strip_extension_path_blacklist
    ) {
    com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_local_var = malloc(sizeof(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_t));
    if (!com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_local_var, 0, sizeof(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_t));
    com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_local_var->_library_owned = 1;
    com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_local_var->linkcheckertransformer_disable_rewriting = linkcheckertransformer_disable_rewriting;
    com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_local_var->linkcheckertransformer_disable_checking = linkcheckertransformer_disable_checking;
    com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_local_var->linkcheckertransformer_map_cache_size = linkcheckertransformer_map_cache_size;
    com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_local_var->linkcheckertransformer_strict_extension_check = linkcheckertransformer_strict_extension_check;
    com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_local_var->linkcheckertransformer_strip_htmlt_extension = linkcheckertransformer_strip_htmlt_extension;
    com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_local_var->linkcheckertransformer_rewrite_elements = linkcheckertransformer_rewrite_elements;
    com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_local_var->linkcheckertransformer_strip_extension_path_blacklist = linkcheckertransformer_strip_extension_path_blacklist;
    return com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_create(
    config_node_property_boolean_t *linkcheckertransformer_disable_rewriting,
    config_node_property_boolean_t *linkcheckertransformer_disable_checking,
    config_node_property_integer_t *linkcheckertransformer_map_cache_size,
    config_node_property_boolean_t *linkcheckertransformer_strict_extension_check,
    config_node_property_boolean_t *linkcheckertransformer_strip_htmlt_extension,
    config_node_property_array_t *linkcheckertransformer_rewrite_elements,
    config_node_property_array_t *linkcheckertransformer_strip_extension_path_blacklist
    ) {
    com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_t *result = com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_create_internal (
        linkcheckertransformer_disable_rewriting,
        linkcheckertransformer_disable_checking,
        linkcheckertransformer_map_cache_size,
        linkcheckertransformer_strict_extension_check,
        linkcheckertransformer_strip_htmlt_extension,
        linkcheckertransformer_rewrite_elements,
        linkcheckertransformer_strip_extension_path_blacklist
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_free(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties) {
    if(NULL == com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties){
        return ;
    }
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_disable_rewriting) {
        config_node_property_boolean_free(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_disable_rewriting);
        com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_disable_rewriting = NULL;
    }
    if (com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_disable_checking) {
        config_node_property_boolean_free(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_disable_checking);
        com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_disable_checking = NULL;
    }
    if (com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_map_cache_size) {
        config_node_property_integer_free(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_map_cache_size);
        com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_map_cache_size = NULL;
    }
    if (com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strict_extension_check) {
        config_node_property_boolean_free(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strict_extension_check);
        com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strict_extension_check = NULL;
    }
    if (com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strip_htmlt_extension) {
        config_node_property_boolean_free(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strip_htmlt_extension);
        com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strip_htmlt_extension = NULL;
    }
    if (com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_rewrite_elements) {
        config_node_property_array_free(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_rewrite_elements);
        com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_rewrite_elements = NULL;
    }
    if (com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strip_extension_path_blacklist) {
        config_node_property_array_free(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strip_extension_path_blacklist);
        com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strip_extension_path_blacklist = NULL;
    }
    free(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties);
}

cJSON *com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_disable_rewriting
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_disable_rewriting) {
    cJSON *linkcheckertransformer_disable_rewriting_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_disable_rewriting);
    if(linkcheckertransformer_disable_rewriting_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "linkcheckertransformer.disableRewriting", linkcheckertransformer_disable_rewriting_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_disable_checking
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_disable_checking) {
    cJSON *linkcheckertransformer_disable_checking_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_disable_checking);
    if(linkcheckertransformer_disable_checking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "linkcheckertransformer.disableChecking", linkcheckertransformer_disable_checking_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_map_cache_size
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_map_cache_size) {
    cJSON *linkcheckertransformer_map_cache_size_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_map_cache_size);
    if(linkcheckertransformer_map_cache_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "linkcheckertransformer.mapCacheSize", linkcheckertransformer_map_cache_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strict_extension_check
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strict_extension_check) {
    cJSON *linkcheckertransformer_strict_extension_check_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strict_extension_check);
    if(linkcheckertransformer_strict_extension_check_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "linkcheckertransformer.strictExtensionCheck", linkcheckertransformer_strict_extension_check_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strip_htmlt_extension
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strip_htmlt_extension) {
    cJSON *linkcheckertransformer_strip_htmlt_extension_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strip_htmlt_extension);
    if(linkcheckertransformer_strip_htmlt_extension_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "linkcheckertransformer.stripHtmltExtension", linkcheckertransformer_strip_htmlt_extension_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_rewrite_elements
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_rewrite_elements) {
    cJSON *linkcheckertransformer_rewrite_elements_local_JSON = config_node_property_array_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_rewrite_elements);
    if(linkcheckertransformer_rewrite_elements_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "linkcheckertransformer.rewriteElements", linkcheckertransformer_rewrite_elements_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strip_extension_path_blacklist
    if(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strip_extension_path_blacklist) {
    cJSON *linkcheckertransformer_strip_extension_path_blacklist_local_JSON = config_node_property_array_convertToJSON(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strip_extension_path_blacklist);
    if(linkcheckertransformer_strip_extension_path_blacklist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "linkcheckertransformer.stripExtensionPathBlacklist", linkcheckertransformer_strip_extension_path_blacklist_local_JSON);
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

com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_parseFromJSON(cJSON *com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_propertiesJSON){

    com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_t *com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_local_var = NULL;

    // define the local variable for com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_disable_rewriting
    config_node_property_boolean_t *linkcheckertransformer_disable_rewriting_local_nonprim = NULL;

    // define the local variable for com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_disable_checking
    config_node_property_boolean_t *linkcheckertransformer_disable_checking_local_nonprim = NULL;

    // define the local variable for com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_map_cache_size
    config_node_property_integer_t *linkcheckertransformer_map_cache_size_local_nonprim = NULL;

    // define the local variable for com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strict_extension_check
    config_node_property_boolean_t *linkcheckertransformer_strict_extension_check_local_nonprim = NULL;

    // define the local variable for com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strip_htmlt_extension
    config_node_property_boolean_t *linkcheckertransformer_strip_htmlt_extension_local_nonprim = NULL;

    // define the local variable for com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_rewrite_elements
    config_node_property_array_t *linkcheckertransformer_rewrite_elements_local_nonprim = NULL;

    // define the local variable for com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strip_extension_path_blacklist
    config_node_property_array_t *linkcheckertransformer_strip_extension_path_blacklist_local_nonprim = NULL;

    // com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_disable_rewriting
    cJSON *linkcheckertransformer_disable_rewriting = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_propertiesJSON, "linkcheckertransformer.disableRewriting");
    if (cJSON_IsNull(linkcheckertransformer_disable_rewriting)) {
        linkcheckertransformer_disable_rewriting = NULL;
    }
    if (linkcheckertransformer_disable_rewriting) { 
    linkcheckertransformer_disable_rewriting_local_nonprim = config_node_property_boolean_parseFromJSON(linkcheckertransformer_disable_rewriting); //nonprimitive
    }

    // com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_disable_checking
    cJSON *linkcheckertransformer_disable_checking = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_propertiesJSON, "linkcheckertransformer.disableChecking");
    if (cJSON_IsNull(linkcheckertransformer_disable_checking)) {
        linkcheckertransformer_disable_checking = NULL;
    }
    if (linkcheckertransformer_disable_checking) { 
    linkcheckertransformer_disable_checking_local_nonprim = config_node_property_boolean_parseFromJSON(linkcheckertransformer_disable_checking); //nonprimitive
    }

    // com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_map_cache_size
    cJSON *linkcheckertransformer_map_cache_size = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_propertiesJSON, "linkcheckertransformer.mapCacheSize");
    if (cJSON_IsNull(linkcheckertransformer_map_cache_size)) {
        linkcheckertransformer_map_cache_size = NULL;
    }
    if (linkcheckertransformer_map_cache_size) { 
    linkcheckertransformer_map_cache_size_local_nonprim = config_node_property_integer_parseFromJSON(linkcheckertransformer_map_cache_size); //nonprimitive
    }

    // com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strict_extension_check
    cJSON *linkcheckertransformer_strict_extension_check = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_propertiesJSON, "linkcheckertransformer.strictExtensionCheck");
    if (cJSON_IsNull(linkcheckertransformer_strict_extension_check)) {
        linkcheckertransformer_strict_extension_check = NULL;
    }
    if (linkcheckertransformer_strict_extension_check) { 
    linkcheckertransformer_strict_extension_check_local_nonprim = config_node_property_boolean_parseFromJSON(linkcheckertransformer_strict_extension_check); //nonprimitive
    }

    // com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strip_htmlt_extension
    cJSON *linkcheckertransformer_strip_htmlt_extension = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_propertiesJSON, "linkcheckertransformer.stripHtmltExtension");
    if (cJSON_IsNull(linkcheckertransformer_strip_htmlt_extension)) {
        linkcheckertransformer_strip_htmlt_extension = NULL;
    }
    if (linkcheckertransformer_strip_htmlt_extension) { 
    linkcheckertransformer_strip_htmlt_extension_local_nonprim = config_node_property_boolean_parseFromJSON(linkcheckertransformer_strip_htmlt_extension); //nonprimitive
    }

    // com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_rewrite_elements
    cJSON *linkcheckertransformer_rewrite_elements = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_propertiesJSON, "linkcheckertransformer.rewriteElements");
    if (cJSON_IsNull(linkcheckertransformer_rewrite_elements)) {
        linkcheckertransformer_rewrite_elements = NULL;
    }
    if (linkcheckertransformer_rewrite_elements) { 
    linkcheckertransformer_rewrite_elements_local_nonprim = config_node_property_array_parseFromJSON(linkcheckertransformer_rewrite_elements); //nonprimitive
    }

    // com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties->linkcheckertransformer_strip_extension_path_blacklist
    cJSON *linkcheckertransformer_strip_extension_path_blacklist = cJSON_GetObjectItemCaseSensitive(com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_propertiesJSON, "linkcheckertransformer.stripExtensionPathBlacklist");
    if (cJSON_IsNull(linkcheckertransformer_strip_extension_path_blacklist)) {
        linkcheckertransformer_strip_extension_path_blacklist = NULL;
    }
    if (linkcheckertransformer_strip_extension_path_blacklist) { 
    linkcheckertransformer_strip_extension_path_blacklist_local_nonprim = config_node_property_array_parseFromJSON(linkcheckertransformer_strip_extension_path_blacklist); //nonprimitive
    }



    com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_local_var = com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_create_internal (
        linkcheckertransformer_disable_rewriting ? linkcheckertransformer_disable_rewriting_local_nonprim : NULL,
        linkcheckertransformer_disable_checking ? linkcheckertransformer_disable_checking_local_nonprim : NULL,
        linkcheckertransformer_map_cache_size ? linkcheckertransformer_map_cache_size_local_nonprim : NULL,
        linkcheckertransformer_strict_extension_check ? linkcheckertransformer_strict_extension_check_local_nonprim : NULL,
        linkcheckertransformer_strip_htmlt_extension ? linkcheckertransformer_strip_htmlt_extension_local_nonprim : NULL,
        linkcheckertransformer_rewrite_elements ? linkcheckertransformer_rewrite_elements_local_nonprim : NULL,
        linkcheckertransformer_strip_extension_path_blacklist ? linkcheckertransformer_strip_extension_path_blacklist_local_nonprim : NULL
        );

    if (!com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_local_var) {
        goto end;
    }

    return com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties_local_var;
end:
    if (linkcheckertransformer_disable_rewriting_local_nonprim) {
        config_node_property_boolean_free(linkcheckertransformer_disable_rewriting_local_nonprim);
        linkcheckertransformer_disable_rewriting_local_nonprim = NULL;
    }
    if (linkcheckertransformer_disable_checking_local_nonprim) {
        config_node_property_boolean_free(linkcheckertransformer_disable_checking_local_nonprim);
        linkcheckertransformer_disable_checking_local_nonprim = NULL;
    }
    if (linkcheckertransformer_map_cache_size_local_nonprim) {
        config_node_property_integer_free(linkcheckertransformer_map_cache_size_local_nonprim);
        linkcheckertransformer_map_cache_size_local_nonprim = NULL;
    }
    if (linkcheckertransformer_strict_extension_check_local_nonprim) {
        config_node_property_boolean_free(linkcheckertransformer_strict_extension_check_local_nonprim);
        linkcheckertransformer_strict_extension_check_local_nonprim = NULL;
    }
    if (linkcheckertransformer_strip_htmlt_extension_local_nonprim) {
        config_node_property_boolean_free(linkcheckertransformer_strip_htmlt_extension_local_nonprim);
        linkcheckertransformer_strip_htmlt_extension_local_nonprim = NULL;
    }
    if (linkcheckertransformer_rewrite_elements_local_nonprim) {
        config_node_property_array_free(linkcheckertransformer_rewrite_elements_local_nonprim);
        linkcheckertransformer_rewrite_elements_local_nonprim = NULL;
    }
    if (linkcheckertransformer_strip_extension_path_blacklist_local_nonprim) {
        config_node_property_array_free(linkcheckertransformer_strip_extension_path_blacklist_local_nonprim);
        linkcheckertransformer_strip_extension_path_blacklist_local_nonprim = NULL;
    }
    return NULL;

}
