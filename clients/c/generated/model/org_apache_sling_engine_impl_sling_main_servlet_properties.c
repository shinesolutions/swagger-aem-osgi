#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_engine_impl_sling_main_servlet_properties.h"



static org_apache_sling_engine_impl_sling_main_servlet_properties_t *org_apache_sling_engine_impl_sling_main_servlet_properties_create_internal(
    config_node_property_integer_t *sling_max_calls,
    config_node_property_integer_t *sling_max_inclusions,
    config_node_property_boolean_t *sling_trace_allow,
    config_node_property_integer_t *sling_max_record_requests,
    config_node_property_array_t *sling_store_pattern_requests,
    config_node_property_string_t *sling_serverinfo,
    config_node_property_array_t *sling_additional_response_headers
    ) {
    org_apache_sling_engine_impl_sling_main_servlet_properties_t *org_apache_sling_engine_impl_sling_main_servlet_properties_local_var = malloc(sizeof(org_apache_sling_engine_impl_sling_main_servlet_properties_t));
    if (!org_apache_sling_engine_impl_sling_main_servlet_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_engine_impl_sling_main_servlet_properties_local_var, 0, sizeof(org_apache_sling_engine_impl_sling_main_servlet_properties_t));
    org_apache_sling_engine_impl_sling_main_servlet_properties_local_var->_library_owned = 1;
    org_apache_sling_engine_impl_sling_main_servlet_properties_local_var->sling_max_calls = sling_max_calls;
    org_apache_sling_engine_impl_sling_main_servlet_properties_local_var->sling_max_inclusions = sling_max_inclusions;
    org_apache_sling_engine_impl_sling_main_servlet_properties_local_var->sling_trace_allow = sling_trace_allow;
    org_apache_sling_engine_impl_sling_main_servlet_properties_local_var->sling_max_record_requests = sling_max_record_requests;
    org_apache_sling_engine_impl_sling_main_servlet_properties_local_var->sling_store_pattern_requests = sling_store_pattern_requests;
    org_apache_sling_engine_impl_sling_main_servlet_properties_local_var->sling_serverinfo = sling_serverinfo;
    org_apache_sling_engine_impl_sling_main_servlet_properties_local_var->sling_additional_response_headers = sling_additional_response_headers;
    return org_apache_sling_engine_impl_sling_main_servlet_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_engine_impl_sling_main_servlet_properties_t *org_apache_sling_engine_impl_sling_main_servlet_properties_create(
    config_node_property_integer_t *sling_max_calls,
    config_node_property_integer_t *sling_max_inclusions,
    config_node_property_boolean_t *sling_trace_allow,
    config_node_property_integer_t *sling_max_record_requests,
    config_node_property_array_t *sling_store_pattern_requests,
    config_node_property_string_t *sling_serverinfo,
    config_node_property_array_t *sling_additional_response_headers
    ) {
    org_apache_sling_engine_impl_sling_main_servlet_properties_t *result = org_apache_sling_engine_impl_sling_main_servlet_properties_create_internal (
        sling_max_calls,
        sling_max_inclusions,
        sling_trace_allow,
        sling_max_record_requests,
        sling_store_pattern_requests,
        sling_serverinfo,
        sling_additional_response_headers
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_engine_impl_sling_main_servlet_properties_free(org_apache_sling_engine_impl_sling_main_servlet_properties_t *org_apache_sling_engine_impl_sling_main_servlet_properties) {
    if(NULL == org_apache_sling_engine_impl_sling_main_servlet_properties){
        return ;
    }
    if(org_apache_sling_engine_impl_sling_main_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_engine_impl_sling_main_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_calls) {
        config_node_property_integer_free(org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_calls);
        org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_calls = NULL;
    }
    if (org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_inclusions) {
        config_node_property_integer_free(org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_inclusions);
        org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_inclusions = NULL;
    }
    if (org_apache_sling_engine_impl_sling_main_servlet_properties->sling_trace_allow) {
        config_node_property_boolean_free(org_apache_sling_engine_impl_sling_main_servlet_properties->sling_trace_allow);
        org_apache_sling_engine_impl_sling_main_servlet_properties->sling_trace_allow = NULL;
    }
    if (org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_record_requests) {
        config_node_property_integer_free(org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_record_requests);
        org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_record_requests = NULL;
    }
    if (org_apache_sling_engine_impl_sling_main_servlet_properties->sling_store_pattern_requests) {
        config_node_property_array_free(org_apache_sling_engine_impl_sling_main_servlet_properties->sling_store_pattern_requests);
        org_apache_sling_engine_impl_sling_main_servlet_properties->sling_store_pattern_requests = NULL;
    }
    if (org_apache_sling_engine_impl_sling_main_servlet_properties->sling_serverinfo) {
        config_node_property_string_free(org_apache_sling_engine_impl_sling_main_servlet_properties->sling_serverinfo);
        org_apache_sling_engine_impl_sling_main_servlet_properties->sling_serverinfo = NULL;
    }
    if (org_apache_sling_engine_impl_sling_main_servlet_properties->sling_additional_response_headers) {
        config_node_property_array_free(org_apache_sling_engine_impl_sling_main_servlet_properties->sling_additional_response_headers);
        org_apache_sling_engine_impl_sling_main_servlet_properties->sling_additional_response_headers = NULL;
    }
    free(org_apache_sling_engine_impl_sling_main_servlet_properties);
}

cJSON *org_apache_sling_engine_impl_sling_main_servlet_properties_convertToJSON(org_apache_sling_engine_impl_sling_main_servlet_properties_t *org_apache_sling_engine_impl_sling_main_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_calls
    if(org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_calls) {
    cJSON *sling_max_calls_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_calls);
    if(sling_max_calls_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.max.calls", sling_max_calls_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_inclusions
    if(org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_inclusions) {
    cJSON *sling_max_inclusions_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_inclusions);
    if(sling_max_inclusions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.max.inclusions", sling_max_inclusions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_sling_main_servlet_properties->sling_trace_allow
    if(org_apache_sling_engine_impl_sling_main_servlet_properties->sling_trace_allow) {
    cJSON *sling_trace_allow_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_engine_impl_sling_main_servlet_properties->sling_trace_allow);
    if(sling_trace_allow_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.trace.allow", sling_trace_allow_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_record_requests
    if(org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_record_requests) {
    cJSON *sling_max_record_requests_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_record_requests);
    if(sling_max_record_requests_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.max.record.requests", sling_max_record_requests_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_sling_main_servlet_properties->sling_store_pattern_requests
    if(org_apache_sling_engine_impl_sling_main_servlet_properties->sling_store_pattern_requests) {
    cJSON *sling_store_pattern_requests_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_engine_impl_sling_main_servlet_properties->sling_store_pattern_requests);
    if(sling_store_pattern_requests_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.store.pattern.requests", sling_store_pattern_requests_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_sling_main_servlet_properties->sling_serverinfo
    if(org_apache_sling_engine_impl_sling_main_servlet_properties->sling_serverinfo) {
    cJSON *sling_serverinfo_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_engine_impl_sling_main_servlet_properties->sling_serverinfo);
    if(sling_serverinfo_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.serverinfo", sling_serverinfo_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_sling_main_servlet_properties->sling_additional_response_headers
    if(org_apache_sling_engine_impl_sling_main_servlet_properties->sling_additional_response_headers) {
    cJSON *sling_additional_response_headers_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_engine_impl_sling_main_servlet_properties->sling_additional_response_headers);
    if(sling_additional_response_headers_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.additional.response.headers", sling_additional_response_headers_local_JSON);
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

org_apache_sling_engine_impl_sling_main_servlet_properties_t *org_apache_sling_engine_impl_sling_main_servlet_properties_parseFromJSON(cJSON *org_apache_sling_engine_impl_sling_main_servlet_propertiesJSON){

    org_apache_sling_engine_impl_sling_main_servlet_properties_t *org_apache_sling_engine_impl_sling_main_servlet_properties_local_var = NULL;

    // define the local variable for org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_calls
    config_node_property_integer_t *sling_max_calls_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_inclusions
    config_node_property_integer_t *sling_max_inclusions_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_sling_main_servlet_properties->sling_trace_allow
    config_node_property_boolean_t *sling_trace_allow_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_record_requests
    config_node_property_integer_t *sling_max_record_requests_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_sling_main_servlet_properties->sling_store_pattern_requests
    config_node_property_array_t *sling_store_pattern_requests_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_sling_main_servlet_properties->sling_serverinfo
    config_node_property_string_t *sling_serverinfo_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_sling_main_servlet_properties->sling_additional_response_headers
    config_node_property_array_t *sling_additional_response_headers_local_nonprim = NULL;

    // org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_calls
    cJSON *sling_max_calls = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_sling_main_servlet_propertiesJSON, "sling.max.calls");
    if (cJSON_IsNull(sling_max_calls)) {
        sling_max_calls = NULL;
    }
    if (sling_max_calls) { 
    sling_max_calls_local_nonprim = config_node_property_integer_parseFromJSON(sling_max_calls); //nonprimitive
    }

    // org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_inclusions
    cJSON *sling_max_inclusions = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_sling_main_servlet_propertiesJSON, "sling.max.inclusions");
    if (cJSON_IsNull(sling_max_inclusions)) {
        sling_max_inclusions = NULL;
    }
    if (sling_max_inclusions) { 
    sling_max_inclusions_local_nonprim = config_node_property_integer_parseFromJSON(sling_max_inclusions); //nonprimitive
    }

    // org_apache_sling_engine_impl_sling_main_servlet_properties->sling_trace_allow
    cJSON *sling_trace_allow = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_sling_main_servlet_propertiesJSON, "sling.trace.allow");
    if (cJSON_IsNull(sling_trace_allow)) {
        sling_trace_allow = NULL;
    }
    if (sling_trace_allow) { 
    sling_trace_allow_local_nonprim = config_node_property_boolean_parseFromJSON(sling_trace_allow); //nonprimitive
    }

    // org_apache_sling_engine_impl_sling_main_servlet_properties->sling_max_record_requests
    cJSON *sling_max_record_requests = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_sling_main_servlet_propertiesJSON, "sling.max.record.requests");
    if (cJSON_IsNull(sling_max_record_requests)) {
        sling_max_record_requests = NULL;
    }
    if (sling_max_record_requests) { 
    sling_max_record_requests_local_nonprim = config_node_property_integer_parseFromJSON(sling_max_record_requests); //nonprimitive
    }

    // org_apache_sling_engine_impl_sling_main_servlet_properties->sling_store_pattern_requests
    cJSON *sling_store_pattern_requests = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_sling_main_servlet_propertiesJSON, "sling.store.pattern.requests");
    if (cJSON_IsNull(sling_store_pattern_requests)) {
        sling_store_pattern_requests = NULL;
    }
    if (sling_store_pattern_requests) { 
    sling_store_pattern_requests_local_nonprim = config_node_property_array_parseFromJSON(sling_store_pattern_requests); //nonprimitive
    }

    // org_apache_sling_engine_impl_sling_main_servlet_properties->sling_serverinfo
    cJSON *sling_serverinfo = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_sling_main_servlet_propertiesJSON, "sling.serverinfo");
    if (cJSON_IsNull(sling_serverinfo)) {
        sling_serverinfo = NULL;
    }
    if (sling_serverinfo) { 
    sling_serverinfo_local_nonprim = config_node_property_string_parseFromJSON(sling_serverinfo); //nonprimitive
    }

    // org_apache_sling_engine_impl_sling_main_servlet_properties->sling_additional_response_headers
    cJSON *sling_additional_response_headers = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_sling_main_servlet_propertiesJSON, "sling.additional.response.headers");
    if (cJSON_IsNull(sling_additional_response_headers)) {
        sling_additional_response_headers = NULL;
    }
    if (sling_additional_response_headers) { 
    sling_additional_response_headers_local_nonprim = config_node_property_array_parseFromJSON(sling_additional_response_headers); //nonprimitive
    }



    org_apache_sling_engine_impl_sling_main_servlet_properties_local_var = org_apache_sling_engine_impl_sling_main_servlet_properties_create_internal (
        sling_max_calls ? sling_max_calls_local_nonprim : NULL,
        sling_max_inclusions ? sling_max_inclusions_local_nonprim : NULL,
        sling_trace_allow ? sling_trace_allow_local_nonprim : NULL,
        sling_max_record_requests ? sling_max_record_requests_local_nonprim : NULL,
        sling_store_pattern_requests ? sling_store_pattern_requests_local_nonprim : NULL,
        sling_serverinfo ? sling_serverinfo_local_nonprim : NULL,
        sling_additional_response_headers ? sling_additional_response_headers_local_nonprim : NULL
        );

    if (!org_apache_sling_engine_impl_sling_main_servlet_properties_local_var) {
        goto end;
    }

    return org_apache_sling_engine_impl_sling_main_servlet_properties_local_var;
end:
    if (sling_max_calls_local_nonprim) {
        config_node_property_integer_free(sling_max_calls_local_nonprim);
        sling_max_calls_local_nonprim = NULL;
    }
    if (sling_max_inclusions_local_nonprim) {
        config_node_property_integer_free(sling_max_inclusions_local_nonprim);
        sling_max_inclusions_local_nonprim = NULL;
    }
    if (sling_trace_allow_local_nonprim) {
        config_node_property_boolean_free(sling_trace_allow_local_nonprim);
        sling_trace_allow_local_nonprim = NULL;
    }
    if (sling_max_record_requests_local_nonprim) {
        config_node_property_integer_free(sling_max_record_requests_local_nonprim);
        sling_max_record_requests_local_nonprim = NULL;
    }
    if (sling_store_pattern_requests_local_nonprim) {
        config_node_property_array_free(sling_store_pattern_requests_local_nonprim);
        sling_store_pattern_requests_local_nonprim = NULL;
    }
    if (sling_serverinfo_local_nonprim) {
        config_node_property_string_free(sling_serverinfo_local_nonprim);
        sling_serverinfo_local_nonprim = NULL;
    }
    if (sling_additional_response_headers_local_nonprim) {
        config_node_property_array_free(sling_additional_response_headers_local_nonprim);
        sling_additional_response_headers_local_nonprim = NULL;
    }
    return NULL;

}
