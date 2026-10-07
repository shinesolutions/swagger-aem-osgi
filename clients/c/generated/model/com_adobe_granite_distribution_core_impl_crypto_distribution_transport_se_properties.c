#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties.h"



static com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_t *com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_create_internal(
    config_node_property_string_t *name,
    config_node_property_string_t *username,
    config_node_property_string_t *encrypted_password
    ) {
    com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_t *com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_local_var = malloc(sizeof(com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_t));
    if (!com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_local_var, 0, sizeof(com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_t));
    com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_local_var->_library_owned = 1;
    com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_local_var->name = name;
    com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_local_var->username = username;
    com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_local_var->encrypted_password = encrypted_password;
    return com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_t *com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_create(
    config_node_property_string_t *name,
    config_node_property_string_t *username,
    config_node_property_string_t *encrypted_password
    ) {
    com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_t *result = com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_create_internal (
        name,
        username,
        encrypted_password
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_free(com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_t *com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties) {
    if(NULL == com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties){
        return ;
    }
    if(com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->name) {
        config_node_property_string_free(com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->name);
        com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->name = NULL;
    }
    if (com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->username) {
        config_node_property_string_free(com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->username);
        com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->username = NULL;
    }
    if (com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->encrypted_password) {
        config_node_property_string_free(com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->encrypted_password);
        com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->encrypted_password = NULL;
    }
    free(com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties);
}

cJSON *com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_convertToJSON(com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_t *com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->name
    if(com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->name) {
    cJSON *name_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->name);
    if(name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "name", name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->username
    if(com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->username) {
    cJSON *username_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->username);
    if(username_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "username", username_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->encrypted_password
    if(com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->encrypted_password) {
    cJSON *encrypted_password_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->encrypted_password);
    if(encrypted_password_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "encryptedPassword", encrypted_password_local_JSON);
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

com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_t *com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_parseFromJSON(cJSON *com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_propertiesJSON){

    com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_t *com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->name
    config_node_property_string_t *name_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->username
    config_node_property_string_t *username_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->encrypted_password
    config_node_property_string_t *encrypted_password_local_nonprim = NULL;

    // com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_propertiesJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    name_local_nonprim = config_node_property_string_parseFromJSON(name); //nonprimitive
    }

    // com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_propertiesJSON, "username");
    if (cJSON_IsNull(username)) {
        username = NULL;
    }
    if (username) { 
    username_local_nonprim = config_node_property_string_parseFromJSON(username); //nonprimitive
    }

    // com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties->encrypted_password
    cJSON *encrypted_password = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_propertiesJSON, "encryptedPassword");
    if (cJSON_IsNull(encrypted_password)) {
        encrypted_password = NULL;
    }
    if (encrypted_password) { 
    encrypted_password_local_nonprim = config_node_property_string_parseFromJSON(encrypted_password); //nonprimitive
    }



    com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_local_var = com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_create_internal (
        name ? name_local_nonprim : NULL,
        username ? username_local_nonprim : NULL,
        encrypted_password ? encrypted_password_local_nonprim : NULL
        );

    if (!com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_properties_local_var;
end:
    if (name_local_nonprim) {
        config_node_property_string_free(name_local_nonprim);
        name_local_nonprim = NULL;
    }
    if (username_local_nonprim) {
        config_node_property_string_free(username_local_nonprim);
        username_local_nonprim = NULL;
    }
    if (encrypted_password_local_nonprim) {
        config_node_property_string_free(encrypted_password_local_nonprim);
        encrypted_password_local_nonprim = NULL;
    }
    return NULL;

}
