#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_translation_impl_ugc_language_detector_properties.h"



static com_adobe_cq_social_translation_impl_ugc_language_detector_properties_t *com_adobe_cq_social_translation_impl_ugc_language_detector_properties_create_internal(
    config_node_property_string_t *event_topics,
    config_node_property_string_t *event_filter,
    config_node_property_array_t *translate_listener_type,
    config_node_property_array_t *translate_property_list,
    config_node_property_integer_t *pool_size,
    config_node_property_integer_t *max_pool_size,
    config_node_property_integer_t *queue_size,
    config_node_property_integer_t *keep_alive_time
    ) {
    com_adobe_cq_social_translation_impl_ugc_language_detector_properties_t *com_adobe_cq_social_translation_impl_ugc_language_detector_properties_local_var = malloc(sizeof(com_adobe_cq_social_translation_impl_ugc_language_detector_properties_t));
    if (!com_adobe_cq_social_translation_impl_ugc_language_detector_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_translation_impl_ugc_language_detector_properties_local_var, 0, sizeof(com_adobe_cq_social_translation_impl_ugc_language_detector_properties_t));
    com_adobe_cq_social_translation_impl_ugc_language_detector_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_translation_impl_ugc_language_detector_properties_local_var->event_topics = event_topics;
    com_adobe_cq_social_translation_impl_ugc_language_detector_properties_local_var->event_filter = event_filter;
    com_adobe_cq_social_translation_impl_ugc_language_detector_properties_local_var->translate_listener_type = translate_listener_type;
    com_adobe_cq_social_translation_impl_ugc_language_detector_properties_local_var->translate_property_list = translate_property_list;
    com_adobe_cq_social_translation_impl_ugc_language_detector_properties_local_var->pool_size = pool_size;
    com_adobe_cq_social_translation_impl_ugc_language_detector_properties_local_var->max_pool_size = max_pool_size;
    com_adobe_cq_social_translation_impl_ugc_language_detector_properties_local_var->queue_size = queue_size;
    com_adobe_cq_social_translation_impl_ugc_language_detector_properties_local_var->keep_alive_time = keep_alive_time;
    return com_adobe_cq_social_translation_impl_ugc_language_detector_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_translation_impl_ugc_language_detector_properties_t *com_adobe_cq_social_translation_impl_ugc_language_detector_properties_create(
    config_node_property_string_t *event_topics,
    config_node_property_string_t *event_filter,
    config_node_property_array_t *translate_listener_type,
    config_node_property_array_t *translate_property_list,
    config_node_property_integer_t *pool_size,
    config_node_property_integer_t *max_pool_size,
    config_node_property_integer_t *queue_size,
    config_node_property_integer_t *keep_alive_time
    ) {
    com_adobe_cq_social_translation_impl_ugc_language_detector_properties_t *result = com_adobe_cq_social_translation_impl_ugc_language_detector_properties_create_internal (
        event_topics,
        event_filter,
        translate_listener_type,
        translate_property_list,
        pool_size,
        max_pool_size,
        queue_size,
        keep_alive_time
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_translation_impl_ugc_language_detector_properties_free(com_adobe_cq_social_translation_impl_ugc_language_detector_properties_t *com_adobe_cq_social_translation_impl_ugc_language_detector_properties) {
    if(NULL == com_adobe_cq_social_translation_impl_ugc_language_detector_properties){
        return ;
    }
    if(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_translation_impl_ugc_language_detector_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_translation_impl_ugc_language_detector_properties->event_topics) {
        config_node_property_string_free(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->event_topics);
        com_adobe_cq_social_translation_impl_ugc_language_detector_properties->event_topics = NULL;
    }
    if (com_adobe_cq_social_translation_impl_ugc_language_detector_properties->event_filter) {
        config_node_property_string_free(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->event_filter);
        com_adobe_cq_social_translation_impl_ugc_language_detector_properties->event_filter = NULL;
    }
    if (com_adobe_cq_social_translation_impl_ugc_language_detector_properties->translate_listener_type) {
        config_node_property_array_free(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->translate_listener_type);
        com_adobe_cq_social_translation_impl_ugc_language_detector_properties->translate_listener_type = NULL;
    }
    if (com_adobe_cq_social_translation_impl_ugc_language_detector_properties->translate_property_list) {
        config_node_property_array_free(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->translate_property_list);
        com_adobe_cq_social_translation_impl_ugc_language_detector_properties->translate_property_list = NULL;
    }
    if (com_adobe_cq_social_translation_impl_ugc_language_detector_properties->pool_size) {
        config_node_property_integer_free(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->pool_size);
        com_adobe_cq_social_translation_impl_ugc_language_detector_properties->pool_size = NULL;
    }
    if (com_adobe_cq_social_translation_impl_ugc_language_detector_properties->max_pool_size) {
        config_node_property_integer_free(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->max_pool_size);
        com_adobe_cq_social_translation_impl_ugc_language_detector_properties->max_pool_size = NULL;
    }
    if (com_adobe_cq_social_translation_impl_ugc_language_detector_properties->queue_size) {
        config_node_property_integer_free(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->queue_size);
        com_adobe_cq_social_translation_impl_ugc_language_detector_properties->queue_size = NULL;
    }
    if (com_adobe_cq_social_translation_impl_ugc_language_detector_properties->keep_alive_time) {
        config_node_property_integer_free(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->keep_alive_time);
        com_adobe_cq_social_translation_impl_ugc_language_detector_properties->keep_alive_time = NULL;
    }
    free(com_adobe_cq_social_translation_impl_ugc_language_detector_properties);
}

cJSON *com_adobe_cq_social_translation_impl_ugc_language_detector_properties_convertToJSON(com_adobe_cq_social_translation_impl_ugc_language_detector_properties_t *com_adobe_cq_social_translation_impl_ugc_language_detector_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_translation_impl_ugc_language_detector_properties->event_topics
    if(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->event_topics) {
    cJSON *event_topics_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->event_topics);
    if(event_topics_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "event.topics", event_topics_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_translation_impl_ugc_language_detector_properties->event_filter
    if(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->event_filter) {
    cJSON *event_filter_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->event_filter);
    if(event_filter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "event.filter", event_filter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_translation_impl_ugc_language_detector_properties->translate_listener_type
    if(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->translate_listener_type) {
    cJSON *translate_listener_type_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->translate_listener_type);
    if(translate_listener_type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "translate.listener.type", translate_listener_type_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_translation_impl_ugc_language_detector_properties->translate_property_list
    if(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->translate_property_list) {
    cJSON *translate_property_list_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->translate_property_list);
    if(translate_property_list_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "translate.property.list", translate_property_list_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_translation_impl_ugc_language_detector_properties->pool_size
    if(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->pool_size) {
    cJSON *pool_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->pool_size);
    if(pool_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "poolSize", pool_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_translation_impl_ugc_language_detector_properties->max_pool_size
    if(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->max_pool_size) {
    cJSON *max_pool_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->max_pool_size);
    if(max_pool_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxPoolSize", max_pool_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_translation_impl_ugc_language_detector_properties->queue_size
    if(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->queue_size) {
    cJSON *queue_size_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->queue_size);
    if(queue_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "queueSize", queue_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_translation_impl_ugc_language_detector_properties->keep_alive_time
    if(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->keep_alive_time) {
    cJSON *keep_alive_time_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_translation_impl_ugc_language_detector_properties->keep_alive_time);
    if(keep_alive_time_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "keepAliveTime", keep_alive_time_local_JSON);
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

com_adobe_cq_social_translation_impl_ugc_language_detector_properties_t *com_adobe_cq_social_translation_impl_ugc_language_detector_properties_parseFromJSON(cJSON *com_adobe_cq_social_translation_impl_ugc_language_detector_propertiesJSON){

    com_adobe_cq_social_translation_impl_ugc_language_detector_properties_t *com_adobe_cq_social_translation_impl_ugc_language_detector_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_translation_impl_ugc_language_detector_properties->event_topics
    config_node_property_string_t *event_topics_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_translation_impl_ugc_language_detector_properties->event_filter
    config_node_property_string_t *event_filter_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_translation_impl_ugc_language_detector_properties->translate_listener_type
    config_node_property_array_t *translate_listener_type_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_translation_impl_ugc_language_detector_properties->translate_property_list
    config_node_property_array_t *translate_property_list_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_translation_impl_ugc_language_detector_properties->pool_size
    config_node_property_integer_t *pool_size_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_translation_impl_ugc_language_detector_properties->max_pool_size
    config_node_property_integer_t *max_pool_size_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_translation_impl_ugc_language_detector_properties->queue_size
    config_node_property_integer_t *queue_size_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_translation_impl_ugc_language_detector_properties->keep_alive_time
    config_node_property_integer_t *keep_alive_time_local_nonprim = NULL;

    // com_adobe_cq_social_translation_impl_ugc_language_detector_properties->event_topics
    cJSON *event_topics = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_translation_impl_ugc_language_detector_propertiesJSON, "event.topics");
    if (cJSON_IsNull(event_topics)) {
        event_topics = NULL;
    }
    if (event_topics) { 
    event_topics_local_nonprim = config_node_property_string_parseFromJSON(event_topics); //nonprimitive
    }

    // com_adobe_cq_social_translation_impl_ugc_language_detector_properties->event_filter
    cJSON *event_filter = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_translation_impl_ugc_language_detector_propertiesJSON, "event.filter");
    if (cJSON_IsNull(event_filter)) {
        event_filter = NULL;
    }
    if (event_filter) { 
    event_filter_local_nonprim = config_node_property_string_parseFromJSON(event_filter); //nonprimitive
    }

    // com_adobe_cq_social_translation_impl_ugc_language_detector_properties->translate_listener_type
    cJSON *translate_listener_type = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_translation_impl_ugc_language_detector_propertiesJSON, "translate.listener.type");
    if (cJSON_IsNull(translate_listener_type)) {
        translate_listener_type = NULL;
    }
    if (translate_listener_type) { 
    translate_listener_type_local_nonprim = config_node_property_array_parseFromJSON(translate_listener_type); //nonprimitive
    }

    // com_adobe_cq_social_translation_impl_ugc_language_detector_properties->translate_property_list
    cJSON *translate_property_list = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_translation_impl_ugc_language_detector_propertiesJSON, "translate.property.list");
    if (cJSON_IsNull(translate_property_list)) {
        translate_property_list = NULL;
    }
    if (translate_property_list) { 
    translate_property_list_local_nonprim = config_node_property_array_parseFromJSON(translate_property_list); //nonprimitive
    }

    // com_adobe_cq_social_translation_impl_ugc_language_detector_properties->pool_size
    cJSON *pool_size = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_translation_impl_ugc_language_detector_propertiesJSON, "poolSize");
    if (cJSON_IsNull(pool_size)) {
        pool_size = NULL;
    }
    if (pool_size) { 
    pool_size_local_nonprim = config_node_property_integer_parseFromJSON(pool_size); //nonprimitive
    }

    // com_adobe_cq_social_translation_impl_ugc_language_detector_properties->max_pool_size
    cJSON *max_pool_size = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_translation_impl_ugc_language_detector_propertiesJSON, "maxPoolSize");
    if (cJSON_IsNull(max_pool_size)) {
        max_pool_size = NULL;
    }
    if (max_pool_size) { 
    max_pool_size_local_nonprim = config_node_property_integer_parseFromJSON(max_pool_size); //nonprimitive
    }

    // com_adobe_cq_social_translation_impl_ugc_language_detector_properties->queue_size
    cJSON *queue_size = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_translation_impl_ugc_language_detector_propertiesJSON, "queueSize");
    if (cJSON_IsNull(queue_size)) {
        queue_size = NULL;
    }
    if (queue_size) { 
    queue_size_local_nonprim = config_node_property_integer_parseFromJSON(queue_size); //nonprimitive
    }

    // com_adobe_cq_social_translation_impl_ugc_language_detector_properties->keep_alive_time
    cJSON *keep_alive_time = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_translation_impl_ugc_language_detector_propertiesJSON, "keepAliveTime");
    if (cJSON_IsNull(keep_alive_time)) {
        keep_alive_time = NULL;
    }
    if (keep_alive_time) { 
    keep_alive_time_local_nonprim = config_node_property_integer_parseFromJSON(keep_alive_time); //nonprimitive
    }



    com_adobe_cq_social_translation_impl_ugc_language_detector_properties_local_var = com_adobe_cq_social_translation_impl_ugc_language_detector_properties_create_internal (
        event_topics ? event_topics_local_nonprim : NULL,
        event_filter ? event_filter_local_nonprim : NULL,
        translate_listener_type ? translate_listener_type_local_nonprim : NULL,
        translate_property_list ? translate_property_list_local_nonprim : NULL,
        pool_size ? pool_size_local_nonprim : NULL,
        max_pool_size ? max_pool_size_local_nonprim : NULL,
        queue_size ? queue_size_local_nonprim : NULL,
        keep_alive_time ? keep_alive_time_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_translation_impl_ugc_language_detector_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_translation_impl_ugc_language_detector_properties_local_var;
end:
    if (event_topics_local_nonprim) {
        config_node_property_string_free(event_topics_local_nonprim);
        event_topics_local_nonprim = NULL;
    }
    if (event_filter_local_nonprim) {
        config_node_property_string_free(event_filter_local_nonprim);
        event_filter_local_nonprim = NULL;
    }
    if (translate_listener_type_local_nonprim) {
        config_node_property_array_free(translate_listener_type_local_nonprim);
        translate_listener_type_local_nonprim = NULL;
    }
    if (translate_property_list_local_nonprim) {
        config_node_property_array_free(translate_property_list_local_nonprim);
        translate_property_list_local_nonprim = NULL;
    }
    if (pool_size_local_nonprim) {
        config_node_property_integer_free(pool_size_local_nonprim);
        pool_size_local_nonprim = NULL;
    }
    if (max_pool_size_local_nonprim) {
        config_node_property_integer_free(max_pool_size_local_nonprim);
        max_pool_size_local_nonprim = NULL;
    }
    if (queue_size_local_nonprim) {
        config_node_property_integer_free(queue_size_local_nonprim);
        queue_size_local_nonprim = NULL;
    }
    if (keep_alive_time_local_nonprim) {
        config_node_property_integer_free(keep_alive_time_local_nonprim);
        keep_alive_time_local_nonprim = NULL;
    }
    return NULL;

}
