#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_security_authentication_authentication_config_properties.h"



static org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_t *org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_create_internal(
    config_node_property_string_t *org_apache_jackrabbit_oak_authentication_app_name,
    config_node_property_string_t *org_apache_jackrabbit_oak_authentication_config_spi_name
    ) {
    org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_t *org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_t));
    if (!org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_t));
    org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_local_var->org_apache_jackrabbit_oak_authentication_app_name = org_apache_jackrabbit_oak_authentication_app_name;
    org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_local_var->org_apache_jackrabbit_oak_authentication_config_spi_name = org_apache_jackrabbit_oak_authentication_config_spi_name;
    return org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_t *org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_create(
    config_node_property_string_t *org_apache_jackrabbit_oak_authentication_app_name,
    config_node_property_string_t *org_apache_jackrabbit_oak_authentication_config_spi_name
    ) {
    org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_t *result = org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_create_internal (
        org_apache_jackrabbit_oak_authentication_app_name,
        org_apache_jackrabbit_oak_authentication_config_spi_name
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_free(org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_t *org_apache_jackrabbit_oak_security_authentication_authentication_config_properties) {
    if(NULL == org_apache_jackrabbit_oak_security_authentication_authentication_config_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_security_authentication_authentication_config_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_security_authentication_authentication_config_properties->org_apache_jackrabbit_oak_authentication_app_name) {
        config_node_property_string_free(org_apache_jackrabbit_oak_security_authentication_authentication_config_properties->org_apache_jackrabbit_oak_authentication_app_name);
        org_apache_jackrabbit_oak_security_authentication_authentication_config_properties->org_apache_jackrabbit_oak_authentication_app_name = NULL;
    }
    if (org_apache_jackrabbit_oak_security_authentication_authentication_config_properties->org_apache_jackrabbit_oak_authentication_config_spi_name) {
        config_node_property_string_free(org_apache_jackrabbit_oak_security_authentication_authentication_config_properties->org_apache_jackrabbit_oak_authentication_config_spi_name);
        org_apache_jackrabbit_oak_security_authentication_authentication_config_properties->org_apache_jackrabbit_oak_authentication_config_spi_name = NULL;
    }
    free(org_apache_jackrabbit_oak_security_authentication_authentication_config_properties);
}

cJSON *org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_convertToJSON(org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_t *org_apache_jackrabbit_oak_security_authentication_authentication_config_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_security_authentication_authentication_config_properties->org_apache_jackrabbit_oak_authentication_app_name
    if(org_apache_jackrabbit_oak_security_authentication_authentication_config_properties->org_apache_jackrabbit_oak_authentication_app_name) {
    cJSON *org_apache_jackrabbit_oak_authentication_app_name_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_security_authentication_authentication_config_properties->org_apache_jackrabbit_oak_authentication_app_name);
    if(org_apache_jackrabbit_oak_authentication_app_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.jackrabbit.oak.authentication.appName", org_apache_jackrabbit_oak_authentication_app_name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_security_authentication_authentication_config_properties->org_apache_jackrabbit_oak_authentication_config_spi_name
    if(org_apache_jackrabbit_oak_security_authentication_authentication_config_properties->org_apache_jackrabbit_oak_authentication_config_spi_name) {
    cJSON *org_apache_jackrabbit_oak_authentication_config_spi_name_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_security_authentication_authentication_config_properties->org_apache_jackrabbit_oak_authentication_config_spi_name);
    if(org_apache_jackrabbit_oak_authentication_config_spi_name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.jackrabbit.oak.authentication.configSpiName", org_apache_jackrabbit_oak_authentication_config_spi_name_local_JSON);
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

org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_t *org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_security_authentication_authentication_config_propertiesJSON){

    org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_t *org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_authentication_config_properties->org_apache_jackrabbit_oak_authentication_app_name
    config_node_property_string_t *org_apache_jackrabbit_oak_authentication_app_name_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_security_authentication_authentication_config_properties->org_apache_jackrabbit_oak_authentication_config_spi_name
    config_node_property_string_t *org_apache_jackrabbit_oak_authentication_config_spi_name_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_security_authentication_authentication_config_properties->org_apache_jackrabbit_oak_authentication_app_name
    cJSON *org_apache_jackrabbit_oak_authentication_app_name = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_authentication_config_propertiesJSON, "org.apache.jackrabbit.oak.authentication.appName");
    if (cJSON_IsNull(org_apache_jackrabbit_oak_authentication_app_name)) {
        org_apache_jackrabbit_oak_authentication_app_name = NULL;
    }
    if (org_apache_jackrabbit_oak_authentication_app_name) { 
    org_apache_jackrabbit_oak_authentication_app_name_local_nonprim = config_node_property_string_parseFromJSON(org_apache_jackrabbit_oak_authentication_app_name); //nonprimitive
    }

    // org_apache_jackrabbit_oak_security_authentication_authentication_config_properties->org_apache_jackrabbit_oak_authentication_config_spi_name
    cJSON *org_apache_jackrabbit_oak_authentication_config_spi_name = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_security_authentication_authentication_config_propertiesJSON, "org.apache.jackrabbit.oak.authentication.configSpiName");
    if (cJSON_IsNull(org_apache_jackrabbit_oak_authentication_config_spi_name)) {
        org_apache_jackrabbit_oak_authentication_config_spi_name = NULL;
    }
    if (org_apache_jackrabbit_oak_authentication_config_spi_name) { 
    org_apache_jackrabbit_oak_authentication_config_spi_name_local_nonprim = config_node_property_string_parseFromJSON(org_apache_jackrabbit_oak_authentication_config_spi_name); //nonprimitive
    }



    org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_local_var = org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_create_internal (
        org_apache_jackrabbit_oak_authentication_app_name ? org_apache_jackrabbit_oak_authentication_app_name_local_nonprim : NULL,
        org_apache_jackrabbit_oak_authentication_config_spi_name ? org_apache_jackrabbit_oak_authentication_config_spi_name_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_security_authentication_authentication_config_properties_local_var;
end:
    if (org_apache_jackrabbit_oak_authentication_app_name_local_nonprim) {
        config_node_property_string_free(org_apache_jackrabbit_oak_authentication_app_name_local_nonprim);
        org_apache_jackrabbit_oak_authentication_app_name_local_nonprim = NULL;
    }
    if (org_apache_jackrabbit_oak_authentication_config_spi_name_local_nonprim) {
        config_node_property_string_free(org_apache_jackrabbit_oak_authentication_config_spi_name_local_nonprim);
        org_apache_jackrabbit_oak_authentication_config_spi_name_local_nonprim = NULL;
    }
    return NULL;

}
