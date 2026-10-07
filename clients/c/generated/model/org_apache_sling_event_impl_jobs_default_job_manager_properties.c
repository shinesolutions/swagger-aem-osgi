#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_event_impl_jobs_default_job_manager_properties.h"



static org_apache_sling_event_impl_jobs_default_job_manager_properties_t *org_apache_sling_event_impl_jobs_default_job_manager_properties_create_internal(
    config_node_property_drop_down_t *queue_priority,
    config_node_property_integer_t *queue_retries,
    config_node_property_integer_t *queue_retrydelay,
    config_node_property_integer_t *queue_maxparallel
    ) {
    org_apache_sling_event_impl_jobs_default_job_manager_properties_t *org_apache_sling_event_impl_jobs_default_job_manager_properties_local_var = malloc(sizeof(org_apache_sling_event_impl_jobs_default_job_manager_properties_t));
    if (!org_apache_sling_event_impl_jobs_default_job_manager_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_event_impl_jobs_default_job_manager_properties_local_var, 0, sizeof(org_apache_sling_event_impl_jobs_default_job_manager_properties_t));
    org_apache_sling_event_impl_jobs_default_job_manager_properties_local_var->_library_owned = 1;
    org_apache_sling_event_impl_jobs_default_job_manager_properties_local_var->queue_priority = queue_priority;
    org_apache_sling_event_impl_jobs_default_job_manager_properties_local_var->queue_retries = queue_retries;
    org_apache_sling_event_impl_jobs_default_job_manager_properties_local_var->queue_retrydelay = queue_retrydelay;
    org_apache_sling_event_impl_jobs_default_job_manager_properties_local_var->queue_maxparallel = queue_maxparallel;
    return org_apache_sling_event_impl_jobs_default_job_manager_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_event_impl_jobs_default_job_manager_properties_t *org_apache_sling_event_impl_jobs_default_job_manager_properties_create(
    config_node_property_drop_down_t *queue_priority,
    config_node_property_integer_t *queue_retries,
    config_node_property_integer_t *queue_retrydelay,
    config_node_property_integer_t *queue_maxparallel
    ) {
    org_apache_sling_event_impl_jobs_default_job_manager_properties_t *result = org_apache_sling_event_impl_jobs_default_job_manager_properties_create_internal (
        queue_priority,
        queue_retries,
        queue_retrydelay,
        queue_maxparallel
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_event_impl_jobs_default_job_manager_properties_free(org_apache_sling_event_impl_jobs_default_job_manager_properties_t *org_apache_sling_event_impl_jobs_default_job_manager_properties) {
    if(NULL == org_apache_sling_event_impl_jobs_default_job_manager_properties){
        return ;
    }
    if(org_apache_sling_event_impl_jobs_default_job_manager_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_event_impl_jobs_default_job_manager_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_priority) {
        config_node_property_drop_down_free(org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_priority);
        org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_priority = NULL;
    }
    if (org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_retries) {
        config_node_property_integer_free(org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_retries);
        org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_retries = NULL;
    }
    if (org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_retrydelay) {
        config_node_property_integer_free(org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_retrydelay);
        org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_retrydelay = NULL;
    }
    if (org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_maxparallel) {
        config_node_property_integer_free(org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_maxparallel);
        org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_maxparallel = NULL;
    }
    free(org_apache_sling_event_impl_jobs_default_job_manager_properties);
}

cJSON *org_apache_sling_event_impl_jobs_default_job_manager_properties_convertToJSON(org_apache_sling_event_impl_jobs_default_job_manager_properties_t *org_apache_sling_event_impl_jobs_default_job_manager_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_priority
    if(org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_priority) {
    cJSON *queue_priority_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_priority);
    if(queue_priority_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queue.priority", queue_priority_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_retries
    if(org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_retries) {
    cJSON *queue_retries_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_retries);
    if(queue_retries_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queue.retries", queue_retries_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_retrydelay
    if(org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_retrydelay) {
    cJSON *queue_retrydelay_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_retrydelay);
    if(queue_retrydelay_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queue.retrydelay", queue_retrydelay_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_maxparallel
    if(org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_maxparallel) {
    cJSON *queue_maxparallel_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_maxparallel);
    if(queue_maxparallel_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queue.maxparallel", queue_maxparallel_local_JSON);
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

org_apache_sling_event_impl_jobs_default_job_manager_properties_t *org_apache_sling_event_impl_jobs_default_job_manager_properties_parseFromJSON(cJSON *org_apache_sling_event_impl_jobs_default_job_manager_propertiesJSON){

    org_apache_sling_event_impl_jobs_default_job_manager_properties_t *org_apache_sling_event_impl_jobs_default_job_manager_properties_local_var = NULL;

    // define the local variable for org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_priority
    config_node_property_drop_down_t *queue_priority_local_nonprim = NULL;

    // define the local variable for org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_retries
    config_node_property_integer_t *queue_retries_local_nonprim = NULL;

    // define the local variable for org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_retrydelay
    config_node_property_integer_t *queue_retrydelay_local_nonprim = NULL;

    // define the local variable for org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_maxparallel
    config_node_property_integer_t *queue_maxparallel_local_nonprim = NULL;

    // org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_priority
    cJSON *queue_priority = cJSON_GetObjectItemCaseSensitive(org_apache_sling_event_impl_jobs_default_job_manager_propertiesJSON, "queue.priority");
    if (cJSON_IsNull(queue_priority)) {
        queue_priority = NULL;
    }
    if (queue_priority) { 
    queue_priority_local_nonprim = config_node_property_drop_down_parseFromJSON(queue_priority); //nonprimitive
    }

    // org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_retries
    cJSON *queue_retries = cJSON_GetObjectItemCaseSensitive(org_apache_sling_event_impl_jobs_default_job_manager_propertiesJSON, "queue.retries");
    if (cJSON_IsNull(queue_retries)) {
        queue_retries = NULL;
    }
    if (queue_retries) { 
    queue_retries_local_nonprim = config_node_property_integer_parseFromJSON(queue_retries); //nonprimitive
    }

    // org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_retrydelay
    cJSON *queue_retrydelay = cJSON_GetObjectItemCaseSensitive(org_apache_sling_event_impl_jobs_default_job_manager_propertiesJSON, "queue.retrydelay");
    if (cJSON_IsNull(queue_retrydelay)) {
        queue_retrydelay = NULL;
    }
    if (queue_retrydelay) { 
    queue_retrydelay_local_nonprim = config_node_property_integer_parseFromJSON(queue_retrydelay); //nonprimitive
    }

    // org_apache_sling_event_impl_jobs_default_job_manager_properties->queue_maxparallel
    cJSON *queue_maxparallel = cJSON_GetObjectItemCaseSensitive(org_apache_sling_event_impl_jobs_default_job_manager_propertiesJSON, "queue.maxparallel");
    if (cJSON_IsNull(queue_maxparallel)) {
        queue_maxparallel = NULL;
    }
    if (queue_maxparallel) { 
    queue_maxparallel_local_nonprim = config_node_property_integer_parseFromJSON(queue_maxparallel); //nonprimitive
    }



    org_apache_sling_event_impl_jobs_default_job_manager_properties_local_var = org_apache_sling_event_impl_jobs_default_job_manager_properties_create_internal (
        queue_priority ? queue_priority_local_nonprim : NULL,
        queue_retries ? queue_retries_local_nonprim : NULL,
        queue_retrydelay ? queue_retrydelay_local_nonprim : NULL,
        queue_maxparallel ? queue_maxparallel_local_nonprim : NULL
        );

    if (!org_apache_sling_event_impl_jobs_default_job_manager_properties_local_var) {
        goto end;
    }

    return org_apache_sling_event_impl_jobs_default_job_manager_properties_local_var;
end:
    if (queue_priority_local_nonprim) {
        config_node_property_drop_down_free(queue_priority_local_nonprim);
        queue_priority_local_nonprim = NULL;
    }
    if (queue_retries_local_nonprim) {
        config_node_property_integer_free(queue_retries_local_nonprim);
        queue_retries_local_nonprim = NULL;
    }
    if (queue_retrydelay_local_nonprim) {
        config_node_property_integer_free(queue_retrydelay_local_nonprim);
        queue_retrydelay_local_nonprim = NULL;
    }
    if (queue_maxparallel_local_nonprim) {
        config_node_property_integer_free(queue_maxparallel_local_nonprim);
        queue_maxparallel_local_nonprim = NULL;
    }
    return NULL;

}
