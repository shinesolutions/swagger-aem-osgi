#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties.h"



static com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_t *com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_create_internal(
    config_node_property_string_t *effective_bundle_list_path
    ) {
    com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_t *com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_local_var = malloc(sizeof(com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_t));
    if (!com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_local_var, 0, sizeof(com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_t));
    com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_local_var->_library_owned = 1;
    com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_local_var->effective_bundle_list_path = effective_bundle_list_path;
    return com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_t *com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_create(
    config_node_property_string_t *effective_bundle_list_path
    ) {
    com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_t *result = com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_create_internal (
        effective_bundle_list_path
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_free(com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_t *com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties) {
    if(NULL == com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties){
        return ;
    }
    if(com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties->effective_bundle_list_path) {
        config_node_property_string_free(com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties->effective_bundle_list_path);
        com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties->effective_bundle_list_path = NULL;
    }
    free(com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties);
}

cJSON *com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_convertToJSON(com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_t *com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties->effective_bundle_list_path
    if(com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties->effective_bundle_list_path) {
    cJSON *effective_bundle_list_path_local_JSON = config_node_property_string_convertToJSON(com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties->effective_bundle_list_path);
    if(effective_bundle_list_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "effectiveBundleListPath", effective_bundle_list_path_local_JSON);
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

com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_t *com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_parseFromJSON(cJSON *com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_propertiesJSON){

    com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_t *com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_local_var = NULL;

    // define the local variable for com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties->effective_bundle_list_path
    config_node_property_string_t *effective_bundle_list_path_local_nonprim = NULL;

    // com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties->effective_bundle_list_path
    cJSON *effective_bundle_list_path = cJSON_GetObjectItemCaseSensitive(com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_propertiesJSON, "effectiveBundleListPath");
    if (cJSON_IsNull(effective_bundle_list_path)) {
        effective_bundle_list_path = NULL;
    }
    if (effective_bundle_list_path) { 
    effective_bundle_list_path_local_nonprim = config_node_property_string_parseFromJSON(effective_bundle_list_path); //nonprimitive
    }



    com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_local_var = com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_create_internal (
        effective_bundle_list_path ? effective_bundle_list_path_local_nonprim : NULL
        );

    if (!com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_local_var) {
        goto end;
    }

    return com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_properties_local_var;
end:
    if (effective_bundle_list_path_local_nonprim) {
        config_node_property_string_free(effective_bundle_list_path_local_nonprim);
        effective_bundle_list_path_local_nonprim = NULL;
    }
    return NULL;

}
