#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_distribution_resources_impl_distribution_configuration_properties.h"



static org_apache_sling_distribution_resources_impl_distribution_configuration_properties_t *org_apache_sling_distribution_resources_impl_distribution_configuration_properties_create_internal(
    config_node_property_string_t *provider_roots,
    config_node_property_string_t *kind
    ) {
    org_apache_sling_distribution_resources_impl_distribution_configuration_properties_t *org_apache_sling_distribution_resources_impl_distribution_configuration_properties_local_var = malloc(sizeof(org_apache_sling_distribution_resources_impl_distribution_configuration_properties_t));
    if (!org_apache_sling_distribution_resources_impl_distribution_configuration_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_distribution_resources_impl_distribution_configuration_properties_local_var, 0, sizeof(org_apache_sling_distribution_resources_impl_distribution_configuration_properties_t));
    org_apache_sling_distribution_resources_impl_distribution_configuration_properties_local_var->_library_owned = 1;
    org_apache_sling_distribution_resources_impl_distribution_configuration_properties_local_var->provider_roots = provider_roots;
    org_apache_sling_distribution_resources_impl_distribution_configuration_properties_local_var->kind = kind;
    return org_apache_sling_distribution_resources_impl_distribution_configuration_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_distribution_resources_impl_distribution_configuration_properties_t *org_apache_sling_distribution_resources_impl_distribution_configuration_properties_create(
    config_node_property_string_t *provider_roots,
    config_node_property_string_t *kind
    ) {
    org_apache_sling_distribution_resources_impl_distribution_configuration_properties_t *result = org_apache_sling_distribution_resources_impl_distribution_configuration_properties_create_internal (
        provider_roots,
        kind
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_distribution_resources_impl_distribution_configuration_properties_free(org_apache_sling_distribution_resources_impl_distribution_configuration_properties_t *org_apache_sling_distribution_resources_impl_distribution_configuration_properties) {
    if(NULL == org_apache_sling_distribution_resources_impl_distribution_configuration_properties){
        return ;
    }
    if(org_apache_sling_distribution_resources_impl_distribution_configuration_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_distribution_resources_impl_distribution_configuration_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_distribution_resources_impl_distribution_configuration_properties->provider_roots) {
        config_node_property_string_free(org_apache_sling_distribution_resources_impl_distribution_configuration_properties->provider_roots);
        org_apache_sling_distribution_resources_impl_distribution_configuration_properties->provider_roots = NULL;
    }
    if (org_apache_sling_distribution_resources_impl_distribution_configuration_properties->kind) {
        config_node_property_string_free(org_apache_sling_distribution_resources_impl_distribution_configuration_properties->kind);
        org_apache_sling_distribution_resources_impl_distribution_configuration_properties->kind = NULL;
    }
    free(org_apache_sling_distribution_resources_impl_distribution_configuration_properties);
}

cJSON *org_apache_sling_distribution_resources_impl_distribution_configuration_properties_convertToJSON(org_apache_sling_distribution_resources_impl_distribution_configuration_properties_t *org_apache_sling_distribution_resources_impl_distribution_configuration_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_distribution_resources_impl_distribution_configuration_properties->provider_roots
    if(org_apache_sling_distribution_resources_impl_distribution_configuration_properties->provider_roots) {
    cJSON *provider_roots_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_resources_impl_distribution_configuration_properties->provider_roots);
    if(provider_roots_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "provider.roots", provider_roots_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_distribution_resources_impl_distribution_configuration_properties->kind
    if(org_apache_sling_distribution_resources_impl_distribution_configuration_properties->kind) {
    cJSON *kind_local_JSON = config_node_property_string_convertToJSON(org_apache_sling_distribution_resources_impl_distribution_configuration_properties->kind);
    if(kind_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "kind", kind_local_JSON);
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

org_apache_sling_distribution_resources_impl_distribution_configuration_properties_t *org_apache_sling_distribution_resources_impl_distribution_configuration_properties_parseFromJSON(cJSON *org_apache_sling_distribution_resources_impl_distribution_configuration_propertiesJSON){

    org_apache_sling_distribution_resources_impl_distribution_configuration_properties_t *org_apache_sling_distribution_resources_impl_distribution_configuration_properties_local_var = NULL;

    // define the local variable for org_apache_sling_distribution_resources_impl_distribution_configuration_properties->provider_roots
    config_node_property_string_t *provider_roots_local_nonprim = NULL;

    // define the local variable for org_apache_sling_distribution_resources_impl_distribution_configuration_properties->kind
    config_node_property_string_t *kind_local_nonprim = NULL;

    // org_apache_sling_distribution_resources_impl_distribution_configuration_properties->provider_roots
    cJSON *provider_roots = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_resources_impl_distribution_configuration_propertiesJSON, "provider.roots");
    if (cJSON_IsNull(provider_roots)) {
        provider_roots = NULL;
    }
    if (provider_roots) { 
    provider_roots_local_nonprim = config_node_property_string_parseFromJSON(provider_roots); //nonprimitive
    }

    // org_apache_sling_distribution_resources_impl_distribution_configuration_properties->kind
    cJSON *kind = cJSON_GetObjectItemCaseSensitive(org_apache_sling_distribution_resources_impl_distribution_configuration_propertiesJSON, "kind");
    if (cJSON_IsNull(kind)) {
        kind = NULL;
    }
    if (kind) { 
    kind_local_nonprim = config_node_property_string_parseFromJSON(kind); //nonprimitive
    }



    org_apache_sling_distribution_resources_impl_distribution_configuration_properties_local_var = org_apache_sling_distribution_resources_impl_distribution_configuration_properties_create_internal (
        provider_roots ? provider_roots_local_nonprim : NULL,
        kind ? kind_local_nonprim : NULL
        );

    if (!org_apache_sling_distribution_resources_impl_distribution_configuration_properties_local_var) {
        goto end;
    }

    return org_apache_sling_distribution_resources_impl_distribution_configuration_properties_local_var;
end:
    if (provider_roots_local_nonprim) {
        config_node_property_string_free(provider_roots_local_nonprim);
        provider_roots_local_nonprim = NULL;
    }
    if (kind_local_nonprim) {
        config_node_property_string_free(kind_local_nonprim);
        kind_local_nonprim = NULL;
    }
    return NULL;

}
