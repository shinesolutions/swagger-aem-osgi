#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_tenant_internal_tenant_provider_impl_properties.h"



static org_apache_sling_tenant_internal_tenant_provider_impl_properties_t *org_apache_sling_tenant_internal_tenant_provider_impl_properties_create_internal(
    config_node_property_string_t *tenant_root,
    config_node_property_array_t *tenant_path_matcher
    ) {
    org_apache_sling_tenant_internal_tenant_provider_impl_properties_t *org_apache_sling_tenant_internal_tenant_provider_impl_properties_local_var = malloc(sizeof(org_apache_sling_tenant_internal_tenant_provider_impl_properties_t));
    if (!org_apache_sling_tenant_internal_tenant_provider_impl_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_tenant_internal_tenant_provider_impl_properties_local_var, 0, sizeof(org_apache_sling_tenant_internal_tenant_provider_impl_properties_t));
    org_apache_sling_tenant_internal_tenant_provider_impl_properties_local_var->_library_owned = 1;
    org_apache_sling_tenant_internal_tenant_provider_impl_properties_local_var->tenant_root = tenant_root;
    org_apache_sling_tenant_internal_tenant_provider_impl_properties_local_var->tenant_path_matcher = tenant_path_matcher;
    return org_apache_sling_tenant_internal_tenant_provider_impl_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_tenant_internal_tenant_provider_impl_properties_t *org_apache_sling_tenant_internal_tenant_provider_impl_properties_create(
    config_node_property_string_t *tenant_root,
    config_node_property_array_t *tenant_path_matcher
    ) {
    org_apache_sling_tenant_internal_tenant_provider_impl_properties_t *result = org_apache_sling_tenant_internal_tenant_provider_impl_properties_create_internal (
        tenant_root,
        tenant_path_matcher
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_tenant_internal_tenant_provider_impl_properties_free(org_apache_sling_tenant_internal_tenant_provider_impl_properties_t *org_apache_sling_tenant_internal_tenant_provider_impl_properties) {
    if(NULL == org_apache_sling_tenant_internal_tenant_provider_impl_properties){
        return ;
    }
    if(org_apache_sling_tenant_internal_tenant_provider_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_tenant_internal_tenant_provider_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_tenant_internal_tenant_provider_impl_properties->tenant_root) {
        config_node_property_string_free(org_apache_sling_tenant_internal_tenant_provider_impl_properties->tenant_root);
        org_apache_sling_tenant_internal_tenant_provider_impl_properties->tenant_root = NULL;
    }
    if (org_apache_sling_tenant_internal_tenant_provider_impl_properties->tenant_path_matcher) {
        config_node_property_array_free(org_apache_sling_tenant_internal_tenant_provider_impl_properties->tenant_path_matcher);
        org_apache_sling_tenant_internal_tenant_provider_impl_properties->tenant_path_matcher = NULL;
    }
    free(org_apache_sling_tenant_internal_tenant_provider_impl_properties);
}

cJSON *org_apache_sling_tenant_internal_tenant_provider_impl_properties_convertToJSON(org_apache_sling_tenant_internal_tenant_provider_impl_properties_t *org_apache_sling_tenant_internal_tenant_provider_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_tenant_internal_tenant_provider_impl_properties->tenant_root
    if(org_apache_sling_tenant_internal_tenant_provider_impl_properties->tenant_root) {
    cJSON *tenant_root_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_tenant_internal_tenant_provider_impl_properties->tenant_root);
    if(tenant_root_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tenant.root", tenant_root_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_tenant_internal_tenant_provider_impl_properties->tenant_path_matcher
    if(org_apache_sling_tenant_internal_tenant_provider_impl_properties->tenant_path_matcher) {
    cJSON *tenant_path_matcher_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_tenant_internal_tenant_provider_impl_properties->tenant_path_matcher);
    if(tenant_path_matcher_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tenant.path.matcher", tenant_path_matcher_local_JSON);
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

org_apache_sling_tenant_internal_tenant_provider_impl_properties_t *org_apache_sling_tenant_internal_tenant_provider_impl_properties_parseFromJSON(cJSON *org_apache_sling_tenant_internal_tenant_provider_impl_propertiesJSON){

    org_apache_sling_tenant_internal_tenant_provider_impl_properties_t *org_apache_sling_tenant_internal_tenant_provider_impl_properties_local_var = NULL;

    // define the local variable for org_apache_sling_tenant_internal_tenant_provider_impl_properties->tenant_root
    config_node_property_string_t *tenant_root_local_nonprim = NULL;

    // define the local variable for org_apache_sling_tenant_internal_tenant_provider_impl_properties->tenant_path_matcher
    config_node_property_array_t *tenant_path_matcher_local_nonprim = NULL;

    // org_apache_sling_tenant_internal_tenant_provider_impl_properties->tenant_root
    cJSON *tenant_root = cJSON_GetObjectItemCaseSensitive(org_apache_sling_tenant_internal_tenant_provider_impl_propertiesJSON, "tenant.root");
    if (cJSON_IsNull(tenant_root)) {
        tenant_root = NULL;
    }
    if (tenant_root) { 
    tenant_root_local_nonprim = config_node_property_string_parseFromJSON(tenant_root); //nonprimitive
    }

    // org_apache_sling_tenant_internal_tenant_provider_impl_properties->tenant_path_matcher
    cJSON *tenant_path_matcher = cJSON_GetObjectItemCaseSensitive(org_apache_sling_tenant_internal_tenant_provider_impl_propertiesJSON, "tenant.path.matcher");
    if (cJSON_IsNull(tenant_path_matcher)) {
        tenant_path_matcher = NULL;
    }
    if (tenant_path_matcher) { 
    tenant_path_matcher_local_nonprim = config_node_property_array_parseFromJSON(tenant_path_matcher); //nonprimitive
    }



    org_apache_sling_tenant_internal_tenant_provider_impl_properties_local_var = org_apache_sling_tenant_internal_tenant_provider_impl_properties_create_internal (
        tenant_root ? tenant_root_local_nonprim : NULL,
        tenant_path_matcher ? tenant_path_matcher_local_nonprim : NULL
        );

    if (!org_apache_sling_tenant_internal_tenant_provider_impl_properties_local_var) {
        goto end;
    }

    return org_apache_sling_tenant_internal_tenant_provider_impl_properties_local_var;
end:
    if (tenant_root_local_nonprim) {
        config_node_property_string_free(tenant_root_local_nonprim);
        tenant_root_local_nonprim = NULL;
    }
    if (tenant_path_matcher_local_nonprim) {
        config_node_property_array_free(tenant_path_matcher_local_nonprim);
        tenant_path_matcher_local_nonprim = NULL;
    }
    return NULL;

}
