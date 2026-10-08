#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties.h"



static org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_t *org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_create_internal(
    config_node_property_string_t *name,
    config_node_property_integer_t *min_pool_size,
    config_node_property_integer_t *max_pool_size,
    config_node_property_integer_t *queue_size,
    config_node_property_integer_t *max_thread_age,
    config_node_property_integer_t *keep_alive_time,
    config_node_property_drop_down_t *block_policy,
    config_node_property_boolean_t *shutdown_graceful,
    config_node_property_boolean_t *daemon,
    config_node_property_integer_t *shutdown_wait_time,
    config_node_property_drop_down_t *priority
    ) {
    org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_t *org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_local_var = malloc(sizeof(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_t));
    if (!org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_local_var, 0, sizeof(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_t));
    org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_local_var->_library_owned = 1;
    org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_local_var->name = name;
    org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_local_var->min_pool_size = min_pool_size;
    org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_local_var->max_pool_size = max_pool_size;
    org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_local_var->queue_size = queue_size;
    org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_local_var->max_thread_age = max_thread_age;
    org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_local_var->keep_alive_time = keep_alive_time;
    org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_local_var->block_policy = block_policy;
    org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_local_var->shutdown_graceful = shutdown_graceful;
    org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_local_var->daemon = daemon;
    org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_local_var->shutdown_wait_time = shutdown_wait_time;
    org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_local_var->priority = priority;
    return org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_t *org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_create(
    config_node_property_string_t *name,
    config_node_property_integer_t *min_pool_size,
    config_node_property_integer_t *max_pool_size,
    config_node_property_integer_t *queue_size,
    config_node_property_integer_t *max_thread_age,
    config_node_property_integer_t *keep_alive_time,
    config_node_property_drop_down_t *block_policy,
    config_node_property_boolean_t *shutdown_graceful,
    config_node_property_boolean_t *daemon,
    config_node_property_integer_t *shutdown_wait_time,
    config_node_property_drop_down_t *priority
    ) {
    org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_t *result = org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_create_internal (
        name,
        min_pool_size,
        max_pool_size,
        queue_size,
        max_thread_age,
        keep_alive_time,
        block_policy,
        shutdown_graceful,
        daemon,
        shutdown_wait_time,
        priority
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_free(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_t *org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties) {
    if(NULL == org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties){
        return ;
    }
    if(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->name) {
        config_node_property_string_free(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->name);
        org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->name = NULL;
    }
    if (org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->min_pool_size) {
        config_node_property_integer_free(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->min_pool_size);
        org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->min_pool_size = NULL;
    }
    if (org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->max_pool_size) {
        config_node_property_integer_free(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->max_pool_size);
        org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->max_pool_size = NULL;
    }
    if (org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->queue_size) {
        config_node_property_integer_free(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->queue_size);
        org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->queue_size = NULL;
    }
    if (org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->max_thread_age) {
        config_node_property_integer_free(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->max_thread_age);
        org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->max_thread_age = NULL;
    }
    if (org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->keep_alive_time) {
        config_node_property_integer_free(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->keep_alive_time);
        org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->keep_alive_time = NULL;
    }
    if (org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->block_policy) {
        config_node_property_drop_down_free(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->block_policy);
        org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->block_policy = NULL;
    }
    if (org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->shutdown_graceful) {
        config_node_property_boolean_free(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->shutdown_graceful);
        org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->shutdown_graceful = NULL;
    }
    if (org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->daemon) {
        config_node_property_boolean_free(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->daemon);
        org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->daemon = NULL;
    }
    if (org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->shutdown_wait_time) {
        config_node_property_integer_free(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->shutdown_wait_time);
        org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->shutdown_wait_time = NULL;
    }
    if (org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->priority) {
        config_node_property_drop_down_free(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->priority);
        org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->priority = NULL;
    }
    free(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties);
}

cJSON *org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_convertToJSON(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_t *org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->name
    if(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->name) {
    cJSON *name_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->name);
    if(name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "name", name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->min_pool_size
    if(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->min_pool_size) {
    cJSON *min_pool_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->min_pool_size);
    if(min_pool_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "minPoolSize", min_pool_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->max_pool_size
    if(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->max_pool_size) {
    cJSON *max_pool_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->max_pool_size);
    if(max_pool_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxPoolSize", max_pool_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->queue_size
    if(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->queue_size) {
    cJSON *queue_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->queue_size);
    if(queue_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queueSize", queue_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->max_thread_age
    if(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->max_thread_age) {
    cJSON *max_thread_age_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->max_thread_age);
    if(max_thread_age_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxThreadAge", max_thread_age_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->keep_alive_time
    if(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->keep_alive_time) {
    cJSON *keep_alive_time_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->keep_alive_time);
    if(keep_alive_time_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "keepAliveTime", keep_alive_time_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->block_policy
    if(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->block_policy) {
    cJSON *block_policy_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->block_policy);
    if(block_policy_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "blockPolicy", block_policy_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->shutdown_graceful
    if(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->shutdown_graceful) {
    cJSON *shutdown_graceful_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->shutdown_graceful);
    if(shutdown_graceful_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "shutdownGraceful", shutdown_graceful_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->daemon
    if(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->daemon) {
    cJSON *daemon_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->daemon);
    if(daemon_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "daemon", daemon_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->shutdown_wait_time
    if(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->shutdown_wait_time) {
    cJSON *shutdown_wait_time_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->shutdown_wait_time);
    if(shutdown_wait_time_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "shutdownWaitTime", shutdown_wait_time_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->priority
    if(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->priority) {
    cJSON *priority_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->priority);
    if(priority_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "priority", priority_local_JSON);
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

org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_t *org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_parseFromJSON(cJSON *org_apache_sling_commons_threads_impl_default_thread_pool_factory_propertiesJSON){

    org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_t *org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_local_var = NULL;

    // define the local variable for org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->name
    config_node_property_string_t *name_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->min_pool_size
    config_node_property_integer_t *min_pool_size_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->max_pool_size
    config_node_property_integer_t *max_pool_size_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->queue_size
    config_node_property_integer_t *queue_size_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->max_thread_age
    config_node_property_integer_t *max_thread_age_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->keep_alive_time
    config_node_property_integer_t *keep_alive_time_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->block_policy
    config_node_property_drop_down_t *block_policy_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->shutdown_graceful
    config_node_property_boolean_t *shutdown_graceful_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->daemon
    config_node_property_boolean_t *daemon_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->shutdown_wait_time
    config_node_property_integer_t *shutdown_wait_time_local_nonprim = NULL;

    // define the local variable for org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->priority
    config_node_property_drop_down_t *priority_local_nonprim = NULL;

    // org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_threads_impl_default_thread_pool_factory_propertiesJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    name_local_nonprim = config_node_property_string_parseFromJSON(name); //nonprimitive
    }

    // org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->min_pool_size
    cJSON *min_pool_size = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_threads_impl_default_thread_pool_factory_propertiesJSON, "minPoolSize");
    if (cJSON_IsNull(min_pool_size)) {
        min_pool_size = NULL;
    }
    if (min_pool_size) { 
    min_pool_size_local_nonprim = config_node_property_integer_parseFromJSON(min_pool_size); //nonprimitive
    }

    // org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->max_pool_size
    cJSON *max_pool_size = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_threads_impl_default_thread_pool_factory_propertiesJSON, "maxPoolSize");
    if (cJSON_IsNull(max_pool_size)) {
        max_pool_size = NULL;
    }
    if (max_pool_size) { 
    max_pool_size_local_nonprim = config_node_property_integer_parseFromJSON(max_pool_size); //nonprimitive
    }

    // org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->queue_size
    cJSON *queue_size = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_threads_impl_default_thread_pool_factory_propertiesJSON, "queueSize");
    if (cJSON_IsNull(queue_size)) {
        queue_size = NULL;
    }
    if (queue_size) { 
    queue_size_local_nonprim = config_node_property_integer_parseFromJSON(queue_size); //nonprimitive
    }

    // org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->max_thread_age
    cJSON *max_thread_age = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_threads_impl_default_thread_pool_factory_propertiesJSON, "maxThreadAge");
    if (cJSON_IsNull(max_thread_age)) {
        max_thread_age = NULL;
    }
    if (max_thread_age) { 
    max_thread_age_local_nonprim = config_node_property_integer_parseFromJSON(max_thread_age); //nonprimitive
    }

    // org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->keep_alive_time
    cJSON *keep_alive_time = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_threads_impl_default_thread_pool_factory_propertiesJSON, "keepAliveTime");
    if (cJSON_IsNull(keep_alive_time)) {
        keep_alive_time = NULL;
    }
    if (keep_alive_time) { 
    keep_alive_time_local_nonprim = config_node_property_integer_parseFromJSON(keep_alive_time); //nonprimitive
    }

    // org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->block_policy
    cJSON *block_policy = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_threads_impl_default_thread_pool_factory_propertiesJSON, "blockPolicy");
    if (cJSON_IsNull(block_policy)) {
        block_policy = NULL;
    }
    if (block_policy) { 
    block_policy_local_nonprim = config_node_property_drop_down_parseFromJSON(block_policy); //nonprimitive
    }

    // org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->shutdown_graceful
    cJSON *shutdown_graceful = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_threads_impl_default_thread_pool_factory_propertiesJSON, "shutdownGraceful");
    if (cJSON_IsNull(shutdown_graceful)) {
        shutdown_graceful = NULL;
    }
    if (shutdown_graceful) { 
    shutdown_graceful_local_nonprim = config_node_property_boolean_parseFromJSON(shutdown_graceful); //nonprimitive
    }

    // org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->daemon
    cJSON *daemon = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_threads_impl_default_thread_pool_factory_propertiesJSON, "daemon");
    if (cJSON_IsNull(daemon)) {
        daemon = NULL;
    }
    if (daemon) { 
    daemon_local_nonprim = config_node_property_boolean_parseFromJSON(daemon); //nonprimitive
    }

    // org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->shutdown_wait_time
    cJSON *shutdown_wait_time = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_threads_impl_default_thread_pool_factory_propertiesJSON, "shutdownWaitTime");
    if (cJSON_IsNull(shutdown_wait_time)) {
        shutdown_wait_time = NULL;
    }
    if (shutdown_wait_time) { 
    shutdown_wait_time_local_nonprim = config_node_property_integer_parseFromJSON(shutdown_wait_time); //nonprimitive
    }

    // org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties->priority
    cJSON *priority = cJSON_GetObjectItemCaseSensitive(org_apache_sling_commons_threads_impl_default_thread_pool_factory_propertiesJSON, "priority");
    if (cJSON_IsNull(priority)) {
        priority = NULL;
    }
    if (priority) { 
    priority_local_nonprim = config_node_property_drop_down_parseFromJSON(priority); //nonprimitive
    }



    org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_local_var = org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_create_internal (
        name ? name_local_nonprim : NULL,
        min_pool_size ? min_pool_size_local_nonprim : NULL,
        max_pool_size ? max_pool_size_local_nonprim : NULL,
        queue_size ? queue_size_local_nonprim : NULL,
        max_thread_age ? max_thread_age_local_nonprim : NULL,
        keep_alive_time ? keep_alive_time_local_nonprim : NULL,
        block_policy ? block_policy_local_nonprim : NULL,
        shutdown_graceful ? shutdown_graceful_local_nonprim : NULL,
        daemon ? daemon_local_nonprim : NULL,
        shutdown_wait_time ? shutdown_wait_time_local_nonprim : NULL,
        priority ? priority_local_nonprim : NULL
        );

    if (!org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_local_var) {
        goto end;
    }

    return org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties_local_var;
end:
    if (name_local_nonprim) {
        config_node_property_string_free(name_local_nonprim);
        name_local_nonprim = NULL;
    }
    if (min_pool_size_local_nonprim) {
        config_node_property_integer_free(min_pool_size_local_nonprim);
        min_pool_size_local_nonprim = NULL;
    }
    if (max_pool_size_local_nonprim) {
        config_node_property_integer_free(max_pool_size_local_nonprim);
        max_pool_size_local_nonprim = NULL;
    }
    if (queue_size_local_nonprim) {
        config_node_property_integer_free(queue_size_local_nonprim);
        queue_size_local_nonprim = NULL;
    }
    if (max_thread_age_local_nonprim) {
        config_node_property_integer_free(max_thread_age_local_nonprim);
        max_thread_age_local_nonprim = NULL;
    }
    if (keep_alive_time_local_nonprim) {
        config_node_property_integer_free(keep_alive_time_local_nonprim);
        keep_alive_time_local_nonprim = NULL;
    }
    if (block_policy_local_nonprim) {
        config_node_property_drop_down_free(block_policy_local_nonprim);
        block_policy_local_nonprim = NULL;
    }
    if (shutdown_graceful_local_nonprim) {
        config_node_property_boolean_free(shutdown_graceful_local_nonprim);
        shutdown_graceful_local_nonprim = NULL;
    }
    if (daemon_local_nonprim) {
        config_node_property_boolean_free(daemon_local_nonprim);
        daemon_local_nonprim = NULL;
    }
    if (shutdown_wait_time_local_nonprim) {
        config_node_property_integer_free(shutdown_wait_time_local_nonprim);
        shutdown_wait_time_local_nonprim = NULL;
    }
    if (priority_local_nonprim) {
        config_node_property_drop_down_free(priority_local_nonprim);
        priority_local_nonprim = NULL;
    }
    return NULL;

}
