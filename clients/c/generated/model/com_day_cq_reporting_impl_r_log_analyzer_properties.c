#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_reporting_impl_r_log_analyzer_properties.h"



static com_day_cq_reporting_impl_r_log_analyzer_properties_t *com_day_cq_reporting_impl_r_log_analyzer_properties_create_internal(
    config_node_property_string_t *request_log_output
    ) {
    com_day_cq_reporting_impl_r_log_analyzer_properties_t *com_day_cq_reporting_impl_r_log_analyzer_properties_local_var = malloc(sizeof(com_day_cq_reporting_impl_r_log_analyzer_properties_t));
    if (!com_day_cq_reporting_impl_r_log_analyzer_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_reporting_impl_r_log_analyzer_properties_local_var, 0, sizeof(com_day_cq_reporting_impl_r_log_analyzer_properties_t));
    com_day_cq_reporting_impl_r_log_analyzer_properties_local_var->_library_owned = 1;
    com_day_cq_reporting_impl_r_log_analyzer_properties_local_var->request_log_output = request_log_output;
    return com_day_cq_reporting_impl_r_log_analyzer_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_reporting_impl_r_log_analyzer_properties_t *com_day_cq_reporting_impl_r_log_analyzer_properties_create(
    config_node_property_string_t *request_log_output
    ) {
    com_day_cq_reporting_impl_r_log_analyzer_properties_t *result = com_day_cq_reporting_impl_r_log_analyzer_properties_create_internal (
        request_log_output
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_reporting_impl_r_log_analyzer_properties_free(com_day_cq_reporting_impl_r_log_analyzer_properties_t *com_day_cq_reporting_impl_r_log_analyzer_properties) {
    if(NULL == com_day_cq_reporting_impl_r_log_analyzer_properties){
        return ;
    }
    if(com_day_cq_reporting_impl_r_log_analyzer_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_reporting_impl_r_log_analyzer_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_reporting_impl_r_log_analyzer_properties->request_log_output) {
        config_node_property_string_free(com_day_cq_reporting_impl_r_log_analyzer_properties->request_log_output);
        com_day_cq_reporting_impl_r_log_analyzer_properties->request_log_output = NULL;
    }
    free(com_day_cq_reporting_impl_r_log_analyzer_properties);
}

cJSON *com_day_cq_reporting_impl_r_log_analyzer_properties_convertToJSON(com_day_cq_reporting_impl_r_log_analyzer_properties_t *com_day_cq_reporting_impl_r_log_analyzer_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_reporting_impl_r_log_analyzer_properties->request_log_output
    if(com_day_cq_reporting_impl_r_log_analyzer_properties->request_log_output) {
    cJSON *request_log_output_local_JSON = config_node_property_string_convertToJSON(com_day_cq_reporting_impl_r_log_analyzer_properties->request_log_output);
    if(request_log_output_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "request.log.output", request_log_output_local_JSON);
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

com_day_cq_reporting_impl_r_log_analyzer_properties_t *com_day_cq_reporting_impl_r_log_analyzer_properties_parseFromJSON(cJSON *com_day_cq_reporting_impl_r_log_analyzer_propertiesJSON){

    com_day_cq_reporting_impl_r_log_analyzer_properties_t *com_day_cq_reporting_impl_r_log_analyzer_properties_local_var = NULL;

    // define the local variable for com_day_cq_reporting_impl_r_log_analyzer_properties->request_log_output
    config_node_property_string_t *request_log_output_local_nonprim = NULL;

    // com_day_cq_reporting_impl_r_log_analyzer_properties->request_log_output
    cJSON *request_log_output = cJSON_GetObjectItemCaseSensitive(com_day_cq_reporting_impl_r_log_analyzer_propertiesJSON, "request.log.output");
    if (cJSON_IsNull(request_log_output)) {
        request_log_output = NULL;
    }
    if (request_log_output) { 
    request_log_output_local_nonprim = config_node_property_string_parseFromJSON(request_log_output); //nonprimitive
    }



    com_day_cq_reporting_impl_r_log_analyzer_properties_local_var = com_day_cq_reporting_impl_r_log_analyzer_properties_create_internal (
        request_log_output ? request_log_output_local_nonprim : NULL
        );

    if (!com_day_cq_reporting_impl_r_log_analyzer_properties_local_var) {
        goto end;
    }

    return com_day_cq_reporting_impl_r_log_analyzer_properties_local_var;
end:
    if (request_log_output_local_nonprim) {
        config_node_property_string_free(request_log_output_local_nonprim);
        request_log_output_local_nonprim = NULL;
    }
    return NULL;

}
