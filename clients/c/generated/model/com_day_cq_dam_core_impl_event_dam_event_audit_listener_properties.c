#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties.h"



static com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_t *com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_create_internal(
    config_node_property_string_t *event_filter,
    config_node_property_boolean_t *enabled
    ) {
    com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_t *com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_t));
    if (!com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_t));
    com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_local_var->event_filter = event_filter;
    com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_local_var->enabled = enabled;
    return com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_t *com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_create(
    config_node_property_string_t *event_filter,
    config_node_property_boolean_t *enabled
    ) {
    com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_t *result = com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_create_internal (
        event_filter,
        enabled
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_free(com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_t *com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties) {
    if(NULL == com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties->event_filter) {
        config_node_property_string_free(com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties->event_filter);
        com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties->event_filter = NULL;
    }
    if (com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties->enabled) {
        config_node_property_boolean_free(com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties->enabled);
        com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties->enabled = NULL;
    }
    free(com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties);
}

cJSON *com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_convertToJSON(com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_t *com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties->event_filter
    if(com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties->event_filter) {
    cJSON *event_filter_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties->event_filter);
    if(event_filter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "event.filter", event_filter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties->enabled
    if(com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties->enabled) {
    cJSON *enabled_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties->enabled);
    if(enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enabled", enabled_local_JSON);
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

com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_t *com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_event_dam_event_audit_listener_propertiesJSON){

    com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_t *com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties->event_filter
    config_node_property_string_t *event_filter_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties->enabled
    config_node_property_boolean_t *enabled_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties->event_filter
    cJSON *event_filter = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_event_dam_event_audit_listener_propertiesJSON, "event.filter");
    if (cJSON_IsNull(event_filter)) {
        event_filter = NULL;
    }
    if (event_filter) { 
    event_filter_local_nonprim = config_node_property_string_parseFromJSON(event_filter); //nonprimitive
    }

    // com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties->enabled
    cJSON *enabled = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_event_dam_event_audit_listener_propertiesJSON, "enabled");
    if (cJSON_IsNull(enabled)) {
        enabled = NULL;
    }
    if (enabled) { 
    enabled_local_nonprim = config_node_property_boolean_parseFromJSON(enabled); //nonprimitive
    }



    com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_local_var = com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_create_internal (
        event_filter ? event_filter_local_nonprim : NULL,
        enabled ? enabled_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_event_dam_event_audit_listener_properties_local_var;
end:
    if (event_filter_local_nonprim) {
        config_node_property_string_free(event_filter_local_nonprim);
        event_filter_local_nonprim = NULL;
    }
    if (enabled_local_nonprim) {
        config_node_property_boolean_free(enabled_local_nonprim);
        enabled_local_nonprim = NULL;
    }
    return NULL;

}
