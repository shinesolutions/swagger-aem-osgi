#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties.h"



static com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_t *com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_create_internal(
    config_node_property_array_t *supported_paths
    ) {
    com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_t *com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_local_var = malloc(sizeof(com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_t));
    if (!com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_local_var, 0, sizeof(com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_t));
    com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_local_var->_library_owned = 1;
    com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_local_var->supported_paths = supported_paths;
    return com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_t *com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_create(
    config_node_property_array_t *supported_paths
    ) {
    com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_t *result = com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_create_internal (
        supported_paths
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_free(com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_t *com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties) {
    if(NULL == com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties){
        return ;
    }
    if(com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties->supported_paths) {
        config_node_property_array_free(com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties->supported_paths);
        com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties->supported_paths = NULL;
    }
    free(com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties);
}

cJSON *com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_convertToJSON(com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_t *com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties->supported_paths
    if(com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties->supported_paths) {
    cJSON *supported_paths_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties->supported_paths);
    if(supported_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "supportedPaths", supported_paths_local_JSON);
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

com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_t *com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_parseFromJSON(cJSON *com_adobe_granite_auth_requirement_impl_default_requirement_handler_propertiesJSON){

    com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_t *com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties->supported_paths
    config_node_property_array_t *supported_paths_local_nonprim = NULL;

    // com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties->supported_paths
    cJSON *supported_paths = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_requirement_impl_default_requirement_handler_propertiesJSON, "supportedPaths");
    if (cJSON_IsNull(supported_paths)) {
        supported_paths = NULL;
    }
    if (supported_paths) { 
    supported_paths_local_nonprim = config_node_property_array_parseFromJSON(supported_paths); //nonprimitive
    }



    com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_local_var = com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_create_internal (
        supported_paths ? supported_paths_local_nonprim : NULL
        );

    if (!com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_auth_requirement_impl_default_requirement_handler_properties_local_var;
end:
    if (supported_paths_local_nonprim) {
        config_node_property_array_free(supported_paths_local_nonprim);
        supported_paths_local_nonprim = NULL;
    }
    return NULL;

}
