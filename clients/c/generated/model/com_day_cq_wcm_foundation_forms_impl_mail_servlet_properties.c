#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties.h"



static com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_t *com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_create_internal(
    config_node_property_string_t *sling_servlet_resource_types,
    config_node_property_string_t *sling_servlet_selectors,
    config_node_property_array_t *resource_whitelist,
    config_node_property_string_t *resource_blacklist
    ) {
    com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_t *com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_local_var = malloc(sizeof(com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_t));
    if (!com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_local_var, 0, sizeof(com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_t));
    com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_local_var->sling_servlet_resource_types = sling_servlet_resource_types;
    com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_local_var->sling_servlet_selectors = sling_servlet_selectors;
    com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_local_var->resource_whitelist = resource_whitelist;
    com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_local_var->resource_blacklist = resource_blacklist;
    return com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_t *com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_create(
    config_node_property_string_t *sling_servlet_resource_types,
    config_node_property_string_t *sling_servlet_selectors,
    config_node_property_array_t *resource_whitelist,
    config_node_property_string_t *resource_blacklist
    ) {
    com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_t *result = com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_create_internal (
        sling_servlet_resource_types,
        sling_servlet_selectors,
        resource_whitelist,
        resource_blacklist
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_free(com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_t *com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties) {
    if(NULL == com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties){
        return ;
    }
    if(com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->sling_servlet_resource_types) {
        config_node_property_string_free(com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->sling_servlet_resource_types);
        com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->sling_servlet_resource_types = NULL;
    }
    if (com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->sling_servlet_selectors) {
        config_node_property_string_free(com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->sling_servlet_selectors);
        com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->sling_servlet_selectors = NULL;
    }
    if (com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->resource_whitelist) {
        config_node_property_array_free(com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->resource_whitelist);
        com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->resource_whitelist = NULL;
    }
    if (com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->resource_blacklist) {
        config_node_property_string_free(com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->resource_blacklist);
        com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->resource_blacklist = NULL;
    }
    free(com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties);
}

cJSON *com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_convertToJSON(com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_t *com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->sling_servlet_resource_types
    if(com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->sling_servlet_resource_types) {
    cJSON *sling_servlet_resource_types_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->sling_servlet_resource_types);
    if(sling_servlet_resource_types_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.servlet.resourceTypes", sling_servlet_resource_types_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->sling_servlet_selectors
    if(com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->sling_servlet_selectors) {
    cJSON *sling_servlet_selectors_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->sling_servlet_selectors);
    if(sling_servlet_selectors_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.servlet.selectors", sling_servlet_selectors_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->resource_whitelist
    if(com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->resource_whitelist) {
    cJSON *resource_whitelist_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->resource_whitelist);
    if(resource_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.whitelist", resource_whitelist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->resource_blacklist
    if(com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->resource_blacklist) {
    cJSON *resource_blacklist_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->resource_blacklist);
    if(resource_blacklist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.blacklist", resource_blacklist_local_JSON);
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

com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_t *com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_parseFromJSON(cJSON *com_day_cq_wcm_foundation_forms_impl_mail_servlet_propertiesJSON){

    com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_t *com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->sling_servlet_resource_types
    config_node_property_string_t *sling_servlet_resource_types_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->sling_servlet_selectors
    config_node_property_string_t *sling_servlet_selectors_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->resource_whitelist
    config_node_property_array_t *resource_whitelist_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->resource_blacklist
    config_node_property_string_t *resource_blacklist_local_nonprim = NULL;

    // com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->sling_servlet_resource_types
    cJSON *sling_servlet_resource_types = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_foundation_forms_impl_mail_servlet_propertiesJSON, "sling.servlet.resourceTypes");
    if (cJSON_IsNull(sling_servlet_resource_types)) {
        sling_servlet_resource_types = NULL;
    }
    if (sling_servlet_resource_types) { 
    sling_servlet_resource_types_local_nonprim = config_node_property_string_parseFromJSON(sling_servlet_resource_types); //nonprimitive
    }

    // com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->sling_servlet_selectors
    cJSON *sling_servlet_selectors = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_foundation_forms_impl_mail_servlet_propertiesJSON, "sling.servlet.selectors");
    if (cJSON_IsNull(sling_servlet_selectors)) {
        sling_servlet_selectors = NULL;
    }
    if (sling_servlet_selectors) { 
    sling_servlet_selectors_local_nonprim = config_node_property_string_parseFromJSON(sling_servlet_selectors); //nonprimitive
    }

    // com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->resource_whitelist
    cJSON *resource_whitelist = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_foundation_forms_impl_mail_servlet_propertiesJSON, "resource.whitelist");
    if (cJSON_IsNull(resource_whitelist)) {
        resource_whitelist = NULL;
    }
    if (resource_whitelist) { 
    resource_whitelist_local_nonprim = config_node_property_array_parseFromJSON(resource_whitelist); //nonprimitive
    }

    // com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties->resource_blacklist
    cJSON *resource_blacklist = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_foundation_forms_impl_mail_servlet_propertiesJSON, "resource.blacklist");
    if (cJSON_IsNull(resource_blacklist)) {
        resource_blacklist = NULL;
    }
    if (resource_blacklist) { 
    resource_blacklist_local_nonprim = config_node_property_string_parseFromJSON(resource_blacklist); //nonprimitive
    }



    com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_local_var = com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_create_internal (
        sling_servlet_resource_types ? sling_servlet_resource_types_local_nonprim : NULL,
        sling_servlet_selectors ? sling_servlet_selectors_local_nonprim : NULL,
        resource_whitelist ? resource_whitelist_local_nonprim : NULL,
        resource_blacklist ? resource_blacklist_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_foundation_forms_impl_mail_servlet_properties_local_var;
end:
    if (sling_servlet_resource_types_local_nonprim) {
        config_node_property_string_free(sling_servlet_resource_types_local_nonprim);
        sling_servlet_resource_types_local_nonprim = NULL;
    }
    if (sling_servlet_selectors_local_nonprim) {
        config_node_property_string_free(sling_servlet_selectors_local_nonprim);
        sling_servlet_selectors_local_nonprim = NULL;
    }
    if (resource_whitelist_local_nonprim) {
        config_node_property_array_free(resource_whitelist_local_nonprim);
        resource_whitelist_local_nonprim = NULL;
    }
    if (resource_blacklist_local_nonprim) {
        config_node_property_string_free(resource_blacklist_local_nonprim);
        resource_blacklist_local_nonprim = NULL;
    }
    return NULL;

}
