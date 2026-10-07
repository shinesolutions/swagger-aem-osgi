#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties.h"



static org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_t *org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_create_internal(
    config_node_property_array_t *async_configs,
    config_node_property_integer_t *lease_time_out_minutes,
    config_node_property_integer_t *failing_index_timeout_seconds,
    config_node_property_integer_t *error_warn_interval_seconds
    ) {
    org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_t *org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_t));
    if (!org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_t));
    org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_local_var->async_configs = async_configs;
    org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_local_var->lease_time_out_minutes = lease_time_out_minutes;
    org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_local_var->failing_index_timeout_seconds = failing_index_timeout_seconds;
    org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_local_var->error_warn_interval_seconds = error_warn_interval_seconds;
    return org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_t *org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_create(
    config_node_property_array_t *async_configs,
    config_node_property_integer_t *lease_time_out_minutes,
    config_node_property_integer_t *failing_index_timeout_seconds,
    config_node_property_integer_t *error_warn_interval_seconds
    ) {
    org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_t *result = org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_create_internal (
        async_configs,
        lease_time_out_minutes,
        failing_index_timeout_seconds,
        error_warn_interval_seconds
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_free(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_t *org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties) {
    if(NULL == org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->async_configs) {
        config_node_property_array_free(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->async_configs);
        org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->async_configs = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->lease_time_out_minutes) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->lease_time_out_minutes);
        org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->lease_time_out_minutes = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->failing_index_timeout_seconds) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->failing_index_timeout_seconds);
        org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->failing_index_timeout_seconds = NULL;
    }
    if (org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->error_warn_interval_seconds) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->error_warn_interval_seconds);
        org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->error_warn_interval_seconds = NULL;
    }
    free(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties);
}

cJSON *org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_convertToJSON(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_t *org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->async_configs
    if(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->async_configs) {
    cJSON *async_configs_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->async_configs);
    if(async_configs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "asyncConfigs", async_configs_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->lease_time_out_minutes
    if(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->lease_time_out_minutes) {
    cJSON *lease_time_out_minutes_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->lease_time_out_minutes);
    if(lease_time_out_minutes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "leaseTimeOutMinutes", lease_time_out_minutes_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->failing_index_timeout_seconds
    if(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->failing_index_timeout_seconds) {
    cJSON *failing_index_timeout_seconds_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->failing_index_timeout_seconds);
    if(failing_index_timeout_seconds_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "failingIndexTimeoutSeconds", failing_index_timeout_seconds_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->error_warn_interval_seconds
    if(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->error_warn_interval_seconds) {
    cJSON *error_warn_interval_seconds_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->error_warn_interval_seconds);
    if(error_warn_interval_seconds_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "errorWarnIntervalSeconds", error_warn_interval_seconds_local_JSON);
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

org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_t *org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_plugins_index_async_indexer_service_propertiesJSON){

    org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_t *org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->async_configs
    config_node_property_array_t *async_configs_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->lease_time_out_minutes
    config_node_property_integer_t *lease_time_out_minutes_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->failing_index_timeout_seconds
    config_node_property_integer_t *failing_index_timeout_seconds_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->error_warn_interval_seconds
    config_node_property_integer_t *error_warn_interval_seconds_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->async_configs
    cJSON *async_configs = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_propertiesJSON, "asyncConfigs");
    if (cJSON_IsNull(async_configs)) {
        async_configs = NULL;
    }
    if (async_configs) { 
    async_configs_local_nonprim = config_node_property_array_parseFromJSON(async_configs); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->lease_time_out_minutes
    cJSON *lease_time_out_minutes = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_propertiesJSON, "leaseTimeOutMinutes");
    if (cJSON_IsNull(lease_time_out_minutes)) {
        lease_time_out_minutes = NULL;
    }
    if (lease_time_out_minutes) { 
    lease_time_out_minutes_local_nonprim = config_node_property_integer_parseFromJSON(lease_time_out_minutes); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->failing_index_timeout_seconds
    cJSON *failing_index_timeout_seconds = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_propertiesJSON, "failingIndexTimeoutSeconds");
    if (cJSON_IsNull(failing_index_timeout_seconds)) {
        failing_index_timeout_seconds = NULL;
    }
    if (failing_index_timeout_seconds) { 
    failing_index_timeout_seconds_local_nonprim = config_node_property_integer_parseFromJSON(failing_index_timeout_seconds); //nonprimitive
    }

    // org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties->error_warn_interval_seconds
    cJSON *error_warn_interval_seconds = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_propertiesJSON, "errorWarnIntervalSeconds");
    if (cJSON_IsNull(error_warn_interval_seconds)) {
        error_warn_interval_seconds = NULL;
    }
    if (error_warn_interval_seconds) { 
    error_warn_interval_seconds_local_nonprim = config_node_property_integer_parseFromJSON(error_warn_interval_seconds); //nonprimitive
    }



    org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_local_var = org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_create_internal (
        async_configs ? async_configs_local_nonprim : NULL,
        lease_time_out_minutes ? lease_time_out_minutes_local_nonprim : NULL,
        failing_index_timeout_seconds ? failing_index_timeout_seconds_local_nonprim : NULL,
        error_warn_interval_seconds ? error_warn_interval_seconds_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_local_var;
end:
    if (async_configs_local_nonprim) {
        config_node_property_array_free(async_configs_local_nonprim);
        async_configs_local_nonprim = NULL;
    }
    if (lease_time_out_minutes_local_nonprim) {
        config_node_property_integer_free(lease_time_out_minutes_local_nonprim);
        lease_time_out_minutes_local_nonprim = NULL;
    }
    if (failing_index_timeout_seconds_local_nonprim) {
        config_node_property_integer_free(failing_index_timeout_seconds_local_nonprim);
        failing_index_timeout_seconds_local_nonprim = NULL;
    }
    if (error_warn_interval_seconds_local_nonprim) {
        config_node_property_integer_free(error_warn_interval_seconds_local_nonprim);
        error_warn_interval_seconds_local_nonprim = NULL;
    }
    return NULL;

}
