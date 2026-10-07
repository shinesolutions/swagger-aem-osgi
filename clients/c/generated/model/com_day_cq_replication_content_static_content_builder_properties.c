#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_replication_content_static_content_builder_properties.h"



static com_day_cq_replication_content_static_content_builder_properties_t *com_day_cq_replication_content_static_content_builder_properties_create_internal(
    config_node_property_string_t *host,
    config_node_property_integer_t *port
    ) {
    com_day_cq_replication_content_static_content_builder_properties_t *com_day_cq_replication_content_static_content_builder_properties_local_var = malloc(sizeof(com_day_cq_replication_content_static_content_builder_properties_t));
    if (!com_day_cq_replication_content_static_content_builder_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_replication_content_static_content_builder_properties_local_var, 0, sizeof(com_day_cq_replication_content_static_content_builder_properties_t));
    com_day_cq_replication_content_static_content_builder_properties_local_var->_library_owned = 1;
    com_day_cq_replication_content_static_content_builder_properties_local_var->host = host;
    com_day_cq_replication_content_static_content_builder_properties_local_var->port = port;
    return com_day_cq_replication_content_static_content_builder_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_replication_content_static_content_builder_properties_t *com_day_cq_replication_content_static_content_builder_properties_create(
    config_node_property_string_t *host,
    config_node_property_integer_t *port
    ) {
    com_day_cq_replication_content_static_content_builder_properties_t *result = com_day_cq_replication_content_static_content_builder_properties_create_internal (
        host,
        port
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_replication_content_static_content_builder_properties_free(com_day_cq_replication_content_static_content_builder_properties_t *com_day_cq_replication_content_static_content_builder_properties) {
    if(NULL == com_day_cq_replication_content_static_content_builder_properties){
        return ;
    }
    if(com_day_cq_replication_content_static_content_builder_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_replication_content_static_content_builder_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_replication_content_static_content_builder_properties->host) {
        config_node_property_string_free(com_day_cq_replication_content_static_content_builder_properties->host);
        com_day_cq_replication_content_static_content_builder_properties->host = NULL;
    }
    if (com_day_cq_replication_content_static_content_builder_properties->port) {
        config_node_property_integer_free(com_day_cq_replication_content_static_content_builder_properties->port);
        com_day_cq_replication_content_static_content_builder_properties->port = NULL;
    }
    free(com_day_cq_replication_content_static_content_builder_properties);
}

cJSON *com_day_cq_replication_content_static_content_builder_properties_convertToJSON(com_day_cq_replication_content_static_content_builder_properties_t *com_day_cq_replication_content_static_content_builder_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_replication_content_static_content_builder_properties->host
    if(com_day_cq_replication_content_static_content_builder_properties->host) {
    cJSON *host_local_JSON = config_node_property_string_convertToJSON(com_day_cq_replication_content_static_content_builder_properties->host);
    if(host_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "host", host_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_replication_content_static_content_builder_properties->port
    if(com_day_cq_replication_content_static_content_builder_properties->port) {
    cJSON *port_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_replication_content_static_content_builder_properties->port);
    if(port_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "port", port_local_JSON);
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

com_day_cq_replication_content_static_content_builder_properties_t *com_day_cq_replication_content_static_content_builder_properties_parseFromJSON(cJSON *com_day_cq_replication_content_static_content_builder_propertiesJSON){

    com_day_cq_replication_content_static_content_builder_properties_t *com_day_cq_replication_content_static_content_builder_properties_local_var = NULL;

    // define the local variable for com_day_cq_replication_content_static_content_builder_properties->host
    config_node_property_string_t *host_local_nonprim = NULL;

    // define the local variable for com_day_cq_replication_content_static_content_builder_properties->port
    config_node_property_integer_t *port_local_nonprim = NULL;

    // com_day_cq_replication_content_static_content_builder_properties->host
    cJSON *host = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_content_static_content_builder_propertiesJSON, "host");
    if (cJSON_IsNull(host)) {
        host = NULL;
    }
    if (host) { 
    host_local_nonprim = config_node_property_string_parseFromJSON(host); //nonprimitive
    }

    // com_day_cq_replication_content_static_content_builder_properties->port
    cJSON *port = cJSON_GetObjectItemCaseSensitive(com_day_cq_replication_content_static_content_builder_propertiesJSON, "port");
    if (cJSON_IsNull(port)) {
        port = NULL;
    }
    if (port) { 
    port_local_nonprim = config_node_property_integer_parseFromJSON(port); //nonprimitive
    }



    com_day_cq_replication_content_static_content_builder_properties_local_var = com_day_cq_replication_content_static_content_builder_properties_create_internal (
        host ? host_local_nonprim : NULL,
        port ? port_local_nonprim : NULL
        );

    if (!com_day_cq_replication_content_static_content_builder_properties_local_var) {
        goto end;
    }

    return com_day_cq_replication_content_static_content_builder_properties_local_var;
end:
    if (host_local_nonprim) {
        config_node_property_string_free(host_local_nonprim);
        host_local_nonprim = NULL;
    }
    if (port_local_nonprim) {
        config_node_property_integer_free(port_local_nonprim);
        port_local_nonprim = NULL;
    }
    return NULL;

}
