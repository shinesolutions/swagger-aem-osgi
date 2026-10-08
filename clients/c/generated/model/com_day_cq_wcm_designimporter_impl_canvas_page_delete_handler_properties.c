#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties.h"



static com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_t *com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_create_internal(
    config_node_property_integer_t *min_thread_pool_size,
    config_node_property_integer_t *max_thread_pool_size
    ) {
    com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_t *com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_local_var = malloc(sizeof(com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_t));
    if (!com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_local_var, 0, sizeof(com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_t));
    com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_local_var->min_thread_pool_size = min_thread_pool_size;
    com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_local_var->max_thread_pool_size = max_thread_pool_size;
    return com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_t *com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_create(
    config_node_property_integer_t *min_thread_pool_size,
    config_node_property_integer_t *max_thread_pool_size
    ) {
    com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_t *result = com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_create_internal (
        min_thread_pool_size,
        max_thread_pool_size
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_free(com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_t *com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties) {
    if(NULL == com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties){
        return ;
    }
    if(com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties->min_thread_pool_size) {
        config_node_property_integer_free(com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties->min_thread_pool_size);
        com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties->min_thread_pool_size = NULL;
    }
    if (com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties->max_thread_pool_size) {
        config_node_property_integer_free(com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties->max_thread_pool_size);
        com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties->max_thread_pool_size = NULL;
    }
    free(com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties);
}

cJSON *com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_convertToJSON(com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_t *com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties->min_thread_pool_size
    if(com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties->min_thread_pool_size) {
    cJSON *min_thread_pool_size_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties->min_thread_pool_size);
    if(min_thread_pool_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "minThreadPoolSize", min_thread_pool_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties->max_thread_pool_size
    if(com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties->max_thread_pool_size) {
    cJSON *max_thread_pool_size_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties->max_thread_pool_size);
    if(max_thread_pool_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "maxThreadPoolSize", max_thread_pool_size_local_JSON);
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

com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_t *com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_parseFromJSON(cJSON *com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_propertiesJSON){

    com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_t *com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties->min_thread_pool_size
    config_node_property_integer_t *min_thread_pool_size_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties->max_thread_pool_size
    config_node_property_integer_t *max_thread_pool_size_local_nonprim = NULL;

    // com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties->min_thread_pool_size
    cJSON *min_thread_pool_size = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_propertiesJSON, "minThreadPoolSize");
    if (cJSON_IsNull(min_thread_pool_size)) {
        min_thread_pool_size = NULL;
    }
    if (min_thread_pool_size) { 
    min_thread_pool_size_local_nonprim = config_node_property_integer_parseFromJSON(min_thread_pool_size); //nonprimitive
    }

    // com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties->max_thread_pool_size
    cJSON *max_thread_pool_size = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_propertiesJSON, "maxThreadPoolSize");
    if (cJSON_IsNull(max_thread_pool_size)) {
        max_thread_pool_size = NULL;
    }
    if (max_thread_pool_size) { 
    max_thread_pool_size_local_nonprim = config_node_property_integer_parseFromJSON(max_thread_pool_size); //nonprimitive
    }



    com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_local_var = com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_create_internal (
        min_thread_pool_size ? min_thread_pool_size_local_nonprim : NULL,
        max_thread_pool_size ? max_thread_pool_size_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties_local_var;
end:
    if (min_thread_pool_size_local_nonprim) {
        config_node_property_integer_free(min_thread_pool_size_local_nonprim);
        min_thread_pool_size_local_nonprim = NULL;
    }
    if (max_thread_pool_size_local_nonprim) {
        config_node_property_integer_free(max_thread_pool_size_local_nonprim);
        max_thread_pool_size_local_nonprim = NULL;
    }
    return NULL;

}
