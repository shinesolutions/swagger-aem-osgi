#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_auth_oauth_accesstoken_provider_properties.h"



static com_adobe_granite_auth_oauth_accesstoken_provider_properties_t *com_adobe_granite_auth_oauth_accesstoken_provider_properties_create_internal(
    config_node_property_string_t *name,
    config_node_property_string_t *auth_token_provider_title,
    config_node_property_array_t *auth_token_provider_default_claims,
    config_node_property_string_t *auth_token_provider_endpoint,
    config_node_property_string_t *auth_access_token_request,
    config_node_property_string_t *auth_token_provider_keypair_alias,
    config_node_property_integer_t *auth_token_provider_conn_timeout,
    config_node_property_integer_t *auth_token_provider_so_timeout,
    config_node_property_string_t *auth_token_provider_client_id,
    config_node_property_string_t *auth_token_provider_scope,
    config_node_property_boolean_t *auth_token_provider_reuse_access_token,
    config_node_property_boolean_t *auth_token_provider_relaxed_ssl,
    config_node_property_string_t *token_request_customizer_type,
    config_node_property_string_t *auth_token_validator_type
    ) {
    com_adobe_granite_auth_oauth_accesstoken_provider_properties_t *com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var = malloc(sizeof(com_adobe_granite_auth_oauth_accesstoken_provider_properties_t));
    if (!com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var, 0, sizeof(com_adobe_granite_auth_oauth_accesstoken_provider_properties_t));
    com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var->_library_owned = 1;
    com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var->name = name;
    com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var->auth_token_provider_title = auth_token_provider_title;
    com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var->auth_token_provider_default_claims = auth_token_provider_default_claims;
    com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var->auth_token_provider_endpoint = auth_token_provider_endpoint;
    com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var->auth_access_token_request = auth_access_token_request;
    com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var->auth_token_provider_keypair_alias = auth_token_provider_keypair_alias;
    com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var->auth_token_provider_conn_timeout = auth_token_provider_conn_timeout;
    com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var->auth_token_provider_so_timeout = auth_token_provider_so_timeout;
    com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var->auth_token_provider_client_id = auth_token_provider_client_id;
    com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var->auth_token_provider_scope = auth_token_provider_scope;
    com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var->auth_token_provider_reuse_access_token = auth_token_provider_reuse_access_token;
    com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var->auth_token_provider_relaxed_ssl = auth_token_provider_relaxed_ssl;
    com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var->token_request_customizer_type = token_request_customizer_type;
    com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var->auth_token_validator_type = auth_token_validator_type;
    return com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_auth_oauth_accesstoken_provider_properties_t *com_adobe_granite_auth_oauth_accesstoken_provider_properties_create(
    config_node_property_string_t *name,
    config_node_property_string_t *auth_token_provider_title,
    config_node_property_array_t *auth_token_provider_default_claims,
    config_node_property_string_t *auth_token_provider_endpoint,
    config_node_property_string_t *auth_access_token_request,
    config_node_property_string_t *auth_token_provider_keypair_alias,
    config_node_property_integer_t *auth_token_provider_conn_timeout,
    config_node_property_integer_t *auth_token_provider_so_timeout,
    config_node_property_string_t *auth_token_provider_client_id,
    config_node_property_string_t *auth_token_provider_scope,
    config_node_property_boolean_t *auth_token_provider_reuse_access_token,
    config_node_property_boolean_t *auth_token_provider_relaxed_ssl,
    config_node_property_string_t *token_request_customizer_type,
    config_node_property_string_t *auth_token_validator_type
    ) {
    com_adobe_granite_auth_oauth_accesstoken_provider_properties_t *result = com_adobe_granite_auth_oauth_accesstoken_provider_properties_create_internal (
        name,
        auth_token_provider_title,
        auth_token_provider_default_claims,
        auth_token_provider_endpoint,
        auth_access_token_request,
        auth_token_provider_keypair_alias,
        auth_token_provider_conn_timeout,
        auth_token_provider_so_timeout,
        auth_token_provider_client_id,
        auth_token_provider_scope,
        auth_token_provider_reuse_access_token,
        auth_token_provider_relaxed_ssl,
        token_request_customizer_type,
        auth_token_validator_type
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_auth_oauth_accesstoken_provider_properties_free(com_adobe_granite_auth_oauth_accesstoken_provider_properties_t *com_adobe_granite_auth_oauth_accesstoken_provider_properties) {
    if(NULL == com_adobe_granite_auth_oauth_accesstoken_provider_properties){
        return ;
    }
    if(com_adobe_granite_auth_oauth_accesstoken_provider_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_auth_oauth_accesstoken_provider_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_auth_oauth_accesstoken_provider_properties->name) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_accesstoken_provider_properties->name);
        com_adobe_granite_auth_oauth_accesstoken_provider_properties->name = NULL;
    }
    if (com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_title) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_title);
        com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_title = NULL;
    }
    if (com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_default_claims) {
        config_node_property_array_free(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_default_claims);
        com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_default_claims = NULL;
    }
    if (com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_endpoint) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_endpoint);
        com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_endpoint = NULL;
    }
    if (com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_access_token_request) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_access_token_request);
        com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_access_token_request = NULL;
    }
    if (com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_keypair_alias) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_keypair_alias);
        com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_keypair_alias = NULL;
    }
    if (com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_conn_timeout) {
        config_node_property_integer_free(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_conn_timeout);
        com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_conn_timeout = NULL;
    }
    if (com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_so_timeout) {
        config_node_property_integer_free(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_so_timeout);
        com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_so_timeout = NULL;
    }
    if (com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_client_id) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_client_id);
        com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_client_id = NULL;
    }
    if (com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_scope) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_scope);
        com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_scope = NULL;
    }
    if (com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_reuse_access_token) {
        config_node_property_boolean_free(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_reuse_access_token);
        com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_reuse_access_token = NULL;
    }
    if (com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_relaxed_ssl) {
        config_node_property_boolean_free(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_relaxed_ssl);
        com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_relaxed_ssl = NULL;
    }
    if (com_adobe_granite_auth_oauth_accesstoken_provider_properties->token_request_customizer_type) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_accesstoken_provider_properties->token_request_customizer_type);
        com_adobe_granite_auth_oauth_accesstoken_provider_properties->token_request_customizer_type = NULL;
    }
    if (com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_validator_type) {
        config_node_property_string_free(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_validator_type);
        com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_validator_type = NULL;
    }
    free(com_adobe_granite_auth_oauth_accesstoken_provider_properties);
}

cJSON *com_adobe_granite_auth_oauth_accesstoken_provider_properties_convertToJSON(com_adobe_granite_auth_oauth_accesstoken_provider_properties_t *com_adobe_granite_auth_oauth_accesstoken_provider_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->name
    if(com_adobe_granite_auth_oauth_accesstoken_provider_properties->name) {
    cJSON *name_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_accesstoken_provider_properties->name);
    if(name_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "name", name_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_title
    if(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_title) {
    cJSON *auth_token_provider_title_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_title);
    if(auth_token_provider_title_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.token.provider.title", auth_token_provider_title_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_default_claims
    if(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_default_claims) {
    cJSON *auth_token_provider_default_claims_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_default_claims);
    if(auth_token_provider_default_claims_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.token.provider.default.claims", auth_token_provider_default_claims_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_endpoint
    if(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_endpoint) {
    cJSON *auth_token_provider_endpoint_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_endpoint);
    if(auth_token_provider_endpoint_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.token.provider.endpoint", auth_token_provider_endpoint_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_access_token_request
    if(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_access_token_request) {
    cJSON *auth_access_token_request_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_access_token_request);
    if(auth_access_token_request_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.access.token.request", auth_access_token_request_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_keypair_alias
    if(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_keypair_alias) {
    cJSON *auth_token_provider_keypair_alias_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_keypair_alias);
    if(auth_token_provider_keypair_alias_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.token.provider.keypair.alias", auth_token_provider_keypair_alias_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_conn_timeout
    if(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_conn_timeout) {
    cJSON *auth_token_provider_conn_timeout_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_conn_timeout);
    if(auth_token_provider_conn_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.token.provider.conn.timeout", auth_token_provider_conn_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_so_timeout
    if(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_so_timeout) {
    cJSON *auth_token_provider_so_timeout_local_JSON = config_node_property_integer_convertToJSON(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_so_timeout);
    if(auth_token_provider_so_timeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.token.provider.so.timeout", auth_token_provider_so_timeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_client_id
    if(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_client_id) {
    cJSON *auth_token_provider_client_id_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_client_id);
    if(auth_token_provider_client_id_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.token.provider.client.id", auth_token_provider_client_id_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_scope
    if(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_scope) {
    cJSON *auth_token_provider_scope_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_scope);
    if(auth_token_provider_scope_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.token.provider.scope", auth_token_provider_scope_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_reuse_access_token
    if(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_reuse_access_token) {
    cJSON *auth_token_provider_reuse_access_token_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_reuse_access_token);
    if(auth_token_provider_reuse_access_token_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.token.provider.reuse.access.token", auth_token_provider_reuse_access_token_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_relaxed_ssl
    if(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_relaxed_ssl) {
    cJSON *auth_token_provider_relaxed_ssl_local_JSON = config_node_property_boolean_convertToJSON(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_relaxed_ssl);
    if(auth_token_provider_relaxed_ssl_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "auth.token.provider.relaxed.ssl", auth_token_provider_relaxed_ssl_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->token_request_customizer_type
    if(com_adobe_granite_auth_oauth_accesstoken_provider_properties->token_request_customizer_type) {
    cJSON *token_request_customizer_type_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_accesstoken_provider_properties->token_request_customizer_type);
    if(token_request_customizer_type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "token.request.customizer.type", token_request_customizer_type_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_validator_type
    if(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_validator_type) {
    cJSON *auth_token_validator_type_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_validator_type);
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

com_adobe_granite_auth_oauth_accesstoken_provider_properties_t *com_adobe_granite_auth_oauth_accesstoken_provider_properties_parseFromJSON(cJSON *com_adobe_granite_auth_oauth_accesstoken_provider_propertiesJSON){

    com_adobe_granite_auth_oauth_accesstoken_provider_properties_t *com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_accesstoken_provider_properties->name
    config_node_property_string_t *name_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_title
    config_node_property_string_t *auth_token_provider_title_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_default_claims
    config_node_property_array_t *auth_token_provider_default_claims_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_endpoint
    config_node_property_string_t *auth_token_provider_endpoint_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_access_token_request
    config_node_property_string_t *auth_access_token_request_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_keypair_alias
    config_node_property_string_t *auth_token_provider_keypair_alias_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_conn_timeout
    config_node_property_integer_t *auth_token_provider_conn_timeout_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_so_timeout
    config_node_property_integer_t *auth_token_provider_so_timeout_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_client_id
    config_node_property_string_t *auth_token_provider_client_id_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_scope
    config_node_property_string_t *auth_token_provider_scope_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_reuse_access_token
    config_node_property_boolean_t *auth_token_provider_reuse_access_token_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_relaxed_ssl
    config_node_property_boolean_t *auth_token_provider_relaxed_ssl_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_accesstoken_provider_properties->token_request_customizer_type
    config_node_property_string_t *token_request_customizer_type_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_validator_type
    config_node_property_string_t *auth_token_validator_type_local_nonprim = NULL;

    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_accesstoken_provider_propertiesJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    name_local_nonprim = config_node_property_string_parseFromJSON(name); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_title
    cJSON *auth_token_provider_title = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_accesstoken_provider_propertiesJSON, "auth.token.provider.title");
    if (cJSON_IsNull(auth_token_provider_title)) {
        auth_token_provider_title = NULL;
    }
    if (auth_token_provider_title) { 
    auth_token_provider_title_local_nonprim = config_node_property_string_parseFromJSON(auth_token_provider_title); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_default_claims
    cJSON *auth_token_provider_default_claims = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_accesstoken_provider_propertiesJSON, "auth.token.provider.default.claims");
    if (cJSON_IsNull(auth_token_provider_default_claims)) {
        auth_token_provider_default_claims = NULL;
    }
    if (auth_token_provider_default_claims) { 
    auth_token_provider_default_claims_local_nonprim = config_node_property_array_parseFromJSON(auth_token_provider_default_claims); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_endpoint
    cJSON *auth_token_provider_endpoint = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_accesstoken_provider_propertiesJSON, "auth.token.provider.endpoint");
    if (cJSON_IsNull(auth_token_provider_endpoint)) {
        auth_token_provider_endpoint = NULL;
    }
    if (auth_token_provider_endpoint) { 
    auth_token_provider_endpoint_local_nonprim = config_node_property_string_parseFromJSON(auth_token_provider_endpoint); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_access_token_request
    cJSON *auth_access_token_request = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_accesstoken_provider_propertiesJSON, "auth.access.token.request");
    if (cJSON_IsNull(auth_access_token_request)) {
        auth_access_token_request = NULL;
    }
    if (auth_access_token_request) { 
    auth_access_token_request_local_nonprim = config_node_property_string_parseFromJSON(auth_access_token_request); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_keypair_alias
    cJSON *auth_token_provider_keypair_alias = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_accesstoken_provider_propertiesJSON, "auth.token.provider.keypair.alias");
    if (cJSON_IsNull(auth_token_provider_keypair_alias)) {
        auth_token_provider_keypair_alias = NULL;
    }
    if (auth_token_provider_keypair_alias) { 
    auth_token_provider_keypair_alias_local_nonprim = config_node_property_string_parseFromJSON(auth_token_provider_keypair_alias); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_conn_timeout
    cJSON *auth_token_provider_conn_timeout = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_accesstoken_provider_propertiesJSON, "auth.token.provider.conn.timeout");
    if (cJSON_IsNull(auth_token_provider_conn_timeout)) {
        auth_token_provider_conn_timeout = NULL;
    }
    if (auth_token_provider_conn_timeout) { 
    auth_token_provider_conn_timeout_local_nonprim = config_node_property_integer_parseFromJSON(auth_token_provider_conn_timeout); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_so_timeout
    cJSON *auth_token_provider_so_timeout = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_accesstoken_provider_propertiesJSON, "auth.token.provider.so.timeout");
    if (cJSON_IsNull(auth_token_provider_so_timeout)) {
        auth_token_provider_so_timeout = NULL;
    }
    if (auth_token_provider_so_timeout) { 
    auth_token_provider_so_timeout_local_nonprim = config_node_property_integer_parseFromJSON(auth_token_provider_so_timeout); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_client_id
    cJSON *auth_token_provider_client_id = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_accesstoken_provider_propertiesJSON, "auth.token.provider.client.id");
    if (cJSON_IsNull(auth_token_provider_client_id)) {
        auth_token_provider_client_id = NULL;
    }
    if (auth_token_provider_client_id) { 
    auth_token_provider_client_id_local_nonprim = config_node_property_string_parseFromJSON(auth_token_provider_client_id); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_scope
    cJSON *auth_token_provider_scope = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_accesstoken_provider_propertiesJSON, "auth.token.provider.scope");
    if (cJSON_IsNull(auth_token_provider_scope)) {
        auth_token_provider_scope = NULL;
    }
    if (auth_token_provider_scope) { 
    auth_token_provider_scope_local_nonprim = config_node_property_string_parseFromJSON(auth_token_provider_scope); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_reuse_access_token
    cJSON *auth_token_provider_reuse_access_token = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_accesstoken_provider_propertiesJSON, "auth.token.provider.reuse.access.token");
    if (cJSON_IsNull(auth_token_provider_reuse_access_token)) {
        auth_token_provider_reuse_access_token = NULL;
    }
    if (auth_token_provider_reuse_access_token) { 
    auth_token_provider_reuse_access_token_local_nonprim = config_node_property_boolean_parseFromJSON(auth_token_provider_reuse_access_token); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_provider_relaxed_ssl
    cJSON *auth_token_provider_relaxed_ssl = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_accesstoken_provider_propertiesJSON, "auth.token.provider.relaxed.ssl");
    if (cJSON_IsNull(auth_token_provider_relaxed_ssl)) {
        auth_token_provider_relaxed_ssl = NULL;
    }
    if (auth_token_provider_relaxed_ssl) { 
    auth_token_provider_relaxed_ssl_local_nonprim = config_node_property_boolean_parseFromJSON(auth_token_provider_relaxed_ssl); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->token_request_customizer_type
    cJSON *token_request_customizer_type = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_accesstoken_provider_propertiesJSON, "token.request.customizer.type");
    if (cJSON_IsNull(token_request_customizer_type)) {
        token_request_customizer_type = NULL;
    }
    if (token_request_customizer_type) { 
    token_request_customizer_type_local_nonprim = config_node_property_string_parseFromJSON(token_request_customizer_type); //nonprimitive
    }

    // com_adobe_granite_auth_oauth_accesstoken_provider_properties->auth_token_validator_type
    cJSON *auth_token_validator_type = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_auth_oauth_accesstoken_provider_propertiesJSON, "auth.token.validator.type");
    if (cJSON_IsNull(auth_token_validator_type)) {
        auth_token_validator_type = NULL;
    }
    if (auth_token_validator_type) { 
    auth_token_validator_type_local_nonprim = config_node_property_string_parseFromJSON(auth_token_validator_type); //nonprimitive
    }



    com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var = com_adobe_granite_auth_oauth_accesstoken_provider_properties_create_internal (
        name ? name_local_nonprim : NULL,
        auth_token_provider_title ? auth_token_provider_title_local_nonprim : NULL,
        auth_token_provider_default_claims ? auth_token_provider_default_claims_local_nonprim : NULL,
        auth_token_provider_endpoint ? auth_token_provider_endpoint_local_nonprim : NULL,
        auth_access_token_request ? auth_access_token_request_local_nonprim : NULL,
        auth_token_provider_keypair_alias ? auth_token_provider_keypair_alias_local_nonprim : NULL,
        auth_token_provider_conn_timeout ? auth_token_provider_conn_timeout_local_nonprim : NULL,
        auth_token_provider_so_timeout ? auth_token_provider_so_timeout_local_nonprim : NULL,
        auth_token_provider_client_id ? auth_token_provider_client_id_local_nonprim : NULL,
        auth_token_provider_scope ? auth_token_provider_scope_local_nonprim : NULL,
        auth_token_provider_reuse_access_token ? auth_token_provider_reuse_access_token_local_nonprim : NULL,
        auth_token_provider_relaxed_ssl ? auth_token_provider_relaxed_ssl_local_nonprim : NULL,
        token_request_customizer_type ? token_request_customizer_type_local_nonprim : NULL,
        auth_token_validator_type ? auth_token_validator_type_local_nonprim : NULL
        );

    if (!com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_auth_oauth_accesstoken_provider_properties_local_var;
end:
    if (name_local_nonprim) {
        config_node_property_string_free(name_local_nonprim);
        name_local_nonprim = NULL;
    }
    if (auth_token_provider_title_local_nonprim) {
        config_node_property_string_free(auth_token_provider_title_local_nonprim);
        auth_token_provider_title_local_nonprim = NULL;
    }
    if (auth_token_provider_default_claims_local_nonprim) {
        config_node_property_array_free(auth_token_provider_default_claims_local_nonprim);
        auth_token_provider_default_claims_local_nonprim = NULL;
    }
    if (auth_token_provider_endpoint_local_nonprim) {
        config_node_property_string_free(auth_token_provider_endpoint_local_nonprim);
        auth_token_provider_endpoint_local_nonprim = NULL;
    }
    if (auth_access_token_request_local_nonprim) {
        config_node_property_string_free(auth_access_token_request_local_nonprim);
        auth_access_token_request_local_nonprim = NULL;
    }
    if (auth_token_provider_keypair_alias_local_nonprim) {
        config_node_property_string_free(auth_token_provider_keypair_alias_local_nonprim);
        auth_token_provider_keypair_alias_local_nonprim = NULL;
    }
    if (auth_token_provider_conn_timeout_local_nonprim) {
        config_node_property_integer_free(auth_token_provider_conn_timeout_local_nonprim);
        auth_token_provider_conn_timeout_local_nonprim = NULL;
    }
    if (auth_token_provider_so_timeout_local_nonprim) {
        config_node_property_integer_free(auth_token_provider_so_timeout_local_nonprim);
        auth_token_provider_so_timeout_local_nonprim = NULL;
    }
    if (auth_token_provider_client_id_local_nonprim) {
        config_node_property_string_free(auth_token_provider_client_id_local_nonprim);
        auth_token_provider_client_id_local_nonprim = NULL;
    }
    if (auth_token_provider_scope_local_nonprim) {
        config_node_property_string_free(auth_token_provider_scope_local_nonprim);
        auth_token_provider_scope_local_nonprim = NULL;
    }
    if (auth_token_provider_reuse_access_token_local_nonprim) {
        config_node_property_boolean_free(auth_token_provider_reuse_access_token_local_nonprim);
        auth_token_provider_reuse_access_token_local_nonprim = NULL;
    }
    if (auth_token_provider_relaxed_ssl_local_nonprim) {
        config_node_property_boolean_free(auth_token_provider_relaxed_ssl_local_nonprim);
        auth_token_provider_relaxed_ssl_local_nonprim = NULL;
    }
    if (token_request_customizer_type_local_nonprim) {
        config_node_property_string_free(token_request_customizer_type_local_nonprim);
        token_request_customizer_type_local_nonprim = NULL;
    }
    if (auth_token_validator_type_local_nonprim) {
        config_node_property_string_free(auth_token_validator_type_local_nonprim);
        auth_token_validator_type_local_nonprim = NULL;
    }
    return NULL;

}
