#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties.h"



static com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_t *com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_create_internal(
    config_node_property_boolean_t *enabled,
    config_node_property_array_t *fallback_paths
    ) {
    com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_t *com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_local_var = malloc(sizeof(com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_t));
    if (!com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_local_var, 0, sizeof(com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_t));
    com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_local_var->_library_owned = 1;
    com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_local_var->enabled = enabled;
    com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_local_var->fallback_paths = fallback_paths;
    return com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_t *com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_create(
    config_node_property_boolean_t *enabled,
    config_node_property_array_t *fallback_paths
    ) {
    com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_t *result = com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_create_internal (
        enabled,
        fallback_paths
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_free(com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_t *com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties) {
    if(NULL == com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties){
        return ;
    }
    if(com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties->enabled) {
        config_node_property_boolean_free(com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties->enabled);
        com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties->enabled = NULL;
    }
    if (com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties->fallback_paths) {
        config_node_property_array_free(com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties->fallback_paths);
        com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties->fallback_paths = NULL;
    }
    free(com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties);
}

cJSON *com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_convertToJSON(com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_t *com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties->enabled
    if(com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties->enabled) {
    cJSON *enabled_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties->enabled);
    if(enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enabled", enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties->fallback_paths
    if(com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties->fallback_paths) {
    cJSON *fallback_paths_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties->fallback_paths);
    if(fallback_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "fallbackPaths", fallback_paths_local_JSON);
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

com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_t *com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_parseFromJSON(cJSON *com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_propertiesJSON){

    com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_t *com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties->enabled
    config_node_property_boolean_t *enabled_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties->fallback_paths
    config_node_property_array_t *fallback_paths_local_nonprim = NULL;

    // com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties->enabled
    cJSON *enabled = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_propertiesJSON, "enabled");
    if (cJSON_IsNull(enabled)) {
        enabled = NULL;
    }
    if (enabled) { 
    enabled_local_nonprim = config_node_property_boolean_parseFromJSON(enabled); //nonprimitive
    }

    // com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties->fallback_paths
    cJSON *fallback_paths = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_propertiesJSON, "fallbackPaths");
    if (cJSON_IsNull(fallback_paths)) {
        fallback_paths = NULL;
    }
    if (fallback_paths) { 
    fallback_paths_local_nonprim = config_node_property_array_parseFromJSON(fallback_paths); //nonprimitive
    }



    com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_local_var = com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_create_internal (
        enabled ? enabled_local_nonprim : NULL,
        fallback_paths ? fallback_paths_local_nonprim : NULL
        );

    if (!com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_properties_local_var;
end:
    if (enabled_local_nonprim) {
        config_node_property_boolean_free(enabled_local_nonprim);
        enabled_local_nonprim = NULL;
    }
    if (fallback_paths_local_nonprim) {
        config_node_property_array_free(fallback_paths_local_nonprim);
        fallback_paths_local_nonprim = NULL;
    }
    return NULL;

}
