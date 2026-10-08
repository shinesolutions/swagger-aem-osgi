#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties.h"



static com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_t *com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_create_internal(
    config_node_property_string_t *sling_servlet_resource_types,
    config_node_property_string_t *sling_servlet_methods,
    config_node_property_string_t *sling_servlet_extensions,
    config_node_property_string_t *sling_servlet_selectors
    ) {
    com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_t *com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_local_var = malloc(sizeof(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_t));
    if (!com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_local_var, 0, sizeof(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_t));
    com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_local_var->_library_owned = 1;
    com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_local_var->sling_servlet_resource_types = sling_servlet_resource_types;
    com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_local_var->sling_servlet_methods = sling_servlet_methods;
    com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_local_var->sling_servlet_extensions = sling_servlet_extensions;
    com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_local_var->sling_servlet_selectors = sling_servlet_selectors;
    return com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_t *com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_create(
    config_node_property_string_t *sling_servlet_resource_types,
    config_node_property_string_t *sling_servlet_methods,
    config_node_property_string_t *sling_servlet_extensions,
    config_node_property_string_t *sling_servlet_selectors
    ) {
    com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_t *result = com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_create_internal (
        sling_servlet_resource_types,
        sling_servlet_methods,
        sling_servlet_extensions,
        sling_servlet_selectors
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_free(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_t *com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties) {
    if(NULL == com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties){
        return ;
    }
    if(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_resource_types) {
        config_node_property_string_free(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_resource_types);
        com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_resource_types = NULL;
    }
    if (com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_methods) {
        config_node_property_string_free(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_methods);
        com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_methods = NULL;
    }
    if (com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_extensions) {
        config_node_property_string_free(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_extensions);
        com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_extensions = NULL;
    }
    if (com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_selectors) {
        config_node_property_string_free(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_selectors);
        com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_selectors = NULL;
    }
    free(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties);
}

cJSON *com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_convertToJSON(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_t *com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_resource_types
    if(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_resource_types) {
    cJSON *sling_servlet_resource_types_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_resource_types);
    if(sling_servlet_resource_types_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.servlet.resourceTypes", sling_servlet_resource_types_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_methods
    if(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_methods) {
    cJSON *sling_servlet_methods_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_methods);
    if(sling_servlet_methods_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.servlet.methods", sling_servlet_methods_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_extensions
    if(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_extensions) {
    cJSON *sling_servlet_extensions_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_extensions);
    if(sling_servlet_extensions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.servlet.extensions", sling_servlet_extensions_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_selectors
    if(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_selectors) {
    cJSON *sling_servlet_selectors_local_JSON = config_node_property_string_convertToJSON(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_selectors);
    if(sling_servlet_selectors_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sling.servlet.selectors", sling_servlet_selectors_local_JSON);
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

com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_t *com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_parseFromJSON(cJSON *com_day_cq_dam_core_impl_servlet_metadata_get_servlet_propertiesJSON){

    com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_t *com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_resource_types
    config_node_property_string_t *sling_servlet_resource_types_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_methods
    config_node_property_string_t *sling_servlet_methods_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_extensions
    config_node_property_string_t *sling_servlet_extensions_local_nonprim = NULL;

    // define the local variable for com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_selectors
    config_node_property_string_t *sling_servlet_selectors_local_nonprim = NULL;

    // com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_resource_types
    cJSON *sling_servlet_resource_types = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_propertiesJSON, "sling.servlet.resourceTypes");
    if (cJSON_IsNull(sling_servlet_resource_types)) {
        sling_servlet_resource_types = NULL;
    }
    if (sling_servlet_resource_types) { 
    sling_servlet_resource_types_local_nonprim = config_node_property_string_parseFromJSON(sling_servlet_resource_types); //nonprimitive
    }

    // com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_methods
    cJSON *sling_servlet_methods = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_propertiesJSON, "sling.servlet.methods");
    if (cJSON_IsNull(sling_servlet_methods)) {
        sling_servlet_methods = NULL;
    }
    if (sling_servlet_methods) { 
    sling_servlet_methods_local_nonprim = config_node_property_string_parseFromJSON(sling_servlet_methods); //nonprimitive
    }

    // com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_extensions
    cJSON *sling_servlet_extensions = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_propertiesJSON, "sling.servlet.extensions");
    if (cJSON_IsNull(sling_servlet_extensions)) {
        sling_servlet_extensions = NULL;
    }
    if (sling_servlet_extensions) { 
    sling_servlet_extensions_local_nonprim = config_node_property_string_parseFromJSON(sling_servlet_extensions); //nonprimitive
    }

    // com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties->sling_servlet_selectors
    cJSON *sling_servlet_selectors = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_core_impl_servlet_metadata_get_servlet_propertiesJSON, "sling.servlet.selectors");
    if (cJSON_IsNull(sling_servlet_selectors)) {
        sling_servlet_selectors = NULL;
    }
    if (sling_servlet_selectors) { 
    sling_servlet_selectors_local_nonprim = config_node_property_string_parseFromJSON(sling_servlet_selectors); //nonprimitive
    }



    com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_local_var = com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_create_internal (
        sling_servlet_resource_types ? sling_servlet_resource_types_local_nonprim : NULL,
        sling_servlet_methods ? sling_servlet_methods_local_nonprim : NULL,
        sling_servlet_extensions ? sling_servlet_extensions_local_nonprim : NULL,
        sling_servlet_selectors ? sling_servlet_selectors_local_nonprim : NULL
        );

    if (!com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_core_impl_servlet_metadata_get_servlet_properties_local_var;
end:
    if (sling_servlet_resource_types_local_nonprim) {
        config_node_property_string_free(sling_servlet_resource_types_local_nonprim);
        sling_servlet_resource_types_local_nonprim = NULL;
    }
    if (sling_servlet_methods_local_nonprim) {
        config_node_property_string_free(sling_servlet_methods_local_nonprim);
        sling_servlet_methods_local_nonprim = NULL;
    }
    if (sling_servlet_extensions_local_nonprim) {
        config_node_property_string_free(sling_servlet_extensions_local_nonprim);
        sling_servlet_extensions_local_nonprim = NULL;
    }
    if (sling_servlet_selectors_local_nonprim) {
        config_node_property_string_free(sling_servlet_selectors_local_nonprim);
        sling_servlet_selectors_local_nonprim = NULL;
    }
    return NULL;

}
