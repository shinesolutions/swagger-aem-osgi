#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_caconfig_management_impl_configuration_management_setti_properties.h"



static org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_t *org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_create_internal(
    config_node_property_array_t *ignore_property_name_regex,
    config_node_property_array_t *config_collection_properties_resource_names
    ) {
    org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_t *org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_local_var = malloc(sizeof(org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_t));
    if (!org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_local_var, 0, sizeof(org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_t));
    org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_local_var->_library_owned = 1;
    org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_local_var->ignore_property_name_regex = ignore_property_name_regex;
    org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_local_var->config_collection_properties_resource_names = config_collection_properties_resource_names;
    return org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_t *org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_create(
    config_node_property_array_t *ignore_property_name_regex,
    config_node_property_array_t *config_collection_properties_resource_names
    ) {
    org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_t *result = org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_create_internal (
        ignore_property_name_regex,
        config_collection_properties_resource_names
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_free(org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_t *org_apache_sling_caconfig_management_impl_configuration_management_setti_properties) {
    if(NULL == org_apache_sling_caconfig_management_impl_configuration_management_setti_properties){
        return ;
    }
    if(org_apache_sling_caconfig_management_impl_configuration_management_setti_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_caconfig_management_impl_configuration_management_setti_properties->ignore_property_name_regex) {
        config_node_property_array_free(org_apache_sling_caconfig_management_impl_configuration_management_setti_properties->ignore_property_name_regex);
        org_apache_sling_caconfig_management_impl_configuration_management_setti_properties->ignore_property_name_regex = NULL;
    }
    if (org_apache_sling_caconfig_management_impl_configuration_management_setti_properties->config_collection_properties_resource_names) {
        config_node_property_array_free(org_apache_sling_caconfig_management_impl_configuration_management_setti_properties->config_collection_properties_resource_names);
        org_apache_sling_caconfig_management_impl_configuration_management_setti_properties->config_collection_properties_resource_names = NULL;
    }
    free(org_apache_sling_caconfig_management_impl_configuration_management_setti_properties);
}

cJSON *org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_convertToJSON(org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_t *org_apache_sling_caconfig_management_impl_configuration_management_setti_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_caconfig_management_impl_configuration_management_setti_properties->ignore_property_name_regex
    if(org_apache_sling_caconfig_management_impl_configuration_management_setti_properties->ignore_property_name_regex) {
    cJSON *ignore_property_name_regex_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_caconfig_management_impl_configuration_management_setti_properties->ignore_property_name_regex);
    if(ignore_property_name_regex_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ignorePropertyNameRegex", ignore_property_name_regex_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_caconfig_management_impl_configuration_management_setti_properties->config_collection_properties_resource_names
    if(org_apache_sling_caconfig_management_impl_configuration_management_setti_properties->config_collection_properties_resource_names) {
    cJSON *config_collection_properties_resource_names_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_caconfig_management_impl_configuration_management_setti_properties->config_collection_properties_resource_names);
    if(config_collection_properties_resource_names_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "configCollectionPropertiesResourceNames", config_collection_properties_resource_names_local_JSON);
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

org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_t *org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_parseFromJSON(cJSON *org_apache_sling_caconfig_management_impl_configuration_management_setti_propertiesJSON){

    org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_t *org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_local_var = NULL;

    // define the local variable for org_apache_sling_caconfig_management_impl_configuration_management_setti_properties->ignore_property_name_regex
    config_node_property_array_t *ignore_property_name_regex_local_nonprim = NULL;

    // define the local variable for org_apache_sling_caconfig_management_impl_configuration_management_setti_properties->config_collection_properties_resource_names
    config_node_property_array_t *config_collection_properties_resource_names_local_nonprim = NULL;

    // org_apache_sling_caconfig_management_impl_configuration_management_setti_properties->ignore_property_name_regex
    cJSON *ignore_property_name_regex = cJSON_GetObjectItemCaseSensitive(org_apache_sling_caconfig_management_impl_configuration_management_setti_propertiesJSON, "ignorePropertyNameRegex");
    if (cJSON_IsNull(ignore_property_name_regex)) {
        ignore_property_name_regex = NULL;
    }
    if (ignore_property_name_regex) { 
    ignore_property_name_regex_local_nonprim = config_node_property_array_parseFromJSON(ignore_property_name_regex); //nonprimitive
    }

    // org_apache_sling_caconfig_management_impl_configuration_management_setti_properties->config_collection_properties_resource_names
    cJSON *config_collection_properties_resource_names = cJSON_GetObjectItemCaseSensitive(org_apache_sling_caconfig_management_impl_configuration_management_setti_propertiesJSON, "configCollectionPropertiesResourceNames");
    if (cJSON_IsNull(config_collection_properties_resource_names)) {
        config_collection_properties_resource_names = NULL;
    }
    if (config_collection_properties_resource_names) { 
    config_collection_properties_resource_names_local_nonprim = config_node_property_array_parseFromJSON(config_collection_properties_resource_names); //nonprimitive
    }



    org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_local_var = org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_create_internal (
        ignore_property_name_regex ? ignore_property_name_regex_local_nonprim : NULL,
        config_collection_properties_resource_names ? config_collection_properties_resource_names_local_nonprim : NULL
        );

    if (!org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_local_var) {
        goto end;
    }

    return org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_local_var;
end:
    if (ignore_property_name_regex_local_nonprim) {
        config_node_property_array_free(ignore_property_name_regex_local_nonprim);
        ignore_property_name_regex_local_nonprim = NULL;
    }
    if (config_collection_properties_resource_names_local_nonprim) {
        config_node_property_array_free(config_collection_properties_resource_names_local_nonprim);
        config_collection_properties_resource_names_local_nonprim = NULL;
    }
    return NULL;

}
