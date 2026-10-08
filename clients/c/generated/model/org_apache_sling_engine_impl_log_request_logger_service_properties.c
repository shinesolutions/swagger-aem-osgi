#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_engine_impl_log_request_logger_service_properties.h"



static org_apache_sling_engine_impl_log_request_logger_service_properties_t *org_apache_sling_engine_impl_log_request_logger_service_properties_create_internal(
    config_node_property_string_t *request_log_service_format,
    config_node_property_string_t *request_log_service_output,
    config_node_property_drop_down_t *request_log_service_outputtype,
    config_node_property_boolean_t *request_log_service_onentry
    ) {
    org_apache_sling_engine_impl_log_request_logger_service_properties_t *org_apache_sling_engine_impl_log_request_logger_service_properties_local_var = malloc(sizeof(org_apache_sling_engine_impl_log_request_logger_service_properties_t));
    if (!org_apache_sling_engine_impl_log_request_logger_service_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_engine_impl_log_request_logger_service_properties_local_var, 0, sizeof(org_apache_sling_engine_impl_log_request_logger_service_properties_t));
    org_apache_sling_engine_impl_log_request_logger_service_properties_local_var->_library_owned = 1;
    org_apache_sling_engine_impl_log_request_logger_service_properties_local_var->request_log_service_format = request_log_service_format;
    org_apache_sling_engine_impl_log_request_logger_service_properties_local_var->request_log_service_output = request_log_service_output;
    org_apache_sling_engine_impl_log_request_logger_service_properties_local_var->request_log_service_outputtype = request_log_service_outputtype;
    org_apache_sling_engine_impl_log_request_logger_service_properties_local_var->request_log_service_onentry = request_log_service_onentry;
    return org_apache_sling_engine_impl_log_request_logger_service_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_engine_impl_log_request_logger_service_properties_t *org_apache_sling_engine_impl_log_request_logger_service_properties_create(
    config_node_property_string_t *request_log_service_format,
    config_node_property_string_t *request_log_service_output,
    config_node_property_drop_down_t *request_log_service_outputtype,
    config_node_property_boolean_t *request_log_service_onentry
    ) {
    org_apache_sling_engine_impl_log_request_logger_service_properties_t *result = org_apache_sling_engine_impl_log_request_logger_service_properties_create_internal (
        request_log_service_format,
        request_log_service_output,
        request_log_service_outputtype,
        request_log_service_onentry
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_engine_impl_log_request_logger_service_properties_free(org_apache_sling_engine_impl_log_request_logger_service_properties_t *org_apache_sling_engine_impl_log_request_logger_service_properties) {
    if(NULL == org_apache_sling_engine_impl_log_request_logger_service_properties){
        return ;
    }
    if(org_apache_sling_engine_impl_log_request_logger_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_engine_impl_log_request_logger_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_format) {
        config_node_property_string_free(org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_format);
        org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_format = NULL;
    }
    if (org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_output) {
        config_node_property_string_free(org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_output);
        org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_output = NULL;
    }
    if (org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_outputtype) {
        config_node_property_drop_down_free(org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_outputtype);
        org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_outputtype = NULL;
    }
    if (org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_onentry) {
        config_node_property_boolean_free(org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_onentry);
        org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_onentry = NULL;
    }
    free(org_apache_sling_engine_impl_log_request_logger_service_properties);
}

cJSON *org_apache_sling_engine_impl_log_request_logger_service_properties_convertToJSON(org_apache_sling_engine_impl_log_request_logger_service_properties_t *org_apache_sling_engine_impl_log_request_logger_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_format
    if(org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_format) {
    cJSON *request_log_service_format_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_format);
    if(request_log_service_format_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "request.log.service.format", request_log_service_format_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_output
    if(org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_output) {
    cJSON *request_log_service_output_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_output);
    if(request_log_service_output_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "request.log.service.output", request_log_service_output_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_outputtype
    if(org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_outputtype) {
    cJSON *request_log_service_outputtype_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_outputtype);
    if(request_log_service_outputtype_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "request.log.service.outputtype", request_log_service_outputtype_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_onentry
    if(org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_onentry) {
    cJSON *request_log_service_onentry_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_onentry);
    if(request_log_service_onentry_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "request.log.service.onentry", request_log_service_onentry_local_JSON);
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

org_apache_sling_engine_impl_log_request_logger_service_properties_t *org_apache_sling_engine_impl_log_request_logger_service_properties_parseFromJSON(cJSON *org_apache_sling_engine_impl_log_request_logger_service_propertiesJSON){

    org_apache_sling_engine_impl_log_request_logger_service_properties_t *org_apache_sling_engine_impl_log_request_logger_service_properties_local_var = NULL;

    // define the local variable for org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_format
    config_node_property_string_t *request_log_service_format_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_output
    config_node_property_string_t *request_log_service_output_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_outputtype
    config_node_property_drop_down_t *request_log_service_outputtype_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_onentry
    config_node_property_boolean_t *request_log_service_onentry_local_nonprim = NULL;

    // org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_format
    cJSON *request_log_service_format = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_log_request_logger_service_propertiesJSON, "request.log.service.format");
    if (cJSON_IsNull(request_log_service_format)) {
        request_log_service_format = NULL;
    }
    if (request_log_service_format) { 
    request_log_service_format_local_nonprim = config_node_property_string_parseFromJSON(request_log_service_format); //nonprimitive
    }

    // org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_output
    cJSON *request_log_service_output = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_log_request_logger_service_propertiesJSON, "request.log.service.output");
    if (cJSON_IsNull(request_log_service_output)) {
        request_log_service_output = NULL;
    }
    if (request_log_service_output) { 
    request_log_service_output_local_nonprim = config_node_property_string_parseFromJSON(request_log_service_output); //nonprimitive
    }

    // org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_outputtype
    cJSON *request_log_service_outputtype = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_log_request_logger_service_propertiesJSON, "request.log.service.outputtype");
    if (cJSON_IsNull(request_log_service_outputtype)) {
        request_log_service_outputtype = NULL;
    }
    if (request_log_service_outputtype) { 
    request_log_service_outputtype_local_nonprim = config_node_property_drop_down_parseFromJSON(request_log_service_outputtype); //nonprimitive
    }

    // org_apache_sling_engine_impl_log_request_logger_service_properties->request_log_service_onentry
    cJSON *request_log_service_onentry = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_log_request_logger_service_propertiesJSON, "request.log.service.onentry");
    if (cJSON_IsNull(request_log_service_onentry)) {
        request_log_service_onentry = NULL;
    }
    if (request_log_service_onentry) { 
    request_log_service_onentry_local_nonprim = config_node_property_boolean_parseFromJSON(request_log_service_onentry); //nonprimitive
    }



    org_apache_sling_engine_impl_log_request_logger_service_properties_local_var = org_apache_sling_engine_impl_log_request_logger_service_properties_create_internal (
        request_log_service_format ? request_log_service_format_local_nonprim : NULL,
        request_log_service_output ? request_log_service_output_local_nonprim : NULL,
        request_log_service_outputtype ? request_log_service_outputtype_local_nonprim : NULL,
        request_log_service_onentry ? request_log_service_onentry_local_nonprim : NULL
        );

    if (!org_apache_sling_engine_impl_log_request_logger_service_properties_local_var) {
        goto end;
    }

    return org_apache_sling_engine_impl_log_request_logger_service_properties_local_var;
end:
    if (request_log_service_format_local_nonprim) {
        config_node_property_string_free(request_log_service_format_local_nonprim);
        request_log_service_format_local_nonprim = NULL;
    }
    if (request_log_service_output_local_nonprim) {
        config_node_property_string_free(request_log_service_output_local_nonprim);
        request_log_service_output_local_nonprim = NULL;
    }
    if (request_log_service_outputtype_local_nonprim) {
        config_node_property_drop_down_free(request_log_service_outputtype_local_nonprim);
        request_log_service_outputtype_local_nonprim = NULL;
    }
    if (request_log_service_onentry_local_nonprim) {
        config_node_property_boolean_free(request_log_service_onentry_local_nonprim);
        request_log_service_onentry_local_nonprim = NULL;
    }
    return NULL;

}
