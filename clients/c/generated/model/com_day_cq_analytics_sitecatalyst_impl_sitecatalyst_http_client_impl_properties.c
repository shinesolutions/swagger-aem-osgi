#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties.h"



static com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_t *com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_create_internal(
    config_node_property_array_t *cq_analytics_sitecatalyst_service_datacenter_url,
    config_node_property_array_t *devhostnamepatterns,
    config_node_property_integer_t *connection_timeout,
    config_node_property_integer_t *socket_timeout
    ) {
    com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_t *com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_local_var = malloc(sizeof(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_t));
    if (!com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_local_var, 0, sizeof(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_t));
    com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_local_var->_library_owned = 1;
    com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_local_var->cq_analytics_sitecatalyst_service_datacenter_url = cq_analytics_sitecatalyst_service_datacenter_url;
    com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_local_var->devhostnamepatterns = devhostnamepatterns;
    com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_local_var->connection_timeout = connection_timeout;
    com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_local_var->socket_timeout = socket_timeout;
    return com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_t *com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_create(
    config_node_property_array_t *cq_analytics_sitecatalyst_service_datacenter_url,
    config_node_property_array_t *devhostnamepatterns,
    config_node_property_integer_t *connection_timeout,
    config_node_property_integer_t *socket_timeout
    ) {
    com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_t *result = com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_create_internal (
        cq_analytics_sitecatalyst_service_datacenter_url,
        devhostnamepatterns,
        connection_timeout,
        socket_timeout
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_free(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_t *com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties) {
    if(NULL == com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties){
        return ;
    }
    if(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->cq_analytics_sitecatalyst_service_datacenter_url) {
        config_node_property_array_free(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->cq_analytics_sitecatalyst_service_datacenter_url);
        com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->cq_analytics_sitecatalyst_service_datacenter_url = NULL;
    }
    if (com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->devhostnamepatterns) {
        config_node_property_array_free(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->devhostnamepatterns);
        com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->devhostnamepatterns = NULL;
    }
    if (com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->connection_timeout) {
        config_node_property_integer_free(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->connection_timeout);
        com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->connection_timeout = NULL;
    }
    if (com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->socket_timeout) {
        config_node_property_integer_free(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->socket_timeout);
        com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->socket_timeout = NULL;
    }
    free(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties);
}

cJSON *com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_convertToJSON(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_t *com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->cq_analytics_sitecatalyst_service_datacenter_url
    if(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->cq_analytics_sitecatalyst_service_datacenter_url) {
    cJSON *cq_analytics_sitecatalyst_service_datacenter_url_local_JSON = config_node_property_array_convertToJSON(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->cq_analytics_sitecatalyst_service_datacenter_url);
    if(cq_analytics_sitecatalyst_service_datacenter_url_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.analytics.sitecatalyst.service.datacenter.url", cq_analytics_sitecatalyst_service_datacenter_url_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->devhostnamepatterns
    if(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->devhostnamepatterns) {
    cJSON *devhostnamepatterns_local_JSON = config_node_property_array_convertToJSON(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->devhostnamepatterns);
    if(devhostnamepatterns_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "devhostnamepatterns", devhostnamepatterns_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->connection_timeout
    if(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->connection_timeout) {
    cJSON *connection_timeout_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->connection_timeout);
    if(connection_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "connection.timeout", connection_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->socket_timeout
    if(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->socket_timeout) {
    cJSON *socket_timeout_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->socket_timeout);
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

com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_t *com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_parseFromJSON(cJSON *com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_propertiesJSON){

    com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_t *com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->cq_analytics_sitecatalyst_service_datacenter_url
    config_node_property_array_t *cq_analytics_sitecatalyst_service_datacenter_url_local_nonprim = NULL;

    // define the local variable for com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->devhostnamepatterns
    config_node_property_array_t *devhostnamepatterns_local_nonprim = NULL;

    // define the local variable for com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->connection_timeout
    config_node_property_integer_t *connection_timeout_local_nonprim = NULL;

    // define the local variable for com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->socket_timeout
    config_node_property_integer_t *socket_timeout_local_nonprim = NULL;

    // com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->cq_analytics_sitecatalyst_service_datacenter_url
    cJSON *cq_analytics_sitecatalyst_service_datacenter_url = cJSON_GetObjectItemCaseSensitive(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_propertiesJSON, "cq.analytics.sitecatalyst.service.datacenter.url");
    if (cJSON_IsNull(cq_analytics_sitecatalyst_service_datacenter_url)) {
        cq_analytics_sitecatalyst_service_datacenter_url = NULL;
    }
    if (cq_analytics_sitecatalyst_service_datacenter_url) { 
    cq_analytics_sitecatalyst_service_datacenter_url_local_nonprim = config_node_property_array_parseFromJSON(cq_analytics_sitecatalyst_service_datacenter_url); //nonprimitive
    }

    // com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->devhostnamepatterns
    cJSON *devhostnamepatterns = cJSON_GetObjectItemCaseSensitive(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_propertiesJSON, "devhostnamepatterns");
    if (cJSON_IsNull(devhostnamepatterns)) {
        devhostnamepatterns = NULL;
    }
    if (devhostnamepatterns) { 
    devhostnamepatterns_local_nonprim = config_node_property_array_parseFromJSON(devhostnamepatterns); //nonprimitive
    }

    // com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->connection_timeout
    cJSON *connection_timeout = cJSON_GetObjectItemCaseSensitive(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_propertiesJSON, "connection.timeout");
    if (cJSON_IsNull(connection_timeout)) {
        connection_timeout = NULL;
    }
    if (connection_timeout) { 
    connection_timeout_local_nonprim = config_node_property_integer_parseFromJSON(connection_timeout); //nonprimitive
    }

    // com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties->socket_timeout
    cJSON *socket_timeout = cJSON_GetObjectItemCaseSensitive(com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_propertiesJSON, "socket.timeout");
    if (cJSON_IsNull(socket_timeout)) {
        socket_timeout = NULL;
    }
    if (socket_timeout) { 
    socket_timeout_local_nonprim = config_node_property_integer_parseFromJSON(socket_timeout); //nonprimitive
    }



    com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_local_var = com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_create_internal (
        cq_analytics_sitecatalyst_service_datacenter_url ? cq_analytics_sitecatalyst_service_datacenter_url_local_nonprim : NULL,
        devhostnamepatterns ? devhostnamepatterns_local_nonprim : NULL,
        connection_timeout ? connection_timeout_local_nonprim : NULL,
        socket_timeout ? socket_timeout_local_nonprim : NULL
        );

    if (!com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_properties_local_var;
end:
    if (cq_analytics_sitecatalyst_service_datacenter_url_local_nonprim) {
        config_node_property_array_free(cq_analytics_sitecatalyst_service_datacenter_url_local_nonprim);
        cq_analytics_sitecatalyst_service_datacenter_url_local_nonprim = NULL;
    }
    if (devhostnamepatterns_local_nonprim) {
        config_node_property_array_free(devhostnamepatterns_local_nonprim);
        devhostnamepatterns_local_nonprim = NULL;
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
