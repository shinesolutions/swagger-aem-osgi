#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties.h"



static com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_t *com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_create_internal(
    config_node_property_string_t *path,
    config_node_property_array_t *oauth_client_ids_allowed,
    config_node_property_boolean_t *auth_bearer_sync_ims,
    config_node_property_string_t *auth_token_request_parameter,
    config_node_property_string_t *oauth_bearer_configid,
    config_node_property_boolean_t *oauth_jwt_support
    ) {
    com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_t *com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_local_var = malloc(sizeof(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_t));
    if (!com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_local_var, 0, sizeof(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_t));
    com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_local_var->_library_owned = 1;
    com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_local_var->path = path;
    com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_local_var->oauth_client_ids_allowed = oauth_client_ids_allowed;
    com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_local_var->auth_bearer_sync_ims = auth_bearer_sync_ims;
    com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_local_var->auth_token_request_parameter = auth_token_request_parameter;
    com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_local_var->oauth_bearer_configid = oauth_bearer_configid;
    com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_local_var->oauth_jwt_support = oauth_jwt_support;
    return com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_t *com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_create(
    config_node_property_string_t *path,
    config_node_property_array_t *oauth_client_ids_allowed,
    config_node_property_boolean_t *auth_bearer_sync_ims,
    config_node_property_string_t *auth_token_request_parameter,
    config_node_property_string_t *oauth_bearer_configid,
    config_node_property_boolean_t *oauth_jwt_support
    ) {
    com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_t *result = com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_create_internal (
        path,
        oauth_client_ids_allowed,
        auth_bearer_sync_ims,
        auth_token_request_parameter,
        oauth_bearer_configid,
        oauth_jwt_support
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_free(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_t *com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties) {
    if(NULL == com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties){
        return ;
    }
    if(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->path) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->path);
        com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->path = NULL;
    }
    if (com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_client_ids_allowed) {
        config_node_property_array_free(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_client_ids_allowed);
        com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_client_ids_allowed = NULL;
    }
    if (com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->auth_bearer_sync_ims) {
        config_node_property_boolean_free(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->auth_bearer_sync_ims);
        com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->auth_bearer_sync_ims = NULL;
    }
    if (com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->auth_token_request_parameter) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->auth_token_request_parameter);
        com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->auth_token_request_parameter = NULL;
    }
    if (com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_bearer_configid) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_bearer_configid);
        com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_bearer_configid = NULL;
    }
    if (com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_jwt_support) {
        config_node_property_boolean_free(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_jwt_support);
        com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_jwt_support = NULL;
    }
    free(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties);
}

cJSON *com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_convertToJSON(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_t *com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->path
    if(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->path) {
    cJSON *path_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->path);
    if(path_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "path", path_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_client_ids_allowed
    if(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_client_ids_allowed) {
    cJSON *oauth_client_ids_allowed_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_client_ids_allowed);
    if(oauth_client_ids_allowed_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.clientIds.allowed", oauth_client_ids_allowed_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->auth_bearer_sync_ims
    if(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->auth_bearer_sync_ims) {
    cJSON *auth_bearer_sync_ims_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->auth_bearer_sync_ims);
    if(auth_bearer_sync_ims_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.bearer.sync.ims", auth_bearer_sync_ims_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->auth_token_request_parameter
    if(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->auth_token_request_parameter) {
    cJSON *auth_token_request_parameter_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->auth_token_request_parameter);
    if(auth_token_request_parameter_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.tokenRequestParameter", auth_token_request_parameter_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_bearer_configid
    if(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_bearer_configid) {
    cJSON *oauth_bearer_configid_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_bearer_configid);
    if(oauth_bearer_configid_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.bearer.configid", oauth_bearer_configid_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_jwt_support
    if(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_jwt_support) {
    cJSON *oauth_jwt_support_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_jwt_support);
    if(oauth_jwt_support_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "oauth.jwt.support", oauth_jwt_support_local_JSON);
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

com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_t *com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_parseFromJSON(cJSON *com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_propertiesJSON){

    com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_t *com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->path
    config_node_property_string_t *path_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_client_ids_allowed
    config_node_property_array_t *oauth_client_ids_allowed_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->auth_bearer_sync_ims
    config_node_property_boolean_t *auth_bearer_sync_ims_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->auth_token_request_parameter
    config_node_property_string_t *auth_token_request_parameter_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_bearer_configid
    config_node_property_string_t *oauth_bearer_configid_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_jwt_support
    config_node_property_boolean_t *oauth_jwt_support_local_nonprim = NULL;

    // com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->path
    cJSON *path = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_propertiesJSON, "path");
    if (cJSON_IsNull(path)) {
        path = NULL;
    }
    if (path) { 
    path_local_nonprim = config_node_property_string_parseFromJSON(path); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_client_ids_allowed
    cJSON *oauth_client_ids_allowed = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_propertiesJSON, "oauth.clientIds.allowed");
    if (cJSON_IsNull(oauth_client_ids_allowed)) {
        oauth_client_ids_allowed = NULL;
    }
    if (oauth_client_ids_allowed) { 
    oauth_client_ids_allowed_local_nonprim = config_node_property_array_parseFromJSON(oauth_client_ids_allowed); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->auth_bearer_sync_ims
    cJSON *auth_bearer_sync_ims = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_propertiesJSON, "auth.bearer.sync.ims");
    if (cJSON_IsNull(auth_bearer_sync_ims)) {
        auth_bearer_sync_ims = NULL;
    }
    if (auth_bearer_sync_ims) { 
    auth_bearer_sync_ims_local_nonprim = config_node_property_boolean_parseFromJSON(auth_bearer_sync_ims); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->auth_token_request_parameter
    cJSON *auth_token_request_parameter = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_propertiesJSON, "auth.tokenRequestParameter");
    if (cJSON_IsNull(auth_token_request_parameter)) {
        auth_token_request_parameter = NULL;
    }
    if (auth_token_request_parameter) { 
    auth_token_request_parameter_local_nonprim = config_node_property_string_parseFromJSON(auth_token_request_parameter); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_bearer_configid
    cJSON *oauth_bearer_configid = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_propertiesJSON, "oauth.bearer.configid");
    if (cJSON_IsNull(oauth_bearer_configid)) {
        oauth_bearer_configid = NULL;
    }
    if (oauth_bearer_configid) { 
    oauth_bearer_configid_local_nonprim = config_node_property_string_parseFromJSON(oauth_bearer_configid); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties->oauth_jwt_support
    cJSON *oauth_jwt_support = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_propertiesJSON, "oauth.jwt.support");
    if (cJSON_IsNull(oauth_jwt_support)) {
        oauth_jwt_support = NULL;
    }
    if (oauth_jwt_support) { 
    oauth_jwt_support_local_nonprim = config_node_property_boolean_parseFromJSON(oauth_jwt_support); //nonprimitive
    }



    com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_local_var = com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_create_internal (
        path ? path_local_nonprim : NULL,
        oauth_client_ids_allowed ? oauth_client_ids_allowed_local_nonprim : NULL,
        auth_bearer_sync_ims ? auth_bearer_sync_ims_local_nonprim : NULL,
        auth_token_request_parameter ? auth_token_request_parameter_local_nonprim : NULL,
        oauth_bearer_configid ? oauth_bearer_configid_local_nonprim : NULL,
        oauth_jwt_support ? oauth_jwt_support_local_nonprim : NULL
        );

    if (!com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_properties_local_var;
end:
    if (path_local_nonprim) {
        config_node_property_string_free(path_local_nonprim);
        path_local_nonprim = NULL;
    }
    if (oauth_client_ids_allowed_local_nonprim) {
        config_node_property_array_free(oauth_client_ids_allowed_local_nonprim);
        oauth_client_ids_allowed_local_nonprim = NULL;
    }
    if (auth_bearer_sync_ims_local_nonprim) {
        config_node_property_boolean_free(auth_bearer_sync_ims_local_nonprim);
        auth_bearer_sync_ims_local_nonprim = NULL;
    }
    if (auth_token_request_parameter_local_nonprim) {
        config_node_property_string_free(auth_token_request_parameter_local_nonprim);
        auth_token_request_parameter_local_nonprim = NULL;
    }
    if (oauth_bearer_configid_local_nonprim) {
        config_node_property_string_free(oauth_bearer_configid_local_nonprim);
        oauth_bearer_configid_local_nonprim = NULL;
    }
    if (oauth_jwt_support_local_nonprim) {
        config_node_property_boolean_free(oauth_jwt_support_local_nonprim);
        oauth_jwt_support_local_nonprim = NULL;
    }
    return NULL;

}
