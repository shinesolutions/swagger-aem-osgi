#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_ids_impl_ids_job_processor_properties.h"



static com_day_cq_dam_ids_impl_ids_job_processor_properties_t *com_day_cq_dam_ids_impl_ids_job_processor_properties_create_internal(
    config_node_property_boolean_t *enable_multisession,
    config_node_property_boolean_t *ids_cc_enable,
    config_node_property_boolean_t *enable_retry,
    config_node_property_boolean_t *enable_retry_scripterror,
    config_node_property_string_t *externalizer_domain_cqhost,
    config_node_property_string_t *externalizer_domain_http
    ) {
    com_day_cq_dam_ids_impl_ids_job_processor_properties_t *com_day_cq_dam_ids_impl_ids_job_processor_properties_local_var = malloc(sizeof(com_day_cq_dam_ids_impl_ids_job_processor_properties_t));
    if (!com_day_cq_dam_ids_impl_ids_job_processor_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_ids_impl_ids_job_processor_properties_local_var, 0, sizeof(com_day_cq_dam_ids_impl_ids_job_processor_properties_t));
    com_day_cq_dam_ids_impl_ids_job_processor_properties_local_var->_library_owned = 1;
    com_day_cq_dam_ids_impl_ids_job_processor_properties_local_var->enable_multisession = enable_multisession;
    com_day_cq_dam_ids_impl_ids_job_processor_properties_local_var->ids_cc_enable = ids_cc_enable;
    com_day_cq_dam_ids_impl_ids_job_processor_properties_local_var->enable_retry = enable_retry;
    com_day_cq_dam_ids_impl_ids_job_processor_properties_local_var->enable_retry_scripterror = enable_retry_scripterror;
    com_day_cq_dam_ids_impl_ids_job_processor_properties_local_var->externalizer_domain_cqhost = externalizer_domain_cqhost;
    com_day_cq_dam_ids_impl_ids_job_processor_properties_local_var->externalizer_domain_http = externalizer_domain_http;
    return com_day_cq_dam_ids_impl_ids_job_processor_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_ids_impl_ids_job_processor_properties_t *com_day_cq_dam_ids_impl_ids_job_processor_properties_create(
    config_node_property_boolean_t *enable_multisession,
    config_node_property_boolean_t *ids_cc_enable,
    config_node_property_boolean_t *enable_retry,
    config_node_property_boolean_t *enable_retry_scripterror,
    config_node_property_string_t *externalizer_domain_cqhost,
    config_node_property_string_t *externalizer_domain_http
    ) {
    com_day_cq_dam_ids_impl_ids_job_processor_properties_t *result = com_day_cq_dam_ids_impl_ids_job_processor_properties_create_internal (
        enable_multisession,
        ids_cc_enable,
        enable_retry,
        enable_retry_scripterror,
        externalizer_domain_cqhost,
        externalizer_domain_http
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_ids_impl_ids_job_processor_properties_free(com_day_cq_dam_ids_impl_ids_job_processor_properties_t *com_day_cq_dam_ids_impl_ids_job_processor_properties) {
    if(NULL == com_day_cq_dam_ids_impl_ids_job_processor_properties){
        return ;
    }
    if(com_day_cq_dam_ids_impl_ids_job_processor_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_ids_impl_ids_job_processor_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_multisession) {
        config_node_property_boolean_free(com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_multisession);
        com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_multisession = NULL;
    }
    if (com_day_cq_dam_ids_impl_ids_job_processor_properties->ids_cc_enable) {
        config_node_property_boolean_free(com_day_cq_dam_ids_impl_ids_job_processor_properties->ids_cc_enable);
        com_day_cq_dam_ids_impl_ids_job_processor_properties->ids_cc_enable = NULL;
    }
    if (com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_retry) {
        config_node_property_boolean_free(com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_retry);
        com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_retry = NULL;
    }
    if (com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_retry_scripterror) {
        config_node_property_boolean_free(com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_retry_scripterror);
        com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_retry_scripterror = NULL;
    }
    if (com_day_cq_dam_ids_impl_ids_job_processor_properties->externalizer_domain_cqhost) {
        config_node_property_string_free(com_day_cq_dam_ids_impl_ids_job_processor_properties->externalizer_domain_cqhost);
        com_day_cq_dam_ids_impl_ids_job_processor_properties->externalizer_domain_cqhost = NULL;
    }
    if (com_day_cq_dam_ids_impl_ids_job_processor_properties->externalizer_domain_http) {
        config_node_property_string_free(com_day_cq_dam_ids_impl_ids_job_processor_properties->externalizer_domain_http);
        com_day_cq_dam_ids_impl_ids_job_processor_properties->externalizer_domain_http = NULL;
    }
    free(com_day_cq_dam_ids_impl_ids_job_processor_properties);
}

cJSON *com_day_cq_dam_ids_impl_ids_job_processor_properties_convertToJSON(com_day_cq_dam_ids_impl_ids_job_processor_properties_t *com_day_cq_dam_ids_impl_ids_job_processor_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_multisession
    if(com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_multisession) {
    cJSON *enable_multisession_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_multisession);
    if(enable_multisession_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enable.multisession", enable_multisession_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_ids_impl_ids_job_processor_properties->ids_cc_enable
    if(com_day_cq_dam_ids_impl_ids_job_processor_properties->ids_cc_enable) {
    cJSON *ids_cc_enable_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_ids_impl_ids_job_processor_properties->ids_cc_enable);
    if(ids_cc_enable_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ids.cc.enable", ids_cc_enable_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_retry
    if(com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_retry) {
    cJSON *enable_retry_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_retry);
    if(enable_retry_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enable.retry", enable_retry_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_retry_scripterror
    if(com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_retry_scripterror) {
    cJSON *enable_retry_scripterror_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_retry_scripterror);
    if(enable_retry_scripterror_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enable.retry.scripterror", enable_retry_scripterror_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_ids_impl_ids_job_processor_properties->externalizer_domain_cqhost
    if(com_day_cq_dam_ids_impl_ids_job_processor_properties->externalizer_domain_cqhost) {
    cJSON *externalizer_domain_cqhost_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_ids_impl_ids_job_processor_properties->externalizer_domain_cqhost);
    if(externalizer_domain_cqhost_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "externalizer.domain.cqhost", externalizer_domain_cqhost_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_ids_impl_ids_job_processor_properties->externalizer_domain_http
    if(com_day_cq_dam_ids_impl_ids_job_processor_properties->externalizer_domain_http) {
    cJSON *externalizer_domain_http_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_ids_impl_ids_job_processor_properties->externalizer_domain_http);
    if(externalizer_domain_http_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "externalizer.domain.http", externalizer_domain_http_local_JSON);
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

com_day_cq_dam_ids_impl_ids_job_processor_properties_t *com_day_cq_dam_ids_impl_ids_job_processor_properties_parseFromJSON(cJSON *com_day_cq_dam_ids_impl_ids_job_processor_propertiesJSON){

    com_day_cq_dam_ids_impl_ids_job_processor_properties_t *com_day_cq_dam_ids_impl_ids_job_processor_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_multisession
    config_node_property_boolean_t *enable_multisession_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_ids_impl_ids_job_processor_properties->ids_cc_enable
    config_node_property_boolean_t *ids_cc_enable_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_retry
    config_node_property_boolean_t *enable_retry_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_retry_scripterror
    config_node_property_boolean_t *enable_retry_scripterror_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_ids_impl_ids_job_processor_properties->externalizer_domain_cqhost
    config_node_property_string_t *externalizer_domain_cqhost_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_ids_impl_ids_job_processor_properties->externalizer_domain_http
    config_node_property_string_t *externalizer_domain_http_local_nonprim = NULL;

    // com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_multisession
    cJSON *enable_multisession = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_ids_impl_ids_job_processor_propertiesJSON, "enable.multisession");
    if (cJSON_IsNull(enable_multisession)) {
        enable_multisession = NULL;
    }
    if (enable_multisession) { 
    enable_multisession_local_nonprim = config_node_property_boolean_parseFromJSON(enable_multisession); //nonprimitive
    }

    // com_day_cq_dam_ids_impl_ids_job_processor_properties->ids_cc_enable
    cJSON *ids_cc_enable = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_ids_impl_ids_job_processor_propertiesJSON, "ids.cc.enable");
    if (cJSON_IsNull(ids_cc_enable)) {
        ids_cc_enable = NULL;
    }
    if (ids_cc_enable) { 
    ids_cc_enable_local_nonprim = config_node_property_boolean_parseFromJSON(ids_cc_enable); //nonprimitive
    }

    // com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_retry
    cJSON *enable_retry = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_ids_impl_ids_job_processor_propertiesJSON, "enable.retry");
    if (cJSON_IsNull(enable_retry)) {
        enable_retry = NULL;
    }
    if (enable_retry) { 
    enable_retry_local_nonprim = config_node_property_boolean_parseFromJSON(enable_retry); //nonprimitive
    }

    // com_day_cq_dam_ids_impl_ids_job_processor_properties->enable_retry_scripterror
    cJSON *enable_retry_scripterror = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_ids_impl_ids_job_processor_propertiesJSON, "enable.retry.scripterror");
    if (cJSON_IsNull(enable_retry_scripterror)) {
        enable_retry_scripterror = NULL;
    }
    if (enable_retry_scripterror) { 
    enable_retry_scripterror_local_nonprim = config_node_property_boolean_parseFromJSON(enable_retry_scripterror); //nonprimitive
    }

    // com_day_cq_dam_ids_impl_ids_job_processor_properties->externalizer_domain_cqhost
    cJSON *externalizer_domain_cqhost = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_ids_impl_ids_job_processor_propertiesJSON, "externalizer.domain.cqhost");
    if (cJSON_IsNull(externalizer_domain_cqhost)) {
        externalizer_domain_cqhost = NULL;
    }
    if (externalizer_domain_cqhost) { 
    externalizer_domain_cqhost_local_nonprim = config_node_property_string_parseFromJSON(externalizer_domain_cqhost); //nonprimitive
    }

    // com_day_cq_dam_ids_impl_ids_job_processor_properties->externalizer_domain_http
    cJSON *externalizer_domain_http = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_ids_impl_ids_job_processor_propertiesJSON, "externalizer.domain.http");
    if (cJSON_IsNull(externalizer_domain_http)) {
        externalizer_domain_http = NULL;
    }
    if (externalizer_domain_http) { 
    externalizer_domain_http_local_nonprim = config_node_property_string_parseFromJSON(externalizer_domain_http); //nonprimitive
    }



    com_day_cq_dam_ids_impl_ids_job_processor_properties_local_var = com_day_cq_dam_ids_impl_ids_job_processor_properties_create_internal (
        enable_multisession ? enable_multisession_local_nonprim : NULL,
        ids_cc_enable ? ids_cc_enable_local_nonprim : NULL,
        enable_retry ? enable_retry_local_nonprim : NULL,
        enable_retry_scripterror ? enable_retry_scripterror_local_nonprim : NULL,
        externalizer_domain_cqhost ? externalizer_domain_cqhost_local_nonprim : NULL,
        externalizer_domain_http ? externalizer_domain_http_local_nonprim : NULL
        );

    if (!com_day_cq_dam_ids_impl_ids_job_processor_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_ids_impl_ids_job_processor_properties_local_var;
end:
    if (enable_multisession_local_nonprim) {
        config_node_property_boolean_free(enable_multisession_local_nonprim);
        enable_multisession_local_nonprim = NULL;
    }
    if (ids_cc_enable_local_nonprim) {
        config_node_property_boolean_free(ids_cc_enable_local_nonprim);
        ids_cc_enable_local_nonprim = NULL;
    }
    if (enable_retry_local_nonprim) {
        config_node_property_boolean_free(enable_retry_local_nonprim);
        enable_retry_local_nonprim = NULL;
    }
    if (enable_retry_scripterror_local_nonprim) {
        config_node_property_boolean_free(enable_retry_scripterror_local_nonprim);
        enable_retry_scripterror_local_nonprim = NULL;
    }
    if (externalizer_domain_cqhost_local_nonprim) {
        config_node_property_string_free(externalizer_domain_cqhost_local_nonprim);
        externalizer_domain_cqhost_local_nonprim = NULL;
    }
    if (externalizer_domain_http_local_nonprim) {
        config_node_property_string_free(externalizer_domain_http_local_nonprim);
        externalizer_domain_http_local_nonprim = NULL;
    }
    return NULL;

}
