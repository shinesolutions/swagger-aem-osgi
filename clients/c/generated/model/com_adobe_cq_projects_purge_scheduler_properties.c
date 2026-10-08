#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_projects_purge_scheduler_properties.h"



static com_adobe_cq_projects_purge_scheduler_properties_t *com_adobe_cq_projects_purge_scheduler_properties_create_internal(
    config_node_property_string_t *scheduledpurge_name,
    config_node_property_boolean_t *scheduledpurge_purge_active,
    config_node_property_array_t *scheduledpurge_templates,
    config_node_property_boolean_t *scheduledpurge_purge_groups,
    config_node_property_boolean_t *scheduledpurge_purge_assets,
    config_node_property_boolean_t *scheduledpurge_terminate_running_workflows,
    config_node_property_integer_t *scheduledpurge_daysold,
    config_node_property_integer_t *scheduledpurge_save_threshold
    ) {
    com_adobe_cq_projects_purge_scheduler_properties_t *com_adobe_cq_projects_purge_scheduler_properties_local_var = malloc(sizeof(com_adobe_cq_projects_purge_scheduler_properties_t));
    if (!com_adobe_cq_projects_purge_scheduler_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_projects_purge_scheduler_properties_local_var, 0, sizeof(com_adobe_cq_projects_purge_scheduler_properties_t));
    com_adobe_cq_projects_purge_scheduler_properties_local_var->_library_owned = 1;
    com_adobe_cq_projects_purge_scheduler_properties_local_var->scheduledpurge_name = scheduledpurge_name;
    com_adobe_cq_projects_purge_scheduler_properties_local_var->scheduledpurge_purge_active = scheduledpurge_purge_active;
    com_adobe_cq_projects_purge_scheduler_properties_local_var->scheduledpurge_templates = scheduledpurge_templates;
    com_adobe_cq_projects_purge_scheduler_properties_local_var->scheduledpurge_purge_groups = scheduledpurge_purge_groups;
    com_adobe_cq_projects_purge_scheduler_properties_local_var->scheduledpurge_purge_assets = scheduledpurge_purge_assets;
    com_adobe_cq_projects_purge_scheduler_properties_local_var->scheduledpurge_terminate_running_workflows = scheduledpurge_terminate_running_workflows;
    com_adobe_cq_projects_purge_scheduler_properties_local_var->scheduledpurge_daysold = scheduledpurge_daysold;
    com_adobe_cq_projects_purge_scheduler_properties_local_var->scheduledpurge_save_threshold = scheduledpurge_save_threshold;
    return com_adobe_cq_projects_purge_scheduler_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_projects_purge_scheduler_properties_t *com_adobe_cq_projects_purge_scheduler_properties_create(
    config_node_property_string_t *scheduledpurge_name,
    config_node_property_boolean_t *scheduledpurge_purge_active,
    config_node_property_array_t *scheduledpurge_templates,
    config_node_property_boolean_t *scheduledpurge_purge_groups,
    config_node_property_boolean_t *scheduledpurge_purge_assets,
    config_node_property_boolean_t *scheduledpurge_terminate_running_workflows,
    config_node_property_integer_t *scheduledpurge_daysold,
    config_node_property_integer_t *scheduledpurge_save_threshold
    ) {
    com_adobe_cq_projects_purge_scheduler_properties_t *result = com_adobe_cq_projects_purge_scheduler_properties_create_internal (
        scheduledpurge_name,
        scheduledpurge_purge_active,
        scheduledpurge_templates,
        scheduledpurge_purge_groups,
        scheduledpurge_purge_assets,
        scheduledpurge_terminate_running_workflows,
        scheduledpurge_daysold,
        scheduledpurge_save_threshold
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_projects_purge_scheduler_properties_free(com_adobe_cq_projects_purge_scheduler_properties_t *com_adobe_cq_projects_purge_scheduler_properties) {
    if(NULL == com_adobe_cq_projects_purge_scheduler_properties){
        return ;
    }
    if(com_adobe_cq_projects_purge_scheduler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_projects_purge_scheduler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_name) {
        config_node_property_string_free(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_name);
        com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_name = NULL;
    }
    if (com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_active) {
        config_node_property_boolean_free(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_active);
        com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_active = NULL;
    }
    if (com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_templates) {
        config_node_property_array_free(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_templates);
        com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_templates = NULL;
    }
    if (com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_groups) {
        config_node_property_boolean_free(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_groups);
        com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_groups = NULL;
    }
    if (com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_assets) {
        config_node_property_boolean_free(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_assets);
        com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_assets = NULL;
    }
    if (com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_terminate_running_workflows) {
        config_node_property_boolean_free(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_terminate_running_workflows);
        com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_terminate_running_workflows = NULL;
    }
    if (com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_daysold) {
        config_node_property_integer_free(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_daysold);
        com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_daysold = NULL;
    }
    if (com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_save_threshold) {
        config_node_property_integer_free(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_save_threshold);
        com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_save_threshold = NULL;
    }
    free(com_adobe_cq_projects_purge_scheduler_properties);
}

cJSON *com_adobe_cq_projects_purge_scheduler_properties_convertToJSON(com_adobe_cq_projects_purge_scheduler_properties_t *com_adobe_cq_projects_purge_scheduler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_name
    if(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_name) {
    cJSON *scheduledpurge_name_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_name);
    if(scheduledpurge_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduledpurge.name", scheduledpurge_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_active
    if(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_active) {
    cJSON *scheduledpurge_purge_active_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_active);
    if(scheduledpurge_purge_active_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduledpurge.purgeActive", scheduledpurge_purge_active_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_templates
    if(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_templates) {
    cJSON *scheduledpurge_templates_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_templates);
    if(scheduledpurge_templates_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduledpurge.templates", scheduledpurge_templates_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_groups
    if(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_groups) {
    cJSON *scheduledpurge_purge_groups_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_groups);
    if(scheduledpurge_purge_groups_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduledpurge.purgeGroups", scheduledpurge_purge_groups_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_assets
    if(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_assets) {
    cJSON *scheduledpurge_purge_assets_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_assets);
    if(scheduledpurge_purge_assets_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduledpurge.purgeAssets", scheduledpurge_purge_assets_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_terminate_running_workflows
    if(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_terminate_running_workflows) {
    cJSON *scheduledpurge_terminate_running_workflows_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_terminate_running_workflows);
    if(scheduledpurge_terminate_running_workflows_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduledpurge.terminateRunningWorkflows", scheduledpurge_terminate_running_workflows_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_daysold
    if(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_daysold) {
    cJSON *scheduledpurge_daysold_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_daysold);
    if(scheduledpurge_daysold_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduledpurge.daysold", scheduledpurge_daysold_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_save_threshold
    if(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_save_threshold) {
    cJSON *scheduledpurge_save_threshold_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_save_threshold);
    if(scheduledpurge_save_threshold_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scheduledpurge.saveThreshold", scheduledpurge_save_threshold_local_JSON);
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

com_adobe_cq_projects_purge_scheduler_properties_t *com_adobe_cq_projects_purge_scheduler_properties_parseFromJSON(cJSON *com_adobe_cq_projects_purge_scheduler_propertiesJSON){

    com_adobe_cq_projects_purge_scheduler_properties_t *com_adobe_cq_projects_purge_scheduler_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_name
    config_node_property_string_t *scheduledpurge_name_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_active
    config_node_property_boolean_t *scheduledpurge_purge_active_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_templates
    config_node_property_array_t *scheduledpurge_templates_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_groups
    config_node_property_boolean_t *scheduledpurge_purge_groups_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_assets
    config_node_property_boolean_t *scheduledpurge_purge_assets_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_terminate_running_workflows
    config_node_property_boolean_t *scheduledpurge_terminate_running_workflows_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_daysold
    config_node_property_integer_t *scheduledpurge_daysold_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_save_threshold
    config_node_property_integer_t *scheduledpurge_save_threshold_local_nonprim = NULL;

    // com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_name
    cJSON *scheduledpurge_name = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_projects_purge_scheduler_propertiesJSON, "scheduledpurge.name");
    if (cJSON_IsNull(scheduledpurge_name)) {
        scheduledpurge_name = NULL;
    }
    if (scheduledpurge_name) { 
    scheduledpurge_name_local_nonprim = config_node_property_string_parseFromJSON(scheduledpurge_name); //nonprimitive
    }

    // com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_active
    cJSON *scheduledpurge_purge_active = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_projects_purge_scheduler_propertiesJSON, "scheduledpurge.purgeActive");
    if (cJSON_IsNull(scheduledpurge_purge_active)) {
        scheduledpurge_purge_active = NULL;
    }
    if (scheduledpurge_purge_active) { 
    scheduledpurge_purge_active_local_nonprim = config_node_property_boolean_parseFromJSON(scheduledpurge_purge_active); //nonprimitive
    }

    // com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_templates
    cJSON *scheduledpurge_templates = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_projects_purge_scheduler_propertiesJSON, "scheduledpurge.templates");
    if (cJSON_IsNull(scheduledpurge_templates)) {
        scheduledpurge_templates = NULL;
    }
    if (scheduledpurge_templates) { 
    scheduledpurge_templates_local_nonprim = config_node_property_array_parseFromJSON(scheduledpurge_templates); //nonprimitive
    }

    // com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_groups
    cJSON *scheduledpurge_purge_groups = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_projects_purge_scheduler_propertiesJSON, "scheduledpurge.purgeGroups");
    if (cJSON_IsNull(scheduledpurge_purge_groups)) {
        scheduledpurge_purge_groups = NULL;
    }
    if (scheduledpurge_purge_groups) { 
    scheduledpurge_purge_groups_local_nonprim = config_node_property_boolean_parseFromJSON(scheduledpurge_purge_groups); //nonprimitive
    }

    // com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_purge_assets
    cJSON *scheduledpurge_purge_assets = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_projects_purge_scheduler_propertiesJSON, "scheduledpurge.purgeAssets");
    if (cJSON_IsNull(scheduledpurge_purge_assets)) {
        scheduledpurge_purge_assets = NULL;
    }
    if (scheduledpurge_purge_assets) { 
    scheduledpurge_purge_assets_local_nonprim = config_node_property_boolean_parseFromJSON(scheduledpurge_purge_assets); //nonprimitive
    }

    // com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_terminate_running_workflows
    cJSON *scheduledpurge_terminate_running_workflows = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_projects_purge_scheduler_propertiesJSON, "scheduledpurge.terminateRunningWorkflows");
    if (cJSON_IsNull(scheduledpurge_terminate_running_workflows)) {
        scheduledpurge_terminate_running_workflows = NULL;
    }
    if (scheduledpurge_terminate_running_workflows) { 
    scheduledpurge_terminate_running_workflows_local_nonprim = config_node_property_boolean_parseFromJSON(scheduledpurge_terminate_running_workflows); //nonprimitive
    }

    // com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_daysold
    cJSON *scheduledpurge_daysold = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_projects_purge_scheduler_propertiesJSON, "scheduledpurge.daysold");
    if (cJSON_IsNull(scheduledpurge_daysold)) {
        scheduledpurge_daysold = NULL;
    }
    if (scheduledpurge_daysold) { 
    scheduledpurge_daysold_local_nonprim = config_node_property_integer_parseFromJSON(scheduledpurge_daysold); //nonprimitive
    }

    // com_adobe_cq_projects_purge_scheduler_properties->scheduledpurge_save_threshold
    cJSON *scheduledpurge_save_threshold = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_projects_purge_scheduler_propertiesJSON, "scheduledpurge.saveThreshold");
    if (cJSON_IsNull(scheduledpurge_save_threshold)) {
        scheduledpurge_save_threshold = NULL;
    }
    if (scheduledpurge_save_threshold) { 
    scheduledpurge_save_threshold_local_nonprim = config_node_property_integer_parseFromJSON(scheduledpurge_save_threshold); //nonprimitive
    }



    com_adobe_cq_projects_purge_scheduler_properties_local_var = com_adobe_cq_projects_purge_scheduler_properties_create_internal (
        scheduledpurge_name ? scheduledpurge_name_local_nonprim : NULL,
        scheduledpurge_purge_active ? scheduledpurge_purge_active_local_nonprim : NULL,
        scheduledpurge_templates ? scheduledpurge_templates_local_nonprim : NULL,
        scheduledpurge_purge_groups ? scheduledpurge_purge_groups_local_nonprim : NULL,
        scheduledpurge_purge_assets ? scheduledpurge_purge_assets_local_nonprim : NULL,
        scheduledpurge_terminate_running_workflows ? scheduledpurge_terminate_running_workflows_local_nonprim : NULL,
        scheduledpurge_daysold ? scheduledpurge_daysold_local_nonprim : NULL,
        scheduledpurge_save_threshold ? scheduledpurge_save_threshold_local_nonprim : NULL
        );

    if (!com_adobe_cq_projects_purge_scheduler_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_projects_purge_scheduler_properties_local_var;
end:
    if (scheduledpurge_name_local_nonprim) {
        config_node_property_string_free(scheduledpurge_name_local_nonprim);
        scheduledpurge_name_local_nonprim = NULL;
    }
    if (scheduledpurge_purge_active_local_nonprim) {
        config_node_property_boolean_free(scheduledpurge_purge_active_local_nonprim);
        scheduledpurge_purge_active_local_nonprim = NULL;
    }
    if (scheduledpurge_templates_local_nonprim) {
        config_node_property_array_free(scheduledpurge_templates_local_nonprim);
        scheduledpurge_templates_local_nonprim = NULL;
    }
    if (scheduledpurge_purge_groups_local_nonprim) {
        config_node_property_boolean_free(scheduledpurge_purge_groups_local_nonprim);
        scheduledpurge_purge_groups_local_nonprim = NULL;
    }
    if (scheduledpurge_purge_assets_local_nonprim) {
        config_node_property_boolean_free(scheduledpurge_purge_assets_local_nonprim);
        scheduledpurge_purge_assets_local_nonprim = NULL;
    }
    if (scheduledpurge_terminate_running_workflows_local_nonprim) {
        config_node_property_boolean_free(scheduledpurge_terminate_running_workflows_local_nonprim);
        scheduledpurge_terminate_running_workflows_local_nonprim = NULL;
    }
    if (scheduledpurge_daysold_local_nonprim) {
        config_node_property_integer_free(scheduledpurge_daysold_local_nonprim);
        scheduledpurge_daysold_local_nonprim = NULL;
    }
    if (scheduledpurge_save_threshold_local_nonprim) {
        config_node_property_integer_free(scheduledpurge_save_threshold_local_nonprim);
        scheduledpurge_save_threshold_local_nonprim = NULL;
    }
    return NULL;

}
