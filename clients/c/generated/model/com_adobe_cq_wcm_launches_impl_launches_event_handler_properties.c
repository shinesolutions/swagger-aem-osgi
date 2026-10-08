#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_wcm_launches_impl_launches_event_handler_properties.h"



static com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_t *com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_create_internal(
    config_node_property_string_t *event_filter,
    config_node_property_integer_t *launches_eventhandler_threadpool_maxsize,
    config_node_property_drop_down_t *launches_eventhandler_threadpool_priority,
    config_node_property_boolean_t *launches_eventhandler_updatelastmodification
    ) {
    com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_t *com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_local_var = malloc(sizeof(com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_t));
    if (!com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_local_var, 0, sizeof(com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_t));
    com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_local_var->_library_owned = 1;
    com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_local_var->event_filter = event_filter;
    com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_local_var->launches_eventhandler_threadpool_maxsize = launches_eventhandler_threadpool_maxsize;
    com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_local_var->launches_eventhandler_threadpool_priority = launches_eventhandler_threadpool_priority;
    com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_local_var->launches_eventhandler_updatelastmodification = launches_eventhandler_updatelastmodification;
    return com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_t *com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_create(
    config_node_property_string_t *event_filter,
    config_node_property_integer_t *launches_eventhandler_threadpool_maxsize,
    config_node_property_drop_down_t *launches_eventhandler_threadpool_priority,
    config_node_property_boolean_t *launches_eventhandler_updatelastmodification
    ) {
    com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_t *result = com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_create_internal (
        event_filter,
        launches_eventhandler_threadpool_maxsize,
        launches_eventhandler_threadpool_priority,
        launches_eventhandler_updatelastmodification
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_free(com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_t *com_adobe_cq_wcm_launches_impl_launches_event_handler_properties) {
    if(NULL == com_adobe_cq_wcm_launches_impl_launches_event_handler_properties){
        return ;
    }
    if(com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->event_filter) {
        config_node_property_string_free(com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->event_filter);
        com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->event_filter = NULL;
    }
    if (com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_threadpool_maxsize) {
        config_node_property_integer_free(com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_threadpool_maxsize);
        com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_threadpool_maxsize = NULL;
    }
    if (com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_threadpool_priority) {
        config_node_property_drop_down_free(com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_threadpool_priority);
        com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_threadpool_priority = NULL;
    }
    if (com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_updatelastmodification) {
        config_node_property_boolean_free(com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_updatelastmodification);
        com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_updatelastmodification = NULL;
    }
    free(com_adobe_cq_wcm_launches_impl_launches_event_handler_properties);
}

cJSON *com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_convertToJSON(com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_t *com_adobe_cq_wcm_launches_impl_launches_event_handler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->event_filter
    if(com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->event_filter) {
    cJSON *event_filter_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->event_filter);
    if(event_filter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "event.filter", event_filter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_threadpool_maxsize
    if(com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_threadpool_maxsize) {
    cJSON *launches_eventhandler_threadpool_maxsize_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_threadpool_maxsize);
    if(launches_eventhandler_threadpool_maxsize_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "launches.eventhandler.threadpool.maxsize", launches_eventhandler_threadpool_maxsize_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_threadpool_priority
    if(com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_threadpool_priority) {
    cJSON *launches_eventhandler_threadpool_priority_local_JSON = config_node_property_drop_down_convertToJSON(com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_threadpool_priority);
    if(launches_eventhandler_threadpool_priority_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "launches.eventhandler.threadpool.priority", launches_eventhandler_threadpool_priority_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_updatelastmodification
    if(com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_updatelastmodification) {
    cJSON *launches_eventhandler_updatelastmodification_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_updatelastmodification);
    if(launches_eventhandler_updatelastmodification_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "launches.eventhandler.updatelastmodification", launches_eventhandler_updatelastmodification_local_JSON);
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

com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_t *com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_parseFromJSON(cJSON *com_adobe_cq_wcm_launches_impl_launches_event_handler_propertiesJSON){

    com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_t *com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->event_filter
    config_node_property_string_t *event_filter_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_threadpool_maxsize
    config_node_property_integer_t *launches_eventhandler_threadpool_maxsize_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_threadpool_priority
    config_node_property_drop_down_t *launches_eventhandler_threadpool_priority_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_updatelastmodification
    config_node_property_boolean_t *launches_eventhandler_updatelastmodification_local_nonprim = NULL;

    // com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->event_filter
    cJSON *event_filter = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_wcm_launches_impl_launches_event_handler_propertiesJSON, "event.filter");
    if (cJSON_IsNull(event_filter)) {
        event_filter = NULL;
    }
    if (event_filter) { 
    event_filter_local_nonprim = config_node_property_string_parseFromJSON(event_filter); //nonprimitive
    }

    // com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_threadpool_maxsize
    cJSON *launches_eventhandler_threadpool_maxsize = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_wcm_launches_impl_launches_event_handler_propertiesJSON, "launches.eventhandler.threadpool.maxsize");
    if (cJSON_IsNull(launches_eventhandler_threadpool_maxsize)) {
        launches_eventhandler_threadpool_maxsize = NULL;
    }
    if (launches_eventhandler_threadpool_maxsize) { 
    launches_eventhandler_threadpool_maxsize_local_nonprim = config_node_property_integer_parseFromJSON(launches_eventhandler_threadpool_maxsize); //nonprimitive
    }

    // com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_threadpool_priority
    cJSON *launches_eventhandler_threadpool_priority = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_wcm_launches_impl_launches_event_handler_propertiesJSON, "launches.eventhandler.threadpool.priority");
    if (cJSON_IsNull(launches_eventhandler_threadpool_priority)) {
        launches_eventhandler_threadpool_priority = NULL;
    }
    if (launches_eventhandler_threadpool_priority) { 
    launches_eventhandler_threadpool_priority_local_nonprim = config_node_property_drop_down_parseFromJSON(launches_eventhandler_threadpool_priority); //nonprimitive
    }

    // com_adobe_cq_wcm_launches_impl_launches_event_handler_properties->launches_eventhandler_updatelastmodification
    cJSON *launches_eventhandler_updatelastmodification = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_wcm_launches_impl_launches_event_handler_propertiesJSON, "launches.eventhandler.updatelastmodification");
    if (cJSON_IsNull(launches_eventhandler_updatelastmodification)) {
        launches_eventhandler_updatelastmodification = NULL;
    }
    if (launches_eventhandler_updatelastmodification) { 
    launches_eventhandler_updatelastmodification_local_nonprim = config_node_property_boolean_parseFromJSON(launches_eventhandler_updatelastmodification); //nonprimitive
    }



    com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_local_var = com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_create_internal (
        event_filter ? event_filter_local_nonprim : NULL,
        launches_eventhandler_threadpool_maxsize ? launches_eventhandler_threadpool_maxsize_local_nonprim : NULL,
        launches_eventhandler_threadpool_priority ? launches_eventhandler_threadpool_priority_local_nonprim : NULL,
        launches_eventhandler_updatelastmodification ? launches_eventhandler_updatelastmodification_local_nonprim : NULL
        );

    if (!com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_wcm_launches_impl_launches_event_handler_properties_local_var;
end:
    if (event_filter_local_nonprim) {
        config_node_property_string_free(event_filter_local_nonprim);
        event_filter_local_nonprim = NULL;
    }
    if (launches_eventhandler_threadpool_maxsize_local_nonprim) {
        config_node_property_integer_free(launches_eventhandler_threadpool_maxsize_local_nonprim);
        launches_eventhandler_threadpool_maxsize_local_nonprim = NULL;
    }
    if (launches_eventhandler_threadpool_priority_local_nonprim) {
        config_node_property_drop_down_free(launches_eventhandler_threadpool_priority_local_nonprim);
        launches_eventhandler_threadpool_priority_local_nonprim = NULL;
    }
    if (launches_eventhandler_updatelastmodification_local_nonprim) {
        config_node_property_boolean_free(launches_eventhandler_updatelastmodification_local_nonprim);
        launches_eventhandler_updatelastmodification_local_nonprim = NULL;
    }
    return NULL;

}
