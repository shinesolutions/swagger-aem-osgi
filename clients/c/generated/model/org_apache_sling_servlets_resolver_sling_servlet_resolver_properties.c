#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_servlets_resolver_sling_servlet_resolver_properties.h"



static org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_t *org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_create_internal(
    config_node_property_string_t *servletresolver_servlet_root,
    config_node_property_integer_t *servletresolver_cache_size,
    config_node_property_array_t *servletresolver_paths,
    config_node_property_array_t *servletresolver_default_extensions
    ) {
    org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_t *org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_local_var = malloc(sizeof(org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_t));
    if (!org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_local_var, 0, sizeof(org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_t));
    org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_local_var->_library_owned = 1;
    org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_local_var->servletresolver_servlet_root = servletresolver_servlet_root;
    org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_local_var->servletresolver_cache_size = servletresolver_cache_size;
    org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_local_var->servletresolver_paths = servletresolver_paths;
    org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_local_var->servletresolver_default_extensions = servletresolver_default_extensions;
    return org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_t *org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_create(
    config_node_property_string_t *servletresolver_servlet_root,
    config_node_property_integer_t *servletresolver_cache_size,
    config_node_property_array_t *servletresolver_paths,
    config_node_property_array_t *servletresolver_default_extensions
    ) {
    org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_t *result = org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_create_internal (
        servletresolver_servlet_root,
        servletresolver_cache_size,
        servletresolver_paths,
        servletresolver_default_extensions
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_free(org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_t *org_apache_sling_servlets_resolver_sling_servlet_resolver_properties) {
    if(NULL == org_apache_sling_servlets_resolver_sling_servlet_resolver_properties){
        return ;
    }
    if(org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_servlet_root) {
        config_node_property_string_free(org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_servlet_root);
        org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_servlet_root = NULL;
    }
    if (org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_cache_size) {
        config_node_property_integer_free(org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_cache_size);
        org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_cache_size = NULL;
    }
    if (org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_paths) {
        config_node_property_array_free(org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_paths);
        org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_paths = NULL;
    }
    if (org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_default_extensions) {
        config_node_property_array_free(org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_default_extensions);
        org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_default_extensions = NULL;
    }
    free(org_apache_sling_servlets_resolver_sling_servlet_resolver_properties);
}

cJSON *org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_convertToJSON(org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_t *org_apache_sling_servlets_resolver_sling_servlet_resolver_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_servlet_root
    if(org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_servlet_root) {
    cJSON *servletresolver_servlet_root_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_servlet_root);
    if(servletresolver_servlet_root_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "servletresolver.servletRoot", servletresolver_servlet_root_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_cache_size
    if(org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_cache_size) {
    cJSON *servletresolver_cache_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_cache_size);
    if(servletresolver_cache_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "servletresolver.cacheSize", servletresolver_cache_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_paths
    if(org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_paths) {
    cJSON *servletresolver_paths_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_paths);
    if(servletresolver_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "servletresolver.paths", servletresolver_paths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_default_extensions
    if(org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_default_extensions) {
    cJSON *servletresolver_default_extensions_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_default_extensions);
    if(servletresolver_default_extensions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "servletresolver.defaultExtensions", servletresolver_default_extensions_local_JSON);
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

org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_t *org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_parseFromJSON(cJSON *org_apache_sling_servlets_resolver_sling_servlet_resolver_propertiesJSON){

    org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_t *org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_local_var = NULL;

    // define the local variable for org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_servlet_root
    config_node_property_string_t *servletresolver_servlet_root_local_nonprim = NULL;

    // define the local variable for org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_cache_size
    config_node_property_integer_t *servletresolver_cache_size_local_nonprim = NULL;

    // define the local variable for org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_paths
    config_node_property_array_t *servletresolver_paths_local_nonprim = NULL;

    // define the local variable for org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_default_extensions
    config_node_property_array_t *servletresolver_default_extensions_local_nonprim = NULL;

    // org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_servlet_root
    cJSON *servletresolver_servlet_root = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_resolver_sling_servlet_resolver_propertiesJSON, "servletresolver.servletRoot");
    if (cJSON_IsNull(servletresolver_servlet_root)) {
        servletresolver_servlet_root = NULL;
    }
    if (servletresolver_servlet_root) { 
    servletresolver_servlet_root_local_nonprim = config_node_property_string_parseFromJSON(servletresolver_servlet_root); //nonprimitive
    }

    // org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_cache_size
    cJSON *servletresolver_cache_size = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_resolver_sling_servlet_resolver_propertiesJSON, "servletresolver.cacheSize");
    if (cJSON_IsNull(servletresolver_cache_size)) {
        servletresolver_cache_size = NULL;
    }
    if (servletresolver_cache_size) { 
    servletresolver_cache_size_local_nonprim = config_node_property_integer_parseFromJSON(servletresolver_cache_size); //nonprimitive
    }

    // org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_paths
    cJSON *servletresolver_paths = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_resolver_sling_servlet_resolver_propertiesJSON, "servletresolver.paths");
    if (cJSON_IsNull(servletresolver_paths)) {
        servletresolver_paths = NULL;
    }
    if (servletresolver_paths) { 
    servletresolver_paths_local_nonprim = config_node_property_array_parseFromJSON(servletresolver_paths); //nonprimitive
    }

    // org_apache_sling_servlets_resolver_sling_servlet_resolver_properties->servletresolver_default_extensions
    cJSON *servletresolver_default_extensions = cJSON_GetObjectItemCaseSensitive(org_apache_sling_servlets_resolver_sling_servlet_resolver_propertiesJSON, "servletresolver.defaultExtensions");
    if (cJSON_IsNull(servletresolver_default_extensions)) {
        servletresolver_default_extensions = NULL;
    }
    if (servletresolver_default_extensions) { 
    servletresolver_default_extensions_local_nonprim = config_node_property_array_parseFromJSON(servletresolver_default_extensions); //nonprimitive
    }



    org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_local_var = org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_create_internal (
        servletresolver_servlet_root ? servletresolver_servlet_root_local_nonprim : NULL,
        servletresolver_cache_size ? servletresolver_cache_size_local_nonprim : NULL,
        servletresolver_paths ? servletresolver_paths_local_nonprim : NULL,
        servletresolver_default_extensions ? servletresolver_default_extensions_local_nonprim : NULL
        );

    if (!org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_local_var) {
        goto end;
    }

    return org_apache_sling_servlets_resolver_sling_servlet_resolver_properties_local_var;
end:
    if (servletresolver_servlet_root_local_nonprim) {
        config_node_property_string_free(servletresolver_servlet_root_local_nonprim);
        servletresolver_servlet_root_local_nonprim = NULL;
    }
    if (servletresolver_cache_size_local_nonprim) {
        config_node_property_integer_free(servletresolver_cache_size_local_nonprim);
        servletresolver_cache_size_local_nonprim = NULL;
    }
    if (servletresolver_paths_local_nonprim) {
        config_node_property_array_free(servletresolver_paths_local_nonprim);
        servletresolver_paths_local_nonprim = NULL;
    }
    if (servletresolver_default_extensions_local_nonprim) {
        config_node_property_array_free(servletresolver_default_extensions_local_nonprim);
        servletresolver_default_extensions_local_nonprim = NULL;
    }
    return NULL;

}
