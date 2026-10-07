#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_felix_jaas_configuration_spi_properties.h"



static org_apache_felix_jaas_configuration_spi_properties_t *org_apache_felix_jaas_configuration_spi_properties_create_internal(
    config_node_property_string_t *jaas_default_realm_name,
    config_node_property_string_t *jaas_config_provider_name,
    config_node_property_drop_down_t *jaas_global_config_policy
    ) {
    org_apache_felix_jaas_configuration_spi_properties_t *org_apache_felix_jaas_configuration_spi_properties_local_var = malloc(sizeof(org_apache_felix_jaas_configuration_spi_properties_t));
    if (!org_apache_felix_jaas_configuration_spi_properties_local_var) {
        return NULL;
    }
    memset(org_apache_felix_jaas_configuration_spi_properties_local_var, 0, sizeof(org_apache_felix_jaas_configuration_spi_properties_t));
    org_apache_felix_jaas_configuration_spi_properties_local_var->_library_owned = 1;
    org_apache_felix_jaas_configuration_spi_properties_local_var->jaas_default_realm_name = jaas_default_realm_name;
    org_apache_felix_jaas_configuration_spi_properties_local_var->jaas_config_provider_name = jaas_config_provider_name;
    org_apache_felix_jaas_configuration_spi_properties_local_var->jaas_global_config_policy = jaas_global_config_policy;
    return org_apache_felix_jaas_configuration_spi_properties_local_var;
}

__attribute__((deprecated)) org_apache_felix_jaas_configuration_spi_properties_t *org_apache_felix_jaas_configuration_spi_properties_create(
    config_node_property_string_t *jaas_default_realm_name,
    config_node_property_string_t *jaas_config_provider_name,
    config_node_property_drop_down_t *jaas_global_config_policy
    ) {
    org_apache_felix_jaas_configuration_spi_properties_t *result = org_apache_felix_jaas_configuration_spi_properties_create_internal (
        jaas_default_realm_name,
        jaas_config_provider_name,
        jaas_global_config_policy
        );
    if (!result) {
    }
    return result;
}

void org_apache_felix_jaas_configuration_spi_properties_free(org_apache_felix_jaas_configuration_spi_properties_t *org_apache_felix_jaas_configuration_spi_properties) {
    if(NULL == org_apache_felix_jaas_configuration_spi_properties){
        return ;
    }
    if(org_apache_felix_jaas_configuration_spi_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_felix_jaas_configuration_spi_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_felix_jaas_configuration_spi_properties->jaas_default_realm_name) {
        config_node_property_string_free(org_apache_felix_jaas_configuration_spi_properties->jaas_default_realm_name);
        org_apache_felix_jaas_configuration_spi_properties->jaas_default_realm_name = NULL;
    }
    if (org_apache_felix_jaas_configuration_spi_properties->jaas_config_provider_name) {
        config_node_property_string_free(org_apache_felix_jaas_configuration_spi_properties->jaas_config_provider_name);
        org_apache_felix_jaas_configuration_spi_properties->jaas_config_provider_name = NULL;
    }
    if (org_apache_felix_jaas_configuration_spi_properties->jaas_global_config_policy) {
        config_node_property_drop_down_free(org_apache_felix_jaas_configuration_spi_properties->jaas_global_config_policy);
        org_apache_felix_jaas_configuration_spi_properties->jaas_global_config_policy = NULL;
    }
    free(org_apache_felix_jaas_configuration_spi_properties);
}

cJSON *org_apache_felix_jaas_configuration_spi_properties_convertToJSON(org_apache_felix_jaas_configuration_spi_properties_t *org_apache_felix_jaas_configuration_spi_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_felix_jaas_configuration_spi_properties->jaas_default_realm_name
    if(org_apache_felix_jaas_configuration_spi_properties->jaas_default_realm_name) {
    cJSON *jaas_default_realm_name_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_jaas_configuration_spi_properties->jaas_default_realm_name);
    if(jaas_default_realm_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jaas.defaultRealmName", jaas_default_realm_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_jaas_configuration_spi_properties->jaas_config_provider_name
    if(org_apache_felix_jaas_configuration_spi_properties->jaas_config_provider_name) {
    cJSON *jaas_config_provider_name_local_JSON = config_node_property_string_convertToJSON(org_apache_felix_jaas_configuration_spi_properties->jaas_config_provider_name);
    if(jaas_config_provider_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jaas.configProviderName", jaas_config_provider_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_jaas_configuration_spi_properties->jaas_global_config_policy
    if(org_apache_felix_jaas_configuration_spi_properties->jaas_global_config_policy) {
    cJSON *jaas_global_config_policy_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_felix_jaas_configuration_spi_properties->jaas_global_config_policy);
    if(jaas_global_config_policy_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "jaas.globalConfigPolicy", jaas_global_config_policy_local_JSON);
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

org_apache_felix_jaas_configuration_spi_properties_t *org_apache_felix_jaas_configuration_spi_properties_parseFromJSON(cJSON *org_apache_felix_jaas_configuration_spi_propertiesJSON){

    org_apache_felix_jaas_configuration_spi_properties_t *org_apache_felix_jaas_configuration_spi_properties_local_var = NULL;

    // define the local variable for org_apache_felix_jaas_configuration_spi_properties->jaas_default_realm_name
    config_node_property_string_t *jaas_default_realm_name_local_nonprim = NULL;

    // define the local variable for org_apache_felix_jaas_configuration_spi_properties->jaas_config_provider_name
    config_node_property_string_t *jaas_config_provider_name_local_nonprim = NULL;

    // define the local variable for org_apache_felix_jaas_configuration_spi_properties->jaas_global_config_policy
    config_node_property_drop_down_t *jaas_global_config_policy_local_nonprim = NULL;

    // org_apache_felix_jaas_configuration_spi_properties->jaas_default_realm_name
    cJSON *jaas_default_realm_name = cJSON_GetObjectItemCaseSensitive(org_apache_felix_jaas_configuration_spi_propertiesJSON, "jaas.defaultRealmName");
    if (cJSON_IsNull(jaas_default_realm_name)) {
        jaas_default_realm_name = NULL;
    }
    if (jaas_default_realm_name) { 
    jaas_default_realm_name_local_nonprim = config_node_property_string_parseFromJSON(jaas_default_realm_name); //nonprimitive
    }

    // org_apache_felix_jaas_configuration_spi_properties->jaas_config_provider_name
    cJSON *jaas_config_provider_name = cJSON_GetObjectItemCaseSensitive(org_apache_felix_jaas_configuration_spi_propertiesJSON, "jaas.configProviderName");
    if (cJSON_IsNull(jaas_config_provider_name)) {
        jaas_config_provider_name = NULL;
    }
    if (jaas_config_provider_name) { 
    jaas_config_provider_name_local_nonprim = config_node_property_string_parseFromJSON(jaas_config_provider_name); //nonprimitive
    }

    // org_apache_felix_jaas_configuration_spi_properties->jaas_global_config_policy
    cJSON *jaas_global_config_policy = cJSON_GetObjectItemCaseSensitive(org_apache_felix_jaas_configuration_spi_propertiesJSON, "jaas.globalConfigPolicy");
    if (cJSON_IsNull(jaas_global_config_policy)) {
        jaas_global_config_policy = NULL;
    }
    if (jaas_global_config_policy) { 
    jaas_global_config_policy_local_nonprim = config_node_property_drop_down_parseFromJSON(jaas_global_config_policy); //nonprimitive
    }



    org_apache_felix_jaas_configuration_spi_properties_local_var = org_apache_felix_jaas_configuration_spi_properties_create_internal (
        jaas_default_realm_name ? jaas_default_realm_name_local_nonprim : NULL,
        jaas_config_provider_name ? jaas_config_provider_name_local_nonprim : NULL,
        jaas_global_config_policy ? jaas_global_config_policy_local_nonprim : NULL
        );

    if (!org_apache_felix_jaas_configuration_spi_properties_local_var) {
        goto end;
    }

    return org_apache_felix_jaas_configuration_spi_properties_local_var;
end:
    if (jaas_default_realm_name_local_nonprim) {
        config_node_property_string_free(jaas_default_realm_name_local_nonprim);
        jaas_default_realm_name_local_nonprim = NULL;
    }
    if (jaas_config_provider_name_local_nonprim) {
        config_node_property_string_free(jaas_config_provider_name_local_nonprim);
        jaas_config_provider_name_local_nonprim = NULL;
    }
    if (jaas_global_config_policy_local_nonprim) {
        config_node_property_drop_down_free(jaas_global_config_policy_local_nonprim);
        jaas_global_config_policy_local_nonprim = NULL;
    }
    return NULL;

}
