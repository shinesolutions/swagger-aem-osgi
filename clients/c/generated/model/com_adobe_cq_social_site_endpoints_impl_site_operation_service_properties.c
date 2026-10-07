#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties.h"



static com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_t *com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_create_internal(
    config_node_property_array_t *field_whitelist,
    config_node_property_array_t *site_path_filters,
    config_node_property_string_t *site_package_group
    ) {
    com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_t *com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_local_var = malloc(sizeof(com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_t));
    if (!com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_local_var, 0, sizeof(com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_t));
    com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_local_var->field_whitelist = field_whitelist;
    com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_local_var->site_path_filters = site_path_filters;
    com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_local_var->site_package_group = site_package_group;
    return com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_t *com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_create(
    config_node_property_array_t *field_whitelist,
    config_node_property_array_t *site_path_filters,
    config_node_property_string_t *site_package_group
    ) {
    com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_t *result = com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_create_internal (
        field_whitelist,
        site_path_filters,
        site_package_group
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_free(com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_t *com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties) {
    if(NULL == com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties){
        return ;
    }
    if(com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->field_whitelist) {
        config_node_property_array_free(com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->field_whitelist);
        com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->field_whitelist = NULL;
    }
    if (com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->site_path_filters) {
        config_node_property_array_free(com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->site_path_filters);
        com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->site_path_filters = NULL;
    }
    if (com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->site_package_group) {
        config_node_property_string_free(com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->site_package_group);
        com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->site_package_group = NULL;
    }
    free(com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties);
}

cJSON *com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_convertToJSON(com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_t *com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->field_whitelist
    if(com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->field_whitelist) {
    cJSON *field_whitelist_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->field_whitelist);
    if(field_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "fieldWhitelist", field_whitelist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->site_path_filters
    if(com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->site_path_filters) {
    cJSON *site_path_filters_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->site_path_filters);
    if(site_path_filters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sitePathFilters", site_path_filters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->site_package_group
    if(com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->site_package_group) {
    cJSON *site_package_group_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->site_package_group);
    if(site_package_group_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sitePackageGroup", site_package_group_local_JSON);
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

com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_t *com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_parseFromJSON(cJSON *com_adobe_cq_social_site_endpoints_impl_site_operation_service_propertiesJSON){

    com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_t *com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->field_whitelist
    config_node_property_array_t *field_whitelist_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->site_path_filters
    config_node_property_array_t *site_path_filters_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->site_package_group
    config_node_property_string_t *site_package_group_local_nonprim = NULL;

    // com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->field_whitelist
    cJSON *field_whitelist = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_site_endpoints_impl_site_operation_service_propertiesJSON, "fieldWhitelist");
    if (cJSON_IsNull(field_whitelist)) {
        field_whitelist = NULL;
    }
    if (field_whitelist) { 
    field_whitelist_local_nonprim = config_node_property_array_parseFromJSON(field_whitelist); //nonprimitive
    }

    // com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->site_path_filters
    cJSON *site_path_filters = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_site_endpoints_impl_site_operation_service_propertiesJSON, "sitePathFilters");
    if (cJSON_IsNull(site_path_filters)) {
        site_path_filters = NULL;
    }
    if (site_path_filters) { 
    site_path_filters_local_nonprim = config_node_property_array_parseFromJSON(site_path_filters); //nonprimitive
    }

    // com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties->site_package_group
    cJSON *site_package_group = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_site_endpoints_impl_site_operation_service_propertiesJSON, "sitePackageGroup");
    if (cJSON_IsNull(site_package_group)) {
        site_package_group = NULL;
    }
    if (site_package_group) { 
    site_package_group_local_nonprim = config_node_property_string_parseFromJSON(site_package_group); //nonprimitive
    }



    com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_local_var = com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_create_internal (
        field_whitelist ? field_whitelist_local_nonprim : NULL,
        site_path_filters ? site_path_filters_local_nonprim : NULL,
        site_package_group ? site_package_group_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties_local_var;
end:
    if (field_whitelist_local_nonprim) {
        config_node_property_array_free(field_whitelist_local_nonprim);
        field_whitelist_local_nonprim = NULL;
    }
    if (site_path_filters_local_nonprim) {
        config_node_property_array_free(site_path_filters_local_nonprim);
        site_path_filters_local_nonprim = NULL;
    }
    if (site_package_group_local_nonprim) {
        config_node_property_string_free(site_package_group_local_nonprim);
        site_package_group_local_nonprim = NULL;
    }
    return NULL;

}
