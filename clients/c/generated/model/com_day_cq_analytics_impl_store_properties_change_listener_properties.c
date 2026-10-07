#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_analytics_impl_store_properties_change_listener_properties.h"



static com_day_cq_analytics_impl_store_properties_change_listener_properties_t *com_day_cq_analytics_impl_store_properties_change_listener_properties_create_internal(
    config_node_property_array_t *cq_store_listener_additional_store_paths
    ) {
    com_day_cq_analytics_impl_store_properties_change_listener_properties_t *com_day_cq_analytics_impl_store_properties_change_listener_properties_local_var = malloc(sizeof(com_day_cq_analytics_impl_store_properties_change_listener_properties_t));
    if (!com_day_cq_analytics_impl_store_properties_change_listener_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_analytics_impl_store_properties_change_listener_properties_local_var, 0, sizeof(com_day_cq_analytics_impl_store_properties_change_listener_properties_t));
    com_day_cq_analytics_impl_store_properties_change_listener_properties_local_var->_library_owned = 1;
    com_day_cq_analytics_impl_store_properties_change_listener_properties_local_var->cq_store_listener_additional_store_paths = cq_store_listener_additional_store_paths;
    return com_day_cq_analytics_impl_store_properties_change_listener_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_analytics_impl_store_properties_change_listener_properties_t *com_day_cq_analytics_impl_store_properties_change_listener_properties_create(
    config_node_property_array_t *cq_store_listener_additional_store_paths
    ) {
    com_day_cq_analytics_impl_store_properties_change_listener_properties_t *result = com_day_cq_analytics_impl_store_properties_change_listener_properties_create_internal (
        cq_store_listener_additional_store_paths
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_analytics_impl_store_properties_change_listener_properties_free(com_day_cq_analytics_impl_store_properties_change_listener_properties_t *com_day_cq_analytics_impl_store_properties_change_listener_properties) {
    if(NULL == com_day_cq_analytics_impl_store_properties_change_listener_properties){
        return ;
    }
    if(com_day_cq_analytics_impl_store_properties_change_listener_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_analytics_impl_store_properties_change_listener_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_analytics_impl_store_properties_change_listener_properties->cq_store_listener_additional_store_paths) {
        config_node_property_array_free(com_day_cq_analytics_impl_store_properties_change_listener_properties->cq_store_listener_additional_store_paths);
        com_day_cq_analytics_impl_store_properties_change_listener_properties->cq_store_listener_additional_store_paths = NULL;
    }
    free(com_day_cq_analytics_impl_store_properties_change_listener_properties);
}

cJSON *com_day_cq_analytics_impl_store_properties_change_listener_properties_convertToJSON(com_day_cq_analytics_impl_store_properties_change_listener_properties_t *com_day_cq_analytics_impl_store_properties_change_listener_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_analytics_impl_store_properties_change_listener_properties->cq_store_listener_additional_store_paths
    if(com_day_cq_analytics_impl_store_properties_change_listener_properties->cq_store_listener_additional_store_paths) {
    cJSON *cq_store_listener_additional_store_paths_local_JSON = config_node_property_array_convertToJSON(com_day_cq_analytics_impl_store_properties_change_listener_properties->cq_store_listener_additional_store_paths);
    if(cq_store_listener_additional_store_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.store.listener.additionalStorePaths", cq_store_listener_additional_store_paths_local_JSON);
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

com_day_cq_analytics_impl_store_properties_change_listener_properties_t *com_day_cq_analytics_impl_store_properties_change_listener_properties_parseFromJSON(cJSON *com_day_cq_analytics_impl_store_properties_change_listener_propertiesJSON){

    com_day_cq_analytics_impl_store_properties_change_listener_properties_t *com_day_cq_analytics_impl_store_properties_change_listener_properties_local_var = NULL;

    // define the local variable for com_day_cq_analytics_impl_store_properties_change_listener_properties->cq_store_listener_additional_store_paths
    config_node_property_array_t *cq_store_listener_additional_store_paths_local_nonprim = NULL;

    // com_day_cq_analytics_impl_store_properties_change_listener_properties->cq_store_listener_additional_store_paths
    cJSON *cq_store_listener_additional_store_paths = cJSON_GetObjectItemCaseSensitive(com_day_cq_analytics_impl_store_properties_change_listener_propertiesJSON, "cq.store.listener.additionalStorePaths");
    if (cJSON_IsNull(cq_store_listener_additional_store_paths)) {
        cq_store_listener_additional_store_paths = NULL;
    }
    if (cq_store_listener_additional_store_paths) { 
    cq_store_listener_additional_store_paths_local_nonprim = config_node_property_array_parseFromJSON(cq_store_listener_additional_store_paths); //nonprimitive
    }



    com_day_cq_analytics_impl_store_properties_change_listener_properties_local_var = com_day_cq_analytics_impl_store_properties_change_listener_properties_create_internal (
        cq_store_listener_additional_store_paths ? cq_store_listener_additional_store_paths_local_nonprim : NULL
        );

    if (!com_day_cq_analytics_impl_store_properties_change_listener_properties_local_var) {
        goto end;
    }

    return com_day_cq_analytics_impl_store_properties_change_listener_properties_local_var;
end:
    if (cq_store_listener_additional_store_paths_local_nonprim) {
        config_node_property_array_free(cq_store_listener_additional_store_paths_local_nonprim);
        cq_store_listener_additional_store_paths_local_nonprim = NULL;
    }
    return NULL;

}
