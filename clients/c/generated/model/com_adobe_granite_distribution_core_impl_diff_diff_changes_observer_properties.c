#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties.h"



static com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_t *com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_create_internal(
    config_node_property_boolean_t *enabled,
    config_node_property_string_t *agent_name,
    config_node_property_string_t *diff_path,
    config_node_property_string_t *observed_path,
    config_node_property_string_t *service_name,
    config_node_property_string_t *property_names,
    config_node_property_integer_t *distribution_delay,
    config_node_property_string_t *service_user_target
    ) {
    com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_t *com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_local_var = malloc(sizeof(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_t));
    if (!com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_local_var, 0, sizeof(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_t));
    com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_local_var->_library_owned = 1;
    com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_local_var->enabled = enabled;
    com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_local_var->agent_name = agent_name;
    com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_local_var->diff_path = diff_path;
    com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_local_var->observed_path = observed_path;
    com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_local_var->service_name = service_name;
    com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_local_var->property_names = property_names;
    com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_local_var->distribution_delay = distribution_delay;
    com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_local_var->service_user_target = service_user_target;
    return com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_t *com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_create(
    config_node_property_boolean_t *enabled,
    config_node_property_string_t *agent_name,
    config_node_property_string_t *diff_path,
    config_node_property_string_t *observed_path,
    config_node_property_string_t *service_name,
    config_node_property_string_t *property_names,
    config_node_property_integer_t *distribution_delay,
    config_node_property_string_t *service_user_target
    ) {
    com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_t *result = com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_create_internal (
        enabled,
        agent_name,
        diff_path,
        observed_path,
        service_name,
        property_names,
        distribution_delay,
        service_user_target
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_free(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_t *com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties) {
    if(NULL == com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties){
        return ;
    }
    if(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->enabled) {
        config_node_property_boolean_free(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->enabled);
        com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->enabled = NULL;
    }
    if (com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->agent_name) {
        config_node_property_string_free(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->agent_name);
        com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->agent_name = NULL;
    }
    if (com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->diff_path) {
        config_node_property_string_free(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->diff_path);
        com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->diff_path = NULL;
    }
    if (com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->observed_path) {
        config_node_property_string_free(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->observed_path);
        com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->observed_path = NULL;
    }
    if (com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->service_name) {
        config_node_property_string_free(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->service_name);
        com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->service_name = NULL;
    }
    if (com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->property_names) {
        config_node_property_string_free(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->property_names);
        com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->property_names = NULL;
    }
    if (com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->distribution_delay) {
        config_node_property_integer_free(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->distribution_delay);
        com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->distribution_delay = NULL;
    }
    if (com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->service_user_target) {
        config_node_property_string_free(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->service_user_target);
        com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->service_user_target = NULL;
    }
    free(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties);
}

cJSON *com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_convertToJSON(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_t *com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->enabled
    if(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->enabled) {
    cJSON *enabled_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->enabled);
    if(enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enabled", enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->agent_name
    if(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->agent_name) {
    cJSON *agent_name_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->agent_name);
    if(agent_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "agentName", agent_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->diff_path
    if(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->diff_path) {
    cJSON *diff_path_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->diff_path);
    if(diff_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "diffPath", diff_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->observed_path
    if(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->observed_path) {
    cJSON *observed_path_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->observed_path);
    if(observed_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "observedPath", observed_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->service_name
    if(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->service_name) {
    cJSON *service_name_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->service_name);
    if(service_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "serviceName", service_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->property_names
    if(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->property_names) {
    cJSON *property_names_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->property_names);
    if(property_names_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "propertyNames", property_names_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->distribution_delay
    if(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->distribution_delay) {
    cJSON *distribution_delay_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->distribution_delay);
    if(distribution_delay_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "distributionDelay", distribution_delay_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->service_user_target
    if(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->service_user_target) {
    cJSON *service_user_target_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->service_user_target);
    if(service_user_target_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "serviceUser.target", service_user_target_local_JSON);
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

com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_t *com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_parseFromJSON(cJSON *com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_propertiesJSON){

    com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_t *com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->enabled
    config_node_property_boolean_t *enabled_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->agent_name
    config_node_property_string_t *agent_name_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->diff_path
    config_node_property_string_t *diff_path_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->observed_path
    config_node_property_string_t *observed_path_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->service_name
    config_node_property_string_t *service_name_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->property_names
    config_node_property_string_t *property_names_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->distribution_delay
    config_node_property_integer_t *distribution_delay_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->service_user_target
    config_node_property_string_t *service_user_target_local_nonprim = NULL;

    // com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->enabled
    cJSON *enabled = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_propertiesJSON, "enabled");
    if (cJSON_IsNull(enabled)) {
        enabled = NULL;
    }
    if (enabled) { 
    enabled_local_nonprim = config_node_property_boolean_parseFromJSON(enabled); //nonprimitive
    }

    // com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->agent_name
    cJSON *agent_name = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_propertiesJSON, "agentName");
    if (cJSON_IsNull(agent_name)) {
        agent_name = NULL;
    }
    if (agent_name) { 
    agent_name_local_nonprim = config_node_property_string_parseFromJSON(agent_name); //nonprimitive
    }

    // com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->diff_path
    cJSON *diff_path = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_propertiesJSON, "diffPath");
    if (cJSON_IsNull(diff_path)) {
        diff_path = NULL;
    }
    if (diff_path) { 
    diff_path_local_nonprim = config_node_property_string_parseFromJSON(diff_path); //nonprimitive
    }

    // com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->observed_path
    cJSON *observed_path = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_propertiesJSON, "observedPath");
    if (cJSON_IsNull(observed_path)) {
        observed_path = NULL;
    }
    if (observed_path) { 
    observed_path_local_nonprim = config_node_property_string_parseFromJSON(observed_path); //nonprimitive
    }

    // com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->service_name
    cJSON *service_name = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_propertiesJSON, "serviceName");
    if (cJSON_IsNull(service_name)) {
        service_name = NULL;
    }
    if (service_name) { 
    service_name_local_nonprim = config_node_property_string_parseFromJSON(service_name); //nonprimitive
    }

    // com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->property_names
    cJSON *property_names = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_propertiesJSON, "propertyNames");
    if (cJSON_IsNull(property_names)) {
        property_names = NULL;
    }
    if (property_names) { 
    property_names_local_nonprim = config_node_property_string_parseFromJSON(property_names); //nonprimitive
    }

    // com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->distribution_delay
    cJSON *distribution_delay = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_propertiesJSON, "distributionDelay");
    if (cJSON_IsNull(distribution_delay)) {
        distribution_delay = NULL;
    }
    if (distribution_delay) { 
    distribution_delay_local_nonprim = config_node_property_integer_parseFromJSON(distribution_delay); //nonprimitive
    }

    // com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties->service_user_target
    cJSON *service_user_target = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_propertiesJSON, "serviceUser.target");
    if (cJSON_IsNull(service_user_target)) {
        service_user_target = NULL;
    }
    if (service_user_target) { 
    service_user_target_local_nonprim = config_node_property_string_parseFromJSON(service_user_target); //nonprimitive
    }



    com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_local_var = com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_create_internal (
        enabled ? enabled_local_nonprim : NULL,
        agent_name ? agent_name_local_nonprim : NULL,
        diff_path ? diff_path_local_nonprim : NULL,
        observed_path ? observed_path_local_nonprim : NULL,
        service_name ? service_name_local_nonprim : NULL,
        property_names ? property_names_local_nonprim : NULL,
        distribution_delay ? distribution_delay_local_nonprim : NULL,
        service_user_target ? service_user_target_local_nonprim : NULL
        );

    if (!com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_local_var;
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
    if (observed_path_local_nonprim) {
        config_node_property_string_free(observed_path_local_nonprim);
        observed_path_local_nonprim = NULL;
    }
    if (service_name_local_nonprim) {
        config_node_property_string_free(service_name_local_nonprim);
        service_name_local_nonprim = NULL;
    }
    if (property_names_local_nonprim) {
        config_node_property_string_free(property_names_local_nonprim);
        property_names_local_nonprim = NULL;
    }
    if (distribution_delay_local_nonprim) {
        config_node_property_integer_free(distribution_delay_local_nonprim);
        distribution_delay_local_nonprim = NULL;
    }
    if (service_user_target_local_nonprim) {
        config_node_property_string_free(service_user_target_local_nonprim);
        service_user_target_local_nonprim = NULL;
    }
    return NULL;

}
