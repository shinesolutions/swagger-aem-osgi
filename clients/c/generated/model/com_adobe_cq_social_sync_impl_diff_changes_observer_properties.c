#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_sync_impl_diff_changes_observer_properties.h"



static com_adobe_cq_social_sync_impl_diff_changes_observer_properties_t *com_adobe_cq_social_sync_impl_diff_changes_observer_properties_create_internal(
    config_node_property_boolean_t *enabled,
    config_node_property_string_t *agent_name,
    config_node_property_string_t *diff_path,
    config_node_property_string_t *property_names
    ) {
    com_adobe_cq_social_sync_impl_diff_changes_observer_properties_t *com_adobe_cq_social_sync_impl_diff_changes_observer_properties_local_var = malloc(sizeof(com_adobe_cq_social_sync_impl_diff_changes_observer_properties_t));
    if (!com_adobe_cq_social_sync_impl_diff_changes_observer_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_sync_impl_diff_changes_observer_properties_local_var, 0, sizeof(com_adobe_cq_social_sync_impl_diff_changes_observer_properties_t));
    com_adobe_cq_social_sync_impl_diff_changes_observer_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_sync_impl_diff_changes_observer_properties_local_var->enabled = enabled;
    com_adobe_cq_social_sync_impl_diff_changes_observer_properties_local_var->agent_name = agent_name;
    com_adobe_cq_social_sync_impl_diff_changes_observer_properties_local_var->diff_path = diff_path;
    com_adobe_cq_social_sync_impl_diff_changes_observer_properties_local_var->property_names = property_names;
    return com_adobe_cq_social_sync_impl_diff_changes_observer_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_sync_impl_diff_changes_observer_properties_t *com_adobe_cq_social_sync_impl_diff_changes_observer_properties_create(
    config_node_property_boolean_t *enabled,
    config_node_property_string_t *agent_name,
    config_node_property_string_t *diff_path,
    config_node_property_string_t *property_names
    ) {
    com_adobe_cq_social_sync_impl_diff_changes_observer_properties_t *result = com_adobe_cq_social_sync_impl_diff_changes_observer_properties_create_internal (
        enabled,
        agent_name,
        diff_path,
        property_names
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_sync_impl_diff_changes_observer_properties_free(com_adobe_cq_social_sync_impl_diff_changes_observer_properties_t *com_adobe_cq_social_sync_impl_diff_changes_observer_properties) {
    if(NULL == com_adobe_cq_social_sync_impl_diff_changes_observer_properties){
        return ;
    }
    if(com_adobe_cq_social_sync_impl_diff_changes_observer_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_sync_impl_diff_changes_observer_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_sync_impl_diff_changes_observer_properties->enabled) {
        config_node_property_boolean_free(com_adobe_cq_social_sync_impl_diff_changes_observer_properties->enabled);
        com_adobe_cq_social_sync_impl_diff_changes_observer_properties->enabled = NULL;
    }
    if (com_adobe_cq_social_sync_impl_diff_changes_observer_properties->agent_name) {
        config_node_property_string_free(com_adobe_cq_social_sync_impl_diff_changes_observer_properties->agent_name);
        com_adobe_cq_social_sync_impl_diff_changes_observer_properties->agent_name = NULL;
    }
    if (com_adobe_cq_social_sync_impl_diff_changes_observer_properties->diff_path) {
        config_node_property_string_free(com_adobe_cq_social_sync_impl_diff_changes_observer_properties->diff_path);
        com_adobe_cq_social_sync_impl_diff_changes_observer_properties->diff_path = NULL;
    }
    if (com_adobe_cq_social_sync_impl_diff_changes_observer_properties->property_names) {
        config_node_property_string_free(com_adobe_cq_social_sync_impl_diff_changes_observer_properties->property_names);
        com_adobe_cq_social_sync_impl_diff_changes_observer_properties->property_names = NULL;
    }
    free(com_adobe_cq_social_sync_impl_diff_changes_observer_properties);
}

cJSON *com_adobe_cq_social_sync_impl_diff_changes_observer_properties_convertToJSON(com_adobe_cq_social_sync_impl_diff_changes_observer_properties_t *com_adobe_cq_social_sync_impl_diff_changes_observer_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_sync_impl_diff_changes_observer_properties->enabled
    if(com_adobe_cq_social_sync_impl_diff_changes_observer_properties->enabled) {
    cJSON *enabled_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_sync_impl_diff_changes_observer_properties->enabled);
    if(enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enabled", enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_sync_impl_diff_changes_observer_properties->agent_name
    if(com_adobe_cq_social_sync_impl_diff_changes_observer_properties->agent_name) {
    cJSON *agent_name_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_sync_impl_diff_changes_observer_properties->agent_name);
    if(agent_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "agentName", agent_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_sync_impl_diff_changes_observer_properties->diff_path
    if(com_adobe_cq_social_sync_impl_diff_changes_observer_properties->diff_path) {
    cJSON *diff_path_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_sync_impl_diff_changes_observer_properties->diff_path);
    if(diff_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "diffPath", diff_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_sync_impl_diff_changes_observer_properties->property_names
    if(com_adobe_cq_social_sync_impl_diff_changes_observer_properties->property_names) {
    cJSON *property_names_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_sync_impl_diff_changes_observer_properties->property_names);
    if(property_names_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "propertyNames", property_names_local_JSON);
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

com_adobe_cq_social_sync_impl_diff_changes_observer_properties_t *com_adobe_cq_social_sync_impl_diff_changes_observer_properties_parseFromJSON(cJSON *com_adobe_cq_social_sync_impl_diff_changes_observer_propertiesJSON){

    com_adobe_cq_social_sync_impl_diff_changes_observer_properties_t *com_adobe_cq_social_sync_impl_diff_changes_observer_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_sync_impl_diff_changes_observer_properties->enabled
    config_node_property_boolean_t *enabled_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_sync_impl_diff_changes_observer_properties->agent_name
    config_node_property_string_t *agent_name_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_sync_impl_diff_changes_observer_properties->diff_path
    config_node_property_string_t *diff_path_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_sync_impl_diff_changes_observer_properties->property_names
    config_node_property_string_t *property_names_local_nonprim = NULL;

    // com_adobe_cq_social_sync_impl_diff_changes_observer_properties->enabled
    cJSON *enabled = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_sync_impl_diff_changes_observer_propertiesJSON, "enabled");
    if (cJSON_IsNull(enabled)) {
        enabled = NULL;
    }
    if (enabled) { 
    enabled_local_nonprim = config_node_property_boolean_parseFromJSON(enabled); //nonprimitive
    }

    // com_adobe_cq_social_sync_impl_diff_changes_observer_properties->agent_name
    cJSON *agent_name = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_sync_impl_diff_changes_observer_propertiesJSON, "agentName");
    if (cJSON_IsNull(agent_name)) {
        agent_name = NULL;
    }
    if (agent_name) { 
    agent_name_local_nonprim = config_node_property_string_parseFromJSON(agent_name); //nonprimitive
    }

    // com_adobe_cq_social_sync_impl_diff_changes_observer_properties->diff_path
    cJSON *diff_path = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_sync_impl_diff_changes_observer_propertiesJSON, "diffPath");
    if (cJSON_IsNull(diff_path)) {
        diff_path = NULL;
    }
    if (diff_path) { 
    diff_path_local_nonprim = config_node_property_string_parseFromJSON(diff_path); //nonprimitive
    }

    // com_adobe_cq_social_sync_impl_diff_changes_observer_properties->property_names
    cJSON *property_names = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_sync_impl_diff_changes_observer_propertiesJSON, "propertyNames");
    if (cJSON_IsNull(property_names)) {
        property_names = NULL;
    }
    if (property_names) { 
    property_names_local_nonprim = config_node_property_string_parseFromJSON(property_names); //nonprimitive
    }



    com_adobe_cq_social_sync_impl_diff_changes_observer_properties_local_var = com_adobe_cq_social_sync_impl_diff_changes_observer_properties_create_internal (
        enabled ? enabled_local_nonprim : NULL,
        agent_name ? agent_name_local_nonprim : NULL,
        diff_path ? diff_path_local_nonprim : NULL,
        property_names ? property_names_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_sync_impl_diff_changes_observer_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_sync_impl_diff_changes_observer_properties_local_var;
end:
    if (enabled_local_nonprim) {
        config_node_property_boolean_free(enabled_local_nonprim);
        enabled_local_nonprim = NULL;
    }
    if (agent_name_local_nonprim) {
        config_node_property_string_free(agent_name_local_nonprim);
        agent_name_local_nonprim = NULL;
    }
    if (diff_path_local_nonprim) {
        config_node_property_string_free(diff_path_local_nonprim);
        diff_path_local_nonprim = NULL;
    }
    if (property_names_local_nonprim) {
        config_node_property_string_free(property_names_local_nonprim);
        property_names_local_nonprim = NULL;
    }
    return NULL;

}
