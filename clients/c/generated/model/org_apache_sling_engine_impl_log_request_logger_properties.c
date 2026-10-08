#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_engine_impl_log_request_logger_properties.h"



static org_apache_sling_engine_impl_log_request_logger_properties_t *org_apache_sling_engine_impl_log_request_logger_properties_create_internal(
    config_node_property_string_t *request_log_output,
    config_node_property_drop_down_t *request_log_outputtype,
    config_node_property_boolean_t *request_log_enabled,
    config_node_property_string_t *access_log_output,
    config_node_property_drop_down_t *access_log_outputtype,
    config_node_property_boolean_t *access_log_enabled
    ) {
    org_apache_sling_engine_impl_log_request_logger_properties_t *org_apache_sling_engine_impl_log_request_logger_properties_local_var = malloc(sizeof(org_apache_sling_engine_impl_log_request_logger_properties_t));
    if (!org_apache_sling_engine_impl_log_request_logger_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_engine_impl_log_request_logger_properties_local_var, 0, sizeof(org_apache_sling_engine_impl_log_request_logger_properties_t));
    org_apache_sling_engine_impl_log_request_logger_properties_local_var->_library_owned = 1;
    org_apache_sling_engine_impl_log_request_logger_properties_local_var->request_log_output = request_log_output;
    org_apache_sling_engine_impl_log_request_logger_properties_local_var->request_log_outputtype = request_log_outputtype;
    org_apache_sling_engine_impl_log_request_logger_properties_local_var->request_log_enabled = request_log_enabled;
    org_apache_sling_engine_impl_log_request_logger_properties_local_var->access_log_output = access_log_output;
    org_apache_sling_engine_impl_log_request_logger_properties_local_var->access_log_outputtype = access_log_outputtype;
    org_apache_sling_engine_impl_log_request_logger_properties_local_var->access_log_enabled = access_log_enabled;
    return org_apache_sling_engine_impl_log_request_logger_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_engine_impl_log_request_logger_properties_t *org_apache_sling_engine_impl_log_request_logger_properties_create(
    config_node_property_string_t *request_log_output,
    config_node_property_drop_down_t *request_log_outputtype,
    config_node_property_boolean_t *request_log_enabled,
    config_node_property_string_t *access_log_output,
    config_node_property_drop_down_t *access_log_outputtype,
    config_node_property_boolean_t *access_log_enabled
    ) {
    org_apache_sling_engine_impl_log_request_logger_properties_t *result = org_apache_sling_engine_impl_log_request_logger_properties_create_internal (
        request_log_output,
        request_log_outputtype,
        request_log_enabled,
        access_log_output,
        access_log_outputtype,
        access_log_enabled
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_engine_impl_log_request_logger_properties_free(org_apache_sling_engine_impl_log_request_logger_properties_t *org_apache_sling_engine_impl_log_request_logger_properties) {
    if(NULL == org_apache_sling_engine_impl_log_request_logger_properties){
        return ;
    }
    if(org_apache_sling_engine_impl_log_request_logger_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_engine_impl_log_request_logger_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_engine_impl_log_request_logger_properties->request_log_output) {
        config_node_property_string_free(org_apache_sling_engine_impl_log_request_logger_properties->request_log_output);
        org_apache_sling_engine_impl_log_request_logger_properties->request_log_output = NULL;
    }
    if (org_apache_sling_engine_impl_log_request_logger_properties->request_log_outputtype) {
        config_node_property_drop_down_free(org_apache_sling_engine_impl_log_request_logger_properties->request_log_outputtype);
        org_apache_sling_engine_impl_log_request_logger_properties->request_log_outputtype = NULL;
    }
    if (org_apache_sling_engine_impl_log_request_logger_properties->request_log_enabled) {
        config_node_property_boolean_free(org_apache_sling_engine_impl_log_request_logger_properties->request_log_enabled);
        org_apache_sling_engine_impl_log_request_logger_properties->request_log_enabled = NULL;
    }
    if (org_apache_sling_engine_impl_log_request_logger_properties->access_log_output) {
        config_node_property_string_free(org_apache_sling_engine_impl_log_request_logger_properties->access_log_output);
        org_apache_sling_engine_impl_log_request_logger_properties->access_log_output = NULL;
    }
    if (org_apache_sling_engine_impl_log_request_logger_properties->access_log_outputtype) {
        config_node_property_drop_down_free(org_apache_sling_engine_impl_log_request_logger_properties->access_log_outputtype);
        org_apache_sling_engine_impl_log_request_logger_properties->access_log_outputtype = NULL;
    }
    if (org_apache_sling_engine_impl_log_request_logger_properties->access_log_enabled) {
        config_node_property_boolean_free(org_apache_sling_engine_impl_log_request_logger_properties->access_log_enabled);
        org_apache_sling_engine_impl_log_request_logger_properties->access_log_enabled = NULL;
    }
    free(org_apache_sling_engine_impl_log_request_logger_properties);
}

cJSON *org_apache_sling_engine_impl_log_request_logger_properties_convertToJSON(org_apache_sling_engine_impl_log_request_logger_properties_t *org_apache_sling_engine_impl_log_request_logger_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_engine_impl_log_request_logger_properties->request_log_output
    if(org_apache_sling_engine_impl_log_request_logger_properties->request_log_output) {
    cJSON *request_log_output_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_engine_impl_log_request_logger_properties->request_log_output);
    if(request_log_output_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "request.log.output", request_log_output_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_log_request_logger_properties->request_log_outputtype
    if(org_apache_sling_engine_impl_log_request_logger_properties->request_log_outputtype) {
    cJSON *request_log_outputtype_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_engine_impl_log_request_logger_properties->request_log_outputtype);
    if(request_log_outputtype_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "request.log.outputtype", request_log_outputtype_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_log_request_logger_properties->request_log_enabled
    if(org_apache_sling_engine_impl_log_request_logger_properties->request_log_enabled) {
    cJSON *request_log_enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_engine_impl_log_request_logger_properties->request_log_enabled);
    if(request_log_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "request.log.enabled", request_log_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_log_request_logger_properties->access_log_output
    if(org_apache_sling_engine_impl_log_request_logger_properties->access_log_output) {
    cJSON *access_log_output_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_engine_impl_log_request_logger_properties->access_log_output);
    if(access_log_output_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "access.log.output", access_log_output_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_log_request_logger_properties->access_log_outputtype
    if(org_apache_sling_engine_impl_log_request_logger_properties->access_log_outputtype) {
    cJSON *access_log_outputtype_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_engine_impl_log_request_logger_properties->access_log_outputtype);
    if(access_log_outputtype_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "access.log.outputtype", access_log_outputtype_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_impl_log_request_logger_properties->access_log_enabled
    if(org_apache_sling_engine_impl_log_request_logger_properties->access_log_enabled) {
    cJSON *access_log_enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_engine_impl_log_request_logger_properties->access_log_enabled);
    if(access_log_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "access.log.enabled", access_log_enabled_local_JSON);
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

org_apache_sling_engine_impl_log_request_logger_properties_t *org_apache_sling_engine_impl_log_request_logger_properties_parseFromJSON(cJSON *org_apache_sling_engine_impl_log_request_logger_propertiesJSON){

    org_apache_sling_engine_impl_log_request_logger_properties_t *org_apache_sling_engine_impl_log_request_logger_properties_local_var = NULL;

    // define the local variable for org_apache_sling_engine_impl_log_request_logger_properties->request_log_output
    config_node_property_string_t *request_log_output_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_log_request_logger_properties->request_log_outputtype
    config_node_property_drop_down_t *request_log_outputtype_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_log_request_logger_properties->request_log_enabled
    config_node_property_boolean_t *request_log_enabled_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_log_request_logger_properties->access_log_output
    config_node_property_string_t *access_log_output_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_log_request_logger_properties->access_log_outputtype
    config_node_property_drop_down_t *access_log_outputtype_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_impl_log_request_logger_properties->access_log_enabled
    config_node_property_boolean_t *access_log_enabled_local_nonprim = NULL;

    // org_apache_sling_engine_impl_log_request_logger_properties->request_log_output
    cJSON *request_log_output = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_log_request_logger_propertiesJSON, "request.log.output");
    if (cJSON_IsNull(request_log_output)) {
        request_log_output = NULL;
    }
    if (request_log_output) { 
    request_log_output_local_nonprim = config_node_property_string_parseFromJSON(request_log_output); //nonprimitive
    }

    // org_apache_sling_engine_impl_log_request_logger_properties->request_log_outputtype
    cJSON *request_log_outputtype = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_log_request_logger_propertiesJSON, "request.log.outputtype");
    if (cJSON_IsNull(request_log_outputtype)) {
        request_log_outputtype = NULL;
    }
    if (request_log_outputtype) { 
    request_log_outputtype_local_nonprim = config_node_property_drop_down_parseFromJSON(request_log_outputtype); //nonprimitive
    }

    // org_apache_sling_engine_impl_log_request_logger_properties->request_log_enabled
    cJSON *request_log_enabled = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_log_request_logger_propertiesJSON, "request.log.enabled");
    if (cJSON_IsNull(request_log_enabled)) {
        request_log_enabled = NULL;
    }
    if (request_log_enabled) { 
    request_log_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(request_log_enabled); //nonprimitive
    }

    // org_apache_sling_engine_impl_log_request_logger_properties->access_log_output
    cJSON *access_log_output = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_log_request_logger_propertiesJSON, "access.log.output");
    if (cJSON_IsNull(access_log_output)) {
        access_log_output = NULL;
    }
    if (access_log_output) { 
    access_log_output_local_nonprim = config_node_property_string_parseFromJSON(access_log_output); //nonprimitive
    }

    // org_apache_sling_engine_impl_log_request_logger_properties->access_log_outputtype
    cJSON *access_log_outputtype = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_log_request_logger_propertiesJSON, "access.log.outputtype");
    if (cJSON_IsNull(access_log_outputtype)) {
        access_log_outputtype = NULL;
    }
    if (access_log_outputtype) { 
    access_log_outputtype_local_nonprim = config_node_property_drop_down_parseFromJSON(access_log_outputtype); //nonprimitive
    }

    // org_apache_sling_engine_impl_log_request_logger_properties->access_log_enabled
    cJSON *access_log_enabled = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_impl_log_request_logger_propertiesJSON, "access.log.enabled");
    if (cJSON_IsNull(access_log_enabled)) {
        access_log_enabled = NULL;
    }
    if (access_log_enabled) { 
    access_log_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(access_log_enabled); //nonprimitive
    }



    org_apache_sling_engine_impl_log_request_logger_properties_local_var = org_apache_sling_engine_impl_log_request_logger_properties_create_internal (
        request_log_output ? request_log_output_local_nonprim : NULL,
        request_log_outputtype ? request_log_outputtype_local_nonprim : NULL,
        request_log_enabled ? request_log_enabled_local_nonprim : NULL,
        access_log_output ? access_log_output_local_nonprim : NULL,
        access_log_outputtype ? access_log_outputtype_local_nonprim : NULL,
        access_log_enabled ? access_log_enabled_local_nonprim : NULL
        );

    if (!org_apache_sling_engine_impl_log_request_logger_properties_local_var) {
        goto end;
    }

    return org_apache_sling_engine_impl_log_request_logger_properties_local_var;
end:
    if (request_log_output_local_nonprim) {
        config_node_property_string_free(request_log_output_local_nonprim);
        request_log_output_local_nonprim = NULL;
    }
    if (request_log_outputtype_local_nonprim) {
        config_node_property_drop_down_free(request_log_outputtype_local_nonprim);
        request_log_outputtype_local_nonprim = NULL;
    }
    if (request_log_enabled_local_nonprim) {
        config_node_property_boolean_free(request_log_enabled_local_nonprim);
        request_log_enabled_local_nonprim = NULL;
    }
    if (access_log_output_local_nonprim) {
        config_node_property_string_free(access_log_output_local_nonprim);
        access_log_output_local_nonprim = NULL;
    }
    if (access_log_outputtype_local_nonprim) {
        config_node_property_drop_down_free(access_log_outputtype_local_nonprim);
        access_log_outputtype_local_nonprim = NULL;
    }
    if (access_log_enabled_local_nonprim) {
        config_node_property_boolean_free(access_log_enabled_local_nonprim);
        access_log_enabled_local_nonprim = NULL;
    }
    return NULL;

}
