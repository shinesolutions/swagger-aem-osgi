#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties.h"



static org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_t *org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_create_internal(
    config_node_property_string_t *path,
    config_node_property_string_t *checkpath_prefix,
    config_node_property_string_t *jcr_path
    ) {
    org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_t *org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_local_var = malloc(sizeof(org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_t));
    if (!org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_local_var, 0, sizeof(org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_t));
    org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_local_var->_library_owned = 1;
    org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_local_var->path = path;
    org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_local_var->checkpath_prefix = checkpath_prefix;
    org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_local_var->jcr_path = jcr_path;
    return org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_t *org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_create(
    config_node_property_string_t *path,
    config_node_property_string_t *checkpath_prefix,
    config_node_property_string_t *jcr_path
    ) {
    org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_t *result = org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_create_internal (
        path,
        checkpath_prefix,
        jcr_path
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_free(org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_t *org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties) {
    if(NULL == org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties){
        return ;
    }
    if(org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->path) {
        config_node_property_string_free(org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->path);
        org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->path = NULL;
    }
    if (org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->checkpath_prefix) {
        config_node_property_string_free(org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->checkpath_prefix);
        org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->checkpath_prefix = NULL;
    }
    if (org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->jcr_path) {
        config_node_property_string_free(org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->jcr_path);
        org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->jcr_path = NULL;
    }
    free(org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties);
}

cJSON *org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_convertToJSON(org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_t *org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->path
    if(org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->path) {
    cJSON *path_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->path);
    if(path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "path", path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->checkpath_prefix
    if(org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->checkpath_prefix) {
    cJSON *checkpath_prefix_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->checkpath_prefix);
    if(checkpath_prefix_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "checkpath.prefix", checkpath_prefix_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->jcr_path
    if(org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->jcr_path) {
    cJSON *jcr_path_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->jcr_path);
    if(jcr_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jcrPath", jcr_path_local_JSON);
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

org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_t *org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_parseFromJSON(cJSON *org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_propertiesJSON){

    org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_t *org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_local_var = NULL;

    // define the local variable for org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->path
    config_node_property_string_t *path_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->checkpath_prefix
    config_node_property_string_t *checkpath_prefix_local_nonprim = NULL;

    // define the local variable for org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->jcr_path
    config_node_property_string_t *jcr_path_local_nonprim = NULL;

    // org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->path
    cJSON *path = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_propertiesJSON, "path");
    if (cJSON_IsNull(path)) {
        path = NULL;
    }
    if (path) { 
    path_local_nonprim = config_node_property_string_parseFromJSON(path); //nonprimitive
    }

    // org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->checkpath_prefix
    cJSON *checkpath_prefix = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_propertiesJSON, "checkpath.prefix");
    if (cJSON_IsNull(checkpath_prefix)) {
        checkpath_prefix = NULL;
    }
    if (checkpath_prefix) { 
    checkpath_prefix_local_nonprim = config_node_property_string_parseFromJSON(checkpath_prefix); //nonprimitive
    }

    // org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties->jcr_path
    cJSON *jcr_path = cJSON_GetObjectItemCaseSensitive(org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_propertiesJSON, "jcrPath");
    if (cJSON_IsNull(jcr_path)) {
        jcr_path = NULL;
    }
    if (jcr_path) { 
    jcr_path_local_nonprim = config_node_property_string_parseFromJSON(jcr_path); //nonprimitive
    }



    org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_local_var = org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_create_internal (
        path ? path_local_nonprim : NULL,
        checkpath_prefix ? checkpath_prefix_local_nonprim : NULL,
        jcr_path ? jcr_path_local_nonprim : NULL
        );

    if (!org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_local_var) {
        goto end;
    }

    return org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties_local_var;
end:
    if (path_local_nonprim) {
        config_node_property_string_free(path_local_nonprim);
        path_local_nonprim = NULL;
    }
    if (checkpath_prefix_local_nonprim) {
        config_node_property_string_free(checkpath_prefix_local_nonprim);
        checkpath_prefix_local_nonprim = NULL;
    }
    if (jcr_path_local_nonprim) {
        config_node_property_string_free(jcr_path_local_nonprim);
        jcr_path_local_nonprim = NULL;
    }
    return NULL;

}
