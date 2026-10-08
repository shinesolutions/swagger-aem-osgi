#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties.h"



static com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_t *com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_create_internal(
    config_node_property_string_t *workspace,
    config_node_property_array_t *dimensions
    ) {
    com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_t *com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_local_var = malloc(sizeof(com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_t));
    if (!com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_local_var, 0, sizeof(com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_t));
    com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_local_var->workspace = workspace;
    com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_local_var->dimensions = dimensions;
    return com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_t *com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_create(
    config_node_property_string_t *workspace,
    config_node_property_array_t *dimensions
    ) {
    com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_t *result = com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_create_internal (
        workspace,
        dimensions
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_free(com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_t *com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties) {
    if(NULL == com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties){
        return ;
    }
    if(com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties->workspace) {
        config_node_property_string_free(com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties->workspace);
        com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties->workspace = NULL;
    }
    if (com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties->dimensions) {
        config_node_property_array_free(com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties->dimensions);
        com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties->dimensions = NULL;
    }
    free(com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties);
}

cJSON *com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_convertToJSON(com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_t *com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties->workspace
    if(com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties->workspace) {
    cJSON *workspace_local_JSON = config_node_property_string_convertToJSON(com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties->workspace);
    if(workspace_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "workspace", workspace_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties->dimensions
    if(com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties->dimensions) {
    cJSON *dimensions_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties->dimensions);
    if(dimensions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dimensions", dimensions_local_JSON);
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

com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_t *com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_propertiesJSON){

    com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_t *com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties->workspace
    config_node_property_string_t *workspace_local_nonprim = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties->dimensions
    config_node_property_array_t *dimensions_local_nonprim = NULL;

    // com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties->workspace
    cJSON *workspace = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_propertiesJSON, "workspace");
    if (cJSON_IsNull(workspace)) {
        workspace = NULL;
    }
    if (workspace) { 
    workspace_local_nonprim = config_node_property_string_parseFromJSON(workspace); //nonprimitive
    }

    // com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties->dimensions
    cJSON *dimensions = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_propertiesJSON, "dimensions");
    if (cJSON_IsNull(dimensions)) {
        dimensions = NULL;
    }
    if (dimensions) { 
    dimensions_local_nonprim = config_node_property_array_parseFromJSON(dimensions); //nonprimitive
    }



    com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_local_var = com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_create_internal (
        workspace ? workspace_local_nonprim : NULL,
        dimensions ? dimensions_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_properties_local_var;
end:
    if (workspace_local_nonprim) {
        config_node_property_string_free(workspace_local_nonprim);
        workspace_local_nonprim = NULL;
    }
    if (dimensions_local_nonprim) {
        config_node_property_array_free(dimensions_local_nonprim);
        dimensions_local_nonprim = NULL;
    }
    return NULL;

}
