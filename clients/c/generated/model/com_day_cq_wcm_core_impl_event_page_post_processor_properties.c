#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_core_impl_event_page_post_processor_properties.h"



static com_day_cq_wcm_core_impl_event_page_post_processor_properties_t *com_day_cq_wcm_core_impl_event_page_post_processor_properties_create_internal(
    config_node_property_array_t *paths
    ) {
    com_day_cq_wcm_core_impl_event_page_post_processor_properties_t *com_day_cq_wcm_core_impl_event_page_post_processor_properties_local_var = malloc(sizeof(com_day_cq_wcm_core_impl_event_page_post_processor_properties_t));
    if (!com_day_cq_wcm_core_impl_event_page_post_processor_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_core_impl_event_page_post_processor_properties_local_var, 0, sizeof(com_day_cq_wcm_core_impl_event_page_post_processor_properties_t));
    com_day_cq_wcm_core_impl_event_page_post_processor_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_core_impl_event_page_post_processor_properties_local_var->paths = paths;
    return com_day_cq_wcm_core_impl_event_page_post_processor_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_core_impl_event_page_post_processor_properties_t *com_day_cq_wcm_core_impl_event_page_post_processor_properties_create(
    config_node_property_array_t *paths
    ) {
    com_day_cq_wcm_core_impl_event_page_post_processor_properties_t *result = com_day_cq_wcm_core_impl_event_page_post_processor_properties_create_internal (
        paths
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_core_impl_event_page_post_processor_properties_free(com_day_cq_wcm_core_impl_event_page_post_processor_properties_t *com_day_cq_wcm_core_impl_event_page_post_processor_properties) {
    if(NULL == com_day_cq_wcm_core_impl_event_page_post_processor_properties){
        return ;
    }
    if(com_day_cq_wcm_core_impl_event_page_post_processor_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_core_impl_event_page_post_processor_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_core_impl_event_page_post_processor_properties->paths) {
        config_node_property_array_free(com_day_cq_wcm_core_impl_event_page_post_processor_properties->paths);
        com_day_cq_wcm_core_impl_event_page_post_processor_properties->paths = NULL;
    }
    free(com_day_cq_wcm_core_impl_event_page_post_processor_properties);
}

cJSON *com_day_cq_wcm_core_impl_event_page_post_processor_properties_convertToJSON(com_day_cq_wcm_core_impl_event_page_post_processor_properties_t *com_day_cq_wcm_core_impl_event_page_post_processor_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_core_impl_event_page_post_processor_properties->paths
    if(com_day_cq_wcm_core_impl_event_page_post_processor_properties->paths) {
    cJSON *paths_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_core_impl_event_page_post_processor_properties->paths);
    if(paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "paths", paths_local_JSON);
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

com_day_cq_wcm_core_impl_event_page_post_processor_properties_t *com_day_cq_wcm_core_impl_event_page_post_processor_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_event_page_post_processor_propertiesJSON){

    com_day_cq_wcm_core_impl_event_page_post_processor_properties_t *com_day_cq_wcm_core_impl_event_page_post_processor_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_event_page_post_processor_properties->paths
    config_node_property_array_t *paths_local_nonprim = NULL;

    // com_day_cq_wcm_core_impl_event_page_post_processor_properties->paths
    cJSON *paths = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_event_page_post_processor_propertiesJSON, "paths");
    if (cJSON_IsNull(paths)) {
        paths = NULL;
    }
    if (paths) { 
    paths_local_nonprim = config_node_property_array_parseFromJSON(paths); //nonprimitive
    }



    com_day_cq_wcm_core_impl_event_page_post_processor_properties_local_var = com_day_cq_wcm_core_impl_event_page_post_processor_properties_create_internal (
        paths ? paths_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_core_impl_event_page_post_processor_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_core_impl_event_page_post_processor_properties_local_var;
end:
    if (paths_local_nonprim) {
        config_node_property_array_free(paths_local_nonprim);
        paths_local_nonprim = NULL;
    }
    return NULL;

}
