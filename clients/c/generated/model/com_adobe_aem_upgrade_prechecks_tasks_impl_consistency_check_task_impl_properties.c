#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties.h"



static com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_t *com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_create_internal(
    config_node_property_string_t *root_path,
    config_node_property_boolean_t *fix_inconsistencies
    ) {
    com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_t *com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_local_var = malloc(sizeof(com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_t));
    if (!com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_local_var, 0, sizeof(com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_t));
    com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_local_var->_library_owned = 1;
    com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_local_var->root_path = root_path;
    com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_local_var->fix_inconsistencies = fix_inconsistencies;
    return com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_t *com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_create(
    config_node_property_string_t *root_path,
    config_node_property_boolean_t *fix_inconsistencies
    ) {
    com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_t *result = com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_create_internal (
        root_path,
        fix_inconsistencies
        );
    if (!result) {
    }
    return result;
}

void com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_free(com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_t *com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties) {
    if(NULL == com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties){
        return ;
    }
    if(com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties->root_path) {
        config_node_property_string_free(com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties->root_path);
        com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties->root_path = NULL;
    }
    if (com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties->fix_inconsistencies) {
        config_node_property_boolean_free(com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties->fix_inconsistencies);
        com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties->fix_inconsistencies = NULL;
    }
    free(com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties);
}

cJSON *com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_convertToJSON(com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_t *com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties->root_path
    if(com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties->root_path) {
    cJSON *root_path_local_JSON = config_node_property_string_convertToJSON(com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties->root_path);
    if(root_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "root.path", root_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties->fix_inconsistencies
    if(com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties->fix_inconsistencies) {
    cJSON *fix_inconsistencies_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties->fix_inconsistencies);
    if(fix_inconsistencies_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "fix.inconsistencies", fix_inconsistencies_local_JSON);
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

com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_t *com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_parseFromJSON(cJSON *com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_propertiesJSON){

    com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_t *com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties->root_path
    config_node_property_string_t *root_path_local_nonprim = NULL;

    // define the local variable for com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties->fix_inconsistencies
    config_node_property_boolean_t *fix_inconsistencies_local_nonprim = NULL;

    // com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties->root_path
    cJSON *root_path = cJSON_GetObjectItemCaseSensitive(com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_propertiesJSON, "root.path");
    if (cJSON_IsNull(root_path)) {
        root_path = NULL;
    }
    if (root_path) { 
    root_path_local_nonprim = config_node_property_string_parseFromJSON(root_path); //nonprimitive
    }

    // com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties->fix_inconsistencies
    cJSON *fix_inconsistencies = cJSON_GetObjectItemCaseSensitive(com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_propertiesJSON, "fix.inconsistencies");
    if (cJSON_IsNull(fix_inconsistencies)) {
        fix_inconsistencies = NULL;
    }
    if (fix_inconsistencies) { 
    fix_inconsistencies_local_nonprim = config_node_property_boolean_parseFromJSON(fix_inconsistencies); //nonprimitive
    }



    com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_local_var = com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_create_internal (
        root_path ? root_path_local_nonprim : NULL,
        fix_inconsistencies ? fix_inconsistencies_local_nonprim : NULL
        );

    if (!com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties_local_var;
end:
    if (root_path_local_nonprim) {
        config_node_property_string_free(root_path_local_nonprim);
        root_path_local_nonprim = NULL;
    }
    if (fix_inconsistencies_local_nonprim) {
        config_node_property_boolean_free(fix_inconsistencies_local_nonprim);
        fix_inconsistencies_local_nonprim = NULL;
    }
    return NULL;

}
