#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties.h"



static com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_t *com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_create_internal(
    config_node_property_array_t *com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths,
    config_node_property_boolean_t *com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions,
    config_node_property_integer_t *com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms,
    config_node_property_drop_down_t *com_adobe_cq_dam_mac_sync_damsyncservice_platform
    ) {
    com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_t *com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_local_var = malloc(sizeof(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_t));
    if (!com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_local_var, 0, sizeof(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_t));
    com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_local_var->_library_owned = 1;
    com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_local_var->com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths = com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths;
    com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_local_var->com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions = com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions;
    com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_local_var->com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms = com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms;
    com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_local_var->com_adobe_cq_dam_mac_sync_damsyncservice_platform = com_adobe_cq_dam_mac_sync_damsyncservice_platform;
    return com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_t *com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_create(
    config_node_property_array_t *com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths,
    config_node_property_boolean_t *com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions,
    config_node_property_integer_t *com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms,
    config_node_property_drop_down_t *com_adobe_cq_dam_mac_sync_damsyncservice_platform
    ) {
    com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_t *result = com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_create_internal (
        com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths,
        com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions,
        com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms,
        com_adobe_cq_dam_mac_sync_damsyncservice_platform
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_free(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_t *com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties) {
    if(NULL == com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties){
        return ;
    }
    if(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths) {
        config_node_property_array_free(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths);
        com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths = NULL;
    }
    if (com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions) {
        config_node_property_boolean_free(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions);
        com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions = NULL;
    }
    if (com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms) {
        config_node_property_integer_free(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms);
        com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms = NULL;
    }
    if (com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_platform) {
        config_node_property_drop_down_free(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_platform);
        com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_platform = NULL;
    }
    free(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties);
}

cJSON *com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_convertToJSON(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_t *com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths
    if(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths) {
    cJSON *com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths);
    if(com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths", com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions
    if(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions) {
    cJSON *com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions);
    if(com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions", com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms
    if(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms) {
    cJSON *com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms_local_JSON = config_node_property_integer_convertToJSON(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms);
    if(com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms", com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_platform
    if(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_platform) {
    cJSON *com_adobe_cq_dam_mac_sync_damsyncservice_platform_local_JSON = config_node_property_drop_down_convertToJSON(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_platform);
    if(com_adobe_cq_dam_mac_sync_damsyncservice_platform_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.cq.dam.mac.sync.damsyncservice.platform", com_adobe_cq_dam_mac_sync_damsyncservice_platform_local_JSON);
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

com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_t *com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_parseFromJSON(cJSON *com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_propertiesJSON){

    com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_t *com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths
    config_node_property_array_t *com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions
    config_node_property_boolean_t *com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms
    config_node_property_integer_t *com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms_local_nonprim = NULL;

    // define the local variable for com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_platform
    config_node_property_drop_down_t *com_adobe_cq_dam_mac_sync_damsyncservice_platform_local_nonprim = NULL;

    // com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths
    cJSON *com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_propertiesJSON, "com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths");
    if (cJSON_IsNull(com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths)) {
        com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths = NULL;
    }
    if (com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths) { 
    com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths_local_nonprim = config_node_property_array_parseFromJSON(com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths); //nonprimitive
    }

    // com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions
    cJSON *com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_propertiesJSON, "com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions");
    if (cJSON_IsNull(com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions)) {
        com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions = NULL;
    }
    if (com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions) { 
    com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions_local_nonprim = config_node_property_boolean_parseFromJSON(com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions); //nonprimitive
    }

    // com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms
    cJSON *com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_propertiesJSON, "com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms");
    if (cJSON_IsNull(com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms)) {
        com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms = NULL;
    }
    if (com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms) { 
    com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms_local_nonprim = config_node_property_integer_parseFromJSON(com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms); //nonprimitive
    }

    // com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties->com_adobe_cq_dam_mac_sync_damsyncservice_platform
    cJSON *com_adobe_cq_dam_mac_sync_damsyncservice_platform = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_propertiesJSON, "com.adobe.cq.dam.mac.sync.damsyncservice.platform");
    if (cJSON_IsNull(com_adobe_cq_dam_mac_sync_damsyncservice_platform)) {
        com_adobe_cq_dam_mac_sync_damsyncservice_platform = NULL;
    }
    if (com_adobe_cq_dam_mac_sync_damsyncservice_platform) { 
    com_adobe_cq_dam_mac_sync_damsyncservice_platform_local_nonprim = config_node_property_drop_down_parseFromJSON(com_adobe_cq_dam_mac_sync_damsyncservice_platform); //nonprimitive
    }



    com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_local_var = com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_create_internal (
        com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths ? com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths_local_nonprim : NULL,
        com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions ? com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions_local_nonprim : NULL,
        com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms ? com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms_local_nonprim : NULL,
        com_adobe_cq_dam_mac_sync_damsyncservice_platform ? com_adobe_cq_dam_mac_sync_damsyncservice_platform_local_nonprim : NULL
        );

    if (!com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties_local_var;
end:
    if (com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths_local_nonprim) {
        config_node_property_array_free(com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths_local_nonprim);
        com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths_local_nonprim = NULL;
    }
    if (com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions_local_nonprim) {
        config_node_property_boolean_free(com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions_local_nonprim);
        com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions_local_nonprim = NULL;
    }
    if (com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms_local_nonprim) {
        config_node_property_integer_free(com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms_local_nonprim);
        com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms_local_nonprim = NULL;
    }
    if (com_adobe_cq_dam_mac_sync_damsyncservice_platform_local_nonprim) {
        config_node_property_drop_down_free(com_adobe_cq_dam_mac_sync_damsyncservice_platform_local_nonprim);
        com_adobe_cq_dam_mac_sync_damsyncservice_platform_local_nonprim = NULL;
    }
    return NULL;

}
