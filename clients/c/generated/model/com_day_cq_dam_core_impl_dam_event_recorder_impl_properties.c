#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_dam_event_recorder_impl_properties.h"



static com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_t *com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_create_internal(
    config_node_property_string_t *event_filter,
    config_node_property_integer_t *event_queue_length,
    config_node_property_boolean_t *eventrecorder_enabled,
    config_node_property_array_t *eventrecorder_blacklist,
    config_node_property_drop_down_t *eventrecorder_eventtypes
    ) {
    com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_t *com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_t));
    if (!com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_t));
    com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_local_var->event_filter = event_filter;
    com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_local_var->event_queue_length = event_queue_length;
    com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_local_var->eventrecorder_enabled = eventrecorder_enabled;
    com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_local_var->eventrecorder_blacklist = eventrecorder_blacklist;
    com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_local_var->eventrecorder_eventtypes = eventrecorder_eventtypes;
    return com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_t *com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_create(
    config_node_property_string_t *event_filter,
    config_node_property_integer_t *event_queue_length,
    config_node_property_boolean_t *eventrecorder_enabled,
    config_node_property_array_t *eventrecorder_blacklist,
    config_node_property_drop_down_t *eventrecorder_eventtypes
    ) {
    com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_t *result = com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_create_internal (
        event_filter,
        event_queue_length,
        eventrecorder_enabled,
        eventrecorder_blacklist,
        eventrecorder_eventtypes
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_free(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_t *com_day_cq_dam_core_impl_dam_event_recorder_impl_properties) {
    if(NULL == com_day_cq_dam_core_impl_dam_event_recorder_impl_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->event_filter) {
        config_node_property_string_free(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->event_filter);
        com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->event_filter = NULL;
    }
    if (com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->event_queue_length) {
        config_node_property_integer_free(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->event_queue_length);
        com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->event_queue_length = NULL;
    }
    if (com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_enabled) {
        config_node_property_boolean_free(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_enabled);
        com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_enabled = NULL;
    }
    if (com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_blacklist) {
        config_node_property_array_free(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_blacklist);
        com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_blacklist = NULL;
    }
    if (com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_eventtypes) {
        config_node_property_drop_down_free(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_eventtypes);
        com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_eventtypes = NULL;
    }
    free(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties);
}

cJSON *com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_convertToJSON(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_t *com_day_cq_dam_core_impl_dam_event_recorder_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->event_filter
    if(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->event_filter) {
    cJSON *event_filter_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->event_filter);
    if(event_filter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "event.filter", event_filter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->event_queue_length
    if(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->event_queue_length) {
    cJSON *event_queue_length_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->event_queue_length);
    if(event_queue_length_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "event.queue.length", event_queue_length_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_enabled
    if(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_enabled) {
    cJSON *eventrecorder_enabled_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_enabled);
    if(eventrecorder_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "eventrecorder.enabled", eventrecorder_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_blacklist
    if(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_blacklist) {
    cJSON *eventrecorder_blacklist_local_JSON = config_node_property_array_convertToJSON(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_blacklist);
    if(eventrecorder_blacklist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "eventrecorder.blacklist", eventrecorder_blacklist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_eventtypes
    if(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_eventtypes) {
    cJSON *eventrecorder_eventtypes_local_JSON = config_node_property_drop_down_convertToJSON(com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_eventtypes);
    if(eventrecorder_eventtypes_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "eventrecorder.eventtypes", eventrecorder_eventtypes_local_JSON);
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

com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_t *com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_dam_event_recorder_impl_propertiesJSON){

    com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_t *com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->event_filter
    config_node_property_string_t *event_filter_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->event_queue_length
    config_node_property_integer_t *event_queue_length_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_enabled
    config_node_property_boolean_t *eventrecorder_enabled_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_blacklist
    config_node_property_array_t *eventrecorder_blacklist_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_eventtypes
    config_node_property_drop_down_t *eventrecorder_eventtypes_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->event_filter
    cJSON *event_filter = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_dam_event_recorder_impl_propertiesJSON, "event.filter");
    if (cJSON_IsNull(event_filter)) {
        event_filter = NULL;
    }
    if (event_filter) { 
    event_filter_local_nonprim = config_node_property_string_parseFromJSON(event_filter); //nonprimitive
    }

    // com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->event_queue_length
    cJSON *event_queue_length = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_dam_event_recorder_impl_propertiesJSON, "event.queue.length");
    if (cJSON_IsNull(event_queue_length)) {
        event_queue_length = NULL;
    }
    if (event_queue_length) { 
    event_queue_length_local_nonprim = config_node_property_integer_parseFromJSON(event_queue_length); //nonprimitive
    }

    // com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_enabled
    cJSON *eventrecorder_enabled = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_dam_event_recorder_impl_propertiesJSON, "eventrecorder.enabled");
    if (cJSON_IsNull(eventrecorder_enabled)) {
        eventrecorder_enabled = NULL;
    }
    if (eventrecorder_enabled) { 
    eventrecorder_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(eventrecorder_enabled); //nonprimitive
    }

    // com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_blacklist
    cJSON *eventrecorder_blacklist = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_dam_event_recorder_impl_propertiesJSON, "eventrecorder.blacklist");
    if (cJSON_IsNull(eventrecorder_blacklist)) {
        eventrecorder_blacklist = NULL;
    }
    if (eventrecorder_blacklist) { 
    eventrecorder_blacklist_local_nonprim = config_node_property_array_parseFromJSON(eventrecorder_blacklist); //nonprimitive
    }

    // com_day_cq_dam_core_impl_dam_event_recorder_impl_properties->eventrecorder_eventtypes
    cJSON *eventrecorder_eventtypes = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_dam_event_recorder_impl_propertiesJSON, "eventrecorder.eventtypes");
    if (cJSON_IsNull(eventrecorder_eventtypes)) {
        eventrecorder_eventtypes = NULL;
    }
    if (eventrecorder_eventtypes) { 
    eventrecorder_eventtypes_local_nonprim = config_node_property_drop_down_parseFromJSON(eventrecorder_eventtypes); //nonprimitive
    }



    com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_local_var = com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_create_internal (
        event_filter ? event_filter_local_nonprim : NULL,
        event_queue_length ? event_queue_length_local_nonprim : NULL,
        eventrecorder_enabled ? eventrecorder_enabled_local_nonprim : NULL,
        eventrecorder_blacklist ? eventrecorder_blacklist_local_nonprim : NULL,
        eventrecorder_eventtypes ? eventrecorder_eventtypes_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_dam_event_recorder_impl_properties_local_var;
end:
    if (event_filter_local_nonprim) {
        config_node_property_string_free(event_filter_local_nonprim);
        event_filter_local_nonprim = NULL;
    }
    if (event_queue_length_local_nonprim) {
        config_node_property_integer_free(event_queue_length_local_nonprim);
        event_queue_length_local_nonprim = NULL;
    }
    if (eventrecorder_enabled_local_nonprim) {
        config_node_property_boolean_free(eventrecorder_enabled_local_nonprim);
        eventrecorder_enabled_local_nonprim = NULL;
    }
    if (eventrecorder_blacklist_local_nonprim) {
        config_node_property_array_free(eventrecorder_blacklist_local_nonprim);
        eventrecorder_blacklist_local_nonprim = NULL;
    }
    if (eventrecorder_eventtypes_local_nonprim) {
        config_node_property_drop_down_free(eventrecorder_eventtypes_local_nonprim);
        eventrecorder_eventtypes_local_nonprim = NULL;
    }
    return NULL;

}
