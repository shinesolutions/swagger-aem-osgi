#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_acp_platform_platform_servlet_properties.h"



static com_adobe_granite_acp_platform_platform_servlet_properties_t *com_adobe_granite_acp_platform_platform_servlet_properties_create_internal(
    config_node_property_integer_t *query_limit,
    config_node_property_array_t *file_type_extension_map
    ) {
    com_adobe_granite_acp_platform_platform_servlet_properties_t *com_adobe_granite_acp_platform_platform_servlet_properties_local_var = malloc(sizeof(com_adobe_granite_acp_platform_platform_servlet_properties_t));
    if (!com_adobe_granite_acp_platform_platform_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_acp_platform_platform_servlet_properties_local_var, 0, sizeof(com_adobe_granite_acp_platform_platform_servlet_properties_t));
    com_adobe_granite_acp_platform_platform_servlet_properties_local_var->_library_owned = 1;
    com_adobe_granite_acp_platform_platform_servlet_properties_local_var->query_limit = query_limit;
    com_adobe_granite_acp_platform_platform_servlet_properties_local_var->file_type_extension_map = file_type_extension_map;
    return com_adobe_granite_acp_platform_platform_servlet_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_acp_platform_platform_servlet_properties_t *com_adobe_granite_acp_platform_platform_servlet_properties_create(
    config_node_property_integer_t *query_limit,
    config_node_property_array_t *file_type_extension_map
    ) {
    com_adobe_granite_acp_platform_platform_servlet_properties_t *result = com_adobe_granite_acp_platform_platform_servlet_properties_create_internal (
        query_limit,
        file_type_extension_map
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_acp_platform_platform_servlet_properties_free(com_adobe_granite_acp_platform_platform_servlet_properties_t *com_adobe_granite_acp_platform_platform_servlet_properties) {
    if(NULL == com_adobe_granite_acp_platform_platform_servlet_properties){
        return ;
    }
    if(com_adobe_granite_acp_platform_platform_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_acp_platform_platform_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_acp_platform_platform_servlet_properties->query_limit) {
        config_node_property_integer_free(com_adobe_granite_acp_platform_platform_servlet_properties->query_limit);
        com_adobe_granite_acp_platform_platform_servlet_properties->query_limit = NULL;
    }
    if (com_adobe_granite_acp_platform_platform_servlet_properties->file_type_extension_map) {
        config_node_property_array_free(com_adobe_granite_acp_platform_platform_servlet_properties->file_type_extension_map);
        com_adobe_granite_acp_platform_platform_servlet_properties->file_type_extension_map = NULL;
    }
    free(com_adobe_granite_acp_platform_platform_servlet_properties);
}

cJSON *com_adobe_granite_acp_platform_platform_servlet_properties_convertToJSON(com_adobe_granite_acp_platform_platform_servlet_properties_t *com_adobe_granite_acp_platform_platform_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_acp_platform_platform_servlet_properties->query_limit
    if(com_adobe_granite_acp_platform_platform_servlet_properties->query_limit) {
    cJSON *query_limit_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_acp_platform_platform_servlet_properties->query_limit);
    if(query_limit_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "query.limit", query_limit_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_acp_platform_platform_servlet_properties->file_type_extension_map
    if(com_adobe_granite_acp_platform_platform_servlet_properties->file_type_extension_map) {
    cJSON *file_type_extension_map_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_acp_platform_platform_servlet_properties->file_type_extension_map);
    if(file_type_extension_map_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "file.type.extension.map", file_type_extension_map_local_JSON);
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

com_adobe_granite_acp_platform_platform_servlet_properties_t *com_adobe_granite_acp_platform_platform_servlet_properties_parseFromJSON(cJSON *com_adobe_granite_acp_platform_platform_servlet_propertiesJSON){

    com_adobe_granite_acp_platform_platform_servlet_properties_t *com_adobe_granite_acp_platform_platform_servlet_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_acp_platform_platform_servlet_properties->query_limit
    config_node_property_integer_t *query_limit_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_acp_platform_platform_servlet_properties->file_type_extension_map
    config_node_property_array_t *file_type_extension_map_local_nonprim = NULL;

    // com_adobe_granite_acp_platform_platform_servlet_properties->query_limit
    cJSON *query_limit = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_acp_platform_platform_servlet_propertiesJSON, "query.limit");
    if (cJSON_IsNull(query_limit)) {
        query_limit = NULL;
    }
    if (query_limit) { 
    query_limit_local_nonprim = config_node_property_integer_parseFromJSON(query_limit); //nonprimitive
    }

    // com_adobe_granite_acp_platform_platform_servlet_properties->file_type_extension_map
    cJSON *file_type_extension_map = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_acp_platform_platform_servlet_propertiesJSON, "file.type.extension.map");
    if (cJSON_IsNull(file_type_extension_map)) {
        file_type_extension_map = NULL;
    }
    if (file_type_extension_map) { 
    file_type_extension_map_local_nonprim = config_node_property_array_parseFromJSON(file_type_extension_map); //nonprimitive
    }



    com_adobe_granite_acp_platform_platform_servlet_properties_local_var = com_adobe_granite_acp_platform_platform_servlet_properties_create_internal (
        query_limit ? query_limit_local_nonprim : NULL,
        file_type_extension_map ? file_type_extension_map_local_nonprim : NULL
        );

    if (!com_adobe_granite_acp_platform_platform_servlet_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_acp_platform_platform_servlet_properties_local_var;
end:
    if (query_limit_local_nonprim) {
        config_node_property_integer_free(query_limit_local_nonprim);
        query_limit_local_nonprim = NULL;
    }
    if (file_type_extension_map_local_nonprim) {
        config_node_property_array_free(file_type_extension_map_local_nonprim);
        file_type_extension_map_local_nonprim = NULL;
    }
    return NULL;

}
