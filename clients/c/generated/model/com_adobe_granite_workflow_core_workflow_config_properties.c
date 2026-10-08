#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_workflow_core_workflow_config_properties.h"



static com_adobe_granite_workflow_core_workflow_config_properties_t *com_adobe_granite_workflow_core_workflow_config_properties_create_internal(
    config_node_property_array_t *cq_workflow_config_workflow_packages_root_path,
    config_node_property_boolean_t *cq_workflow_config_workflow_process_legacy_mode,
    config_node_property_boolean_t *cq_workflow_config_allow_locking
    ) {
    com_adobe_granite_workflow_core_workflow_config_properties_t *com_adobe_granite_workflow_core_workflow_config_properties_local_var = malloc(sizeof(com_adobe_granite_workflow_core_workflow_config_properties_t));
    if (!com_adobe_granite_workflow_core_workflow_config_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_workflow_core_workflow_config_properties_local_var, 0, sizeof(com_adobe_granite_workflow_core_workflow_config_properties_t));
    com_adobe_granite_workflow_core_workflow_config_properties_local_var->_library_owned = 1;
    com_adobe_granite_workflow_core_workflow_config_properties_local_var->cq_workflow_config_workflow_packages_root_path = cq_workflow_config_workflow_packages_root_path;
    com_adobe_granite_workflow_core_workflow_config_properties_local_var->cq_workflow_config_workflow_process_legacy_mode = cq_workflow_config_workflow_process_legacy_mode;
    com_adobe_granite_workflow_core_workflow_config_properties_local_var->cq_workflow_config_allow_locking = cq_workflow_config_allow_locking;
    return com_adobe_granite_workflow_core_workflow_config_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_workflow_core_workflow_config_properties_t *com_adobe_granite_workflow_core_workflow_config_properties_create(
    config_node_property_array_t *cq_workflow_config_workflow_packages_root_path,
    config_node_property_boolean_t *cq_workflow_config_workflow_process_legacy_mode,
    config_node_property_boolean_t *cq_workflow_config_allow_locking
    ) {
    com_adobe_granite_workflow_core_workflow_config_properties_t *result = com_adobe_granite_workflow_core_workflow_config_properties_create_internal (
        cq_workflow_config_workflow_packages_root_path,
        cq_workflow_config_workflow_process_legacy_mode,
        cq_workflow_config_allow_locking
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_workflow_core_workflow_config_properties_free(com_adobe_granite_workflow_core_workflow_config_properties_t *com_adobe_granite_workflow_core_workflow_config_properties) {
    if(NULL == com_adobe_granite_workflow_core_workflow_config_properties){
        return ;
    }
    if(com_adobe_granite_workflow_core_workflow_config_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_workflow_core_workflow_config_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_workflow_packages_root_path) {
        config_node_property_array_free(com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_workflow_packages_root_path);
        com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_workflow_packages_root_path = NULL;
    }
    if (com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_workflow_process_legacy_mode) {
        config_node_property_boolean_free(com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_workflow_process_legacy_mode);
        com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_workflow_process_legacy_mode = NULL;
    }
    if (com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_allow_locking) {
        config_node_property_boolean_free(com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_allow_locking);
        com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_allow_locking = NULL;
    }
    free(com_adobe_granite_workflow_core_workflow_config_properties);
}

cJSON *com_adobe_granite_workflow_core_workflow_config_properties_convertToJSON(com_adobe_granite_workflow_core_workflow_config_properties_t *com_adobe_granite_workflow_core_workflow_config_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_workflow_packages_root_path
    if(com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_workflow_packages_root_path) {
    cJSON *cq_workflow_config_workflow_packages_root_path_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_workflow_packages_root_path);
    if(cq_workflow_config_workflow_packages_root_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.workflow.config.workflow.packages.root.path", cq_workflow_config_workflow_packages_root_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_workflow_process_legacy_mode
    if(com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_workflow_process_legacy_mode) {
    cJSON *cq_workflow_config_workflow_process_legacy_mode_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_workflow_process_legacy_mode);
    if(cq_workflow_config_workflow_process_legacy_mode_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.workflow.config.workflow.process.legacy.mode", cq_workflow_config_workflow_process_legacy_mode_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_allow_locking
    if(com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_allow_locking) {
    cJSON *cq_workflow_config_allow_locking_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_allow_locking);
    if(cq_workflow_config_allow_locking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.workflow.config.allow.locking", cq_workflow_config_allow_locking_local_JSON);
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

com_adobe_granite_workflow_core_workflow_config_properties_t *com_adobe_granite_workflow_core_workflow_config_properties_parseFromJSON(cJSON *com_adobe_granite_workflow_core_workflow_config_propertiesJSON){

    com_adobe_granite_workflow_core_workflow_config_properties_t *com_adobe_granite_workflow_core_workflow_config_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_workflow_packages_root_path
    config_node_property_array_t *cq_workflow_config_workflow_packages_root_path_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_workflow_process_legacy_mode
    config_node_property_boolean_t *cq_workflow_config_workflow_process_legacy_mode_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_allow_locking
    config_node_property_boolean_t *cq_workflow_config_allow_locking_local_nonprim = NULL;

    // com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_workflow_packages_root_path
    cJSON *cq_workflow_config_workflow_packages_root_path = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_core_workflow_config_propertiesJSON, "cq.workflow.config.workflow.packages.root.path");
    if (cJSON_IsNull(cq_workflow_config_workflow_packages_root_path)) {
        cq_workflow_config_workflow_packages_root_path = NULL;
    }
    if (cq_workflow_config_workflow_packages_root_path) { 
    cq_workflow_config_workflow_packages_root_path_local_nonprim = config_node_property_array_parseFromJSON(cq_workflow_config_workflow_packages_root_path); //nonprimitive
    }

    // com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_workflow_process_legacy_mode
    cJSON *cq_workflow_config_workflow_process_legacy_mode = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_core_workflow_config_propertiesJSON, "cq.workflow.config.workflow.process.legacy.mode");
    if (cJSON_IsNull(cq_workflow_config_workflow_process_legacy_mode)) {
        cq_workflow_config_workflow_process_legacy_mode = NULL;
    }
    if (cq_workflow_config_workflow_process_legacy_mode) { 
    cq_workflow_config_workflow_process_legacy_mode_local_nonprim = config_node_property_boolean_parseFromJSON(cq_workflow_config_workflow_process_legacy_mode); //nonprimitive
    }

    // com_adobe_granite_workflow_core_workflow_config_properties->cq_workflow_config_allow_locking
    cJSON *cq_workflow_config_allow_locking = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_workflow_core_workflow_config_propertiesJSON, "cq.workflow.config.allow.locking");
    if (cJSON_IsNull(cq_workflow_config_allow_locking)) {
        cq_workflow_config_allow_locking = NULL;
    }
    if (cq_workflow_config_allow_locking) { 
    cq_workflow_config_allow_locking_local_nonprim = config_node_property_boolean_parseFromJSON(cq_workflow_config_allow_locking); //nonprimitive
    }



    com_adobe_granite_workflow_core_workflow_config_properties_local_var = com_adobe_granite_workflow_core_workflow_config_properties_create_internal (
        cq_workflow_config_workflow_packages_root_path ? cq_workflow_config_workflow_packages_root_path_local_nonprim : NULL,
        cq_workflow_config_workflow_process_legacy_mode ? cq_workflow_config_workflow_process_legacy_mode_local_nonprim : NULL,
        cq_workflow_config_allow_locking ? cq_workflow_config_allow_locking_local_nonprim : NULL
        );

    if (!com_adobe_granite_workflow_core_workflow_config_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_workflow_core_workflow_config_properties_local_var;
end:
    if (cq_workflow_config_workflow_packages_root_path_local_nonprim) {
        config_node_property_array_free(cq_workflow_config_workflow_packages_root_path_local_nonprim);
        cq_workflow_config_workflow_packages_root_path_local_nonprim = NULL;
    }
    if (cq_workflow_config_workflow_process_legacy_mode_local_nonprim) {
        config_node_property_boolean_free(cq_workflow_config_workflow_process_legacy_mode_local_nonprim);
        cq_workflow_config_workflow_process_legacy_mode_local_nonprim = NULL;
    }
    if (cq_workflow_config_allow_locking_local_nonprim) {
        config_node_property_boolean_free(cq_workflow_config_allow_locking_local_nonprim);
        cq_workflow_config_allow_locking_local_nonprim = NULL;
    }
    return NULL;

}
