#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties.h"



static com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_t *com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_create_internal(
    config_node_property_string_t *auth_token_validator_type
    ) {
    com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_t *com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_local_var = malloc(sizeof(com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_t));
    if (!com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_local_var, 0, sizeof(com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_t));
    com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_local_var->_library_owned = 1;
    com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_local_var->auth_token_validator_type = auth_token_validator_type;
    return com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_t *com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_create(
    config_node_property_string_t *auth_token_validator_type
    ) {
    com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_t *result = com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_create_internal (
        auth_token_validator_type
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_free(com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_t *com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties) {
    if(NULL == com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties){
        return ;
    }
    if(com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties->auth_token_validator_type) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties->auth_token_validator_type);
        com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties->auth_token_validator_type = NULL;
    }
    free(com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties);
}

cJSON *com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_convertToJSON(com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_t *com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties->auth_token_validator_type
    if(com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties->auth_token_validator_type) {
    cJSON *auth_token_validator_type_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties->auth_token_validator_type);
    if(auth_token_validator_type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.token.validator.type", auth_token_validator_type_local_JSON);
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

com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_t *com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_parseFromJSON(cJSON *com_adobe_granite_auth_oauth_impl_default_token_validator_impl_propertiesJSON){

    com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_t *com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties->auth_token_validator_type
    config_node_property_string_t *auth_token_validator_type_local_nonprim = NULL;

    // com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties->auth_token_validator_type
    cJSON *auth_token_validator_type = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_impl_default_token_validator_impl_propertiesJSON, "auth.token.validator.type");
    if (cJSON_IsNull(auth_token_validator_type)) {
        auth_token_validator_type = NULL;
    }
    if (auth_token_validator_type) { 
    auth_token_validator_type_local_nonprim = config_node_property_string_parseFromJSON(auth_token_validator_type); //nonprimitive
    }



    com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_local_var = com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_create_internal (
        auth_token_validator_type ? auth_token_validator_type_local_nonprim : NULL
        );

    if (!com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_auth_oauth_impl_default_token_validator_impl_properties_local_var;
end:
    if (auth_token_validator_type_local_nonprim) {
        config_node_property_string_free(auth_token_validator_type_local_nonprim);
        auth_token_validator_type_local_nonprim = NULL;
    }
    return NULL;

}
