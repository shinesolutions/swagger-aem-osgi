#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties.h"



static com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_t *com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_create_internal(
    config_node_property_boolean_t *group_listing_pagination_enable,
    config_node_property_boolean_t *group_listing_lazyloading_enable,
    config_node_property_integer_t *page_size,
    config_node_property_integer_t *priority
    ) {
    com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_t *com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_local_var = malloc(sizeof(com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_t));
    if (!com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_local_var, 0, sizeof(com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_t));
    com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_local_var->group_listing_pagination_enable = group_listing_pagination_enable;
    com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_local_var->group_listing_lazyloading_enable = group_listing_lazyloading_enable;
    com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_local_var->page_size = page_size;
    com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_local_var->priority = priority;
    return com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_t *com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_create(
    config_node_property_boolean_t *group_listing_pagination_enable,
    config_node_property_boolean_t *group_listing_lazyloading_enable,
    config_node_property_integer_t *page_size,
    config_node_property_integer_t *priority
    ) {
    com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_t *result = com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_create_internal (
        group_listing_pagination_enable,
        group_listing_lazyloading_enable,
        page_size,
        priority
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_free(com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_t *com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties) {
    if(NULL == com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties){
        return ;
    }
    if(com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->group_listing_pagination_enable) {
        config_node_property_boolean_free(com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->group_listing_pagination_enable);
        com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->group_listing_pagination_enable = NULL;
    }
    if (com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->group_listing_lazyloading_enable) {
        config_node_property_boolean_free(com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->group_listing_lazyloading_enable);
        com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->group_listing_lazyloading_enable = NULL;
    }
    if (com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->page_size) {
        config_node_property_integer_free(com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->page_size);
        com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->page_size = NULL;
    }
    if (com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->priority) {
        config_node_property_integer_free(com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->priority);
        com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->priority = NULL;
    }
    free(com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties);
}

cJSON *com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_convertToJSON(com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_t *com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->group_listing_pagination_enable
    if(com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->group_listing_pagination_enable) {
    cJSON *group_listing_pagination_enable_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->group_listing_pagination_enable);
    if(group_listing_pagination_enable_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "group.listing.pagination.enable", group_listing_pagination_enable_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->group_listing_lazyloading_enable
    if(com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->group_listing_lazyloading_enable) {
    cJSON *group_listing_lazyloading_enable_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->group_listing_lazyloading_enable);
    if(group_listing_lazyloading_enable_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "group.listing.lazyloading.enable", group_listing_lazyloading_enable_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->page_size
    if(com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->page_size) {
    cJSON *page_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->page_size);
    if(page_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "page.size", page_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->priority
    if(com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->priority) {
    cJSON *priority_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->priority);
    if(priority_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "priority", priority_local_JSON);
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

com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_t *com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_parseFromJSON(cJSON *com_adobe_cq_social_group_client_impl_community_group_collection_componen_propertiesJSON){

    com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_t *com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->group_listing_pagination_enable
    config_node_property_boolean_t *group_listing_pagination_enable_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->group_listing_lazyloading_enable
    config_node_property_boolean_t *group_listing_lazyloading_enable_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->page_size
    config_node_property_integer_t *page_size_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->priority
    config_node_property_integer_t *priority_local_nonprim = NULL;

    // com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->group_listing_pagination_enable
    cJSON *group_listing_pagination_enable = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_group_client_impl_community_group_collection_componen_propertiesJSON, "group.listing.pagination.enable");
    if (cJSON_IsNull(group_listing_pagination_enable)) {
        group_listing_pagination_enable = NULL;
    }
    if (group_listing_pagination_enable) { 
    group_listing_pagination_enable_local_nonprim = config_node_property_boolean_parseFromJSON(group_listing_pagination_enable); //nonprimitive
    }

    // com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->group_listing_lazyloading_enable
    cJSON *group_listing_lazyloading_enable = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_group_client_impl_community_group_collection_componen_propertiesJSON, "group.listing.lazyloading.enable");
    if (cJSON_IsNull(group_listing_lazyloading_enable)) {
        group_listing_lazyloading_enable = NULL;
    }
    if (group_listing_lazyloading_enable) { 
    group_listing_lazyloading_enable_local_nonprim = config_node_property_boolean_parseFromJSON(group_listing_lazyloading_enable); //nonprimitive
    }

    // com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->page_size
    cJSON *page_size = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_group_client_impl_community_group_collection_componen_propertiesJSON, "page.size");
    if (cJSON_IsNull(page_size)) {
        page_size = NULL;
    }
    if (page_size) { 
    page_size_local_nonprim = config_node_property_integer_parseFromJSON(page_size); //nonprimitive
    }

    // com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties->priority
    cJSON *priority = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_group_client_impl_community_group_collection_componen_propertiesJSON, "priority");
    if (cJSON_IsNull(priority)) {
        priority = NULL;
    }
    if (priority) { 
    priority_local_nonprim = config_node_property_integer_parseFromJSON(priority); //nonprimitive
    }



    com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_local_var = com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_create_internal (
        group_listing_pagination_enable ? group_listing_pagination_enable_local_nonprim : NULL,
        group_listing_lazyloading_enable ? group_listing_lazyloading_enable_local_nonprim : NULL,
        page_size ? page_size_local_nonprim : NULL,
        priority ? priority_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_group_client_impl_community_group_collection_componen_properties_local_var;
end:
    if (group_listing_pagination_enable_local_nonprim) {
        config_node_property_boolean_free(group_listing_pagination_enable_local_nonprim);
        group_listing_pagination_enable_local_nonprim = NULL;
    }
    if (group_listing_lazyloading_enable_local_nonprim) {
        config_node_property_boolean_free(group_listing_lazyloading_enable_local_nonprim);
        group_listing_lazyloading_enable_local_nonprim = NULL;
    }
    if (page_size_local_nonprim) {
        config_node_property_integer_free(page_size_local_nonprim);
        page_size_local_nonprim = NULL;
    }
    if (priority_local_nonprim) {
        config_node_property_integer_free(priority_local_nonprim);
        priority_local_nonprim = NULL;
    }
    return NULL;

}
