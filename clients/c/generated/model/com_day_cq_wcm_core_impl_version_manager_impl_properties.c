#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_core_impl_version_manager_impl_properties.h"



static com_day_cq_wcm_core_impl_version_manager_impl_properties_t *com_day_cq_wcm_core_impl_version_manager_impl_properties_create_internal(
    config_node_property_boolean_t *versionmanager_create_version_on_activation,
    config_node_property_boolean_t *versionmanager_purging_enabled,
    config_node_property_array_t *versionmanager_purge_paths,
    config_node_property_array_t *versionmanager_iv_paths,
    config_node_property_integer_t *versionmanager_max_age_days,
    config_node_property_integer_t *versionmanager_max_number_versions,
    config_node_property_integer_t *versionmanager_min_number_versions
    ) {
    com_day_cq_wcm_core_impl_version_manager_impl_properties_t *com_day_cq_wcm_core_impl_version_manager_impl_properties_local_var = malloc(sizeof(com_day_cq_wcm_core_impl_version_manager_impl_properties_t));
    if (!com_day_cq_wcm_core_impl_version_manager_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_core_impl_version_manager_impl_properties_local_var, 0, sizeof(com_day_cq_wcm_core_impl_version_manager_impl_properties_t));
    com_day_cq_wcm_core_impl_version_manager_impl_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_core_impl_version_manager_impl_properties_local_var->versionmanager_create_version_on_activation = versionmanager_create_version_on_activation;
    com_day_cq_wcm_core_impl_version_manager_impl_properties_local_var->versionmanager_purging_enabled = versionmanager_purging_enabled;
    com_day_cq_wcm_core_impl_version_manager_impl_properties_local_var->versionmanager_purge_paths = versionmanager_purge_paths;
    com_day_cq_wcm_core_impl_version_manager_impl_properties_local_var->versionmanager_iv_paths = versionmanager_iv_paths;
    com_day_cq_wcm_core_impl_version_manager_impl_properties_local_var->versionmanager_max_age_days = versionmanager_max_age_days;
    com_day_cq_wcm_core_impl_version_manager_impl_properties_local_var->versionmanager_max_number_versions = versionmanager_max_number_versions;
    com_day_cq_wcm_core_impl_version_manager_impl_properties_local_var->versionmanager_min_number_versions = versionmanager_min_number_versions;
    return com_day_cq_wcm_core_impl_version_manager_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_core_impl_version_manager_impl_properties_t *com_day_cq_wcm_core_impl_version_manager_impl_properties_create(
    config_node_property_boolean_t *versionmanager_create_version_on_activation,
    config_node_property_boolean_t *versionmanager_purging_enabled,
    config_node_property_array_t *versionmanager_purge_paths,
    config_node_property_array_t *versionmanager_iv_paths,
    config_node_property_integer_t *versionmanager_max_age_days,
    config_node_property_integer_t *versionmanager_max_number_versions,
    config_node_property_integer_t *versionmanager_min_number_versions
    ) {
    com_day_cq_wcm_core_impl_version_manager_impl_properties_t *result = com_day_cq_wcm_core_impl_version_manager_impl_properties_create_internal (
        versionmanager_create_version_on_activation,
        versionmanager_purging_enabled,
        versionmanager_purge_paths,
        versionmanager_iv_paths,
        versionmanager_max_age_days,
        versionmanager_max_number_versions,
        versionmanager_min_number_versions
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_core_impl_version_manager_impl_properties_free(com_day_cq_wcm_core_impl_version_manager_impl_properties_t *com_day_cq_wcm_core_impl_version_manager_impl_properties) {
    if(NULL == com_day_cq_wcm_core_impl_version_manager_impl_properties){
        return ;
    }
    if(com_day_cq_wcm_core_impl_version_manager_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_core_impl_version_manager_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_create_version_on_activation) {
        config_node_property_boolean_free(com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_create_version_on_activation);
        com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_create_version_on_activation = NULL;
    }
    if (com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_purging_enabled) {
        config_node_property_boolean_free(com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_purging_enabled);
        com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_purging_enabled = NULL;
    }
    if (com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_purge_paths) {
        config_node_property_array_free(com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_purge_paths);
        com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_purge_paths = NULL;
    }
    if (com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_iv_paths) {
        config_node_property_array_free(com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_iv_paths);
        com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_iv_paths = NULL;
    }
    if (com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_max_age_days) {
        config_node_property_integer_free(com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_max_age_days);
        com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_max_age_days = NULL;
    }
    if (com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_max_number_versions) {
        config_node_property_integer_free(com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_max_number_versions);
        com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_max_number_versions = NULL;
    }
    if (com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_min_number_versions) {
        config_node_property_integer_free(com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_min_number_versions);
        com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_min_number_versions = NULL;
    }
    free(com_day_cq_wcm_core_impl_version_manager_impl_properties);
}

cJSON *com_day_cq_wcm_core_impl_version_manager_impl_properties_convertToJSON(com_day_cq_wcm_core_impl_version_manager_impl_properties_t *com_day_cq_wcm_core_impl_version_manager_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_create_version_on_activation
    if(com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_create_version_on_activation) {
    cJSON *versionmanager_create_version_on_activation_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_create_version_on_activation);
    if(versionmanager_create_version_on_activation_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "versionmanager.createVersionOnActivation", versionmanager_create_version_on_activation_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_purging_enabled
    if(com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_purging_enabled) {
    cJSON *versionmanager_purging_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_purging_enabled);
    if(versionmanager_purging_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "versionmanager.purgingEnabled", versionmanager_purging_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_purge_paths
    if(com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_purge_paths) {
    cJSON *versionmanager_purge_paths_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_purge_paths);
    if(versionmanager_purge_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "versionmanager.purgePaths", versionmanager_purge_paths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_iv_paths
    if(com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_iv_paths) {
    cJSON *versionmanager_iv_paths_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_iv_paths);
    if(versionmanager_iv_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "versionmanager.ivPaths", versionmanager_iv_paths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_max_age_days
    if(com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_max_age_days) {
    cJSON *versionmanager_max_age_days_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_max_age_days);
    if(versionmanager_max_age_days_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "versionmanager.maxAgeDays", versionmanager_max_age_days_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_max_number_versions
    if(com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_max_number_versions) {
    cJSON *versionmanager_max_number_versions_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_max_number_versions);
    if(versionmanager_max_number_versions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "versionmanager.maxNumberVersions", versionmanager_max_number_versions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_min_number_versions
    if(com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_min_number_versions) {
    cJSON *versionmanager_min_number_versions_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_min_number_versions);
    if(versionmanager_min_number_versions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "versionmanager.minNumberVersions", versionmanager_min_number_versions_local_JSON);
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

com_day_cq_wcm_core_impl_version_manager_impl_properties_t *com_day_cq_wcm_core_impl_version_manager_impl_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_version_manager_impl_propertiesJSON){

    com_day_cq_wcm_core_impl_version_manager_impl_properties_t *com_day_cq_wcm_core_impl_version_manager_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_create_version_on_activation
    config_node_property_boolean_t *versionmanager_create_version_on_activation_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_purging_enabled
    config_node_property_boolean_t *versionmanager_purging_enabled_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_purge_paths
    config_node_property_array_t *versionmanager_purge_paths_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_iv_paths
    config_node_property_array_t *versionmanager_iv_paths_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_max_age_days
    config_node_property_integer_t *versionmanager_max_age_days_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_max_number_versions
    config_node_property_integer_t *versionmanager_max_number_versions_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_min_number_versions
    config_node_property_integer_t *versionmanager_min_number_versions_local_nonprim = NULL;

    // com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_create_version_on_activation
    cJSON *versionmanager_create_version_on_activation = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_version_manager_impl_propertiesJSON, "versionmanager.createVersionOnActivation");
    if (cJSON_IsNull(versionmanager_create_version_on_activation)) {
        versionmanager_create_version_on_activation = NULL;
    }
    if (versionmanager_create_version_on_activation) { 
    versionmanager_create_version_on_activation_local_nonprim = config_node_property_boolean_parseFromJSON(versionmanager_create_version_on_activation); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_purging_enabled
    cJSON *versionmanager_purging_enabled = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_version_manager_impl_propertiesJSON, "versionmanager.purgingEnabled");
    if (cJSON_IsNull(versionmanager_purging_enabled)) {
        versionmanager_purging_enabled = NULL;
    }
    if (versionmanager_purging_enabled) { 
    versionmanager_purging_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(versionmanager_purging_enabled); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_purge_paths
    cJSON *versionmanager_purge_paths = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_version_manager_impl_propertiesJSON, "versionmanager.purgePaths");
    if (cJSON_IsNull(versionmanager_purge_paths)) {
        versionmanager_purge_paths = NULL;
    }
    if (versionmanager_purge_paths) { 
    versionmanager_purge_paths_local_nonprim = config_node_property_array_parseFromJSON(versionmanager_purge_paths); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_iv_paths
    cJSON *versionmanager_iv_paths = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_version_manager_impl_propertiesJSON, "versionmanager.ivPaths");
    if (cJSON_IsNull(versionmanager_iv_paths)) {
        versionmanager_iv_paths = NULL;
    }
    if (versionmanager_iv_paths) { 
    versionmanager_iv_paths_local_nonprim = config_node_property_array_parseFromJSON(versionmanager_iv_paths); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_max_age_days
    cJSON *versionmanager_max_age_days = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_version_manager_impl_propertiesJSON, "versionmanager.maxAgeDays");
    if (cJSON_IsNull(versionmanager_max_age_days)) {
        versionmanager_max_age_days = NULL;
    }
    if (versionmanager_max_age_days) { 
    versionmanager_max_age_days_local_nonprim = config_node_property_integer_parseFromJSON(versionmanager_max_age_days); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_max_number_versions
    cJSON *versionmanager_max_number_versions = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_version_manager_impl_propertiesJSON, "versionmanager.maxNumberVersions");
    if (cJSON_IsNull(versionmanager_max_number_versions)) {
        versionmanager_max_number_versions = NULL;
    }
    if (versionmanager_max_number_versions) { 
    versionmanager_max_number_versions_local_nonprim = config_node_property_integer_parseFromJSON(versionmanager_max_number_versions); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_version_manager_impl_properties->versionmanager_min_number_versions
    cJSON *versionmanager_min_number_versions = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_version_manager_impl_propertiesJSON, "versionmanager.minNumberVersions");
    if (cJSON_IsNull(versionmanager_min_number_versions)) {
        versionmanager_min_number_versions = NULL;
    }
    if (versionmanager_min_number_versions) { 
    versionmanager_min_number_versions_local_nonprim = config_node_property_integer_parseFromJSON(versionmanager_min_number_versions); //nonprimitive
    }



    com_day_cq_wcm_core_impl_version_manager_impl_properties_local_var = com_day_cq_wcm_core_impl_version_manager_impl_properties_create_internal (
        versionmanager_create_version_on_activation ? versionmanager_create_version_on_activation_local_nonprim : NULL,
        versionmanager_purging_enabled ? versionmanager_purging_enabled_local_nonprim : NULL,
        versionmanager_purge_paths ? versionmanager_purge_paths_local_nonprim : NULL,
        versionmanager_iv_paths ? versionmanager_iv_paths_local_nonprim : NULL,
        versionmanager_max_age_days ? versionmanager_max_age_days_local_nonprim : NULL,
        versionmanager_max_number_versions ? versionmanager_max_number_versions_local_nonprim : NULL,
        versionmanager_min_number_versions ? versionmanager_min_number_versions_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_core_impl_version_manager_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_core_impl_version_manager_impl_properties_local_var;
end:
    if (versionmanager_create_version_on_activation_local_nonprim) {
        config_node_property_boolean_free(versionmanager_create_version_on_activation_local_nonprim);
        versionmanager_create_version_on_activation_local_nonprim = NULL;
    }
    if (versionmanager_purging_enabled_local_nonprim) {
        config_node_property_boolean_free(versionmanager_purging_enabled_local_nonprim);
        versionmanager_purging_enabled_local_nonprim = NULL;
    }
    if (versionmanager_purge_paths_local_nonprim) {
        config_node_property_array_free(versionmanager_purge_paths_local_nonprim);
        versionmanager_purge_paths_local_nonprim = NULL;
    }
    if (versionmanager_iv_paths_local_nonprim) {
        config_node_property_array_free(versionmanager_iv_paths_local_nonprim);
        versionmanager_iv_paths_local_nonprim = NULL;
    }
    if (versionmanager_max_age_days_local_nonprim) {
        config_node_property_integer_free(versionmanager_max_age_days_local_nonprim);
        versionmanager_max_age_days_local_nonprim = NULL;
    }
    if (versionmanager_max_number_versions_local_nonprim) {
        config_node_property_integer_free(versionmanager_max_number_versions_local_nonprim);
        versionmanager_max_number_versions_local_nonprim = NULL;
    }
    if (versionmanager_min_number_versions_local_nonprim) {
        config_node_property_integer_free(versionmanager_min_number_versions_local_nonprim);
        versionmanager_min_number_versions_local_nonprim = NULL;
    }
    return NULL;

}
