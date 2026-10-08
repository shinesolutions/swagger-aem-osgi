#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties.h"



static com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_t *com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_create_internal(
    config_node_property_string_t *provider_roots
    ) {
    com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_t *com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_local_var = malloc(sizeof(com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_t));
    if (!com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_local_var, 0, sizeof(com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_t));
    com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_local_var->_library_owned = 1;
    com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_local_var->provider_roots = provider_roots;
    return com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_t *com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_create(
    config_node_property_string_t *provider_roots
    ) {
    com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_t *result = com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_create_internal (
        provider_roots
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_free(com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_t *com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties) {
    if(NULL == com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties){
        return ;
    }
    if(com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties->provider_roots) {
        config_node_property_string_free(com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties->provider_roots);
        com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties->provider_roots = NULL;
    }
    free(com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties);
}

cJSON *com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_convertToJSON(com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_t *com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties->provider_roots
    if(com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties->provider_roots) {
    cJSON *provider_roots_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties->provider_roots);
    if(provider_roots_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "provider.roots", provider_roots_local_JSON);
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

com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_t *com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_parseFromJSON(cJSON *com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_propertiesJSON){

    com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_t *com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties->provider_roots
    config_node_property_string_t *provider_roots_local_nonprim = NULL;

    // com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties->provider_roots
    cJSON *provider_roots = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_propertiesJSON, "provider.roots");
    if (cJSON_IsNull(provider_roots)) {
        provider_roots = NULL;
    }
    if (provider_roots) { 
    provider_roots_local_nonprim = config_node_property_string_parseFromJSON(provider_roots); //nonprimitive
    }



    com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_local_var = com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_create_internal (
        provider_roots ? provider_roots_local_nonprim : NULL
        );

    if (!com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_properties_local_var;
end:
    if (provider_roots_local_nonprim) {
        config_node_property_string_free(provider_roots_local_nonprim);
        provider_roots_local_nonprim = NULL;
    }
    return NULL;

}
