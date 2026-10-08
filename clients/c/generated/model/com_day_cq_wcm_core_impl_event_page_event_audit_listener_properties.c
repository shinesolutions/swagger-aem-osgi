#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties.h"



static com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_t *com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_create_internal(
    config_node_property_string_t *configured
    ) {
    com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_t *com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_local_var = malloc(sizeof(com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_t));
    if (!com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_local_var, 0, sizeof(com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_t));
    com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_local_var->configured = configured;
    return com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_t *com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_create(
    config_node_property_string_t *configured
    ) {
    com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_t *result = com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_create_internal (
        configured
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_free(com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_t *com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties) {
    if(NULL == com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties){
        return ;
    }
    if(com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties->configured) {
        config_node_property_string_free(com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties->configured);
        com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties->configured = NULL;
    }
    free(com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties);
}

cJSON *com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_convertToJSON(com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_t *com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties->configured
    if(com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties->configured) {
    cJSON *configured_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties->configured);
    if(configured_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "configured", configured_local_JSON);
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

com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_t *com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_event_page_event_audit_listener_propertiesJSON){

    com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_t *com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties->configured
    config_node_property_string_t *configured_local_nonprim = NULL;

    // com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties->configured
    cJSON *configured = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_event_page_event_audit_listener_propertiesJSON, "configured");
    if (cJSON_IsNull(configured)) {
        configured = NULL;
    }
    if (configured) { 
    configured_local_nonprim = config_node_property_string_parseFromJSON(configured); //nonprimitive
    }



    com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_local_var = com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_create_internal (
        configured ? configured_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_core_impl_event_page_event_audit_listener_properties_local_var;
end:
    if (configured_local_nonprim) {
        config_node_property_string_free(configured_local_nonprim);
        configured_local_nonprim = NULL;
    }
    return NULL;

}
