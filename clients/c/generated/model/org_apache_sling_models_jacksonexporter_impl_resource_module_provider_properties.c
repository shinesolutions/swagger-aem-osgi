#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties.h"



static org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_t *org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_create_internal(
    config_node_property_integer_t *max_recursion_levels
    ) {
    org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_t *org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_local_var = malloc(sizeof(org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_t));
    if (!org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_local_var, 0, sizeof(org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_t));
    org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_local_var->_library_owned = 1;
    org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_local_var->max_recursion_levels = max_recursion_levels;
    return org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_t *org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_create(
    config_node_property_integer_t *max_recursion_levels
    ) {
    org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_t *result = org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_create_internal (
        max_recursion_levels
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_free(org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_t *org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties) {
    if(NULL == org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties){
        return ;
    }
    if(org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties->max_recursion_levels) {
        config_node_property_integer_free(org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties->max_recursion_levels);
        org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties->max_recursion_levels = NULL;
    }
    free(org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties);
}

cJSON *org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_convertToJSON(org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_t *org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties->max_recursion_levels
    if(org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties->max_recursion_levels) {
    cJSON *max_recursion_levels_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties->max_recursion_levels);
    if(max_recursion_levels_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "max.recursion.levels", max_recursion_levels_local_JSON);
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

org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_t *org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_parseFromJSON(cJSON *org_apache_sling_models_jacksonexporter_impl_resource_module_provider_propertiesJSON){

    org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_t *org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_local_var = NULL;

    // define the local variable for org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties->max_recursion_levels
    config_node_property_integer_t *max_recursion_levels_local_nonprim = NULL;

    // org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties->max_recursion_levels
    cJSON *max_recursion_levels = cJSON_GetObjectItemCaseSensitive(org_apache_sling_models_jacksonexporter_impl_resource_module_provider_propertiesJSON, "max.recursion.levels");
    if (cJSON_IsNull(max_recursion_levels)) {
        max_recursion_levels = NULL;
    }
    if (max_recursion_levels) { 
    max_recursion_levels_local_nonprim = config_node_property_integer_parseFromJSON(max_recursion_levels); //nonprimitive
    }



    org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_local_var = org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_create_internal (
        max_recursion_levels ? max_recursion_levels_local_nonprim : NULL
        );

    if (!org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_local_var) {
        goto end;
    }

    return org_apache_sling_models_jacksonexporter_impl_resource_module_provider_properties_local_var;
end:
    if (max_recursion_levels_local_nonprim) {
        config_node_property_integer_free(max_recursion_levels_local_nonprim);
        max_recursion_levels_local_nonprim = NULL;
    }
    return NULL;

}
