#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties.h"



static org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_t *org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_create_internal(
    config_node_property_integer_t *timeout_in_ms,
    config_node_property_integer_t *long_running_future_threshold_for_critical_ms,
    config_node_property_integer_t *result_cache_ttl_in_ms
    ) {
    org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_t *org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_local_var = malloc(sizeof(org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_t));
    if (!org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_local_var, 0, sizeof(org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_t));
    org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_local_var->_library_owned = 1;
    org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_local_var->timeout_in_ms = timeout_in_ms;
    org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_local_var->long_running_future_threshold_for_critical_ms = long_running_future_threshold_for_critical_ms;
    org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_local_var->result_cache_ttl_in_ms = result_cache_ttl_in_ms;
    return org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_t *org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_create(
    config_node_property_integer_t *timeout_in_ms,
    config_node_property_integer_t *long_running_future_threshold_for_critical_ms,
    config_node_property_integer_t *result_cache_ttl_in_ms
    ) {
    org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_t *result = org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_create_internal (
        timeout_in_ms,
        long_running_future_threshold_for_critical_ms,
        result_cache_ttl_in_ms
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_free(org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_t *org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties) {
    if(NULL == org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties){
        return ;
    }
    if(org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->timeout_in_ms) {
        config_node_property_integer_free(org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->timeout_in_ms);
        org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->timeout_in_ms = NULL;
    }
    if (org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->long_running_future_threshold_for_critical_ms) {
        config_node_property_integer_free(org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->long_running_future_threshold_for_critical_ms);
        org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->long_running_future_threshold_for_critical_ms = NULL;
    }
    if (org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->result_cache_ttl_in_ms) {
        config_node_property_integer_free(org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->result_cache_ttl_in_ms);
        org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->result_cache_ttl_in_ms = NULL;
    }
    free(org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties);
}

cJSON *org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_convertToJSON(org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_t *org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->timeout_in_ms
    if(org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->timeout_in_ms) {
    cJSON *timeout_in_ms_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->timeout_in_ms);
    if(timeout_in_ms_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "timeoutInMs", timeout_in_ms_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->long_running_future_threshold_for_critical_ms
    if(org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->long_running_future_threshold_for_critical_ms) {
    cJSON *long_running_future_threshold_for_critical_ms_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->long_running_future_threshold_for_critical_ms);
    if(long_running_future_threshold_for_critical_ms_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "longRunningFutureThresholdForCriticalMs", long_running_future_threshold_for_critical_ms_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->result_cache_ttl_in_ms
    if(org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->result_cache_ttl_in_ms) {
    cJSON *result_cache_ttl_in_ms_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->result_cache_ttl_in_ms);
    if(result_cache_ttl_in_ms_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resultCacheTtlInMs", result_cache_ttl_in_ms_local_JSON);
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

org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_t *org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_parseFromJSON(cJSON *org_apache_sling_hc_core_impl_executor_health_check_executor_impl_propertiesJSON){

    org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_t *org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_local_var = NULL;

    // define the local variable for org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->timeout_in_ms
    config_node_property_integer_t *timeout_in_ms_local_nonprim = NULL;

    // define the local variable for org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->long_running_future_threshold_for_critical_ms
    config_node_property_integer_t *long_running_future_threshold_for_critical_ms_local_nonprim = NULL;

    // define the local variable for org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->result_cache_ttl_in_ms
    config_node_property_integer_t *result_cache_ttl_in_ms_local_nonprim = NULL;

    // org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->timeout_in_ms
    cJSON *timeout_in_ms = cJSON_GetObjectItemCaseSensitive(org_apache_sling_hc_core_impl_executor_health_check_executor_impl_propertiesJSON, "timeoutInMs");
    if (cJSON_IsNull(timeout_in_ms)) {
        timeout_in_ms = NULL;
    }
    if (timeout_in_ms) { 
    timeout_in_ms_local_nonprim = config_node_property_integer_parseFromJSON(timeout_in_ms); //nonprimitive
    }

    // org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->long_running_future_threshold_for_critical_ms
    cJSON *long_running_future_threshold_for_critical_ms = cJSON_GetObjectItemCaseSensitive(org_apache_sling_hc_core_impl_executor_health_check_executor_impl_propertiesJSON, "longRunningFutureThresholdForCriticalMs");
    if (cJSON_IsNull(long_running_future_threshold_for_critical_ms)) {
        long_running_future_threshold_for_critical_ms = NULL;
    }
    if (long_running_future_threshold_for_critical_ms) { 
    long_running_future_threshold_for_critical_ms_local_nonprim = config_node_property_integer_parseFromJSON(long_running_future_threshold_for_critical_ms); //nonprimitive
    }

    // org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties->result_cache_ttl_in_ms
    cJSON *result_cache_ttl_in_ms = cJSON_GetObjectItemCaseSensitive(org_apache_sling_hc_core_impl_executor_health_check_executor_impl_propertiesJSON, "resultCacheTtlInMs");
    if (cJSON_IsNull(result_cache_ttl_in_ms)) {
        result_cache_ttl_in_ms = NULL;
    }
    if (result_cache_ttl_in_ms) { 
    result_cache_ttl_in_ms_local_nonprim = config_node_property_integer_parseFromJSON(result_cache_ttl_in_ms); //nonprimitive
    }



    org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_local_var = org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_create_internal (
        timeout_in_ms ? timeout_in_ms_local_nonprim : NULL,
        long_running_future_threshold_for_critical_ms ? long_running_future_threshold_for_critical_ms_local_nonprim : NULL,
        result_cache_ttl_in_ms ? result_cache_ttl_in_ms_local_nonprim : NULL
        );

    if (!org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_local_var) {
        goto end;
    }

    return org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties_local_var;
end:
    if (timeout_in_ms_local_nonprim) {
        config_node_property_integer_free(timeout_in_ms_local_nonprim);
        timeout_in_ms_local_nonprim = NULL;
    }
    if (long_running_future_threshold_for_critical_ms_local_nonprim) {
        config_node_property_integer_free(long_running_future_threshold_for_critical_ms_local_nonprim);
        long_running_future_threshold_for_critical_ms_local_nonprim = NULL;
    }
    if (result_cache_ttl_in_ms_local_nonprim) {
        config_node_property_integer_free(result_cache_ttl_in_ms_local_nonprim);
        result_cache_ttl_in_ms_local_nonprim = NULL;
    }
    return NULL;

}
