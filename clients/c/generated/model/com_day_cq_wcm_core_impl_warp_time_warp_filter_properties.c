#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_core_impl_warp_time_warp_filter_properties.h"



static com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_t *com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_create_internal(
    config_node_property_string_t *filter_order,
    config_node_property_string_t *filter_scope
    ) {
    com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_t *com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_local_var = malloc(sizeof(com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_t));
    if (!com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_local_var, 0, sizeof(com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_t));
    com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_local_var->filter_order = filter_order;
    com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_local_var->filter_scope = filter_scope;
    return com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_t *com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_create(
    config_node_property_string_t *filter_order,
    config_node_property_string_t *filter_scope
    ) {
    com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_t *result = com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_create_internal (
        filter_order,
        filter_scope
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_free(com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_t *com_day_cq_wcm_core_impl_warp_time_warp_filter_properties) {
    if(NULL == com_day_cq_wcm_core_impl_warp_time_warp_filter_properties){
        return ;
    }
    if(com_day_cq_wcm_core_impl_warp_time_warp_filter_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_core_impl_warp_time_warp_filter_properties->filter_order) {
        config_node_property_string_free(com_day_cq_wcm_core_impl_warp_time_warp_filter_properties->filter_order);
        com_day_cq_wcm_core_impl_warp_time_warp_filter_properties->filter_order = NULL;
    }
    if (com_day_cq_wcm_core_impl_warp_time_warp_filter_properties->filter_scope) {
        config_node_property_string_free(com_day_cq_wcm_core_impl_warp_time_warp_filter_properties->filter_scope);
        com_day_cq_wcm_core_impl_warp_time_warp_filter_properties->filter_scope = NULL;
    }
    free(com_day_cq_wcm_core_impl_warp_time_warp_filter_properties);
}

cJSON *com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_convertToJSON(com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_t *com_day_cq_wcm_core_impl_warp_time_warp_filter_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_core_impl_warp_time_warp_filter_properties->filter_order
    if(com_day_cq_wcm_core_impl_warp_time_warp_filter_properties->filter_order) {
    cJSON *filter_order_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_core_impl_warp_time_warp_filter_properties->filter_order);
    if(filter_order_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filter.order", filter_order_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_warp_time_warp_filter_properties->filter_scope
    if(com_day_cq_wcm_core_impl_warp_time_warp_filter_properties->filter_scope) {
    cJSON *filter_scope_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_core_impl_warp_time_warp_filter_properties->filter_scope);
    if(filter_scope_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "filter.scope", filter_scope_local_JSON);
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

com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_t *com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_warp_time_warp_filter_propertiesJSON){

    com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_t *com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_warp_time_warp_filter_properties->filter_order
    config_node_property_string_t *filter_order_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_warp_time_warp_filter_properties->filter_scope
    config_node_property_string_t *filter_scope_local_nonprim = NULL;

    // com_day_cq_wcm_core_impl_warp_time_warp_filter_properties->filter_order
    cJSON *filter_order = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_warp_time_warp_filter_propertiesJSON, "filter.order");
    if (cJSON_IsNull(filter_order)) {
        filter_order = NULL;
    }
    if (filter_order) { 
    filter_order_local_nonprim = config_node_property_string_parseFromJSON(filter_order); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_warp_time_warp_filter_properties->filter_scope
    cJSON *filter_scope = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_warp_time_warp_filter_propertiesJSON, "filter.scope");
    if (cJSON_IsNull(filter_scope)) {
        filter_scope = NULL;
    }
    if (filter_scope) { 
    filter_scope_local_nonprim = config_node_property_string_parseFromJSON(filter_scope); //nonprimitive
    }



    com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_local_var = com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_create_internal (
        filter_order ? filter_order_local_nonprim : NULL,
        filter_scope ? filter_scope_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_core_impl_warp_time_warp_filter_properties_local_var;
end:
    if (filter_order_local_nonprim) {
        config_node_property_string_free(filter_order_local_nonprim);
        filter_order_local_nonprim = NULL;
    }
    if (filter_scope_local_nonprim) {
        config_node_property_string_free(filter_scope_local_nonprim);
        filter_scope_local_nonprim = NULL;
    }
    return NULL;

}
