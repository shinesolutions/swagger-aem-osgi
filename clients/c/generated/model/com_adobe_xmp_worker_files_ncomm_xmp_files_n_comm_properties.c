#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties.h"



static com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_t *com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_create_internal(
    config_node_property_string_t *max_connections,
    config_node_property_string_t *max_requests,
    config_node_property_string_t *request_timeout,
    config_node_property_string_t *log_dir
    ) {
    com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_t *com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_local_var = malloc(sizeof(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_t));
    if (!com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_local_var, 0, sizeof(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_t));
    com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_local_var->_library_owned = 1;
    com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_local_var->max_connections = max_connections;
    com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_local_var->max_requests = max_requests;
    com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_local_var->request_timeout = request_timeout;
    com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_local_var->log_dir = log_dir;
    return com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_local_var;
}

__attribute__((deprecated)) com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_t *com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_create(
    config_node_property_string_t *max_connections,
    config_node_property_string_t *max_requests,
    config_node_property_string_t *request_timeout,
    config_node_property_string_t *log_dir
    ) {
    com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_t *result = com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_create_internal (
        max_connections,
        max_requests,
        request_timeout,
        log_dir
        );
    if (!result) {
    }
    return result;
}

void com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_free(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_t *com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties) {
    if(NULL == com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties){
        return ;
    }
    if(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->max_connections) {
        config_node_property_string_free(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->max_connections);
        com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->max_connections = NULL;
    }
    if (com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->max_requests) {
        config_node_property_string_free(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->max_requests);
        com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->max_requests = NULL;
    }
    if (com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->request_timeout) {
        config_node_property_string_free(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->request_timeout);
        com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->request_timeout = NULL;
    }
    if (com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->log_dir) {
        config_node_property_string_free(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->log_dir);
        com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->log_dir = NULL;
    }
    free(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties);
}

cJSON *com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_convertToJSON(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_t *com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->max_connections
    if(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->max_connections) {
    cJSON *max_connections_local_JSON = config_node_property_string_convertToJSON(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->max_connections);
    if(max_connections_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxConnections", max_connections_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->max_requests
    if(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->max_requests) {
    cJSON *max_requests_local_JSON = config_node_property_string_convertToJSON(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->max_requests);
    if(max_requests_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxRequests", max_requests_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->request_timeout
    if(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->request_timeout) {
    cJSON *request_timeout_local_JSON = config_node_property_string_convertToJSON(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->request_timeout);
    if(request_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "requestTimeout", request_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->log_dir
    if(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->log_dir) {
    cJSON *log_dir_local_JSON = config_node_property_string_convertToJSON(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->log_dir);
    if(log_dir_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "logDir", log_dir_local_JSON);
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

com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_t *com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_parseFromJSON(cJSON *com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_propertiesJSON){

    com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_t *com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_local_var = NULL;

    // define the local variable for com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->max_connections
    config_node_property_string_t *max_connections_local_nonprim = NULL;

    // define the local variable for com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->max_requests
    config_node_property_string_t *max_requests_local_nonprim = NULL;

    // define the local variable for com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->request_timeout
    config_node_property_string_t *request_timeout_local_nonprim = NULL;

    // define the local variable for com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->log_dir
    config_node_property_string_t *log_dir_local_nonprim = NULL;

    // com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->max_connections
    cJSON *max_connections = cJSON_GetObjectItemCaseSensitive(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_propertiesJSON, "maxConnections");
    if (cJSON_IsNull(max_connections)) {
        max_connections = NULL;
    }
    if (max_connections) { 
    max_connections_local_nonprim = config_node_property_string_parseFromJSON(max_connections); //nonprimitive
    }

    // com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->max_requests
    cJSON *max_requests = cJSON_GetObjectItemCaseSensitive(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_propertiesJSON, "maxRequests");
    if (cJSON_IsNull(max_requests)) {
        max_requests = NULL;
    }
    if (max_requests) { 
    max_requests_local_nonprim = config_node_property_string_parseFromJSON(max_requests); //nonprimitive
    }

    // com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->request_timeout
    cJSON *request_timeout = cJSON_GetObjectItemCaseSensitive(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_propertiesJSON, "requestTimeout");
    if (cJSON_IsNull(request_timeout)) {
        request_timeout = NULL;
    }
    if (request_timeout) { 
    request_timeout_local_nonprim = config_node_property_string_parseFromJSON(request_timeout); //nonprimitive
    }

    // com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties->log_dir
    cJSON *log_dir = cJSON_GetObjectItemCaseSensitive(com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_propertiesJSON, "logDir");
    if (cJSON_IsNull(log_dir)) {
        log_dir = NULL;
    }
    if (log_dir) { 
    log_dir_local_nonprim = config_node_property_string_parseFromJSON(log_dir); //nonprimitive
    }



    com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_local_var = com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_create_internal (
        max_connections ? max_connections_local_nonprim : NULL,
        max_requests ? max_requests_local_nonprim : NULL,
        request_timeout ? request_timeout_local_nonprim : NULL,
        log_dir ? log_dir_local_nonprim : NULL
        );

    if (!com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_local_var) {
        goto end;
    }

    return com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties_local_var;
end:
    if (max_connections_local_nonprim) {
        config_node_property_string_free(max_connections_local_nonprim);
        max_connections_local_nonprim = NULL;
    }
    if (max_requests_local_nonprim) {
        config_node_property_string_free(max_requests_local_nonprim);
        max_requests_local_nonprim = NULL;
    }
    if (request_timeout_local_nonprim) {
        config_node_property_string_free(request_timeout_local_nonprim);
        request_timeout_local_nonprim = NULL;
    }
    if (log_dir_local_nonprim) {
        config_node_property_string_free(log_dir_local_nonprim);
        log_dir_local_nonprim = NULL;
    }
    return NULL;

}
