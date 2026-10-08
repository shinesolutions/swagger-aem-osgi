#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties.h"



static com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_t *com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_create_internal(
    config_node_property_integer_t *threshold,
    config_node_property_string_t *job_topic_name,
    config_node_property_boolean_t *email_enabled
    ) {
    com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_t *com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_local_var = malloc(sizeof(com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_t));
    if (!com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_local_var, 0, sizeof(com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_t));
    com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_local_var->_library_owned = 1;
    com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_local_var->threshold = threshold;
    com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_local_var->job_topic_name = job_topic_name;
    com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_local_var->email_enabled = email_enabled;
    return com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_t *com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_create(
    config_node_property_integer_t *threshold,
    config_node_property_string_t *job_topic_name,
    config_node_property_boolean_t *email_enabled
    ) {
    com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_t *result = com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_create_internal (
        threshold,
        job_topic_name,
        email_enabled
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_free(com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_t *com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties) {
    if(NULL == com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties){
        return ;
    }
    if(com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->threshold) {
        config_node_property_integer_free(com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->threshold);
        com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->threshold = NULL;
    }
    if (com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->job_topic_name) {
        config_node_property_string_free(com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->job_topic_name);
        com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->job_topic_name = NULL;
    }
    if (com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->email_enabled) {
        config_node_property_boolean_free(com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->email_enabled);
        com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->email_enabled = NULL;
    }
    free(com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties);
}

cJSON *com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_convertToJSON(com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_t *com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->threshold
    if(com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->threshold) {
    cJSON *threshold_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->threshold);
    if(threshold_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "threshold", threshold_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->job_topic_name
    if(com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->job_topic_name) {
    cJSON *job_topic_name_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->job_topic_name);
    if(job_topic_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jobTopicName", job_topic_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->email_enabled
    if(com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->email_enabled) {
    cJSON *email_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->email_enabled);
    if(email_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "emailEnabled", email_enabled_local_JSON);
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

com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_t *com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_parseFromJSON(cJSON *com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_propertiesJSON){

    com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_t *com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->threshold
    config_node_property_integer_t *threshold_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->job_topic_name
    config_node_property_string_t *job_topic_name_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->email_enabled
    config_node_property_boolean_t *email_enabled_local_nonprim = NULL;

    // com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->threshold
    cJSON *threshold = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_propertiesJSON, "threshold");
    if (cJSON_IsNull(threshold)) {
        threshold = NULL;
    }
    if (threshold) { 
    threshold_local_nonprim = config_node_property_integer_parseFromJSON(threshold); //nonprimitive
    }

    // com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->job_topic_name
    cJSON *job_topic_name = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_propertiesJSON, "jobTopicName");
    if (cJSON_IsNull(job_topic_name)) {
        job_topic_name = NULL;
    }
    if (job_topic_name) { 
    job_topic_name_local_nonprim = config_node_property_string_parseFromJSON(job_topic_name); //nonprimitive
    }

    // com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties->email_enabled
    cJSON *email_enabled = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_propertiesJSON, "emailEnabled");
    if (cJSON_IsNull(email_enabled)) {
        email_enabled = NULL;
    }
    if (email_enabled) { 
    email_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(email_enabled); //nonprimitive
    }



    com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_local_var = com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_create_internal (
        threshold ? threshold_local_nonprim : NULL,
        job_topic_name ? job_topic_name_local_nonprim : NULL,
        email_enabled ? email_enabled_local_nonprim : NULL
        );

    if (!com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_properties_local_var;
end:
    if (threshold_local_nonprim) {
        config_node_property_integer_free(threshold_local_nonprim);
        threshold_local_nonprim = NULL;
    }
    if (job_topic_name_local_nonprim) {
        config_node_property_string_free(job_topic_name_local_nonprim);
        job_topic_name_local_nonprim = NULL;
    }
    if (email_enabled_local_nonprim) {
        config_node_property_boolean_free(email_enabled_local_nonprim);
        email_enabled_local_nonprim = NULL;
    }
    return NULL;

}
