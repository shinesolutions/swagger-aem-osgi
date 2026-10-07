#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties.h"



static com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_t *com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_create_internal(
    config_node_property_array_t *pre_upgrade_maintenance_tasks,
    config_node_property_array_t *pre_upgrade_hc_tags
    ) {
    com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_t *com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_local_var = malloc(sizeof(com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_t));
    if (!com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_local_var, 0, sizeof(com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_t));
    com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_local_var->_library_owned = 1;
    com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_local_var->pre_upgrade_maintenance_tasks = pre_upgrade_maintenance_tasks;
    com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_local_var->pre_upgrade_hc_tags = pre_upgrade_hc_tags;
    return com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_t *com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_create(
    config_node_property_array_t *pre_upgrade_maintenance_tasks,
    config_node_property_array_t *pre_upgrade_hc_tags
    ) {
    com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_t *result = com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_create_internal (
        pre_upgrade_maintenance_tasks,
        pre_upgrade_hc_tags
        );
    if (!result) {
    }
    return result;
}

void com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_free(com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_t *com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties) {
    if(NULL == com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties){
        return ;
    }
    if(com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties->pre_upgrade_maintenance_tasks) {
        config_node_property_array_free(com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties->pre_upgrade_maintenance_tasks);
        com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties->pre_upgrade_maintenance_tasks = NULL;
    }
    if (com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties->pre_upgrade_hc_tags) {
        config_node_property_array_free(com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties->pre_upgrade_hc_tags);
        com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties->pre_upgrade_hc_tags = NULL;
    }
    free(com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties);
}

cJSON *com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_convertToJSON(com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_t *com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties->pre_upgrade_maintenance_tasks
    if(com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties->pre_upgrade_maintenance_tasks) {
    cJSON *pre_upgrade_maintenance_tasks_local_JSON = config_node_property_array_convertToJSON(com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties->pre_upgrade_maintenance_tasks);
    if(pre_upgrade_maintenance_tasks_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pre-upgrade.maintenance.tasks", pre_upgrade_maintenance_tasks_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties->pre_upgrade_hc_tags
    if(com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties->pre_upgrade_hc_tags) {
    cJSON *pre_upgrade_hc_tags_local_JSON = config_node_property_array_convertToJSON(com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties->pre_upgrade_hc_tags);
    if(pre_upgrade_hc_tags_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "pre-upgrade.hc.tags", pre_upgrade_hc_tags_local_JSON);
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

com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_t *com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_parseFromJSON(cJSON *com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_propertiesJSON){

    com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_t *com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties->pre_upgrade_maintenance_tasks
    config_node_property_array_t *pre_upgrade_maintenance_tasks_local_nonprim = NULL;

    // define the local variable for com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties->pre_upgrade_hc_tags
    config_node_property_array_t *pre_upgrade_hc_tags_local_nonprim = NULL;

    // com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties->pre_upgrade_maintenance_tasks
    cJSON *pre_upgrade_maintenance_tasks = cJSON_GetObjectItemCaseSensitive(com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_propertiesJSON, "pre-upgrade.maintenance.tasks");
    if (cJSON_IsNull(pre_upgrade_maintenance_tasks)) {
        pre_upgrade_maintenance_tasks = NULL;
    }
    if (pre_upgrade_maintenance_tasks) { 
    pre_upgrade_maintenance_tasks_local_nonprim = config_node_property_array_parseFromJSON(pre_upgrade_maintenance_tasks); //nonprimitive
    }

    // com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties->pre_upgrade_hc_tags
    cJSON *pre_upgrade_hc_tags = cJSON_GetObjectItemCaseSensitive(com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_propertiesJSON, "pre-upgrade.hc.tags");
    if (cJSON_IsNull(pre_upgrade_hc_tags)) {
        pre_upgrade_hc_tags = NULL;
    }
    if (pre_upgrade_hc_tags) { 
    pre_upgrade_hc_tags_local_nonprim = config_node_property_array_parseFromJSON(pre_upgrade_hc_tags); //nonprimitive
    }



    com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_local_var = com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_create_internal (
        pre_upgrade_maintenance_tasks ? pre_upgrade_maintenance_tasks_local_nonprim : NULL,
        pre_upgrade_hc_tags ? pre_upgrade_hc_tags_local_nonprim : NULL
        );

    if (!com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties_local_var;
end:
    if (pre_upgrade_maintenance_tasks_local_nonprim) {
        config_node_property_array_free(pre_upgrade_maintenance_tasks_local_nonprim);
        pre_upgrade_maintenance_tasks_local_nonprim = NULL;
    }
    if (pre_upgrade_hc_tags_local_nonprim) {
        config_node_property_array_free(pre_upgrade_hc_tags_local_nonprim);
        pre_upgrade_hc_tags_local_nonprim = NULL;
    }
    return NULL;

}
