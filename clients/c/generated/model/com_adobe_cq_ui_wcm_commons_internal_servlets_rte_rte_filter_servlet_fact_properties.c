#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties.h"



static com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_t *com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_create_internal(
    config_node_property_array_t *resource_types
    ) {
    com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_t *com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_local_var = malloc(sizeof(com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_t));
    if (!com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_local_var, 0, sizeof(com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_t));
    com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_local_var->_library_owned = 1;
    com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_local_var->resource_types = resource_types;
    return com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_local_var;
}

__attribute__((deprecated)) com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_t *com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_create(
    config_node_property_array_t *resource_types
    ) {
    com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_t *result = com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_create_internal (
        resource_types
        );
    if (!result) {
    }
    return result;
}

void com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_free(com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_t *com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties) {
    if(NULL == com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties){
        return ;
    }
    if(com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties->resource_types) {
        config_node_property_array_free(com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties->resource_types);
        com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties->resource_types = NULL;
    }
    free(com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties);
}

cJSON *com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_convertToJSON(com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_t *com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties->resource_types
    if(com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties->resource_types) {
    cJSON *resource_types_local_JSON = config_node_property_array_convertToJSON(com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties->resource_types);
    if(resource_types_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "resource.types", resource_types_local_JSON);
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

com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_t *com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_parseFromJSON(cJSON *com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_propertiesJSON){

    com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_t *com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_local_var = NULL;

    // define the local variable for com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties->resource_types
    config_node_property_array_t *resource_types_local_nonprim = NULL;

    // com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties->resource_types
    cJSON *resource_types = cJSON_GetObjectItemCaseSensitive(com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_propertiesJSON, "resource.types");
    if (cJSON_IsNull(resource_types)) {
        resource_types = NULL;
    }
    if (resource_types) { 
    resource_types_local_nonprim = config_node_property_array_parseFromJSON(resource_types); //nonprimitive
    }



    com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_local_var = com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_create_internal (
        resource_types ? resource_types_local_nonprim : NULL
        );

    if (!com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_local_var) {
        goto end;
    }

    return com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_properties_local_var;
end:
    if (resource_types_local_nonprim) {
        config_node_property_array_free(resource_types_local_nonprim);
        resource_types_local_nonprim = NULL;
    }
    return NULL;

}
