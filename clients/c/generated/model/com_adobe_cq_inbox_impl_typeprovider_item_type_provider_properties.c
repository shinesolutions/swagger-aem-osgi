#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties.h"



static com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_t *com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_create_internal(
    config_node_property_array_t *inbox_impl_typeprovider_registrypaths,
    config_node_property_array_t *inbox_impl_typeprovider_legacypaths,
    config_node_property_string_t *inbox_impl_typeprovider_defaulturl_failureitem,
    config_node_property_string_t *inbox_impl_typeprovider_defaulturl_workitem,
    config_node_property_string_t *inbox_impl_typeprovider_defaulturl_task
    ) {
    com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_t *com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_local_var = malloc(sizeof(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_t));
    if (!com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_local_var, 0, sizeof(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_t));
    com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_local_var->_library_owned = 1;
    com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_local_var->inbox_impl_typeprovider_registrypaths = inbox_impl_typeprovider_registrypaths;
    com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_local_var->inbox_impl_typeprovider_legacypaths = inbox_impl_typeprovider_legacypaths;
    com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_local_var->inbox_impl_typeprovider_defaulturl_failureitem = inbox_impl_typeprovider_defaulturl_failureitem;
    com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_local_var->inbox_impl_typeprovider_defaulturl_workitem = inbox_impl_typeprovider_defaulturl_workitem;
    com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_local_var->inbox_impl_typeprovider_defaulturl_task = inbox_impl_typeprovider_defaulturl_task;
    return com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_t *com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_create(
    config_node_property_array_t *inbox_impl_typeprovider_registrypaths,
    config_node_property_array_t *inbox_impl_typeprovider_legacypaths,
    config_node_property_string_t *inbox_impl_typeprovider_defaulturl_failureitem,
    config_node_property_string_t *inbox_impl_typeprovider_defaulturl_workitem,
    config_node_property_string_t *inbox_impl_typeprovider_defaulturl_task
    ) {
    com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_t *result = com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_create_internal (
        inbox_impl_typeprovider_registrypaths,
        inbox_impl_typeprovider_legacypaths,
        inbox_impl_typeprovider_defaulturl_failureitem,
        inbox_impl_typeprovider_defaulturl_workitem,
        inbox_impl_typeprovider_defaulturl_task
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_free(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_t *com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties) {
    if(NULL == com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties){
        return ;
    }
    if(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_registrypaths) {
        config_node_property_array_free(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_registrypaths);
        com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_registrypaths = NULL;
    }
    if (com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_legacypaths) {
        config_node_property_array_free(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_legacypaths);
        com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_legacypaths = NULL;
    }
    if (com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_failureitem) {
        config_node_property_string_free(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_failureitem);
        com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_failureitem = NULL;
    }
    if (com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_workitem) {
        config_node_property_string_free(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_workitem);
        com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_workitem = NULL;
    }
    if (com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_task) {
        config_node_property_string_free(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_task);
        com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_task = NULL;
    }
    free(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties);
}

cJSON *com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_convertToJSON(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_t *com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_registrypaths
    if(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_registrypaths) {
    cJSON *inbox_impl_typeprovider_registrypaths_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_registrypaths);
    if(inbox_impl_typeprovider_registrypaths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "inbox.impl.typeprovider.registrypaths", inbox_impl_typeprovider_registrypaths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_legacypaths
    if(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_legacypaths) {
    cJSON *inbox_impl_typeprovider_legacypaths_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_legacypaths);
    if(inbox_impl_typeprovider_legacypaths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "inbox.impl.typeprovider.legacypaths", inbox_impl_typeprovider_legacypaths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_failureitem
    if(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_failureitem) {
    cJSON *inbox_impl_typeprovider_defaulturl_failureitem_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_failureitem);
    if(inbox_impl_typeprovider_defaulturl_failureitem_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "inbox.impl.typeprovider.defaulturl.failureitem", inbox_impl_typeprovider_defaulturl_failureitem_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_workitem
    if(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_workitem) {
    cJSON *inbox_impl_typeprovider_defaulturl_workitem_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_workitem);
    if(inbox_impl_typeprovider_defaulturl_workitem_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "inbox.impl.typeprovider.defaulturl.workitem", inbox_impl_typeprovider_defaulturl_workitem_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_task
    if(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_task) {
    cJSON *inbox_impl_typeprovider_defaulturl_task_local_JSON = config_node_property_string_convertToJSON(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_task);
    if(inbox_impl_typeprovider_defaulturl_task_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "inbox.impl.typeprovider.defaulturl.task", inbox_impl_typeprovider_defaulturl_task_local_JSON);
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

com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_t *com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_parseFromJSON(cJSON *com_adobe_cq_inbox_impl_typeprovider_item_type_provider_propertiesJSON){

    com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_t *com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_registrypaths
    config_node_property_array_t *inbox_impl_typeprovider_registrypaths_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_legacypaths
    config_node_property_array_t *inbox_impl_typeprovider_legacypaths_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_failureitem
    config_node_property_string_t *inbox_impl_typeprovider_defaulturl_failureitem_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_workitem
    config_node_property_string_t *inbox_impl_typeprovider_defaulturl_workitem_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_task
    config_node_property_string_t *inbox_impl_typeprovider_defaulturl_task_local_nonprim = NULL;

    // com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_registrypaths
    cJSON *inbox_impl_typeprovider_registrypaths = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_propertiesJSON, "inbox.impl.typeprovider.registrypaths");
    if (cJSON_IsNull(inbox_impl_typeprovider_registrypaths)) {
        inbox_impl_typeprovider_registrypaths = NULL;
    }
    if (inbox_impl_typeprovider_registrypaths) { 
    inbox_impl_typeprovider_registrypaths_local_nonprim = config_node_property_array_parseFromJSON(inbox_impl_typeprovider_registrypaths); //nonprimitive
    }

    // com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_legacypaths
    cJSON *inbox_impl_typeprovider_legacypaths = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_propertiesJSON, "inbox.impl.typeprovider.legacypaths");
    if (cJSON_IsNull(inbox_impl_typeprovider_legacypaths)) {
        inbox_impl_typeprovider_legacypaths = NULL;
    }
    if (inbox_impl_typeprovider_legacypaths) { 
    inbox_impl_typeprovider_legacypaths_local_nonprim = config_node_property_array_parseFromJSON(inbox_impl_typeprovider_legacypaths); //nonprimitive
    }

    // com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_failureitem
    cJSON *inbox_impl_typeprovider_defaulturl_failureitem = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_propertiesJSON, "inbox.impl.typeprovider.defaulturl.failureitem");
    if (cJSON_IsNull(inbox_impl_typeprovider_defaulturl_failureitem)) {
        inbox_impl_typeprovider_defaulturl_failureitem = NULL;
    }
    if (inbox_impl_typeprovider_defaulturl_failureitem) { 
    inbox_impl_typeprovider_defaulturl_failureitem_local_nonprim = config_node_property_string_parseFromJSON(inbox_impl_typeprovider_defaulturl_failureitem); //nonprimitive
    }

    // com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_workitem
    cJSON *inbox_impl_typeprovider_defaulturl_workitem = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_propertiesJSON, "inbox.impl.typeprovider.defaulturl.workitem");
    if (cJSON_IsNull(inbox_impl_typeprovider_defaulturl_workitem)) {
        inbox_impl_typeprovider_defaulturl_workitem = NULL;
    }
    if (inbox_impl_typeprovider_defaulturl_workitem) { 
    inbox_impl_typeprovider_defaulturl_workitem_local_nonprim = config_node_property_string_parseFromJSON(inbox_impl_typeprovider_defaulturl_workitem); //nonprimitive
    }

    // com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties->inbox_impl_typeprovider_defaulturl_task
    cJSON *inbox_impl_typeprovider_defaulturl_task = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_propertiesJSON, "inbox.impl.typeprovider.defaulturl.task");
    if (cJSON_IsNull(inbox_impl_typeprovider_defaulturl_task)) {
        inbox_impl_typeprovider_defaulturl_task = NULL;
    }
    if (inbox_impl_typeprovider_defaulturl_task) { 
    inbox_impl_typeprovider_defaulturl_task_local_nonprim = config_node_property_string_parseFromJSON(inbox_impl_typeprovider_defaulturl_task); //nonprimitive
    }



    com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_local_var = com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_create_internal (
        inbox_impl_typeprovider_registrypaths ? inbox_impl_typeprovider_registrypaths_local_nonprim : NULL,
        inbox_impl_typeprovider_legacypaths ? inbox_impl_typeprovider_legacypaths_local_nonprim : NULL,
        inbox_impl_typeprovider_defaulturl_failureitem ? inbox_impl_typeprovider_defaulturl_failureitem_local_nonprim : NULL,
        inbox_impl_typeprovider_defaulturl_workitem ? inbox_impl_typeprovider_defaulturl_workitem_local_nonprim : NULL,
        inbox_impl_typeprovider_defaulturl_task ? inbox_impl_typeprovider_defaulturl_task_local_nonprim : NULL
        );

    if (!com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_local_var;
end:
    if (inbox_impl_typeprovider_registrypaths_local_nonprim) {
        config_node_property_array_free(inbox_impl_typeprovider_registrypaths_local_nonprim);
        inbox_impl_typeprovider_registrypaths_local_nonprim = NULL;
    }
    if (inbox_impl_typeprovider_legacypaths_local_nonprim) {
        config_node_property_array_free(inbox_impl_typeprovider_legacypaths_local_nonprim);
        inbox_impl_typeprovider_legacypaths_local_nonprim = NULL;
    }
    if (inbox_impl_typeprovider_defaulturl_failureitem_local_nonprim) {
        config_node_property_string_free(inbox_impl_typeprovider_defaulturl_failureitem_local_nonprim);
        inbox_impl_typeprovider_defaulturl_failureitem_local_nonprim = NULL;
    }
    if (inbox_impl_typeprovider_defaulturl_workitem_local_nonprim) {
        config_node_property_string_free(inbox_impl_typeprovider_defaulturl_workitem_local_nonprim);
        inbox_impl_typeprovider_defaulturl_workitem_local_nonprim = NULL;
    }
    if (inbox_impl_typeprovider_defaulturl_task_local_nonprim) {
        config_node_property_string_free(inbox_impl_typeprovider_defaulturl_task_local_nonprim);
        inbox_impl_typeprovider_defaulturl_task_local_nonprim = NULL;
    }
    return NULL;

}
