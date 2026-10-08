#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties.h"



static com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_t *com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_create_internal(
    config_node_property_array_t *sling_servlet_resource_types,
    config_node_property_array_t *sling_servlet_methods,
    config_node_property_boolean_t *cq_dam_drm_enable
    ) {
    com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_t *com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_t));
    if (!com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_t));
    com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_local_var->sling_servlet_resource_types = sling_servlet_resource_types;
    com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_local_var->sling_servlet_methods = sling_servlet_methods;
    com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_local_var->cq_dam_drm_enable = cq_dam_drm_enable;
    return com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_t *com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_create(
    config_node_property_array_t *sling_servlet_resource_types,
    config_node_property_array_t *sling_servlet_methods,
    config_node_property_boolean_t *cq_dam_drm_enable
    ) {
    com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_t *result = com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_create_internal (
        sling_servlet_resource_types,
        sling_servlet_methods,
        cq_dam_drm_enable
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_free(com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_t *com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties) {
    if(NULL == com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->sling_servlet_resource_types) {
        config_node_property_array_free(com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->sling_servlet_resource_types);
        com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->sling_servlet_resource_types = NULL;
    }
    if (com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->sling_servlet_methods) {
        config_node_property_array_free(com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->sling_servlet_methods);
        com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->sling_servlet_methods = NULL;
    }
    if (com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->cq_dam_drm_enable) {
        config_node_property_boolean_free(com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->cq_dam_drm_enable);
        com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->cq_dam_drm_enable = NULL;
    }
    free(com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties);
}

cJSON *com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_convertToJSON(com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_t *com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->sling_servlet_resource_types
    if(com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->sling_servlet_resource_types) {
    cJSON *sling_servlet_resource_types_local_JSON = config_node_property_array_convertToJSON(com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->sling_servlet_resource_types);
    if(sling_servlet_resource_types_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.servlet.resourceTypes", sling_servlet_resource_types_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->sling_servlet_methods
    if(com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->sling_servlet_methods) {
    cJSON *sling_servlet_methods_local_JSON = config_node_property_array_convertToJSON(com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->sling_servlet_methods);
    if(sling_servlet_methods_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.servlet.methods", sling_servlet_methods_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->cq_dam_drm_enable
    if(com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->cq_dam_drm_enable) {
    cJSON *cq_dam_drm_enable_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->cq_dam_drm_enable);
    if(cq_dam_drm_enable_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cq.dam.drm.enable", cq_dam_drm_enable_local_JSON);
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

com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_t *com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_servlet_binary_provider_servlet_propertiesJSON){

    com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_t *com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->sling_servlet_resource_types
    config_node_property_array_t *sling_servlet_resource_types_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->sling_servlet_methods
    config_node_property_array_t *sling_servlet_methods_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->cq_dam_drm_enable
    config_node_property_boolean_t *cq_dam_drm_enable_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->sling_servlet_resource_types
    cJSON *sling_servlet_resource_types = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_servlet_binary_provider_servlet_propertiesJSON, "sling.servlet.resourceTypes");
    if (cJSON_IsNull(sling_servlet_resource_types)) {
        sling_servlet_resource_types = NULL;
    }
    if (sling_servlet_resource_types) { 
    sling_servlet_resource_types_local_nonprim = config_node_property_array_parseFromJSON(sling_servlet_resource_types); //nonprimitive
    }

    // com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->sling_servlet_methods
    cJSON *sling_servlet_methods = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_servlet_binary_provider_servlet_propertiesJSON, "sling.servlet.methods");
    if (cJSON_IsNull(sling_servlet_methods)) {
        sling_servlet_methods = NULL;
    }
    if (sling_servlet_methods) { 
    sling_servlet_methods_local_nonprim = config_node_property_array_parseFromJSON(sling_servlet_methods); //nonprimitive
    }

    // com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties->cq_dam_drm_enable
    cJSON *cq_dam_drm_enable = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_servlet_binary_provider_servlet_propertiesJSON, "cq.dam.drm.enable");
    if (cJSON_IsNull(cq_dam_drm_enable)) {
        cq_dam_drm_enable = NULL;
    }
    if (cq_dam_drm_enable) { 
    cq_dam_drm_enable_local_nonprim = config_node_property_boolean_parseFromJSON(cq_dam_drm_enable); //nonprimitive
    }



    com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_local_var = com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_create_internal (
        sling_servlet_resource_types ? sling_servlet_resource_types_local_nonprim : NULL,
        sling_servlet_methods ? sling_servlet_methods_local_nonprim : NULL,
        cq_dam_drm_enable ? cq_dam_drm_enable_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_servlet_binary_provider_servlet_properties_local_var;
end:
    if (sling_servlet_resource_types_local_nonprim) {
        config_node_property_array_free(sling_servlet_resource_types_local_nonprim);
        sling_servlet_resource_types_local_nonprim = NULL;
    }
    if (sling_servlet_methods_local_nonprim) {
        config_node_property_array_free(sling_servlet_methods_local_nonprim);
        sling_servlet_methods_local_nonprim = NULL;
    }
    if (cq_dam_drm_enable_local_nonprim) {
        config_node_property_boolean_free(cq_dam_drm_enable_local_nonprim);
        cq_dam_drm_enable_local_nonprim = NULL;
    }
    return NULL;

}
