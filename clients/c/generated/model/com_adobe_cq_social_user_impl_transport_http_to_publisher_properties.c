#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_user_impl_transport_http_to_publisher_properties.h"



static com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_t *com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_create_internal(
    config_node_property_boolean_t *enable,
    config_node_property_array_t *agent_configuration,
    config_node_property_string_t *context_path,
    config_node_property_array_t *disabled_cipher_suites,
    config_node_property_array_t *enabled_cipher_suites
    ) {
    com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_t *com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_local_var = malloc(sizeof(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_t));
    if (!com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_local_var, 0, sizeof(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_t));
    com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_local_var->enable = enable;
    com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_local_var->agent_configuration = agent_configuration;
    com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_local_var->context_path = context_path;
    com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_local_var->disabled_cipher_suites = disabled_cipher_suites;
    com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_local_var->enabled_cipher_suites = enabled_cipher_suites;
    return com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_t *com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_create(
    config_node_property_boolean_t *enable,
    config_node_property_array_t *agent_configuration,
    config_node_property_string_t *context_path,
    config_node_property_array_t *disabled_cipher_suites,
    config_node_property_array_t *enabled_cipher_suites
    ) {
    com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_t *result = com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_create_internal (
        enable,
        agent_configuration,
        context_path,
        disabled_cipher_suites,
        enabled_cipher_suites
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_free(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_t *com_adobe_cq_social_user_impl_transport_http_to_publisher_properties) {
    if(NULL == com_adobe_cq_social_user_impl_transport_http_to_publisher_properties){
        return ;
    }
    if(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->enable) {
        config_node_property_boolean_free(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->enable);
        com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->enable = NULL;
    }
    if (com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->agent_configuration) {
        config_node_property_array_free(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->agent_configuration);
        com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->agent_configuration = NULL;
    }
    if (com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->context_path) {
        config_node_property_string_free(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->context_path);
        com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->context_path = NULL;
    }
    if (com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->disabled_cipher_suites) {
        config_node_property_array_free(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->disabled_cipher_suites);
        com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->disabled_cipher_suites = NULL;
    }
    if (com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->enabled_cipher_suites) {
        config_node_property_array_free(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->enabled_cipher_suites);
        com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->enabled_cipher_suites = NULL;
    }
    free(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties);
}

cJSON *com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_convertToJSON(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_t *com_adobe_cq_social_user_impl_transport_http_to_publisher_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->enable
    if(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->enable) {
    cJSON *enable_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->enable);
    if(enable_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enable", enable_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->agent_configuration
    if(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->agent_configuration) {
    cJSON *agent_configuration_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->agent_configuration);
    if(agent_configuration_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "agent.configuration", agent_configuration_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->context_path
    if(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->context_path) {
    cJSON *context_path_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->context_path);
    if(context_path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "context.path", context_path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->disabled_cipher_suites
    if(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->disabled_cipher_suites) {
    cJSON *disabled_cipher_suites_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->disabled_cipher_suites);
    if(disabled_cipher_suites_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "disabled.cipher.suites", disabled_cipher_suites_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->enabled_cipher_suites
    if(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->enabled_cipher_suites) {
    cJSON *enabled_cipher_suites_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->enabled_cipher_suites);
    if(enabled_cipher_suites_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enabled.cipher.suites", enabled_cipher_suites_local_JSON);
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

com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_t *com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_parseFromJSON(cJSON *com_adobe_cq_social_user_impl_transport_http_to_publisher_propertiesJSON){

    com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_t *com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->enable
    config_node_property_boolean_t *enable_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->agent_configuration
    config_node_property_array_t *agent_configuration_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->context_path
    config_node_property_string_t *context_path_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->disabled_cipher_suites
    config_node_property_array_t *disabled_cipher_suites_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->enabled_cipher_suites
    config_node_property_array_t *enabled_cipher_suites_local_nonprim = NULL;

    // com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->enable
    cJSON *enable = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_user_impl_transport_http_to_publisher_propertiesJSON, "enable");
    if (cJSON_IsNull(enable)) {
        enable = NULL;
    }
    if (enable) { 
    enable_local_nonprim = config_node_property_boolean_parseFromJSON(enable); //nonprimitive
    }

    // com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->agent_configuration
    cJSON *agent_configuration = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_user_impl_transport_http_to_publisher_propertiesJSON, "agent.configuration");
    if (cJSON_IsNull(agent_configuration)) {
        agent_configuration = NULL;
    }
    if (agent_configuration) { 
    agent_configuration_local_nonprim = config_node_property_array_parseFromJSON(agent_configuration); //nonprimitive
    }

    // com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->context_path
    cJSON *context_path = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_user_impl_transport_http_to_publisher_propertiesJSON, "context.path");
    if (cJSON_IsNull(context_path)) {
        context_path = NULL;
    }
    if (context_path) { 
    context_path_local_nonprim = config_node_property_string_parseFromJSON(context_path); //nonprimitive
    }

    // com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->disabled_cipher_suites
    cJSON *disabled_cipher_suites = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_user_impl_transport_http_to_publisher_propertiesJSON, "disabled.cipher.suites");
    if (cJSON_IsNull(disabled_cipher_suites)) {
        disabled_cipher_suites = NULL;
    }
    if (disabled_cipher_suites) { 
    disabled_cipher_suites_local_nonprim = config_node_property_array_parseFromJSON(disabled_cipher_suites); //nonprimitive
    }

    // com_adobe_cq_social_user_impl_transport_http_to_publisher_properties->enabled_cipher_suites
    cJSON *enabled_cipher_suites = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_user_impl_transport_http_to_publisher_propertiesJSON, "enabled.cipher.suites");
    if (cJSON_IsNull(enabled_cipher_suites)) {
        enabled_cipher_suites = NULL;
    }
    if (enabled_cipher_suites) { 
    enabled_cipher_suites_local_nonprim = config_node_property_array_parseFromJSON(enabled_cipher_suites); //nonprimitive
    }



    com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_local_var = com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_create_internal (
        enable ? enable_local_nonprim : NULL,
        agent_configuration ? agent_configuration_local_nonprim : NULL,
        context_path ? context_path_local_nonprim : NULL,
        disabled_cipher_suites ? disabled_cipher_suites_local_nonprim : NULL,
        enabled_cipher_suites ? enabled_cipher_suites_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_user_impl_transport_http_to_publisher_properties_local_var;
end:
    if (enable_local_nonprim) {
        config_node_property_boolean_free(enable_local_nonprim);
        enable_local_nonprim = NULL;
    }
    if (agent_configuration_local_nonprim) {
        config_node_property_array_free(agent_configuration_local_nonprim);
        agent_configuration_local_nonprim = NULL;
    }
    if (context_path_local_nonprim) {
        config_node_property_string_free(context_path_local_nonprim);
        context_path_local_nonprim = NULL;
    }
    if (disabled_cipher_suites_local_nonprim) {
        config_node_property_array_free(disabled_cipher_suites_local_nonprim);
        disabled_cipher_suites_local_nonprim = NULL;
    }
    if (enabled_cipher_suites_local_nonprim) {
        config_node_property_array_free(enabled_cipher_suites_local_nonprim);
        enabled_cipher_suites_local_nonprim = NULL;
    }
    return NULL;

}
