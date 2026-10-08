#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties.h"



static com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_t *com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_create_internal(
    config_node_property_integer_t *max_errors_to_blacklist,
    config_node_property_integer_t *retry_interval_to_whitelist,
    config_node_property_integer_t *connect_timeout,
    config_node_property_integer_t *socket_timeout,
    config_node_property_string_t *process_label,
    config_node_property_integer_t *connection_use_max
    ) {
    com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_t *com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_local_var = malloc(sizeof(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_t));
    if (!com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_local_var, 0, sizeof(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_t));
    com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_local_var->_library_owned = 1;
    com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_local_var->max_errors_to_blacklist = max_errors_to_blacklist;
    com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_local_var->retry_interval_to_whitelist = retry_interval_to_whitelist;
    com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_local_var->connect_timeout = connect_timeout;
    com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_local_var->socket_timeout = socket_timeout;
    com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_local_var->process_label = process_label;
    com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_local_var->connection_use_max = connection_use_max;
    return com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_t *com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_create(
    config_node_property_integer_t *max_errors_to_blacklist,
    config_node_property_integer_t *retry_interval_to_whitelist,
    config_node_property_integer_t *connect_timeout,
    config_node_property_integer_t *socket_timeout,
    config_node_property_string_t *process_label,
    config_node_property_integer_t *connection_use_max
    ) {
    com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_t *result = com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_create_internal (
        max_errors_to_blacklist,
        retry_interval_to_whitelist,
        connect_timeout,
        socket_timeout,
        process_label,
        connection_use_max
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_free(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_t *com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties) {
    if(NULL == com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties){
        return ;
    }
    if(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->max_errors_to_blacklist) {
        config_node_property_integer_free(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->max_errors_to_blacklist);
        com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->max_errors_to_blacklist = NULL;
    }
    if (com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->retry_interval_to_whitelist) {
        config_node_property_integer_free(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->retry_interval_to_whitelist);
        com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->retry_interval_to_whitelist = NULL;
    }
    if (com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->connect_timeout) {
        config_node_property_integer_free(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->connect_timeout);
        com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->connect_timeout = NULL;
    }
    if (com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->socket_timeout) {
        config_node_property_integer_free(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->socket_timeout);
        com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->socket_timeout = NULL;
    }
    if (com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->process_label) {
        config_node_property_string_free(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->process_label);
        com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->process_label = NULL;
    }
    if (com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->connection_use_max) {
        config_node_property_integer_free(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->connection_use_max);
        com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->connection_use_max = NULL;
    }
    free(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties);
}

cJSON *com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_convertToJSON(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_t *com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->max_errors_to_blacklist
    if(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->max_errors_to_blacklist) {
    cJSON *max_errors_to_blacklist_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->max_errors_to_blacklist);
    if(max_errors_to_blacklist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "max.errors.to.blacklist", max_errors_to_blacklist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->retry_interval_to_whitelist
    if(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->retry_interval_to_whitelist) {
    cJSON *retry_interval_to_whitelist_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->retry_interval_to_whitelist);
    if(retry_interval_to_whitelist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "retry.interval.to.whitelist", retry_interval_to_whitelist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->connect_timeout
    if(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->connect_timeout) {
    cJSON *connect_timeout_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->connect_timeout);
    if(connect_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "connect.timeout", connect_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->socket_timeout
    if(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->socket_timeout) {
    cJSON *socket_timeout_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->socket_timeout);
    if(socket_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "socket.timeout", socket_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->process_label
    if(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->process_label) {
    cJSON *process_label_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->process_label);
    if(process_label_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "process.label", process_label_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->connection_use_max
    if(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->connection_use_max) {
    cJSON *connection_use_max_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->connection_use_max);
    if(connection_use_max_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "connection.use.max", connection_use_max_local_JSON);
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

com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_t *com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_parseFromJSON(cJSON *com_day_cq_dam_ids_impl_ids_pool_manager_impl_propertiesJSON){

    com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_t *com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->max_errors_to_blacklist
    config_node_property_integer_t *max_errors_to_blacklist_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->retry_interval_to_whitelist
    config_node_property_integer_t *retry_interval_to_whitelist_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->connect_timeout
    config_node_property_integer_t *connect_timeout_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->socket_timeout
    config_node_property_integer_t *socket_timeout_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->process_label
    config_node_property_string_t *process_label_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->connection_use_max
    config_node_property_integer_t *connection_use_max_local_nonprim = NULL;

    // com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->max_errors_to_blacklist
    cJSON *max_errors_to_blacklist = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_ids_impl_ids_pool_manager_impl_propertiesJSON, "max.errors.to.blacklist");
    if (cJSON_IsNull(max_errors_to_blacklist)) {
        max_errors_to_blacklist = NULL;
    }
    if (max_errors_to_blacklist) { 
    max_errors_to_blacklist_local_nonprim = config_node_property_integer_parseFromJSON(max_errors_to_blacklist); //nonprimitive
    }

    // com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->retry_interval_to_whitelist
    cJSON *retry_interval_to_whitelist = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_ids_impl_ids_pool_manager_impl_propertiesJSON, "retry.interval.to.whitelist");
    if (cJSON_IsNull(retry_interval_to_whitelist)) {
        retry_interval_to_whitelist = NULL;
    }
    if (retry_interval_to_whitelist) { 
    retry_interval_to_whitelist_local_nonprim = config_node_property_integer_parseFromJSON(retry_interval_to_whitelist); //nonprimitive
    }

    // com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->connect_timeout
    cJSON *connect_timeout = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_ids_impl_ids_pool_manager_impl_propertiesJSON, "connect.timeout");
    if (cJSON_IsNull(connect_timeout)) {
        connect_timeout = NULL;
    }
    if (connect_timeout) { 
    connect_timeout_local_nonprim = config_node_property_integer_parseFromJSON(connect_timeout); //nonprimitive
    }

    // com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->socket_timeout
    cJSON *socket_timeout = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_ids_impl_ids_pool_manager_impl_propertiesJSON, "socket.timeout");
    if (cJSON_IsNull(socket_timeout)) {
        socket_timeout = NULL;
    }
    if (socket_timeout) { 
    socket_timeout_local_nonprim = config_node_property_integer_parseFromJSON(socket_timeout); //nonprimitive
    }

    // com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->process_label
    cJSON *process_label = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_ids_impl_ids_pool_manager_impl_propertiesJSON, "process.label");
    if (cJSON_IsNull(process_label)) {
        process_label = NULL;
    }
    if (process_label) { 
    process_label_local_nonprim = config_node_property_string_parseFromJSON(process_label); //nonprimitive
    }

    // com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties->connection_use_max
    cJSON *connection_use_max = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_ids_impl_ids_pool_manager_impl_propertiesJSON, "connection.use.max");
    if (cJSON_IsNull(connection_use_max)) {
        connection_use_max = NULL;
    }
    if (connection_use_max) { 
    connection_use_max_local_nonprim = config_node_property_integer_parseFromJSON(connection_use_max); //nonprimitive
    }



    com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_local_var = com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_create_internal (
        max_errors_to_blacklist ? max_errors_to_blacklist_local_nonprim : NULL,
        retry_interval_to_whitelist ? retry_interval_to_whitelist_local_nonprim : NULL,
        connect_timeout ? connect_timeout_local_nonprim : NULL,
        socket_timeout ? socket_timeout_local_nonprim : NULL,
        process_label ? process_label_local_nonprim : NULL,
        connection_use_max ? connection_use_max_local_nonprim : NULL
        );

    if (!com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_local_var;
end:
    if (max_errors_to_blacklist_local_nonprim) {
        config_node_property_integer_free(max_errors_to_blacklist_local_nonprim);
        max_errors_to_blacklist_local_nonprim = NULL;
    }
    if (retry_interval_to_whitelist_local_nonprim) {
        config_node_property_integer_free(retry_interval_to_whitelist_local_nonprim);
        retry_interval_to_whitelist_local_nonprim = NULL;
    }
    if (connect_timeout_local_nonprim) {
        config_node_property_integer_free(connect_timeout_local_nonprim);
        connect_timeout_local_nonprim = NULL;
    }
    if (socket_timeout_local_nonprim) {
        config_node_property_integer_free(socket_timeout_local_nonprim);
        socket_timeout_local_nonprim = NULL;
    }
    if (process_label_local_nonprim) {
        config_node_property_string_free(process_label_local_nonprim);
        process_label_local_nonprim = NULL;
    }
    if (connection_use_max_local_nonprim) {
        config_node_property_integer_free(connection_use_max_local_nonprim);
        connection_use_max_local_nonprim = NULL;
    }
    return NULL;

}
