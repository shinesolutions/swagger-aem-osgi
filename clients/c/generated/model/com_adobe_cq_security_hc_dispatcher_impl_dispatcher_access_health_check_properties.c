#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties.h"



static com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_t *com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_create_internal(
    config_node_property_array_t *hc_tags,
    config_node_property_string_t *dispatcher_address,
    config_node_property_array_t *dispatcher_filter_allowed,
    config_node_property_array_t *dispatcher_filter_blocked
    ) {
    com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_t *com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_local_var = malloc(sizeof(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_t));
    if (!com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_local_var, 0, sizeof(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_t));
    com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_local_var->_library_owned = 1;
    com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_local_var->hc_tags = hc_tags;
    com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_local_var->dispatcher_address = dispatcher_address;
    com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_local_var->dispatcher_filter_allowed = dispatcher_filter_allowed;
    com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_local_var->dispatcher_filter_blocked = dispatcher_filter_blocked;
    return com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_t *com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_create(
    config_node_property_array_t *hc_tags,
    config_node_property_string_t *dispatcher_address,
    config_node_property_array_t *dispatcher_filter_allowed,
    config_node_property_array_t *dispatcher_filter_blocked
    ) {
    com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_t *result = com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_create_internal (
        hc_tags,
        dispatcher_address,
        dispatcher_filter_allowed,
        dispatcher_filter_blocked
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_free(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_t *com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties) {
    if(NULL == com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties){
        return ;
    }
    if(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->hc_tags) {
        config_node_property_array_free(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->hc_tags);
        com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->hc_tags = NULL;
    }
    if (com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_address) {
        config_node_property_string_free(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_address);
        com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_address = NULL;
    }
    if (com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_filter_allowed) {
        config_node_property_array_free(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_filter_allowed);
        com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_filter_allowed = NULL;
    }
    if (com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_filter_blocked) {
        config_node_property_array_free(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_filter_blocked);
        com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_filter_blocked = NULL;
    }
    free(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties);
}

cJSON *com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_convertToJSON(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_t *com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->hc_tags
    if(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->hc_tags) {
    cJSON *hc_tags_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->hc_tags);
    if(hc_tags_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hc.tags", hc_tags_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_address
    if(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_address) {
    cJSON *dispatcher_address_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_address);
    if(dispatcher_address_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dispatcher.address", dispatcher_address_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_filter_allowed
    if(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_filter_allowed) {
    cJSON *dispatcher_filter_allowed_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_filter_allowed);
    if(dispatcher_filter_allowed_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dispatcher.filter.allowed", dispatcher_filter_allowed_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_filter_blocked
    if(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_filter_blocked) {
    cJSON *dispatcher_filter_blocked_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_filter_blocked);
    if(dispatcher_filter_blocked_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dispatcher.filter.blocked", dispatcher_filter_blocked_local_JSON);
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

com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_t *com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_parseFromJSON(cJSON *com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_propertiesJSON){

    com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_t *com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->hc_tags
    config_node_property_array_t *hc_tags_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_address
    config_node_property_string_t *dispatcher_address_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_filter_allowed
    config_node_property_array_t *dispatcher_filter_allowed_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_filter_blocked
    config_node_property_array_t *dispatcher_filter_blocked_local_nonprim = NULL;

    // com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->hc_tags
    cJSON *hc_tags = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_propertiesJSON, "hc.tags");
    if (cJSON_IsNull(hc_tags)) {
        hc_tags = NULL;
    }
    if (hc_tags) { 
    hc_tags_local_nonprim = config_node_property_array_parseFromJSON(hc_tags); //nonprimitive
    }

    // com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_address
    cJSON *dispatcher_address = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_propertiesJSON, "dispatcher.address");
    if (cJSON_IsNull(dispatcher_address)) {
        dispatcher_address = NULL;
    }
    if (dispatcher_address) { 
    dispatcher_address_local_nonprim = config_node_property_string_parseFromJSON(dispatcher_address); //nonprimitive
    }

    // com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_filter_allowed
    cJSON *dispatcher_filter_allowed = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_propertiesJSON, "dispatcher.filter.allowed");
    if (cJSON_IsNull(dispatcher_filter_allowed)) {
        dispatcher_filter_allowed = NULL;
    }
    if (dispatcher_filter_allowed) { 
    dispatcher_filter_allowed_local_nonprim = config_node_property_array_parseFromJSON(dispatcher_filter_allowed); //nonprimitive
    }

    // com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties->dispatcher_filter_blocked
    cJSON *dispatcher_filter_blocked = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_propertiesJSON, "dispatcher.filter.blocked");
    if (cJSON_IsNull(dispatcher_filter_blocked)) {
        dispatcher_filter_blocked = NULL;
    }
    if (dispatcher_filter_blocked) { 
    dispatcher_filter_blocked_local_nonprim = config_node_property_array_parseFromJSON(dispatcher_filter_blocked); //nonprimitive
    }



    com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_local_var = com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_create_internal (
        hc_tags ? hc_tags_local_nonprim : NULL,
        dispatcher_address ? dispatcher_address_local_nonprim : NULL,
        dispatcher_filter_allowed ? dispatcher_filter_allowed_local_nonprim : NULL,
        dispatcher_filter_blocked ? dispatcher_filter_blocked_local_nonprim : NULL
        );

    if (!com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_properties_local_var;
end:
    if (hc_tags_local_nonprim) {
        config_node_property_array_free(hc_tags_local_nonprim);
        hc_tags_local_nonprim = NULL;
    }
    if (dispatcher_address_local_nonprim) {
        config_node_property_string_free(dispatcher_address_local_nonprim);
        dispatcher_address_local_nonprim = NULL;
    }
    if (dispatcher_filter_allowed_local_nonprim) {
        config_node_property_array_free(dispatcher_filter_allowed_local_nonprim);
        dispatcher_filter_allowed_local_nonprim = NULL;
    }
    if (dispatcher_filter_blocked_local_nonprim) {
        config_node_property_array_free(dispatcher_filter_blocked_local_nonprim);
        dispatcher_filter_blocked_local_nonprim = NULL;
    }
    return NULL;

}
