#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties.h"



static org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_t *org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_create_internal(
    config_node_property_array_t *package_roots
    ) {
    org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_t *org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_local_var = malloc(sizeof(org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_t));
    if (!org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_local_var, 0, sizeof(org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_t));
    org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_local_var->package_roots = package_roots;
    return org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_t *org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_create(
    config_node_property_array_t *package_roots
    ) {
    org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_t *result = org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_create_internal (
        package_roots
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_free(org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_t *org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties) {
    if(NULL == org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties){
        return ;
    }
    if(org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties->package_roots) {
        config_node_property_array_free(org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties->package_roots);
        org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties->package_roots = NULL;
    }
    free(org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties);
}

cJSON *org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_convertToJSON(org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_t *org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties->package_roots
    if(org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties->package_roots) {
    cJSON *package_roots_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties->package_roots);
    if(package_roots_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "packageRoots", package_roots_local_JSON);
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

org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_t *org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_parseFromJSON(cJSON *org_apache_jackrabbit_vault_packaging_impl_packaging_impl_propertiesJSON){

    org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_t *org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties->package_roots
    config_node_property_array_t *package_roots_local_nonprim = NULL;

    // org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties->package_roots
    cJSON *package_roots = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_vault_packaging_impl_packaging_impl_propertiesJSON, "packageRoots");
    if (cJSON_IsNull(package_roots)) {
        package_roots = NULL;
    }
    if (package_roots) { 
    package_roots_local_nonprim = config_node_property_array_parseFromJSON(package_roots); //nonprimitive
    }



    org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_local_var = org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_create_internal (
        package_roots ? package_roots_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties_local_var;
end:
    if (package_roots_local_nonprim) {
        config_node_property_array_free(package_roots_local_nonprim);
        package_roots_local_nonprim = NULL;
    }
    return NULL;

}
