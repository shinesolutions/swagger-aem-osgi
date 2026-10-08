#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties.h"



static com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_t *com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_create_internal(
    config_node_property_boolean_t *cache_enable,
    config_node_property_array_t *cache_root_paths,
    config_node_property_integer_t *cache_max_size,
    config_node_property_integer_t *cache_max_entries
    ) {
    com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_t *com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_local_var = malloc(sizeof(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_t));
    if (!com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_local_var, 0, sizeof(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_t));
    com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_local_var->_library_owned = 1;
    com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_local_var->cache_enable = cache_enable;
    com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_local_var->cache_root_paths = cache_root_paths;
    com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_local_var->cache_max_size = cache_max_size;
    com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_local_var->cache_max_entries = cache_max_entries;
    return com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_t *com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_create(
    config_node_property_boolean_t *cache_enable,
    config_node_property_array_t *cache_root_paths,
    config_node_property_integer_t *cache_max_size,
    config_node_property_integer_t *cache_max_entries
    ) {
    com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_t *result = com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_create_internal (
        cache_enable,
        cache_root_paths,
        cache_max_size,
        cache_max_entries
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_free(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_t *com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties) {
    if(NULL == com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties){
        return ;
    }
    if(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_enable) {
        config_node_property_boolean_free(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_enable);
        com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_enable = NULL;
    }
    if (com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_root_paths) {
        config_node_property_array_free(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_root_paths);
        com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_root_paths = NULL;
    }
    if (com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_max_size) {
        config_node_property_integer_free(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_max_size);
        com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_max_size = NULL;
    }
    if (com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_max_entries) {
        config_node_property_integer_free(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_max_entries);
        com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_max_entries = NULL;
    }
    free(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties);
}

cJSON *com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_convertToJSON(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_t *com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_enable
    if(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_enable) {
    cJSON *cache_enable_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_enable);
    if(cache_enable_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cache.enable", cache_enable_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_root_paths
    if(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_root_paths) {
    cJSON *cache_root_paths_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_root_paths);
    if(cache_root_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cache.rootPaths", cache_root_paths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_max_size
    if(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_max_size) {
    cJSON *cache_max_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_max_size);
    if(cache_max_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cache.maxSize", cache_max_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_max_entries
    if(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_max_entries) {
    cJSON *cache_max_entries_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_max_entries);
    if(cache_max_entries_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cache.maxEntries", cache_max_entries_local_JSON);
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

com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_t *com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_parseFromJSON(cJSON *com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_propertiesJSON){

    com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_t *com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_enable
    config_node_property_boolean_t *cache_enable_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_root_paths
    config_node_property_array_t *cache_root_paths_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_max_size
    config_node_property_integer_t *cache_max_size_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_max_entries
    config_node_property_integer_t *cache_max_entries_local_nonprim = NULL;

    // com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_enable
    cJSON *cache_enable = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_propertiesJSON, "cache.enable");
    if (cJSON_IsNull(cache_enable)) {
        cache_enable = NULL;
    }
    if (cache_enable) { 
    cache_enable_local_nonprim = config_node_property_boolean_parseFromJSON(cache_enable); //nonprimitive
    }

    // com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_root_paths
    cJSON *cache_root_paths = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_propertiesJSON, "cache.rootPaths");
    if (cJSON_IsNull(cache_root_paths)) {
        cache_root_paths = NULL;
    }
    if (cache_root_paths) { 
    cache_root_paths_local_nonprim = config_node_property_array_parseFromJSON(cache_root_paths); //nonprimitive
    }

    // com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_max_size
    cJSON *cache_max_size = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_propertiesJSON, "cache.maxSize");
    if (cJSON_IsNull(cache_max_size)) {
        cache_max_size = NULL;
    }
    if (cache_max_size) { 
    cache_max_size_local_nonprim = config_node_property_integer_parseFromJSON(cache_max_size); //nonprimitive
    }

    // com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties->cache_max_entries
    cJSON *cache_max_entries = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_propertiesJSON, "cache.maxEntries");
    if (cJSON_IsNull(cache_max_entries)) {
        cache_max_entries = NULL;
    }
    if (cache_max_entries) { 
    cache_max_entries_local_nonprim = config_node_property_integer_parseFromJSON(cache_max_entries); //nonprimitive
    }



    com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_local_var = com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_create_internal (
        cache_enable ? cache_enable_local_nonprim : NULL,
        cache_root_paths ? cache_root_paths_local_nonprim : NULL,
        cache_max_size ? cache_max_size_local_nonprim : NULL,
        cache_max_entries ? cache_max_entries_local_nonprim : NULL
        );

    if (!com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_properties_local_var;
end:
    if (cache_enable_local_nonprim) {
        config_node_property_boolean_free(cache_enable_local_nonprim);
        cache_enable_local_nonprim = NULL;
    }
    if (cache_root_paths_local_nonprim) {
        config_node_property_array_free(cache_root_paths_local_nonprim);
        cache_root_paths_local_nonprim = NULL;
    }
    if (cache_max_size_local_nonprim) {
        config_node_property_integer_free(cache_max_size_local_nonprim);
        cache_max_size_local_nonprim = NULL;
    }
    if (cache_max_entries_local_nonprim) {
        config_node_property_integer_free(cache_max_entries_local_nonprim);
        cache_max_entries_local_nonprim = NULL;
    }
    return NULL;

}
