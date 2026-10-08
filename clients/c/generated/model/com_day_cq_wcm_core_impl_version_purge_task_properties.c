#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_core_impl_version_purge_task_properties.h"



static com_day_cq_wcm_core_impl_version_purge_task_properties_t *com_day_cq_wcm_core_impl_version_purge_task_properties_create_internal(
    config_node_property_array_t *versionpurge_paths,
    config_node_property_boolean_t *versionpurge_recursive,
    config_node_property_integer_t *versionpurge_max_versions,
    config_node_property_integer_t *versionpurge_min_versions,
    config_node_property_integer_t *versionpurge_max_age_days
    ) {
    com_day_cq_wcm_core_impl_version_purge_task_properties_t *com_day_cq_wcm_core_impl_version_purge_task_properties_local_var = malloc(sizeof(com_day_cq_wcm_core_impl_version_purge_task_properties_t));
    if (!com_day_cq_wcm_core_impl_version_purge_task_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_core_impl_version_purge_task_properties_local_var, 0, sizeof(com_day_cq_wcm_core_impl_version_purge_task_properties_t));
    com_day_cq_wcm_core_impl_version_purge_task_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_core_impl_version_purge_task_properties_local_var->versionpurge_paths = versionpurge_paths;
    com_day_cq_wcm_core_impl_version_purge_task_properties_local_var->versionpurge_recursive = versionpurge_recursive;
    com_day_cq_wcm_core_impl_version_purge_task_properties_local_var->versionpurge_max_versions = versionpurge_max_versions;
    com_day_cq_wcm_core_impl_version_purge_task_properties_local_var->versionpurge_min_versions = versionpurge_min_versions;
    com_day_cq_wcm_core_impl_version_purge_task_properties_local_var->versionpurge_max_age_days = versionpurge_max_age_days;
    return com_day_cq_wcm_core_impl_version_purge_task_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_core_impl_version_purge_task_properties_t *com_day_cq_wcm_core_impl_version_purge_task_properties_create(
    config_node_property_array_t *versionpurge_paths,
    config_node_property_boolean_t *versionpurge_recursive,
    config_node_property_integer_t *versionpurge_max_versions,
    config_node_property_integer_t *versionpurge_min_versions,
    config_node_property_integer_t *versionpurge_max_age_days
    ) {
    com_day_cq_wcm_core_impl_version_purge_task_properties_t *result = com_day_cq_wcm_core_impl_version_purge_task_properties_create_internal (
        versionpurge_paths,
        versionpurge_recursive,
        versionpurge_max_versions,
        versionpurge_min_versions,
        versionpurge_max_age_days
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_core_impl_version_purge_task_properties_free(com_day_cq_wcm_core_impl_version_purge_task_properties_t *com_day_cq_wcm_core_impl_version_purge_task_properties) {
    if(NULL == com_day_cq_wcm_core_impl_version_purge_task_properties){
        return ;
    }
    if(com_day_cq_wcm_core_impl_version_purge_task_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_core_impl_version_purge_task_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_paths) {
        config_node_property_array_free(com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_paths);
        com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_paths = NULL;
    }
    if (com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_recursive) {
        config_node_property_boolean_free(com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_recursive);
        com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_recursive = NULL;
    }
    if (com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_max_versions) {
        config_node_property_integer_free(com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_max_versions);
        com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_max_versions = NULL;
    }
    if (com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_min_versions) {
        config_node_property_integer_free(com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_min_versions);
        com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_min_versions = NULL;
    }
    if (com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_max_age_days) {
        config_node_property_integer_free(com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_max_age_days);
        com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_max_age_days = NULL;
    }
    free(com_day_cq_wcm_core_impl_version_purge_task_properties);
}

cJSON *com_day_cq_wcm_core_impl_version_purge_task_properties_convertToJSON(com_day_cq_wcm_core_impl_version_purge_task_properties_t *com_day_cq_wcm_core_impl_version_purge_task_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_paths
    if(com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_paths) {
    cJSON *versionpurge_paths_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_paths);
    if(versionpurge_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "versionpurge.paths", versionpurge_paths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_recursive
    if(com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_recursive) {
    cJSON *versionpurge_recursive_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_recursive);
    if(versionpurge_recursive_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "versionpurge.recursive", versionpurge_recursive_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_max_versions
    if(com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_max_versions) {
    cJSON *versionpurge_max_versions_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_max_versions);
    if(versionpurge_max_versions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "versionpurge.maxVersions", versionpurge_max_versions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_min_versions
    if(com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_min_versions) {
    cJSON *versionpurge_min_versions_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_min_versions);
    if(versionpurge_min_versions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "versionpurge.minVersions", versionpurge_min_versions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_max_age_days
    if(com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_max_age_days) {
    cJSON *versionpurge_max_age_days_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_max_age_days);
    if(versionpurge_max_age_days_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "versionpurge.maxAgeDays", versionpurge_max_age_days_local_JSON);
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

com_day_cq_wcm_core_impl_version_purge_task_properties_t *com_day_cq_wcm_core_impl_version_purge_task_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_version_purge_task_propertiesJSON){

    com_day_cq_wcm_core_impl_version_purge_task_properties_t *com_day_cq_wcm_core_impl_version_purge_task_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_paths
    config_node_property_array_t *versionpurge_paths_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_recursive
    config_node_property_boolean_t *versionpurge_recursive_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_max_versions
    config_node_property_integer_t *versionpurge_max_versions_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_min_versions
    config_node_property_integer_t *versionpurge_min_versions_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_max_age_days
    config_node_property_integer_t *versionpurge_max_age_days_local_nonprim = NULL;

    // com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_paths
    cJSON *versionpurge_paths = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_version_purge_task_propertiesJSON, "versionpurge.paths");
    if (cJSON_IsNull(versionpurge_paths)) {
        versionpurge_paths = NULL;
    }
    if (versionpurge_paths) { 
    versionpurge_paths_local_nonprim = config_node_property_array_parseFromJSON(versionpurge_paths); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_recursive
    cJSON *versionpurge_recursive = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_version_purge_task_propertiesJSON, "versionpurge.recursive");
    if (cJSON_IsNull(versionpurge_recursive)) {
        versionpurge_recursive = NULL;
    }
    if (versionpurge_recursive) { 
    versionpurge_recursive_local_nonprim = config_node_property_boolean_parseFromJSON(versionpurge_recursive); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_max_versions
    cJSON *versionpurge_max_versions = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_version_purge_task_propertiesJSON, "versionpurge.maxVersions");
    if (cJSON_IsNull(versionpurge_max_versions)) {
        versionpurge_max_versions = NULL;
    }
    if (versionpurge_max_versions) { 
    versionpurge_max_versions_local_nonprim = config_node_property_integer_parseFromJSON(versionpurge_max_versions); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_min_versions
    cJSON *versionpurge_min_versions = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_version_purge_task_propertiesJSON, "versionpurge.minVersions");
    if (cJSON_IsNull(versionpurge_min_versions)) {
        versionpurge_min_versions = NULL;
    }
    if (versionpurge_min_versions) { 
    versionpurge_min_versions_local_nonprim = config_node_property_integer_parseFromJSON(versionpurge_min_versions); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_version_purge_task_properties->versionpurge_max_age_days
    cJSON *versionpurge_max_age_days = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_version_purge_task_propertiesJSON, "versionpurge.maxAgeDays");
    if (cJSON_IsNull(versionpurge_max_age_days)) {
        versionpurge_max_age_days = NULL;
    }
    if (versionpurge_max_age_days) { 
    versionpurge_max_age_days_local_nonprim = config_node_property_integer_parseFromJSON(versionpurge_max_age_days); //nonprimitive
    }



    com_day_cq_wcm_core_impl_version_purge_task_properties_local_var = com_day_cq_wcm_core_impl_version_purge_task_properties_create_internal (
        versionpurge_paths ? versionpurge_paths_local_nonprim : NULL,
        versionpurge_recursive ? versionpurge_recursive_local_nonprim : NULL,
        versionpurge_max_versions ? versionpurge_max_versions_local_nonprim : NULL,
        versionpurge_min_versions ? versionpurge_min_versions_local_nonprim : NULL,
        versionpurge_max_age_days ? versionpurge_max_age_days_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_core_impl_version_purge_task_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_core_impl_version_purge_task_properties_local_var;
end:
    if (versionpurge_paths_local_nonprim) {
        config_node_property_array_free(versionpurge_paths_local_nonprim);
        versionpurge_paths_local_nonprim = NULL;
    }
    if (versionpurge_recursive_local_nonprim) {
        config_node_property_boolean_free(versionpurge_recursive_local_nonprim);
        versionpurge_recursive_local_nonprim = NULL;
    }
    if (versionpurge_max_versions_local_nonprim) {
        config_node_property_integer_free(versionpurge_max_versions_local_nonprim);
        versionpurge_max_versions_local_nonprim = NULL;
    }
    if (versionpurge_min_versions_local_nonprim) {
        config_node_property_integer_free(versionpurge_min_versions_local_nonprim);
        versionpurge_min_versions_local_nonprim = NULL;
    }
    if (versionpurge_max_age_days_local_nonprim) {
        config_node_property_integer_free(versionpurge_max_age_days_local_nonprim);
        versionpurge_max_age_days_local_nonprim = NULL;
    }
    return NULL;

}
