#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties.h"



static org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_t *org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_create_internal(
    config_node_property_boolean_t *enabled,
    config_node_property_array_t *config_property_inheritance_property_names
    ) {
    org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_t *org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_local_var = malloc(sizeof(org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_t));
    if (!org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_local_var, 0, sizeof(org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_t));
    org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_local_var->_library_owned = 1;
    org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_local_var->enabled = enabled;
    org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_local_var->config_property_inheritance_property_names = config_property_inheritance_property_names;
    return org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_t *org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_create(
    config_node_property_boolean_t *enabled,
    config_node_property_array_t *config_property_inheritance_property_names
    ) {
    org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_t *result = org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_create_internal (
        enabled,
        config_property_inheritance_property_names
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_free(org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_t *org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties) {
    if(NULL == org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties){
        return ;
    }
    if(org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties->enabled) {
        config_node_property_boolean_free(org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties->enabled);
        org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties->enabled = NULL;
    }
    if (org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties->config_property_inheritance_property_names) {
        config_node_property_array_free(org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties->config_property_inheritance_property_names);
        org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties->config_property_inheritance_property_names = NULL;
    }
    free(org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties);
}

cJSON *org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_convertToJSON(org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_t *org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties->enabled
    if(org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties->enabled) {
    cJSON *enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties->enabled);
    if(enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "enabled", enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties->config_property_inheritance_property_names
    if(org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties->config_property_inheritance_property_names) {
    cJSON *config_property_inheritance_property_names_local_JSON = config_node_property_array_convertToJSON(org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties->config_property_inheritance_property_names);
    if(config_property_inheritance_property_names_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "configPropertyInheritancePropertyNames", config_property_inheritance_property_names_local_JSON);
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

org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_t *org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_parseFromJSON(cJSON *org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_propertiesJSON){

    org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_t *org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_local_var = NULL;

    // define the local variable for org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties->enabled
    config_node_property_boolean_t *enabled_local_nonprim = NULL;

    // define the local variable for org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties->config_property_inheritance_property_names
    config_node_property_array_t *config_property_inheritance_property_names_local_nonprim = NULL;

    // org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties->enabled
    cJSON *enabled = cJSON_GetObjectItemCaseSensitive(org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_propertiesJSON, "enabled");
    if (cJSON_IsNull(enabled)) {
        enabled = NULL;
    }
    if (enabled) { 
    enabled_local_nonprim = config_node_property_boolean_parseFromJSON(enabled); //nonprimitive
    }

    // org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties->config_property_inheritance_property_names
    cJSON *config_property_inheritance_property_names = cJSON_GetObjectItemCaseSensitive(org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_propertiesJSON, "configPropertyInheritancePropertyNames");
    if (cJSON_IsNull(config_property_inheritance_property_names)) {
        config_property_inheritance_property_names = NULL;
    }
    if (config_property_inheritance_property_names) { 
    config_property_inheritance_property_names_local_nonprim = config_node_property_array_parseFromJSON(config_property_inheritance_property_names); //nonprimitive
    }



    org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_local_var = org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_create_internal (
        enabled ? enabled_local_nonprim : NULL,
        config_property_inheritance_property_names ? config_property_inheritance_property_names_local_nonprim : NULL
        );

    if (!org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_local_var) {
        goto end;
    }

    return org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties_local_var;
end:
    if (enabled_local_nonprim) {
        config_node_property_boolean_free(enabled_local_nonprim);
        enabled_local_nonprim = NULL;
    }
    if (config_property_inheritance_property_names_local_nonprim) {
        config_node_property_array_free(config_property_inheritance_property_names_local_nonprim);
        config_property_inheritance_property_names_local_nonprim = NULL;
    }
    return NULL;

}
