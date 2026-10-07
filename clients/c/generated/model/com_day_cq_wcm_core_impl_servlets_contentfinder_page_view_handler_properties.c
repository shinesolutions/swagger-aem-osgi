#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties.h"



static com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_t *com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_create_internal(
    config_node_property_string_t *guess_total,
    config_node_property_boolean_t *tag_title_search
    ) {
    com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_t *com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_local_var = malloc(sizeof(com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_t));
    if (!com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_local_var, 0, sizeof(com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_t));
    com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_local_var->guess_total = guess_total;
    com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_local_var->tag_title_search = tag_title_search;
    return com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_t *com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_create(
    config_node_property_string_t *guess_total,
    config_node_property_boolean_t *tag_title_search
    ) {
    com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_t *result = com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_create_internal (
        guess_total,
        tag_title_search
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_free(com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_t *com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties) {
    if(NULL == com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties){
        return ;
    }
    if(com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties->guess_total) {
        config_node_property_string_free(com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties->guess_total);
        com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties->guess_total = NULL;
    }
    if (com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties->tag_title_search) {
        config_node_property_boolean_free(com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties->tag_title_search);
        com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties->tag_title_search = NULL;
    }
    free(com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties);
}

cJSON *com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_convertToJSON(com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_t *com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties->guess_total
    if(com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties->guess_total) {
    cJSON *guess_total_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties->guess_total);
    if(guess_total_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "guessTotal", guess_total_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties->tag_title_search
    if(com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties->tag_title_search) {
    cJSON *tag_title_search_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties->tag_title_search);
    if(tag_title_search_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tagTitleSearch", tag_title_search_local_JSON);
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

com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_t *com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_propertiesJSON){

    com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_t *com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties->guess_total
    config_node_property_string_t *guess_total_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties->tag_title_search
    config_node_property_boolean_t *tag_title_search_local_nonprim = NULL;

    // com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties->guess_total
    cJSON *guess_total = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_propertiesJSON, "guessTotal");
    if (cJSON_IsNull(guess_total)) {
        guess_total = NULL;
    }
    if (guess_total) { 
    guess_total_local_nonprim = config_node_property_string_parseFromJSON(guess_total); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties->tag_title_search
    cJSON *tag_title_search = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_propertiesJSON, "tagTitleSearch");
    if (cJSON_IsNull(tag_title_search)) {
        tag_title_search = NULL;
    }
    if (tag_title_search) { 
    tag_title_search_local_nonprim = config_node_property_boolean_parseFromJSON(tag_title_search); //nonprimitive
    }



    com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_local_var = com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_create_internal (
        guess_total ? guess_total_local_nonprim : NULL,
        tag_title_search ? tag_title_search_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_properties_local_var;
end:
    if (guess_total_local_nonprim) {
        config_node_property_string_free(guess_total_local_nonprim);
        guess_total_local_nonprim = NULL;
    }
    if (tag_title_search_local_nonprim) {
        config_node_property_boolean_free(tag_title_search_local_nonprim);
        tag_title_search_local_nonprim = NULL;
    }
    return NULL;

}
