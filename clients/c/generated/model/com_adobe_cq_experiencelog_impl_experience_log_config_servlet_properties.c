#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties.h"



static com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_t *com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_create_internal(
    config_node_property_boolean_t *enabled,
    config_node_property_array_t *disabled_for_groups
    ) {
    com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_t *com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_local_var = malloc(sizeof(com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_t));
    if (!com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_local_var, 0, sizeof(com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_t));
    com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_local_var->_library_owned = 1;
    com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_local_var->enabled = enabled;
    com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_local_var->disabled_for_groups = disabled_for_groups;
    return com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_t *com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_create(
    config_node_property_boolean_t *enabled,
    config_node_property_array_t *disabled_for_groups
    ) {
    com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_t *result = com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_create_internal (
        enabled,
        disabled_for_groups
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_free(com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_t *com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties) {
    if(NULL == com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties){
        return ;
    }
    if(com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties->enabled) {
        config_node_property_boolean_free(com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties->enabled);
        com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties->enabled = NULL;
    }
    if (com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties->disabled_for_groups) {
        config_node_property_array_free(com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties->disabled_for_groups);
        com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties->disabled_for_groups = NULL;
    }
    free(com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties);
}

cJSON *com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_convertToJSON(com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_t *com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties->enabled
    if(com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties->enabled) {
    cJSON *enabled_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties->enabled);
    if(enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enabled", enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties->disabled_for_groups
    if(com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties->disabled_for_groups) {
    cJSON *disabled_for_groups_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties->disabled_for_groups);
    if(disabled_for_groups_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "disabledForGroups", disabled_for_groups_local_JSON);
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

com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_t *com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_parseFromJSON(cJSON *com_adobe_cq_experiencelog_impl_experience_log_config_servlet_propertiesJSON){

    com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_t *com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties->enabled
    config_node_property_boolean_t *enabled_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties->disabled_for_groups
    config_node_property_array_t *disabled_for_groups_local_nonprim = NULL;

    // com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties->enabled
    cJSON *enabled = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_experiencelog_impl_experience_log_config_servlet_propertiesJSON, "enabled");
    if (cJSON_IsNull(enabled)) {
        enabled = NULL;
    }
    if (enabled) { 
    enabled_local_nonprim = config_node_property_boolean_parseFromJSON(enabled); //nonprimitive
    }

    // com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties->disabled_for_groups
    cJSON *disabled_for_groups = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_experiencelog_impl_experience_log_config_servlet_propertiesJSON, "disabledForGroups");
    if (cJSON_IsNull(disabled_for_groups)) {
        disabled_for_groups = NULL;
    }
    if (disabled_for_groups) { 
    disabled_for_groups_local_nonprim = config_node_property_array_parseFromJSON(disabled_for_groups); //nonprimitive
    }



    com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_local_var = com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_create_internal (
        enabled ? enabled_local_nonprim : NULL,
        disabled_for_groups ? disabled_for_groups_local_nonprim : NULL
        );

    if (!com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_experiencelog_impl_experience_log_config_servlet_properties_local_var;
end:
    if (enabled_local_nonprim) {
        config_node_property_boolean_free(enabled_local_nonprim);
        enabled_local_nonprim = NULL;
    }
    if (disabled_for_groups_local_nonprim) {
        config_node_property_array_free(disabled_for_groups_local_nonprim);
        disabled_for_groups_local_nonprim = NULL;
    }
    return NULL;

}
