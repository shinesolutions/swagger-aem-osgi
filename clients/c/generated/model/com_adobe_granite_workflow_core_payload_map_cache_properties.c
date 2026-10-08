#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_workflow_core_payload_map_cache_properties.h"



static com_adobe_granite_workflow_core_payload_map_cache_properties_t *com_adobe_granite_workflow_core_payload_map_cache_properties_create_internal(
    config_node_property_array_t *get_system_workflow_models,
    config_node_property_string_t *get_package_root_path
    ) {
    com_adobe_granite_workflow_core_payload_map_cache_properties_t *com_adobe_granite_workflow_core_payload_map_cache_properties_local_var = malloc(sizeof(com_adobe_granite_workflow_core_payload_map_cache_properties_t));
    if (!com_adobe_granite_workflow_core_payload_map_cache_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_workflow_core_payload_map_cache_properties_local_var, 0, sizeof(com_adobe_granite_workflow_core_payload_map_cache_properties_t));
    com_adobe_granite_workflow_core_payload_map_cache_properties_local_var->_library_owned = 1;
    com_adobe_granite_workflow_core_payload_map_cache_properties_local_var->get_system_workflow_models = get_system_workflow_models;
    com_adobe_granite_workflow_core_payload_map_cache_properties_local_var->get_package_root_path = get_package_root_path;
    return com_adobe_granite_workflow_core_payload_map_cache_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_workflow_core_payload_map_cache_properties_t *com_adobe_granite_workflow_core_payload_map_cache_properties_create(
    config_node_property_array_t *get_system_workflow_models,
    config_node_property_string_t *get_package_root_path
    ) {
    com_adobe_granite_workflow_core_payload_map_cache_properties_t *result = com_adobe_granite_workflow_core_payload_map_cache_properties_create_internal (
        get_system_workflow_models,
        get_package_root_path
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_workflow_core_payload_map_cache_properties_free(com_adobe_granite_workflow_core_payload_map_cache_properties_t *com_adobe_granite_workflow_core_payload_map_cache_properties) {
    if(NULL == com_adobe_granite_workflow_core_payload_map_cache_properties){
        return ;
    }
    if(com_adobe_granite_workflow_core_payload_map_cache_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_workflow_core_payload_map_cache_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_workflow_core_payload_map_cache_properties->get_system_workflow_models) {
        config_node_property_array_free(com_adobe_granite_workflow_core_payload_map_cache_properties->get_system_workflow_models);
        com_adobe_granite_workflow_core_payload_map_cache_properties->get_system_workflow_models = NULL;
    }
    if (com_adobe_granite_workflow_core_payload_map_cache_properties->get_package_root_path) {
        config_node_property_string_free(com_adobe_granite_workflow_core_payload_map_cache_properties->get_package_root_path);
        com_adobe_granite_workflow_core_payload_map_cache_properties->get_package_root_path = NULL;
    }
    free(com_adobe_granite_workflow_core_payload_map_cache_properties);
}

cJSON *com_adobe_granite_workflow_core_payload_map_cache_properties_convertToJSON(com_adobe_granite_workflow_core_payload_map_cache_properties_t *com_adobe_granite_workflow_core_payload_map_cache_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_workflow_core_payload_map_cache_properties->get_system_workflow_models
    if(com_adobe_granite_workflow_core_payload_map_cache_properties->get_system_workflow_models) {
    cJSON *get_system_workflow_models_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_workflow_core_payload_map_cache_properties->get_system_workflow_models);
    if(get_system_workflow_models_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "getSystemWorkflowModels", get_system_workflow_models_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_workflow_core_payload_map_cache_properties->get_package_root_path
    if(com_adobe_granite_workflow_core_payload_map_cache_properties->get_package_root_path) {
    cJSON *get_package_root_path_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_workflow_core_payload_map_cache_properties->get_package_root_path);
    if(get_package_root_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "getPackageRootPath", get_package_root_path_local_JSON);
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

com_adobe_granite_workflow_core_payload_map_cache_properties_t *com_adobe_granite_workflow_core_payload_map_cache_properties_parseFromJSON(cJSON *com_adobe_granite_workflow_core_payload_map_cache_propertiesJSON){

    com_adobe_granite_workflow_core_payload_map_cache_properties_t *com_adobe_granite_workflow_core_payload_map_cache_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_workflow_core_payload_map_cache_properties->get_system_workflow_models
    config_node_property_array_t *get_system_workflow_models_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_workflow_core_payload_map_cache_properties->get_package_root_path
    config_node_property_string_t *get_package_root_path_local_nonprim = NULL;

    // com_adobe_granite_workflow_core_payload_map_cache_properties->get_system_workflow_models
    cJSON *get_system_workflow_models = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_core_payload_map_cache_propertiesJSON, "getSystemWorkflowModels");
    if (cJSON_IsNull(get_system_workflow_models)) {
        get_system_workflow_models = NULL;
    }
    if (get_system_workflow_models) { 
    get_system_workflow_models_local_nonprim = config_node_property_array_parseFromJSON(get_system_workflow_models); //nonprimitive
    }

    // com_adobe_granite_workflow_core_payload_map_cache_properties->get_package_root_path
    cJSON *get_package_root_path = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_core_payload_map_cache_propertiesJSON, "getPackageRootPath");
    if (cJSON_IsNull(get_package_root_path)) {
        get_package_root_path = NULL;
    }
    if (get_package_root_path) { 
    get_package_root_path_local_nonprim = config_node_property_string_parseFromJSON(get_package_root_path); //nonprimitive
    }



    com_adobe_granite_workflow_core_payload_map_cache_properties_local_var = com_adobe_granite_workflow_core_payload_map_cache_properties_create_internal (
        get_system_workflow_models ? get_system_workflow_models_local_nonprim : NULL,
        get_package_root_path ? get_package_root_path_local_nonprim : NULL
        );

    if (!com_adobe_granite_workflow_core_payload_map_cache_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_workflow_core_payload_map_cache_properties_local_var;
end:
    if (get_system_workflow_models_local_nonprim) {
        config_node_property_array_free(get_system_workflow_models_local_nonprim);
        get_system_workflow_models_local_nonprim = NULL;
    }
    if (get_package_root_path_local_nonprim) {
        config_node_property_string_free(get_package_root_path_local_nonprim);
        get_package_root_path_local_nonprim = NULL;
    }
    return NULL;

}
