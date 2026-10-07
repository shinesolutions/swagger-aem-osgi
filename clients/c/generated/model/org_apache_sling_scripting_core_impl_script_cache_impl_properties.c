#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_scripting_core_impl_script_cache_impl_properties.h"



static org_apache_sling_scripting_core_impl_script_cache_impl_properties_t *org_apache_sling_scripting_core_impl_script_cache_impl_properties_create_internal(
    config_node_property_integer_t *org_apache_sling_scripting_cache_size,
    config_node_property_array_t *org_apache_sling_scripting_cache_additional_extensions
    ) {
    org_apache_sling_scripting_core_impl_script_cache_impl_properties_t *org_apache_sling_scripting_core_impl_script_cache_impl_properties_local_var = malloc(sizeof(org_apache_sling_scripting_core_impl_script_cache_impl_properties_t));
    if (!org_apache_sling_scripting_core_impl_script_cache_impl_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_scripting_core_impl_script_cache_impl_properties_local_var, 0, sizeof(org_apache_sling_scripting_core_impl_script_cache_impl_properties_t));
    org_apache_sling_scripting_core_impl_script_cache_impl_properties_local_var->_library_owned = 1;
    org_apache_sling_scripting_core_impl_script_cache_impl_properties_local_var->org_apache_sling_scripting_cache_size = org_apache_sling_scripting_cache_size;
    org_apache_sling_scripting_core_impl_script_cache_impl_properties_local_var->org_apache_sling_scripting_cache_additional_extensions = org_apache_sling_scripting_cache_additional_extensions;
    return org_apache_sling_scripting_core_impl_script_cache_impl_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_scripting_core_impl_script_cache_impl_properties_t *org_apache_sling_scripting_core_impl_script_cache_impl_properties_create(
    config_node_property_integer_t *org_apache_sling_scripting_cache_size,
    config_node_property_array_t *org_apache_sling_scripting_cache_additional_extensions
    ) {
    org_apache_sling_scripting_core_impl_script_cache_impl_properties_t *result = org_apache_sling_scripting_core_impl_script_cache_impl_properties_create_internal (
        org_apache_sling_scripting_cache_size,
        org_apache_sling_scripting_cache_additional_extensions
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_scripting_core_impl_script_cache_impl_properties_free(org_apache_sling_scripting_core_impl_script_cache_impl_properties_t *org_apache_sling_scripting_core_impl_script_cache_impl_properties) {
    if(NULL == org_apache_sling_scripting_core_impl_script_cache_impl_properties){
        return ;
    }
    if(org_apache_sling_scripting_core_impl_script_cache_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_scripting_core_impl_script_cache_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_scripting_core_impl_script_cache_impl_properties->org_apache_sling_scripting_cache_size) {
        config_node_property_integer_free(org_apache_sling_scripting_core_impl_script_cache_impl_properties->org_apache_sling_scripting_cache_size);
        org_apache_sling_scripting_core_impl_script_cache_impl_properties->org_apache_sling_scripting_cache_size = NULL;
    }
    if (org_apache_sling_scripting_core_impl_script_cache_impl_properties->org_apache_sling_scripting_cache_additional_extensions) {
        config_node_property_array_free(org_apache_sling_scripting_core_impl_script_cache_impl_properties->org_apache_sling_scripting_cache_additional_extensions);
        org_apache_sling_scripting_core_impl_script_cache_impl_properties->org_apache_sling_scripting_cache_additional_extensions = NULL;
    }
    free(org_apache_sling_scripting_core_impl_script_cache_impl_properties);
}

cJSON *org_apache_sling_scripting_core_impl_script_cache_impl_properties_convertToJSON(org_apache_sling_scripting_core_impl_script_cache_impl_properties_t *org_apache_sling_scripting_core_impl_script_cache_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_scripting_core_impl_script_cache_impl_properties->org_apache_sling_scripting_cache_size
    if(org_apache_sling_scripting_core_impl_script_cache_impl_properties->org_apache_sling_scripting_cache_size) {
    cJSON *org_apache_sling_scripting_cache_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_scripting_core_impl_script_cache_impl_properties->org_apache_sling_scripting_cache_size);
    if(org_apache_sling_scripting_cache_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.scripting.cache.size", org_apache_sling_scripting_cache_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_scripting_core_impl_script_cache_impl_properties->org_apache_sling_scripting_cache_additional_extensions
    if(org_apache_sling_scripting_core_impl_script_cache_impl_properties->org_apache_sling_scripting_cache_additional_extensions) {
    cJSON *org_apache_sling_scripting_cache_additional_extensions_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_scripting_core_impl_script_cache_impl_properties->org_apache_sling_scripting_cache_additional_extensions);
    if(org_apache_sling_scripting_cache_additional_extensions_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.scripting.cache.additional_extensions", org_apache_sling_scripting_cache_additional_extensions_local_JSON);
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

org_apache_sling_scripting_core_impl_script_cache_impl_properties_t *org_apache_sling_scripting_core_impl_script_cache_impl_properties_parseFromJSON(cJSON *org_apache_sling_scripting_core_impl_script_cache_impl_propertiesJSON){

    org_apache_sling_scripting_core_impl_script_cache_impl_properties_t *org_apache_sling_scripting_core_impl_script_cache_impl_properties_local_var = NULL;

    // define the local variable for org_apache_sling_scripting_core_impl_script_cache_impl_properties->org_apache_sling_scripting_cache_size
    config_node_property_integer_t *org_apache_sling_scripting_cache_size_local_nonprim = NULL;

    // define the local variable for org_apache_sling_scripting_core_impl_script_cache_impl_properties->org_apache_sling_scripting_cache_additional_extensions
    config_node_property_array_t *org_apache_sling_scripting_cache_additional_extensions_local_nonprim = NULL;

    // org_apache_sling_scripting_core_impl_script_cache_impl_properties->org_apache_sling_scripting_cache_size
    cJSON *org_apache_sling_scripting_cache_size = cJSON_GetObjectItemCaseSensitive(org_apache_sling_scripting_core_impl_script_cache_impl_propertiesJSON, "org.apache.sling.scripting.cache.size");
    if (cJSON_IsNull(org_apache_sling_scripting_cache_size)) {
        org_apache_sling_scripting_cache_size = NULL;
    }
    if (org_apache_sling_scripting_cache_size) { 
    org_apache_sling_scripting_cache_size_local_nonprim = config_node_property_integer_parseFromJSON(org_apache_sling_scripting_cache_size); //nonprimitive
    }

    // org_apache_sling_scripting_core_impl_script_cache_impl_properties->org_apache_sling_scripting_cache_additional_extensions
    cJSON *org_apache_sling_scripting_cache_additional_extensions = cJSON_GetObjectItemCaseSensitive(org_apache_sling_scripting_core_impl_script_cache_impl_propertiesJSON, "org.apache.sling.scripting.cache.additional_extensions");
    if (cJSON_IsNull(org_apache_sling_scripting_cache_additional_extensions)) {
        org_apache_sling_scripting_cache_additional_extensions = NULL;
    }
    if (org_apache_sling_scripting_cache_additional_extensions) { 
    org_apache_sling_scripting_cache_additional_extensions_local_nonprim = config_node_property_array_parseFromJSON(org_apache_sling_scripting_cache_additional_extensions); //nonprimitive
    }



    org_apache_sling_scripting_core_impl_script_cache_impl_properties_local_var = org_apache_sling_scripting_core_impl_script_cache_impl_properties_create_internal (
        org_apache_sling_scripting_cache_size ? org_apache_sling_scripting_cache_size_local_nonprim : NULL,
        org_apache_sling_scripting_cache_additional_extensions ? org_apache_sling_scripting_cache_additional_extensions_local_nonprim : NULL
        );

    if (!org_apache_sling_scripting_core_impl_script_cache_impl_properties_local_var) {
        goto end;
    }

    return org_apache_sling_scripting_core_impl_script_cache_impl_properties_local_var;
end:
    if (org_apache_sling_scripting_cache_size_local_nonprim) {
        config_node_property_integer_free(org_apache_sling_scripting_cache_size_local_nonprim);
        org_apache_sling_scripting_cache_size_local_nonprim = NULL;
    }
    if (org_apache_sling_scripting_cache_additional_extensions_local_nonprim) {
        config_node_property_array_free(org_apache_sling_scripting_cache_additional_extensions_local_nonprim);
        org_apache_sling_scripting_cache_additional_extensions_local_nonprim = NULL;
    }
    return NULL;

}
