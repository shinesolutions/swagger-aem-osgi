#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties.h"



static org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_t *org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_create_internal(
    config_node_property_string_t *home_path
    ) {
    org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_t *org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_local_var = malloc(sizeof(org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_t));
    if (!org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_local_var, 0, sizeof(org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_t));
    org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_local_var->home_path = home_path;
    return org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_t *org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_create(
    config_node_property_string_t *home_path
    ) {
    org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_t *result = org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_create_internal (
        home_path
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_free(org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_t *org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties) {
    if(NULL == org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties){
        return ;
    }
    if(org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties->home_path) {
        config_node_property_string_free(org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties->home_path);
        org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties->home_path = NULL;
    }
    free(org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties);
}

cJSON *org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_convertToJSON(org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_t *org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties->home_path
    if(org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties->home_path) {
    cJSON *home_path_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties->home_path);
    if(home_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "homePath", home_path_local_JSON);
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

org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_t *org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_parseFromJSON(cJSON *org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_propertiesJSON){

    org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_t *org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties->home_path
    config_node_property_string_t *home_path_local_nonprim = NULL;

    // org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties->home_path
    cJSON *home_path = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_propertiesJSON, "homePath");
    if (cJSON_IsNull(home_path)) {
        home_path = NULL;
    }
    if (home_path) { 
    home_path_local_nonprim = config_node_property_string_parseFromJSON(home_path); //nonprimitive
    }



    org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_local_var = org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_create_internal (
        home_path ? home_path_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties_local_var;
end:
    if (home_path_local_nonprim) {
        config_node_property_string_free(home_path_local_nonprim);
        home_path_local_nonprim = NULL;
    }
    return NULL;

}
