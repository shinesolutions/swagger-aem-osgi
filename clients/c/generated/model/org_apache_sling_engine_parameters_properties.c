#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_engine_parameters_properties.h"



static org_apache_sling_engine_parameters_properties_t *org_apache_sling_engine_parameters_properties_create_internal(
    config_node_property_string_t *sling_default_parameter_encoding,
    config_node_property_integer_t *sling_default_max_parameters,
    config_node_property_string_t *file_location,
    config_node_property_integer_t *file_threshold,
    config_node_property_integer_t *file_max,
    config_node_property_integer_t *request_max,
    config_node_property_boolean_t *sling_default_parameter_check_for_additional_container_parameters
    ) {
    org_apache_sling_engine_parameters_properties_t *org_apache_sling_engine_parameters_properties_local_var = malloc(sizeof(org_apache_sling_engine_parameters_properties_t));
    if (!org_apache_sling_engine_parameters_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_engine_parameters_properties_local_var, 0, sizeof(org_apache_sling_engine_parameters_properties_t));
    org_apache_sling_engine_parameters_properties_local_var->_library_owned = 1;
    org_apache_sling_engine_parameters_properties_local_var->sling_default_parameter_encoding = sling_default_parameter_encoding;
    org_apache_sling_engine_parameters_properties_local_var->sling_default_max_parameters = sling_default_max_parameters;
    org_apache_sling_engine_parameters_properties_local_var->file_location = file_location;
    org_apache_sling_engine_parameters_properties_local_var->file_threshold = file_threshold;
    org_apache_sling_engine_parameters_properties_local_var->file_max = file_max;
    org_apache_sling_engine_parameters_properties_local_var->request_max = request_max;
    org_apache_sling_engine_parameters_properties_local_var->sling_default_parameter_check_for_additional_container_parameters = sling_default_parameter_check_for_additional_container_parameters;
    return org_apache_sling_engine_parameters_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_engine_parameters_properties_t *org_apache_sling_engine_parameters_properties_create(
    config_node_property_string_t *sling_default_parameter_encoding,
    config_node_property_integer_t *sling_default_max_parameters,
    config_node_property_string_t *file_location,
    config_node_property_integer_t *file_threshold,
    config_node_property_integer_t *file_max,
    config_node_property_integer_t *request_max,
    config_node_property_boolean_t *sling_default_parameter_check_for_additional_container_parameters
    ) {
    org_apache_sling_engine_parameters_properties_t *result = org_apache_sling_engine_parameters_properties_create_internal (
        sling_default_parameter_encoding,
        sling_default_max_parameters,
        file_location,
        file_threshold,
        file_max,
        request_max,
        sling_default_parameter_check_for_additional_container_parameters
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_engine_parameters_properties_free(org_apache_sling_engine_parameters_properties_t *org_apache_sling_engine_parameters_properties) {
    if(NULL == org_apache_sling_engine_parameters_properties){
        return ;
    }
    if(org_apache_sling_engine_parameters_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_engine_parameters_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_engine_parameters_properties->sling_default_parameter_encoding) {
        config_node_property_string_free(org_apache_sling_engine_parameters_properties->sling_default_parameter_encoding);
        org_apache_sling_engine_parameters_properties->sling_default_parameter_encoding = NULL;
    }
    if (org_apache_sling_engine_parameters_properties->sling_default_max_parameters) {
        config_node_property_integer_free(org_apache_sling_engine_parameters_properties->sling_default_max_parameters);
        org_apache_sling_engine_parameters_properties->sling_default_max_parameters = NULL;
    }
    if (org_apache_sling_engine_parameters_properties->file_location) {
        config_node_property_string_free(org_apache_sling_engine_parameters_properties->file_location);
        org_apache_sling_engine_parameters_properties->file_location = NULL;
    }
    if (org_apache_sling_engine_parameters_properties->file_threshold) {
        config_node_property_integer_free(org_apache_sling_engine_parameters_properties->file_threshold);
        org_apache_sling_engine_parameters_properties->file_threshold = NULL;
    }
    if (org_apache_sling_engine_parameters_properties->file_max) {
        config_node_property_integer_free(org_apache_sling_engine_parameters_properties->file_max);
        org_apache_sling_engine_parameters_properties->file_max = NULL;
    }
    if (org_apache_sling_engine_parameters_properties->request_max) {
        config_node_property_integer_free(org_apache_sling_engine_parameters_properties->request_max);
        org_apache_sling_engine_parameters_properties->request_max = NULL;
    }
    if (org_apache_sling_engine_parameters_properties->sling_default_parameter_check_for_additional_container_parameters) {
        config_node_property_boolean_free(org_apache_sling_engine_parameters_properties->sling_default_parameter_check_for_additional_container_parameters);
        org_apache_sling_engine_parameters_properties->sling_default_parameter_check_for_additional_container_parameters = NULL;
    }
    free(org_apache_sling_engine_parameters_properties);
}

cJSON *org_apache_sling_engine_parameters_properties_convertToJSON(org_apache_sling_engine_parameters_properties_t *org_apache_sling_engine_parameters_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_engine_parameters_properties->sling_default_parameter_encoding
    if(org_apache_sling_engine_parameters_properties->sling_default_parameter_encoding) {
    cJSON *sling_default_parameter_encoding_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_engine_parameters_properties->sling_default_parameter_encoding);
    if(sling_default_parameter_encoding_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.default.parameter.encoding", sling_default_parameter_encoding_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_parameters_properties->sling_default_max_parameters
    if(org_apache_sling_engine_parameters_properties->sling_default_max_parameters) {
    cJSON *sling_default_max_parameters_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_engine_parameters_properties->sling_default_max_parameters);
    if(sling_default_max_parameters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.default.max.parameters", sling_default_max_parameters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_parameters_properties->file_location
    if(org_apache_sling_engine_parameters_properties->file_location) {
    cJSON *file_location_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_engine_parameters_properties->file_location);
    if(file_location_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "file.location", file_location_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_parameters_properties->file_threshold
    if(org_apache_sling_engine_parameters_properties->file_threshold) {
    cJSON *file_threshold_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_engine_parameters_properties->file_threshold);
    if(file_threshold_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "file.threshold", file_threshold_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_parameters_properties->file_max
    if(org_apache_sling_engine_parameters_properties->file_max) {
    cJSON *file_max_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_engine_parameters_properties->file_max);
    if(file_max_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "file.max", file_max_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_parameters_properties->request_max
    if(org_apache_sling_engine_parameters_properties->request_max) {
    cJSON *request_max_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_engine_parameters_properties->request_max);
    if(request_max_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "request.max", request_max_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_engine_parameters_properties->sling_default_parameter_check_for_additional_container_parameters
    if(org_apache_sling_engine_parameters_properties->sling_default_parameter_check_for_additional_container_parameters) {
    cJSON *sling_default_parameter_check_for_additional_container_parameters_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_engine_parameters_properties->sling_default_parameter_check_for_additional_container_parameters);
    if(sling_default_parameter_check_for_additional_container_parameters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.default.parameter.checkForAdditionalContainerParameters", sling_default_parameter_check_for_additional_container_parameters_local_JSON);
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

org_apache_sling_engine_parameters_properties_t *org_apache_sling_engine_parameters_properties_parseFromJSON(cJSON *org_apache_sling_engine_parameters_propertiesJSON){

    org_apache_sling_engine_parameters_properties_t *org_apache_sling_engine_parameters_properties_local_var = NULL;

    // define the local variable for org_apache_sling_engine_parameters_properties->sling_default_parameter_encoding
    config_node_property_string_t *sling_default_parameter_encoding_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_parameters_properties->sling_default_max_parameters
    config_node_property_integer_t *sling_default_max_parameters_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_parameters_properties->file_location
    config_node_property_string_t *file_location_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_parameters_properties->file_threshold
    config_node_property_integer_t *file_threshold_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_parameters_properties->file_max
    config_node_property_integer_t *file_max_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_parameters_properties->request_max
    config_node_property_integer_t *request_max_local_nonprim = NULL;

    // define the local variable for org_apache_sling_engine_parameters_properties->sling_default_parameter_check_for_additional_container_parameters
    config_node_property_boolean_t *sling_default_parameter_check_for_additional_container_parameters_local_nonprim = NULL;

    // org_apache_sling_engine_parameters_properties->sling_default_parameter_encoding
    cJSON *sling_default_parameter_encoding = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_parameters_propertiesJSON, "sling.default.parameter.encoding");
    if (cJSON_IsNull(sling_default_parameter_encoding)) {
        sling_default_parameter_encoding = NULL;
    }
    if (sling_default_parameter_encoding) { 
    sling_default_parameter_encoding_local_nonprim = config_node_property_string_parseFromJSON(sling_default_parameter_encoding); //nonprimitive
    }

    // org_apache_sling_engine_parameters_properties->sling_default_max_parameters
    cJSON *sling_default_max_parameters = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_parameters_propertiesJSON, "sling.default.max.parameters");
    if (cJSON_IsNull(sling_default_max_parameters)) {
        sling_default_max_parameters = NULL;
    }
    if (sling_default_max_parameters) { 
    sling_default_max_parameters_local_nonprim = config_node_property_integer_parseFromJSON(sling_default_max_parameters); //nonprimitive
    }

    // org_apache_sling_engine_parameters_properties->file_location
    cJSON *file_location = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_parameters_propertiesJSON, "file.location");
    if (cJSON_IsNull(file_location)) {
        file_location = NULL;
    }
    if (file_location) { 
    file_location_local_nonprim = config_node_property_string_parseFromJSON(file_location); //nonprimitive
    }

    // org_apache_sling_engine_parameters_properties->file_threshold
    cJSON *file_threshold = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_parameters_propertiesJSON, "file.threshold");
    if (cJSON_IsNull(file_threshold)) {
        file_threshold = NULL;
    }
    if (file_threshold) { 
    file_threshold_local_nonprim = config_node_property_integer_parseFromJSON(file_threshold); //nonprimitive
    }

    // org_apache_sling_engine_parameters_properties->file_max
    cJSON *file_max = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_parameters_propertiesJSON, "file.max");
    if (cJSON_IsNull(file_max)) {
        file_max = NULL;
    }
    if (file_max) { 
    file_max_local_nonprim = config_node_property_integer_parseFromJSON(file_max); //nonprimitive
    }

    // org_apache_sling_engine_parameters_properties->request_max
    cJSON *request_max = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_parameters_propertiesJSON, "request.max");
    if (cJSON_IsNull(request_max)) {
        request_max = NULL;
    }
    if (request_max) { 
    request_max_local_nonprim = config_node_property_integer_parseFromJSON(request_max); //nonprimitive
    }

    // org_apache_sling_engine_parameters_properties->sling_default_parameter_check_for_additional_container_parameters
    cJSON *sling_default_parameter_check_for_additional_container_parameters = cJSON_GetObjectItemCaseSensitive(org_apache_sling_engine_parameters_propertiesJSON, "sling.default.parameter.checkForAdditionalContainerParameters");
    if (cJSON_IsNull(sling_default_parameter_check_for_additional_container_parameters)) {
        sling_default_parameter_check_for_additional_container_parameters = NULL;
    }
    if (sling_default_parameter_check_for_additional_container_parameters) { 
    sling_default_parameter_check_for_additional_container_parameters_local_nonprim = config_node_property_boolean_parseFromJSON(sling_default_parameter_check_for_additional_container_parameters); //nonprimitive
    }



    org_apache_sling_engine_parameters_properties_local_var = org_apache_sling_engine_parameters_properties_create_internal (
        sling_default_parameter_encoding ? sling_default_parameter_encoding_local_nonprim : NULL,
        sling_default_max_parameters ? sling_default_max_parameters_local_nonprim : NULL,
        file_location ? file_location_local_nonprim : NULL,
        file_threshold ? file_threshold_local_nonprim : NULL,
        file_max ? file_max_local_nonprim : NULL,
        request_max ? request_max_local_nonprim : NULL,
        sling_default_parameter_check_for_additional_container_parameters ? sling_default_parameter_check_for_additional_container_parameters_local_nonprim : NULL
        );

    if (!org_apache_sling_engine_parameters_properties_local_var) {
        goto end;
    }

    return org_apache_sling_engine_parameters_properties_local_var;
end:
    if (sling_default_parameter_encoding_local_nonprim) {
        config_node_property_string_free(sling_default_parameter_encoding_local_nonprim);
        sling_default_parameter_encoding_local_nonprim = NULL;
    }
    if (sling_default_max_parameters_local_nonprim) {
        config_node_property_integer_free(sling_default_max_parameters_local_nonprim);
        sling_default_max_parameters_local_nonprim = NULL;
    }
    if (file_location_local_nonprim) {
        config_node_property_string_free(file_location_local_nonprim);
        file_location_local_nonprim = NULL;
    }
    if (file_threshold_local_nonprim) {
        config_node_property_integer_free(file_threshold_local_nonprim);
        file_threshold_local_nonprim = NULL;
    }
    if (file_max_local_nonprim) {
        config_node_property_integer_free(file_max_local_nonprim);
        file_max_local_nonprim = NULL;
    }
    if (request_max_local_nonprim) {
        config_node_property_integer_free(request_max_local_nonprim);
        request_max_local_nonprim = NULL;
    }
    if (sling_default_parameter_check_for_additional_container_parameters_local_nonprim) {
        config_node_property_boolean_free(sling_default_parameter_check_for_additional_container_parameters_local_nonprim);
        sling_default_parameter_check_for_additional_container_parameters_local_nonprim = NULL;
    }
    return NULL;

}
