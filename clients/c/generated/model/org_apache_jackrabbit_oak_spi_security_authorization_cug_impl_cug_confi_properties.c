#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties.h"



static org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_t *org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_create_internal(
    config_node_property_array_t *cug_supported_paths,
    config_node_property_boolean_t *cug_enabled,
    config_node_property_integer_t *configuration_ranking
    ) {
    org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_t *org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_t));
    if (!org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_t));
    org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_local_var->cug_supported_paths = cug_supported_paths;
    org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_local_var->cug_enabled = cug_enabled;
    org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_local_var->configuration_ranking = configuration_ranking;
    return org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_t *org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_create(
    config_node_property_array_t *cug_supported_paths,
    config_node_property_boolean_t *cug_enabled,
    config_node_property_integer_t *configuration_ranking
    ) {
    org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_t *result = org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_create_internal (
        cug_supported_paths,
        cug_enabled,
        configuration_ranking
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_free(org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_t *org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties) {
    if(NULL == org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->cug_supported_paths) {
        config_node_property_array_free(org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->cug_supported_paths);
        org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->cug_supported_paths = NULL;
    }
    if (org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->cug_enabled) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->cug_enabled);
        org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->cug_enabled = NULL;
    }
    if (org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->configuration_ranking) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->configuration_ranking);
        org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->configuration_ranking = NULL;
    }
    free(org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties);
}

cJSON *org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_convertToJSON(org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_t *org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->cug_supported_paths
    if(org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->cug_supported_paths) {
    cJSON *cug_supported_paths_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->cug_supported_paths);
    if(cug_supported_paths_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cugSupportedPaths", cug_supported_paths_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->cug_enabled
    if(org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->cug_enabled) {
    cJSON *cug_enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->cug_enabled);
    if(cug_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "cugEnabled", cug_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->configuration_ranking
    if(org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->configuration_ranking) {
    cJSON *configuration_ranking_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->configuration_ranking);
    if(configuration_ranking_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "configurationRanking", configuration_ranking_local_JSON);
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

org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_t *org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_propertiesJSON){

    org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_t *org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->cug_supported_paths
    config_node_property_array_t *cug_supported_paths_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->cug_enabled
    config_node_property_boolean_t *cug_enabled_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->configuration_ranking
    config_node_property_integer_t *configuration_ranking_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->cug_supported_paths
    cJSON *cug_supported_paths = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_propertiesJSON, "cugSupportedPaths");
    if (cJSON_IsNull(cug_supported_paths)) {
        cug_supported_paths = NULL;
    }
    if (cug_supported_paths) { 
    cug_supported_paths_local_nonprim = config_node_property_array_parseFromJSON(cug_supported_paths); //nonprimitive
    }

    // org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->cug_enabled
    cJSON *cug_enabled = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_propertiesJSON, "cugEnabled");
    if (cJSON_IsNull(cug_enabled)) {
        cug_enabled = NULL;
    }
    if (cug_enabled) { 
    cug_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(cug_enabled); //nonprimitive
    }

    // org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties->configuration_ranking
    cJSON *configuration_ranking = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_propertiesJSON, "configurationRanking");
    if (cJSON_IsNull(configuration_ranking)) {
        configuration_ranking = NULL;
    }
    if (configuration_ranking) { 
    configuration_ranking_local_nonprim = config_node_property_integer_parseFromJSON(configuration_ranking); //nonprimitive
    }



    org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_local_var = org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_create_internal (
        cug_supported_paths ? cug_supported_paths_local_nonprim : NULL,
        cug_enabled ? cug_enabled_local_nonprim : NULL,
        configuration_ranking ? configuration_ranking_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties_local_var;
end:
    if (cug_supported_paths_local_nonprim) {
        config_node_property_array_free(cug_supported_paths_local_nonprim);
        cug_supported_paths_local_nonprim = NULL;
    }
    if (cug_enabled_local_nonprim) {
        config_node_property_boolean_free(cug_enabled_local_nonprim);
        cug_enabled_local_nonprim = NULL;
    }
    if (configuration_ranking_local_nonprim) {
        config_node_property_integer_free(configuration_ranking_local_nonprim);
        configuration_ranking_local_nonprim = NULL;
    }
    return NULL;

}
