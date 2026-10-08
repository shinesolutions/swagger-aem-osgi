#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties.h"



static com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_t *com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_create_internal(
    config_node_property_string_t *com_adobe_cq_screens_analytics_impl_url,
    config_node_property_string_t *com_adobe_cq_screens_analytics_impl_apikey,
    config_node_property_string_t *com_adobe_cq_screens_analytics_impl_project,
    config_node_property_drop_down_t *com_adobe_cq_screens_analytics_impl_environment,
    config_node_property_integer_t *com_adobe_cq_screens_analytics_impl_send_frequency
    ) {
    com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_t *com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_local_var = malloc(sizeof(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_t));
    if (!com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_local_var, 0, sizeof(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_t));
    com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_local_var->com_adobe_cq_screens_analytics_impl_url = com_adobe_cq_screens_analytics_impl_url;
    com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_local_var->com_adobe_cq_screens_analytics_impl_apikey = com_adobe_cq_screens_analytics_impl_apikey;
    com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_local_var->com_adobe_cq_screens_analytics_impl_project = com_adobe_cq_screens_analytics_impl_project;
    com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_local_var->com_adobe_cq_screens_analytics_impl_environment = com_adobe_cq_screens_analytics_impl_environment;
    com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_local_var->com_adobe_cq_screens_analytics_impl_send_frequency = com_adobe_cq_screens_analytics_impl_send_frequency;
    return com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_t *com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_create(
    config_node_property_string_t *com_adobe_cq_screens_analytics_impl_url,
    config_node_property_string_t *com_adobe_cq_screens_analytics_impl_apikey,
    config_node_property_string_t *com_adobe_cq_screens_analytics_impl_project,
    config_node_property_drop_down_t *com_adobe_cq_screens_analytics_impl_environment,
    config_node_property_integer_t *com_adobe_cq_screens_analytics_impl_send_frequency
    ) {
    com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_t *result = com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_create_internal (
        com_adobe_cq_screens_analytics_impl_url,
        com_adobe_cq_screens_analytics_impl_apikey,
        com_adobe_cq_screens_analytics_impl_project,
        com_adobe_cq_screens_analytics_impl_environment,
        com_adobe_cq_screens_analytics_impl_send_frequency
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_free(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_t *com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties) {
    if(NULL == com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties){
        return ;
    }
    if(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_url) {
        config_node_property_string_free(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_url);
        com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_url = NULL;
    }
    if (com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_apikey) {
        config_node_property_string_free(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_apikey);
        com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_apikey = NULL;
    }
    if (com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_project) {
        config_node_property_string_free(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_project);
        com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_project = NULL;
    }
    if (com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_environment) {
        config_node_property_drop_down_free(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_environment);
        com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_environment = NULL;
    }
    if (com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_send_frequency) {
        config_node_property_integer_free(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_send_frequency);
        com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_send_frequency = NULL;
    }
    free(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties);
}

cJSON *com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_convertToJSON(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_t *com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_url
    if(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_url) {
    cJSON *com_adobe_cq_screens_analytics_impl_url_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_url);
    if(com_adobe_cq_screens_analytics_impl_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.cq.screens.analytics.impl.url", com_adobe_cq_screens_analytics_impl_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_apikey
    if(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_apikey) {
    cJSON *com_adobe_cq_screens_analytics_impl_apikey_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_apikey);
    if(com_adobe_cq_screens_analytics_impl_apikey_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.cq.screens.analytics.impl.apikey", com_adobe_cq_screens_analytics_impl_apikey_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_project
    if(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_project) {
    cJSON *com_adobe_cq_screens_analytics_impl_project_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_project);
    if(com_adobe_cq_screens_analytics_impl_project_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.cq.screens.analytics.impl.project", com_adobe_cq_screens_analytics_impl_project_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_environment
    if(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_environment) {
    cJSON *com_adobe_cq_screens_analytics_impl_environment_local_JSON = config_node_property_drop_down_convertToJSON(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_environment);
    if(com_adobe_cq_screens_analytics_impl_environment_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.cq.screens.analytics.impl.environment", com_adobe_cq_screens_analytics_impl_environment_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_send_frequency
    if(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_send_frequency) {
    cJSON *com_adobe_cq_screens_analytics_impl_send_frequency_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_send_frequency);
    if(com_adobe_cq_screens_analytics_impl_send_frequency_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.cq.screens.analytics.impl.sendFrequency", com_adobe_cq_screens_analytics_impl_send_frequency_local_JSON);
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

com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_t *com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_parseFromJSON(cJSON *com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_propertiesJSON){

    com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_t *com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_url
    config_node_property_string_t *com_adobe_cq_screens_analytics_impl_url_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_apikey
    config_node_property_string_t *com_adobe_cq_screens_analytics_impl_apikey_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_project
    config_node_property_string_t *com_adobe_cq_screens_analytics_impl_project_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_environment
    config_node_property_drop_down_t *com_adobe_cq_screens_analytics_impl_environment_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_send_frequency
    config_node_property_integer_t *com_adobe_cq_screens_analytics_impl_send_frequency_local_nonprim = NULL;

    // com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_url
    cJSON *com_adobe_cq_screens_analytics_impl_url = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_propertiesJSON, "com.adobe.cq.screens.analytics.impl.url");
    if (cJSON_IsNull(com_adobe_cq_screens_analytics_impl_url)) {
        com_adobe_cq_screens_analytics_impl_url = NULL;
    }
    if (com_adobe_cq_screens_analytics_impl_url) { 
    com_adobe_cq_screens_analytics_impl_url_local_nonprim = config_node_property_string_parseFromJSON(com_adobe_cq_screens_analytics_impl_url); //nonprimitive
    }

    // com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_apikey
    cJSON *com_adobe_cq_screens_analytics_impl_apikey = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_propertiesJSON, "com.adobe.cq.screens.analytics.impl.apikey");
    if (cJSON_IsNull(com_adobe_cq_screens_analytics_impl_apikey)) {
        com_adobe_cq_screens_analytics_impl_apikey = NULL;
    }
    if (com_adobe_cq_screens_analytics_impl_apikey) { 
    com_adobe_cq_screens_analytics_impl_apikey_local_nonprim = config_node_property_string_parseFromJSON(com_adobe_cq_screens_analytics_impl_apikey); //nonprimitive
    }

    // com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_project
    cJSON *com_adobe_cq_screens_analytics_impl_project = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_propertiesJSON, "com.adobe.cq.screens.analytics.impl.project");
    if (cJSON_IsNull(com_adobe_cq_screens_analytics_impl_project)) {
        com_adobe_cq_screens_analytics_impl_project = NULL;
    }
    if (com_adobe_cq_screens_analytics_impl_project) { 
    com_adobe_cq_screens_analytics_impl_project_local_nonprim = config_node_property_string_parseFromJSON(com_adobe_cq_screens_analytics_impl_project); //nonprimitive
    }

    // com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_environment
    cJSON *com_adobe_cq_screens_analytics_impl_environment = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_propertiesJSON, "com.adobe.cq.screens.analytics.impl.environment");
    if (cJSON_IsNull(com_adobe_cq_screens_analytics_impl_environment)) {
        com_adobe_cq_screens_analytics_impl_environment = NULL;
    }
    if (com_adobe_cq_screens_analytics_impl_environment) { 
    com_adobe_cq_screens_analytics_impl_environment_local_nonprim = config_node_property_drop_down_parseFromJSON(com_adobe_cq_screens_analytics_impl_environment); //nonprimitive
    }

    // com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties->com_adobe_cq_screens_analytics_impl_send_frequency
    cJSON *com_adobe_cq_screens_analytics_impl_send_frequency = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_propertiesJSON, "com.adobe.cq.screens.analytics.impl.sendFrequency");
    if (cJSON_IsNull(com_adobe_cq_screens_analytics_impl_send_frequency)) {
        com_adobe_cq_screens_analytics_impl_send_frequency = NULL;
    }
    if (com_adobe_cq_screens_analytics_impl_send_frequency) { 
    com_adobe_cq_screens_analytics_impl_send_frequency_local_nonprim = config_node_property_integer_parseFromJSON(com_adobe_cq_screens_analytics_impl_send_frequency); //nonprimitive
    }



    com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_local_var = com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_create_internal (
        com_adobe_cq_screens_analytics_impl_url ? com_adobe_cq_screens_analytics_impl_url_local_nonprim : NULL,
        com_adobe_cq_screens_analytics_impl_apikey ? com_adobe_cq_screens_analytics_impl_apikey_local_nonprim : NULL,
        com_adobe_cq_screens_analytics_impl_project ? com_adobe_cq_screens_analytics_impl_project_local_nonprim : NULL,
        com_adobe_cq_screens_analytics_impl_environment ? com_adobe_cq_screens_analytics_impl_environment_local_nonprim : NULL,
        com_adobe_cq_screens_analytics_impl_send_frequency ? com_adobe_cq_screens_analytics_impl_send_frequency_local_nonprim : NULL
        );

    if (!com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_properties_local_var;
end:
    if (com_adobe_cq_screens_analytics_impl_url_local_nonprim) {
        config_node_property_string_free(com_adobe_cq_screens_analytics_impl_url_local_nonprim);
        com_adobe_cq_screens_analytics_impl_url_local_nonprim = NULL;
    }
    if (com_adobe_cq_screens_analytics_impl_apikey_local_nonprim) {
        config_node_property_string_free(com_adobe_cq_screens_analytics_impl_apikey_local_nonprim);
        com_adobe_cq_screens_analytics_impl_apikey_local_nonprim = NULL;
    }
    if (com_adobe_cq_screens_analytics_impl_project_local_nonprim) {
        config_node_property_string_free(com_adobe_cq_screens_analytics_impl_project_local_nonprim);
        com_adobe_cq_screens_analytics_impl_project_local_nonprim = NULL;
    }
    if (com_adobe_cq_screens_analytics_impl_environment_local_nonprim) {
        config_node_property_drop_down_free(com_adobe_cq_screens_analytics_impl_environment_local_nonprim);
        com_adobe_cq_screens_analytics_impl_environment_local_nonprim = NULL;
    }
    if (com_adobe_cq_screens_analytics_impl_send_frequency_local_nonprim) {
        config_node_property_integer_free(com_adobe_cq_screens_analytics_impl_send_frequency_local_nonprim);
        com_adobe_cq_screens_analytics_impl_send_frequency_local_nonprim = NULL;
    }
    return NULL;

}
