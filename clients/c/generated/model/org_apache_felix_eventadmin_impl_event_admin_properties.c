#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_felix_eventadmin_impl_event_admin_properties.h"



static org_apache_felix_eventadmin_impl_event_admin_properties_t *org_apache_felix_eventadmin_impl_event_admin_properties_create_internal(
    config_node_property_integer_t *org_apache_felix_eventadmin_thread_pool_size,
    config_node_property_float_t *org_apache_felix_eventadmin_async_to_sync_thread_ratio,
    config_node_property_integer_t *org_apache_felix_eventadmin_timeout,
    config_node_property_boolean_t *org_apache_felix_eventadmin_require_topic,
    config_node_property_array_t *org_apache_felix_eventadmin_ignore_timeout,
    config_node_property_array_t *org_apache_felix_eventadmin_ignore_topic
    ) {
    org_apache_felix_eventadmin_impl_event_admin_properties_t *org_apache_felix_eventadmin_impl_event_admin_properties_local_var = malloc(sizeof(org_apache_felix_eventadmin_impl_event_admin_properties_t));
    if (!org_apache_felix_eventadmin_impl_event_admin_properties_local_var) {
        return NULL;
    }
    memset(org_apache_felix_eventadmin_impl_event_admin_properties_local_var, 0, sizeof(org_apache_felix_eventadmin_impl_event_admin_properties_t));
    org_apache_felix_eventadmin_impl_event_admin_properties_local_var->_library_owned = 1;
    org_apache_felix_eventadmin_impl_event_admin_properties_local_var->org_apache_felix_eventadmin_thread_pool_size = org_apache_felix_eventadmin_thread_pool_size;
    org_apache_felix_eventadmin_impl_event_admin_properties_local_var->org_apache_felix_eventadmin_async_to_sync_thread_ratio = org_apache_felix_eventadmin_async_to_sync_thread_ratio;
    org_apache_felix_eventadmin_impl_event_admin_properties_local_var->org_apache_felix_eventadmin_timeout = org_apache_felix_eventadmin_timeout;
    org_apache_felix_eventadmin_impl_event_admin_properties_local_var->org_apache_felix_eventadmin_require_topic = org_apache_felix_eventadmin_require_topic;
    org_apache_felix_eventadmin_impl_event_admin_properties_local_var->org_apache_felix_eventadmin_ignore_timeout = org_apache_felix_eventadmin_ignore_timeout;
    org_apache_felix_eventadmin_impl_event_admin_properties_local_var->org_apache_felix_eventadmin_ignore_topic = org_apache_felix_eventadmin_ignore_topic;
    return org_apache_felix_eventadmin_impl_event_admin_properties_local_var;
}

__attribute__((deprecated)) org_apache_felix_eventadmin_impl_event_admin_properties_t *org_apache_felix_eventadmin_impl_event_admin_properties_create(
    config_node_property_integer_t *org_apache_felix_eventadmin_thread_pool_size,
    config_node_property_float_t *org_apache_felix_eventadmin_async_to_sync_thread_ratio,
    config_node_property_integer_t *org_apache_felix_eventadmin_timeout,
    config_node_property_boolean_t *org_apache_felix_eventadmin_require_topic,
    config_node_property_array_t *org_apache_felix_eventadmin_ignore_timeout,
    config_node_property_array_t *org_apache_felix_eventadmin_ignore_topic
    ) {
    org_apache_felix_eventadmin_impl_event_admin_properties_t *result = org_apache_felix_eventadmin_impl_event_admin_properties_create_internal (
        org_apache_felix_eventadmin_thread_pool_size,
        org_apache_felix_eventadmin_async_to_sync_thread_ratio,
        org_apache_felix_eventadmin_timeout,
        org_apache_felix_eventadmin_require_topic,
        org_apache_felix_eventadmin_ignore_timeout,
        org_apache_felix_eventadmin_ignore_topic
        );
    if (!result) {
    }
    return result;
}

void org_apache_felix_eventadmin_impl_event_admin_properties_free(org_apache_felix_eventadmin_impl_event_admin_properties_t *org_apache_felix_eventadmin_impl_event_admin_properties) {
    if(NULL == org_apache_felix_eventadmin_impl_event_admin_properties){
        return ;
    }
    if(org_apache_felix_eventadmin_impl_event_admin_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_felix_eventadmin_impl_event_admin_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_thread_pool_size) {
        config_node_property_integer_free(org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_thread_pool_size);
        org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_thread_pool_size = NULL;
    }
    if (org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_async_to_sync_thread_ratio) {
        config_node_property_float_free(org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_async_to_sync_thread_ratio);
        org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_async_to_sync_thread_ratio = NULL;
    }
    if (org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_timeout) {
        config_node_property_integer_free(org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_timeout);
        org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_timeout = NULL;
    }
    if (org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_require_topic) {
        config_node_property_boolean_free(org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_require_topic);
        org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_require_topic = NULL;
    }
    if (org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_ignore_timeout) {
        config_node_property_array_free(org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_ignore_timeout);
        org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_ignore_timeout = NULL;
    }
    if (org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_ignore_topic) {
        config_node_property_array_free(org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_ignore_topic);
        org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_ignore_topic = NULL;
    }
    free(org_apache_felix_eventadmin_impl_event_admin_properties);
}

cJSON *org_apache_felix_eventadmin_impl_event_admin_properties_convertToJSON(org_apache_felix_eventadmin_impl_event_admin_properties_t *org_apache_felix_eventadmin_impl_event_admin_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_thread_pool_size
    if(org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_thread_pool_size) {
    cJSON *org_apache_felix_eventadmin_thread_pool_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_thread_pool_size);
    if(org_apache_felix_eventadmin_thread_pool_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.eventadmin.ThreadPoolSize", org_apache_felix_eventadmin_thread_pool_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_async_to_sync_thread_ratio
    if(org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_async_to_sync_thread_ratio) {
    cJSON *org_apache_felix_eventadmin_async_to_sync_thread_ratio_local_JSON = config_node_property_float_convertToJSON(org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_async_to_sync_thread_ratio);
    if(org_apache_felix_eventadmin_async_to_sync_thread_ratio_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.eventadmin.AsyncToSyncThreadRatio", org_apache_felix_eventadmin_async_to_sync_thread_ratio_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_timeout
    if(org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_timeout) {
    cJSON *org_apache_felix_eventadmin_timeout_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_timeout);
    if(org_apache_felix_eventadmin_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.eventadmin.Timeout", org_apache_felix_eventadmin_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_require_topic
    if(org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_require_topic) {
    cJSON *org_apache_felix_eventadmin_require_topic_local_JSON = config_node_property_boolean_convertToJSON(org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_require_topic);
    if(org_apache_felix_eventadmin_require_topic_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.eventadmin.RequireTopic", org_apache_felix_eventadmin_require_topic_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_ignore_timeout
    if(org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_ignore_timeout) {
    cJSON *org_apache_felix_eventadmin_ignore_timeout_local_JSON = config_node_property_array_convertToJSON(org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_ignore_timeout);
    if(org_apache_felix_eventadmin_ignore_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.eventadmin.IgnoreTimeout", org_apache_felix_eventadmin_ignore_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_ignore_topic
    if(org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_ignore_topic) {
    cJSON *org_apache_felix_eventadmin_ignore_topic_local_JSON = config_node_property_array_convertToJSON(org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_ignore_topic);
    if(org_apache_felix_eventadmin_ignore_topic_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.felix.eventadmin.IgnoreTopic", org_apache_felix_eventadmin_ignore_topic_local_JSON);
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

org_apache_felix_eventadmin_impl_event_admin_properties_t *org_apache_felix_eventadmin_impl_event_admin_properties_parseFromJSON(cJSON *org_apache_felix_eventadmin_impl_event_admin_propertiesJSON){

    org_apache_felix_eventadmin_impl_event_admin_properties_t *org_apache_felix_eventadmin_impl_event_admin_properties_local_var = NULL;

    // define the local variable for org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_thread_pool_size
    config_node_property_integer_t *org_apache_felix_eventadmin_thread_pool_size_local_nonprim = NULL;

    // define the local variable for org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_async_to_sync_thread_ratio
    config_node_property_float_t *org_apache_felix_eventadmin_async_to_sync_thread_ratio_local_nonprim = NULL;

    // define the local variable for org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_timeout
    config_node_property_integer_t *org_apache_felix_eventadmin_timeout_local_nonprim = NULL;

    // define the local variable for org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_require_topic
    config_node_property_boolean_t *org_apache_felix_eventadmin_require_topic_local_nonprim = NULL;

    // define the local variable for org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_ignore_timeout
    config_node_property_array_t *org_apache_felix_eventadmin_ignore_timeout_local_nonprim = NULL;

    // define the local variable for org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_ignore_topic
    config_node_property_array_t *org_apache_felix_eventadmin_ignore_topic_local_nonprim = NULL;

    // org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_thread_pool_size
    cJSON *org_apache_felix_eventadmin_thread_pool_size = cJSON_GetObjectItemCaseSensitive(org_apache_felix_eventadmin_impl_event_admin_propertiesJSON, "org.apache.felix.eventadmin.ThreadPoolSize");
    if (cJSON_IsNull(org_apache_felix_eventadmin_thread_pool_size)) {
        org_apache_felix_eventadmin_thread_pool_size = NULL;
    }
    if (org_apache_felix_eventadmin_thread_pool_size) { 
    org_apache_felix_eventadmin_thread_pool_size_local_nonprim = config_node_property_integer_parseFromJSON(org_apache_felix_eventadmin_thread_pool_size); //nonprimitive
    }

    // org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_async_to_sync_thread_ratio
    cJSON *org_apache_felix_eventadmin_async_to_sync_thread_ratio = cJSON_GetObjectItemCaseSensitive(org_apache_felix_eventadmin_impl_event_admin_propertiesJSON, "org.apache.felix.eventadmin.AsyncToSyncThreadRatio");
    if (cJSON_IsNull(org_apache_felix_eventadmin_async_to_sync_thread_ratio)) {
        org_apache_felix_eventadmin_async_to_sync_thread_ratio = NULL;
    }
    if (org_apache_felix_eventadmin_async_to_sync_thread_ratio) { 
    org_apache_felix_eventadmin_async_to_sync_thread_ratio_local_nonprim = config_node_property_float_parseFromJSON(org_apache_felix_eventadmin_async_to_sync_thread_ratio); //nonprimitive
    }

    // org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_timeout
    cJSON *org_apache_felix_eventadmin_timeout = cJSON_GetObjectItemCaseSensitive(org_apache_felix_eventadmin_impl_event_admin_propertiesJSON, "org.apache.felix.eventadmin.Timeout");
    if (cJSON_IsNull(org_apache_felix_eventadmin_timeout)) {
        org_apache_felix_eventadmin_timeout = NULL;
    }
    if (org_apache_felix_eventadmin_timeout) { 
    org_apache_felix_eventadmin_timeout_local_nonprim = config_node_property_integer_parseFromJSON(org_apache_felix_eventadmin_timeout); //nonprimitive
    }

    // org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_require_topic
    cJSON *org_apache_felix_eventadmin_require_topic = cJSON_GetObjectItemCaseSensitive(org_apache_felix_eventadmin_impl_event_admin_propertiesJSON, "org.apache.felix.eventadmin.RequireTopic");
    if (cJSON_IsNull(org_apache_felix_eventadmin_require_topic)) {
        org_apache_felix_eventadmin_require_topic = NULL;
    }
    if (org_apache_felix_eventadmin_require_topic) { 
    org_apache_felix_eventadmin_require_topic_local_nonprim = config_node_property_boolean_parseFromJSON(org_apache_felix_eventadmin_require_topic); //nonprimitive
    }

    // org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_ignore_timeout
    cJSON *org_apache_felix_eventadmin_ignore_timeout = cJSON_GetObjectItemCaseSensitive(org_apache_felix_eventadmin_impl_event_admin_propertiesJSON, "org.apache.felix.eventadmin.IgnoreTimeout");
    if (cJSON_IsNull(org_apache_felix_eventadmin_ignore_timeout)) {
        org_apache_felix_eventadmin_ignore_timeout = NULL;
    }
    if (org_apache_felix_eventadmin_ignore_timeout) { 
    org_apache_felix_eventadmin_ignore_timeout_local_nonprim = config_node_property_array_parseFromJSON(org_apache_felix_eventadmin_ignore_timeout); //nonprimitive
    }

    // org_apache_felix_eventadmin_impl_event_admin_properties->org_apache_felix_eventadmin_ignore_topic
    cJSON *org_apache_felix_eventadmin_ignore_topic = cJSON_GetObjectItemCaseSensitive(org_apache_felix_eventadmin_impl_event_admin_propertiesJSON, "org.apache.felix.eventadmin.IgnoreTopic");
    if (cJSON_IsNull(org_apache_felix_eventadmin_ignore_topic)) {
        org_apache_felix_eventadmin_ignore_topic = NULL;
    }
    if (org_apache_felix_eventadmin_ignore_topic) { 
    org_apache_felix_eventadmin_ignore_topic_local_nonprim = config_node_property_array_parseFromJSON(org_apache_felix_eventadmin_ignore_topic); //nonprimitive
    }



    org_apache_felix_eventadmin_impl_event_admin_properties_local_var = org_apache_felix_eventadmin_impl_event_admin_properties_create_internal (
        org_apache_felix_eventadmin_thread_pool_size ? org_apache_felix_eventadmin_thread_pool_size_local_nonprim : NULL,
        org_apache_felix_eventadmin_async_to_sync_thread_ratio ? org_apache_felix_eventadmin_async_to_sync_thread_ratio_local_nonprim : NULL,
        org_apache_felix_eventadmin_timeout ? org_apache_felix_eventadmin_timeout_local_nonprim : NULL,
        org_apache_felix_eventadmin_require_topic ? org_apache_felix_eventadmin_require_topic_local_nonprim : NULL,
        org_apache_felix_eventadmin_ignore_timeout ? org_apache_felix_eventadmin_ignore_timeout_local_nonprim : NULL,
        org_apache_felix_eventadmin_ignore_topic ? org_apache_felix_eventadmin_ignore_topic_local_nonprim : NULL
        );

    if (!org_apache_felix_eventadmin_impl_event_admin_properties_local_var) {
        goto end;
    }

    return org_apache_felix_eventadmin_impl_event_admin_properties_local_var;
end:
    if (org_apache_felix_eventadmin_thread_pool_size_local_nonprim) {
        config_node_property_integer_free(org_apache_felix_eventadmin_thread_pool_size_local_nonprim);
        org_apache_felix_eventadmin_thread_pool_size_local_nonprim = NULL;
    }
    if (org_apache_felix_eventadmin_async_to_sync_thread_ratio_local_nonprim) {
        config_node_property_float_free(org_apache_felix_eventadmin_async_to_sync_thread_ratio_local_nonprim);
        org_apache_felix_eventadmin_async_to_sync_thread_ratio_local_nonprim = NULL;
    }
    if (org_apache_felix_eventadmin_timeout_local_nonprim) {
        config_node_property_integer_free(org_apache_felix_eventadmin_timeout_local_nonprim);
        org_apache_felix_eventadmin_timeout_local_nonprim = NULL;
    }
    if (org_apache_felix_eventadmin_require_topic_local_nonprim) {
        config_node_property_boolean_free(org_apache_felix_eventadmin_require_topic_local_nonprim);
        org_apache_felix_eventadmin_require_topic_local_nonprim = NULL;
    }
    if (org_apache_felix_eventadmin_ignore_timeout_local_nonprim) {
        config_node_property_array_free(org_apache_felix_eventadmin_ignore_timeout_local_nonprim);
        org_apache_felix_eventadmin_ignore_timeout_local_nonprim = NULL;
    }
    if (org_apache_felix_eventadmin_ignore_topic_local_nonprim) {
        config_node_property_array_free(org_apache_felix_eventadmin_ignore_topic_local_nonprim);
        org_apache_felix_eventadmin_ignore_topic_local_nonprim = NULL;
    }
    return NULL;

}
