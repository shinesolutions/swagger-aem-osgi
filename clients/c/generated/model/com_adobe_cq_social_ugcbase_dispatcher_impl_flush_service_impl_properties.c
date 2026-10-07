#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties.h"



static com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_t *com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_create_internal(
    config_node_property_integer_t *thread_pool_size,
    config_node_property_integer_t *delay_time,
    config_node_property_integer_t *worker_sleep_time
    ) {
    com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_t *com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_local_var = malloc(sizeof(com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_t));
    if (!com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_local_var, 0, sizeof(com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_t));
    com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_local_var->thread_pool_size = thread_pool_size;
    com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_local_var->delay_time = delay_time;
    com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_local_var->worker_sleep_time = worker_sleep_time;
    return com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_t *com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_create(
    config_node_property_integer_t *thread_pool_size,
    config_node_property_integer_t *delay_time,
    config_node_property_integer_t *worker_sleep_time
    ) {
    com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_t *result = com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_create_internal (
        thread_pool_size,
        delay_time,
        worker_sleep_time
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_free(com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_t *com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties) {
    if(NULL == com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties){
        return ;
    }
    if(com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->thread_pool_size) {
        config_node_property_integer_free(com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->thread_pool_size);
        com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->thread_pool_size = NULL;
    }
    if (com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->delay_time) {
        config_node_property_integer_free(com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->delay_time);
        com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->delay_time = NULL;
    }
    if (com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->worker_sleep_time) {
        config_node_property_integer_free(com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->worker_sleep_time);
        com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->worker_sleep_time = NULL;
    }
    free(com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties);
}

cJSON *com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_convertToJSON(com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_t *com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->thread_pool_size
    if(com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->thread_pool_size) {
    cJSON *thread_pool_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->thread_pool_size);
    if(thread_pool_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "threadPoolSize", thread_pool_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->delay_time
    if(com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->delay_time) {
    cJSON *delay_time_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->delay_time);
    if(delay_time_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "delayTime", delay_time_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->worker_sleep_time
    if(com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->worker_sleep_time) {
    cJSON *worker_sleep_time_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->worker_sleep_time);
    if(worker_sleep_time_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "workerSleepTime", worker_sleep_time_local_JSON);
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

com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_t *com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_parseFromJSON(cJSON *com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_propertiesJSON){

    com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_t *com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->thread_pool_size
    config_node_property_integer_t *thread_pool_size_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->delay_time
    config_node_property_integer_t *delay_time_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->worker_sleep_time
    config_node_property_integer_t *worker_sleep_time_local_nonprim = NULL;

    // com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->thread_pool_size
    cJSON *thread_pool_size = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_propertiesJSON, "threadPoolSize");
    if (cJSON_IsNull(thread_pool_size)) {
        thread_pool_size = NULL;
    }
    if (thread_pool_size) { 
    thread_pool_size_local_nonprim = config_node_property_integer_parseFromJSON(thread_pool_size); //nonprimitive
    }

    // com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->delay_time
    cJSON *delay_time = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_propertiesJSON, "delayTime");
    if (cJSON_IsNull(delay_time)) {
        delay_time = NULL;
    }
    if (delay_time) { 
    delay_time_local_nonprim = config_node_property_integer_parseFromJSON(delay_time); //nonprimitive
    }

    // com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties->worker_sleep_time
    cJSON *worker_sleep_time = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_propertiesJSON, "workerSleepTime");
    if (cJSON_IsNull(worker_sleep_time)) {
        worker_sleep_time = NULL;
    }
    if (worker_sleep_time) { 
    worker_sleep_time_local_nonprim = config_node_property_integer_parseFromJSON(worker_sleep_time); //nonprimitive
    }



    com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_local_var = com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_create_internal (
        thread_pool_size ? thread_pool_size_local_nonprim : NULL,
        delay_time ? delay_time_local_nonprim : NULL,
        worker_sleep_time ? worker_sleep_time_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_properties_local_var;
end:
    if (thread_pool_size_local_nonprim) {
        config_node_property_integer_free(thread_pool_size_local_nonprim);
        thread_pool_size_local_nonprim = NULL;
    }
    if (delay_time_local_nonprim) {
        config_node_property_integer_free(delay_time_local_nonprim);
        delay_time_local_nonprim = NULL;
    }
    if (worker_sleep_time_local_nonprim) {
        config_node_property_integer_free(worker_sleep_time_local_nonprim);
        worker_sleep_time_local_nonprim = NULL;
    }
    return NULL;

}
