#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties.h"



static com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_t *com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_create_internal(
    config_node_property_integer_t *com_adobe_granite_jetty_ssl_port,
    config_node_property_string_t *com_adobe_granite_jetty_ssl_keystore_user,
    config_node_property_string_t *com_adobe_granite_jetty_ssl_keystore_password,
    config_node_property_array_t *com_adobe_granite_jetty_ssl_ciphersuites_excluded,
    config_node_property_array_t *com_adobe_granite_jetty_ssl_ciphersuites_included,
    config_node_property_drop_down_t *com_adobe_granite_jetty_ssl_client_certificate
    ) {
    com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_t *com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_local_var = malloc(sizeof(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_t));
    if (!com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_local_var, 0, sizeof(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_t));
    com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_local_var->_library_owned = 1;
    com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_local_var->com_adobe_granite_jetty_ssl_port = com_adobe_granite_jetty_ssl_port;
    com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_local_var->com_adobe_granite_jetty_ssl_keystore_user = com_adobe_granite_jetty_ssl_keystore_user;
    com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_local_var->com_adobe_granite_jetty_ssl_keystore_password = com_adobe_granite_jetty_ssl_keystore_password;
    com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_local_var->com_adobe_granite_jetty_ssl_ciphersuites_excluded = com_adobe_granite_jetty_ssl_ciphersuites_excluded;
    com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_local_var->com_adobe_granite_jetty_ssl_ciphersuites_included = com_adobe_granite_jetty_ssl_ciphersuites_included;
    com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_local_var->com_adobe_granite_jetty_ssl_client_certificate = com_adobe_granite_jetty_ssl_client_certificate;
    return com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_t *com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_create(
    config_node_property_integer_t *com_adobe_granite_jetty_ssl_port,
    config_node_property_string_t *com_adobe_granite_jetty_ssl_keystore_user,
    config_node_property_string_t *com_adobe_granite_jetty_ssl_keystore_password,
    config_node_property_array_t *com_adobe_granite_jetty_ssl_ciphersuites_excluded,
    config_node_property_array_t *com_adobe_granite_jetty_ssl_ciphersuites_included,
    config_node_property_drop_down_t *com_adobe_granite_jetty_ssl_client_certificate
    ) {
    com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_t *result = com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_create_internal (
        com_adobe_granite_jetty_ssl_port,
        com_adobe_granite_jetty_ssl_keystore_user,
        com_adobe_granite_jetty_ssl_keystore_password,
        com_adobe_granite_jetty_ssl_ciphersuites_excluded,
        com_adobe_granite_jetty_ssl_ciphersuites_included,
        com_adobe_granite_jetty_ssl_client_certificate
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_free(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_t *com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties) {
    if(NULL == com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties){
        return ;
    }
    if(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_port) {
        config_node_property_integer_free(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_port);
        com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_port = NULL;
    }
    if (com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_keystore_user) {
        config_node_property_string_free(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_keystore_user);
        com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_keystore_user = NULL;
    }
    if (com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_keystore_password) {
        config_node_property_string_free(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_keystore_password);
        com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_keystore_password = NULL;
    }
    if (com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_ciphersuites_excluded) {
        config_node_property_array_free(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_ciphersuites_excluded);
        com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_ciphersuites_excluded = NULL;
    }
    if (com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_ciphersuites_included) {
        config_node_property_array_free(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_ciphersuites_included);
        com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_ciphersuites_included = NULL;
    }
    if (com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_client_certificate) {
        config_node_property_drop_down_free(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_client_certificate);
        com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_client_certificate = NULL;
    }
    free(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties);
}

cJSON *com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_convertToJSON(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_t *com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_port
    if(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_port) {
    cJSON *com_adobe_granite_jetty_ssl_port_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_port);
    if(com_adobe_granite_jetty_ssl_port_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.granite.jetty.ssl.port", com_adobe_granite_jetty_ssl_port_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_keystore_user
    if(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_keystore_user) {
    cJSON *com_adobe_granite_jetty_ssl_keystore_user_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_keystore_user);
    if(com_adobe_granite_jetty_ssl_keystore_user_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.granite.jetty.ssl.keystore.user", com_adobe_granite_jetty_ssl_keystore_user_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_keystore_password
    if(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_keystore_password) {
    cJSON *com_adobe_granite_jetty_ssl_keystore_password_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_keystore_password);
    if(com_adobe_granite_jetty_ssl_keystore_password_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.granite.jetty.ssl.keystore.password", com_adobe_granite_jetty_ssl_keystore_password_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_ciphersuites_excluded
    if(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_ciphersuites_excluded) {
    cJSON *com_adobe_granite_jetty_ssl_ciphersuites_excluded_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_ciphersuites_excluded);
    if(com_adobe_granite_jetty_ssl_ciphersuites_excluded_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.granite.jetty.ssl.ciphersuites.excluded", com_adobe_granite_jetty_ssl_ciphersuites_excluded_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_ciphersuites_included
    if(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_ciphersuites_included) {
    cJSON *com_adobe_granite_jetty_ssl_ciphersuites_included_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_ciphersuites_included);
    if(com_adobe_granite_jetty_ssl_ciphersuites_included_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.granite.jetty.ssl.ciphersuites.included", com_adobe_granite_jetty_ssl_ciphersuites_included_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_client_certificate
    if(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_client_certificate) {
    cJSON *com_adobe_granite_jetty_ssl_client_certificate_local_JSON = config_node_property_drop_down_convertToJSON(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_client_certificate);
    if(com_adobe_granite_jetty_ssl_client_certificate_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "com.adobe.granite.jetty.ssl.client.certificate", com_adobe_granite_jetty_ssl_client_certificate_local_JSON);
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

com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_t *com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_parseFromJSON(cJSON *com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_propertiesJSON){

    com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_t *com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_port
    config_node_property_integer_t *com_adobe_granite_jetty_ssl_port_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_keystore_user
    config_node_property_string_t *com_adobe_granite_jetty_ssl_keystore_user_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_keystore_password
    config_node_property_string_t *com_adobe_granite_jetty_ssl_keystore_password_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_ciphersuites_excluded
    config_node_property_array_t *com_adobe_granite_jetty_ssl_ciphersuites_excluded_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_ciphersuites_included
    config_node_property_array_t *com_adobe_granite_jetty_ssl_ciphersuites_included_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_client_certificate
    config_node_property_drop_down_t *com_adobe_granite_jetty_ssl_client_certificate_local_nonprim = NULL;

    // com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_port
    cJSON *com_adobe_granite_jetty_ssl_port = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_propertiesJSON, "com.adobe.granite.jetty.ssl.port");
    if (cJSON_IsNull(com_adobe_granite_jetty_ssl_port)) {
        com_adobe_granite_jetty_ssl_port = NULL;
    }
    if (com_adobe_granite_jetty_ssl_port) { 
    com_adobe_granite_jetty_ssl_port_local_nonprim = config_node_property_integer_parseFromJSON(com_adobe_granite_jetty_ssl_port); //nonprimitive
    }

    // com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_keystore_user
    cJSON *com_adobe_granite_jetty_ssl_keystore_user = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_propertiesJSON, "com.adobe.granite.jetty.ssl.keystore.user");
    if (cJSON_IsNull(com_adobe_granite_jetty_ssl_keystore_user)) {
        com_adobe_granite_jetty_ssl_keystore_user = NULL;
    }
    if (com_adobe_granite_jetty_ssl_keystore_user) { 
    com_adobe_granite_jetty_ssl_keystore_user_local_nonprim = config_node_property_string_parseFromJSON(com_adobe_granite_jetty_ssl_keystore_user); //nonprimitive
    }

    // com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_keystore_password
    cJSON *com_adobe_granite_jetty_ssl_keystore_password = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_propertiesJSON, "com.adobe.granite.jetty.ssl.keystore.password");
    if (cJSON_IsNull(com_adobe_granite_jetty_ssl_keystore_password)) {
        com_adobe_granite_jetty_ssl_keystore_password = NULL;
    }
    if (com_adobe_granite_jetty_ssl_keystore_password) { 
    com_adobe_granite_jetty_ssl_keystore_password_local_nonprim = config_node_property_string_parseFromJSON(com_adobe_granite_jetty_ssl_keystore_password); //nonprimitive
    }

    // com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_ciphersuites_excluded
    cJSON *com_adobe_granite_jetty_ssl_ciphersuites_excluded = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_propertiesJSON, "com.adobe.granite.jetty.ssl.ciphersuites.excluded");
    if (cJSON_IsNull(com_adobe_granite_jetty_ssl_ciphersuites_excluded)) {
        com_adobe_granite_jetty_ssl_ciphersuites_excluded = NULL;
    }
    if (com_adobe_granite_jetty_ssl_ciphersuites_excluded) { 
    com_adobe_granite_jetty_ssl_ciphersuites_excluded_local_nonprim = config_node_property_array_parseFromJSON(com_adobe_granite_jetty_ssl_ciphersuites_excluded); //nonprimitive
    }

    // com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_ciphersuites_included
    cJSON *com_adobe_granite_jetty_ssl_ciphersuites_included = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_propertiesJSON, "com.adobe.granite.jetty.ssl.ciphersuites.included");
    if (cJSON_IsNull(com_adobe_granite_jetty_ssl_ciphersuites_included)) {
        com_adobe_granite_jetty_ssl_ciphersuites_included = NULL;
    }
    if (com_adobe_granite_jetty_ssl_ciphersuites_included) { 
    com_adobe_granite_jetty_ssl_ciphersuites_included_local_nonprim = config_node_property_array_parseFromJSON(com_adobe_granite_jetty_ssl_ciphersuites_included); //nonprimitive
    }

    // com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties->com_adobe_granite_jetty_ssl_client_certificate
    cJSON *com_adobe_granite_jetty_ssl_client_certificate = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_propertiesJSON, "com.adobe.granite.jetty.ssl.client.certificate");
    if (cJSON_IsNull(com_adobe_granite_jetty_ssl_client_certificate)) {
        com_adobe_granite_jetty_ssl_client_certificate = NULL;
    }
    if (com_adobe_granite_jetty_ssl_client_certificate) { 
    com_adobe_granite_jetty_ssl_client_certificate_local_nonprim = config_node_property_drop_down_parseFromJSON(com_adobe_granite_jetty_ssl_client_certificate); //nonprimitive
    }



    com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_local_var = com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_create_internal (
        com_adobe_granite_jetty_ssl_port ? com_adobe_granite_jetty_ssl_port_local_nonprim : NULL,
        com_adobe_granite_jetty_ssl_keystore_user ? com_adobe_granite_jetty_ssl_keystore_user_local_nonprim : NULL,
        com_adobe_granite_jetty_ssl_keystore_password ? com_adobe_granite_jetty_ssl_keystore_password_local_nonprim : NULL,
        com_adobe_granite_jetty_ssl_ciphersuites_excluded ? com_adobe_granite_jetty_ssl_ciphersuites_excluded_local_nonprim : NULL,
        com_adobe_granite_jetty_ssl_ciphersuites_included ? com_adobe_granite_jetty_ssl_ciphersuites_included_local_nonprim : NULL,
        com_adobe_granite_jetty_ssl_client_certificate ? com_adobe_granite_jetty_ssl_client_certificate_local_nonprim : NULL
        );

    if (!com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_local_var;
end:
    if (com_adobe_granite_jetty_ssl_port_local_nonprim) {
        config_node_property_integer_free(com_adobe_granite_jetty_ssl_port_local_nonprim);
        com_adobe_granite_jetty_ssl_port_local_nonprim = NULL;
    }
    if (com_adobe_granite_jetty_ssl_keystore_user_local_nonprim) {
        config_node_property_string_free(com_adobe_granite_jetty_ssl_keystore_user_local_nonprim);
        com_adobe_granite_jetty_ssl_keystore_user_local_nonprim = NULL;
    }
    if (com_adobe_granite_jetty_ssl_keystore_password_local_nonprim) {
        config_node_property_string_free(com_adobe_granite_jetty_ssl_keystore_password_local_nonprim);
        com_adobe_granite_jetty_ssl_keystore_password_local_nonprim = NULL;
    }
    if (com_adobe_granite_jetty_ssl_ciphersuites_excluded_local_nonprim) {
        config_node_property_array_free(com_adobe_granite_jetty_ssl_ciphersuites_excluded_local_nonprim);
        com_adobe_granite_jetty_ssl_ciphersuites_excluded_local_nonprim = NULL;
    }
    if (com_adobe_granite_jetty_ssl_ciphersuites_included_local_nonprim) {
        config_node_property_array_free(com_adobe_granite_jetty_ssl_ciphersuites_included_local_nonprim);
        com_adobe_granite_jetty_ssl_ciphersuites_included_local_nonprim = NULL;
    }
    if (com_adobe_granite_jetty_ssl_client_certificate_local_nonprim) {
        config_node_property_drop_down_free(com_adobe_granite_jetty_ssl_client_certificate_local_nonprim);
        com_adobe_granite_jetty_ssl_client_certificate_local_nonprim = NULL;
    }
    return NULL;

}
