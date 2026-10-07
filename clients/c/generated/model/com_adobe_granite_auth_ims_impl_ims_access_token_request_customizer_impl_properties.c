#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties.h"



static com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_create_internal(
    config_node_property_string_t *auth_ims_client_secret,
    config_node_property_string_t *customizer_type
    ) {
    com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_local_var = malloc(sizeof(com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_t));
    if (!com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_local_var, 0, sizeof(com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_t));
    com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_local_var->_library_owned = 1;
    com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_local_var->auth_ims_client_secret = auth_ims_client_secret;
    com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_local_var->customizer_type = customizer_type;
    return com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_create(
    config_node_property_string_t *auth_ims_client_secret,
    config_node_property_string_t *customizer_type
    ) {
    com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_t *result = com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_create_internal (
        auth_ims_client_secret,
        customizer_type
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_free(com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties) {
    if(NULL == com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties){
        return ;
    }
    if(com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties->auth_ims_client_secret) {
        config_node_property_string_free(com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties->auth_ims_client_secret);
        com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties->auth_ims_client_secret = NULL;
    }
    if (com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties->customizer_type) {
        config_node_property_string_free(com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties->customizer_type);
        com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties->customizer_type = NULL;
    }
    free(com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties);
}

cJSON *com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_convertToJSON(com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties->auth_ims_client_secret
    if(com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties->auth_ims_client_secret) {
    cJSON *auth_ims_client_secret_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties->auth_ims_client_secret);
    if(auth_ims_client_secret_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.ims.client.secret", auth_ims_client_secret_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties->customizer_type
    if(com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties->customizer_type) {
    cJSON *customizer_type_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties->customizer_type);
    if(customizer_type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "customizer.type", customizer_type_local_JSON);
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

com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_parseFromJSON(cJSON *com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_propertiesJSON){

    com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_t *com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties->auth_ims_client_secret
    config_node_property_string_t *auth_ims_client_secret_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties->customizer_type
    config_node_property_string_t *customizer_type_local_nonprim = NULL;

    // com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties->auth_ims_client_secret
    cJSON *auth_ims_client_secret = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_propertiesJSON, "auth.ims.client.secret");
    if (cJSON_IsNull(auth_ims_client_secret)) {
        auth_ims_client_secret = NULL;
    }
    if (auth_ims_client_secret) { 
    auth_ims_client_secret_local_nonprim = config_node_property_string_parseFromJSON(auth_ims_client_secret); //nonprimitive
    }

    // com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties->customizer_type
    cJSON *customizer_type = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_propertiesJSON, "customizer.type");
    if (cJSON_IsNull(customizer_type)) {
        customizer_type = NULL;
    }
    if (customizer_type) { 
    customizer_type_local_nonprim = config_node_property_string_parseFromJSON(customizer_type); //nonprimitive
    }



    com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_local_var = com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_create_internal (
        auth_ims_client_secret ? auth_ims_client_secret_local_nonprim : NULL,
        customizer_type ? customizer_type_local_nonprim : NULL
        );

    if (!com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_properties_local_var;
end:
    if (auth_ims_client_secret_local_nonprim) {
        config_node_property_string_free(auth_ims_client_secret_local_nonprim);
        auth_ims_client_secret_local_nonprim = NULL;
    }
    if (customizer_type_local_nonprim) {
        config_node_property_string_free(customizer_type_local_nonprim);
        customizer_type_local_nonprim = NULL;
    }
    return NULL;

}
