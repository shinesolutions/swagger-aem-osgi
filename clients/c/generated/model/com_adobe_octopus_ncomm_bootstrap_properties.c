#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_octopus_ncomm_bootstrap_properties.h"



static com_adobe_octopus_ncomm_bootstrap_properties_t *com_adobe_octopus_ncomm_bootstrap_properties_create_internal(
    config_node_property_integer_t *max_connections,
    config_node_property_integer_t *max_requests,
    config_node_property_integer_t *request_timeout,
    config_node_property_integer_t *request_retries,
    config_node_property_integer_t *launch_timeout
    ) {
    com_adobe_octopus_ncomm_bootstrap_properties_t *com_adobe_octopus_ncomm_bootstrap_properties_local_var = malloc(sizeof(com_adobe_octopus_ncomm_bootstrap_properties_t));
    if (!com_adobe_octopus_ncomm_bootstrap_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_octopus_ncomm_bootstrap_properties_local_var, 0, sizeof(com_adobe_octopus_ncomm_bootstrap_properties_t));
    com_adobe_octopus_ncomm_bootstrap_properties_local_var->_library_owned = 1;
    com_adobe_octopus_ncomm_bootstrap_properties_local_var->max_connections = max_connections;
    com_adobe_octopus_ncomm_bootstrap_properties_local_var->max_requests = max_requests;
    com_adobe_octopus_ncomm_bootstrap_properties_local_var->request_timeout = request_timeout;
    com_adobe_octopus_ncomm_bootstrap_properties_local_var->request_retries = request_retries;
    com_adobe_octopus_ncomm_bootstrap_properties_local_var->launch_timeout = launch_timeout;
    return com_adobe_octopus_ncomm_bootstrap_properties_local_var;
}

__attribute__((deprecated)) com_adobe_octopus_ncomm_bootstrap_properties_t *com_adobe_octopus_ncomm_bootstrap_properties_create(
    config_node_property_integer_t *max_connections,
    config_node_property_integer_t *max_requests,
    config_node_property_integer_t *request_timeout,
    config_node_property_integer_t *request_retries,
    config_node_property_integer_t *launch_timeout
    ) {
    com_adobe_octopus_ncomm_bootstrap_properties_t *result = com_adobe_octopus_ncomm_bootstrap_properties_create_internal (
        max_connections,
        max_requests,
        request_timeout,
        request_retries,
        launch_timeout
        );
    if (!result) {
    }
    return result;
}

void com_adobe_octopus_ncomm_bootstrap_properties_free(com_adobe_octopus_ncomm_bootstrap_properties_t *com_adobe_octopus_ncomm_bootstrap_properties) {
    if(NULL == com_adobe_octopus_ncomm_bootstrap_properties){
        return ;
    }
    if(com_adobe_octopus_ncomm_bootstrap_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_octopus_ncomm_bootstrap_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_octopus_ncomm_bootstrap_properties->max_connections) {
        config_node_property_integer_free(com_adobe_octopus_ncomm_bootstrap_properties->max_connections);
        com_adobe_octopus_ncomm_bootstrap_properties->max_connections = NULL;
    }
    if (com_adobe_octopus_ncomm_bootstrap_properties->max_requests) {
        config_node_property_integer_free(com_adobe_octopus_ncomm_bootstrap_properties->max_requests);
        com_adobe_octopus_ncomm_bootstrap_properties->max_requests = NULL;
    }
    if (com_adobe_octopus_ncomm_bootstrap_properties->request_timeout) {
        config_node_property_integer_free(com_adobe_octopus_ncomm_bootstrap_properties->request_timeout);
        com_adobe_octopus_ncomm_bootstrap_properties->request_timeout = NULL;
    }
    if (com_adobe_octopus_ncomm_bootstrap_properties->request_retries) {
        config_node_property_integer_free(com_adobe_octopus_ncomm_bootstrap_properties->request_retries);
        com_adobe_octopus_ncomm_bootstrap_properties->request_retries = NULL;
    }
    if (com_adobe_octopus_ncomm_bootstrap_properties->launch_timeout) {
        config_node_property_integer_free(com_adobe_octopus_ncomm_bootstrap_properties->launch_timeout);
        com_adobe_octopus_ncomm_bootstrap_properties->launch_timeout = NULL;
    }
    free(com_adobe_octopus_ncomm_bootstrap_properties);
}

cJSON *com_adobe_octopus_ncomm_bootstrap_properties_convertToJSON(com_adobe_octopus_ncomm_bootstrap_properties_t *com_adobe_octopus_ncomm_bootstrap_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_octopus_ncomm_bootstrap_properties->max_connections
    if(com_adobe_octopus_ncomm_bootstrap_properties->max_connections) {
    cJSON *max_connections_local_JSON = config_node_property_integer_convertToJSON(com_adobe_octopus_ncomm_bootstrap_properties->max_connections);
    if(max_connections_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxConnections", max_connections_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_octopus_ncomm_bootstrap_properties->max_requests
    if(com_adobe_octopus_ncomm_bootstrap_properties->max_requests) {
    cJSON *max_requests_local_JSON = config_node_property_integer_convertToJSON(com_adobe_octopus_ncomm_bootstrap_properties->max_requests);
    if(max_requests_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxRequests", max_requests_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_octopus_ncomm_bootstrap_properties->request_timeout
    if(com_adobe_octopus_ncomm_bootstrap_properties->request_timeout) {
    cJSON *request_timeout_local_JSON = config_node_property_integer_convertToJSON(com_adobe_octopus_ncomm_bootstrap_properties->request_timeout);
    if(request_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "requestTimeout", request_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_octopus_ncomm_bootstrap_properties->request_retries
    if(com_adobe_octopus_ncomm_bootstrap_properties->request_retries) {
    cJSON *request_retries_local_JSON = config_node_property_integer_convertToJSON(com_adobe_octopus_ncomm_bootstrap_properties->request_retries);
    if(request_retries_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "requestRetries", request_retries_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_octopus_ncomm_bootstrap_properties->launch_timeout
    if(com_adobe_octopus_ncomm_bootstrap_properties->launch_timeout) {
    cJSON *launch_timeout_local_JSON = config_node_property_integer_convertToJSON(com_adobe_octopus_ncomm_bootstrap_properties->launch_timeout);
    if(launch_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "launchTimeout", launch_timeout_local_JSON);
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

com_adobe_octopus_ncomm_bootstrap_properties_t *com_adobe_octopus_ncomm_bootstrap_properties_parseFromJSON(cJSON *com_adobe_octopus_ncomm_bootstrap_propertiesJSON){

    com_adobe_octopus_ncomm_bootstrap_properties_t *com_adobe_octopus_ncomm_bootstrap_properties_local_var = NULL;

    // define the local variable for com_adobe_octopus_ncomm_bootstrap_properties->max_connections
    config_node_property_integer_t *max_connections_local_nonprim = NULL;

    // define the local variable for com_adobe_octopus_ncomm_bootstrap_properties->max_requests
    config_node_property_integer_t *max_requests_local_nonprim = NULL;

    // define the local variable for com_adobe_octopus_ncomm_bootstrap_properties->request_timeout
    config_node_property_integer_t *request_timeout_local_nonprim = NULL;

    // define the local variable for com_adobe_octopus_ncomm_bootstrap_properties->request_retries
    config_node_property_integer_t *request_retries_local_nonprim = NULL;

    // define the local variable for com_adobe_octopus_ncomm_bootstrap_properties->launch_timeout
    config_node_property_integer_t *launch_timeout_local_nonprim = NULL;

    // com_adobe_octopus_ncomm_bootstrap_properties->max_connections
    cJSON *max_connections = cJSON_GetObjectItemCaseSensitive(com_adobe_octopus_ncomm_bootstrap_propertiesJSON, "maxConnections");
    if (cJSON_IsNull(max_connections)) {
        max_connections = NULL;
    }
    if (max_connections) { 
    max_connections_local_nonprim = config_node_property_integer_parseFromJSON(max_connections); //nonprimitive
    }

    // com_adobe_octopus_ncomm_bootstrap_properties->max_requests
    cJSON *max_requests = cJSON_GetObjectItemCaseSensitive(com_adobe_octopus_ncomm_bootstrap_propertiesJSON, "maxRequests");
    if (cJSON_IsNull(max_requests)) {
        max_requests = NULL;
    }
    if (max_requests) { 
    max_requests_local_nonprim = config_node_property_integer_parseFromJSON(max_requests); //nonprimitive
    }

    // com_adobe_octopus_ncomm_bootstrap_properties->request_timeout
    cJSON *request_timeout = cJSON_GetObjectItemCaseSensitive(com_adobe_octopus_ncomm_bootstrap_propertiesJSON, "requestTimeout");
    if (cJSON_IsNull(request_timeout)) {
        request_timeout = NULL;
    }
    if (request_timeout) { 
    request_timeout_local_nonprim = config_node_property_integer_parseFromJSON(request_timeout); //nonprimitive
    }

    // com_adobe_octopus_ncomm_bootstrap_properties->request_retries
    cJSON *request_retries = cJSON_GetObjectItemCaseSensitive(com_adobe_octopus_ncomm_bootstrap_propertiesJSON, "requestRetries");
    if (cJSON_IsNull(request_retries)) {
        request_retries = NULL;
    }
    if (request_retries) { 
    request_retries_local_nonprim = config_node_property_integer_parseFromJSON(request_retries); //nonprimitive
    }

    // com_adobe_octopus_ncomm_bootstrap_properties->launch_timeout
    cJSON *launch_timeout = cJSON_GetObjectItemCaseSensitive(com_adobe_octopus_ncomm_bootstrap_propertiesJSON, "launchTimeout");
    if (cJSON_IsNull(launch_timeout)) {
        launch_timeout = NULL;
    }
    if (launch_timeout) { 
    launch_timeout_local_nonprim = config_node_property_integer_parseFromJSON(launch_timeout); //nonprimitive
    }



    com_adobe_octopus_ncomm_bootstrap_properties_local_var = com_adobe_octopus_ncomm_bootstrap_properties_create_internal (
        max_connections ? max_connections_local_nonprim : NULL,
        max_requests ? max_requests_local_nonprim : NULL,
        request_timeout ? request_timeout_local_nonprim : NULL,
        request_retries ? request_retries_local_nonprim : NULL,
        launch_timeout ? launch_timeout_local_nonprim : NULL
        );

    if (!com_adobe_octopus_ncomm_bootstrap_properties_local_var) {
        goto end;
    }

    return com_adobe_octopus_ncomm_bootstrap_properties_local_var;
end:
    if (max_connections_local_nonprim) {
        config_node_property_integer_free(max_connections_local_nonprim);
        max_connections_local_nonprim = NULL;
    }
    if (max_requests_local_nonprim) {
        config_node_property_integer_free(max_requests_local_nonprim);
        max_requests_local_nonprim = NULL;
    }
    if (request_timeout_local_nonprim) {
        config_node_property_integer_free(request_timeout_local_nonprim);
        request_timeout_local_nonprim = NULL;
    }
    if (request_retries_local_nonprim) {
        config_node_property_integer_free(request_retries_local_nonprim);
        request_retries_local_nonprim = NULL;
    }
    if (launch_timeout_local_nonprim) {
        config_node_property_integer_free(launch_timeout_local_nonprim);
        launch_timeout_local_nonprim = NULL;
    }
    return NULL;

}
