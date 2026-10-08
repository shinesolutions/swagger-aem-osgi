#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_auth_core_impl_logout_servlet_properties.h"



static org_apache_sling_auth_core_impl_logout_servlet_properties_t *org_apache_sling_auth_core_impl_logout_servlet_properties_create_internal(
    config_node_property_array_t *sling_servlet_methods,
    config_node_property_string_t *sling_servlet_paths
    ) {
    org_apache_sling_auth_core_impl_logout_servlet_properties_t *org_apache_sling_auth_core_impl_logout_servlet_properties_local_var = malloc(sizeof(org_apache_sling_auth_core_impl_logout_servlet_properties_t));
    if (!org_apache_sling_auth_core_impl_logout_servlet_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_auth_core_impl_logout_servlet_properties_local_var, 0, sizeof(org_apache_sling_auth_core_impl_logout_servlet_properties_t));
    org_apache_sling_auth_core_impl_logout_servlet_properties_local_var->_library_owned = 1;
    org_apache_sling_auth_core_impl_logout_servlet_properties_local_var->sling_servlet_methods = sling_servlet_methods;
    org_apache_sling_auth_core_impl_logout_servlet_properties_local_var->sling_servlet_paths = sling_servlet_paths;
    return org_apache_sling_auth_core_impl_logout_servlet_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_auth_core_impl_logout_servlet_properties_t *org_apache_sling_auth_core_impl_logout_servlet_properties_create(
    config_node_property_array_t *sling_servlet_methods,
    config_node_property_string_t *sling_servlet_paths
    ) {
    org_apache_sling_auth_core_impl_logout_servlet_properties_t *result = org_apache_sling_auth_core_impl_logout_servlet_properties_create_internal (
        sling_servlet_methods,
        sling_servlet_paths
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_auth_core_impl_logout_servlet_properties_free(org_apache_sling_auth_core_impl_logout_servlet_properties_t *org_apache_sling_auth_core_impl_logout_servlet_properties) {
    if(NULL == org_apache_sling_auth_core_impl_logout_servlet_properties){
        return ;
    }
    if(org_apache_sling_auth_core_impl_logout_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_auth_core_impl_logout_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_auth_core_impl_logout_servlet_properties->sling_servlet_methods) {
        config_node_property_array_free(org_apache_sling_auth_core_impl_logout_servlet_properties->sling_servlet_methods);
        org_apache_sling_auth_core_impl_logout_servlet_properties->sling_servlet_methods = NULL;
    }
    if (org_apache_sling_auth_core_impl_logout_servlet_properties->sling_servlet_paths) {
        config_node_property_string_free(org_apache_sling_auth_core_impl_logout_servlet_properties->sling_servlet_paths);
        org_apache_sling_auth_core_impl_logout_servlet_properties->sling_servlet_paths = NULL;
    }
    free(org_apache_sling_auth_core_impl_logout_servlet_properties);
}

cJSON *org_apache_sling_auth_core_impl_logout_servlet_properties_convertToJSON(org_apache_sling_auth_core_impl_logout_servlet_properties_t *org_apache_sling_auth_core_impl_logout_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_auth_core_impl_logout_servlet_properties->sling_servlet_methods
    if(org_apache_sling_auth_core_impl_logout_servlet_properties->sling_servlet_methods) {
    cJSON *sling_servlet_methods_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_auth_core_impl_logout_servlet_properties->sling_servlet_methods);
    if(sling_servlet_methods_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.servlet.methods", sling_servlet_methods_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_auth_core_impl_logout_servlet_properties->sling_servlet_paths
    if(org_apache_sling_auth_core_impl_logout_servlet_properties->sling_servlet_paths) {
    cJSON *sling_servlet_paths_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_auth_core_impl_logout_servlet_properties->sling_servlet_paths);
    if(sling_servlet_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.servlet.paths", sling_servlet_paths_local_JSON);
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

org_apache_sling_auth_core_impl_logout_servlet_properties_t *org_apache_sling_auth_core_impl_logout_servlet_properties_parseFromJSON(cJSON *org_apache_sling_auth_core_impl_logout_servlet_propertiesJSON){

    org_apache_sling_auth_core_impl_logout_servlet_properties_t *org_apache_sling_auth_core_impl_logout_servlet_properties_local_var = NULL;

    // define the local variable for org_apache_sling_auth_core_impl_logout_servlet_properties->sling_servlet_methods
    config_node_property_array_t *sling_servlet_methods_local_nonprim = NULL;

    // define the local variable for org_apache_sling_auth_core_impl_logout_servlet_properties->sling_servlet_paths
    config_node_property_string_t *sling_servlet_paths_local_nonprim = NULL;

    // org_apache_sling_auth_core_impl_logout_servlet_properties->sling_servlet_methods
    cJSON *sling_servlet_methods = cJSON_GetObjectItemCaseSensitive(org_apache_sling_auth_core_impl_logout_servlet_propertiesJSON, "sling.servlet.methods");
    if (cJSON_IsNull(sling_servlet_methods)) {
        sling_servlet_methods = NULL;
    }
    if (sling_servlet_methods) { 
    sling_servlet_methods_local_nonprim = config_node_property_array_parseFromJSON(sling_servlet_methods); //nonprimitive
    }

    // org_apache_sling_auth_core_impl_logout_servlet_properties->sling_servlet_paths
    cJSON *sling_servlet_paths = cJSON_GetObjectItemCaseSensitive(org_apache_sling_auth_core_impl_logout_servlet_propertiesJSON, "sling.servlet.paths");
    if (cJSON_IsNull(sling_servlet_paths)) {
        sling_servlet_paths = NULL;
    }
    if (sling_servlet_paths) { 
    sling_servlet_paths_local_nonprim = config_node_property_string_parseFromJSON(sling_servlet_paths); //nonprimitive
    }



    org_apache_sling_auth_core_impl_logout_servlet_properties_local_var = org_apache_sling_auth_core_impl_logout_servlet_properties_create_internal (
        sling_servlet_methods ? sling_servlet_methods_local_nonprim : NULL,
        sling_servlet_paths ? sling_servlet_paths_local_nonprim : NULL
        );

    if (!org_apache_sling_auth_core_impl_logout_servlet_properties_local_var) {
        goto end;
    }

    return org_apache_sling_auth_core_impl_logout_servlet_properties_local_var;
end:
    if (sling_servlet_methods_local_nonprim) {
        config_node_property_array_free(sling_servlet_methods_local_nonprim);
        sling_servlet_methods_local_nonprim = NULL;
    }
    if (sling_servlet_paths_local_nonprim) {
        config_node_property_string_free(sling_servlet_paths_local_nonprim);
        sling_servlet_paths_local_nonprim = NULL;
    }
    return NULL;

}
