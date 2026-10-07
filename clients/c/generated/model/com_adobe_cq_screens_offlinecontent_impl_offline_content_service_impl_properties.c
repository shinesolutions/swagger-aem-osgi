#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties.h"



static com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_t *com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_create_internal(
    config_node_property_boolean_t *disable_smart_sync
    ) {
    com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_t *com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_local_var = malloc(sizeof(com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_t));
    if (!com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_local_var, 0, sizeof(com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_t));
    com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_local_var->disable_smart_sync = disable_smart_sync;
    return com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_t *com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_create(
    config_node_property_boolean_t *disable_smart_sync
    ) {
    com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_t *result = com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_create_internal (
        disable_smart_sync
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_free(com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_t *com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties) {
    if(NULL == com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties){
        return ;
    }
    if(com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties->disable_smart_sync) {
        config_node_property_boolean_free(com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties->disable_smart_sync);
        com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties->disable_smart_sync = NULL;
    }
    free(com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties);
}

cJSON *com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_convertToJSON(com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_t *com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties->disable_smart_sync
    if(com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties->disable_smart_sync) {
    cJSON *disable_smart_sync_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties->disable_smart_sync);
    if(disable_smart_sync_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "disableSmartSync", disable_smart_sync_local_JSON);
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

com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_t *com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_parseFromJSON(cJSON *com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_propertiesJSON){

    com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_t *com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties->disable_smart_sync
    config_node_property_boolean_t *disable_smart_sync_local_nonprim = NULL;

    // com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties->disable_smart_sync
    cJSON *disable_smart_sync = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_propertiesJSON, "disableSmartSync");
    if (cJSON_IsNull(disable_smart_sync)) {
        disable_smart_sync = NULL;
    }
    if (disable_smart_sync) { 
    disable_smart_sync_local_nonprim = config_node_property_boolean_parseFromJSON(disable_smart_sync); //nonprimitive
    }



    com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_local_var = com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_create_internal (
        disable_smart_sync ? disable_smart_sync_local_nonprim : NULL
        );

    if (!com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties_local_var;
end:
    if (disable_smart_sync_local_nonprim) {
        config_node_property_boolean_free(disable_smart_sync_local_nonprim);
        disable_smart_sync_local_nonprim = NULL;
    }
    return NULL;

}
