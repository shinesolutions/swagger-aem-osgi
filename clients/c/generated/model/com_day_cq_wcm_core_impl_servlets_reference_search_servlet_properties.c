#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties.h"



static com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_t *com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_create_internal(
    config_node_property_integer_t *referencesearchservlet_max_references_per_page,
    config_node_property_integer_t *referencesearchservlet_max_pages
    ) {
    com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_t *com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_local_var = malloc(sizeof(com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_t));
    if (!com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_local_var, 0, sizeof(com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_t));
    com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_local_var->referencesearchservlet_max_references_per_page = referencesearchservlet_max_references_per_page;
    com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_local_var->referencesearchservlet_max_pages = referencesearchservlet_max_pages;
    return com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_t *com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_create(
    config_node_property_integer_t *referencesearchservlet_max_references_per_page,
    config_node_property_integer_t *referencesearchservlet_max_pages
    ) {
    com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_t *result = com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_create_internal (
        referencesearchservlet_max_references_per_page,
        referencesearchservlet_max_pages
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_free(com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_t *com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties) {
    if(NULL == com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties){
        return ;
    }
    if(com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties->referencesearchservlet_max_references_per_page) {
        config_node_property_integer_free(com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties->referencesearchservlet_max_references_per_page);
        com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties->referencesearchservlet_max_references_per_page = NULL;
    }
    if (com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties->referencesearchservlet_max_pages) {
        config_node_property_integer_free(com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties->referencesearchservlet_max_pages);
        com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties->referencesearchservlet_max_pages = NULL;
    }
    free(com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties);
}

cJSON *com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_convertToJSON(com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_t *com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties->referencesearchservlet_max_references_per_page
    if(com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties->referencesearchservlet_max_references_per_page) {
    cJSON *referencesearchservlet_max_references_per_page_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties->referencesearchservlet_max_references_per_page);
    if(referencesearchservlet_max_references_per_page_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "referencesearchservlet.maxReferencesPerPage", referencesearchservlet_max_references_per_page_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties->referencesearchservlet_max_pages
    if(com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties->referencesearchservlet_max_pages) {
    cJSON *referencesearchservlet_max_pages_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties->referencesearchservlet_max_pages);
    if(referencesearchservlet_max_pages_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "referencesearchservlet.maxPages", referencesearchservlet_max_pages_local_JSON);
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

com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_t *com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_servlets_reference_search_servlet_propertiesJSON){

    com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_t *com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties->referencesearchservlet_max_references_per_page
    config_node_property_integer_t *referencesearchservlet_max_references_per_page_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties->referencesearchservlet_max_pages
    config_node_property_integer_t *referencesearchservlet_max_pages_local_nonprim = NULL;

    // com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties->referencesearchservlet_max_references_per_page
    cJSON *referencesearchservlet_max_references_per_page = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_servlets_reference_search_servlet_propertiesJSON, "referencesearchservlet.maxReferencesPerPage");
    if (cJSON_IsNull(referencesearchservlet_max_references_per_page)) {
        referencesearchservlet_max_references_per_page = NULL;
    }
    if (referencesearchservlet_max_references_per_page) { 
    referencesearchservlet_max_references_per_page_local_nonprim = config_node_property_integer_parseFromJSON(referencesearchservlet_max_references_per_page); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties->referencesearchservlet_max_pages
    cJSON *referencesearchservlet_max_pages = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_servlets_reference_search_servlet_propertiesJSON, "referencesearchservlet.maxPages");
    if (cJSON_IsNull(referencesearchservlet_max_pages)) {
        referencesearchservlet_max_pages = NULL;
    }
    if (referencesearchservlet_max_pages) { 
    referencesearchservlet_max_pages_local_nonprim = config_node_property_integer_parseFromJSON(referencesearchservlet_max_pages); //nonprimitive
    }



    com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_local_var = com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_create_internal (
        referencesearchservlet_max_references_per_page ? referencesearchservlet_max_references_per_page_local_nonprim : NULL,
        referencesearchservlet_max_pages ? referencesearchservlet_max_pages_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_local_var;
end:
    if (referencesearchservlet_max_references_per_page_local_nonprim) {
        config_node_property_integer_free(referencesearchservlet_max_references_per_page_local_nonprim);
        referencesearchservlet_max_references_per_page_local_nonprim = NULL;
    }
    if (referencesearchservlet_max_pages_local_nonprim) {
        config_node_property_integer_free(referencesearchservlet_max_pages_local_nonprim);
        referencesearchservlet_max_pages_local_nonprim = NULL;
    }
    return NULL;

}
