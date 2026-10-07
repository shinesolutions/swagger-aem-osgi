#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_searchpromote_impl_search_promote_service_impl_properties.h"



static com_day_cq_searchpromote_impl_search_promote_service_impl_properties_t *com_day_cq_searchpromote_impl_search_promote_service_impl_properties_create_internal(
    config_node_property_string_t *cq_searchpromote_configuration_server_uri,
    config_node_property_string_t *cq_searchpromote_configuration_environment,
    config_node_property_integer_t *connection_timeout,
    config_node_property_integer_t *socket_timeout
    ) {
    com_day_cq_searchpromote_impl_search_promote_service_impl_properties_t *com_day_cq_searchpromote_impl_search_promote_service_impl_properties_local_var = malloc(sizeof(com_day_cq_searchpromote_impl_search_promote_service_impl_properties_t));
    if (!com_day_cq_searchpromote_impl_search_promote_service_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_searchpromote_impl_search_promote_service_impl_properties_local_var, 0, sizeof(com_day_cq_searchpromote_impl_search_promote_service_impl_properties_t));
    com_day_cq_searchpromote_impl_search_promote_service_impl_properties_local_var->_library_owned = 1;
    com_day_cq_searchpromote_impl_search_promote_service_impl_properties_local_var->cq_searchpromote_configuration_server_uri = cq_searchpromote_configuration_server_uri;
    com_day_cq_searchpromote_impl_search_promote_service_impl_properties_local_var->cq_searchpromote_configuration_environment = cq_searchpromote_configuration_environment;
    com_day_cq_searchpromote_impl_search_promote_service_impl_properties_local_var->connection_timeout = connection_timeout;
    com_day_cq_searchpromote_impl_search_promote_service_impl_properties_local_var->socket_timeout = socket_timeout;
    return com_day_cq_searchpromote_impl_search_promote_service_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_searchpromote_impl_search_promote_service_impl_properties_t *com_day_cq_searchpromote_impl_search_promote_service_impl_properties_create(
    config_node_property_string_t *cq_searchpromote_configuration_server_uri,
    config_node_property_string_t *cq_searchpromote_configuration_environment,
    config_node_property_integer_t *connection_timeout,
    config_node_property_integer_t *socket_timeout
    ) {
    com_day_cq_searchpromote_impl_search_promote_service_impl_properties_t *result = com_day_cq_searchpromote_impl_search_promote_service_impl_properties_create_internal (
        cq_searchpromote_configuration_server_uri,
        cq_searchpromote_configuration_environment,
        connection_timeout,
        socket_timeout
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_searchpromote_impl_search_promote_service_impl_properties_free(com_day_cq_searchpromote_impl_search_promote_service_impl_properties_t *com_day_cq_searchpromote_impl_search_promote_service_impl_properties) {
    if(NULL == com_day_cq_searchpromote_impl_search_promote_service_impl_properties){
        return ;
    }
    if(com_day_cq_searchpromote_impl_search_promote_service_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_searchpromote_impl_search_promote_service_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_searchpromote_impl_search_promote_service_impl_properties->cq_searchpromote_configuration_server_uri) {
        config_node_property_string_free(com_day_cq_searchpromote_impl_search_promote_service_impl_properties->cq_searchpromote_configuration_server_uri);
        com_day_cq_searchpromote_impl_search_promote_service_impl_properties->cq_searchpromote_configuration_server_uri = NULL;
    }
    if (com_day_cq_searchpromote_impl_search_promote_service_impl_properties->cq_searchpromote_configuration_environment) {
        config_node_property_string_free(com_day_cq_searchpromote_impl_search_promote_service_impl_properties->cq_searchpromote_configuration_environment);
        com_day_cq_searchpromote_impl_search_promote_service_impl_properties->cq_searchpromote_configuration_environment = NULL;
    }
    if (com_day_cq_searchpromote_impl_search_promote_service_impl_properties->connection_timeout) {
        config_node_property_integer_free(com_day_cq_searchpromote_impl_search_promote_service_impl_properties->connection_timeout);
        com_day_cq_searchpromote_impl_search_promote_service_impl_properties->connection_timeout = NULL;
    }
    if (com_day_cq_searchpromote_impl_search_promote_service_impl_properties->socket_timeout) {
        config_node_property_integer_free(com_day_cq_searchpromote_impl_search_promote_service_impl_properties->socket_timeout);
        com_day_cq_searchpromote_impl_search_promote_service_impl_properties->socket_timeout = NULL;
    }
    free(com_day_cq_searchpromote_impl_search_promote_service_impl_properties);
}

cJSON *com_day_cq_searchpromote_impl_search_promote_service_impl_properties_convertToJSON(com_day_cq_searchpromote_impl_search_promote_service_impl_properties_t *com_day_cq_searchpromote_impl_search_promote_service_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_searchpromote_impl_search_promote_service_impl_properties->cq_searchpromote_configuration_server_uri
    if(com_day_cq_searchpromote_impl_search_promote_service_impl_properties->cq_searchpromote_configuration_server_uri) {
    cJSON *cq_searchpromote_configuration_server_uri_local_JSON = config_node_property_string_convertToJSON(com_day_cq_searchpromote_impl_search_promote_service_impl_properties->cq_searchpromote_configuration_server_uri);
    if(cq_searchpromote_configuration_server_uri_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.searchpromote.configuration.server.uri", cq_searchpromote_configuration_server_uri_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_searchpromote_impl_search_promote_service_impl_properties->cq_searchpromote_configuration_environment
    if(com_day_cq_searchpromote_impl_search_promote_service_impl_properties->cq_searchpromote_configuration_environment) {
    cJSON *cq_searchpromote_configuration_environment_local_JSON = config_node_property_string_convertToJSON(com_day_cq_searchpromote_impl_search_promote_service_impl_properties->cq_searchpromote_configuration_environment);
    if(cq_searchpromote_configuration_environment_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.searchpromote.configuration.environment", cq_searchpromote_configuration_environment_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_searchpromote_impl_search_promote_service_impl_properties->connection_timeout
    if(com_day_cq_searchpromote_impl_search_promote_service_impl_properties->connection_timeout) {
    cJSON *connection_timeout_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_searchpromote_impl_search_promote_service_impl_properties->connection_timeout);
    if(connection_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "connection.timeout", connection_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_searchpromote_impl_search_promote_service_impl_properties->socket_timeout
    if(com_day_cq_searchpromote_impl_search_promote_service_impl_properties->socket_timeout) {
    cJSON *socket_timeout_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_searchpromote_impl_search_promote_service_impl_properties->socket_timeout);
    if(socket_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "socket.timeout", socket_timeout_local_JSON);
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

com_day_cq_searchpromote_impl_search_promote_service_impl_properties_t *com_day_cq_searchpromote_impl_search_promote_service_impl_properties_parseFromJSON(cJSON *com_day_cq_searchpromote_impl_search_promote_service_impl_propertiesJSON){

    com_day_cq_searchpromote_impl_search_promote_service_impl_properties_t *com_day_cq_searchpromote_impl_search_promote_service_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_searchpromote_impl_search_promote_service_impl_properties->cq_searchpromote_configuration_server_uri
    config_node_property_string_t *cq_searchpromote_configuration_server_uri_local_nonprim = NULL;

    // define the local variable for com_day_cq_searchpromote_impl_search_promote_service_impl_properties->cq_searchpromote_configuration_environment
    config_node_property_string_t *cq_searchpromote_configuration_environment_local_nonprim = NULL;

    // define the local variable for com_day_cq_searchpromote_impl_search_promote_service_impl_properties->connection_timeout
    config_node_property_integer_t *connection_timeout_local_nonprim = NULL;

    // define the local variable for com_day_cq_searchpromote_impl_search_promote_service_impl_properties->socket_timeout
    config_node_property_integer_t *socket_timeout_local_nonprim = NULL;

    // com_day_cq_searchpromote_impl_search_promote_service_impl_properties->cq_searchpromote_configuration_server_uri
    cJSON *cq_searchpromote_configuration_server_uri = cJSON_GetObjectItemCaseSensitive(com_day_cq_searchpromote_impl_search_promote_service_impl_propertiesJSON, "cq.searchpromote.configuration.server.uri");
    if (cJSON_IsNull(cq_searchpromote_configuration_server_uri)) {
        cq_searchpromote_configuration_server_uri = NULL;
    }
    if (cq_searchpromote_configuration_server_uri) { 
    cq_searchpromote_configuration_server_uri_local_nonprim = config_node_property_string_parseFromJSON(cq_searchpromote_configuration_server_uri); //nonprimitive
    }

    // com_day_cq_searchpromote_impl_search_promote_service_impl_properties->cq_searchpromote_configuration_environment
    cJSON *cq_searchpromote_configuration_environment = cJSON_GetObjectItemCaseSensitive(com_day_cq_searchpromote_impl_search_promote_service_impl_propertiesJSON, "cq.searchpromote.configuration.environment");
    if (cJSON_IsNull(cq_searchpromote_configuration_environment)) {
        cq_searchpromote_configuration_environment = NULL;
    }
    if (cq_searchpromote_configuration_environment) { 
    cq_searchpromote_configuration_environment_local_nonprim = config_node_property_string_parseFromJSON(cq_searchpromote_configuration_environment); //nonprimitive
    }

    // com_day_cq_searchpromote_impl_search_promote_service_impl_properties->connection_timeout
    cJSON *connection_timeout = cJSON_GetObjectItemCaseSensitive(com_day_cq_searchpromote_impl_search_promote_service_impl_propertiesJSON, "connection.timeout");
    if (cJSON_IsNull(connection_timeout)) {
        connection_timeout = NULL;
    }
    if (connection_timeout) { 
    connection_timeout_local_nonprim = config_node_property_integer_parseFromJSON(connection_timeout); //nonprimitive
    }

    // com_day_cq_searchpromote_impl_search_promote_service_impl_properties->socket_timeout
    cJSON *socket_timeout = cJSON_GetObjectItemCaseSensitive(com_day_cq_searchpromote_impl_search_promote_service_impl_propertiesJSON, "socket.timeout");
    if (cJSON_IsNull(socket_timeout)) {
        socket_timeout = NULL;
    }
    if (socket_timeout) { 
    socket_timeout_local_nonprim = config_node_property_integer_parseFromJSON(socket_timeout); //nonprimitive
    }



    com_day_cq_searchpromote_impl_search_promote_service_impl_properties_local_var = com_day_cq_searchpromote_impl_search_promote_service_impl_properties_create_internal (
        cq_searchpromote_configuration_server_uri ? cq_searchpromote_configuration_server_uri_local_nonprim : NULL,
        cq_searchpromote_configuration_environment ? cq_searchpromote_configuration_environment_local_nonprim : NULL,
        connection_timeout ? connection_timeout_local_nonprim : NULL,
        socket_timeout ? socket_timeout_local_nonprim : NULL
        );

    if (!com_day_cq_searchpromote_impl_search_promote_service_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_searchpromote_impl_search_promote_service_impl_properties_local_var;
end:
    if (cq_searchpromote_configuration_server_uri_local_nonprim) {
        config_node_property_string_free(cq_searchpromote_configuration_server_uri_local_nonprim);
        cq_searchpromote_configuration_server_uri_local_nonprim = NULL;
    }
    if (cq_searchpromote_configuration_environment_local_nonprim) {
        config_node_property_string_free(cq_searchpromote_configuration_environment_local_nonprim);
        cq_searchpromote_configuration_environment_local_nonprim = NULL;
    }
    if (connection_timeout_local_nonprim) {
        config_node_property_integer_free(connection_timeout_local_nonprim);
        connection_timeout_local_nonprim = NULL;
    }
    if (socket_timeout_local_nonprim) {
        config_node_property_integer_free(socket_timeout_local_nonprim);
        socket_timeout_local_nonprim = NULL;
    }
    return NULL;

}
