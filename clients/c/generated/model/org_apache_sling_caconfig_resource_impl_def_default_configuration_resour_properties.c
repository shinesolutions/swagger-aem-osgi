#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties.h"



static org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_t *org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_create_internal(
    config_node_property_boolean_t *enabled,
    config_node_property_string_t *config_path,
    config_node_property_array_t *fallback_paths,
    config_node_property_array_t *config_collection_inheritance_property_names
    ) {
    org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_t *org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_local_var = malloc(sizeof(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_t));
    if (!org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_local_var, 0, sizeof(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_t));
    org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_local_var->_library_owned = 1;
    org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_local_var->enabled = enabled;
    org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_local_var->config_path = config_path;
    org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_local_var->fallback_paths = fallback_paths;
    org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_local_var->config_collection_inheritance_property_names = config_collection_inheritance_property_names;
    return org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_t *org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_create(
    config_node_property_boolean_t *enabled,
    config_node_property_string_t *config_path,
    config_node_property_array_t *fallback_paths,
    config_node_property_array_t *config_collection_inheritance_property_names
    ) {
    org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_t *result = org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_create_internal (
        enabled,
        config_path,
        fallback_paths,
        config_collection_inheritance_property_names
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_free(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_t *org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties) {
    if(NULL == org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties){
        return ;
    }
    if(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->enabled) {
        config_node_property_boolean_free(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->enabled);
        org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->enabled = NULL;
    }
    if (org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->config_path) {
        config_node_property_string_free(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->config_path);
        org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->config_path = NULL;
    }
    if (org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->fallback_paths) {
        config_node_property_array_free(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->fallback_paths);
        org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->fallback_paths = NULL;
    }
    if (org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->config_collection_inheritance_property_names) {
        config_node_property_array_free(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->config_collection_inheritance_property_names);
        org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->config_collection_inheritance_property_names = NULL;
    }
    free(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties);
}

cJSON *org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_convertToJSON(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_t *org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->enabled
    if(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->enabled) {
    cJSON *enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->enabled);
    if(enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enabled", enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->config_path
    if(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->config_path) {
    cJSON *config_path_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->config_path);
    if(config_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "configPath", config_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->fallback_paths
    if(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->fallback_paths) {
    cJSON *fallback_paths_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->fallback_paths);
    if(fallback_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "fallbackPaths", fallback_paths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->config_collection_inheritance_property_names
    if(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->config_collection_inheritance_property_names) {
    cJSON *config_collection_inheritance_property_names_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->config_collection_inheritance_property_names);
    if(config_collection_inheritance_property_names_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "configCollectionInheritancePropertyNames", config_collection_inheritance_property_names_local_JSON);
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

org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_t *org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_parseFromJSON(cJSON *org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_propertiesJSON){

    org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_t *org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_local_var = NULL;

    // define the local variable for org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->enabled
    config_node_property_boolean_t *enabled_local_nonprim = NULL;

    // define the local variable for org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->config_path
    config_node_property_string_t *config_path_local_nonprim = NULL;

    // define the local variable for org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->fallback_paths
    config_node_property_array_t *fallback_paths_local_nonprim = NULL;

    // define the local variable for org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->config_collection_inheritance_property_names
    config_node_property_array_t *config_collection_inheritance_property_names_local_nonprim = NULL;

    // org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->enabled
    cJSON *enabled = cJSON_GetObjectItemCaseSensitive(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_propertiesJSON, "enabled");
    if (cJSON_IsNull(enabled)) {
        enabled = NULL;
    }
    if (enabled) { 
    enabled_local_nonprim = config_node_property_boolean_parseFromJSON(enabled); //nonprimitive
    }

    // org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->config_path
    cJSON *config_path = cJSON_GetObjectItemCaseSensitive(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_propertiesJSON, "configPath");
    if (cJSON_IsNull(config_path)) {
        config_path = NULL;
    }
    if (config_path) { 
    config_path_local_nonprim = config_node_property_string_parseFromJSON(config_path); //nonprimitive
    }

    // org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->fallback_paths
    cJSON *fallback_paths = cJSON_GetObjectItemCaseSensitive(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_propertiesJSON, "fallbackPaths");
    if (cJSON_IsNull(fallback_paths)) {
        fallback_paths = NULL;
    }
    if (fallback_paths) { 
    fallback_paths_local_nonprim = config_node_property_array_parseFromJSON(fallback_paths); //nonprimitive
    }

    // org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties->config_collection_inheritance_property_names
    cJSON *config_collection_inheritance_property_names = cJSON_GetObjectItemCaseSensitive(org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_propertiesJSON, "configCollectionInheritancePropertyNames");
    if (cJSON_IsNull(config_collection_inheritance_property_names)) {
        config_collection_inheritance_property_names = NULL;
    }
    if (config_collection_inheritance_property_names) { 
    config_collection_inheritance_property_names_local_nonprim = config_node_property_array_parseFromJSON(config_collection_inheritance_property_names); //nonprimitive
    }



    org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_local_var = org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_create_internal (
        enabled ? enabled_local_nonprim : NULL,
        config_path ? config_path_local_nonprim : NULL,
        fallback_paths ? fallback_paths_local_nonprim : NULL,
        config_collection_inheritance_property_names ? config_collection_inheritance_property_names_local_nonprim : NULL
        );

    if (!org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_local_var) {
        goto end;
    }

    return org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties_local_var;
end:
    if (enabled_local_nonprim) {
        config_node_property_boolean_free(enabled_local_nonprim);
        enabled_local_nonprim = NULL;
    }
    if (config_path_local_nonprim) {
        config_node_property_string_free(config_path_local_nonprim);
        config_path_local_nonprim = NULL;
    }
    if (fallback_paths_local_nonprim) {
        config_node_property_array_free(fallback_paths_local_nonprim);
        fallback_paths_local_nonprim = NULL;
    }
    if (config_collection_inheritance_property_names_local_nonprim) {
        config_node_property_array_free(config_collection_inheritance_property_names_local_nonprim);
        config_collection_inheritance_property_names_local_nonprim = NULL;
    }
    return NULL;

}
