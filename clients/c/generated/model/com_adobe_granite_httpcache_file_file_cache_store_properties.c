#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_httpcache_file_file_cache_store_properties.h"



static com_adobe_granite_httpcache_file_file_cache_store_properties_t *com_adobe_granite_httpcache_file_file_cache_store_properties_create_internal(
    config_node_property_string_t *com_adobe_granite_httpcache_file_document_root,
    config_node_property_string_t *com_adobe_granite_httpcache_file_include_host
    ) {
    com_adobe_granite_httpcache_file_file_cache_store_properties_t *com_adobe_granite_httpcache_file_file_cache_store_properties_local_var = malloc(sizeof(com_adobe_granite_httpcache_file_file_cache_store_properties_t));
    if (!com_adobe_granite_httpcache_file_file_cache_store_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_httpcache_file_file_cache_store_properties_local_var, 0, sizeof(com_adobe_granite_httpcache_file_file_cache_store_properties_t));
    com_adobe_granite_httpcache_file_file_cache_store_properties_local_var->_library_owned = 1;
    com_adobe_granite_httpcache_file_file_cache_store_properties_local_var->com_adobe_granite_httpcache_file_document_root = com_adobe_granite_httpcache_file_document_root;
    com_adobe_granite_httpcache_file_file_cache_store_properties_local_var->com_adobe_granite_httpcache_file_include_host = com_adobe_granite_httpcache_file_include_host;
    return com_adobe_granite_httpcache_file_file_cache_store_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_httpcache_file_file_cache_store_properties_t *com_adobe_granite_httpcache_file_file_cache_store_properties_create(
    config_node_property_string_t *com_adobe_granite_httpcache_file_document_root,
    config_node_property_string_t *com_adobe_granite_httpcache_file_include_host
    ) {
    com_adobe_granite_httpcache_file_file_cache_store_properties_t *result = com_adobe_granite_httpcache_file_file_cache_store_properties_create_internal (
        com_adobe_granite_httpcache_file_document_root,
        com_adobe_granite_httpcache_file_include_host
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_httpcache_file_file_cache_store_properties_free(com_adobe_granite_httpcache_file_file_cache_store_properties_t *com_adobe_granite_httpcache_file_file_cache_store_properties) {
    if(NULL == com_adobe_granite_httpcache_file_file_cache_store_properties){
        return ;
    }
    if(com_adobe_granite_httpcache_file_file_cache_store_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_httpcache_file_file_cache_store_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_httpcache_file_file_cache_store_properties->com_adobe_granite_httpcache_file_document_root) {
        config_node_property_string_free(com_adobe_granite_httpcache_file_file_cache_store_properties->com_adobe_granite_httpcache_file_document_root);
        com_adobe_granite_httpcache_file_file_cache_store_properties->com_adobe_granite_httpcache_file_document_root = NULL;
    }
    if (com_adobe_granite_httpcache_file_file_cache_store_properties->com_adobe_granite_httpcache_file_include_host) {
        config_node_property_string_free(com_adobe_granite_httpcache_file_file_cache_store_properties->com_adobe_granite_httpcache_file_include_host);
        com_adobe_granite_httpcache_file_file_cache_store_properties->com_adobe_granite_httpcache_file_include_host = NULL;
    }
    free(com_adobe_granite_httpcache_file_file_cache_store_properties);
}

cJSON *com_adobe_granite_httpcache_file_file_cache_store_properties_convertToJSON(com_adobe_granite_httpcache_file_file_cache_store_properties_t *com_adobe_granite_httpcache_file_file_cache_store_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_httpcache_file_file_cache_store_properties->com_adobe_granite_httpcache_file_document_root
    if(com_adobe_granite_httpcache_file_file_cache_store_properties->com_adobe_granite_httpcache_file_document_root) {
    cJSON *com_adobe_granite_httpcache_file_document_root_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_httpcache_file_file_cache_store_properties->com_adobe_granite_httpcache_file_document_root);
    if(com_adobe_granite_httpcache_file_document_root_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.granite.httpcache.file.documentRoot", com_adobe_granite_httpcache_file_document_root_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_httpcache_file_file_cache_store_properties->com_adobe_granite_httpcache_file_include_host
    if(com_adobe_granite_httpcache_file_file_cache_store_properties->com_adobe_granite_httpcache_file_include_host) {
    cJSON *com_adobe_granite_httpcache_file_include_host_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_httpcache_file_file_cache_store_properties->com_adobe_granite_httpcache_file_include_host);
    if(com_adobe_granite_httpcache_file_include_host_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.granite.httpcache.file.includeHost", com_adobe_granite_httpcache_file_include_host_local_JSON);
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

com_adobe_granite_httpcache_file_file_cache_store_properties_t *com_adobe_granite_httpcache_file_file_cache_store_properties_parseFromJSON(cJSON *com_adobe_granite_httpcache_file_file_cache_store_propertiesJSON){

    com_adobe_granite_httpcache_file_file_cache_store_properties_t *com_adobe_granite_httpcache_file_file_cache_store_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_httpcache_file_file_cache_store_properties->com_adobe_granite_httpcache_file_document_root
    config_node_property_string_t *com_adobe_granite_httpcache_file_document_root_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_httpcache_file_file_cache_store_properties->com_adobe_granite_httpcache_file_include_host
    config_node_property_string_t *com_adobe_granite_httpcache_file_include_host_local_nonprim = NULL;

    // com_adobe_granite_httpcache_file_file_cache_store_properties->com_adobe_granite_httpcache_file_document_root
    cJSON *com_adobe_granite_httpcache_file_document_root = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_httpcache_file_file_cache_store_propertiesJSON, "com.adobe.granite.httpcache.file.documentRoot");
    if (cJSON_IsNull(com_adobe_granite_httpcache_file_document_root)) {
        com_adobe_granite_httpcache_file_document_root = NULL;
    }
    if (com_adobe_granite_httpcache_file_document_root) { 
    com_adobe_granite_httpcache_file_document_root_local_nonprim = config_node_property_string_parseFromJSON(com_adobe_granite_httpcache_file_document_root); //nonprimitive
    }

    // com_adobe_granite_httpcache_file_file_cache_store_properties->com_adobe_granite_httpcache_file_include_host
    cJSON *com_adobe_granite_httpcache_file_include_host = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_httpcache_file_file_cache_store_propertiesJSON, "com.adobe.granite.httpcache.file.includeHost");
    if (cJSON_IsNull(com_adobe_granite_httpcache_file_include_host)) {
        com_adobe_granite_httpcache_file_include_host = NULL;
    }
    if (com_adobe_granite_httpcache_file_include_host) { 
    com_adobe_granite_httpcache_file_include_host_local_nonprim = config_node_property_string_parseFromJSON(com_adobe_granite_httpcache_file_include_host); //nonprimitive
    }



    com_adobe_granite_httpcache_file_file_cache_store_properties_local_var = com_adobe_granite_httpcache_file_file_cache_store_properties_create_internal (
        com_adobe_granite_httpcache_file_document_root ? com_adobe_granite_httpcache_file_document_root_local_nonprim : NULL,
        com_adobe_granite_httpcache_file_include_host ? com_adobe_granite_httpcache_file_include_host_local_nonprim : NULL
        );

    if (!com_adobe_granite_httpcache_file_file_cache_store_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_httpcache_file_file_cache_store_properties_local_var;
end:
    if (com_adobe_granite_httpcache_file_document_root_local_nonprim) {
        config_node_property_string_free(com_adobe_granite_httpcache_file_document_root_local_nonprim);
        com_adobe_granite_httpcache_file_document_root_local_nonprim = NULL;
    }
    if (com_adobe_granite_httpcache_file_include_host_local_nonprim) {
        config_node_property_string_free(com_adobe_granite_httpcache_file_include_host_local_nonprim);
        com_adobe_granite_httpcache_file_include_host_local_nonprim = NULL;
    }
    return NULL;

}
