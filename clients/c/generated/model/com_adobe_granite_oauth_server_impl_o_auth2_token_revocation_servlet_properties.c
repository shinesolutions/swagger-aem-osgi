#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties.h"



static com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_t *com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_create_internal(
    config_node_property_boolean_t *oauth_token_revocation_active
    ) {
    com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_t *com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_local_var = malloc(sizeof(com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_t));
    if (!com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_local_var, 0, sizeof(com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_t));
    com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_local_var->_library_owned = 1;
    com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_local_var->oauth_token_revocation_active = oauth_token_revocation_active;
    return com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_t *com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_create(
    config_node_property_boolean_t *oauth_token_revocation_active
    ) {
    com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_t *result = com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_create_internal (
        oauth_token_revocation_active
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_free(com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_t *com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties) {
    if(NULL == com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties){
        return ;
    }
    if(com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties->oauth_token_revocation_active) {
        config_node_property_boolean_free(com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties->oauth_token_revocation_active);
        com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties->oauth_token_revocation_active = NULL;
    }
    free(com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties);
}

cJSON *com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_convertToJSON(com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_t *com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties->oauth_token_revocation_active
    if(com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties->oauth_token_revocation_active) {
    cJSON *oauth_token_revocation_active_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties->oauth_token_revocation_active);
    if(oauth_token_revocation_active_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.token.revocation.active", oauth_token_revocation_active_local_JSON);
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

com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_t *com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_parseFromJSON(cJSON *com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_propertiesJSON){

    com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_t *com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties->oauth_token_revocation_active
    config_node_property_boolean_t *oauth_token_revocation_active_local_nonprim = NULL;

    // com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties->oauth_token_revocation_active
    cJSON *oauth_token_revocation_active = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_propertiesJSON, "oauth.token.revocation.active");
    if (cJSON_IsNull(oauth_token_revocation_active)) {
        oauth_token_revocation_active = NULL;
    }
    if (oauth_token_revocation_active) { 
    oauth_token_revocation_active_local_nonprim = config_node_property_boolean_parseFromJSON(oauth_token_revocation_active); //nonprimitive
    }



    com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_local_var = com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_create_internal (
        oauth_token_revocation_active ? oauth_token_revocation_active_local_nonprim : NULL
        );

    if (!com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_properties_local_var;
end:
    if (oauth_token_revocation_active_local_nonprim) {
        config_node_property_boolean_free(oauth_token_revocation_active_local_nonprim);
        oauth_token_revocation_active_local_nonprim = NULL;
    }
    return NULL;

}
