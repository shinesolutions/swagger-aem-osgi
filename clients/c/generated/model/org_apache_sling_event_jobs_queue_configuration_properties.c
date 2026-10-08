#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_event_jobs_queue_configuration_properties.h"



static org_apache_sling_event_jobs_queue_configuration_properties_t *org_apache_sling_event_jobs_queue_configuration_properties_create_internal(
    config_node_property_string_t *queue_name,
    config_node_property_array_t *queue_topics,
    config_node_property_drop_down_t *queue_type,
    config_node_property_drop_down_t *queue_priority,
    config_node_property_integer_t *queue_retries,
    config_node_property_integer_t *queue_retrydelay,
    config_node_property_float_t *queue_maxparallel,
    config_node_property_boolean_t *queue_keep_jobs,
    config_node_property_boolean_t *queue_prefer_run_on_creation_instance,
    config_node_property_integer_t *queue_thread_pool_size,
    config_node_property_integer_t *service_ranking
    ) {
    org_apache_sling_event_jobs_queue_configuration_properties_t *org_apache_sling_event_jobs_queue_configuration_properties_local_var = malloc(sizeof(org_apache_sling_event_jobs_queue_configuration_properties_t));
    if (!org_apache_sling_event_jobs_queue_configuration_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_event_jobs_queue_configuration_properties_local_var, 0, sizeof(org_apache_sling_event_jobs_queue_configuration_properties_t));
    org_apache_sling_event_jobs_queue_configuration_properties_local_var->_library_owned = 1;
    org_apache_sling_event_jobs_queue_configuration_properties_local_var->queue_name = queue_name;
    org_apache_sling_event_jobs_queue_configuration_properties_local_var->queue_topics = queue_topics;
    org_apache_sling_event_jobs_queue_configuration_properties_local_var->queue_type = queue_type;
    org_apache_sling_event_jobs_queue_configuration_properties_local_var->queue_priority = queue_priority;
    org_apache_sling_event_jobs_queue_configuration_properties_local_var->queue_retries = queue_retries;
    org_apache_sling_event_jobs_queue_configuration_properties_local_var->queue_retrydelay = queue_retrydelay;
    org_apache_sling_event_jobs_queue_configuration_properties_local_var->queue_maxparallel = queue_maxparallel;
    org_apache_sling_event_jobs_queue_configuration_properties_local_var->queue_keep_jobs = queue_keep_jobs;
    org_apache_sling_event_jobs_queue_configuration_properties_local_var->queue_prefer_run_on_creation_instance = queue_prefer_run_on_creation_instance;
    org_apache_sling_event_jobs_queue_configuration_properties_local_var->queue_thread_pool_size = queue_thread_pool_size;
    org_apache_sling_event_jobs_queue_configuration_properties_local_var->service_ranking = service_ranking;
    return org_apache_sling_event_jobs_queue_configuration_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_event_jobs_queue_configuration_properties_t *org_apache_sling_event_jobs_queue_configuration_properties_create(
    config_node_property_string_t *queue_name,
    config_node_property_array_t *queue_topics,
    config_node_property_drop_down_t *queue_type,
    config_node_property_drop_down_t *queue_priority,
    config_node_property_integer_t *queue_retries,
    config_node_property_integer_t *queue_retrydelay,
    config_node_property_float_t *queue_maxparallel,
    config_node_property_boolean_t *queue_keep_jobs,
    config_node_property_boolean_t *queue_prefer_run_on_creation_instance,
    config_node_property_integer_t *queue_thread_pool_size,
    config_node_property_integer_t *service_ranking
    ) {
    org_apache_sling_event_jobs_queue_configuration_properties_t *result = org_apache_sling_event_jobs_queue_configuration_properties_create_internal (
        queue_name,
        queue_topics,
        queue_type,
        queue_priority,
        queue_retries,
        queue_retrydelay,
        queue_maxparallel,
        queue_keep_jobs,
        queue_prefer_run_on_creation_instance,
        queue_thread_pool_size,
        service_ranking
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_event_jobs_queue_configuration_properties_free(org_apache_sling_event_jobs_queue_configuration_properties_t *org_apache_sling_event_jobs_queue_configuration_properties) {
    if(NULL == org_apache_sling_event_jobs_queue_configuration_properties){
        return ;
    }
    if(org_apache_sling_event_jobs_queue_configuration_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_event_jobs_queue_configuration_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_event_jobs_queue_configuration_properties->queue_name) {
        config_node_property_string_free(org_apache_sling_event_jobs_queue_configuration_properties->queue_name);
        org_apache_sling_event_jobs_queue_configuration_properties->queue_name = NULL;
    }
    if (org_apache_sling_event_jobs_queue_configuration_properties->queue_topics) {
        config_node_property_array_free(org_apache_sling_event_jobs_queue_configuration_properties->queue_topics);
        org_apache_sling_event_jobs_queue_configuration_properties->queue_topics = NULL;
    }
    if (org_apache_sling_event_jobs_queue_configuration_properties->queue_type) {
        config_node_property_drop_down_free(org_apache_sling_event_jobs_queue_configuration_properties->queue_type);
        org_apache_sling_event_jobs_queue_configuration_properties->queue_type = NULL;
    }
    if (org_apache_sling_event_jobs_queue_configuration_properties->queue_priority) {
        config_node_property_drop_down_free(org_apache_sling_event_jobs_queue_configuration_properties->queue_priority);
        org_apache_sling_event_jobs_queue_configuration_properties->queue_priority = NULL;
    }
    if (org_apache_sling_event_jobs_queue_configuration_properties->queue_retries) {
        config_node_property_integer_free(org_apache_sling_event_jobs_queue_configuration_properties->queue_retries);
        org_apache_sling_event_jobs_queue_configuration_properties->queue_retries = NULL;
    }
    if (org_apache_sling_event_jobs_queue_configuration_properties->queue_retrydelay) {
        config_node_property_integer_free(org_apache_sling_event_jobs_queue_configuration_properties->queue_retrydelay);
        org_apache_sling_event_jobs_queue_configuration_properties->queue_retrydelay = NULL;
    }
    if (org_apache_sling_event_jobs_queue_configuration_properties->queue_maxparallel) {
        config_node_property_float_free(org_apache_sling_event_jobs_queue_configuration_properties->queue_maxparallel);
        org_apache_sling_event_jobs_queue_configuration_properties->queue_maxparallel = NULL;
    }
    if (org_apache_sling_event_jobs_queue_configuration_properties->queue_keep_jobs) {
        config_node_property_boolean_free(org_apache_sling_event_jobs_queue_configuration_properties->queue_keep_jobs);
        org_apache_sling_event_jobs_queue_configuration_properties->queue_keep_jobs = NULL;
    }
    if (org_apache_sling_event_jobs_queue_configuration_properties->queue_prefer_run_on_creation_instance) {
        config_node_property_boolean_free(org_apache_sling_event_jobs_queue_configuration_properties->queue_prefer_run_on_creation_instance);
        org_apache_sling_event_jobs_queue_configuration_properties->queue_prefer_run_on_creation_instance = NULL;
    }
    if (org_apache_sling_event_jobs_queue_configuration_properties->queue_thread_pool_size) {
        config_node_property_integer_free(org_apache_sling_event_jobs_queue_configuration_properties->queue_thread_pool_size);
        org_apache_sling_event_jobs_queue_configuration_properties->queue_thread_pool_size = NULL;
    }
    if (org_apache_sling_event_jobs_queue_configuration_properties->service_ranking) {
        config_node_property_integer_free(org_apache_sling_event_jobs_queue_configuration_properties->service_ranking);
        org_apache_sling_event_jobs_queue_configuration_properties->service_ranking = NULL;
    }
    free(org_apache_sling_event_jobs_queue_configuration_properties);
}

cJSON *org_apache_sling_event_jobs_queue_configuration_properties_convertToJSON(org_apache_sling_event_jobs_queue_configuration_properties_t *org_apache_sling_event_jobs_queue_configuration_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_event_jobs_queue_configuration_properties->queue_name
    if(org_apache_sling_event_jobs_queue_configuration_properties->queue_name) {
    cJSON *queue_name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_event_jobs_queue_configuration_properties->queue_name);
    if(queue_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queue.name", queue_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_event_jobs_queue_configuration_properties->queue_topics
    if(org_apache_sling_event_jobs_queue_configuration_properties->queue_topics) {
    cJSON *queue_topics_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_event_jobs_queue_configuration_properties->queue_topics);
    if(queue_topics_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queue.topics", queue_topics_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_event_jobs_queue_configuration_properties->queue_type
    if(org_apache_sling_event_jobs_queue_configuration_properties->queue_type) {
    cJSON *queue_type_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_event_jobs_queue_configuration_properties->queue_type);
    if(queue_type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queue.type", queue_type_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_event_jobs_queue_configuration_properties->queue_priority
    if(org_apache_sling_event_jobs_queue_configuration_properties->queue_priority) {
    cJSON *queue_priority_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_event_jobs_queue_configuration_properties->queue_priority);
    if(queue_priority_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queue.priority", queue_priority_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_event_jobs_queue_configuration_properties->queue_retries
    if(org_apache_sling_event_jobs_queue_configuration_properties->queue_retries) {
    cJSON *queue_retries_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_event_jobs_queue_configuration_properties->queue_retries);
    if(queue_retries_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queue.retries", queue_retries_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_event_jobs_queue_configuration_properties->queue_retrydelay
    if(org_apache_sling_event_jobs_queue_configuration_properties->queue_retrydelay) {
    cJSON *queue_retrydelay_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_event_jobs_queue_configuration_properties->queue_retrydelay);
    if(queue_retrydelay_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queue.retrydelay", queue_retrydelay_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_event_jobs_queue_configuration_properties->queue_maxparallel
    if(org_apache_sling_event_jobs_queue_configuration_properties->queue_maxparallel) {
    cJSON *queue_maxparallel_local_JSON = config_node_property_float_convertToJSON(org_apache_sling_event_jobs_queue_configuration_properties->queue_maxparallel);
    if(queue_maxparallel_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queue.maxparallel", queue_maxparallel_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_event_jobs_queue_configuration_properties->queue_keep_jobs
    if(org_apache_sling_event_jobs_queue_configuration_properties->queue_keep_jobs) {
    cJSON *queue_keep_jobs_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_event_jobs_queue_configuration_properties->queue_keep_jobs);
    if(queue_keep_jobs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queue.keepJobs", queue_keep_jobs_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_event_jobs_queue_configuration_properties->queue_prefer_run_on_creation_instance
    if(org_apache_sling_event_jobs_queue_configuration_properties->queue_prefer_run_on_creation_instance) {
    cJSON *queue_prefer_run_on_creation_instance_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_event_jobs_queue_configuration_properties->queue_prefer_run_on_creation_instance);
    if(queue_prefer_run_on_creation_instance_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queue.preferRunOnCreationInstance", queue_prefer_run_on_creation_instance_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_event_jobs_queue_configuration_properties->queue_thread_pool_size
    if(org_apache_sling_event_jobs_queue_configuration_properties->queue_thread_pool_size) {
    cJSON *queue_thread_pool_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_event_jobs_queue_configuration_properties->queue_thread_pool_size);
    if(queue_thread_pool_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queue.threadPoolSize", queue_thread_pool_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_event_jobs_queue_configuration_properties->service_ranking
    if(org_apache_sling_event_jobs_queue_configuration_properties->service_ranking) {
    cJSON *service_ranking_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_event_jobs_queue_configuration_properties->service_ranking);
    if(service_ranking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "service.ranking", service_ranking_local_JSON);
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

org_apache_sling_event_jobs_queue_configuration_properties_t *org_apache_sling_event_jobs_queue_configuration_properties_parseFromJSON(cJSON *org_apache_sling_event_jobs_queue_configuration_propertiesJSON){

    org_apache_sling_event_jobs_queue_configuration_properties_t *org_apache_sling_event_jobs_queue_configuration_properties_local_var = NULL;

    // define the local variable for org_apache_sling_event_jobs_queue_configuration_properties->queue_name
    config_node_property_string_t *queue_name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_event_jobs_queue_configuration_properties->queue_topics
    config_node_property_array_t *queue_topics_local_nonprim = NULL;

    // define the local variable for org_apache_sling_event_jobs_queue_configuration_properties->queue_type
    config_node_property_drop_down_t *queue_type_local_nonprim = NULL;

    // define the local variable for org_apache_sling_event_jobs_queue_configuration_properties->queue_priority
    config_node_property_drop_down_t *queue_priority_local_nonprim = NULL;

    // define the local variable for org_apache_sling_event_jobs_queue_configuration_properties->queue_retries
    config_node_property_integer_t *queue_retries_local_nonprim = NULL;

    // define the local variable for org_apache_sling_event_jobs_queue_configuration_properties->queue_retrydelay
    config_node_property_integer_t *queue_retrydelay_local_nonprim = NULL;

    // define the local variable for org_apache_sling_event_jobs_queue_configuration_properties->queue_maxparallel
    config_node_property_float_t *queue_maxparallel_local_nonprim = NULL;

    // define the local variable for org_apache_sling_event_jobs_queue_configuration_properties->queue_keep_jobs
    config_node_property_boolean_t *queue_keep_jobs_local_nonprim = NULL;

    // define the local variable for org_apache_sling_event_jobs_queue_configuration_properties->queue_prefer_run_on_creation_instance
    config_node_property_boolean_t *queue_prefer_run_on_creation_instance_local_nonprim = NULL;

    // define the local variable for org_apache_sling_event_jobs_queue_configuration_properties->queue_thread_pool_size
    config_node_property_integer_t *queue_thread_pool_size_local_nonprim = NULL;

    // define the local variable for org_apache_sling_event_jobs_queue_configuration_properties->service_ranking
    config_node_property_integer_t *service_ranking_local_nonprim = NULL;

    // org_apache_sling_event_jobs_queue_configuration_properties->queue_name
    cJSON *queue_name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_event_jobs_queue_configuration_propertiesJSON, "queue.name");
    if (cJSON_IsNull(queue_name)) {
        queue_name = NULL;
    }
    if (queue_name) { 
    queue_name_local_nonprim = config_node_property_string_parseFromJSON(queue_name); //nonprimitive
    }

    // org_apache_sling_event_jobs_queue_configuration_properties->queue_topics
    cJSON *queue_topics = cJSON_GetObjectItemCaseSensitive(org_apache_sling_event_jobs_queue_configuration_propertiesJSON, "queue.topics");
    if (cJSON_IsNull(queue_topics)) {
        queue_topics = NULL;
    }
    if (queue_topics) { 
    queue_topics_local_nonprim = config_node_property_array_parseFromJSON(queue_topics); //nonprimitive
    }

    // org_apache_sling_event_jobs_queue_configuration_properties->queue_type
    cJSON *queue_type = cJSON_GetObjectItemCaseSensitive(org_apache_sling_event_jobs_queue_configuration_propertiesJSON, "queue.type");
    if (cJSON_IsNull(queue_type)) {
        queue_type = NULL;
    }
    if (queue_type) { 
    queue_type_local_nonprim = config_node_property_drop_down_parseFromJSON(queue_type); //nonprimitive
    }

    // org_apache_sling_event_jobs_queue_configuration_properties->queue_priority
    cJSON *queue_priority = cJSON_GetObjectItemCaseSensitive(org_apache_sling_event_jobs_queue_configuration_propertiesJSON, "queue.priority");
    if (cJSON_IsNull(queue_priority)) {
        queue_priority = NULL;
    }
    if (queue_priority) { 
    queue_priority_local_nonprim = config_node_property_drop_down_parseFromJSON(queue_priority); //nonprimitive
    }

    // org_apache_sling_event_jobs_queue_configuration_properties->queue_retries
    cJSON *queue_retries = cJSON_GetObjectItemCaseSensitive(org_apache_sling_event_jobs_queue_configuration_propertiesJSON, "queue.retries");
    if (cJSON_IsNull(queue_retries)) {
        queue_retries = NULL;
    }
    if (queue_retries) { 
    queue_retries_local_nonprim = config_node_property_integer_parseFromJSON(queue_retries); //nonprimitive
    }

    // org_apache_sling_event_jobs_queue_configuration_properties->queue_retrydelay
    cJSON *queue_retrydelay = cJSON_GetObjectItemCaseSensitive(org_apache_sling_event_jobs_queue_configuration_propertiesJSON, "queue.retrydelay");
    if (cJSON_IsNull(queue_retrydelay)) {
        queue_retrydelay = NULL;
    }
    if (queue_retrydelay) { 
    queue_retrydelay_local_nonprim = config_node_property_integer_parseFromJSON(queue_retrydelay); //nonprimitive
    }

    // org_apache_sling_event_jobs_queue_configuration_properties->queue_maxparallel
    cJSON *queue_maxparallel = cJSON_GetObjectItemCaseSensitive(org_apache_sling_event_jobs_queue_configuration_propertiesJSON, "queue.maxparallel");
    if (cJSON_IsNull(queue_maxparallel)) {
        queue_maxparallel = NULL;
    }
    if (queue_maxparallel) { 
    queue_maxparallel_local_nonprim = config_node_property_float_parseFromJSON(queue_maxparallel); //nonprimitive
    }

    // org_apache_sling_event_jobs_queue_configuration_properties->queue_keep_jobs
    cJSON *queue_keep_jobs = cJSON_GetObjectItemCaseSensitive(org_apache_sling_event_jobs_queue_configuration_propertiesJSON, "queue.keepJobs");
    if (cJSON_IsNull(queue_keep_jobs)) {
        queue_keep_jobs = NULL;
    }
    if (queue_keep_jobs) { 
    queue_keep_jobs_local_nonprim = config_node_property_boolean_parseFromJSON(queue_keep_jobs); //nonprimitive
    }

    // org_apache_sling_event_jobs_queue_configuration_properties->queue_prefer_run_on_creation_instance
    cJSON *queue_prefer_run_on_creation_instance = cJSON_GetObjectItemCaseSensitive(org_apache_sling_event_jobs_queue_configuration_propertiesJSON, "queue.preferRunOnCreationInstance");
    if (cJSON_IsNull(queue_prefer_run_on_creation_instance)) {
        queue_prefer_run_on_creation_instance = NULL;
    }
    if (queue_prefer_run_on_creation_instance) { 
    queue_prefer_run_on_creation_instance_local_nonprim = config_node_property_boolean_parseFromJSON(queue_prefer_run_on_creation_instance); //nonprimitive
    }

    // org_apache_sling_event_jobs_queue_configuration_properties->queue_thread_pool_size
    cJSON *queue_thread_pool_size = cJSON_GetObjectItemCaseSensitive(org_apache_sling_event_jobs_queue_configuration_propertiesJSON, "queue.threadPoolSize");
    if (cJSON_IsNull(queue_thread_pool_size)) {
        queue_thread_pool_size = NULL;
    }
    if (queue_thread_pool_size) { 
    queue_thread_pool_size_local_nonprim = config_node_property_integer_parseFromJSON(queue_thread_pool_size); //nonprimitive
    }

    // org_apache_sling_event_jobs_queue_configuration_properties->service_ranking
    cJSON *service_ranking = cJSON_GetObjectItemCaseSensitive(org_apache_sling_event_jobs_queue_configuration_propertiesJSON, "service.ranking");
    if (cJSON_IsNull(service_ranking)) {
        service_ranking = NULL;
    }
    if (service_ranking) { 
    service_ranking_local_nonprim = config_node_property_integer_parseFromJSON(service_ranking); //nonprimitive
    }



    org_apache_sling_event_jobs_queue_configuration_properties_local_var = org_apache_sling_event_jobs_queue_configuration_properties_create_internal (
        queue_name ? queue_name_local_nonprim : NULL,
        queue_topics ? queue_topics_local_nonprim : NULL,
        queue_type ? queue_type_local_nonprim : NULL,
        queue_priority ? queue_priority_local_nonprim : NULL,
        queue_retries ? queue_retries_local_nonprim : NULL,
        queue_retrydelay ? queue_retrydelay_local_nonprim : NULL,
        queue_maxparallel ? queue_maxparallel_local_nonprim : NULL,
        queue_keep_jobs ? queue_keep_jobs_local_nonprim : NULL,
        queue_prefer_run_on_creation_instance ? queue_prefer_run_on_creation_instance_local_nonprim : NULL,
        queue_thread_pool_size ? queue_thread_pool_size_local_nonprim : NULL,
        service_ranking ? service_ranking_local_nonprim : NULL
        );

    if (!org_apache_sling_event_jobs_queue_configuration_properties_local_var) {
        goto end;
    }

    return org_apache_sling_event_jobs_queue_configuration_properties_local_var;
end:
    if (queue_name_local_nonprim) {
        config_node_property_string_free(queue_name_local_nonprim);
        queue_name_local_nonprim = NULL;
    }
    if (queue_topics_local_nonprim) {
        config_node_property_array_free(queue_topics_local_nonprim);
        queue_topics_local_nonprim = NULL;
    }
    if (queue_type_local_nonprim) {
        config_node_property_drop_down_free(queue_type_local_nonprim);
        queue_type_local_nonprim = NULL;
    }
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
        config_node_property_float_free(queue_maxparallel_local_nonprim);
        queue_maxparallel_local_nonprim = NULL;
    }
    if (queue_keep_jobs_local_nonprim) {
        config_node_property_boolean_free(queue_keep_jobs_local_nonprim);
        queue_keep_jobs_local_nonprim = NULL;
    }
    if (queue_prefer_run_on_creation_instance_local_nonprim) {
        config_node_property_boolean_free(queue_prefer_run_on_creation_instance_local_nonprim);
        queue_prefer_run_on_creation_instance_local_nonprim = NULL;
    }
    if (queue_thread_pool_size_local_nonprim) {
        config_node_property_integer_free(queue_thread_pool_size_local_nonprim);
        queue_thread_pool_size_local_nonprim = NULL;
    }
    if (service_ranking_local_nonprim) {
        config_node_property_integer_free(service_ranking_local_nonprim);
        service_ranking_local_nonprim = NULL;
    }
    return NULL;

}
