#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_httpcache_impl_outer_cache_filter_properties.h"



static com_adobe_granite_httpcache_impl_outer_cache_filter_properties_t *com_adobe_granite_httpcache_impl_outer_cache_filter_properties_create_internal(
    config_node_property_array_t *com_adobe_granite_httpcache_url_paths
    ) {
    com_adobe_granite_httpcache_impl_outer_cache_filter_properties_t *com_adobe_granite_httpcache_impl_outer_cache_filter_properties_local_var = malloc(sizeof(com_adobe_granite_httpcache_impl_outer_cache_filter_properties_t));
    if (!com_adobe_granite_httpcache_impl_outer_cache_filter_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_httpcache_impl_outer_cache_filter_properties_local_var, 0, sizeof(com_adobe_granite_httpcache_impl_outer_cache_filter_properties_t));
    com_adobe_granite_httpcache_impl_outer_cache_filter_properties_local_var->_library_owned = 1;
    com_adobe_granite_httpcache_impl_outer_cache_filter_properties_local_var->com_adobe_granite_httpcache_url_paths = com_adobe_granite_httpcache_url_paths;
    return com_adobe_granite_httpcache_impl_outer_cache_filter_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_httpcache_impl_outer_cache_filter_properties_t *com_adobe_granite_httpcache_impl_outer_cache_filter_properties_create(
    config_node_property_array_t *com_adobe_granite_httpcache_url_paths
    ) {
    com_adobe_granite_httpcache_impl_outer_cache_filter_properties_t *result = com_adobe_granite_httpcache_impl_outer_cache_filter_properties_create_internal (
        com_adobe_granite_httpcache_url_paths
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_httpcache_impl_outer_cache_filter_properties_free(com_adobe_granite_httpcache_impl_outer_cache_filter_properties_t *com_adobe_granite_httpcache_impl_outer_cache_filter_properties) {
    if(NULL == com_adobe_granite_httpcache_impl_outer_cache_filter_properties){
        return ;
    }
    if(com_adobe_granite_httpcache_impl_outer_cache_filter_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_httpcache_impl_outer_cache_filter_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_httpcache_impl_outer_cache_filter_properties->com_adobe_granite_httpcache_url_paths) {
        config_node_property_array_free(com_adobe_granite_httpcache_impl_outer_cache_filter_properties->com_adobe_granite_httpcache_url_paths);
        com_adobe_granite_httpcache_impl_outer_cache_filter_properties->com_adobe_granite_httpcache_url_paths = NULL;
    }
    free(com_adobe_granite_httpcache_impl_outer_cache_filter_properties);
}

cJSON *com_adobe_granite_httpcache_impl_outer_cache_filter_properties_convertToJSON(com_adobe_granite_httpcache_impl_outer_cache_filter_properties_t *com_adobe_granite_httpcache_impl_outer_cache_filter_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_httpcache_impl_outer_cache_filter_properties->com_adobe_granite_httpcache_url_paths
    if(com_adobe_granite_httpcache_impl_outer_cache_filter_properties->com_adobe_granite_httpcache_url_paths) {
    cJSON *com_adobe_granite_httpcache_url_paths_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_httpcache_impl_outer_cache_filter_properties->com_adobe_granite_httpcache_url_paths);
    if(com_adobe_granite_httpcache_url_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.granite.httpcache.url.paths", com_adobe_granite_httpcache_url_paths_local_JSON);
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

com_adobe_granite_httpcache_impl_outer_cache_filter_properties_t *com_adobe_granite_httpcache_impl_outer_cache_filter_properties_parseFromJSON(cJSON *com_adobe_granite_httpcache_impl_outer_cache_filter_propertiesJSON){

    com_adobe_granite_httpcache_impl_outer_cache_filter_properties_t *com_adobe_granite_httpcache_impl_outer_cache_filter_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_httpcache_impl_outer_cache_filter_properties->com_adobe_granite_httpcache_url_paths
    config_node_property_array_t *com_adobe_granite_httpcache_url_paths_local_nonprim = NULL;

    // com_adobe_granite_httpcache_impl_outer_cache_filter_properties->com_adobe_granite_httpcache_url_paths
    cJSON *com_adobe_granite_httpcache_url_paths = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_httpcache_impl_outer_cache_filter_propertiesJSON, "com.adobe.granite.httpcache.url.paths");
    if (cJSON_IsNull(com_adobe_granite_httpcache_url_paths)) {
        com_adobe_granite_httpcache_url_paths = NULL;
    }
    if (com_adobe_granite_httpcache_url_paths) { 
    com_adobe_granite_httpcache_url_paths_local_nonprim = config_node_property_array_parseFromJSON(com_adobe_granite_httpcache_url_paths); //nonprimitive
    }



    com_adobe_granite_httpcache_impl_outer_cache_filter_properties_local_var = com_adobe_granite_httpcache_impl_outer_cache_filter_properties_create_internal (
        com_adobe_granite_httpcache_url_paths ? com_adobe_granite_httpcache_url_paths_local_nonprim : NULL
        );

    if (!com_adobe_granite_httpcache_impl_outer_cache_filter_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_httpcache_impl_outer_cache_filter_properties_local_var;
end:
    if (com_adobe_granite_httpcache_url_paths_local_nonprim) {
        config_node_property_array_free(com_adobe_granite_httpcache_url_paths_local_nonprim);
        com_adobe_granite_httpcache_url_paths_local_nonprim = NULL;
    }
    return NULL;

}
