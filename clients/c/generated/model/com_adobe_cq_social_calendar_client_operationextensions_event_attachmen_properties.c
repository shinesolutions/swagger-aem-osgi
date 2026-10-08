#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties.h"



static com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_t *com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_create_internal(
    config_node_property_string_t *attachment_type_blacklist,
    config_node_property_integer_t *extension_order
    ) {
    com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_t *com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_local_var = malloc(sizeof(com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_t));
    if (!com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_local_var, 0, sizeof(com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_t));
    com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_local_var->_library_owned = 1;
    com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_local_var->attachment_type_blacklist = attachment_type_blacklist;
    com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_local_var->extension_order = extension_order;
    return com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_t *com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_create(
    config_node_property_string_t *attachment_type_blacklist,
    config_node_property_integer_t *extension_order
    ) {
    com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_t *result = com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_create_internal (
        attachment_type_blacklist,
        extension_order
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_free(com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_t *com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties) {
    if(NULL == com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties){
        return ;
    }
    if(com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties->attachment_type_blacklist) {
        config_node_property_string_free(com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties->attachment_type_blacklist);
        com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties->attachment_type_blacklist = NULL;
    }
    if (com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties->extension_order) {
        config_node_property_integer_free(com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties->extension_order);
        com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties->extension_order = NULL;
    }
    free(com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties);
}

cJSON *com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_convertToJSON(com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_t *com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties->attachment_type_blacklist
    if(com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties->attachment_type_blacklist) {
    cJSON *attachment_type_blacklist_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties->attachment_type_blacklist);
    if(attachment_type_blacklist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "attachmentTypeBlacklist", attachment_type_blacklist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties->extension_order
    if(com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties->extension_order) {
    cJSON *extension_order_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties->extension_order);
    if(extension_order_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "extension.order", extension_order_local_JSON);
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

com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_t *com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_parseFromJSON(cJSON *com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_propertiesJSON){

    com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_t *com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties->attachment_type_blacklist
    config_node_property_string_t *attachment_type_blacklist_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties->extension_order
    config_node_property_integer_t *extension_order_local_nonprim = NULL;

    // com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties->attachment_type_blacklist
    cJSON *attachment_type_blacklist = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_propertiesJSON, "attachmentTypeBlacklist");
    if (cJSON_IsNull(attachment_type_blacklist)) {
        attachment_type_blacklist = NULL;
    }
    if (attachment_type_blacklist) { 
    attachment_type_blacklist_local_nonprim = config_node_property_string_parseFromJSON(attachment_type_blacklist); //nonprimitive
    }

    // com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties->extension_order
    cJSON *extension_order = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_propertiesJSON, "extension.order");
    if (cJSON_IsNull(extension_order)) {
        extension_order = NULL;
    }
    if (extension_order) { 
    extension_order_local_nonprim = config_node_property_integer_parseFromJSON(extension_order); //nonprimitive
    }



    com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_local_var = com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_create_internal (
        attachment_type_blacklist ? attachment_type_blacklist_local_nonprim : NULL,
        extension_order ? extension_order_local_nonprim : NULL
        );

    if (!com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties_local_var;
end:
    if (attachment_type_blacklist_local_nonprim) {
        config_node_property_string_free(attachment_type_blacklist_local_nonprim);
        attachment_type_blacklist_local_nonprim = NULL;
    }
    if (extension_order_local_nonprim) {
        config_node_property_integer_free(extension_order_local_nonprim);
        extension_order_local_nonprim = NULL;
    }
    return NULL;

}
