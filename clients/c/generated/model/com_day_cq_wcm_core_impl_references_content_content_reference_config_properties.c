#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_wcm_core_impl_references_content_content_reference_config_properties.h"



static com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_t *com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_create_internal(
    config_node_property_array_t *content_reference_config_resource_types
    ) {
    com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_t *com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_local_var = malloc(sizeof(com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_t));
    if (!com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_local_var, 0, sizeof(com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_t));
    com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_local_var->_library_owned = 1;
    com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_local_var->content_reference_config_resource_types = content_reference_config_resource_types;
    return com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_t *com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_create(
    config_node_property_array_t *content_reference_config_resource_types
    ) {
    com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_t *result = com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_create_internal (
        content_reference_config_resource_types
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_free(com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_t *com_day_cq_wcm_core_impl_references_content_content_reference_config_properties) {
    if(NULL == com_day_cq_wcm_core_impl_references_content_content_reference_config_properties){
        return ;
    }
    if(com_day_cq_wcm_core_impl_references_content_content_reference_config_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_wcm_core_impl_references_content_content_reference_config_properties->content_reference_config_resource_types) {
        config_node_property_array_free(com_day_cq_wcm_core_impl_references_content_content_reference_config_properties->content_reference_config_resource_types);
        com_day_cq_wcm_core_impl_references_content_content_reference_config_properties->content_reference_config_resource_types = NULL;
    }
    free(com_day_cq_wcm_core_impl_references_content_content_reference_config_properties);
}

cJSON *com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_convertToJSON(com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_t *com_day_cq_wcm_core_impl_references_content_content_reference_config_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_wcm_core_impl_references_content_content_reference_config_properties->content_reference_config_resource_types
    if(com_day_cq_wcm_core_impl_references_content_content_reference_config_properties->content_reference_config_resource_types) {
    cJSON *content_reference_config_resource_types_local_JSON = config_node_property_array_convertToJSON(com_day_cq_wcm_core_impl_references_content_content_reference_config_properties->content_reference_config_resource_types);
    if(content_reference_config_resource_types_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "contentReferenceConfig.resourceTypes", content_reference_config_resource_types_local_JSON);
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

com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_t *com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_parseFromJSON(cJSON *com_day_cq_wcm_core_impl_references_content_content_reference_config_propertiesJSON){

    com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_t *com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_local_var = NULL;

    // define the local variable for com_day_cq_wcm_core_impl_references_content_content_reference_config_properties->content_reference_config_resource_types
    config_node_property_array_t *content_reference_config_resource_types_local_nonprim = NULL;

    // com_day_cq_wcm_core_impl_references_content_content_reference_config_properties->content_reference_config_resource_types
    cJSON *content_reference_config_resource_types = cJSON_GetObjectItemCaseSensitive(com_day_cq_wcm_core_impl_references_content_content_reference_config_propertiesJSON, "contentReferenceConfig.resourceTypes");
    if (cJSON_IsNull(content_reference_config_resource_types)) {
        content_reference_config_resource_types = NULL;
    }
    if (content_reference_config_resource_types) { 
    content_reference_config_resource_types_local_nonprim = config_node_property_array_parseFromJSON(content_reference_config_resource_types); //nonprimitive
    }



    com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_local_var = com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_create_internal (
        content_reference_config_resource_types ? content_reference_config_resource_types_local_nonprim : NULL
        );

    if (!com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_local_var) {
        goto end;
    }

    return com_day_cq_wcm_core_impl_references_content_content_reference_config_properties_local_var;
end:
    if (content_reference_config_resource_types_local_nonprim) {
        config_node_property_array_free(content_reference_config_resource_types_local_nonprim);
        content_reference_config_resource_types_local_nonprim = NULL;
    }
    return NULL;

}
